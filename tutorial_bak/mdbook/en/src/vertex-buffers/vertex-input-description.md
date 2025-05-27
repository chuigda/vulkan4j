# Vertex input description

## Introduction

In the next few chapters, we're going to replace the hardcoded vertex data in the vertex shader with a vertex buffer in memory. We'll start with the easiest approach of creating a CPU visible buffer and using `MemorySegment.copyFrom` to copy the vertex data into it directly, and after that we'll see how to use a staging buffer to copy the vertex data to high performance memory.

## Vertex shader

First change the vertex shader to no longer include the vertex data in the shader code itself. The vertex shader takes input from a vertex buffer using the `in` keyword.

```glsl
#version 450

layout(location = 0) in vec2 inPosition;
layout(location = 1) in vec3 inColor;

layout(location = 0) out vec3 fragColor;

void main() {
    gl_Position = vec4(inPosition, 0.0, 1.0);
    fragColor = inColor;
}
```

The `inPosition` and `inColor` variables are vertex attributes. They're properties that are specified per-vertex in the vertex buffer, just like we manually specified a position and color per vertex using the two arrays. Make sure to recompile the vertex shader!

Just like `fragColor`, the `layout(location = x)` annotations assign indices to the inputs that we can later use to reference them. It is important to know that some types, like `dvec3` 64 bit vectors, use multiple slots. That means that the index after it must be at least 2 higher:

```glsl
layout(location = 0) in dvec3 inPosition;
layout(location = 2) in vec3 inColor;
```

You can find more info about the layout qualifier in the [OpenGL wiki](https://www.khronos.org/opengl/wiki/Layout_Qualifier_(GLSL)).

## Vertex data

We're moving the vertex data from the shader code to an array in the code of our program. Start by creating a `float` array holding the vertex data:

```java
private static final float[] VERTICES = {
        // vec2 pos     // vec3 color
        0.0f, -0.5f,    1.0f, 0.0f, 0.0f,
        0.5f,  0.5f,    0.0f, 1.0f, 0.0f,
        -0.5f,  0.5f,   0.0f, 0.0f, 1.0f
};
```

We're using exactly the same position and color values as before, but now they're combined into one array of vertices. This is known as *interleaving* vertex attributes.

## Binding descriptions

The next step is to tell Vulkan how to pass this data format to the vertex shader once it's been uploaded into GPU memory. There are two types of structures needed to convey this information.

The first structure is `VkVertexInputBindingDescription` and we'll create a static function to populate it with the right data:

```java
private static VkVertexInputBindingDescription getBindingDescription(Arena arena) {
    var description = VkVertexInputBindingDescription.allocate(arena);
    description.binding(0);
    description.stride(Float.BYTES * 5);
    description.inputRate(VkVertexInputRate.VK_VERTEX_INPUT_RATE_VERTEX);
    return description;
}
```

All of our per-vertex data is packed together in one array, so we're only going to have one binding. The `binding` parameter specifies the index of the binding in the array of bindings. The `stride` parameter specifies the number of bytes from one entry to the next, and the `inputRate` parameter can have one of the following values:

- `VK_VERTEX_INPUT_RATE_VERTEX`: Move to the next data entry after each vertex
- `VK_VERTEX_INPUT_RATE_INSTANCE`: Move to the next data entry after each instance

We're not going to use instanced rendering, so we'll stick to per-vertex data.

## Attribute descriptions

The second structure that describes how to handle vertex input is `VkVertexInputAttributeDescription`. We're going to add another helper function to fill in these structs.

```java
private static VkVertexInputAttributeDescription[] getAttributeDescriptions(Arena arena) {
    var attributeDescriptions = VkVertexInputAttributeDescription.allocate(arena, 2);

    return attributeDescriptions;
}
```

As the function prototype indicates, there are going to be two of these structures. An attribute description struct describes how to extract a vertex attribute from a chunk of vertex data originating from a binding description. We have two attributes, position and color, so we need two attribute description structs.

```java
attributeDescriptions[0].binding(0);
attributeDescriptions[0].location(0);
attributeDescriptions[0].format(VkFormat.VK_FORMAT_R32G32_SFLOAT);
attributeDescriptions[0].offset(0);
```

The `binding` parameter tells Vulkan from which binding the per-vertex data comes. The `location` parameter references the location directive of the input in the vertex shader. The input in the vertex shader with location `0` is the position, which has two 32-bit float components.

The `format` parameter describes the type of data for the attribute. A bit confusingly, the formats are specified using the same enumeration as color formats. The following shader types and formats are commonly used together:

- `float`: `VK_FORMAT_R32_SFLOAT`
- `vec2`: `VK_FORMAT_R32G32_SFLOAT`
- `vec3`: `VK_FORMAT_R32G32B32_SFLOAT`
- `vec4`: `VK_FORMAT_R32G32B32A32_SFLOAT`

As you can see, you should use the format where the amount of color channels matches the number of components in the shader data type. It is allowed to use more channels than the number of components in the shader, but they will be silently discarded. If the number of channels is lower than the number of components, then the BGA components will use default values of `(0, 0, 1)`. The color type `(SFLOAT, UINT, SINT)` and bit width should also match the type of the shader input. See the following examples:

- `ivec2`: `VK_FORMAT_R32G32_SINT`, a 2-component vector of 32-bit signed integers
- `uvec4`: `VK_FORMAT_R32G32B32A32_UINT`, a 4-component vector of 32-bit unsigned integers
- `double`: `VK_FORMAT_R64_SFLOAT`, a double-precision (64-bit) float

The `format` parameter implicitly defines the byte size of attribute data and the `offset` parameter specifies the number of bytes since the start of the per-vertex data to read from. The binding is loading one vertex at a time and the position attribute (`pos`) is at an offset of `0` bytes from the beginning of this struct. here.

```java
attributeDescriptions[1].binding(0);
attributeDescriptions[1].location(1);
attributeDescriptions[1].format(VkFormat.VK_FORMAT_R32G32B32_SFLOAT);
attributeDescriptions[1].offset(Float.BYTES * 2);
```

The color attribute is described in much the same way.

## Pipeline vertex input

We now need to set up the graphics pipeline to accept vertex data in this format by referencing the structures in `createGraphicsPipeline`. Find the `vertexInputInfo` struct and modify it to reference the two descriptions:

```java
var vertexInputInfo = VkPipelineVertexInputStateCreateInfo.allocate(arena);
var bindingDescription = getBindingDescription(arena);
var attributeDescription = getAttributeDescriptions(arena);
vertexInputInfo.vertexBindingDescriptionCount(1);
vertexInputInfo.pVertexBindingDescriptions(bindingDescription);
vertexInputInfo.vertexAttributeDescriptionCount(attributeDescription.length);
vertexInputInfo.pVertexAttributeDescriptions(attributeDescription[0]);
```

The pipeline is now ready to accept vertex data in the format of the `vertices` container and pass it on to our vertex shader. If you run the program now with validation layers enabled, you'll see that it complains that there is no vertex buffer bound to the binding. The next step is to create a vertex buffer and move the vertex data to it so the GPU is able to access it.

# Descriptor set layout and buffer

## Introduction

We're now able to pass arbitrary attributes to the vertex shader for each vertex, but what about global variables? We're going to move on to 3D graphics from this chapter on and that requires a model-view-projection matrix. We could include it as vertex data, but that's a waste of memory, and it would require us to update the vertex buffer whenever the transformation changes. The transformation could easily change every single frame.

The right way to tackle this in Vulkan is to use *resource descriptors*. A descriptor is a way for shaders to freely access resources like buffers and images. We're going to set up a buffer that contains the transformation matrices and have the vertex shader access them through a descriptor. Usage of descriptors consists of three parts:

- Specify a descriptor set layout during pipeline creation
- Allocate a descriptor set from a descriptor pool
- Bind the descriptor set during rendering

The *descriptor set layout* specifies the types of resources that are going to be accessed by the pipeline, just like a render pass specifies the types of attachments that will be accessed. A descriptor set specifies the actual buffer or image resources that will be bound to the descriptors, just like a framebuffer specifies the actual image views to bind to render pass attachments. The descriptor set is then bound for the drawing commands just like the vertex buffers and framebuffer.

There are many types of descriptors, but in this chapter we'll work with uniform buffer objects (UBO). We'll look at other types of descriptors in future chapters, but the basic process is the same. Let's say we have the data we want the vertex shader to have in a C struct like this:

```c
struct UniformBufferObject {
    float model[4][4];
    float view[4][4];
    float proj[4][4];
};
```

Then we can copy the data to a `VkBuffer` and access it through a uniform buffer object descriptor from the vertex shader like this:

```glsl
layout(binding = 0) uniform UniformBufferObject {
    mat4 model;
    mat4 view;
    mat4 proj;
} ubo;

void main() {
    gl_Position = ubo.proj * ubo.view * ubo.model * vec4(inPosition, 0.0, 1.0);
    fragColor = inColor;
}
```

We're going to update the model, view and projection matrices every frame to make the rectangle from the previous chapter spin around in 3D.

## Vertex shader

Modify the vertex shader to include the uniform buffer object like it was specified above. I will assume that you are familiar with MVP transformations. If you're not, see [the resource](https://www.opengl-tutorial.org/beginners-tutorials/tutorial-3-matrices/) mentioned in the first chapter.

```glsl
#version 450

layout(binding = 0) uniform UniformBufferObject {
    mat4 model;
    mat4 view;
    mat4 proj;
} ubo;

layout(location = 0) in vec2 inPosition;
layout(location = 1) in vec3 inColor;

layout(location = 0) out vec3 fragColor;

void main() {
    gl_Position = ubo.proj * ubo.view * ubo.model * vec4(inPosition, 0.0, 1.0);
    fragColor = inColor;
}
```

Note that the order of the `uniform`, `in` and `out` declarations doesn't matter. The `binding` directive is similar to the `location` directive for attributes. We're going to reference this binding in the descriptor set layout. The line with `gl_Position` is changed to use the transformations to compute the final position in clip coordinates. Unlike the 2D triangles, the last component of the clip coordinates may not be 1, which will result in a division when converted to the final normalized device coordinates on the screen. This is used in perspective projection as the perspective division and is essential for making closer objects look larger than objects that are further away.

# Descriptor set layout

The next step is to define the UBO on the Java side and to tell Vulkan about this descriptor in the vertex shader. We'll use JOML `Matrix4f` to represent the transformation matrices:

```java
private record UniformBufferObject(Matrix4f model, Matrix4f view, Matrix4f proj) {}
```

However, we cannot directly upload Java classes to Vulkan buffer memory. Instead, we need to convert it to a native `MemorySegment` first. Unfortunately, JOML was designed at an era where `MemorySegment` was not available, so we need some help of `java.nio.ByteBuffer`:

```java
private record UniformBufferObject(Matrix4f model, Matrix4f view, Matrix4f proj) {
    public static int bufferSize() {
        return 16 * 3;
    }

    public void writeToFloatPtr(FloatPtr buffer) {
        assert buffer.size() >= bufferSize();

        model.get(buffer.segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        view.get(buffer.offset(16).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        proj.get(buffer.offset(32).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
    }
}
```

We need to provide details about every descriptor binding used in the shaders for pipeline creation, just like we had to do for every vertex attribute and its location index. We'll set up a new function to define all of this information called `createDescriptorSetLayout`. It should be called right before pipeline creation, because we're going to need it there.

```java
private void initVulkan() {
    // ...
    createDescriptorSetLayout();
    createGraphicsPipeline();
    // ...
}

// ...

private void createDescriptorSetLayout() {
}
```

Every binding needs to be described through a `VkDescriptorSetLayoutBinding` struct.

```java
try (var arena = Arena.ofConfined()) {
    var uboLayoutBinding = VkDescriptorSetLayoutBinding.allocate(arena);
    uboLayoutBinding.binding(0);
    uboLayoutBinding.descriptorType(VkDescriptorType.UNIFORM_BUFFER);
    uboLayoutBinding.descriptorCount(1);
}
```

The first two fields specify the `binding` used in the shader and the type of descriptor, which is a uniform buffer object. It is possible for the shader variable to represent an array of uniform buffer objects, and `descriptorCount` specifies the number of values in the array. This could be used to specify a transformation for each of the bones in a skeleton for skeletal animation, for example. Our MVP transformation is in a single uniform buffer object, so we're using a `descriptorCount` of `1`.

```java
uboLayoutBinding.stageFlags(VkShaderStageFlags.VERTEX);
```

We also need to specify in which shader stages the descriptor is going to be referenced. The `stageFlags` field can be a combination of `VkShaderStageFlagBits` values or the value `VkShaderStageFlags.ALL_GRAPHICS`. In our case, we're only referencing the descriptor from the vertex shader.

```java
uboLayoutBinding.pImmutableSamplers(null); // Optional
```

The `pImmutableSamplers` field is only relevant for image sampling related descriptors, which we'll look at later. You can leave this to its default value.

All the descriptor bindings are combined into a single `VkDescriptorSetLayout` object. Define a new class member above `pipelineLayout`:

```java
private VkDescriptorSetLayout descriptorSetLayout;
private VkPipelineLayout pipelineLayout;
```

We can then create it using `vkCreateDescriptorSetLayout`. This function accepts a simple `VkDescriptorSetLayoutCreateInfo` with the array of bindings:

```java
var layoutInfo = VkDescriptorSetLayoutCreateInfo.allocate(arena);
layoutInfo.bindingCount(1);
layoutInfo.pBindings(uboLayoutBinding);

var pDescriptorSetLayout = VkDescriptorSetLayout.Ptr.allocate(arena);
var result = deviceCommands.createDescriptorSetLayout(device, layoutInfo, null, pDescriptorSetLayout);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create descriptor set layout, vulkan error code: " + VkResult.explain(result));
}
descriptorSetLayout = Objects.requireNonNull(pDescriptorSetLayout.read());
```

We need to specify the descriptor set layout during pipeline creation to tell Vulkan which descriptors the shaders will be using. Descriptor set layouts are specified in the pipeline layout object. Modify the `VkPipelineLayoutCreateInfo` to reference the layout object:

```java
var pDescriptorSetLayout = VkDescriptorSetLayout.Ptr.allocate(arena);
pDescriptorSetLayout.write(descriptorSetLayout);
pipelineLayoutInfo.setLayoutCount(1);
pipelineLayoutInfo.pSetLayouts(pDescriptorSetLayout);
```

You may be wondering why it's possible to specify multiple descriptor set layouts here, because a single one already includes all the bindings. We'll get back to that in the next chapter, where we'll look into descriptor pools and descriptor sets.

The descriptor set layout should stick around while we may create new graphics pipelines i.e. until the program ends:

```java
private void cleanup() {
    // ...
    deviceCommands.destroyDescriptorSetLayout(device, descriptorSetLayout, null);
    // ...
}
```

## Uniform buffer

In the next chapter we'll specify the buffer that contains the UBO data for the shader, but we need to create this buffer first. We're going to copy new data to the uniform buffer every frame, so it doesn't really make any sense to have a staging buffer. It would just add extra overhead in this case and likely degrade performance instead of improving it.

We should have multiple buffers, because multiple frames may be in flight at the same time, and we don't want to update the buffer in preparation of the next frame while a previous one is still reading from it! Thus, we need to have as many uniform buffers as we have frames in flight, and write to a uniform buffer that is not currently being read by the GPU

To that end, add new class members for `uniformBuffers`, and `uniformBuffersMemory`:

```java
private VkBuffer.Ptr uniformBuffers;
private VkDeviceMemory.Ptr uniformBuffersMemory;
private FloatPtr[] uniformBuffersMapped;
```

Similarly, create a new function `createUniformBuffers` that is called after `createIndexBuffer` and allocates the buffers:

```java
private void initVulkan() {
    // ...
    createVertexBuffer();
    createIndexBuffer();
    createUniformBuffers();
    // ...
}

// ...

private void createUniformBuffers() {
    var bufferSize = UniformBufferObject.bufferSize();
    uniformBuffers = VkBuffer.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);
    uniformBuffersMemory = VkDeviceMemory.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);
    uniformBuffersMapped = new FloatPtr[MAX_FRAMES_IN_FLIGHT];

    try (var arena = Arena.ofConfined()) {
        var pMappedMemory = PointerPtr.allocate(arena);

        for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
            var pair = createBuffer(
                    bufferSize * Float.BYTES,
                    VkBufferUsageFlags.UNIFORM_BUFFER,
                    VkMemoryPropertyFlags.HOST_VISIBLE | VkMemoryPropertyFlags.HOST_COHERENT
            );
            uniformBuffers.write(i, pair.first);
            uniformBuffersMemory.write(i, pair.second);

            var result = deviceCommands.mapMemory(
                    device,
                    uniformBuffersMemory.read(i),
                    0,
                    (long) bufferSize * Float.BYTES,
                    0,
                    pMappedMemory
            );
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to map uniform buffer memory, vulkan error code: " + VkResult.explain(result));
            }

            uniformBuffersMapped[i] = new FloatPtr(pMappedMemory.read()).reinterpret(bufferSize);
        }
    }
}
```

We map the buffer right after creation using `vkMapMemory` to get a pointer to which we can write the data later on. The buffer stays mapped to this pointer for the application's whole lifetime. This technique is called **"persistent mapping"** and works on all Vulkan implementations. Not having to map the buffer every time we need to update it increases performances, as mapping is not free.

The uniform data will be used for all draw calls, so the buffer containing it should only be destroyed when we stop rendering.


```java
private void cleanup() {
    // ...
    for (var uniformBuffer : uniformBuffers) {
        deviceCommands.destroyBuffer(device, uniformBuffer, null);
    }
    for (var uniformBufferMemory : uniformBuffersMemory) {
        deviceCommands.freeMemory(device, uniformBufferMemory, null);
    }
    deviceCommands.vkDestroyDescriptorSetLayout(device, descriptorSetLayout, null);
    // ...
}
```

## Updating uniform data

Create a new function `updateUniformBuffer` and add a call to it from the `drawFrame` function before submitting the next frame:

```java
private void drawFrame() {
    // ...
    updateUniformBuffer();
    // ...
    var submitInfo = VkSubmitInfo.allocate(arena);
    // ...
}

// ...

private void updateUniformBuffer() {
}
```

This function will generate a new transformation every frame to make the geometry spin around. We'll use the `Matrix4x4` provided by `vulkan4j` to create the transform matrices.

```java
private static final long startTime = System.currentTimeMillis();

private void updateUniformBuffer(int currentImage) {
    var time = (System.currentTimeMillis() - startTime) / 1000.0f;
}
```
The `updateUniformBuffer` function will start out with some logic to calculate the time in seconds since rendering has started with floating point accuracy.

We will now define the model, view and projection transformations in the uniform buffer object. The model rotation will be a simple rotation around the Z-axis using the `time` variable:

```java
var model = new Matrix4f().rotate((float) (Math.toRadians(90.0f) * time), 0.0f, 0.0f, 1.0f);
```

The `new Matrix4f()` constructor returns an identity matrix, while the `rotate` method takes a rotation angle and a rotation axis as parameters. Using a rotation angle of `Math.toRadians(90.0f) * time)` accomplishes the purpose of rotation 90 degrees per second.

```java
var view = new Matrix4f().lookAt(
        2.0f, 2.0f, 2.0f,
        0.0f, 0.0f, 0.0f,
        0.0f, 0.0f, 1.0f
);
```

For the view transformation I've decided to look at the geometry from above at a 45-degree angle. The `lookAt` method takes the eye position, center position and up axis as parameters.

```java
var proj = new Matrix4f().perspective(
        (float) Math.toRadians(45.0f),
        swapChainExtent.width() / (float) swapChainExtent.height(),
        0.1f,
        10.0f,
        true
);
```

I've chosen to use a perspective projection with a 45 degree vertical field-of-view. The other parameters are the aspect ratio, near and far view planes. It is important to use the current swap chain extent to calculate the aspect ratio to take into account the new width and height of the window after a resize. The last parameter `zZeroToOne` decides whether to use Vulkan's `0 ~ +1` depth range or not. We'll use the `0 ~ +1` range, so we set it to `true`.

All the transformations are defined now, so we can copy the data in the uniform buffer object to the current uniform buffer. This happens in exactly the same way as we did for vertex buffers, except without a staging buffer. As noted earlier, we only map the uniform buffer once, so we can directly write to it without having to map again:

```java
new UniformBufferObject(model, view, proj).writeToBuffer(uniformBuffersMapped[currentFrame]);
```

Using a UBO this way is not the most efficient way to pass frequently changing values to the shader. A more efficient way to pass a small buffer of data to shaders are *push constants*. We may look at these in a future chapter.

In the next chapter we'll look at descriptor sets, which will actually bind the `VkBuffer`s to the uniform buffer descriptors so that the shader can access this transformation data.

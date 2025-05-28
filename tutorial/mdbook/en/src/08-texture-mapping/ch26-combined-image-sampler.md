# Combined image sampler

## Introduction

We looked at descriptors for the first time in the uniform buffers part of the tutorial. In this chapter we will look at a new type of descriptor: *combined image sampler*. This descriptor makes it possible for shaders to access an image resource through a sampler object like the one we created in the previous chapter.

We'll start by modifying the descriptor layout, descriptor pool and descriptor set to include such a combined image sampler descriptor. After that, we're going to add texture coordinates to `Vertex` and modify the fragment shader to read colors from the texture instead of just interpolating the vertex colors.

## Updating the descriptors

Browse to the `createDescriptorSetLayout` function and add a `VkDescriptorSetLayoutBinding` for a combined image sampler descriptor:

```java
var bindings = VkDescriptorSetLayoutBinding.allocate(arena, 2);
var uboLayoutBinding = bindings.at(0);
uboLayoutBinding.binding(0);
uboLayoutBinding.descriptorType(VkDescriptorType.UNIFORM_BUFFER);
uboLayoutBinding.descriptorCount(1);
uboLayoutBinding.stageFlags(VkShaderStageFlags.VERTEX);
var samplerLayoutBinding = bindings.at(1);
samplerLayoutBinding.binding(1);
samplerLayoutBinding.descriptorCount(1);
samplerLayoutBinding.descriptorType(VkDescriptorType.COMBINED_IMAGE_SAMPLER);
samplerLayoutBinding.stageFlags(VkShaderStageFlags.FRAGMENT);

var layoutInfo = VkDescriptorSetLayoutCreateInfo.allocate(arena);
layoutInfo.bindingCount(2);
layoutInfo.pBindings(bindings);
```

Make sure to set the `stageFlags` to indicate that we intend to use the combined image sampler descriptor in the fragment shader. That's where the color of the fragment is going to be determined. It is possible to use texture sampling in the vertex shader, for example to dynamically deform a grid of vertices by a [heightmap](https://en.wikipedia.org/wiki/Heightmap).

We must also create a larger descriptor pool to make room for the allocation of the combined image sampler by adding another `VkPoolSize` of type `VkDescriptorType.COMBINED_IMAGE_SAMPLER` to the `VkDescriptorPoolCreateInfo`. Go to the `createDescriptorPool` function and modify it to include a `VkDescriptorPoolSize` for this descriptor:

```java
var poolSizes = VkDescriptorPoolSize.allocate(arena, 2);
poolSizes.at(0).type(VkDescriptorType.UNIFORM_BUFFER);
poolSizes.at(0).descriptorCount(MAX_FRAMES_IN_FLIGHT);
poolSizes.at(1).type(VkDescriptorType.COMBINED_IMAGE_SAMPLER);
poolSizes.at(1).descriptorCount(MAX_FRAMES_IN_FLIGHT);

var poolInfo = VkDescriptorPoolCreateInfo.allocate(arena);
poolInfo.poolSizeCount(2);
poolInfo.pPoolSizes(poolSizes);
poolInfo.maxSets(MAX_FRAMES_IN_FLIGHT);
```

Inadequate descriptor pools are a good example of a problem that the validation layers will not catch: As of Vulkan 1.1, `VkDeviceComands::allocateDescriptorSets` may fail with the error code `VkResult.ERROR_POOL_OUT_OF_MEMORY` if the pool is not sufficiently large, but the driver may also try to solve the problem internally. This means that sometimes (depending on hardware, pool size and allocation size) the driver will let us get away with an allocation that exceeds the limits of our descriptor pool. Other times, `VkDeviceComands::allocateDescriptorSets` will fail and return `VkResult.ERROR_POOL_OUT_OF_MEMORY`. This can be particularly frustrating if the allocation succeeds on some machines, but fails on others.

Since Vulkan shifts the responsibility for the allocation to the driver, it is no longer a strict requirement to only allocate as many descriptors of a certain type (`VkDescriptorType.COMBINED_IMAGE_SAMPLER`, etc.) as specified by the corresponding `descriptorCount` members for the creation of the descriptor pool. However, it remains best practise to do so, and in the future, `VK_LAYER_KHRONOS_validation` will warn about this type of problem if you enable Best Practice Validation.

The final step is to bind the actual image and sampler resources to the descriptors in the descriptor set. Go to the `createDescriptorSets` function.

```java
for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
    var bufferInfo = VkDescriptorBufferInfo.allocate(arena);
    bufferInfo.buffer(uniformBuffers.read(i));
    bufferInfo.offset(0);
    bufferInfo.range((long) UniformBufferObject.bufferSize() * Float.BYTES);
    
    var imageInfo = VkDescriptorImageInfo.allocate(arena);
    imageInfo.imageLayout(VkImageLayout.SHADER_READ_ONLY_OPTIMAL);
    imageInfo.imageView(textureImageView);
    imageInfo.sampler(textureSampler);
    
    // ...
}
```

The resources for a combined image sampler structure must be specified in a `VkDescriptorImageInfo` struct, just like the buffer resource for a uniform buffer descriptor is specified in a `VkDescriptorBufferInfo` struct. This is where the objects from the previous chapter come together.

```java
var descriptorWrite = VkWriteDescriptorSet.allocate(arena, 2);
var descriptorWrite0 = descriptorWrite.at(0);
descriptorWrite0.dstSet(descriptorSets.read(i));
descriptorWrite0.dstBinding(0);
descriptorWrite0.dstArrayElement(0);
descriptorWrite0.descriptorType(VkDescriptorType.UNIFORM_BUFFER);
descriptorWrite0.descriptorCount(1);
descriptorWrite0.pBufferInfo(bufferInfo);

var descriptorWrite1 = descriptorWrite.at(1);
descriptorWrite1.dstSet(descriptorSets.read(i));
descriptorWrite1.dstBinding(1);
descriptorWrite1.dstArrayElement(0);
descriptorWrite1.descriptorType(VkDescriptorType.COMBINED_IMAGE_SAMPLER);
descriptorWrite1.descriptorCount(1);
descriptorWrite1.pImageInfo(imageInfo);

deviceCommands.updateDescriptorSets(device, 2, descriptorWrite, 0, null);
```

The descriptors must be updated with this image info, just like the buffer. This time we're using the `pImageInfo` array instead of `pBufferInfo`. The descriptors are now ready to be used by the shaders!

## Texture coordinates

There is one important ingredient for texture mapping that is still missing, and that's the actual coordinates for each vertex. The coordinates determine how the image is actually mapped to the geometry.

```java
private static VkVertexInputBindingDescription getBindingDescription(Arena arena) {
    var description = VkVertexInputBindingDescription.allocate(arena);
    description.binding(0);
    description.stride(Float.BYTES * 7); // 2 floats for position, 3 for color, 2 for texture coordinates
    description.inputRate(VkVertexInputRate.VERTEX);
    return description;
}

private static VkVertexInputAttributeDescription.Ptr getAttributeDescriptions(Arena arena) {
    var attributeDescriptions = VkVertexInputAttributeDescription.allocate(arena, 3);
    var vertexAttribute = attributeDescriptions.at(0);
    var colorAttribute = attributeDescriptions.at(1);
    var texCoordAttribute = attributeDescriptions.at(2);

    vertexAttribute.binding(0);
    vertexAttribute.location(0);
    vertexAttribute.format(VkFormat.R32G32_SFLOAT);
    vertexAttribute.offset(0);

    colorAttribute.binding(0);
    colorAttribute.location(1);
    colorAttribute.format(VkFormat.R32G32B32_SFLOAT);
    colorAttribute.offset(Float.BYTES * 2);

    texCoordAttribute.binding(0);
    texCoordAttribute.location(2);
    texCoordAttribute.format(VkFormat.R32G32_SFLOAT);
    texCoordAttribute.offset(Float.BYTES * 5);

    return attributeDescriptions;
}
```

Update the `getBindingDescription` and `getAttributeDescriptions` so that we can use access texture coordinates as input in the vertex shader. That is necessary to be able to pass them to the fragment shader for interpolation across the surface of the square.

```java
private static final float[] VERTICES = {
        // vec2 pos     // vec3 color       // vec2 texCoord
        -0.5f, -0.5f,   1.0f, 0.0f, 0.0f,   1.0f, 0.0f,
        0.5f, -0.5f,    0.0f, 1.0f, 0.0f,   0.0f, 0.0f,
        0.5f, 0.5f,     0.0f, 0.0f, 1.0f,   0.0f, 1.0f,
        -0.5f, 0.5f,    1.0f, 1.0f, 1.0f,   1.0f, 1.0f
};
```

In this tutorial, I will simply fill the square with the texture by using coordinates from `0, 0` in the top-left corner to `1, 1` in the bottom-right corner. Feel free to experiment with different coordinates. Try using coordinates below `0` or above `1` to see the addressing modes in action!

## Shaders

The final step is modifying the shaders to sample colors from the texture. We first need to modify the vertex shader to pass through the texture coordinates to the fragment shader:

```glsl
#version 450

layout(binding = 0) uniform UniformBufferObject {
    mat4 model;
    mat4 view;
    mat4 proj;
} ubo;

layout(location = 0) in vec2 inPosition;
layout(location = 1) in vec3 inColor;
layout(location = 2) in vec2 inTexCoord;

layout(location = 0) out vec3 fragColor;
layout(location = 1) out vec2 fragTexCoord;

void main() {
    gl_Position = ubo.proj * ubo.view * ubo.model * vec4(inPosition, 0.0, 1.0);
    fragColor = inColor;
    fragTexCoord = inTexCoord;
}
```

Just like the per vertex colors, the `fragTexCoord` values will be smoothly interpolated across the area of the square by the rasterizer. We can visualize this by having the fragment shader output the texture coordinates as colors:

```glsl
#version 450

layout(location = 0) in vec3 fragColor;
layout(location = 1) in vec2 fragTexCoord;

layout(location = 0) out vec4 outColor;

void main() {
    outColor = vec4(fragTexCoord, 0.0, 1.0);
}
```

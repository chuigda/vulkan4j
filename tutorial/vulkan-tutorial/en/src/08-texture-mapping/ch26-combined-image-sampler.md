# Combined image sampler

> [Java code](https://github.com/club-doki7/vulkan4j/tree/master/modules/tutorial/src/main/java/tutorial/vulkan/part08/ch26/Main.java) | [C++ version](https://vulkan-tutorial.com/Texture_mapping/Combined_image_sampler)

## Introduction

We looked at descriptors for the first time in the uniform buffers part of the tutorial. In this chapter we will look at a new type of descriptor: *combined image sampler*. This descriptor makes it possible for shaders to access an image resource through a sampler object like the one we created in the previous chapter.

We'll start by modifying the descriptor layout, descriptor pool and descriptor set to include such a combined image sampler descriptor. After that, we're going to add texture coordinates to `Vertex` and modify the fragment shader to read colors from the texture instead of just interpolating the vertex colors.

## Updating the descriptors

Browse to the `createDescriptorSetLayout` function and add a `VkDescriptorSetLayoutBinding` for a combined image sampler descriptor:

```java
var bindings = VkDescriptorSetLayoutBinding.allocate(arena, 2)
        .at(0, it -> it
                .binding(0)
                .descriptorType(VkDescriptorType.UNIFORM_BUFFER)
                .descriptorCount(1)
                .stageFlags(VkShaderStageFlags.VERTEX))
        .at(1, it -> it
                .binding(1)
                .descriptorCount(1)
                .descriptorType(VkDescriptorType.COMBINED_IMAGE_SAMPLER)
                .stageFlags(VkShaderStageFlags.FRAGMENT));

var layoutInfo = VkDescriptorSetLayoutCreateInfo.allocate(arena)
        .bindingCount(2)
        .pBindings(bindings);
```

Make sure to set the `stageFlags` to indicate that we intend to use the combined image sampler descriptor in the fragment shader. That's where the color of the fragment is going to be determined. It is possible to use texture sampling in the vertex shader, for example to dynamically deform a grid of vertices by a [heightmap](https://en.wikipedia.org/wiki/Heightmap).

We must also create a larger descriptor pool to make room for the allocation of the combined image sampler by adding another `VkPoolSize` of type `VkDescriptorType.COMBINED_IMAGE_SAMPLER` to the `VkDescriptorPoolCreateInfo`. Go to the `createDescriptorPool` function and modify it to include a `VkDescriptorPoolSize` for this descriptor:

```java
var poolSizes = VkDescriptorPoolSize.allocate(arena, 2)
        .at(0, it -> it
                .type(VkDescriptorType.UNIFORM_BUFFER)
                .descriptorCount(MAX_FRAMES_IN_FLIGHT))
        .at(1, it -> it
                .type(VkDescriptorType.COMBINED_IMAGE_SAMPLER)
                .descriptorCount(MAX_FRAMES_IN_FLIGHT));

var poolInfo = VkDescriptorPoolCreateInfo.allocate(arena)
        .poolSizeCount(2)
        .pPoolSizes(poolSizes)
        .maxSets(MAX_FRAMES_IN_FLIGHT);
```

Inadequate descriptor pools are a good example of a problem that the validation layers will not catch: As of Vulkan 1.1, `VkDeviceComands::allocateDescriptorSets` may fail with the error code `VkResult.ERROR_POOL_OUT_OF_MEMORY` if the pool is not sufficiently large, but the driver may also try to solve the problem internally. This means that sometimes (depending on hardware, pool size and allocation size) the driver will let us get away with an allocation that exceeds the limits of our descriptor pool. Other times, `VkDeviceComands::allocateDescriptorSets` will fail and return `VkResult.ERROR_POOL_OUT_OF_MEMORY`. This can be particularly frustrating if the allocation succeeds on some machines, but fails on others.

Since Vulkan shifts the responsibility for the allocation to the driver, it is no longer a strict requirement to only allocate as many descriptors of a certain type (`VkDescriptorType.COMBINED_IMAGE_SAMPLER`, etc.) as specified by the corresponding `descriptorCount` members for the creation of the descriptor pool. However, it remains best practise to do so, and in the future, `VK_LAYER_KHRONOS_validation` will warn about this type of problem if you enable Best Practice Validation.

The final step is to bind the actual image and sampler resources to the descriptors in the descriptor set. Go to the `createDescriptorSets` function.

```java
for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
    var bufferInfo = VkDescriptorBufferInfo.allocate(arena)
            .buffer(uniformBuffers.read(i))
            .offset(0)
            .range((long) UniformBufferObject.bufferSize() * Float.BYTES);

    var imageInfo = VkDescriptorImageInfo.allocate(arena)
            .imageLayout(VkImageLayout.SHADER_READ_ONLY_OPTIMAL)
            .imageView(textureImageView)
            .sampler(textureSampler);

    // ...
}
```

The resources for a combined image sampler structure must be specified in a `VkDescriptorImageInfo` struct, just like the buffer resource for a uniform buffer descriptor is specified in a `VkDescriptorBufferInfo` struct. This is where the objects from the previous chapter come together.

```java
var descriptorWrite = VkWriteDescriptorSet.allocate(arena, 2)
        .at(0, it -> it
                .dstSet(descriptorSets.read(i))
                .dstBinding(0)
                .dstArrayElement(0)
                .descriptorType(VkDescriptorType.UNIFORM_BUFFER)
                .descriptorCount(1)
                .pBufferInfo(bufferInfo))
        .at(1, it -> it
                .dstSet(descriptorSets.read(i))
                .dstBinding(1)
                .dstArrayElement(0)
                .descriptorType(VkDescriptorType.COMBINED_IMAGE_SAMPLER)
                .descriptorCount(1)
                .pImageInfo(imageInfo));

deviceCommands.updateDescriptorSets(device, 2, descriptorWrite, 0, null);
```

The descriptors must be updated with this image info, just like the buffer. This time we're using the `pImageInfo` array instead of `pBufferInfo`. The descriptors are now ready to be used by the shaders!

## Texture coordinates

There is one important ingredient for texture mapping that is still missing, and that's the actual coordinates for each vertex. The coordinates determine how the image is actually mapped to the geometry.

```java
private static VkVertexInputBindingDescription getBindingDescription(Arena arena) {
    return VkVertexInputBindingDescription.allocate(arena)
            .binding(0)
            .stride(Float.BYTES * 7) // 2 floats for position, 3 for color, 2 for texture coordinates
            .inputRate(VkVertexInputRate.VERTEX);
}

private static VkVertexInputAttributeDescription.Ptr getAttributeDescriptions(Arena arena) {
    return VkVertexInputAttributeDescription.allocate(arena, 3)
            .at(0, it -> it
                    .binding(0)
                    .location(0)
                    .format(VkFormat.R32G32_SFLOAT)
                    .offset(0))
            .at(1, it -> it
                    .binding(0)
                    .location(1)
                    .format(VkFormat.R32G32B32_SFLOAT)
                    .offset(Float.BYTES * 2))
            .at(2, it -> it
                    .binding(0)
                    .location(2)
                    .format(VkFormat.R32G32_SFLOAT)
                    .offset(Float.BYTES * 5));
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

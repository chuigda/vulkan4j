# Descriptor pool and sets

## Introduction

The descriptor layout from the previous chapter describes the type of descriptors that can be bound. In this chapter we're going to create a descriptor set for each `VkBuffer` resource to bind it to the uniform buffer descriptor.

## Descriptor pool

Descriptor sets can't be created directly, they must be allocated from a pool like command buffers. The equivalent for descriptor sets is unsurprisingly called a *descriptor pool*. We'll write a new function `createDescriptorPool` to set it up.

```java
private void initVulkan() {
    // ...
    createUniformBuffers();
    createDescriptorPool();
    // ...
}

// ...

private void createDescriptorPool() {
}
```

We first need to describe which descriptor types our descriptor sets are going to contain and how many of them, using `VkDescriptorPoolSize` structures.

```java
try (var arena = Arena.ofConfined()) {
    var poolSize = VkDescriptorPoolSize.allocate(arena);
    poolSize.type(VkDescriptorType.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER);
    poolSize.descriptorCount(MAX_FRAMES_IN_FLIGHT);
}
```

We will allocate one of these descriptors for every frame. This pool size structure is referenced by the main `VkDescriptorPoolCreateInfo`:

```java
var poolInfo = VkDescriptorPoolCreateInfo.allocate(arena);
poolInfo.poolSizeCount(1);
poolInfo.pPoolSizes(poolSize);
```

Aside from the maximum number of individual descriptors that are available, we also need to specify the maximum number of descriptor sets that may be allocated:

```java
poolInfo.maxSets(MAX_FRAMES_IN_FLIGHT);
```

The structure has an optional flag similar to command pools that determines if individual descriptor sets can be freed or not: `VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT`. We're not going to touch the descriptor set after creating it, so we don't need this flag. You can leave flags to its default value of `0`.

```java
private VkDescriptorPool descriptorPool;

// ...

var pDescriptorPool = VkDescriptorPool.Buffer.allocate(arena);
var result = deviceCommands.vkCreateDescriptorPool(device, poolInfo, null, pDescriptorPool);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to create descriptor pool, vulkan error code: " + VkResult.explain(result));
}
descriptorPool = pDescriptorPool.read();
```

Add a new class member to store the handle of the descriptor pool and call `vkCreateDescriptorPool` to create it.

## Descriptor set

We can now allocate the descriptor sets themselves. Add a `createDescriptorSets` function for that purpose:

```java
private void initVulkan() {
    // ...
    createDescriptorPool();
    createDescriptorSets();
    // ...
}

// ...

private void createDescriptorSets() {
}
```

A descriptor set allocation is described with a `VkDescriptorSetAllocateInfo` struct. You need to specify the descriptor pool to allocate from, the number of descriptor sets to allocate, and the descriptor layout to base them on:

```java
var pLayouts = VkDescriptorSetLayout.Buffer.allocate(arena, MAX_FRAMES_IN_FLIGHT);
pLayouts.write(0, descriptorSetLayout);
pLayouts.write(1, descriptorSetLayout);

var allocInfo = VkDescriptorSetAllocateInfo.allocate(arena);
allocInfo.descriptorPool(descriptorPool);
allocInfo.descriptorSetCount(MAX_FRAMES_IN_FLIGHT);
allocInfo.pSetLayouts(pLayouts);
```

In our case we will create one descriptor set for each frame in flight, all with the same layout. Unfortunately we do need all the copies of the layout because the next function expects an array matching the number of sets.

Add a class member to hold the descriptor set handles and allocate them with `vkAllocateDescriptorSets`:

```java
private VkDescriptorSet[] descriptorSets;

// ...

var pDescriptorSets = VkDescriptorSet.Buffer.allocate(arena, MAX_FRAMES_IN_FLIGHT);
var result = deviceCommands.vkAllocateDescriptorSets(device, allocInfo, pDescriptorSets);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to allocate descriptor sets, vulkan error code: " + VkResult.explain(result));
}
descriptorSets = pDescriptorSets.readAll();
```

The call to `vkAllocateDescriptorSets` will allocate descriptor sets, each with one uniform buffer descriptor.

You don't need to explicitly clean up descriptor sets, because they will be automatically freed when the descriptor pool is destroyed.

```java
private void cleanup() {
    // ...
    deviceCommands.vkDestroyDescriptorPool(device, descriptorPool, null);
    deviceCommands.vkDestroyDescriptorSetLayout(device, descriptorSetLayout, null);
    // ...
}
```

The descriptor sets have been allocated now, but the descriptors within still need to be configured. We'll now add a loop to populate every descriptor:

```java
for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++){
}
```

Descriptors that refer to buffers, like our uniform buffer descriptor, are configured with a `VkDescriptorBufferInfo` struct. This structure specifies the buffer and the region within it that contains the data for the descriptor.

```java
for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
    var bufferInfo = VkDescriptorBufferInfo.allocate(arena);
    bufferInfo.buffer(uniformBuffers[i]);
    bufferInfo.offset(0);
    bufferInfo.range((long) UniformBufferObject.bufferSize() * Float.BYTES);
}
```

If you're overwriting the whole buffer, like we are in this case, then it is also possible to use the `VK_WHOLE_SIZE` value for the range. The configuration of descriptors is updated using the `vkUpdateDescriptorSets` function, which takes an array of `VkWriteDescriptorSet` structs as parameter.

```java
var descriptorWrite = VkWriteDescriptorSet.allocate(arena);
descriptorWrite.dstSet(descriptorSets[i]);
descriptorWrite.dstBinding(0);
descriptorWrite.dstArrayElement(0);
```

The first two fields specify the descriptor set to update and the binding. We gave our uniform buffer binding index `0`. Remember that descriptors can be arrays, so we also need to specify the first index in the array that we want to update. We're not using an array, so the index is simply `0`.

```java
descriptorWrite.descriptorType(VkDescriptorType.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER);
descriptorWrite.descriptorCount(1);
```

We need to specify the type of descriptor again. It's possible to update multiple descriptors at once in an array, starting at index `dstArrayElement`. The `descriptorCount` field specifies how many array elements you want to update.

```java
descriptorWrite.pBufferInfo(bufferInfo);
descriptorWrite.pImageInfo(null); // Optional
descriptorWrite.pTexelBufferView(null); // Optional
```

The last field references an array with `descriptorCount` structs that actually configure the descriptors. It depends on the type of descriptor which one of the three you actually need to use. The `pBufferInfo` field is used for descriptors that refer to buffer data, `pImageInfo` is used for descriptors that refer to image data, and `pTexelBufferView` is used for descriptors that refer to buffer views. Our descriptor is based on buffers, so we're using `pBufferInfo`.

```java
deviceCommands.vkUpdateDescriptorSets(device, 1, descriptorWrite, 0, null);
```

The updates are applied using `vkUpdateDescriptorSets`. It accepts two kinds of arrays as parameters: an array of `VkWriteDescriptorSet` and an array of `VkCopyDescriptorSet`. The latter can be used to copy descriptors to each other, as its name implies.

## Updating descriptor sets

We now need to update the `recordCommandBuffer` function to actually bind the right descriptor set for each frame to the descriptors in the shader with `vkCmdBindDescriptorSets`. This needs to be done before the `vkCmdDrawIndexed` call:

```java
var pDescriptorSet = VkDescriptorSet.Buffer.allocate(arena);
pDescriptorSet.write(descriptorSets[currentFrame]);
deviceCommands.vkCmdBindDescriptorSets(
        commandBuffer,
        VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS,
        pipelineLayout,
        0,
        1,
        pDescriptorSet,
        0,
        null
);
deviceCommands.vkCmdDrawIndexed(commandBuffer, INDICES.length, 1, 0, 0, 0);
```

Unlike vertex and index buffers, descriptor sets are not unique to graphics pipelines. Therefore, we need to specify if we want to bind descriptor sets to the graphics or compute pipeline. The next parameter is the layout that the descriptors are based on. The next three parameters specify the index of the first descriptor set, the number of sets to bind, and the array of sets to bind. We'll get back to this in a moment. The last two parameters specify an array of offsets that are used for dynamic descriptors. We'll look at these in a future chapter.

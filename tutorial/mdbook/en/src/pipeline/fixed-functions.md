# Fixed functions

The older graphics APIs provided default state for most of the stages of the graphics pipeline. In Vulkan you have to be explicit about most pipeline states as it'll be baked into an immutable pipeline state object. In this chapter we'll fill in all of the structures to configure these fixed-function operations.

## Dynamic state

While *most* of the pipeline state needs to be baked into the pipeline state, a limited amount of the state can actually be changed without recreating the pipeline at draw time. Examples are the size of the viewport, line width and blend constants. If you want to use dynamic state and keep these properties out, then you'll have to fill in a `VkPipelineDynamicStateCreateInfo` structure like this:

```java
var dynamicStates = IntBuffer.allocate(arena, 2);
dynamicStates.write(0, VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT);
dynamicStates.write(1, VkDynamicState.VK_DYNAMIC_STATE_SCISSOR);

var dynamicStateInfo = VkPipelineDynamicStateCreateInfo.allocate(arena);
dynamicState.dynamicStateCount(2);
dynamicState.pDynamicStates(dynamicStates);
```

This will cause the configuration of these values to be ignored, and you will be able (and required) to specify the data at drawing time. This results in a more flexible setup and is very common for things like viewport and scissor state, which would result in a more complex setup when being baked into the pipeline state.

## Vertex input

The `VkPipelineVertexInputStateCreateInfo` structure describes the format of the vertex data that will be passed to the vertex shader. It describes this in roughly two ways:

- Bindings: spacing between data and whether the data is per-vertex or per-instance (see [instancing](https://en.wikipedia.org/wiki/Geometry_instancing))
- Attribute descriptions: type of the attributes passed to the vertex shader, which binding to load them from and at which offset 

Because we're hard coding the vertex data directly in the vertex shader, we'll fill in this structure to specify that there is no vertex data to load for now. We'll get back to it in the vertex buffer chapter.

```java
var vertexInputInfo = VkPipelineVertexInputStateCreateInfo.allocate(arena);
// members are automatically zeroed by the arena allocation
```

Add this structure to the `createGraphicsPipeline` function right after the `shaderStages` array.

## Input assembly

The `VkPipelineInputAssemblyStateCreateInfo` struct describes two things: what kind of geometry will be drawn from the vertices and if primitive restart should be enabled. The former is specified in the `topology` member and can have values like:

- `VK_PRIMITIVE_TOPOLOGY_POINT_LIST`: points from vertices
- `VK_PRIMITIVE_TOPOLOGY_LINE_LIST`: line from every 2 vertices without reuse
- `VK_PRIMITIVE_TOPOLOGY_LINE_STRIP`: the end vertex of every line is used as start vertex for the next line
- `VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST`: triangle from every 3 vertices without reuse
- `VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP`: the second and third vertex of every triangle are used as first two vertices of the next triangle

Normally, the vertices are loaded from the vertex buffer by index in sequential order, but with an element buffer you can specify the indices to use yourself. This allows you to perform optimizations like reusing vertices. If you set the `primitiveRestartEnable` member to `VK_TRUE`, then it's possible to break up lines and triangles in the `_STRIP` topology modes by using a special index of `0xFFFF` or `0xFFFFFFFF`.

We intend to draw triangles throughout this tutorial, so we'll stick to the following data for the structure:

```java
var inputAssembly = VkPipelineInputAssemblyStateCreateInfo.allocate(arena);
inputAssembly.topology(VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST);
inputAssembly.primitiveRestartEnable(Constants.VK_FALSE);
```

## Viewports and scissors

A viewport basically describes the region of the framebuffer that the output will be rendered to. This will almost always be `(0, 0)` to `(width, height)` and in this tutorial that will also be the case.

```java
var viewport = VkViewport.allocate(arena);
viewport.x(0.0f);
viewport.y(0.0f);
viewport.width(swapChainExtent.width());
viewport.height(swapChainExtent.height());
viewport.minDepth(0.0f);
viewport.maxDepth(1.0f);
```

Remember that the size of the swap chain and its images may differ from the `WIDTH` and `HEIGHT` of the window. The swap chain images will be used as framebuffers later on, so we should stick to their size.

The `minDepth` and `maxDepth` values specify the range of depth values to use for the framebuffer. These values must be within the `[0.0f, 1.0f]` range, but `minDepth` may be higher than `maxDepth`. If you aren't doing anything special, then you should stick to the standard values of `0.0f` and `1.0f`.

While viewports define the transformation from the image to the framebuffer, scissor rectangles define in which regions pixels will actually be stored. Any pixels outside the scissor rectangles will be discarded by the rasterizer. They function like a filter rather than a transformation. The difference is illustrated below. Note that the left scissor rectangle is just one of the many possibilities that would result in that image, as long as it's larger than the viewport.

![viewport scissors](../images/viewports_scissors.png)

So if we wanted to draw to the entire framebuffer, we would specify a scissor rectangle that covers it entirely:

```java
var scissor = VkRect2D.allocate(arena);
scissor.offset().x(0);
scissor.offset().y(0);
scissor.extent(swapChainExtent);
```

Viewport(s) and scissor rectangle(s) can either be specified as a static part of the pipeline or as a [dynamic state](https://vulkan-tutorial.com/Drawing_a_triangle/Graphics_pipeline_basics/Fixed_functions#dynamic-state) set in the command buffer. While the former is more in line with the other states it's often convenient to make viewport and scissor state dynamic as it gives you a lot more flexibility. This is very common and all implementations can handle this dynamic state without a performance penalty.

When opting for dynamic viewport(s) and scissor rectangle(s) you need to enable the respective dynamic states for the pipeline:

```java
var dynamicStates = IntBuffer.allocate(arena, 2);
dynamicStates.write(0, VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT);
dynamicStates.write(1, VkDynamicState.VK_DYNAMIC_STATE_SCISSOR);
var dynamicStateInfo = VkPipelineDynamicStateCreateInfo.allocate(arena);
dynamicStateInfo.dynamicStateCount(2);
dynamicStateInfo.pDynamicStates(dynamicStates);
```

And then you only need to specify their count at pipeline creation time:

```java
var viewportStateInfo = VkPipelineViewportStateCreateInfo.allocate(arena);
viewportStateInfo.viewportCount(1);
viewportStateInfo.scissorCount(1);
```

The actual viewport(s) and scissor rectangle(s) will then later be set up at drawing time.

With dynamic state it's even possible to specify different viewports and or scissor rectangles within a single command buffer.

Without dynamic state, the viewport and scissor rectangle need to be set in the pipeline using the `VkPipelineViewportStateCreateInfo` struct. This makes the viewport and scissor rectangle for this pipeline immutable. Any changes required to these values would require a new pipeline to be created with the new values.

```java
var viewportStateInfo = VkPipelineViewportStateCreateInfo.allocate(arena);
viewportStateInfo.viewportCount(1);
viewportStateInfo.pViewports(viewport);
viewportStateInfo.scissorCount(1);
viewportStateInfo.pScissors(scissor);
```

Independent of how you set them, it is possible to use multiple viewports and scissor rectangles on some graphics cards, so the structure members reference an array of them. Using multiple requires enabling a GPU feature (see logical device creation).

In this tutorial, our following code will assume that the viewport and scissor rectangle are dynamic.

## Rasterizer

The rasterizer takes the geometry that is shaped by the vertices from the vertex shader and turns it into fragments to be colored by the fragment shader. It also performs [depth testing](https://en.wikipedia.org/wiki/Z-buffering), [face culling](https://en.wikipedia.org/wiki/Back-face_culling) and the scissor test, and it can be configured to output fragments that fill entire polygons or just the edges (wireframe rendering). All this is configured using the `VkPipelineRasterizationStateCreateInfo` structure.

```java
var rasterizer = VkPipelineRasterizationStateCreateInfo.allocate(arena);
rasterizer.depthClampEnable(Constants.VK_FALSE);
```

If `depthClampEnable` is set to `VK_TRUE`, then fragments that are beyond the near and far planes are clamped to them as opposed to discarding them. This is useful in some special cases like shadow maps. Using this requires enabling a GPU feature.

```java
rasterizer.rasterizerDiscardEnable(Constants.VK_FALSE);
```

If `rasterizerDiscardEnable` is set to `VK_TRUE`, then geometry never passes through the rasterizer stage. This basically disables any output to the framebuffer.

```java
rasterizer.polygonMode(VkPolygonMode.VK_POLYGON_MODE_FILL);
```

The polygonMode determines how fragments are generated for geometry. The following modes are available:

- `VK_POLYGON_MODE_FILL`: fill the area of the polygon with fragments
- `VK_POLYGON_MODE_LINE`: polygon edges are drawn as lines
- `VK_POLYGON_MODE_POINT`: polygon vertices are drawn as points

Using any mode other than fill requires enabling a GPU feature.

```java
rasterizer.lineWidth(1.0f);
```

The `lineWidth` member is straightforward, it describes the thickness of lines in terms of number of fragments. The maximum line width that is supported depends on the hardware and any line thicker than `1.0f` requires you to enable the `wideLines` GPU feature.

```java
rasterizer.cullMode(VkCullModeFlags.VK_CULL_MODE_BACK_BIT);
rasterizer.frontFace(VkFrontFace.VK_FRONT_FACE_CLOCKWISE);
```

The `cullMode` variable determines the type of face culling to use. You can disable culling, cull the front faces, cull the back faces or both. The `frontFace` variable specifies the vertex order for faces to be considered front-facing and can be clockwise or counterclockwise.

```java
rasterizer.depthBiasEnable(Constants.VK_FALSE);
rasterizer.depthBiasConstantFactor(0.0f); // optional
rasterizer.depthBiasClamp(0.0f); // optional
rasterizer.depthBiasSlopeFactor(0.0f); // optional
```

The rasterizer can alter the depth values by adding a constant value or biasing them based on a fragment's slope. This is sometimes used for shadow mapping, but we won't be using it. Just set `depthBiasEnable` to `VK_FALSE`.

## Multisampling

The `VkPipelineMultisampleStateCreateInfo` struct configures multisampling, which is one of the ways to perform [antialiasing](https://en.wikipedia.org/wiki/Multisample_anti-aliasing). It works by combining the fragment shader results of multiple polygons that rasterize to the same pixel. This mainly occurs along edges, which is also where the most noticeable aliasing artifacts occur. Because it doesn't need to run the fragment shader multiple times if only one polygon maps to a pixel, it is significantly less expensive than simply rendering to a higher resolution and then downscaling. Enabling it requires enabling a GPU feature.

```java
var multisampling = VkPipelineMultisampleStateCreateInfo.allocate(arena);
multisampling.sampleShadingEnable(Constants.VK_FALSE);
multisampling.rasterizationSamples(VkSampleCountFlags.VK_SAMPLE_COUNT_1_BIT);
multisampling.minSampleShading(1.0f); // Optional
multisampling.pSampleMask(null); // Optional
multisampling.alphaToCoverageEnable(Constants.VK_FALSE); // Optional
multisampling.alphaToOneEnable(Constants.VK_FALSE); // Optional
```

We'll revisit multisampling in later chapter, for now let's keep it disabled.

## Depth and stencil testing

If you are using a depth and/or stencil buffer, then you also need to configure the depth and stencil tests using `VkPipelineDepthStencilStateCreateInfo`. We don't have one right now, so we can simply pass a `null` instead of a pointer to such a struct. We'll get back to it in the depth buffering chapter.

## Color blending

After a fragment shader has returned a color, it needs to be combined with the color that is already in the framebuffer. This transformation is known as color blending and there are two ways to do it:

- Mix the old and new value to produce a final color
- Combine the old and new value using a bitwise operation

There are two types of structs to configure color blending. The first struct, `VkPipelineColorBlendAttachmentState` contains the configuration per attached framebuffer and the second struct, `VkPipelineColorBlendStateCreateInfo` contains the global color blending settings. In our case we only have one framebuffer:

```java
var colorBlendAttachment = VkPipelineColorBlendAttachmentState.allocate(arena);
colorBlendAttachment.colorWriteMask(
        VkColorComponentFlags.VK_COLOR_COMPONENT_R_BIT |
                VkColorComponentFlags.VK_COLOR_COMPONENT_G_BIT |
                VkColorComponentFlags.VK_COLOR_COMPONENT_B_BIT |
                VkColorComponentFlags.VK_COLOR_COMPONENT_A_BIT
);
colorBlendAttachment.blendEnable(Constants.VK_FALSE);
colorBlendAttachment.srcColorBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ONE); // Optional
colorBlendAttachment.dstColorBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ZERO); // Optional
colorBlendAttachment.colorBlendOp(VkBlendOp.VK_BLEND_OP_ADD); // Optional
colorBlendAttachment.srcAlphaBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ONE); // Optional
colorBlendAttachment.dstAlphaBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ZERO); // Optional
colorBlendAttachment.alphaBlendOp(VkBlendOp.VK_BLEND_OP_ADD); // Optional
```

This per-framebuffer struct allows you to configure the first way of color blending. The operations that will be performed are best demonstrated using the following pseudocode:

```c
if (blendEnable) {
    finalColor.rgb = (srcColorBlendFactor * newColor.rgb) <colorBlendOp> (dstColorBlendFactor * oldColor.rgb);
    finalColor.a = (srcAlphaBlendFactor * newColor.a) <alphaBlendOp> (dstAlphaBlendFactor * oldColor.a);
} else {
    finalColor = newColor;
}

finalColor = finalColor & colorWriteMask;
```

If `blendEnable` is set to `VK_FALSE`, then the new color from the fragment shader is passed through unmodified. Otherwise, the two mixing operations are performed to compute a new color. The resulting color is AND'd with the `colorWriteMask` to determine which channels are actually passed through.

The most common way to use color blending is to implement alpha blending, where we want the new color to be blended with the old color based on its opacity. The `finalColor` should then be computed as follows:

```c
finalColor.rgb = newAlpha * newColor + (1 - newAlpha) * oldColor;
finalColor.a = newAlpha.a;
```

This can be accomplished with the following parameters:

```java
colorBlendAttachment.blendEnable(Constants.VK_TRUE);
colorBlendAttachment.srcColorBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA);
colorBlendAttachment.dstColorBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA);
colorBlendAttachment.colorBlendOp(VkBlendOp.VK_BLEND_OP_ADD);
colorBlendAttachment.srcAlphaBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ONE);
colorBlendAttachment.dstAlphaBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ZERO);
colorBlendAttachment.alphaBlendOp(VkBlendOp.VK_BLEND_OP_ADD);
```

You can find all the possible operations in the `VkBlendFactor` and `VkBlendOp` enumerations in the specification.

The second structure references the array of structures for all the framebuffers and allows you to set blend constants that you can use as blend factors in the aforementioned calculations.

```java
var colorBlending = VkPipelineColorBlendStateCreateInfo.allocate(arena);
colorBlending.logicOpEnable(Constants.VK_FALSE);
colorBlending.logicOp(VkLogicOp.VK_LOGIC_OP_COPY); // Optional
colorBlending.attachmentCount(1);
colorBlending.pAttachments(colorBlendAttachment);
colorBlending.blendConstants().write(0, 0.0f); // Optional
colorBlending.blendConstants().write(1, 0.0f); // Optional
colorBlending.blendConstants().write(2, 0.0f); // Optional
colorBlending.blendConstants().write(3, 0.0f); // Optional
```

If you want to use the second method of blending (bitwise combination), then you should set `logicOpEnable` to `VK_TRUE`. The bitwise operation can then be specified in the `logicOp` field. Note that this will automatically disable the first method, as if you had set `blendEnable` to `VK_FALSE` for every attached framebuffer! The `colorWriteMask` will also be used in this mode to determine which channels in the framebuffer will actually be affected. It is also possible to disable both modes, as we've done here, in which case the fragment colors will be written to the framebuffer unmodified.

## Pipeline layout

You can use `uniform` values in shaders, which are globals similar to dynamic state variables that can be changed at drawing time to alter the behavior of your shaders without having to recreate them. They are commonly used to pass the transformation matrix to the vertex shader, or to create texture samplers in the fragment shader.

These uniform values need to be specified during pipeline creation by creating a `VkPipelineLayout` object. Even though we won't be using them until a future chapter, we are still required to create an empty pipeline layout.

Create a class member to hold this object, because we'll refer to it from other functions at a later point in time:

```java
private VkPipelineLayout pipelineLayout;
```

And then create the object in the `createGraphicsPipeline` function:

```java
var pipelineLayoutInfo = VkPipelineLayoutCreateInfo.allocate(arena);
pipelineLayoutInfo.setLayoutCount(0); // Optional
pipelineLayoutInfo.pSetLayouts(null); // Optional
pipelineLayoutInfo.pushConstantRangeCount(0); // Optional
pipelineLayoutInfo.pPushConstantRanges(null); // Optional

var pPipelineLayout = VkPipelineLayout.Buffer.allocate(arena);
var result = deviceCommands.vkCreatePipelineLayout(device, pipelineLayoutInfo, null, pPipelineLayout);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to create pipeline layout, vulkan error code: " + VkResult.explain(result));
}
pipelineLayout = pPipelineLayout.read();
```

The structure also specifies *push constants*, which are another way of passing dynamic values to shaders that we may get into in a future chapter. The pipeline layout will be referenced throughout the program's lifetime, so it should be destroyed at the end:

```java
private void cleanup() {
    deviceCommands.vkDestroyPipelineLayout(device, pipelineLayout, null);
    // ...
}
```

## Conclusion

That's it for all the fixed-function state! It's a lot of work to set all of this up from scratch, but the advantage is that we're now nearly fully aware of everything that is going on in the graphics pipeline! This reduces the chance of running into unexpected behavior because the default state of certain components is not what you expect.

There is however one more object to create before we can finally create the graphics pipeline and that is a [render pass](render-passes.md).

# Vulkan Memory Allocator

> [Java code](https://github.com/chuigda/vulkan4j/tree/master/packages/tutorial/src/main/java/tutorial/vulkan/part_ex/ch_ex1/Main.java)

> <span style="display: flex; justify-content: center; margin-bottom: 16px"><img src="../../images/i_have_no_idea_what_im_doing.jpg" width="256"></span>The previous chapters of this tutorial that are not marked by this disclaimer were directly adapted from <https://github.com/Overv/VulkanTutorial>.<br/><br/>This chapter and the following chapters are instead original creations from someone who is most decidedly not an expert in Vulkan. An authoritative tone has been maintained, but these chapters should be considered a "best effort" by someone still learning Vulkan.<br/><br/>If you have questions, suggestions, or corrections, please [open an issue](https://github.com/chuigda/vulkan4j/issues)!

## Introduction

So far our program manages memory for buffers and images manually. This is not a good idea in a real application. It is better to use a memory allocator library that will do this for us. There are several libraries available that can do this, but in this chapter we will use the Vulkan Memory Allocator library. This library is easy to use and has good performance.

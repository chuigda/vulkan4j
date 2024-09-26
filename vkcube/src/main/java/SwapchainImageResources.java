import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.handle.*;

import java.lang.foreign.MemorySegment;

public final class SwapchainImageResources {
    public VkImage image;
    public VkCommandBuffer cmd;
    public VkCommandBuffer graphicsToPresentCmd;
    public VkImageView view;
    public VkBuffer uniformBuffer;
    public VkDeviceMemory uniformMemory;
    public @pointer(comment = "void*") MemorySegment uniformMemoryPtr;
    public VkFramebuffer framebuffer;
    public VkDescriptorSet descriptorSet;
}

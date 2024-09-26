import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.handle.*;

import java.lang.foreign.MemorySegment;

public final class SwapchainImageResources {
    public VkImage image;
    public VkCommandBuffer cmd;
    public VkCommandBuffer graphics_to_present_cmd;
    public VkImageView view;
    public VkBuffer uniform_buffer;
    public VkDeviceMemory uniform_memory;
    public @pointer(comment = "void*") MemorySegment uniform_memory_ptr;
    public VkFramebuffer framebuffer;
    public VkDescriptorSet descriptorSet;
}

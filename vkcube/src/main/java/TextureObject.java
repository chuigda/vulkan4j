import tech.icey.vk4j.buffer.IntBuffer;
import tech.icey.vk4j.datatype.VkMemoryAllocateInfo;
import tech.icey.vk4j.enumtype.VkImageLayout;
import tech.icey.vk4j.handle.*;

public final class TextureObject {
    public VkSampler sampler;
    public VkImage image;
    public VkBuffer buffer;
    public VkImageLayout imageLayout;

    public VkMemoryAllocateInfo memAlloc;
    public VkDeviceMemory mem;
    public VkImageView view;
    public IntBuffer wh;
}

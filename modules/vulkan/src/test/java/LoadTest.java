import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.vulkan.command.VkEntryCommands;
import club.doki7.vulkan.command.VkStaticCommands;
import club.doki7.vulkan.command.VulkanLoader;

public class LoadTest {
    public static void main(String[] args) throws Exception {
        ISharedLibrary libVulkan = VulkanLoader.loadVulkanLibrary();
        VkStaticCommands staticCommands = VulkanLoader.loadStaticCommands(libVulkan);
        VkEntryCommands entryCommands = VulkanLoader.loadEntryCommands(staticCommands);
        libVulkan.close();
    }
}

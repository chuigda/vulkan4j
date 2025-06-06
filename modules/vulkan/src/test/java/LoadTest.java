import club.doki7.vulkan.command.VkEntryCommands;
import club.doki7.vulkan.command.VkStaticCommands;
import club.doki7.vulkan.command.VulkanLoader;

public class LoadTest {
    public static void main(String[] args) {
        VulkanLoader.loadVulkanLibrary();
        VkStaticCommands staticCommands = VulkanLoader.loadStaticCommands();
        VkEntryCommands entryCommands = VulkanLoader.loadEntryCommands(staticCommands);
    }
}

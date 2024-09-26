import tech.icey.vk4j.buffer.ByteBuffer;

import java.lang.foreign.Arena;

public final class NameConstants {
    public static final String validationLayerName = "VK_LAYER_KHRONOS_validation";
    public static final ByteBuffer validationLayerNameByteArray = ByteBuffer.allocateString(Arena.global(), validationLayerName);
    public static final String validationExtensionName = "VK_EXT_debug_utils";
    public static final ByteBuffer validationExtensionNameByteArray = ByteBuffer.allocateString(Arena.global(), validationExtensionName);
    public static final String swapchainExtensionName = "VK_KHR_swapchain";
    public static final ByteBuffer swapchainExtensionNameByteArray = ByteBuffer.allocateString(Arena.global(), swapchainExtensionName);
}

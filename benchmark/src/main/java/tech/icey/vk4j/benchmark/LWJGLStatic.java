package tech.icey.vk4j.benchmark;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkApplicationInfo;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkInstanceCreateInfo;

import static org.lwjgl.vulkan.VK10.VK_STRUCTURE_TYPE_APPLICATION_INFO;
import static org.lwjgl.vulkan.VK10.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO;
import static org.lwjgl.vulkan.VK13.VK_API_VERSION_1_3;

public class LWJGLStatic {
    private static final MemoryStack stack = MemoryStack.stackPush();

    public static final VkInstance instance;

    static {
        var applicationInfo = VkApplicationInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_APPLICATION_INFO)
                .pNext(0)
                .pApplicationName(stack.UTF8("vk4j benchmarking application"))
                .applicationVersion(0)
                .pEngineName(stack.UTF8("Tumansky R-15"))
                .engineVersion(0)
                .apiVersion(VK_API_VERSION_1_3);

        var instanceCreateInfo = VkInstanceCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO)
                .pNext(0)
                .pApplicationInfo(applicationInfo);

        PointerBuffer instanceBuf = stack.mallocPointer(1);
        if (0 != org.lwjgl.vulkan.VK10.vkCreateInstance(instanceCreateInfo, null, instanceBuf)) {
            throw new AssertionError("Failed to create VkInstance");
        }

        instance = new VkInstance(instanceBuf.get(0), instanceCreateInfo);
    }
}

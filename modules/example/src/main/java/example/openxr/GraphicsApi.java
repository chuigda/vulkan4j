package example.openxr;

import club.doki7.ffm.IPointer;
import club.doki7.ffm.annotation.NativeType;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.FloatPtr;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.openxr.datatype.XrGraphicsBindingVulkanKHR;
import club.doki7.openxr.datatype.XrGraphicsRequirementsVulkanKHR;
import club.doki7.openxr.enumtype.XrStructureType;
import club.doki7.vulkan.Version;
import club.doki7.vulkan.bitmask.VkQueueFlags;
import club.doki7.vulkan.command.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.VkResult;
import club.doki7.vulkan.enumtype.VkStructureType;
import club.doki7.vulkan.handle.VkDevice;
import club.doki7.vulkan.handle.VkInstance;
import club.doki7.vulkan.handle.VkPhysicalDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

import static example.openxr.OpenXR.OPENXR_CHECK;

public class GraphicsApi implements AutoCloseable {
    private final @NotNull Arena global;
    private final @NotNull OpenXRContext context;
    private final @NativeType("XrSystemId") long systemId;
    private final @NotNull VkStaticCommands vkStatic;
    private final @NotNull VkEntryCommands vkEntry;
    private final @NotNull VkInstanceCommands vkInstance;
    private final @NotNull VkDeviceCommands vkDevice;
    private final @NotNull VkInstance instance;
    private final @NotNull VkPhysicalDevice physicalDevice;
    private final @NotNull VkDevice device;

    private @Nullable XrGraphicsBindingVulkanKHR graphicsBinding;
    private int queueFamilyIndex = -1;
    private int queueIndex = -1;

    public static void VULKAN_CHECK(int code, @Nullable String errorMsg) {
        if (code != VkResult.SUCCESS) {
            throw new RuntimeException(VkResult.explain(code) +
                    (errorMsg == null
                            ? ""
                            : (": " + errorMsg)));
        }
    }

    public GraphicsApi(@NotNull ISharedLibrary libVulkan, @NotNull OpenXRContext context, @NativeType("XrSystemId") long systemId) {
        this.global = Arena.ofConfined();
        this.context = context;
        this.systemId = systemId;
        this.vkStatic = VulkanLoader.loadStaticCommands(libVulkan);
        this.vkEntry = VulkanLoader.loadEntryCommands(vkStatic);

        try (var local = Arena.ofConfined()) {
            var graphicsRequirements = XrGraphicsRequirementsVulkanKHR.allocate(local)
                    .type(XrStructureType.GRAPHICS_REQUIREMENTS_VULKAN_KHR);
            OPENXR_CHECK(
                    context.xr().getVulkanGraphicsRequirementsKHR(context.instance(), systemId, graphicsRequirements),
                    "Failed to get Graphics Requirements for Vulkan."
            );

            var minApiVersionSupported = Version.decode((int) graphicsRequirements.minApiVersionSupported());       // FIXME: i am not sure
            VkApplicationInfo ai = VkApplicationInfo.allocate(local)
                    .sType(VkStructureType.APPLICATION_INFO)
                    .pNext((IPointer) null)
                    .pApplicationName(BytePtr.allocateString(local, "OpenXR Tutorial - Vulkan"))
                    .applicationVersion(1)
                    .pEngineName(BytePtr.allocateString(local, "OpenXR Tutorial - Vulkan Engine"))
                    .engineVersion(1)
                    .apiVersion(new Version(0, minApiVersionSupported.major(), minApiVersionSupported.minor(), 0).encode());

            // no extension for now

            // region create instance
            VkInstanceCreateInfo instanceCI = VkInstanceCreateInfo.allocate(local)
                    .sType(VkStructureType.INSTANCE_CREATE_INFO)
                    .pNext((IPointer) null)
                    .flags(0)
                    .pApplicationInfo(ai);

            var pInstance = VkInstance.Ptr.allocate(local);
            VULKAN_CHECK(vkEntry.createInstance(instanceCI, null, pInstance), "Failed to create Vulkan Instance.");
            this.instance = Objects.requireNonNull(pInstance.read());
            this.vkInstance = VulkanLoader.loadInstanceCommands(instance, vkStatic);
            // endregion create instance

            // region create device
            var pPhysicalDeviceCount = IntPtr.allocate(local);
            VULKAN_CHECK(
                    vkInstance.enumeratePhysicalDevices(instance, pPhysicalDeviceCount, null),
                    "Failed to enumerate PhysicalDevices."
            );
            var physicalDeviceCount = pPhysicalDeviceCount.read();
            var pPhysicalDevices = VkPhysicalDevice.Ptr.allocate(local, physicalDeviceCount);
            VULKAN_CHECK(
                    vkInstance.enumeratePhysicalDevices(instance, pPhysicalDeviceCount, pPhysicalDevices),
                    "Failed to enumerate PhysicalDevices."
            );

            // is it possible that physicalDeviceCount == 0

            physicalDevice = Objects.requireNonNull(pPhysicalDevices.read());
//            var physicalDeviceFromXR = VkPhysicalDevice.Ptr.allocate(local);
//            OPENXR_CHECK(
//                    context.xr().getVulkanGraphicsDeviceKHR(context.instance(), systemId, instance, physicalDeviceFromXR),
//                    "Failed to get Graphics Device from Vulkan"
//            );
//
//            VkPhysicalDevice maybePhysicalDevice = null;
//            for (var i = 0; i < physicalDeviceCount; ++ i) {
//                var pPhysicalDevice = pPhysicalDevices.offset(i);
//                if (pPhysicalDevice.equals(physicalDeviceFromXR)) {
//                    maybePhysicalDevice = Objects.requireNonNull(physicalDeviceFromXR.read());
//                    break;
//                }
//            }
//
//            if (maybePhysicalDevice == null) {
//                System.err.println("ERROR: Vulkan: Failed to find PhysicalDevice for OpenXR.");
//                maybePhysicalDevice = Objects.requireNonNull(pPhysicalDevices.read());
//            }
//
//            this.physicalDevice = maybePhysicalDevice;

            var pQueueFamilyPropertiesCount = IntPtr.allocate(local);
            vkInstance.getPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyPropertiesCount, null);
            var queueFamilyPropertiesCount = pQueueFamilyPropertiesCount.read();
            var pQueueFamilyProperties = VkQueueFamilyProperties.allocate(local, queueFamilyPropertiesCount);
            vkInstance.getPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyPropertiesCount, pQueueFamilyProperties);

            var pDeviceQueueCIs = VkDeviceQueueCreateInfo.allocate(local, queueFamilyPropertiesCount);
            for (var i = 0; i < queueFamilyPropertiesCount; ++i) {
                var property = pQueueFamilyProperties.at(i);
                var queueCount = property.queueCount();
                var queuePriorities = new float[queueCount];
                Arrays.fill(queuePriorities, 1.0F);
                pDeviceQueueCIs.at(i)
                        .queueFamilyIndex(i)
                        .queueCount(queueCount)
                        .pQueuePriorities(FloatPtr.allocate(local, queuePriorities));

                if (queueFamilyIndex == -1 && queueIndex == -1 && (property.queueFlags() & VkQueueFlags.GRAPHICS) == VkQueueFlags.GRAPHICS) {
                    queueFamilyIndex = i;
                    queueIndex = 0;
                }
            }

            var pPhysicalDeviceFeatures = VkPhysicalDeviceFeatures.allocate(local);
            vkInstance.getPhysicalDeviceFeatures(physicalDevice, pPhysicalDeviceFeatures);

            var deviceCI = VkDeviceCreateInfo.allocate(local)
                    .queueCreateInfoCount(queueFamilyPropertiesCount)
                    .pQueueCreateInfos(pDeviceQueueCIs)
                    .pEnabledFeatures(pPhysicalDeviceFeatures);

            var pDevice = VkDevice.Ptr.allocate(local);
            VULKAN_CHECK(
                    vkInstance.createDevice(physicalDevice, deviceCI, null, pDevice),
                    "Failed to create Device."
            );

            this.device = Objects.requireNonNull(pDevice.read());
            this.vkDevice = VulkanLoader.loadDeviceCommands(device, vkStatic);

            // endregion create device
        }
    }

    private @NotNull VkInstance instance() {
        return Objects.requireNonNull(instance);
    }

    public @NotNull XrGraphicsBindingVulkanKHR getGraphicsBinding() {
        this.graphicsBinding = XrGraphicsBindingVulkanKHR.allocate(global)
                .type(XrStructureType.GRAPHICS_BINDING_VULKAN_KHR)
                .instance(instance())
                .physicalDevice(Objects.requireNonNull(physicalDevice))
                .device(Objects.requireNonNull(device))
                .queueFamilyIndex(queueFamilyIndex)
                .queueIndex(queueIndex);

        return this.graphicsBinding;
    }

    @Override
    public void close() {
        vkDevice.destroyDevice(device, null);
        vkInstance.destroyInstance(instance, null);
    }
}

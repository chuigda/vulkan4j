package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSwapchainCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("surface"),
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("imageFormat"),
        ValueLayout.JAVA_INT.withName("imageColorSpace"),
        VkExtent2D.LAYOUT.withName("imageExtent"),
        ValueLayout.JAVA_INT.withName("imageArrayLayers"),
        ValueLayout.JAVA_INT.withName("imageUsage"),
        ValueLayout.JAVA_INT.withName("imageSharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pQueueFamilyIndices"),
        ValueLayout.JAVA_INT.withName("preTransform"),
        ValueLayout.JAVA_INT.withName("compositeAlpha"),
        ValueLayout.JAVA_INT.withName("presentMode"),
        ValueLayout.JAVA_INT.withName("clipped"),
        ValueLayout.ADDRESS.withName("oldSwapchain")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$surface = PathElement.groupElement("surface");
    public static final PathElement PATH$minImageCount = PathElement.groupElement("minImageCount");
    public static final PathElement PATH$imageFormat = PathElement.groupElement("imageFormat");
    public static final PathElement PATH$imageColorSpace = PathElement.groupElement("imageColorSpace");
    public static final PathElement PATH$imageExtent = PathElement.groupElement("imageExtent");
    public static final PathElement PATH$imageArrayLayers = PathElement.groupElement("imageArrayLayers");
    public static final PathElement PATH$imageUsage = PathElement.groupElement("imageUsage");
    public static final PathElement PATH$imageSharingMode = PathElement.groupElement("imageSharingMode");
    public static final PathElement PATH$queueFamilyIndexCount = PathElement.groupElement("queueFamilyIndexCount");
    public static final PathElement PATH$pQueueFamilyIndices = PathElement.groupElement("pQueueFamilyIndices");
    public static final PathElement PATH$preTransform = PathElement.groupElement("preTransform");
    public static final PathElement PATH$compositeAlpha = PathElement.groupElement("compositeAlpha");
    public static final PathElement PATH$presentMode = PathElement.groupElement("presentMode");
    public static final PathElement PATH$clipped = PathElement.groupElement("clipped");
    public static final PathElement PATH$oldSwapchain = PathElement.groupElement("oldSwapchain");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$surface = (AddressLayout) LAYOUT.select(PATH$surface);
    public static final OfInt LAYOUT$minImageCount = (OfInt) LAYOUT.select(PATH$minImageCount);
    public static final OfInt LAYOUT$imageFormat = (OfInt) LAYOUT.select(PATH$imageFormat);
    public static final OfInt LAYOUT$imageColorSpace = (OfInt) LAYOUT.select(PATH$imageColorSpace);
    public static final StructLayout LAYOUT$imageExtent = (StructLayout) LAYOUT.select(PATH$imageExtent);
    public static final OfInt LAYOUT$imageArrayLayers = (OfInt) LAYOUT.select(PATH$imageArrayLayers);
    public static final OfInt LAYOUT$imageUsage = (OfInt) LAYOUT.select(PATH$imageUsage);
    public static final OfInt LAYOUT$imageSharingMode = (OfInt) LAYOUT.select(PATH$imageSharingMode);
    public static final OfInt LAYOUT$queueFamilyIndexCount = (OfInt) LAYOUT.select(PATH$queueFamilyIndexCount);
    public static final AddressLayout LAYOUT$pQueueFamilyIndices = (AddressLayout) LAYOUT.select(PATH$pQueueFamilyIndices);
    public static final OfInt LAYOUT$preTransform = (OfInt) LAYOUT.select(PATH$preTransform);
    public static final OfInt LAYOUT$compositeAlpha = (OfInt) LAYOUT.select(PATH$compositeAlpha);
    public static final OfInt LAYOUT$presentMode = (OfInt) LAYOUT.select(PATH$presentMode);
    public static final OfInt LAYOUT$clipped = (OfInt) LAYOUT.select(PATH$clipped);
    public static final AddressLayout LAYOUT$oldSwapchain = (AddressLayout) LAYOUT.select(PATH$oldSwapchain);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$surface = LAYOUT.byteOffset(PATH$surface);
    public static final long OFFSET$minImageCount = LAYOUT.byteOffset(PATH$minImageCount);
    public static final long OFFSET$imageFormat = LAYOUT.byteOffset(PATH$imageFormat);
    public static final long OFFSET$imageColorSpace = LAYOUT.byteOffset(PATH$imageColorSpace);
    public static final long OFFSET$imageExtent = LAYOUT.byteOffset(PATH$imageExtent);
    public static final long OFFSET$imageArrayLayers = LAYOUT.byteOffset(PATH$imageArrayLayers);
    public static final long OFFSET$imageUsage = LAYOUT.byteOffset(PATH$imageUsage);
    public static final long OFFSET$imageSharingMode = LAYOUT.byteOffset(PATH$imageSharingMode);
    public static final long OFFSET$queueFamilyIndexCount = LAYOUT.byteOffset(PATH$queueFamilyIndexCount);
    public static final long OFFSET$pQueueFamilyIndices = LAYOUT.byteOffset(PATH$pQueueFamilyIndices);
    public static final long OFFSET$preTransform = LAYOUT.byteOffset(PATH$preTransform);
    public static final long OFFSET$compositeAlpha = LAYOUT.byteOffset(PATH$compositeAlpha);
    public static final long OFFSET$presentMode = LAYOUT.byteOffset(PATH$presentMode);
    public static final long OFFSET$clipped = LAYOUT.byteOffset(PATH$clipped);
    public static final long OFFSET$oldSwapchain = LAYOUT.byteOffset(PATH$oldSwapchain);

    public VkSwapchainCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public @enumtype(VkSwapchainCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSwapchainCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public VkSurfaceKHR surface() {
        return new VkSurfaceKHR(segment.asSlice(OFFSET$surface, LAYOUT$surface));
    }

    public void surface(VkSurfaceKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$surface, LAYOUT$surface.byteSize());
    }

    public @unsigned int minImageCount() {
        return segment.get(LAYOUT$minImageCount, OFFSET$minImageCount);
    }

    public void minImageCount(@unsigned int value) {
        segment.set(LAYOUT$minImageCount, OFFSET$minImageCount, value);
    }

    public @enumtype(VkFormat.class) int imageFormat() {
        return segment.get(LAYOUT$imageFormat, OFFSET$imageFormat);
    }

    public void imageFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$imageFormat, OFFSET$imageFormat, value);
    }

    public @enumtype(VkColorSpaceKHR.class) int imageColorSpace() {
        return segment.get(LAYOUT$imageColorSpace, OFFSET$imageColorSpace);
    }

    public void imageColorSpace(@enumtype(VkColorSpaceKHR.class) int value) {
        segment.set(LAYOUT$imageColorSpace, OFFSET$imageColorSpace, value);
    }

    public VkExtent2D imageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));
    }

    public void imageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageExtent, LAYOUT$imageExtent.byteSize());
    }

    public @unsigned int imageArrayLayers() {
        return segment.get(LAYOUT$imageArrayLayers, OFFSET$imageArrayLayers);
    }

    public void imageArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$imageArrayLayers, OFFSET$imageArrayLayers, value);
    }

    public @enumtype(VkImageUsageFlags.class) int imageUsage() {
        return segment.get(LAYOUT$imageUsage, OFFSET$imageUsage);
    }

    public void imageUsage(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$imageUsage, OFFSET$imageUsage, value);
    }

    public @enumtype(VkSharingMode.class) int imageSharingMode() {
        return segment.get(LAYOUT$imageSharingMode, OFFSET$imageSharingMode);
    }

    public void imageSharingMode(@enumtype(VkSharingMode.class) int value) {
        segment.set(LAYOUT$imageSharingMode, OFFSET$imageSharingMode, value);
    }

    public @unsigned int queueFamilyIndexCount() {
        return segment.get(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount);
    }

    public void queueFamilyIndexCount(@unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pQueueFamilyIndicesRaw() {
        return segment.get(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices);
    }

    public void pQueueFamilyIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices, value);
    }
    
    public @unsigned IntPtr pQueueFamilyIndices() {
        return new IntPtr(pQueueFamilyIndicesRaw());
    }

    public void pQueueFamilyIndices(@unsigned IntPtr value) {
        pQueueFamilyIndicesRaw(value.segment());
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int preTransform() {
        return segment.get(LAYOUT$preTransform, OFFSET$preTransform);
    }

    public void preTransform(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$preTransform, OFFSET$preTransform, value);
    }

    public @enumtype(VkCompositeAlphaFlagsKHR.class) int compositeAlpha() {
        return segment.get(LAYOUT$compositeAlpha, OFFSET$compositeAlpha);
    }

    public void compositeAlpha(@enumtype(VkCompositeAlphaFlagsKHR.class) int value) {
        segment.set(LAYOUT$compositeAlpha, OFFSET$compositeAlpha, value);
    }

    public @enumtype(VkPresentModeKHR.class) int presentMode() {
        return segment.get(LAYOUT$presentMode, OFFSET$presentMode);
    }

    public void presentMode(@enumtype(VkPresentModeKHR.class) int value) {
        segment.set(LAYOUT$presentMode, OFFSET$presentMode, value);
    }

    public @unsigned int clipped() {
        return segment.get(LAYOUT$clipped, OFFSET$clipped);
    }

    public void clipped(@unsigned int value) {
        segment.set(LAYOUT$clipped, OFFSET$clipped, value);
    }

    public VkSwapchainKHR oldSwapchain() {
        return new VkSwapchainKHR(segment.asSlice(OFFSET$oldSwapchain, LAYOUT$oldSwapchain));
    }

    public void oldSwapchain(VkSwapchainKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$oldSwapchain, LAYOUT$oldSwapchain.byteSize());
    }


    public static final class VkSwapchainCreateInfoKHRFactory implements IFactory<VkSwapchainCreateInfoKHR> {
        @Override
        public Class<VkSwapchainCreateInfoKHR> clazz() {
            return VkSwapchainCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSwapchainCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkSwapchainCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSwapchainCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkSwapchainCreateInfoKHR(segment);
        }
    }

    public static final VkSwapchainCreateInfoKHRFactory FACTORY = new VkSwapchainCreateInfoKHRFactory();
}

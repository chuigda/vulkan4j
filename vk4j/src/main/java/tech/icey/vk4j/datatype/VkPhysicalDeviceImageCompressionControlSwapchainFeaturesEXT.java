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

public record VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionControlSwapchain")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageCompressionControlSwapchain = PathElement.groupElement("imageCompressionControlSwapchain");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$imageCompressionControlSwapchain = (OfInt) LAYOUT.select(PATH$imageCompressionControlSwapchain);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageCompressionControlSwapchain = LAYOUT.byteOffset(PATH$imageCompressionControlSwapchain);

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT);
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

    public @unsigned int imageCompressionControlSwapchain() {
        return segment.get(LAYOUT$imageCompressionControlSwapchain, OFFSET$imageCompressionControlSwapchain);
    }

    public void imageCompressionControlSwapchain(@unsigned int value) {
        segment.set(LAYOUT$imageCompressionControlSwapchain, OFFSET$imageCompressionControlSwapchain, value);
    }


    public static final class VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXTFactory implements IFactory<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> clazz() {
            return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXTFactory FACTORY = new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXTFactory();
}
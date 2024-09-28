package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMaintenance6PropertiesKHR.html">VkPhysicalDeviceMaintenance6PropertiesKHR</a>
public record VkPhysicalDeviceMaintenance6PropertiesKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
        ValueLayout.JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateClampCombinerInputs")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$blockTexelViewCompatibleMultipleLayers = PathElement.groupElement("blockTexelViewCompatibleMultipleLayers");
    public static final PathElement PATH$maxCombinedImageSamplerDescriptorCount = PathElement.groupElement("maxCombinedImageSamplerDescriptorCount");
    public static final PathElement PATH$fragmentShadingRateClampCombinerInputs = PathElement.groupElement("fragmentShadingRateClampCombinerInputs");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$blockTexelViewCompatibleMultipleLayers = (OfInt) LAYOUT.select(PATH$blockTexelViewCompatibleMultipleLayers);
    public static final OfInt LAYOUT$maxCombinedImageSamplerDescriptorCount = (OfInt) LAYOUT.select(PATH$maxCombinedImageSamplerDescriptorCount);
    public static final OfInt LAYOUT$fragmentShadingRateClampCombinerInputs = (OfInt) LAYOUT.select(PATH$fragmentShadingRateClampCombinerInputs);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$blockTexelViewCompatibleMultipleLayers = LAYOUT.byteOffset(PATH$blockTexelViewCompatibleMultipleLayers);
    public static final long OFFSET$maxCombinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PATH$maxCombinedImageSamplerDescriptorCount);
    public static final long OFFSET$fragmentShadingRateClampCombinerInputs = LAYOUT.byteOffset(PATH$fragmentShadingRateClampCombinerInputs);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$blockTexelViewCompatibleMultipleLayers = LAYOUT$blockTexelViewCompatibleMultipleLayers.byteSize();
    public static final long SIZE$maxCombinedImageSamplerDescriptorCount = LAYOUT$maxCombinedImageSamplerDescriptorCount.byteSize();
    public static final long SIZE$fragmentShadingRateClampCombinerInputs = LAYOUT$fragmentShadingRateClampCombinerInputs.byteSize();

    public VkPhysicalDeviceMaintenance6PropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int blockTexelViewCompatibleMultipleLayers() {
        return segment.get(LAYOUT$blockTexelViewCompatibleMultipleLayers, OFFSET$blockTexelViewCompatibleMultipleLayers);
    }

    public void blockTexelViewCompatibleMultipleLayers(@unsigned int value) {
        segment.set(LAYOUT$blockTexelViewCompatibleMultipleLayers, OFFSET$blockTexelViewCompatibleMultipleLayers, value);
    }

    public @unsigned int maxCombinedImageSamplerDescriptorCount() {
        return segment.get(LAYOUT$maxCombinedImageSamplerDescriptorCount, OFFSET$maxCombinedImageSamplerDescriptorCount);
    }

    public void maxCombinedImageSamplerDescriptorCount(@unsigned int value) {
        segment.set(LAYOUT$maxCombinedImageSamplerDescriptorCount, OFFSET$maxCombinedImageSamplerDescriptorCount, value);
    }

    public @unsigned int fragmentShadingRateClampCombinerInputs() {
        return segment.get(LAYOUT$fragmentShadingRateClampCombinerInputs, OFFSET$fragmentShadingRateClampCombinerInputs);
    }

    public void fragmentShadingRateClampCombinerInputs(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateClampCombinerInputs, OFFSET$fragmentShadingRateClampCombinerInputs, value);
    }

    public static VkPhysicalDeviceMaintenance6PropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMaintenance6PropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMaintenance6PropertiesKHR[] ret = new VkPhysicalDeviceMaintenance6PropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMaintenance6PropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

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

public record VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("minFragmentDensityTexelSize"),
        VkExtent2D.LAYOUT.withName("maxFragmentDensityTexelSize"),
        ValueLayout.JAVA_INT.withName("fragmentDensityInvocations")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$minFragmentDensityTexelSize = PathElement.groupElement("minFragmentDensityTexelSize");
    public static final PathElement PATH$maxFragmentDensityTexelSize = PathElement.groupElement("maxFragmentDensityTexelSize");
    public static final PathElement PATH$fragmentDensityInvocations = PathElement.groupElement("fragmentDensityInvocations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$minFragmentDensityTexelSize = (StructLayout) LAYOUT.select(PATH$minFragmentDensityTexelSize);
    public static final StructLayout LAYOUT$maxFragmentDensityTexelSize = (StructLayout) LAYOUT.select(PATH$maxFragmentDensityTexelSize);
    public static final OfInt LAYOUT$fragmentDensityInvocations = (OfInt) LAYOUT.select(PATH$fragmentDensityInvocations);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minFragmentDensityTexelSize = LAYOUT.byteOffset(PATH$minFragmentDensityTexelSize);
    public static final long OFFSET$maxFragmentDensityTexelSize = LAYOUT.byteOffset(PATH$maxFragmentDensityTexelSize);
    public static final long OFFSET$fragmentDensityInvocations = LAYOUT.byteOffset(PATH$fragmentDensityInvocations);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minFragmentDensityTexelSize = LAYOUT$minFragmentDensityTexelSize.byteSize();
    public static final long SIZE$maxFragmentDensityTexelSize = LAYOUT$maxFragmentDensityTexelSize.byteSize();
    public static final long SIZE$fragmentDensityInvocations = LAYOUT$fragmentDensityInvocations.byteSize();

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT);
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

    public VkExtent2D minFragmentDensityTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$minFragmentDensityTexelSize, LAYOUT$minFragmentDensityTexelSize));
    }

    public void minFragmentDensityTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minFragmentDensityTexelSize, SIZE$minFragmentDensityTexelSize);
    }

    public VkExtent2D maxFragmentDensityTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxFragmentDensityTexelSize, LAYOUT$maxFragmentDensityTexelSize));
    }

    public void maxFragmentDensityTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFragmentDensityTexelSize, SIZE$maxFragmentDensityTexelSize);
    }

    public @unsigned int fragmentDensityInvocations() {
        return segment.get(LAYOUT$fragmentDensityInvocations, OFFSET$fragmentDensityInvocations);
    }

    public void fragmentDensityInvocations(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityInvocations, OFFSET$fragmentDensityInvocations, value);
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] ret = new VkPhysicalDeviceFragmentDensityMapPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

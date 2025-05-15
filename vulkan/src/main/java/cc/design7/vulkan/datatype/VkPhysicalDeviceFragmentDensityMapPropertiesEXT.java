package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkPhysicalDeviceFragmentDensityMapPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$minFragmentDensityTexelSize = VkExtent2D.LAYOUT.withName("minFragmentDensityTexelSize");
    public static final StructLayout LAYOUT$maxFragmentDensityTexelSize = VkExtent2D.LAYOUT.withName("maxFragmentDensityTexelSize");
    public static final OfInt LAYOUT$fragmentDensityInvocations = ValueLayout.JAVA_INT.withName("fragmentDensityInvocations");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$minFragmentDensityTexelSize, LAYOUT$maxFragmentDensityTexelSize, LAYOUT$fragmentDensityInvocations);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] ret = new VkPhysicalDeviceFragmentDensityMapPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT clone(Arena arena, VkPhysicalDeviceFragmentDensityMapPropertiesEXT src) {
        VkPhysicalDeviceFragmentDensityMapPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] src) {
        VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$minFragmentDensityTexelSize = PathElement.groupElement("PATH$minFragmentDensityTexelSize");
    public static final PathElement PATH$maxFragmentDensityTexelSize = PathElement.groupElement("PATH$maxFragmentDensityTexelSize");
    public static final PathElement PATH$fragmentDensityInvocations = PathElement.groupElement("PATH$fragmentDensityInvocations");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minFragmentDensityTexelSize = LAYOUT$minFragmentDensityTexelSize.byteSize();
    public static final long SIZE$maxFragmentDensityTexelSize = LAYOUT$maxFragmentDensityTexelSize.byteSize();
    public static final long SIZE$fragmentDensityInvocations = LAYOUT$fragmentDensityInvocations.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minFragmentDensityTexelSize = LAYOUT.byteOffset(PATH$minFragmentDensityTexelSize);
    public static final long OFFSET$maxFragmentDensityTexelSize = LAYOUT.byteOffset(PATH$maxFragmentDensityTexelSize);
    public static final long OFFSET$fragmentDensityInvocations = LAYOUT.byteOffset(PATH$fragmentDensityInvocations);

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

}
/// dummy, not implemented yet

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

public record VkDeviceFaultCountsEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$addressInfoCount = ValueLayout.JAVA_INT.withName("addressInfoCount");
    public static final OfInt LAYOUT$vendorInfoCount = ValueLayout.JAVA_INT.withName("vendorInfoCount");
    public static final OfLong LAYOUT$vendorBinarySize = ValueLayout.JAVA_LONG.withName("vendorBinarySize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$addressInfoCount, LAYOUT$vendorInfoCount, LAYOUT$vendorBinarySize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceFaultCountsEXT allocate(Arena arena) {
        return new VkDeviceFaultCountsEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceFaultCountsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultCountsEXT[] ret = new VkDeviceFaultCountsEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceFaultCountsEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceFaultCountsEXT clone(Arena arena, VkDeviceFaultCountsEXT src) {
        VkDeviceFaultCountsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceFaultCountsEXT[] clone(Arena arena, VkDeviceFaultCountsEXT[] src) {
        VkDeviceFaultCountsEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$addressInfoCount = PathElement.groupElement("PATH$addressInfoCount");
    public static final PathElement PATH$vendorInfoCount = PathElement.groupElement("PATH$vendorInfoCount");
    public static final PathElement PATH$vendorBinarySize = PathElement.groupElement("PATH$vendorBinarySize");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$addressInfoCount = LAYOUT$addressInfoCount.byteSize();
    public static final long SIZE$vendorInfoCount = LAYOUT$vendorInfoCount.byteSize();
    public static final long SIZE$vendorBinarySize = LAYOUT$vendorBinarySize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$addressInfoCount = LAYOUT.byteOffset(PATH$addressInfoCount);
    public static final long OFFSET$vendorInfoCount = LAYOUT.byteOffset(PATH$vendorInfoCount);
    public static final long OFFSET$vendorBinarySize = LAYOUT.byteOffset(PATH$vendorBinarySize);

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

    public @unsigned int addressInfoCount() {
        return segment.get(LAYOUT$addressInfoCount, OFFSET$addressInfoCount);
    }

    public void addressInfoCount(@unsigned int value) {
        segment.set(LAYOUT$addressInfoCount, OFFSET$addressInfoCount, value);
    }

    public @unsigned int vendorInfoCount() {
        return segment.get(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount);
    }

    public void vendorInfoCount(@unsigned int value) {
        segment.set(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount, value);
    }

    public @unsigned long vendorBinarySize() {
        return segment.get(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize);
    }

    public void vendorBinarySize(@unsigned long value) {
        segment.set(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize, value);
    }

}
/// dummy, not implemented yet

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

public record VkClusterAccelerationStructureMoveObjectsInputNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final OfInt LAYOUT$noMoveOverlap = ValueLayout.JAVA_INT.withName("noMoveOverlap");
    public static final OfLong LAYOUT$maxMovedBytes = ValueLayout.JAVA_LONG.withName("maxMovedBytes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$type, LAYOUT$noMoveOverlap, LAYOUT$maxMovedBytes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkClusterAccelerationStructureMoveObjectsInputNV allocate(Arena arena) {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(arena.allocate(LAYOUT));
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureMoveObjectsInputNV[] ret = new VkClusterAccelerationStructureMoveObjectsInputNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureMoveObjectsInputNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV clone(Arena arena, VkClusterAccelerationStructureMoveObjectsInputNV src) {
        VkClusterAccelerationStructureMoveObjectsInputNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV[] clone(Arena arena, VkClusterAccelerationStructureMoveObjectsInputNV[] src) {
        VkClusterAccelerationStructureMoveObjectsInputNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$noMoveOverlap = PathElement.groupElement("PATH$noMoveOverlap");
    public static final PathElement PATH$maxMovedBytes = PathElement.groupElement("PATH$maxMovedBytes");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$noMoveOverlap = LAYOUT$noMoveOverlap.byteSize();
    public static final long SIZE$maxMovedBytes = LAYOUT$maxMovedBytes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$noMoveOverlap = LAYOUT.byteOffset(PATH$noMoveOverlap);
    public static final long OFFSET$maxMovedBytes = LAYOUT.byteOffset(PATH$maxMovedBytes);

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

    public @enumtype(VkClusterAccelerationStructureTypeNV.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkClusterAccelerationStructureTypeNV.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int noMoveOverlap() {
        return segment.get(LAYOUT$noMoveOverlap, OFFSET$noMoveOverlap);
    }

    public void noMoveOverlap(@unsigned int value) {
        segment.set(LAYOUT$noMoveOverlap, OFFSET$noMoveOverlap, value);
    }

    public @unsigned long maxMovedBytes() {
        return segment.get(LAYOUT$maxMovedBytes, OFFSET$maxMovedBytes);
    }

    public void maxMovedBytes(@unsigned long value) {
        segment.set(LAYOUT$maxMovedBytes, OFFSET$maxMovedBytes, value);
    }

}
/// dummy, not implemented yet

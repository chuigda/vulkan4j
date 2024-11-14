package tech.icey.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vma.bitmask.*;
import tech.icey.vma.datatype.*;
import tech.icey.vma.enumtype.*;
import tech.icey.vma.handle.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

public record VmaDefragmentationMove(MemorySegment segment) implements IPointer {
    public @enumtype(VmaDefragmentationMoveOperation.class) int operation() {
        return segment.get(LAYOUT$operation, OFFSET$operation);
    }

    public void operation(@enumtype(VmaDefragmentationMoveOperation.class) int value) {
        segment.set(LAYOUT$operation, OFFSET$operation, value);
    }

    public @nullable VmaAllocation srcAllocation() {
        MemorySegment s = segment.asSlice(OFFSET$srcAllocation, SIZE$srcAllocation);
        if (s.address() == 0) {
            return null;
        }
        return new VmaAllocation(s);
    }

    public void srcAllocation(@nullable VmaAllocation value) {
        segment.set(
            LAYOUT$srcAllocation,
            OFFSET$srcAllocation,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @nullable VmaAllocation dstTmpAllocation() {
        MemorySegment s = segment.asSlice(OFFSET$dstTmpAllocation, SIZE$dstTmpAllocation);
        if (s.address() == 0) {
            return null;
        }
        return new VmaAllocation(s);
    }

    public void dstTmpAllocation(@nullable VmaAllocation value) {
        segment.set(
            LAYOUT$dstTmpAllocation,
            OFFSET$dstTmpAllocation,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VmaDefragmentationMove allocate(Arena arena) {
        return new VmaDefragmentationMove(arena.allocate(LAYOUT));
    }

    public static VmaDefragmentationMove[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaDefragmentationMove[] ret = new VmaDefragmentationMove[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaDefragmentationMove(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaDefragmentationMove clone(Arena arena, VmaDefragmentationMove src) {
        VmaDefragmentationMove ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaDefragmentationMove[] clone(Arena arena, VmaDefragmentationMove[] src) {
        VmaDefragmentationMove[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("operation"),
        ValueLayout.ADDRESS.withName("srcAllocation"),
        ValueLayout.ADDRESS.withName("dstTmpAllocation")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$operation = PathElement.groupElement("operation");
    public static final PathElement PATH$srcAllocation = PathElement.groupElement("srcAllocation");
    public static final PathElement PATH$dstTmpAllocation = PathElement.groupElement("dstTmpAllocation");

    public static final OfInt LAYOUT$operation = (OfInt) LAYOUT.select(PATH$operation);
    public static final AddressLayout LAYOUT$srcAllocation = (AddressLayout) LAYOUT.select(PATH$srcAllocation);
    public static final AddressLayout LAYOUT$dstTmpAllocation = (AddressLayout) LAYOUT.select(PATH$dstTmpAllocation);

    public static final long OFFSET$operation = LAYOUT.byteOffset(PATH$operation);
    public static final long OFFSET$srcAllocation = LAYOUT.byteOffset(PATH$srcAllocation);
    public static final long OFFSET$dstTmpAllocation = LAYOUT.byteOffset(PATH$dstTmpAllocation);

    public static final long SIZE$operation = LAYOUT$operation.byteSize();
    public static final long SIZE$srcAllocation = LAYOUT$srcAllocation.byteSize();
    public static final long SIZE$dstTmpAllocation = LAYOUT$dstTmpAllocation.byteSize();
}


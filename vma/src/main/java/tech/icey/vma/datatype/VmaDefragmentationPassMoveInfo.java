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
import tech.icey.vk4j.handle.*;

public record VmaDefragmentationPassMoveInfo(MemorySegment segment) implements IPointer {
    public @unsigned int moveCount() {
        return segment.get(LAYOUT$moveCount, OFFSET$moveCount);
    }

    public void moveCount(@unsigned int value) {
        segment.set(LAYOUT$moveCount, OFFSET$moveCount, value);
    }

    public @pointer(comment="VmaDefragmentationMove*") MemorySegment pMovesRaw() {
        return segment.get(LAYOUT$pMoves, OFFSET$pMoves);
    }

    public void pMovesRaw(@pointer(comment="VmaDefragmentationMove*") MemorySegment value) {
        segment.set(LAYOUT$pMoves, OFFSET$pMoves, value);
    }

    public @nullable VmaDefragmentationMove pMoves() {
        MemorySegment s = pMovesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VmaDefragmentationMove(s);
    }

    /// Note: this function is {@link unsafe} because it's up to caller to provide the correct count of elements.
    @unsafe
    public @nullable VmaDefragmentationMove[] pMoves(int assumedCount) {
        MemorySegment s = pMovesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VmaDefragmentationMove.SIZE);
        VmaDefragmentationMove[] ret = new VmaDefragmentationMove[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            ret[i] = new VmaDefragmentationMove(s.asSlice(i * VmaDefragmentationMove.SIZE, VmaDefragmentationMove.SIZE));
        }
        return ret;
    }

    public void pMoves(@nullable VmaDefragmentationMove value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMovesRaw(s);
    }

    public static VmaDefragmentationPassMoveInfo allocate(Arena arena) {
        return new VmaDefragmentationPassMoveInfo(arena.allocate(LAYOUT));
    }

    public static VmaDefragmentationPassMoveInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaDefragmentationPassMoveInfo[] ret = new VmaDefragmentationPassMoveInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaDefragmentationPassMoveInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaDefragmentationPassMoveInfo clone(Arena arena, VmaDefragmentationPassMoveInfo src) {
        VmaDefragmentationPassMoveInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaDefragmentationPassMoveInfo[] clone(Arena arena, VmaDefragmentationPassMoveInfo[] src) {
        VmaDefragmentationPassMoveInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("moveCount"),
        ValueLayout.ADDRESS.withTargetLayout(VmaDefragmentationMove.LAYOUT).withName("pMoves")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$moveCount = PathElement.groupElement("moveCount");
    public static final PathElement PATH$pMoves = PathElement.groupElement("pMoves");

    public static final OfInt LAYOUT$moveCount = (OfInt) LAYOUT.select(PATH$moveCount);
    public static final AddressLayout LAYOUT$pMoves = (AddressLayout) LAYOUT.select(PATH$pMoves);

    public static final long OFFSET$moveCount = LAYOUT.byteOffset(PATH$moveCount);
    public static final long OFFSET$pMoves = LAYOUT.byteOffset(PATH$pMoves);

    public static final long SIZE$moveCount = LAYOUT$moveCount.byteSize();
    public static final long SIZE$pMoves = LAYOUT$pMoves.byteSize();
}


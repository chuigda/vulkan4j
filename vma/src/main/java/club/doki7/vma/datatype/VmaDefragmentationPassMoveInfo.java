package club.doki7.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vma.bitmask.*;
import club.doki7.vma.handle.*;
import club.doki7.vma.enumtype.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;
import static club.doki7.vulkan.VkConstants.*;

/// Parameters for incremental defragmentation steps.
///
/// To be used with function vmaBeginDefragmentationPass().
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaDefragmentationPassMoveInfo {
///     uint32_t moveCount; // @link substring="moveCount" target="#moveCount"
///     VmaDefragmentationMove* pMoves; // optional // @link substring="VmaDefragmentationMove" target="VmaDefragmentationMove" @link substring="pMoves" target="#pMoves"
/// } VmaDefragmentationPassMoveInfo;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// ## Member documentation
///
/// <ul>
/// <li>{@link #moveCount} Number of elements in the `pMoves` array.</li>
/// <li>{@link #pMoves} Array of moves to be performed by the user in the current defragmentation pass.
///
/// Pointer to an array of `moveCount` elements, owned by VMA, created in vmaBeginDefragmentationPass(), destroyed in vmaEndDefragmentationPass().
///
/// For each element, you should:
///
/// 1. Create a new buffer/image in the place pointed by VmaDefragmentationMove::dstMemory + VmaDefragmentationMove::dstOffset.
/// 2. Copy data from the VmaDefragmentationMove::srcAllocation e.g. using `vkCmdCopyBuffer`, `vkCmdCopyImage`.
/// 3. Make sure these commands finished executing on the GPU.
/// 4. Destroy the old buffer/image.
///
/// Only then you can finish defragmentation pass by calling vmaEndDefragmentationPass().
/// After this call, the allocation will point to the new place in memory.
///
/// Alternatively, if you cannot move specific allocation, you can set VmaDefragmentationMove::operation to {@code VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE}.
///
/// Alternatively, if you decide you want to completely remove the allocation:
///
/// 1. Destroy its buffer/image.
/// 2. Set VmaDefragmentationMove::operation to {@code VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY}.
///
/// Then, after vmaEndDefragmentationPass() the allocation will be freed.
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaDefragmentationPassMoveInfo(@NotNull MemorySegment segment) implements IVmaDefragmentationPassMoveInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaDefragmentationPassMoveInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaDefragmentationPassMoveInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaDefragmentationPassMoveInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaDefragmentationPassMoveInfo, Iterable<VmaDefragmentationPassMoveInfo> {
        public long size() {
            return segment.byteSize() / VmaDefragmentationPassMoveInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaDefragmentationPassMoveInfo at(long index) {
            return new VmaDefragmentationPassMoveInfo(segment.asSlice(index * VmaDefragmentationPassMoveInfo.BYTES, VmaDefragmentationPassMoveInfo.BYTES));
        }

        public void write(long index, @NotNull VmaDefragmentationPassMoveInfo value) {
            MemorySegment s = segment.asSlice(index * VmaDefragmentationPassMoveInfo.BYTES, VmaDefragmentationPassMoveInfo.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VmaDefragmentationPassMoveInfo.BYTES, VmaDefragmentationPassMoveInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaDefragmentationPassMoveInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaDefragmentationPassMoveInfo.BYTES,
                (end - start) * VmaDefragmentationPassMoveInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaDefragmentationPassMoveInfo.BYTES));
        }

        public VmaDefragmentationPassMoveInfo[] toArray() {
            VmaDefragmentationPassMoveInfo[] ret = new VmaDefragmentationPassMoveInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<VmaDefragmentationPassMoveInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaDefragmentationPassMoveInfo.BYTES;
            }

            @Override
            public VmaDefragmentationPassMoveInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaDefragmentationPassMoveInfo ret = new VmaDefragmentationPassMoveInfo(segment.asSlice(0, VmaDefragmentationPassMoveInfo.BYTES));
                segment = segment.asSlice(VmaDefragmentationPassMoveInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaDefragmentationPassMoveInfo allocate(Arena arena) {
        return new VmaDefragmentationPassMoveInfo(arena.allocate(LAYOUT));
    }

    public static VmaDefragmentationPassMoveInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaDefragmentationPassMoveInfo.Ptr(segment);
    }

    public static VmaDefragmentationPassMoveInfo clone(Arena arena, VmaDefragmentationPassMoveInfo src) {
        VmaDefragmentationPassMoveInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int moveCount() {
        return segment.get(LAYOUT$moveCount, OFFSET$moveCount);
    }

    public void moveCount(@Unsigned int value) {
        segment.set(LAYOUT$moveCount, OFFSET$moveCount, value);
    }

    public void pMoves(@Nullable IVmaDefragmentationMove value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMovesRaw(s);
    }

    @Unsafe public @Nullable VmaDefragmentationMove.Ptr pMoves(int assumedCount) {
        MemorySegment s = pMovesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VmaDefragmentationMove.BYTES);
        return new VmaDefragmentationMove.Ptr(s);
    }

    public @Nullable VmaDefragmentationMove pMoves() {
        MemorySegment s = pMovesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VmaDefragmentationMove(s);
    }

    public @Pointer(target=VmaDefragmentationMove.class) MemorySegment pMovesRaw() {
        return segment.get(LAYOUT$pMoves, OFFSET$pMoves);
    }

    public void pMovesRaw(@Pointer(target=VmaDefragmentationMove.class) MemorySegment value) {
        segment.set(LAYOUT$pMoves, OFFSET$pMoves, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("moveCount"),
        ValueLayout.ADDRESS.withTargetLayout(VmaDefragmentationMove.LAYOUT).withName("pMoves")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$moveCount = PathElement.groupElement("moveCount");
    public static final PathElement PATH$pMoves = PathElement.groupElement("pMoves");

    public static final OfInt LAYOUT$moveCount = (OfInt) LAYOUT.select(PATH$moveCount);
    public static final AddressLayout LAYOUT$pMoves = (AddressLayout) LAYOUT.select(PATH$pMoves);

    public static final long SIZE$moveCount = LAYOUT$moveCount.byteSize();
    public static final long SIZE$pMoves = LAYOUT$pMoves.byteSize();

    public static final long OFFSET$moveCount = LAYOUT.byteOffset(PATH$moveCount);
    public static final long OFFSET$pMoves = LAYOUT.byteOffset(PATH$pMoves);
}

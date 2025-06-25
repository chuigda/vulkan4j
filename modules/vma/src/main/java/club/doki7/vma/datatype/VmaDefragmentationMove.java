package club.doki7.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

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

/// Single move of an allocation to be done for defragmentation.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaDefragmentationMove {
///     VmaDefragmentationMoveOperation operation; // @link substring="VmaDefragmentationMoveOperation" target="VmaDefragmentationMoveOperation" @link substring="operation" target="#operation"
///     VmaAllocation srcAllocation; // @link substring="VmaAllocation" target="VmaAllocation" @link substring="srcAllocation" target="#srcAllocation"
///     VmaAllocation dstTmpAllocation; // @link substring="VmaAllocation" target="VmaAllocation" @link substring="dstTmpAllocation" target="#dstTmpAllocation"
/// } VmaDefragmentationMove;
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
/// <li>{@link #operation} Operation to be performed on the allocation by vmaEndDefragmentationPass(). Default value is {@code VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY}. You can modify it.</li>
/// <li>{@link #srcAllocation} Allocation that should be moved.</li>
/// <li>{@link #dstTmpAllocation} Temporary allocation pointing to destination memory that will replace `srcAllocation`.
///
/// <b>Warning: </b> Do not store this allocation in your data structures! It exists only temporarily, for the duration of the defragmentation pass,
/// to be used for binding new buffer/image to the destination memory using e.g. vmaBindBufferMemory().
/// vmaEndDefragmentationPass() will destroy it and make `srcAllocation` point to this memory.
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaDefragmentationMove(@NotNull MemorySegment segment) implements IVmaDefragmentationMove {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaDefragmentationMove}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaDefragmentationMove to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaDefragmentationMove.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaDefragmentationMove, Iterable<VmaDefragmentationMove> {
        public long size() {
            return segment.byteSize() / VmaDefragmentationMove.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaDefragmentationMove at(long index) {
            return new VmaDefragmentationMove(segment.asSlice(index * VmaDefragmentationMove.BYTES, VmaDefragmentationMove.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull VmaDefragmentationMove> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull VmaDefragmentationMove value) {
            MemorySegment s = segment.asSlice(index * VmaDefragmentationMove.BYTES, VmaDefragmentationMove.BYTES);
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
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VmaDefragmentationMove.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaDefragmentationMove.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaDefragmentationMove.BYTES,
                (end - start) * VmaDefragmentationMove.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaDefragmentationMove.BYTES));
        }

        public VmaDefragmentationMove[] toArray() {
            VmaDefragmentationMove[] ret = new VmaDefragmentationMove[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VmaDefragmentationMove> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VmaDefragmentationMove> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaDefragmentationMove.BYTES;
            }

            @Override
            public VmaDefragmentationMove next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaDefragmentationMove ret = new VmaDefragmentationMove(segment.asSlice(0, VmaDefragmentationMove.BYTES));
                segment = segment.asSlice(VmaDefragmentationMove.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaDefragmentationMove allocate(Arena arena) {
        return new VmaDefragmentationMove(arena.allocate(LAYOUT));
    }

    public static VmaDefragmentationMove.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaDefragmentationMove.Ptr(segment);
    }

    public static VmaDefragmentationMove clone(Arena arena, VmaDefragmentationMove src) {
        VmaDefragmentationMove ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(VmaDefragmentationMoveOperation.class) int operation() {
        return segment.get(LAYOUT$operation, OFFSET$operation);
    }

    public VmaDefragmentationMove operation(@EnumType(VmaDefragmentationMoveOperation.class) int value) {
        segment.set(LAYOUT$operation, OFFSET$operation, value);
        return this;
    }

    public @Nullable VmaAllocation srcAllocation() {
        MemorySegment s = segment.asSlice(OFFSET$srcAllocation, SIZE$srcAllocation);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VmaAllocation(s);
    }

    public VmaDefragmentationMove srcAllocation(@Nullable VmaAllocation value) {
        segment.set(LAYOUT$srcAllocation, OFFSET$srcAllocation, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable VmaAllocation dstTmpAllocation() {
        MemorySegment s = segment.asSlice(OFFSET$dstTmpAllocation, SIZE$dstTmpAllocation);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VmaAllocation(s);
    }

    public VmaDefragmentationMove dstTmpAllocation(@Nullable VmaAllocation value) {
        segment.set(LAYOUT$dstTmpAllocation, OFFSET$dstTmpAllocation, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("operation"),
        ValueLayout.ADDRESS.withName("srcAllocation"),
        ValueLayout.ADDRESS.withName("dstTmpAllocation")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$operation = PathElement.groupElement("operation");
    public static final PathElement PATH$srcAllocation = PathElement.groupElement("srcAllocation");
    public static final PathElement PATH$dstTmpAllocation = PathElement.groupElement("dstTmpAllocation");

    public static final OfInt LAYOUT$operation = (OfInt) LAYOUT.select(PATH$operation);
    public static final AddressLayout LAYOUT$srcAllocation = (AddressLayout) LAYOUT.select(PATH$srcAllocation);
    public static final AddressLayout LAYOUT$dstTmpAllocation = (AddressLayout) LAYOUT.select(PATH$dstTmpAllocation);

    public static final long SIZE$operation = LAYOUT$operation.byteSize();
    public static final long SIZE$srcAllocation = LAYOUT$srcAllocation.byteSize();
    public static final long SIZE$dstTmpAllocation = LAYOUT$dstTmpAllocation.byteSize();

    public static final long OFFSET$operation = LAYOUT.byteOffset(PATH$operation);
    public static final long OFFSET$srcAllocation = LAYOUT.byteOffset(PATH$srcAllocation);
    public static final long OFFSET$dstTmpAllocation = LAYOUT.byteOffset(PATH$dstTmpAllocation);
}

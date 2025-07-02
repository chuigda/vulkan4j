package club.doki7.webgpu.datatype;

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
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.handle.*;
import club.doki7.webgpu.enumtype.*;
import static club.doki7.webgpu.WGPUConstants.*;
import club.doki7.webgpu.WGPUFunctionTypes.*;

/// Represents a pointer to a {@code WGPUComputePassTimestampWrites} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUComputePassTimestampWrites {
///     WGPUQuerySet querySet; // @link substring="WGPUQuerySet" target="WGPUQuerySet" @link substring="querySet" target="#querySet"
///     uint32_t beginningOfPassWriteIndex; // @link substring="beginningOfPassWriteIndex" target="#beginningOfPassWriteIndex"
///     uint32_t endOfPassWriteIndex; // @link substring="endOfPassWriteIndex" target="#endOfPassWriteIndex"
/// } WGPUComputePassTimestampWrites;
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
@ValueBasedCandidate
@UnsafeConstructor
public record WGPUComputePassTimestampWrites(@NotNull MemorySegment segment) implements IWGPUComputePassTimestampWrites {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUComputePassTimestampWrites}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUComputePassTimestampWrites to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUComputePassTimestampWrites.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUComputePassTimestampWrites, Iterable<WGPUComputePassTimestampWrites> {
        public long size() {
            return segment.byteSize() / WGPUComputePassTimestampWrites.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUComputePassTimestampWrites at(long index) {
            return new WGPUComputePassTimestampWrites(segment.asSlice(index * WGPUComputePassTimestampWrites.BYTES, WGPUComputePassTimestampWrites.BYTES));
        }

        public WGPUComputePassTimestampWrites.Ptr at(long index, @NotNull Consumer<@NotNull WGPUComputePassTimestampWrites> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUComputePassTimestampWrites value) {
            MemorySegment s = segment.asSlice(index * WGPUComputePassTimestampWrites.BYTES, WGPUComputePassTimestampWrites.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUComputePassTimestampWrites.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUComputePassTimestampWrites.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUComputePassTimestampWrites.BYTES,
                (end - start) * WGPUComputePassTimestampWrites.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUComputePassTimestampWrites.BYTES));
        }

        public WGPUComputePassTimestampWrites[] toArray() {
            WGPUComputePassTimestampWrites[] ret = new WGPUComputePassTimestampWrites[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUComputePassTimestampWrites> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUComputePassTimestampWrites> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUComputePassTimestampWrites.BYTES;
            }

            @Override
            public WGPUComputePassTimestampWrites next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUComputePassTimestampWrites ret = new WGPUComputePassTimestampWrites(segment.asSlice(0, WGPUComputePassTimestampWrites.BYTES));
                segment = segment.asSlice(WGPUComputePassTimestampWrites.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUComputePassTimestampWrites allocate(Arena arena) {
        return new WGPUComputePassTimestampWrites(arena.allocate(LAYOUT));
    }

    public static WGPUComputePassTimestampWrites.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUComputePassTimestampWrites.Ptr(segment);
    }

    public static WGPUComputePassTimestampWrites clone(Arena arena, WGPUComputePassTimestampWrites src) {
        WGPUComputePassTimestampWrites ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable WGPUQuerySet querySet() {
        MemorySegment s = segment.asSlice(OFFSET$querySet, SIZE$querySet);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUQuerySet(s);
    }

    public WGPUComputePassTimestampWrites querySet(@Nullable WGPUQuerySet value) {
        segment.set(LAYOUT$querySet, OFFSET$querySet, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int beginningOfPassWriteIndex() {
        return segment.get(LAYOUT$beginningOfPassWriteIndex, OFFSET$beginningOfPassWriteIndex);
    }

    public WGPUComputePassTimestampWrites beginningOfPassWriteIndex(@Unsigned int value) {
        segment.set(LAYOUT$beginningOfPassWriteIndex, OFFSET$beginningOfPassWriteIndex, value);
        return this;
    }

    public @Unsigned int endOfPassWriteIndex() {
        return segment.get(LAYOUT$endOfPassWriteIndex, OFFSET$endOfPassWriteIndex);
    }

    public WGPUComputePassTimestampWrites endOfPassWriteIndex(@Unsigned int value) {
        segment.set(LAYOUT$endOfPassWriteIndex, OFFSET$endOfPassWriteIndex, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("querySet"),
        ValueLayout.JAVA_INT.withName("beginningOfPassWriteIndex"),
        ValueLayout.JAVA_INT.withName("endOfPassWriteIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$querySet = PathElement.groupElement("querySet");
    public static final PathElement PATH$beginningOfPassWriteIndex = PathElement.groupElement("beginningOfPassWriteIndex");
    public static final PathElement PATH$endOfPassWriteIndex = PathElement.groupElement("endOfPassWriteIndex");

    public static final AddressLayout LAYOUT$querySet = (AddressLayout) LAYOUT.select(PATH$querySet);
    public static final OfInt LAYOUT$beginningOfPassWriteIndex = (OfInt) LAYOUT.select(PATH$beginningOfPassWriteIndex);
    public static final OfInt LAYOUT$endOfPassWriteIndex = (OfInt) LAYOUT.select(PATH$endOfPassWriteIndex);

    public static final long SIZE$querySet = LAYOUT$querySet.byteSize();
    public static final long SIZE$beginningOfPassWriteIndex = LAYOUT$beginningOfPassWriteIndex.byteSize();
    public static final long SIZE$endOfPassWriteIndex = LAYOUT$endOfPassWriteIndex.byteSize();

    public static final long OFFSET$querySet = LAYOUT.byteOffset(PATH$querySet);
    public static final long OFFSET$beginningOfPassWriteIndex = LAYOUT.byteOffset(PATH$beginningOfPassWriteIndex);
    public static final long OFFSET$endOfPassWriteIndex = LAYOUT.byteOffset(PATH$endOfPassWriteIndex);
}

package club.doki7.stb.imageresize.datatype;

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
import club.doki7.stb.imageresize.handle.*;
import club.doki7.stb.imageresize.enumtype.*;

/// Represents a pointer to a {@code STBIR_PROFILE_INFO} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct STBIR_PROFILE_INFO {
///     stbir_uint64 totalClocks; // @link substring="totalClocks" target="#totalClocks"
///     stbir_uint64[8] clocks; // @link substring="clocks" target="#clocks"
///     char const** descriptions; // @link substring="descriptions" target="#descriptions"
///     stbir_uint32 count; // @link substring="count" target="#count"
/// } STBIR_PROFILE_INFO;
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
public record STBIR_PROFILEINFO(@NotNull MemorySegment segment) implements ISTBIR_PROFILEINFO {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBIR_PROFILEINFO}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBIR_PROFILEINFO to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBIR_PROFILEINFO.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBIR_PROFILEINFO, Iterable<STBIR_PROFILEINFO> {
        public long size() {
            return segment.byteSize() / STBIR_PROFILEINFO.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBIR_PROFILEINFO at(long index) {
            return new STBIR_PROFILEINFO(segment.asSlice(index * STBIR_PROFILEINFO.BYTES, STBIR_PROFILEINFO.BYTES));
        }

        public void write(long index, @NotNull STBIR_PROFILEINFO value) {
            MemorySegment s = segment.asSlice(index * STBIR_PROFILEINFO.BYTES, STBIR_PROFILEINFO.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBIR_PROFILEINFO.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBIR_PROFILEINFO.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBIR_PROFILEINFO.BYTES,
                (end - start) * STBIR_PROFILEINFO.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBIR_PROFILEINFO.BYTES));
        }

        public STBIR_PROFILEINFO[] toArray() {
            STBIR_PROFILEINFO[] ret = new STBIR_PROFILEINFO[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBIR_PROFILEINFO> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBIR_PROFILEINFO> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBIR_PROFILEINFO.BYTES;
            }

            @Override
            public STBIR_PROFILEINFO next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBIR_PROFILEINFO ret = new STBIR_PROFILEINFO(segment.asSlice(0, STBIR_PROFILEINFO.BYTES));
                segment = segment.asSlice(STBIR_PROFILEINFO.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBIR_PROFILEINFO allocate(Arena arena) {
        return new STBIR_PROFILEINFO(arena.allocate(LAYOUT));
    }

    public static STBIR_PROFILEINFO.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBIR_PROFILEINFO.Ptr(segment);
    }

    public static STBIR_PROFILEINFO clone(Arena arena, STBIR_PROFILEINFO src) {
        STBIR_PROFILEINFO ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("stbir_uint64") long totalClocks() {
        return segment.get(LAYOUT$totalClocks, OFFSET$totalClocks);
    }

    public STBIR_PROFILEINFO totalClocks(@NativeType("stbir_uint64") long value) {
        segment.set(LAYOUT$totalClocks, OFFSET$totalClocks, value);
        return this;
    }

    public @Pointer(comment="stbir_uint64") LongPtr clocks() {
        return new LongPtr(clocksRaw());
    }

    public STBIR_PROFILEINFO clocks(@Pointer(comment="stbir_uint64") LongPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clocks, SIZE$clocks);
        return this;
    }

    public MemorySegment clocksRaw() {
        return segment.asSlice(OFFSET$clocks, SIZE$clocks);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr descriptions() {
        MemorySegment s = descriptionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public STBIR_PROFILEINFO descriptions(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        descriptionsRaw(s);
        return this;
    }

    public @Pointer(comment="void**") MemorySegment descriptionsRaw() {
        return segment.get(LAYOUT$descriptions, OFFSET$descriptions);
    }

    public void descriptionsRaw(@Pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$descriptions, OFFSET$descriptions, value);
    }

    public @NativeType("stbir_uint32") int count() {
        return segment.get(LAYOUT$count, OFFSET$count);
    }

    public STBIR_PROFILEINFO count(@NativeType("stbir_uint32") int value) {
        segment.set(LAYOUT$count, OFFSET$count, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("totalClocks"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_LONG).withName("clocks"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("descriptions"),
        ValueLayout.JAVA_INT.withName("count")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$totalClocks = PathElement.groupElement("totalClocks");
    public static final PathElement PATH$clocks = PathElement.groupElement("clocks");
    public static final PathElement PATH$descriptions = PathElement.groupElement("descriptions");
    public static final PathElement PATH$count = PathElement.groupElement("count");

    public static final OfLong LAYOUT$totalClocks = (OfLong) LAYOUT.select(PATH$totalClocks);
    public static final SequenceLayout LAYOUT$clocks = (SequenceLayout) LAYOUT.select(PATH$clocks);
    public static final AddressLayout LAYOUT$descriptions = (AddressLayout) LAYOUT.select(PATH$descriptions);
    public static final OfInt LAYOUT$count = (OfInt) LAYOUT.select(PATH$count);

    public static final long SIZE$totalClocks = LAYOUT$totalClocks.byteSize();
    public static final long SIZE$clocks = LAYOUT$clocks.byteSize();
    public static final long SIZE$descriptions = LAYOUT$descriptions.byteSize();
    public static final long SIZE$count = LAYOUT$count.byteSize();

    public static final long OFFSET$totalClocks = LAYOUT.byteOffset(PATH$totalClocks);
    public static final long OFFSET$clocks = LAYOUT.byteOffset(PATH$clocks);
    public static final long OFFSET$descriptions = LAYOUT.byteOffset(PATH$descriptions);
    public static final long OFFSET$count = LAYOUT.byteOffset(PATH$count);
}

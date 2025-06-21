package club.doki7.stb.truetype.datatype;

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
import static club.doki7.stb.truetype.STBTrueTypeConstants.*;

/// Represents a pointer to a {@code stbtt_pack_range} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt_pack_range {
///     float fontSize; // @link substring="fontSize" target="#fontSize"
///     int firstUnicodeCodepointInRange; // @link substring="firstUnicodeCodepointInRange" target="#firstUnicodeCodepointInRange"
///     int* arrayOfUnicodeCodepoints; // @link substring="arrayOfUnicodeCodepoints" target="#arrayOfUnicodeCodepoints"
///     int numChars; // @link substring="numChars" target="#numChars"
///     stbtt_packedchar* chardataForRange; // @link substring="STBTT_Packedchar" target="STBTT_Packedchar" @link substring="chardataForRange" target="#chardataForRange"
///     char hOversample; // @link substring="hOversample" target="#hOversample"
///     char vOversample; // @link substring="vOversample" target="#vOversample"
/// } stbtt_pack_range;
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
public record STBTT_PackRange(@NotNull MemorySegment segment) implements ISTBTT_PackRange {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_PackRange}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_PackRange to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_PackRange.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_PackRange, Iterable<STBTT_PackRange> {
        public long size() {
            return segment.byteSize() / STBTT_PackRange.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_PackRange at(long index) {
            return new STBTT_PackRange(segment.asSlice(index * STBTT_PackRange.BYTES, STBTT_PackRange.BYTES));
        }

        public void write(long index, @NotNull STBTT_PackRange value) {
            MemorySegment s = segment.asSlice(index * STBTT_PackRange.BYTES, STBTT_PackRange.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_PackRange.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_PackRange.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_PackRange.BYTES,
                (end - start) * STBTT_PackRange.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_PackRange.BYTES));
        }

        public STBTT_PackRange[] toArray() {
            STBTT_PackRange[] ret = new STBTT_PackRange[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_PackRange> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_PackRange> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_PackRange.BYTES;
            }

            @Override
            public STBTT_PackRange next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_PackRange ret = new STBTT_PackRange(segment.asSlice(0, STBTT_PackRange.BYTES));
                segment = segment.asSlice(STBTT_PackRange.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_PackRange allocate(Arena arena) {
        return new STBTT_PackRange(arena.allocate(LAYOUT));
    }

    public static STBTT_PackRange.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_PackRange.Ptr(segment);
    }

    public static STBTT_PackRange clone(Arena arena, STBTT_PackRange src) {
        STBTT_PackRange ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float fontSize() {
        return segment.get(LAYOUT$fontSize, OFFSET$fontSize);
    }

    public STBTT_PackRange fontSize(float value) {
        segment.set(LAYOUT$fontSize, OFFSET$fontSize, value);
        return this;
    }

    public int firstUnicodeCodepointInRange() {
        return segment.get(LAYOUT$firstUnicodeCodepointInRange, OFFSET$firstUnicodeCodepointInRange);
    }

    public STBTT_PackRange firstUnicodeCodepointInRange(int value) {
        segment.set(LAYOUT$firstUnicodeCodepointInRange, OFFSET$firstUnicodeCodepointInRange, value);
        return this;
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable IntPtr arrayOfUnicodeCodepoints() {
        MemorySegment s = arrayOfUnicodeCodepointsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public STBTT_PackRange arrayOfUnicodeCodepoints(@Nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        arrayOfUnicodeCodepointsRaw(s);
        return this;
    }

    public @Pointer(comment="int32_t*") MemorySegment arrayOfUnicodeCodepointsRaw() {
        return segment.get(LAYOUT$arrayOfUnicodeCodepoints, OFFSET$arrayOfUnicodeCodepoints);
    }

    public void arrayOfUnicodeCodepointsRaw(@Pointer(comment="int32_t*") MemorySegment value) {
        segment.set(LAYOUT$arrayOfUnicodeCodepoints, OFFSET$arrayOfUnicodeCodepoints, value);
    }

    public int numChars() {
        return segment.get(LAYOUT$numChars, OFFSET$numChars);
    }

    public STBTT_PackRange numChars(int value) {
        segment.set(LAYOUT$numChars, OFFSET$numChars, value);
        return this;
    }

    public STBTT_PackRange chardataForRange(@Nullable ISTBTT_Packedchar value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        chardataForRangeRaw(s);
        return this;
    }

    @Unsafe public @Nullable STBTT_Packedchar.Ptr chardataForRange(int assumedCount) {
        MemorySegment s = chardataForRangeRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * STBTT_Packedchar.BYTES);
        return new STBTT_Packedchar.Ptr(s);
    }

    public @Nullable STBTT_Packedchar chardataForRange() {
        MemorySegment s = chardataForRangeRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new STBTT_Packedchar(s);
    }

    public @Pointer(target=STBTT_Packedchar.class) MemorySegment chardataForRangeRaw() {
        return segment.get(LAYOUT$chardataForRange, OFFSET$chardataForRange);
    }

    public void chardataForRangeRaw(@Pointer(target=STBTT_Packedchar.class) MemorySegment value) {
        segment.set(LAYOUT$chardataForRange, OFFSET$chardataForRange, value);
    }

    public byte hOversample() {
        return segment.get(LAYOUT$hOversample, OFFSET$hOversample);
    }

    public STBTT_PackRange hOversample(byte value) {
        segment.set(LAYOUT$hOversample, OFFSET$hOversample, value);
        return this;
    }

    public byte vOversample() {
        return segment.get(LAYOUT$vOversample, OFFSET$vOversample);
    }

    public STBTT_PackRange vOversample(byte value) {
        segment.set(LAYOUT$vOversample, OFFSET$vOversample, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("fontSize"),
        ValueLayout.JAVA_INT.withName("firstUnicodeCodepointInRange"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("arrayOfUnicodeCodepoints"),
        ValueLayout.JAVA_INT.withName("numChars"),
        ValueLayout.ADDRESS.withTargetLayout(STBTT_Packedchar.LAYOUT).withName("chardataForRange"),
        ValueLayout.JAVA_BYTE.withName("hOversample"),
        ValueLayout.JAVA_BYTE.withName("vOversample")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$fontSize = PathElement.groupElement("fontSize");
    public static final PathElement PATH$firstUnicodeCodepointInRange = PathElement.groupElement("firstUnicodeCodepointInRange");
    public static final PathElement PATH$arrayOfUnicodeCodepoints = PathElement.groupElement("arrayOfUnicodeCodepoints");
    public static final PathElement PATH$numChars = PathElement.groupElement("numChars");
    public static final PathElement PATH$chardataForRange = PathElement.groupElement("chardataForRange");
    public static final PathElement PATH$hOversample = PathElement.groupElement("hOversample");
    public static final PathElement PATH$vOversample = PathElement.groupElement("vOversample");

    public static final OfFloat LAYOUT$fontSize = (OfFloat) LAYOUT.select(PATH$fontSize);
    public static final OfInt LAYOUT$firstUnicodeCodepointInRange = (OfInt) LAYOUT.select(PATH$firstUnicodeCodepointInRange);
    public static final AddressLayout LAYOUT$arrayOfUnicodeCodepoints = (AddressLayout) LAYOUT.select(PATH$arrayOfUnicodeCodepoints);
    public static final OfInt LAYOUT$numChars = (OfInt) LAYOUT.select(PATH$numChars);
    public static final AddressLayout LAYOUT$chardataForRange = (AddressLayout) LAYOUT.select(PATH$chardataForRange);
    public static final OfByte LAYOUT$hOversample = (OfByte) LAYOUT.select(PATH$hOversample);
    public static final OfByte LAYOUT$vOversample = (OfByte) LAYOUT.select(PATH$vOversample);

    public static final long SIZE$fontSize = LAYOUT$fontSize.byteSize();
    public static final long SIZE$firstUnicodeCodepointInRange = LAYOUT$firstUnicodeCodepointInRange.byteSize();
    public static final long SIZE$arrayOfUnicodeCodepoints = LAYOUT$arrayOfUnicodeCodepoints.byteSize();
    public static final long SIZE$numChars = LAYOUT$numChars.byteSize();
    public static final long SIZE$chardataForRange = LAYOUT$chardataForRange.byteSize();
    public static final long SIZE$hOversample = LAYOUT$hOversample.byteSize();
    public static final long SIZE$vOversample = LAYOUT$vOversample.byteSize();

    public static final long OFFSET$fontSize = LAYOUT.byteOffset(PATH$fontSize);
    public static final long OFFSET$firstUnicodeCodepointInRange = LAYOUT.byteOffset(PATH$firstUnicodeCodepointInRange);
    public static final long OFFSET$arrayOfUnicodeCodepoints = LAYOUT.byteOffset(PATH$arrayOfUnicodeCodepoints);
    public static final long OFFSET$numChars = LAYOUT.byteOffset(PATH$numChars);
    public static final long OFFSET$chardataForRange = LAYOUT.byteOffset(PATH$chardataForRange);
    public static final long OFFSET$hOversample = LAYOUT.byteOffset(PATH$hOversample);
    public static final long OFFSET$vOversample = LAYOUT.byteOffset(PATH$vOversample);
}

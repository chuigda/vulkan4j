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
import club.doki7.stb.truetype.handle.*;
import static club.doki7.stb.truetype.STBTrueTypeConstants.*;

/// Represents a pointer to a {@code stbtt__bitmap} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt__bitmap {
///     int w; // @link substring="w" target="#w"
///     int h; // @link substring="h" target="#h"
///     int stride; // @link substring="stride" target="#stride"
///     char* pixels; // @link substring="pixels" target="#pixels"
/// } stbtt__bitmap;
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
public record STBTT_Bitmap(@NotNull MemorySegment segment) implements ISTBTT_Bitmap {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_Bitmap}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_Bitmap to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_Bitmap.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_Bitmap, Iterable<STBTT_Bitmap> {
        public long size() {
            return segment.byteSize() / STBTT_Bitmap.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_Bitmap at(long index) {
            return new STBTT_Bitmap(segment.asSlice(index * STBTT_Bitmap.BYTES, STBTT_Bitmap.BYTES));
        }

        public void write(long index, @NotNull STBTT_Bitmap value) {
            MemorySegment s = segment.asSlice(index * STBTT_Bitmap.BYTES, STBTT_Bitmap.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_Bitmap.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_Bitmap.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_Bitmap.BYTES,
                (end - start) * STBTT_Bitmap.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_Bitmap.BYTES));
        }

        public STBTT_Bitmap[] toArray() {
            STBTT_Bitmap[] ret = new STBTT_Bitmap[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_Bitmap> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_Bitmap> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_Bitmap.BYTES;
            }

            @Override
            public STBTT_Bitmap next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_Bitmap ret = new STBTT_Bitmap(segment.asSlice(0, STBTT_Bitmap.BYTES));
                segment = segment.asSlice(STBTT_Bitmap.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_Bitmap allocate(Arena arena) {
        return new STBTT_Bitmap(arena.allocate(LAYOUT));
    }

    public static STBTT_Bitmap.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_Bitmap.Ptr(segment);
    }

    public static STBTT_Bitmap clone(Arena arena, STBTT_Bitmap src) {
        STBTT_Bitmap ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int w() {
        return segment.get(LAYOUT$w, OFFSET$w);
    }

    public STBTT_Bitmap w(int value) {
        segment.set(LAYOUT$w, OFFSET$w, value);
        return this;
    }

    public int h() {
        return segment.get(LAYOUT$h, OFFSET$h);
    }

    public STBTT_Bitmap h(int value) {
        segment.set(LAYOUT$h, OFFSET$h, value);
        return this;
    }

    public int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public STBTT_Bitmap stride(int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pixels() {
        MemorySegment s = pixelsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public STBTT_Bitmap pixels(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pixelsRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment pixelsRaw() {
        return segment.get(LAYOUT$pixels, OFFSET$pixels);
    }

    public void pixelsRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pixels, OFFSET$pixels, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("w"),
        ValueLayout.JAVA_INT.withName("h"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pixels")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$w = PathElement.groupElement("w");
    public static final PathElement PATH$h = PathElement.groupElement("h");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");
    public static final PathElement PATH$pixels = PathElement.groupElement("pixels");

    public static final OfInt LAYOUT$w = (OfInt) LAYOUT.select(PATH$w);
    public static final OfInt LAYOUT$h = (OfInt) LAYOUT.select(PATH$h);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final AddressLayout LAYOUT$pixels = (AddressLayout) LAYOUT.select(PATH$pixels);

    public static final long SIZE$w = LAYOUT$w.byteSize();
    public static final long SIZE$h = LAYOUT$h.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$pixels = LAYOUT$pixels.byteSize();

    public static final long OFFSET$w = LAYOUT.byteOffset(PATH$w);
    public static final long OFFSET$h = LAYOUT.byteOffset(PATH$h);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$pixels = LAYOUT.byteOffset(PATH$pixels);
}

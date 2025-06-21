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

/// Represents a pointer to a {@code stbtt_pack_context} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt_pack_context {
///     void* userAllocatorContext; // @link substring="userAllocatorContext" target="#userAllocatorContext"
///     void* packInfo; // @link substring="packInfo" target="#packInfo"
///     int width; // @link substring="width" target="#width"
///     int height; // @link substring="height" target="#height"
///     int strideInBytes; // @link substring="strideInBytes" target="#strideInBytes"
///     int padding; // @link substring="padding" target="#padding"
///     int skipMissing; // @link substring="skipMissing" target="#skipMissing"
///     int hOversample; // @link substring="hOversample" target="#hOversample"
///     int vOversample; // @link substring="vOversample" target="#vOversample"
///     char* pixels; // @link substring="pixels" target="#pixels"
///     void* nodes; // @link substring="nodes" target="#nodes"
/// } stbtt_pack_context;
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
public record STBTT_PackContext(@NotNull MemorySegment segment) implements ISTBTT_PackContext {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_PackContext}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_PackContext to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_PackContext.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_PackContext, Iterable<STBTT_PackContext> {
        public long size() {
            return segment.byteSize() / STBTT_PackContext.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_PackContext at(long index) {
            return new STBTT_PackContext(segment.asSlice(index * STBTT_PackContext.BYTES, STBTT_PackContext.BYTES));
        }

        public void write(long index, @NotNull STBTT_PackContext value) {
            MemorySegment s = segment.asSlice(index * STBTT_PackContext.BYTES, STBTT_PackContext.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_PackContext.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_PackContext.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_PackContext.BYTES,
                (end - start) * STBTT_PackContext.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_PackContext.BYTES));
        }

        public STBTT_PackContext[] toArray() {
            STBTT_PackContext[] ret = new STBTT_PackContext[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_PackContext> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_PackContext> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_PackContext.BYTES;
            }

            @Override
            public STBTT_PackContext next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_PackContext ret = new STBTT_PackContext(segment.asSlice(0, STBTT_PackContext.BYTES));
                segment = segment.asSlice(STBTT_PackContext.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_PackContext allocate(Arena arena) {
        return new STBTT_PackContext(arena.allocate(LAYOUT));
    }

    public static STBTT_PackContext.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_PackContext.Ptr(segment);
    }

    public static STBTT_PackContext clone(Arena arena, STBTT_PackContext src) {
        STBTT_PackContext ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Pointer(comment="void*") MemorySegment userAllocatorContext() {
        return segment.get(LAYOUT$userAllocatorContext, OFFSET$userAllocatorContext);
    }

    public void userAllocatorContext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$userAllocatorContext, OFFSET$userAllocatorContext, value);
    }

    public STBTT_PackContext userAllocatorContext(@Nullable IPointer pointer) {
        userAllocatorContext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment packInfo() {
        return segment.get(LAYOUT$packInfo, OFFSET$packInfo);
    }

    public void packInfo(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$packInfo, OFFSET$packInfo, value);
    }

    public STBTT_PackContext packInfo(@Nullable IPointer pointer) {
        packInfo(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public STBTT_PackContext width(int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
        return this;
    }

    public int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public STBTT_PackContext height(int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
        return this;
    }

    public int strideInBytes() {
        return segment.get(LAYOUT$strideInBytes, OFFSET$strideInBytes);
    }

    public STBTT_PackContext strideInBytes(int value) {
        segment.set(LAYOUT$strideInBytes, OFFSET$strideInBytes, value);
        return this;
    }

    public int padding() {
        return segment.get(LAYOUT$padding, OFFSET$padding);
    }

    public STBTT_PackContext padding(int value) {
        segment.set(LAYOUT$padding, OFFSET$padding, value);
        return this;
    }

    public int skipMissing() {
        return segment.get(LAYOUT$skipMissing, OFFSET$skipMissing);
    }

    public STBTT_PackContext skipMissing(int value) {
        segment.set(LAYOUT$skipMissing, OFFSET$skipMissing, value);
        return this;
    }

    public int hOversample() {
        return segment.get(LAYOUT$hOversample, OFFSET$hOversample);
    }

    public STBTT_PackContext hOversample(int value) {
        segment.set(LAYOUT$hOversample, OFFSET$hOversample, value);
        return this;
    }

    public int vOversample() {
        return segment.get(LAYOUT$vOversample, OFFSET$vOversample);
    }

    public STBTT_PackContext vOversample(int value) {
        segment.set(LAYOUT$vOversample, OFFSET$vOversample, value);
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

    public STBTT_PackContext pixels(@Nullable BytePtr value) {
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

    public @Pointer(comment="void*") MemorySegment nodes() {
        return segment.get(LAYOUT$nodes, OFFSET$nodes);
    }

    public void nodes(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$nodes, OFFSET$nodes, value);
    }

    public STBTT_PackContext nodes(@Nullable IPointer pointer) {
        nodes(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("userAllocatorContext"),
        ValueLayout.ADDRESS.withName("packInfo"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("strideInBytes"),
        ValueLayout.JAVA_INT.withName("padding"),
        ValueLayout.JAVA_INT.withName("skipMissing"),
        ValueLayout.JAVA_INT.withName("hOversample"),
        ValueLayout.JAVA_INT.withName("vOversample"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pixels"),
        ValueLayout.ADDRESS.withName("nodes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$userAllocatorContext = PathElement.groupElement("userAllocatorContext");
    public static final PathElement PATH$packInfo = PathElement.groupElement("packInfo");
    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$strideInBytes = PathElement.groupElement("strideInBytes");
    public static final PathElement PATH$padding = PathElement.groupElement("padding");
    public static final PathElement PATH$skipMissing = PathElement.groupElement("skipMissing");
    public static final PathElement PATH$hOversample = PathElement.groupElement("hOversample");
    public static final PathElement PATH$vOversample = PathElement.groupElement("vOversample");
    public static final PathElement PATH$pixels = PathElement.groupElement("pixels");
    public static final PathElement PATH$nodes = PathElement.groupElement("nodes");

    public static final AddressLayout LAYOUT$userAllocatorContext = (AddressLayout) LAYOUT.select(PATH$userAllocatorContext);
    public static final AddressLayout LAYOUT$packInfo = (AddressLayout) LAYOUT.select(PATH$packInfo);
    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$strideInBytes = (OfInt) LAYOUT.select(PATH$strideInBytes);
    public static final OfInt LAYOUT$padding = (OfInt) LAYOUT.select(PATH$padding);
    public static final OfInt LAYOUT$skipMissing = (OfInt) LAYOUT.select(PATH$skipMissing);
    public static final OfInt LAYOUT$hOversample = (OfInt) LAYOUT.select(PATH$hOversample);
    public static final OfInt LAYOUT$vOversample = (OfInt) LAYOUT.select(PATH$vOversample);
    public static final AddressLayout LAYOUT$pixels = (AddressLayout) LAYOUT.select(PATH$pixels);
    public static final AddressLayout LAYOUT$nodes = (AddressLayout) LAYOUT.select(PATH$nodes);

    public static final long SIZE$userAllocatorContext = LAYOUT$userAllocatorContext.byteSize();
    public static final long SIZE$packInfo = LAYOUT$packInfo.byteSize();
    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$strideInBytes = LAYOUT$strideInBytes.byteSize();
    public static final long SIZE$padding = LAYOUT$padding.byteSize();
    public static final long SIZE$skipMissing = LAYOUT$skipMissing.byteSize();
    public static final long SIZE$hOversample = LAYOUT$hOversample.byteSize();
    public static final long SIZE$vOversample = LAYOUT$vOversample.byteSize();
    public static final long SIZE$pixels = LAYOUT$pixels.byteSize();
    public static final long SIZE$nodes = LAYOUT$nodes.byteSize();

    public static final long OFFSET$userAllocatorContext = LAYOUT.byteOffset(PATH$userAllocatorContext);
    public static final long OFFSET$packInfo = LAYOUT.byteOffset(PATH$packInfo);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$strideInBytes = LAYOUT.byteOffset(PATH$strideInBytes);
    public static final long OFFSET$padding = LAYOUT.byteOffset(PATH$padding);
    public static final long OFFSET$skipMissing = LAYOUT.byteOffset(PATH$skipMissing);
    public static final long OFFSET$hOversample = LAYOUT.byteOffset(PATH$hOversample);
    public static final long OFFSET$vOversample = LAYOUT.byteOffset(PATH$vOversample);
    public static final long OFFSET$pixels = LAYOUT.byteOffset(PATH$pixels);
    public static final long OFFSET$nodes = LAYOUT.byteOffset(PATH$nodes);
}

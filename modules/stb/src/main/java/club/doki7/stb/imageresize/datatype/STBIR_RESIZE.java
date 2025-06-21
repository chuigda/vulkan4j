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
import club.doki7.stb.imageresize.enumtype.*;

/// Represents a pointer to a {@code STBIR_RESIZE} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct STBIR_RESIZE {
///     void* userData; // @link substring="userData" target="#userData"
///     void const* inputPixels; // @link substring="inputPixels" target="#inputPixels"
///     int inputW; // @link substring="inputW" target="#inputW"
///     int inputH; // @link substring="inputH" target="#inputH"
///     double inputS0; // @link substring="inputS0" target="#inputS0"
///     double inputT0; // @link substring="inputT0" target="#inputT0"
///     double inputS1; // @link substring="inputS1" target="#inputS1"
///     double inputT1; // @link substring="inputT1" target="#inputT1"
///     stbir_input_callback* inputCb; // @link substring="inputCb" target="#inputCb"
///     void* outputPixels; // @link substring="outputPixels" target="#outputPixels"
///     int outputW; // @link substring="outputW" target="#outputW"
///     int outputH; // @link substring="outputH" target="#outputH"
///     int outputSubx; // @link substring="outputSubx" target="#outputSubx"
///     int outputSuby; // @link substring="outputSuby" target="#outputSuby"
///     int outputSubw; // @link substring="outputSubw" target="#outputSubw"
///     int outputSubh; // @link substring="outputSubh" target="#outputSubh"
///     stbir_output_callback* outputCb; // @link substring="outputCb" target="#outputCb"
///     int inputStrideInBytes; // @link substring="inputStrideInBytes" target="#inputStrideInBytes"
///     int outputStrideInBytes; // @link substring="outputStrideInBytes" target="#outputStrideInBytes"
///     int splits; // @link substring="splits" target="#splits"
///     int fastAlpha; // @link substring="fastAlpha" target="#fastAlpha"
///     int needsRebuild; // @link substring="needsRebuild" target="#needsRebuild"
///     int calledAlloc; // @link substring="calledAlloc" target="#calledAlloc"
///     stbir_pixel_layout inputPixelLayoutPublic; // @link substring="STBIR_PixelLayout" target="STBIR_PixelLayout" @link substring="inputPixelLayoutPublic" target="#inputPixelLayoutPublic"
///     stbir_pixel_layout outputPixelLayoutPublic; // @link substring="STBIR_PixelLayout" target="STBIR_PixelLayout" @link substring="outputPixelLayoutPublic" target="#outputPixelLayoutPublic"
///     stbir_datatype inputDataType; // @link substring="STBIR_Datatype" target="STBIR_Datatype" @link substring="inputDataType" target="#inputDataType"
///     stbir_datatype outputDataType; // @link substring="STBIR_Datatype" target="STBIR_Datatype" @link substring="outputDataType" target="#outputDataType"
///     stbir_filter horizontalFilter; // @link substring="STBIR_Filter" target="STBIR_Filter" @link substring="horizontalFilter" target="#horizontalFilter"
///     stbir_filter verticalFilter; // @link substring="STBIR_Filter" target="STBIR_Filter" @link substring="verticalFilter" target="#verticalFilter"
///     stbir_edge horizontalEdge; // @link substring="STBIR_Edge" target="STBIR_Edge" @link substring="horizontalEdge" target="#horizontalEdge"
///     stbir_edge verticalEdge; // @link substring="STBIR_Edge" target="STBIR_Edge" @link substring="verticalEdge" target="#verticalEdge"
///     stbir__kernel_callback* horizontalFilterKernel; // @link substring="horizontalFilterKernel" target="#horizontalFilterKernel"
///     stbir__support_callback* horizontalFilterSupport; // @link substring="horizontalFilterSupport" target="#horizontalFilterSupport"
///     stbir__kernel_callback* verticalFilterKernel; // @link substring="verticalFilterKernel" target="#verticalFilterKernel"
///     stbir__support_callback* verticalFilterSupport; // @link substring="verticalFilterSupport" target="#verticalFilterSupport"
///     stbir__info* samplers; // @link substring="STBIR_Info" target="STBIR_Info" @link substring="samplers" target="#samplers"
/// } STBIR_RESIZE;
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
public record STBIR_RESIZE(@NotNull MemorySegment segment) implements ISTBIR_RESIZE {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBIR_RESIZE}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBIR_RESIZE to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBIR_RESIZE.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBIR_RESIZE, Iterable<STBIR_RESIZE> {
        public long size() {
            return segment.byteSize() / STBIR_RESIZE.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBIR_RESIZE at(long index) {
            return new STBIR_RESIZE(segment.asSlice(index * STBIR_RESIZE.BYTES, STBIR_RESIZE.BYTES));
        }

        public void write(long index, @NotNull STBIR_RESIZE value) {
            MemorySegment s = segment.asSlice(index * STBIR_RESIZE.BYTES, STBIR_RESIZE.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBIR_RESIZE.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBIR_RESIZE.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBIR_RESIZE.BYTES,
                (end - start) * STBIR_RESIZE.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBIR_RESIZE.BYTES));
        }

        public STBIR_RESIZE[] toArray() {
            STBIR_RESIZE[] ret = new STBIR_RESIZE[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBIR_RESIZE> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBIR_RESIZE> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBIR_RESIZE.BYTES;
            }

            @Override
            public STBIR_RESIZE next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBIR_RESIZE ret = new STBIR_RESIZE(segment.asSlice(0, STBIR_RESIZE.BYTES));
                segment = segment.asSlice(STBIR_RESIZE.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBIR_RESIZE allocate(Arena arena) {
        return new STBIR_RESIZE(arena.allocate(LAYOUT));
    }

    public static STBIR_RESIZE.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBIR_RESIZE.Ptr(segment);
    }

    public static STBIR_RESIZE clone(Arena arena, STBIR_RESIZE src) {
        STBIR_RESIZE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Pointer(comment="void*") MemorySegment userData() {
        return segment.get(LAYOUT$userData, OFFSET$userData);
    }

    public void userData(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$userData, OFFSET$userData, value);
    }

    public STBIR_RESIZE userData(@Nullable IPointer pointer) {
        userData(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment inputPixels() {
        return segment.get(LAYOUT$inputPixels, OFFSET$inputPixels);
    }

    public void inputPixels(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$inputPixels, OFFSET$inputPixels, value);
    }

    public STBIR_RESIZE inputPixels(@Nullable IPointer pointer) {
        inputPixels(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public int inputW() {
        return segment.get(LAYOUT$inputW, OFFSET$inputW);
    }

    public STBIR_RESIZE inputW(int value) {
        segment.set(LAYOUT$inputW, OFFSET$inputW, value);
        return this;
    }

    public int inputH() {
        return segment.get(LAYOUT$inputH, OFFSET$inputH);
    }

    public STBIR_RESIZE inputH(int value) {
        segment.set(LAYOUT$inputH, OFFSET$inputH, value);
        return this;
    }

    public double inputS0() {
        return segment.get(LAYOUT$inputS0, OFFSET$inputS0);
    }

    public STBIR_RESIZE inputS0(double value) {
        segment.set(LAYOUT$inputS0, OFFSET$inputS0, value);
        return this;
    }

    public double inputT0() {
        return segment.get(LAYOUT$inputT0, OFFSET$inputT0);
    }

    public STBIR_RESIZE inputT0(double value) {
        segment.set(LAYOUT$inputT0, OFFSET$inputT0, value);
        return this;
    }

    public double inputS1() {
        return segment.get(LAYOUT$inputS1, OFFSET$inputS1);
    }

    public STBIR_RESIZE inputS1(double value) {
        segment.set(LAYOUT$inputS1, OFFSET$inputS1, value);
        return this;
    }

    public double inputT1() {
        return segment.get(LAYOUT$inputT1, OFFSET$inputT1);
    }

    public STBIR_RESIZE inputT1(double value) {
        segment.set(LAYOUT$inputT1, OFFSET$inputT1, value);
        return this;
    }

    public @Pointer(comment="stbir_input_callback*") MemorySegment inputCb() {
        return segment.get(LAYOUT$inputCb, OFFSET$inputCb);
    }

    public void inputCb(@Pointer(comment="stbir_input_callback*") MemorySegment value) {
        segment.set(LAYOUT$inputCb, OFFSET$inputCb, value);
    }

    public STBIR_RESIZE inputCb(@Nullable IPointer pointer) {
        inputCb(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment outputPixels() {
        return segment.get(LAYOUT$outputPixels, OFFSET$outputPixels);
    }

    public void outputPixels(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$outputPixels, OFFSET$outputPixels, value);
    }

    public STBIR_RESIZE outputPixels(@Nullable IPointer pointer) {
        outputPixels(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public int outputW() {
        return segment.get(LAYOUT$outputW, OFFSET$outputW);
    }

    public STBIR_RESIZE outputW(int value) {
        segment.set(LAYOUT$outputW, OFFSET$outputW, value);
        return this;
    }

    public int outputH() {
        return segment.get(LAYOUT$outputH, OFFSET$outputH);
    }

    public STBIR_RESIZE outputH(int value) {
        segment.set(LAYOUT$outputH, OFFSET$outputH, value);
        return this;
    }

    public int outputSubx() {
        return segment.get(LAYOUT$outputSubx, OFFSET$outputSubx);
    }

    public STBIR_RESIZE outputSubx(int value) {
        segment.set(LAYOUT$outputSubx, OFFSET$outputSubx, value);
        return this;
    }

    public int outputSuby() {
        return segment.get(LAYOUT$outputSuby, OFFSET$outputSuby);
    }

    public STBIR_RESIZE outputSuby(int value) {
        segment.set(LAYOUT$outputSuby, OFFSET$outputSuby, value);
        return this;
    }

    public int outputSubw() {
        return segment.get(LAYOUT$outputSubw, OFFSET$outputSubw);
    }

    public STBIR_RESIZE outputSubw(int value) {
        segment.set(LAYOUT$outputSubw, OFFSET$outputSubw, value);
        return this;
    }

    public int outputSubh() {
        return segment.get(LAYOUT$outputSubh, OFFSET$outputSubh);
    }

    public STBIR_RESIZE outputSubh(int value) {
        segment.set(LAYOUT$outputSubh, OFFSET$outputSubh, value);
        return this;
    }

    public @Pointer(comment="stbir_output_callback*") MemorySegment outputCb() {
        return segment.get(LAYOUT$outputCb, OFFSET$outputCb);
    }

    public void outputCb(@Pointer(comment="stbir_output_callback*") MemorySegment value) {
        segment.set(LAYOUT$outputCb, OFFSET$outputCb, value);
    }

    public STBIR_RESIZE outputCb(@Nullable IPointer pointer) {
        outputCb(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public int inputStrideInBytes() {
        return segment.get(LAYOUT$inputStrideInBytes, OFFSET$inputStrideInBytes);
    }

    public STBIR_RESIZE inputStrideInBytes(int value) {
        segment.set(LAYOUT$inputStrideInBytes, OFFSET$inputStrideInBytes, value);
        return this;
    }

    public int outputStrideInBytes() {
        return segment.get(LAYOUT$outputStrideInBytes, OFFSET$outputStrideInBytes);
    }

    public STBIR_RESIZE outputStrideInBytes(int value) {
        segment.set(LAYOUT$outputStrideInBytes, OFFSET$outputStrideInBytes, value);
        return this;
    }

    public int splits() {
        return segment.get(LAYOUT$splits, OFFSET$splits);
    }

    public STBIR_RESIZE splits(int value) {
        segment.set(LAYOUT$splits, OFFSET$splits, value);
        return this;
    }

    public int fastAlpha() {
        return segment.get(LAYOUT$fastAlpha, OFFSET$fastAlpha);
    }

    public STBIR_RESIZE fastAlpha(int value) {
        segment.set(LAYOUT$fastAlpha, OFFSET$fastAlpha, value);
        return this;
    }

    public int needsRebuild() {
        return segment.get(LAYOUT$needsRebuild, OFFSET$needsRebuild);
    }

    public STBIR_RESIZE needsRebuild(int value) {
        segment.set(LAYOUT$needsRebuild, OFFSET$needsRebuild, value);
        return this;
    }

    public int calledAlloc() {
        return segment.get(LAYOUT$calledAlloc, OFFSET$calledAlloc);
    }

    public STBIR_RESIZE calledAlloc(int value) {
        segment.set(LAYOUT$calledAlloc, OFFSET$calledAlloc, value);
        return this;
    }

    public @EnumType(STBIR_PixelLayout.class) int inputPixelLayoutPublic() {
        return segment.get(LAYOUT$inputPixelLayoutPublic, OFFSET$inputPixelLayoutPublic);
    }

    public STBIR_RESIZE inputPixelLayoutPublic(@EnumType(STBIR_PixelLayout.class) int value) {
        segment.set(LAYOUT$inputPixelLayoutPublic, OFFSET$inputPixelLayoutPublic, value);
        return this;
    }

    public @EnumType(STBIR_PixelLayout.class) int outputPixelLayoutPublic() {
        return segment.get(LAYOUT$outputPixelLayoutPublic, OFFSET$outputPixelLayoutPublic);
    }

    public STBIR_RESIZE outputPixelLayoutPublic(@EnumType(STBIR_PixelLayout.class) int value) {
        segment.set(LAYOUT$outputPixelLayoutPublic, OFFSET$outputPixelLayoutPublic, value);
        return this;
    }

    public @EnumType(STBIR_Datatype.class) int inputDataType() {
        return segment.get(LAYOUT$inputDataType, OFFSET$inputDataType);
    }

    public STBIR_RESIZE inputDataType(@EnumType(STBIR_Datatype.class) int value) {
        segment.set(LAYOUT$inputDataType, OFFSET$inputDataType, value);
        return this;
    }

    public @EnumType(STBIR_Datatype.class) int outputDataType() {
        return segment.get(LAYOUT$outputDataType, OFFSET$outputDataType);
    }

    public STBIR_RESIZE outputDataType(@EnumType(STBIR_Datatype.class) int value) {
        segment.set(LAYOUT$outputDataType, OFFSET$outputDataType, value);
        return this;
    }

    public @EnumType(STBIR_Filter.class) int horizontalFilter() {
        return segment.get(LAYOUT$horizontalFilter, OFFSET$horizontalFilter);
    }

    public STBIR_RESIZE horizontalFilter(@EnumType(STBIR_Filter.class) int value) {
        segment.set(LAYOUT$horizontalFilter, OFFSET$horizontalFilter, value);
        return this;
    }

    public @EnumType(STBIR_Filter.class) int verticalFilter() {
        return segment.get(LAYOUT$verticalFilter, OFFSET$verticalFilter);
    }

    public STBIR_RESIZE verticalFilter(@EnumType(STBIR_Filter.class) int value) {
        segment.set(LAYOUT$verticalFilter, OFFSET$verticalFilter, value);
        return this;
    }

    public @EnumType(STBIR_Edge.class) int horizontalEdge() {
        return segment.get(LAYOUT$horizontalEdge, OFFSET$horizontalEdge);
    }

    public STBIR_RESIZE horizontalEdge(@EnumType(STBIR_Edge.class) int value) {
        segment.set(LAYOUT$horizontalEdge, OFFSET$horizontalEdge, value);
        return this;
    }

    public @EnumType(STBIR_Edge.class) int verticalEdge() {
        return segment.get(LAYOUT$verticalEdge, OFFSET$verticalEdge);
    }

    public STBIR_RESIZE verticalEdge(@EnumType(STBIR_Edge.class) int value) {
        segment.set(LAYOUT$verticalEdge, OFFSET$verticalEdge, value);
        return this;
    }

    public @Pointer(comment="stbir__kernel_callback*") MemorySegment horizontalFilterKernel() {
        return segment.get(LAYOUT$horizontalFilterKernel, OFFSET$horizontalFilterKernel);
    }

    public void horizontalFilterKernel(@Pointer(comment="stbir__kernel_callback*") MemorySegment value) {
        segment.set(LAYOUT$horizontalFilterKernel, OFFSET$horizontalFilterKernel, value);
    }

    public STBIR_RESIZE horizontalFilterKernel(@Nullable IPointer pointer) {
        horizontalFilterKernel(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="stbir__support_callback*") MemorySegment horizontalFilterSupport() {
        return segment.get(LAYOUT$horizontalFilterSupport, OFFSET$horizontalFilterSupport);
    }

    public void horizontalFilterSupport(@Pointer(comment="stbir__support_callback*") MemorySegment value) {
        segment.set(LAYOUT$horizontalFilterSupport, OFFSET$horizontalFilterSupport, value);
    }

    public STBIR_RESIZE horizontalFilterSupport(@Nullable IPointer pointer) {
        horizontalFilterSupport(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="stbir__kernel_callback*") MemorySegment verticalFilterKernel() {
        return segment.get(LAYOUT$verticalFilterKernel, OFFSET$verticalFilterKernel);
    }

    public void verticalFilterKernel(@Pointer(comment="stbir__kernel_callback*") MemorySegment value) {
        segment.set(LAYOUT$verticalFilterKernel, OFFSET$verticalFilterKernel, value);
    }

    public STBIR_RESIZE verticalFilterKernel(@Nullable IPointer pointer) {
        verticalFilterKernel(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="stbir__support_callback*") MemorySegment verticalFilterSupport() {
        return segment.get(LAYOUT$verticalFilterSupport, OFFSET$verticalFilterSupport);
    }

    public void verticalFilterSupport(@Pointer(comment="stbir__support_callback*") MemorySegment value) {
        segment.set(LAYOUT$verticalFilterSupport, OFFSET$verticalFilterSupport, value);
    }

    public STBIR_RESIZE verticalFilterSupport(@Nullable IPointer pointer) {
        verticalFilterSupport(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable STBIR_Info samplers() {
        MemorySegment s = segment.asSlice(OFFSET$samplers, SIZE$samplers);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new STBIR_Info(s);
    }

    public STBIR_RESIZE samplers(@Nullable STBIR_Info value) {
        segment.set(LAYOUT$samplers, OFFSET$samplers, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("userData"),
        ValueLayout.ADDRESS.withName("inputPixels"),
        ValueLayout.JAVA_INT.withName("inputW"),
        ValueLayout.JAVA_INT.withName("inputH"),
        ValueLayout.JAVA_DOUBLE.withName("inputS0"),
        ValueLayout.JAVA_DOUBLE.withName("inputT0"),
        ValueLayout.JAVA_DOUBLE.withName("inputS1"),
        ValueLayout.JAVA_DOUBLE.withName("inputT1"),
        ValueLayout.ADDRESS.withName("inputCb"),
        ValueLayout.ADDRESS.withName("outputPixels"),
        ValueLayout.JAVA_INT.withName("outputW"),
        ValueLayout.JAVA_INT.withName("outputH"),
        ValueLayout.JAVA_INT.withName("outputSubx"),
        ValueLayout.JAVA_INT.withName("outputSuby"),
        ValueLayout.JAVA_INT.withName("outputSubw"),
        ValueLayout.JAVA_INT.withName("outputSubh"),
        ValueLayout.ADDRESS.withName("outputCb"),
        ValueLayout.JAVA_INT.withName("inputStrideInBytes"),
        ValueLayout.JAVA_INT.withName("outputStrideInBytes"),
        ValueLayout.JAVA_INT.withName("splits"),
        ValueLayout.JAVA_INT.withName("fastAlpha"),
        ValueLayout.JAVA_INT.withName("needsRebuild"),
        ValueLayout.JAVA_INT.withName("calledAlloc"),
        ValueLayout.JAVA_INT.withName("inputPixelLayoutPublic"),
        ValueLayout.JAVA_INT.withName("outputPixelLayoutPublic"),
        ValueLayout.JAVA_INT.withName("inputDataType"),
        ValueLayout.JAVA_INT.withName("outputDataType"),
        ValueLayout.JAVA_INT.withName("horizontalFilter"),
        ValueLayout.JAVA_INT.withName("verticalFilter"),
        ValueLayout.JAVA_INT.withName("horizontalEdge"),
        ValueLayout.JAVA_INT.withName("verticalEdge"),
        ValueLayout.ADDRESS.withName("horizontalFilterKernel"),
        ValueLayout.ADDRESS.withName("horizontalFilterSupport"),
        ValueLayout.ADDRESS.withName("verticalFilterKernel"),
        ValueLayout.ADDRESS.withName("verticalFilterSupport"),
        ValueLayout.ADDRESS.withName("samplers")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$userData = PathElement.groupElement("userData");
    public static final PathElement PATH$inputPixels = PathElement.groupElement("inputPixels");
    public static final PathElement PATH$inputW = PathElement.groupElement("inputW");
    public static final PathElement PATH$inputH = PathElement.groupElement("inputH");
    public static final PathElement PATH$inputS0 = PathElement.groupElement("inputS0");
    public static final PathElement PATH$inputT0 = PathElement.groupElement("inputT0");
    public static final PathElement PATH$inputS1 = PathElement.groupElement("inputS1");
    public static final PathElement PATH$inputT1 = PathElement.groupElement("inputT1");
    public static final PathElement PATH$inputCb = PathElement.groupElement("inputCb");
    public static final PathElement PATH$outputPixels = PathElement.groupElement("outputPixels");
    public static final PathElement PATH$outputW = PathElement.groupElement("outputW");
    public static final PathElement PATH$outputH = PathElement.groupElement("outputH");
    public static final PathElement PATH$outputSubx = PathElement.groupElement("outputSubx");
    public static final PathElement PATH$outputSuby = PathElement.groupElement("outputSuby");
    public static final PathElement PATH$outputSubw = PathElement.groupElement("outputSubw");
    public static final PathElement PATH$outputSubh = PathElement.groupElement("outputSubh");
    public static final PathElement PATH$outputCb = PathElement.groupElement("outputCb");
    public static final PathElement PATH$inputStrideInBytes = PathElement.groupElement("inputStrideInBytes");
    public static final PathElement PATH$outputStrideInBytes = PathElement.groupElement("outputStrideInBytes");
    public static final PathElement PATH$splits = PathElement.groupElement("splits");
    public static final PathElement PATH$fastAlpha = PathElement.groupElement("fastAlpha");
    public static final PathElement PATH$needsRebuild = PathElement.groupElement("needsRebuild");
    public static final PathElement PATH$calledAlloc = PathElement.groupElement("calledAlloc");
    public static final PathElement PATH$inputPixelLayoutPublic = PathElement.groupElement("inputPixelLayoutPublic");
    public static final PathElement PATH$outputPixelLayoutPublic = PathElement.groupElement("outputPixelLayoutPublic");
    public static final PathElement PATH$inputDataType = PathElement.groupElement("inputDataType");
    public static final PathElement PATH$outputDataType = PathElement.groupElement("outputDataType");
    public static final PathElement PATH$horizontalFilter = PathElement.groupElement("horizontalFilter");
    public static final PathElement PATH$verticalFilter = PathElement.groupElement("verticalFilter");
    public static final PathElement PATH$horizontalEdge = PathElement.groupElement("horizontalEdge");
    public static final PathElement PATH$verticalEdge = PathElement.groupElement("verticalEdge");
    public static final PathElement PATH$horizontalFilterKernel = PathElement.groupElement("horizontalFilterKernel");
    public static final PathElement PATH$horizontalFilterSupport = PathElement.groupElement("horizontalFilterSupport");
    public static final PathElement PATH$verticalFilterKernel = PathElement.groupElement("verticalFilterKernel");
    public static final PathElement PATH$verticalFilterSupport = PathElement.groupElement("verticalFilterSupport");
    public static final PathElement PATH$samplers = PathElement.groupElement("samplers");

    public static final AddressLayout LAYOUT$userData = (AddressLayout) LAYOUT.select(PATH$userData);
    public static final AddressLayout LAYOUT$inputPixels = (AddressLayout) LAYOUT.select(PATH$inputPixels);
    public static final OfInt LAYOUT$inputW = (OfInt) LAYOUT.select(PATH$inputW);
    public static final OfInt LAYOUT$inputH = (OfInt) LAYOUT.select(PATH$inputH);
    public static final OfDouble LAYOUT$inputS0 = (OfDouble) LAYOUT.select(PATH$inputS0);
    public static final OfDouble LAYOUT$inputT0 = (OfDouble) LAYOUT.select(PATH$inputT0);
    public static final OfDouble LAYOUT$inputS1 = (OfDouble) LAYOUT.select(PATH$inputS1);
    public static final OfDouble LAYOUT$inputT1 = (OfDouble) LAYOUT.select(PATH$inputT1);
    public static final AddressLayout LAYOUT$inputCb = (AddressLayout) LAYOUT.select(PATH$inputCb);
    public static final AddressLayout LAYOUT$outputPixels = (AddressLayout) LAYOUT.select(PATH$outputPixels);
    public static final OfInt LAYOUT$outputW = (OfInt) LAYOUT.select(PATH$outputW);
    public static final OfInt LAYOUT$outputH = (OfInt) LAYOUT.select(PATH$outputH);
    public static final OfInt LAYOUT$outputSubx = (OfInt) LAYOUT.select(PATH$outputSubx);
    public static final OfInt LAYOUT$outputSuby = (OfInt) LAYOUT.select(PATH$outputSuby);
    public static final OfInt LAYOUT$outputSubw = (OfInt) LAYOUT.select(PATH$outputSubw);
    public static final OfInt LAYOUT$outputSubh = (OfInt) LAYOUT.select(PATH$outputSubh);
    public static final AddressLayout LAYOUT$outputCb = (AddressLayout) LAYOUT.select(PATH$outputCb);
    public static final OfInt LAYOUT$inputStrideInBytes = (OfInt) LAYOUT.select(PATH$inputStrideInBytes);
    public static final OfInt LAYOUT$outputStrideInBytes = (OfInt) LAYOUT.select(PATH$outputStrideInBytes);
    public static final OfInt LAYOUT$splits = (OfInt) LAYOUT.select(PATH$splits);
    public static final OfInt LAYOUT$fastAlpha = (OfInt) LAYOUT.select(PATH$fastAlpha);
    public static final OfInt LAYOUT$needsRebuild = (OfInt) LAYOUT.select(PATH$needsRebuild);
    public static final OfInt LAYOUT$calledAlloc = (OfInt) LAYOUT.select(PATH$calledAlloc);
    public static final OfInt LAYOUT$inputPixelLayoutPublic = (OfInt) LAYOUT.select(PATH$inputPixelLayoutPublic);
    public static final OfInt LAYOUT$outputPixelLayoutPublic = (OfInt) LAYOUT.select(PATH$outputPixelLayoutPublic);
    public static final OfInt LAYOUT$inputDataType = (OfInt) LAYOUT.select(PATH$inputDataType);
    public static final OfInt LAYOUT$outputDataType = (OfInt) LAYOUT.select(PATH$outputDataType);
    public static final OfInt LAYOUT$horizontalFilter = (OfInt) LAYOUT.select(PATH$horizontalFilter);
    public static final OfInt LAYOUT$verticalFilter = (OfInt) LAYOUT.select(PATH$verticalFilter);
    public static final OfInt LAYOUT$horizontalEdge = (OfInt) LAYOUT.select(PATH$horizontalEdge);
    public static final OfInt LAYOUT$verticalEdge = (OfInt) LAYOUT.select(PATH$verticalEdge);
    public static final AddressLayout LAYOUT$horizontalFilterKernel = (AddressLayout) LAYOUT.select(PATH$horizontalFilterKernel);
    public static final AddressLayout LAYOUT$horizontalFilterSupport = (AddressLayout) LAYOUT.select(PATH$horizontalFilterSupport);
    public static final AddressLayout LAYOUT$verticalFilterKernel = (AddressLayout) LAYOUT.select(PATH$verticalFilterKernel);
    public static final AddressLayout LAYOUT$verticalFilterSupport = (AddressLayout) LAYOUT.select(PATH$verticalFilterSupport);
    public static final AddressLayout LAYOUT$samplers = (AddressLayout) LAYOUT.select(PATH$samplers);

    public static final long SIZE$userData = LAYOUT$userData.byteSize();
    public static final long SIZE$inputPixels = LAYOUT$inputPixels.byteSize();
    public static final long SIZE$inputW = LAYOUT$inputW.byteSize();
    public static final long SIZE$inputH = LAYOUT$inputH.byteSize();
    public static final long SIZE$inputS0 = LAYOUT$inputS0.byteSize();
    public static final long SIZE$inputT0 = LAYOUT$inputT0.byteSize();
    public static final long SIZE$inputS1 = LAYOUT$inputS1.byteSize();
    public static final long SIZE$inputT1 = LAYOUT$inputT1.byteSize();
    public static final long SIZE$inputCb = LAYOUT$inputCb.byteSize();
    public static final long SIZE$outputPixels = LAYOUT$outputPixels.byteSize();
    public static final long SIZE$outputW = LAYOUT$outputW.byteSize();
    public static final long SIZE$outputH = LAYOUT$outputH.byteSize();
    public static final long SIZE$outputSubx = LAYOUT$outputSubx.byteSize();
    public static final long SIZE$outputSuby = LAYOUT$outputSuby.byteSize();
    public static final long SIZE$outputSubw = LAYOUT$outputSubw.byteSize();
    public static final long SIZE$outputSubh = LAYOUT$outputSubh.byteSize();
    public static final long SIZE$outputCb = LAYOUT$outputCb.byteSize();
    public static final long SIZE$inputStrideInBytes = LAYOUT$inputStrideInBytes.byteSize();
    public static final long SIZE$outputStrideInBytes = LAYOUT$outputStrideInBytes.byteSize();
    public static final long SIZE$splits = LAYOUT$splits.byteSize();
    public static final long SIZE$fastAlpha = LAYOUT$fastAlpha.byteSize();
    public static final long SIZE$needsRebuild = LAYOUT$needsRebuild.byteSize();
    public static final long SIZE$calledAlloc = LAYOUT$calledAlloc.byteSize();
    public static final long SIZE$inputPixelLayoutPublic = LAYOUT$inputPixelLayoutPublic.byteSize();
    public static final long SIZE$outputPixelLayoutPublic = LAYOUT$outputPixelLayoutPublic.byteSize();
    public static final long SIZE$inputDataType = LAYOUT$inputDataType.byteSize();
    public static final long SIZE$outputDataType = LAYOUT$outputDataType.byteSize();
    public static final long SIZE$horizontalFilter = LAYOUT$horizontalFilter.byteSize();
    public static final long SIZE$verticalFilter = LAYOUT$verticalFilter.byteSize();
    public static final long SIZE$horizontalEdge = LAYOUT$horizontalEdge.byteSize();
    public static final long SIZE$verticalEdge = LAYOUT$verticalEdge.byteSize();
    public static final long SIZE$horizontalFilterKernel = LAYOUT$horizontalFilterKernel.byteSize();
    public static final long SIZE$horizontalFilterSupport = LAYOUT$horizontalFilterSupport.byteSize();
    public static final long SIZE$verticalFilterKernel = LAYOUT$verticalFilterKernel.byteSize();
    public static final long SIZE$verticalFilterSupport = LAYOUT$verticalFilterSupport.byteSize();
    public static final long SIZE$samplers = LAYOUT$samplers.byteSize();

    public static final long OFFSET$userData = LAYOUT.byteOffset(PATH$userData);
    public static final long OFFSET$inputPixels = LAYOUT.byteOffset(PATH$inputPixels);
    public static final long OFFSET$inputW = LAYOUT.byteOffset(PATH$inputW);
    public static final long OFFSET$inputH = LAYOUT.byteOffset(PATH$inputH);
    public static final long OFFSET$inputS0 = LAYOUT.byteOffset(PATH$inputS0);
    public static final long OFFSET$inputT0 = LAYOUT.byteOffset(PATH$inputT0);
    public static final long OFFSET$inputS1 = LAYOUT.byteOffset(PATH$inputS1);
    public static final long OFFSET$inputT1 = LAYOUT.byteOffset(PATH$inputT1);
    public static final long OFFSET$inputCb = LAYOUT.byteOffset(PATH$inputCb);
    public static final long OFFSET$outputPixels = LAYOUT.byteOffset(PATH$outputPixels);
    public static final long OFFSET$outputW = LAYOUT.byteOffset(PATH$outputW);
    public static final long OFFSET$outputH = LAYOUT.byteOffset(PATH$outputH);
    public static final long OFFSET$outputSubx = LAYOUT.byteOffset(PATH$outputSubx);
    public static final long OFFSET$outputSuby = LAYOUT.byteOffset(PATH$outputSuby);
    public static final long OFFSET$outputSubw = LAYOUT.byteOffset(PATH$outputSubw);
    public static final long OFFSET$outputSubh = LAYOUT.byteOffset(PATH$outputSubh);
    public static final long OFFSET$outputCb = LAYOUT.byteOffset(PATH$outputCb);
    public static final long OFFSET$inputStrideInBytes = LAYOUT.byteOffset(PATH$inputStrideInBytes);
    public static final long OFFSET$outputStrideInBytes = LAYOUT.byteOffset(PATH$outputStrideInBytes);
    public static final long OFFSET$splits = LAYOUT.byteOffset(PATH$splits);
    public static final long OFFSET$fastAlpha = LAYOUT.byteOffset(PATH$fastAlpha);
    public static final long OFFSET$needsRebuild = LAYOUT.byteOffset(PATH$needsRebuild);
    public static final long OFFSET$calledAlloc = LAYOUT.byteOffset(PATH$calledAlloc);
    public static final long OFFSET$inputPixelLayoutPublic = LAYOUT.byteOffset(PATH$inputPixelLayoutPublic);
    public static final long OFFSET$outputPixelLayoutPublic = LAYOUT.byteOffset(PATH$outputPixelLayoutPublic);
    public static final long OFFSET$inputDataType = LAYOUT.byteOffset(PATH$inputDataType);
    public static final long OFFSET$outputDataType = LAYOUT.byteOffset(PATH$outputDataType);
    public static final long OFFSET$horizontalFilter = LAYOUT.byteOffset(PATH$horizontalFilter);
    public static final long OFFSET$verticalFilter = LAYOUT.byteOffset(PATH$verticalFilter);
    public static final long OFFSET$horizontalEdge = LAYOUT.byteOffset(PATH$horizontalEdge);
    public static final long OFFSET$verticalEdge = LAYOUT.byteOffset(PATH$verticalEdge);
    public static final long OFFSET$horizontalFilterKernel = LAYOUT.byteOffset(PATH$horizontalFilterKernel);
    public static final long OFFSET$horizontalFilterSupport = LAYOUT.byteOffset(PATH$horizontalFilterSupport);
    public static final long OFFSET$verticalFilterKernel = LAYOUT.byteOffset(PATH$verticalFilterKernel);
    public static final long OFFSET$verticalFilterSupport = LAYOUT.byteOffset(PATH$verticalFilterSupport);
    public static final long OFFSET$samplers = LAYOUT.byteOffset(PATH$samplers);
}

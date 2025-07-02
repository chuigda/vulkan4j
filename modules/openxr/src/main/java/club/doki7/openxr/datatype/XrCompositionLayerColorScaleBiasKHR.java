package club.doki7.openxr.datatype;

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
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;
import club.doki7.openxr.XRFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerColorScaleBiasKHR.html"><code>XrCompositionLayerColorScaleBiasKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCompositionLayerColorScaleBiasKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrColor4f colorScale; // @link substring="XrColor4f" target="XrColor4f" @link substring="colorScale" target="#colorScale"
///     XrColor4f colorBias; // @link substring="XrColor4f" target="XrColor4f" @link substring="colorBias" target="#colorBias"
/// } XrCompositionLayerColorScaleBiasKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR`
///
/// The {@code allocate} ({@link XrCompositionLayerColorScaleBiasKHR#allocate(Arena)}, {@link XrCompositionLayerColorScaleBiasKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCompositionLayerColorScaleBiasKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerColorScaleBiasKHR.html"><code>XrCompositionLayerColorScaleBiasKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCompositionLayerColorScaleBiasKHR(@NotNull MemorySegment segment) implements IXrCompositionLayerColorScaleBiasKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerColorScaleBiasKHR.html"><code>XrCompositionLayerColorScaleBiasKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCompositionLayerColorScaleBiasKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCompositionLayerColorScaleBiasKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCompositionLayerColorScaleBiasKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCompositionLayerColorScaleBiasKHR, Iterable<XrCompositionLayerColorScaleBiasKHR> {
        public long size() {
            return segment.byteSize() / XrCompositionLayerColorScaleBiasKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCompositionLayerColorScaleBiasKHR at(long index) {
            return new XrCompositionLayerColorScaleBiasKHR(segment.asSlice(index * XrCompositionLayerColorScaleBiasKHR.BYTES, XrCompositionLayerColorScaleBiasKHR.BYTES));
        }

        public XrCompositionLayerColorScaleBiasKHR.Ptr at(long index, @NotNull Consumer<@NotNull XrCompositionLayerColorScaleBiasKHR> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrCompositionLayerColorScaleBiasKHR value) {
            MemorySegment s = segment.asSlice(index * XrCompositionLayerColorScaleBiasKHR.BYTES, XrCompositionLayerColorScaleBiasKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCompositionLayerColorScaleBiasKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCompositionLayerColorScaleBiasKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCompositionLayerColorScaleBiasKHR.BYTES,
                (end - start) * XrCompositionLayerColorScaleBiasKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCompositionLayerColorScaleBiasKHR.BYTES));
        }

        public XrCompositionLayerColorScaleBiasKHR[] toArray() {
            XrCompositionLayerColorScaleBiasKHR[] ret = new XrCompositionLayerColorScaleBiasKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCompositionLayerColorScaleBiasKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCompositionLayerColorScaleBiasKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCompositionLayerColorScaleBiasKHR.BYTES;
            }

            @Override
            public XrCompositionLayerColorScaleBiasKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCompositionLayerColorScaleBiasKHR ret = new XrCompositionLayerColorScaleBiasKHR(segment.asSlice(0, XrCompositionLayerColorScaleBiasKHR.BYTES));
                segment = segment.asSlice(XrCompositionLayerColorScaleBiasKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCompositionLayerColorScaleBiasKHR allocate(Arena arena) {
        XrCompositionLayerColorScaleBiasKHR ret = new XrCompositionLayerColorScaleBiasKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR);
        return ret;
    }

    public static XrCompositionLayerColorScaleBiasKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCompositionLayerColorScaleBiasKHR.Ptr ret = new XrCompositionLayerColorScaleBiasKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR);
        }
        return ret;
    }

    public static XrCompositionLayerColorScaleBiasKHR clone(Arena arena, XrCompositionLayerColorScaleBiasKHR src) {
        XrCompositionLayerColorScaleBiasKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCompositionLayerColorScaleBiasKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCompositionLayerColorScaleBiasKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCompositionLayerColorScaleBiasKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrColor4f colorScale() {
        return new XrColor4f(segment.asSlice(OFFSET$colorScale, LAYOUT$colorScale));
    }

    public XrCompositionLayerColorScaleBiasKHR colorScale(@NotNull XrColor4f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$colorScale, SIZE$colorScale);
        return this;
    }

    public XrCompositionLayerColorScaleBiasKHR colorScale(Consumer<@NotNull XrColor4f> consumer) {
        consumer.accept(colorScale());
        return this;
    }

    public @NotNull XrColor4f colorBias() {
        return new XrColor4f(segment.asSlice(OFFSET$colorBias, LAYOUT$colorBias));
    }

    public XrCompositionLayerColorScaleBiasKHR colorBias(@NotNull XrColor4f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$colorBias, SIZE$colorBias);
        return this;
    }

    public XrCompositionLayerColorScaleBiasKHR colorBias(Consumer<@NotNull XrColor4f> consumer) {
        consumer.accept(colorBias());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrColor4f.LAYOUT.withName("colorScale"),
        XrColor4f.LAYOUT.withName("colorBias")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$colorScale = PathElement.groupElement("colorScale");
    public static final PathElement PATH$colorBias = PathElement.groupElement("colorBias");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$colorScale = (StructLayout) LAYOUT.select(PATH$colorScale);
    public static final StructLayout LAYOUT$colorBias = (StructLayout) LAYOUT.select(PATH$colorBias);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$colorScale = LAYOUT$colorScale.byteSize();
    public static final long SIZE$colorBias = LAYOUT$colorBias.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$colorScale = LAYOUT.byteOffset(PATH$colorScale);
    public static final long OFFSET$colorBias = LAYOUT.byteOffset(PATH$colorBias);
}

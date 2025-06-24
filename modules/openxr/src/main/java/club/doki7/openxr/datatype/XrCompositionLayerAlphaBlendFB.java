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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerAlphaBlendFB.html"><code>XrCompositionLayerAlphaBlendFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCompositionLayerAlphaBlendFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrBlendFactorFB srcFactorColor; // @link substring="XrBlendFactorFB" target="XrBlendFactorFB" @link substring="srcFactorColor" target="#srcFactorColor"
///     XrBlendFactorFB dstFactorColor; // @link substring="XrBlendFactorFB" target="XrBlendFactorFB" @link substring="dstFactorColor" target="#dstFactorColor"
///     XrBlendFactorFB srcFactorAlpha; // @link substring="XrBlendFactorFB" target="XrBlendFactorFB" @link substring="srcFactorAlpha" target="#srcFactorAlpha"
///     XrBlendFactorFB dstFactorAlpha; // @link substring="XrBlendFactorFB" target="XrBlendFactorFB" @link substring="dstFactorAlpha" target="#dstFactorAlpha"
/// } XrCompositionLayerAlphaBlendFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB`
///
/// The {@code allocate} ({@link XrCompositionLayerAlphaBlendFB#allocate(Arena)}, {@link XrCompositionLayerAlphaBlendFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCompositionLayerAlphaBlendFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerAlphaBlendFB.html"><code>XrCompositionLayerAlphaBlendFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCompositionLayerAlphaBlendFB(@NotNull MemorySegment segment) implements IXrCompositionLayerAlphaBlendFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerAlphaBlendFB.html"><code>XrCompositionLayerAlphaBlendFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCompositionLayerAlphaBlendFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCompositionLayerAlphaBlendFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCompositionLayerAlphaBlendFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCompositionLayerAlphaBlendFB, Iterable<XrCompositionLayerAlphaBlendFB> {
        public long size() {
            return segment.byteSize() / XrCompositionLayerAlphaBlendFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCompositionLayerAlphaBlendFB at(long index) {
            return new XrCompositionLayerAlphaBlendFB(segment.asSlice(index * XrCompositionLayerAlphaBlendFB.BYTES, XrCompositionLayerAlphaBlendFB.BYTES));
        }

        public void write(long index, @NotNull XrCompositionLayerAlphaBlendFB value) {
            MemorySegment s = segment.asSlice(index * XrCompositionLayerAlphaBlendFB.BYTES, XrCompositionLayerAlphaBlendFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCompositionLayerAlphaBlendFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCompositionLayerAlphaBlendFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCompositionLayerAlphaBlendFB.BYTES,
                (end - start) * XrCompositionLayerAlphaBlendFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCompositionLayerAlphaBlendFB.BYTES));
        }

        public XrCompositionLayerAlphaBlendFB[] toArray() {
            XrCompositionLayerAlphaBlendFB[] ret = new XrCompositionLayerAlphaBlendFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCompositionLayerAlphaBlendFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCompositionLayerAlphaBlendFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCompositionLayerAlphaBlendFB.BYTES;
            }

            @Override
            public XrCompositionLayerAlphaBlendFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCompositionLayerAlphaBlendFB ret = new XrCompositionLayerAlphaBlendFB(segment.asSlice(0, XrCompositionLayerAlphaBlendFB.BYTES));
                segment = segment.asSlice(XrCompositionLayerAlphaBlendFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCompositionLayerAlphaBlendFB allocate(Arena arena) {
        XrCompositionLayerAlphaBlendFB ret = new XrCompositionLayerAlphaBlendFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB);
        return ret;
    }

    public static XrCompositionLayerAlphaBlendFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCompositionLayerAlphaBlendFB.Ptr ret = new XrCompositionLayerAlphaBlendFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB);
        }
        return ret;
    }

    public static XrCompositionLayerAlphaBlendFB clone(Arena arena, XrCompositionLayerAlphaBlendFB src) {
        XrCompositionLayerAlphaBlendFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCompositionLayerAlphaBlendFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCompositionLayerAlphaBlendFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCompositionLayerAlphaBlendFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrBlendFactorFB.class) int srcFactorColor() {
        return segment.get(LAYOUT$srcFactorColor, OFFSET$srcFactorColor);
    }

    public XrCompositionLayerAlphaBlendFB srcFactorColor(@EnumType(XrBlendFactorFB.class) int value) {
        segment.set(LAYOUT$srcFactorColor, OFFSET$srcFactorColor, value);
        return this;
    }

    public @EnumType(XrBlendFactorFB.class) int dstFactorColor() {
        return segment.get(LAYOUT$dstFactorColor, OFFSET$dstFactorColor);
    }

    public XrCompositionLayerAlphaBlendFB dstFactorColor(@EnumType(XrBlendFactorFB.class) int value) {
        segment.set(LAYOUT$dstFactorColor, OFFSET$dstFactorColor, value);
        return this;
    }

    public @EnumType(XrBlendFactorFB.class) int srcFactorAlpha() {
        return segment.get(LAYOUT$srcFactorAlpha, OFFSET$srcFactorAlpha);
    }

    public XrCompositionLayerAlphaBlendFB srcFactorAlpha(@EnumType(XrBlendFactorFB.class) int value) {
        segment.set(LAYOUT$srcFactorAlpha, OFFSET$srcFactorAlpha, value);
        return this;
    }

    public @EnumType(XrBlendFactorFB.class) int dstFactorAlpha() {
        return segment.get(LAYOUT$dstFactorAlpha, OFFSET$dstFactorAlpha);
    }

    public XrCompositionLayerAlphaBlendFB dstFactorAlpha(@EnumType(XrBlendFactorFB.class) int value) {
        segment.set(LAYOUT$dstFactorAlpha, OFFSET$dstFactorAlpha, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("srcFactorColor"),
        ValueLayout.JAVA_INT.withName("dstFactorColor"),
        ValueLayout.JAVA_INT.withName("srcFactorAlpha"),
        ValueLayout.JAVA_INT.withName("dstFactorAlpha")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$srcFactorColor = PathElement.groupElement("srcFactorColor");
    public static final PathElement PATH$dstFactorColor = PathElement.groupElement("dstFactorColor");
    public static final PathElement PATH$srcFactorAlpha = PathElement.groupElement("srcFactorAlpha");
    public static final PathElement PATH$dstFactorAlpha = PathElement.groupElement("dstFactorAlpha");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$srcFactorColor = (OfInt) LAYOUT.select(PATH$srcFactorColor);
    public static final OfInt LAYOUT$dstFactorColor = (OfInt) LAYOUT.select(PATH$dstFactorColor);
    public static final OfInt LAYOUT$srcFactorAlpha = (OfInt) LAYOUT.select(PATH$srcFactorAlpha);
    public static final OfInt LAYOUT$dstFactorAlpha = (OfInt) LAYOUT.select(PATH$dstFactorAlpha);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$srcFactorColor = LAYOUT$srcFactorColor.byteSize();
    public static final long SIZE$dstFactorColor = LAYOUT$dstFactorColor.byteSize();
    public static final long SIZE$srcFactorAlpha = LAYOUT$srcFactorAlpha.byteSize();
    public static final long SIZE$dstFactorAlpha = LAYOUT$dstFactorAlpha.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$srcFactorColor = LAYOUT.byteOffset(PATH$srcFactorColor);
    public static final long OFFSET$dstFactorColor = LAYOUT.byteOffset(PATH$dstFactorColor);
    public static final long OFFSET$srcFactorAlpha = LAYOUT.byteOffset(PATH$srcFactorAlpha);
    public static final long OFFSET$dstFactorAlpha = LAYOUT.byteOffset(PATH$dstFactorAlpha);
}

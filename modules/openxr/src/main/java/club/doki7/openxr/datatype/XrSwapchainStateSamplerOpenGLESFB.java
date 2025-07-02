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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainStateSamplerOpenGLESFB.html"><code>XrSwapchainStateSamplerOpenGLESFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSwapchainStateSamplerOpenGLESFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     EGLenum minFilter; // @link substring="minFilter" target="#minFilter"
///     EGLenum magFilter; // @link substring="magFilter" target="#magFilter"
///     EGLenum wrapModeS; // @link substring="wrapModeS" target="#wrapModeS"
///     EGLenum wrapModeT; // @link substring="wrapModeT" target="#wrapModeT"
///     EGLenum swizzleRed; // @link substring="swizzleRed" target="#swizzleRed"
///     EGLenum swizzleGreen; // @link substring="swizzleGreen" target="#swizzleGreen"
///     EGLenum swizzleBlue; // @link substring="swizzleBlue" target="#swizzleBlue"
///     EGLenum swizzleAlpha; // @link substring="swizzleAlpha" target="#swizzleAlpha"
///     float maxAnisotropy; // @link substring="maxAnisotropy" target="#maxAnisotropy"
///     XrColor4f borderColor; // @link substring="XrColor4f" target="XrColor4f" @link substring="borderColor" target="#borderColor"
/// } XrSwapchainStateSamplerOpenGLESFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB`
///
/// The {@code allocate} ({@link XrSwapchainStateSamplerOpenGLESFB#allocate(Arena)}, {@link XrSwapchainStateSamplerOpenGLESFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSwapchainStateSamplerOpenGLESFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainStateSamplerOpenGLESFB.html"><code>XrSwapchainStateSamplerOpenGLESFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSwapchainStateSamplerOpenGLESFB(@NotNull MemorySegment segment) implements IXrSwapchainStateSamplerOpenGLESFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainStateSamplerOpenGLESFB.html"><code>XrSwapchainStateSamplerOpenGLESFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSwapchainStateSamplerOpenGLESFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSwapchainStateSamplerOpenGLESFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSwapchainStateSamplerOpenGLESFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSwapchainStateSamplerOpenGLESFB, Iterable<XrSwapchainStateSamplerOpenGLESFB> {
        public long size() {
            return segment.byteSize() / XrSwapchainStateSamplerOpenGLESFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSwapchainStateSamplerOpenGLESFB at(long index) {
            return new XrSwapchainStateSamplerOpenGLESFB(segment.asSlice(index * XrSwapchainStateSamplerOpenGLESFB.BYTES, XrSwapchainStateSamplerOpenGLESFB.BYTES));
        }

        public XrSwapchainStateSamplerOpenGLESFB.Ptr at(long index, @NotNull Consumer<@NotNull XrSwapchainStateSamplerOpenGLESFB> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSwapchainStateSamplerOpenGLESFB value) {
            MemorySegment s = segment.asSlice(index * XrSwapchainStateSamplerOpenGLESFB.BYTES, XrSwapchainStateSamplerOpenGLESFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSwapchainStateSamplerOpenGLESFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSwapchainStateSamplerOpenGLESFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSwapchainStateSamplerOpenGLESFB.BYTES,
                (end - start) * XrSwapchainStateSamplerOpenGLESFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSwapchainStateSamplerOpenGLESFB.BYTES));
        }

        public XrSwapchainStateSamplerOpenGLESFB[] toArray() {
            XrSwapchainStateSamplerOpenGLESFB[] ret = new XrSwapchainStateSamplerOpenGLESFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSwapchainStateSamplerOpenGLESFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSwapchainStateSamplerOpenGLESFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSwapchainStateSamplerOpenGLESFB.BYTES;
            }

            @Override
            public XrSwapchainStateSamplerOpenGLESFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSwapchainStateSamplerOpenGLESFB ret = new XrSwapchainStateSamplerOpenGLESFB(segment.asSlice(0, XrSwapchainStateSamplerOpenGLESFB.BYTES));
                segment = segment.asSlice(XrSwapchainStateSamplerOpenGLESFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSwapchainStateSamplerOpenGLESFB allocate(Arena arena) {
        XrSwapchainStateSamplerOpenGLESFB ret = new XrSwapchainStateSamplerOpenGLESFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB);
        return ret;
    }

    public static XrSwapchainStateSamplerOpenGLESFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSwapchainStateSamplerOpenGLESFB.Ptr ret = new XrSwapchainStateSamplerOpenGLESFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB);
        }
        return ret;
    }

    public static XrSwapchainStateSamplerOpenGLESFB clone(Arena arena, XrSwapchainStateSamplerOpenGLESFB src) {
        XrSwapchainStateSamplerOpenGLESFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSwapchainStateSamplerOpenGLESFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSwapchainStateSamplerOpenGLESFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSwapchainStateSamplerOpenGLESFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("EGLenum") @Unsigned int minFilter() {
        return segment.get(LAYOUT$minFilter, OFFSET$minFilter);
    }

    public XrSwapchainStateSamplerOpenGLESFB minFilter(@NativeType("EGLenum") @Unsigned int value) {
        segment.set(LAYOUT$minFilter, OFFSET$minFilter, value);
        return this;
    }

    public @NativeType("EGLenum") @Unsigned int magFilter() {
        return segment.get(LAYOUT$magFilter, OFFSET$magFilter);
    }

    public XrSwapchainStateSamplerOpenGLESFB magFilter(@NativeType("EGLenum") @Unsigned int value) {
        segment.set(LAYOUT$magFilter, OFFSET$magFilter, value);
        return this;
    }

    public @NativeType("EGLenum") @Unsigned int wrapModeS() {
        return segment.get(LAYOUT$wrapModeS, OFFSET$wrapModeS);
    }

    public XrSwapchainStateSamplerOpenGLESFB wrapModeS(@NativeType("EGLenum") @Unsigned int value) {
        segment.set(LAYOUT$wrapModeS, OFFSET$wrapModeS, value);
        return this;
    }

    public @NativeType("EGLenum") @Unsigned int wrapModeT() {
        return segment.get(LAYOUT$wrapModeT, OFFSET$wrapModeT);
    }

    public XrSwapchainStateSamplerOpenGLESFB wrapModeT(@NativeType("EGLenum") @Unsigned int value) {
        segment.set(LAYOUT$wrapModeT, OFFSET$wrapModeT, value);
        return this;
    }

    public @NativeType("EGLenum") @Unsigned int swizzleRed() {
        return segment.get(LAYOUT$swizzleRed, OFFSET$swizzleRed);
    }

    public XrSwapchainStateSamplerOpenGLESFB swizzleRed(@NativeType("EGLenum") @Unsigned int value) {
        segment.set(LAYOUT$swizzleRed, OFFSET$swizzleRed, value);
        return this;
    }

    public @NativeType("EGLenum") @Unsigned int swizzleGreen() {
        return segment.get(LAYOUT$swizzleGreen, OFFSET$swizzleGreen);
    }

    public XrSwapchainStateSamplerOpenGLESFB swizzleGreen(@NativeType("EGLenum") @Unsigned int value) {
        segment.set(LAYOUT$swizzleGreen, OFFSET$swizzleGreen, value);
        return this;
    }

    public @NativeType("EGLenum") @Unsigned int swizzleBlue() {
        return segment.get(LAYOUT$swizzleBlue, OFFSET$swizzleBlue);
    }

    public XrSwapchainStateSamplerOpenGLESFB swizzleBlue(@NativeType("EGLenum") @Unsigned int value) {
        segment.set(LAYOUT$swizzleBlue, OFFSET$swizzleBlue, value);
        return this;
    }

    public @NativeType("EGLenum") @Unsigned int swizzleAlpha() {
        return segment.get(LAYOUT$swizzleAlpha, OFFSET$swizzleAlpha);
    }

    public XrSwapchainStateSamplerOpenGLESFB swizzleAlpha(@NativeType("EGLenum") @Unsigned int value) {
        segment.set(LAYOUT$swizzleAlpha, OFFSET$swizzleAlpha, value);
        return this;
    }

    public float maxAnisotropy() {
        return segment.get(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy);
    }

    public XrSwapchainStateSamplerOpenGLESFB maxAnisotropy(float value) {
        segment.set(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy, value);
        return this;
    }

    public @NotNull XrColor4f borderColor() {
        return new XrColor4f(segment.asSlice(OFFSET$borderColor, LAYOUT$borderColor));
    }

    public XrSwapchainStateSamplerOpenGLESFB borderColor(@NotNull XrColor4f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$borderColor, SIZE$borderColor);
        return this;
    }

    public XrSwapchainStateSamplerOpenGLESFB borderColor(Consumer<@NotNull XrColor4f> consumer) {
        consumer.accept(borderColor());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("minFilter"),
        ValueLayout.JAVA_INT.withName("magFilter"),
        ValueLayout.JAVA_INT.withName("wrapModeS"),
        ValueLayout.JAVA_INT.withName("wrapModeT"),
        ValueLayout.JAVA_INT.withName("swizzleRed"),
        ValueLayout.JAVA_INT.withName("swizzleGreen"),
        ValueLayout.JAVA_INT.withName("swizzleBlue"),
        ValueLayout.JAVA_INT.withName("swizzleAlpha"),
        ValueLayout.JAVA_FLOAT.withName("maxAnisotropy"),
        XrColor4f.LAYOUT.withName("borderColor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$minFilter = PathElement.groupElement("minFilter");
    public static final PathElement PATH$magFilter = PathElement.groupElement("magFilter");
    public static final PathElement PATH$wrapModeS = PathElement.groupElement("wrapModeS");
    public static final PathElement PATH$wrapModeT = PathElement.groupElement("wrapModeT");
    public static final PathElement PATH$swizzleRed = PathElement.groupElement("swizzleRed");
    public static final PathElement PATH$swizzleGreen = PathElement.groupElement("swizzleGreen");
    public static final PathElement PATH$swizzleBlue = PathElement.groupElement("swizzleBlue");
    public static final PathElement PATH$swizzleAlpha = PathElement.groupElement("swizzleAlpha");
    public static final PathElement PATH$maxAnisotropy = PathElement.groupElement("maxAnisotropy");
    public static final PathElement PATH$borderColor = PathElement.groupElement("borderColor");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$minFilter = (OfInt) LAYOUT.select(PATH$minFilter);
    public static final OfInt LAYOUT$magFilter = (OfInt) LAYOUT.select(PATH$magFilter);
    public static final OfInt LAYOUT$wrapModeS = (OfInt) LAYOUT.select(PATH$wrapModeS);
    public static final OfInt LAYOUT$wrapModeT = (OfInt) LAYOUT.select(PATH$wrapModeT);
    public static final OfInt LAYOUT$swizzleRed = (OfInt) LAYOUT.select(PATH$swizzleRed);
    public static final OfInt LAYOUT$swizzleGreen = (OfInt) LAYOUT.select(PATH$swizzleGreen);
    public static final OfInt LAYOUT$swizzleBlue = (OfInt) LAYOUT.select(PATH$swizzleBlue);
    public static final OfInt LAYOUT$swizzleAlpha = (OfInt) LAYOUT.select(PATH$swizzleAlpha);
    public static final OfFloat LAYOUT$maxAnisotropy = (OfFloat) LAYOUT.select(PATH$maxAnisotropy);
    public static final StructLayout LAYOUT$borderColor = (StructLayout) LAYOUT.select(PATH$borderColor);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$minFilter = LAYOUT$minFilter.byteSize();
    public static final long SIZE$magFilter = LAYOUT$magFilter.byteSize();
    public static final long SIZE$wrapModeS = LAYOUT$wrapModeS.byteSize();
    public static final long SIZE$wrapModeT = LAYOUT$wrapModeT.byteSize();
    public static final long SIZE$swizzleRed = LAYOUT$swizzleRed.byteSize();
    public static final long SIZE$swizzleGreen = LAYOUT$swizzleGreen.byteSize();
    public static final long SIZE$swizzleBlue = LAYOUT$swizzleBlue.byteSize();
    public static final long SIZE$swizzleAlpha = LAYOUT$swizzleAlpha.byteSize();
    public static final long SIZE$maxAnisotropy = LAYOUT$maxAnisotropy.byteSize();
    public static final long SIZE$borderColor = LAYOUT$borderColor.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$minFilter = LAYOUT.byteOffset(PATH$minFilter);
    public static final long OFFSET$magFilter = LAYOUT.byteOffset(PATH$magFilter);
    public static final long OFFSET$wrapModeS = LAYOUT.byteOffset(PATH$wrapModeS);
    public static final long OFFSET$wrapModeT = LAYOUT.byteOffset(PATH$wrapModeT);
    public static final long OFFSET$swizzleRed = LAYOUT.byteOffset(PATH$swizzleRed);
    public static final long OFFSET$swizzleGreen = LAYOUT.byteOffset(PATH$swizzleGreen);
    public static final long OFFSET$swizzleBlue = LAYOUT.byteOffset(PATH$swizzleBlue);
    public static final long OFFSET$swizzleAlpha = LAYOUT.byteOffset(PATH$swizzleAlpha);
    public static final long OFFSET$maxAnisotropy = LAYOUT.byteOffset(PATH$maxAnisotropy);
    public static final long OFFSET$borderColor = LAYOUT.byteOffset(PATH$borderColor);
}

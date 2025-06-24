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
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainStateSamplerVulkanFB.html"><code>XrSwapchainStateSamplerVulkanFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSwapchainStateSamplerVulkanFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     VkFilter minFilter; // @link substring="VkFilter" target="VkFilter" @link substring="minFilter" target="#minFilter"
///     VkFilter magFilter; // @link substring="VkFilter" target="VkFilter" @link substring="magFilter" target="#magFilter"
///     VkSamplerMipmapMode mipmapMode; // @link substring="VkSamplerMipmapMode" target="VkSamplerMipmapMode" @link substring="mipmapMode" target="#mipmapMode"
///     VkSamplerAddressMode wrapModeS; // @link substring="VkSamplerAddressMode" target="VkSamplerAddressMode" @link substring="wrapModeS" target="#wrapModeS"
///     VkSamplerAddressMode wrapModeT; // @link substring="VkSamplerAddressMode" target="VkSamplerAddressMode" @link substring="wrapModeT" target="#wrapModeT"
///     VkComponentSwizzle swizzleRed; // @link substring="VkComponentSwizzle" target="VkComponentSwizzle" @link substring="swizzleRed" target="#swizzleRed"
///     VkComponentSwizzle swizzleGreen; // @link substring="VkComponentSwizzle" target="VkComponentSwizzle" @link substring="swizzleGreen" target="#swizzleGreen"
///     VkComponentSwizzle swizzleBlue; // @link substring="VkComponentSwizzle" target="VkComponentSwizzle" @link substring="swizzleBlue" target="#swizzleBlue"
///     VkComponentSwizzle swizzleAlpha; // @link substring="VkComponentSwizzle" target="VkComponentSwizzle" @link substring="swizzleAlpha" target="#swizzleAlpha"
///     float maxAnisotropy; // @link substring="maxAnisotropy" target="#maxAnisotropy"
///     XrColor4f borderColor; // @link substring="XrColor4f" target="XrColor4f" @link substring="borderColor" target="#borderColor"
/// } XrSwapchainStateSamplerVulkanFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB`
///
/// The {@code allocate} ({@link XrSwapchainStateSamplerVulkanFB#allocate(Arena)}, {@link XrSwapchainStateSamplerVulkanFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSwapchainStateSamplerVulkanFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainStateSamplerVulkanFB.html"><code>XrSwapchainStateSamplerVulkanFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSwapchainStateSamplerVulkanFB(@NotNull MemorySegment segment) implements IXrSwapchainStateSamplerVulkanFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainStateSamplerVulkanFB.html"><code>XrSwapchainStateSamplerVulkanFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSwapchainStateSamplerVulkanFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSwapchainStateSamplerVulkanFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSwapchainStateSamplerVulkanFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSwapchainStateSamplerVulkanFB, Iterable<XrSwapchainStateSamplerVulkanFB> {
        public long size() {
            return segment.byteSize() / XrSwapchainStateSamplerVulkanFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSwapchainStateSamplerVulkanFB at(long index) {
            return new XrSwapchainStateSamplerVulkanFB(segment.asSlice(index * XrSwapchainStateSamplerVulkanFB.BYTES, XrSwapchainStateSamplerVulkanFB.BYTES));
        }

        public void write(long index, @NotNull XrSwapchainStateSamplerVulkanFB value) {
            MemorySegment s = segment.asSlice(index * XrSwapchainStateSamplerVulkanFB.BYTES, XrSwapchainStateSamplerVulkanFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSwapchainStateSamplerVulkanFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSwapchainStateSamplerVulkanFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSwapchainStateSamplerVulkanFB.BYTES,
                (end - start) * XrSwapchainStateSamplerVulkanFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSwapchainStateSamplerVulkanFB.BYTES));
        }

        public XrSwapchainStateSamplerVulkanFB[] toArray() {
            XrSwapchainStateSamplerVulkanFB[] ret = new XrSwapchainStateSamplerVulkanFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSwapchainStateSamplerVulkanFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSwapchainStateSamplerVulkanFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSwapchainStateSamplerVulkanFB.BYTES;
            }

            @Override
            public XrSwapchainStateSamplerVulkanFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSwapchainStateSamplerVulkanFB ret = new XrSwapchainStateSamplerVulkanFB(segment.asSlice(0, XrSwapchainStateSamplerVulkanFB.BYTES));
                segment = segment.asSlice(XrSwapchainStateSamplerVulkanFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSwapchainStateSamplerVulkanFB allocate(Arena arena) {
        XrSwapchainStateSamplerVulkanFB ret = new XrSwapchainStateSamplerVulkanFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB);
        return ret;
    }

    public static XrSwapchainStateSamplerVulkanFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSwapchainStateSamplerVulkanFB.Ptr ret = new XrSwapchainStateSamplerVulkanFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB);
        }
        return ret;
    }

    public static XrSwapchainStateSamplerVulkanFB clone(Arena arena, XrSwapchainStateSamplerVulkanFB src) {
        XrSwapchainStateSamplerVulkanFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSwapchainStateSamplerVulkanFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSwapchainStateSamplerVulkanFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSwapchainStateSamplerVulkanFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(VkFilter.class) int minFilter() {
        return segment.get(LAYOUT$minFilter, OFFSET$minFilter);
    }

    public XrSwapchainStateSamplerVulkanFB minFilter(@EnumType(VkFilter.class) int value) {
        segment.set(LAYOUT$minFilter, OFFSET$minFilter, value);
        return this;
    }

    public @EnumType(VkFilter.class) int magFilter() {
        return segment.get(LAYOUT$magFilter, OFFSET$magFilter);
    }

    public XrSwapchainStateSamplerVulkanFB magFilter(@EnumType(VkFilter.class) int value) {
        segment.set(LAYOUT$magFilter, OFFSET$magFilter, value);
        return this;
    }

    public @EnumType(VkSamplerMipmapMode.class) int mipmapMode() {
        return segment.get(LAYOUT$mipmapMode, OFFSET$mipmapMode);
    }

    public XrSwapchainStateSamplerVulkanFB mipmapMode(@EnumType(VkSamplerMipmapMode.class) int value) {
        segment.set(LAYOUT$mipmapMode, OFFSET$mipmapMode, value);
        return this;
    }

    public @EnumType(VkSamplerAddressMode.class) int wrapModeS() {
        return segment.get(LAYOUT$wrapModeS, OFFSET$wrapModeS);
    }

    public XrSwapchainStateSamplerVulkanFB wrapModeS(@EnumType(VkSamplerAddressMode.class) int value) {
        segment.set(LAYOUT$wrapModeS, OFFSET$wrapModeS, value);
        return this;
    }

    public @EnumType(VkSamplerAddressMode.class) int wrapModeT() {
        return segment.get(LAYOUT$wrapModeT, OFFSET$wrapModeT);
    }

    public XrSwapchainStateSamplerVulkanFB wrapModeT(@EnumType(VkSamplerAddressMode.class) int value) {
        segment.set(LAYOUT$wrapModeT, OFFSET$wrapModeT, value);
        return this;
    }

    public @EnumType(VkComponentSwizzle.class) int swizzleRed() {
        return segment.get(LAYOUT$swizzleRed, OFFSET$swizzleRed);
    }

    public XrSwapchainStateSamplerVulkanFB swizzleRed(@EnumType(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$swizzleRed, OFFSET$swizzleRed, value);
        return this;
    }

    public @EnumType(VkComponentSwizzle.class) int swizzleGreen() {
        return segment.get(LAYOUT$swizzleGreen, OFFSET$swizzleGreen);
    }

    public XrSwapchainStateSamplerVulkanFB swizzleGreen(@EnumType(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$swizzleGreen, OFFSET$swizzleGreen, value);
        return this;
    }

    public @EnumType(VkComponentSwizzle.class) int swizzleBlue() {
        return segment.get(LAYOUT$swizzleBlue, OFFSET$swizzleBlue);
    }

    public XrSwapchainStateSamplerVulkanFB swizzleBlue(@EnumType(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$swizzleBlue, OFFSET$swizzleBlue, value);
        return this;
    }

    public @EnumType(VkComponentSwizzle.class) int swizzleAlpha() {
        return segment.get(LAYOUT$swizzleAlpha, OFFSET$swizzleAlpha);
    }

    public XrSwapchainStateSamplerVulkanFB swizzleAlpha(@EnumType(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$swizzleAlpha, OFFSET$swizzleAlpha, value);
        return this;
    }

    public float maxAnisotropy() {
        return segment.get(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy);
    }

    public XrSwapchainStateSamplerVulkanFB maxAnisotropy(float value) {
        segment.set(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy, value);
        return this;
    }

    public @NotNull XrColor4f borderColor() {
        return new XrColor4f(segment.asSlice(OFFSET$borderColor, LAYOUT$borderColor));
    }

    public XrSwapchainStateSamplerVulkanFB borderColor(@NotNull XrColor4f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$borderColor, SIZE$borderColor);
        return this;
    }

    public XrSwapchainStateSamplerVulkanFB borderColor(Consumer<@NotNull XrColor4f> consumer) {
        consumer.accept(borderColor());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("minFilter"),
        ValueLayout.JAVA_INT.withName("magFilter"),
        ValueLayout.JAVA_INT.withName("mipmapMode"),
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
    public static final PathElement PATH$mipmapMode = PathElement.groupElement("mipmapMode");
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
    public static final OfInt LAYOUT$mipmapMode = (OfInt) LAYOUT.select(PATH$mipmapMode);
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
    public static final long SIZE$mipmapMode = LAYOUT$mipmapMode.byteSize();
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
    public static final long OFFSET$mipmapMode = LAYOUT.byteOffset(PATH$mipmapMode);
    public static final long OFFSET$wrapModeS = LAYOUT.byteOffset(PATH$wrapModeS);
    public static final long OFFSET$wrapModeT = LAYOUT.byteOffset(PATH$wrapModeT);
    public static final long OFFSET$swizzleRed = LAYOUT.byteOffset(PATH$swizzleRed);
    public static final long OFFSET$swizzleGreen = LAYOUT.byteOffset(PATH$swizzleGreen);
    public static final long OFFSET$swizzleBlue = LAYOUT.byteOffset(PATH$swizzleBlue);
    public static final long OFFSET$swizzleAlpha = LAYOUT.byteOffset(PATH$swizzleAlpha);
    public static final long OFFSET$maxAnisotropy = LAYOUT.byteOffset(PATH$maxAnisotropy);
    public static final long OFFSET$borderColor = LAYOUT.byteOffset(PATH$borderColor);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainCreateInfo.html"><code>XrSwapchainCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSwapchainCreateInfo {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSwapchainCreateFlags createFlags; // optional // @link substring="XrSwapchainCreateFlags" target="XrSwapchainCreateFlags" @link substring="createFlags" target="#createFlags"
///     XrSwapchainUsageFlags usageFlags; // optional // @link substring="XrSwapchainUsageFlags" target="XrSwapchainUsageFlags" @link substring="usageFlags" target="#usageFlags"
///     int64_t format; // @link substring="format" target="#format"
///     uint32_t sampleCount; // @link substring="sampleCount" target="#sampleCount"
///     uint32_t width; // @link substring="width" target="#width"
///     uint32_t height; // @link substring="height" target="#height"
///     uint32_t faceCount; // @link substring="faceCount" target="#faceCount"
///     uint32_t arraySize; // @link substring="arraySize" target="#arraySize"
///     uint32_t mipCount; // @link substring="mipCount" target="#mipCount"
/// } XrSwapchainCreateInfo;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SWAPCHAIN_CREATE_INFO`
///
/// The {@code allocate} ({@link XrSwapchainCreateInfo#allocate(Arena)}, {@link XrSwapchainCreateInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSwapchainCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainCreateInfo.html"><code>XrSwapchainCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSwapchainCreateInfo(@NotNull MemorySegment segment) implements IXrSwapchainCreateInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainCreateInfo.html"><code>XrSwapchainCreateInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSwapchainCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSwapchainCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSwapchainCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSwapchainCreateInfo, Iterable<XrSwapchainCreateInfo> {
        public long size() {
            return segment.byteSize() / XrSwapchainCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSwapchainCreateInfo at(long index) {
            return new XrSwapchainCreateInfo(segment.asSlice(index * XrSwapchainCreateInfo.BYTES, XrSwapchainCreateInfo.BYTES));
        }

        public XrSwapchainCreateInfo.Ptr at(long index, @NotNull Consumer<@NotNull XrSwapchainCreateInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSwapchainCreateInfo value) {
            MemorySegment s = segment.asSlice(index * XrSwapchainCreateInfo.BYTES, XrSwapchainCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSwapchainCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSwapchainCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSwapchainCreateInfo.BYTES,
                (end - start) * XrSwapchainCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSwapchainCreateInfo.BYTES));
        }

        public XrSwapchainCreateInfo[] toArray() {
            XrSwapchainCreateInfo[] ret = new XrSwapchainCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSwapchainCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSwapchainCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSwapchainCreateInfo.BYTES;
            }

            @Override
            public XrSwapchainCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSwapchainCreateInfo ret = new XrSwapchainCreateInfo(segment.asSlice(0, XrSwapchainCreateInfo.BYTES));
                segment = segment.asSlice(XrSwapchainCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSwapchainCreateInfo allocate(Arena arena) {
        XrSwapchainCreateInfo ret = new XrSwapchainCreateInfo(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SWAPCHAIN_CREATE_INFO);
        return ret;
    }

    public static XrSwapchainCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSwapchainCreateInfo.Ptr ret = new XrSwapchainCreateInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SWAPCHAIN_CREATE_INFO);
        }
        return ret;
    }

    public static XrSwapchainCreateInfo clone(Arena arena, XrSwapchainCreateInfo src) {
        XrSwapchainCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SWAPCHAIN_CREATE_INFO);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSwapchainCreateInfo type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSwapchainCreateInfo next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSwapchainCreateInfo next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrSwapchainCreateFlags.class) long createFlags() {
        return segment.get(LAYOUT$createFlags, OFFSET$createFlags);
    }

    public XrSwapchainCreateInfo createFlags(@Bitmask(XrSwapchainCreateFlags.class) long value) {
        segment.set(LAYOUT$createFlags, OFFSET$createFlags, value);
        return this;
    }

    public @Bitmask(XrSwapchainUsageFlags.class) long usageFlags() {
        return segment.get(LAYOUT$usageFlags, OFFSET$usageFlags);
    }

    public XrSwapchainCreateInfo usageFlags(@Bitmask(XrSwapchainUsageFlags.class) long value) {
        segment.set(LAYOUT$usageFlags, OFFSET$usageFlags, value);
        return this;
    }

    public long format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public XrSwapchainCreateInfo format(long value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @Unsigned int sampleCount() {
        return segment.get(LAYOUT$sampleCount, OFFSET$sampleCount);
    }

    public XrSwapchainCreateInfo sampleCount(@Unsigned int value) {
        segment.set(LAYOUT$sampleCount, OFFSET$sampleCount, value);
        return this;
    }

    public @Unsigned int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public XrSwapchainCreateInfo width(@Unsigned int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
        return this;
    }

    public @Unsigned int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public XrSwapchainCreateInfo height(@Unsigned int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
        return this;
    }

    public @Unsigned int faceCount() {
        return segment.get(LAYOUT$faceCount, OFFSET$faceCount);
    }

    public XrSwapchainCreateInfo faceCount(@Unsigned int value) {
        segment.set(LAYOUT$faceCount, OFFSET$faceCount, value);
        return this;
    }

    public @Unsigned int arraySize() {
        return segment.get(LAYOUT$arraySize, OFFSET$arraySize);
    }

    public XrSwapchainCreateInfo arraySize(@Unsigned int value) {
        segment.set(LAYOUT$arraySize, OFFSET$arraySize, value);
        return this;
    }

    public @Unsigned int mipCount() {
        return segment.get(LAYOUT$mipCount, OFFSET$mipCount);
    }

    public XrSwapchainCreateInfo mipCount(@Unsigned int value) {
        segment.set(LAYOUT$mipCount, OFFSET$mipCount, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("createFlags"),
        ValueLayout.JAVA_LONG.withName("usageFlags"),
        ValueLayout.JAVA_LONG.withName("format"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("faceCount"),
        ValueLayout.JAVA_INT.withName("arraySize"),
        ValueLayout.JAVA_INT.withName("mipCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$createFlags = PathElement.groupElement("createFlags");
    public static final PathElement PATH$usageFlags = PathElement.groupElement("usageFlags");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$sampleCount = PathElement.groupElement("sampleCount");
    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$faceCount = PathElement.groupElement("faceCount");
    public static final PathElement PATH$arraySize = PathElement.groupElement("arraySize");
    public static final PathElement PATH$mipCount = PathElement.groupElement("mipCount");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$createFlags = (OfLong) LAYOUT.select(PATH$createFlags);
    public static final OfLong LAYOUT$usageFlags = (OfLong) LAYOUT.select(PATH$usageFlags);
    public static final OfLong LAYOUT$format = (OfLong) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$sampleCount = (OfInt) LAYOUT.select(PATH$sampleCount);
    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$faceCount = (OfInt) LAYOUT.select(PATH$faceCount);
    public static final OfInt LAYOUT$arraySize = (OfInt) LAYOUT.select(PATH$arraySize);
    public static final OfInt LAYOUT$mipCount = (OfInt) LAYOUT.select(PATH$mipCount);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$createFlags = LAYOUT$createFlags.byteSize();
    public static final long SIZE$usageFlags = LAYOUT$usageFlags.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$sampleCount = LAYOUT$sampleCount.byteSize();
    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$faceCount = LAYOUT$faceCount.byteSize();
    public static final long SIZE$arraySize = LAYOUT$arraySize.byteSize();
    public static final long SIZE$mipCount = LAYOUT$mipCount.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$createFlags = LAYOUT.byteOffset(PATH$createFlags);
    public static final long OFFSET$usageFlags = LAYOUT.byteOffset(PATH$usageFlags);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$sampleCount = LAYOUT.byteOffset(PATH$sampleCount);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$faceCount = LAYOUT.byteOffset(PATH$faceCount);
    public static final long OFFSET$arraySize = LAYOUT.byteOffset(PATH$arraySize);
    public static final long OFFSET$mipCount = LAYOUT.byteOffset(PATH$mipCount);
}

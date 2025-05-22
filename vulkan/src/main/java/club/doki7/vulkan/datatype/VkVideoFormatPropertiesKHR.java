package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoFormatPropertiesKHR.html"><code>VkVideoFormatPropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoFormatPropertiesKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkFormat format; // @link substring="VkFormat" target="VkFormat" @link substring="format" target="#format"
///     VkComponentMapping componentMapping; // @link substring="VkComponentMapping" target="VkComponentMapping" @link substring="componentMapping" target="#componentMapping"
///     VkImageCreateFlags imageCreateFlags; // @link substring="VkImageCreateFlags" target="VkImageCreateFlags" @link substring="imageCreateFlags" target="#imageCreateFlags"
///     VkImageType imageType; // @link substring="VkImageType" target="VkImageType" @link substring="imageType" target="#imageType"
///     VkImageTiling imageTiling; // @link substring="VkImageTiling" target="VkImageTiling" @link substring="imageTiling" target="#imageTiling"
///     VkImageUsageFlags imageUsageFlags; // @link substring="VkImageUsageFlags" target="VkImageUsageFlags" @link substring="imageUsageFlags" target="#imageUsageFlags"
/// } VkVideoFormatPropertiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR`
///
/// The {@code allocate} ({@link VkVideoFormatPropertiesKHR#allocate(Arena)}, {@link VkVideoFormatPropertiesKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoFormatPropertiesKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoFormatPropertiesKHR.html"><code>VkVideoFormatPropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoFormatPropertiesKHR(@NotNull MemorySegment segment) implements IVkVideoFormatPropertiesKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoFormatPropertiesKHR.html"><code>VkVideoFormatPropertiesKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoFormatPropertiesKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoFormatPropertiesKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoFormatPropertiesKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoFormatPropertiesKHR {
        public long size() {
            return segment.byteSize() / VkVideoFormatPropertiesKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoFormatPropertiesKHR at(long index) {
            return new VkVideoFormatPropertiesKHR(segment.asSlice(index * VkVideoFormatPropertiesKHR.BYTES, VkVideoFormatPropertiesKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoFormatPropertiesKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoFormatPropertiesKHR.BYTES, VkVideoFormatPropertiesKHR.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkVideoFormatPropertiesKHR.BYTES, VkVideoFormatPropertiesKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoFormatPropertiesKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoFormatPropertiesKHR.BYTES,
                (end - start) * VkVideoFormatPropertiesKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoFormatPropertiesKHR.BYTES));
        }
    }

    public static VkVideoFormatPropertiesKHR allocate(Arena arena) {
        VkVideoFormatPropertiesKHR ret = new VkVideoFormatPropertiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_FORMAT_PROPERTIES_KHR);
        return ret;
    }

    public static VkVideoFormatPropertiesKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoFormatPropertiesKHR.Ptr ret = new VkVideoFormatPropertiesKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_FORMAT_PROPERTIES_KHR);
        }
        return ret;
    }

    public static VkVideoFormatPropertiesKHR clone(Arena arena, VkVideoFormatPropertiesKHR src) {
        VkVideoFormatPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_FORMAT_PROPERTIES_KHR);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @NotNull VkComponentMapping componentMapping() {
        return new VkComponentMapping(segment.asSlice(OFFSET$componentMapping, LAYOUT$componentMapping));
    }

    public void componentMapping(@NotNull VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$componentMapping, SIZE$componentMapping);
    }

    public @enumtype(VkImageCreateFlags.class) int imageCreateFlags() {
        return segment.get(LAYOUT$imageCreateFlags, OFFSET$imageCreateFlags);
    }

    public void imageCreateFlags(@enumtype(VkImageCreateFlags.class) int value) {
        segment.set(LAYOUT$imageCreateFlags, OFFSET$imageCreateFlags, value);
    }

    public @enumtype(VkImageType.class) int imageType() {
        return segment.get(LAYOUT$imageType, OFFSET$imageType);
    }

    public void imageType(@enumtype(VkImageType.class) int value) {
        segment.set(LAYOUT$imageType, OFFSET$imageType, value);
    }

    public @enumtype(VkImageTiling.class) int imageTiling() {
        return segment.get(LAYOUT$imageTiling, OFFSET$imageTiling);
    }

    public void imageTiling(@enumtype(VkImageTiling.class) int value) {
        segment.set(LAYOUT$imageTiling, OFFSET$imageTiling, value);
    }

    public @enumtype(VkImageUsageFlags.class) int imageUsageFlags() {
        return segment.get(LAYOUT$imageUsageFlags, OFFSET$imageUsageFlags);
    }

    public void imageUsageFlags(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$imageUsageFlags, OFFSET$imageUsageFlags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        VkComponentMapping.LAYOUT.withName("componentMapping"),
        ValueLayout.JAVA_INT.withName("imageCreateFlags"),
        ValueLayout.JAVA_INT.withName("imageType"),
        ValueLayout.JAVA_INT.withName("imageTiling"),
        ValueLayout.JAVA_INT.withName("imageUsageFlags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$componentMapping = PathElement.groupElement("componentMapping");
    public static final PathElement PATH$imageCreateFlags = PathElement.groupElement("imageCreateFlags");
    public static final PathElement PATH$imageType = PathElement.groupElement("imageType");
    public static final PathElement PATH$imageTiling = PathElement.groupElement("imageTiling");
    public static final PathElement PATH$imageUsageFlags = PathElement.groupElement("imageUsageFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final StructLayout LAYOUT$componentMapping = (StructLayout) LAYOUT.select(PATH$componentMapping);
    public static final OfInt LAYOUT$imageCreateFlags = (OfInt) LAYOUT.select(PATH$imageCreateFlags);
    public static final OfInt LAYOUT$imageType = (OfInt) LAYOUT.select(PATH$imageType);
    public static final OfInt LAYOUT$imageTiling = (OfInt) LAYOUT.select(PATH$imageTiling);
    public static final OfInt LAYOUT$imageUsageFlags = (OfInt) LAYOUT.select(PATH$imageUsageFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$componentMapping = LAYOUT$componentMapping.byteSize();
    public static final long SIZE$imageCreateFlags = LAYOUT$imageCreateFlags.byteSize();
    public static final long SIZE$imageType = LAYOUT$imageType.byteSize();
    public static final long SIZE$imageTiling = LAYOUT$imageTiling.byteSize();
    public static final long SIZE$imageUsageFlags = LAYOUT$imageUsageFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$componentMapping = LAYOUT.byteOffset(PATH$componentMapping);
    public static final long OFFSET$imageCreateFlags = LAYOUT.byteOffset(PATH$imageCreateFlags);
    public static final long OFFSET$imageType = LAYOUT.byteOffset(PATH$imageType);
    public static final long OFFSET$imageTiling = LAYOUT.byteOffset(PATH$imageTiling);
    public static final long OFFSET$imageUsageFlags = LAYOUT.byteOffset(PATH$imageUsageFlags);
}

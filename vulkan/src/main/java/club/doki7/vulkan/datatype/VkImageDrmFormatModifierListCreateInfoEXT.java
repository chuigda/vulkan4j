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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageDrmFormatModifierListCreateInfoEXT.html"><code>VkImageDrmFormatModifierListCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageDrmFormatModifierListCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t drmFormatModifierCount; // @link substring="drmFormatModifierCount" target="#drmFormatModifierCount"
///     uint64_t const* pDrmFormatModifiers; // @link substring="pDrmFormatModifiers" target="#pDrmFormatModifiers"
/// } VkImageDrmFormatModifierListCreateInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkImageDrmFormatModifierListCreateInfoEXT#allocate(Arena)}, {@link VkImageDrmFormatModifierListCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImageDrmFormatModifierListCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageDrmFormatModifierListCreateInfoEXT.html"><code>VkImageDrmFormatModifierListCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageDrmFormatModifierListCreateInfoEXT(@NotNull MemorySegment segment) implements IVkImageDrmFormatModifierListCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageDrmFormatModifierListCreateInfoEXT.html"><code>VkImageDrmFormatModifierListCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkImageDrmFormatModifierListCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkImageDrmFormatModifierListCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkImageDrmFormatModifierListCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkImageDrmFormatModifierListCreateInfoEXT {
        public long size() {
            return segment.byteSize() / VkImageDrmFormatModifierListCreateInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkImageDrmFormatModifierListCreateInfoEXT at(long index) {
            return new VkImageDrmFormatModifierListCreateInfoEXT(segment.asSlice(index * VkImageDrmFormatModifierListCreateInfoEXT.BYTES, VkImageDrmFormatModifierListCreateInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkImageDrmFormatModifierListCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkImageDrmFormatModifierListCreateInfoEXT.BYTES, VkImageDrmFormatModifierListCreateInfoEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkImageDrmFormatModifierListCreateInfoEXT.BYTES, VkImageDrmFormatModifierListCreateInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkImageDrmFormatModifierListCreateInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkImageDrmFormatModifierListCreateInfoEXT.BYTES,
                (end - start) * VkImageDrmFormatModifierListCreateInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkImageDrmFormatModifierListCreateInfoEXT.BYTES));
        }

        public VkImageDrmFormatModifierListCreateInfoEXT[] toArray() {
            VkImageDrmFormatModifierListCreateInfoEXT[] ret = new VkImageDrmFormatModifierListCreateInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT allocate(Arena arena) {
        VkImageDrmFormatModifierListCreateInfoEXT ret = new VkImageDrmFormatModifierListCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
        return ret;
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageDrmFormatModifierListCreateInfoEXT.Ptr ret = new VkImageDrmFormatModifierListCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT clone(Arena arena, VkImageDrmFormatModifierListCreateInfoEXT src) {
        VkImageDrmFormatModifierListCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
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

    public @unsigned int drmFormatModifierCount() {
        return segment.get(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount);
    }

    public void drmFormatModifierCount(@unsigned int value) {
        segment.set(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pDrmFormatModifiers() {
        MemorySegment s = pDrmFormatModifiersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pDrmFormatModifiers(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDrmFormatModifiersRaw(s);
    }

    public @pointer(comment="long*") MemorySegment pDrmFormatModifiersRaw() {
        return segment.get(LAYOUT$pDrmFormatModifiers, OFFSET$pDrmFormatModifiers);
    }

    public void pDrmFormatModifiersRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pDrmFormatModifiers, OFFSET$pDrmFormatModifiers, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pDrmFormatModifiers")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$drmFormatModifierCount = PathElement.groupElement("drmFormatModifierCount");
    public static final PathElement PATH$pDrmFormatModifiers = PathElement.groupElement("pDrmFormatModifiers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$drmFormatModifierCount = (OfInt) LAYOUT.select(PATH$drmFormatModifierCount);
    public static final AddressLayout LAYOUT$pDrmFormatModifiers = (AddressLayout) LAYOUT.select(PATH$pDrmFormatModifiers);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$drmFormatModifierCount = LAYOUT$drmFormatModifierCount.byteSize();
    public static final long SIZE$pDrmFormatModifiers = LAYOUT$pDrmFormatModifiers.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$drmFormatModifierCount = LAYOUT.byteOffset(PATH$drmFormatModifierCount);
    public static final long OFFSET$pDrmFormatModifiers = LAYOUT.byteOffset(PATH$pDrmFormatModifiers);
}

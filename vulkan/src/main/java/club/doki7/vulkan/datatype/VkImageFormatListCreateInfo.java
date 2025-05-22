package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatListCreateInfo.html"><code>VkImageFormatListCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageFormatListCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t viewFormatCount; // optional // @link substring="viewFormatCount" target="#viewFormatCount"
///     VkFormat const* pViewFormats; // @link substring="VkFormat" target="VkFormat" @link substring="pViewFormats" target="#pViewFormats"
/// } VkImageFormatListCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO`
///
/// The {@code allocate} ({@link VkImageFormatListCreateInfo#allocate(Arena)}, {@link VkImageFormatListCreateInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImageFormatListCreateInfo#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatListCreateInfo.html"><code>VkImageFormatListCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageFormatListCreateInfo(@NotNull MemorySegment segment) implements IVkImageFormatListCreateInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatListCreateInfo.html"><code>VkImageFormatListCreateInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkImageFormatListCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkImageFormatListCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkImageFormatListCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkImageFormatListCreateInfo {
        public long size() {
            return segment.byteSize() / VkImageFormatListCreateInfo.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkImageFormatListCreateInfo at(long index) {
            return new VkImageFormatListCreateInfo(segment.asSlice(index * VkImageFormatListCreateInfo.BYTES, VkImageFormatListCreateInfo.BYTES));
        }
        public void write(long index, @NotNull VkImageFormatListCreateInfo value) {
            MemorySegment s = segment.asSlice(index * VkImageFormatListCreateInfo.BYTES, VkImageFormatListCreateInfo.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkImageFormatListCreateInfo allocate(Arena arena) {
        VkImageFormatListCreateInfo ret = new VkImageFormatListCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_FORMAT_LIST_CREATE_INFO);
        return ret;
    }

    public static VkImageFormatListCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageFormatListCreateInfo.Ptr ret = new VkImageFormatListCreateInfo.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.IMAGE_FORMAT_LIST_CREATE_INFO);
        }
        return ret;
    }

    public static VkImageFormatListCreateInfo clone(Arena arena, VkImageFormatListCreateInfo src) {
        VkImageFormatListCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_FORMAT_LIST_CREATE_INFO);
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

    public @unsigned int viewFormatCount() {
        return segment.get(LAYOUT$viewFormatCount, OFFSET$viewFormatCount);
    }

    public void viewFormatCount(@unsigned int value) {
        segment.set(LAYOUT$viewFormatCount, OFFSET$viewFormatCount, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkFormat.class) IntPtr pViewFormats() {
        MemorySegment s = pViewFormatsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pViewFormats(@Nullable @enumtype(VkFormat.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewFormatsRaw(s);
    }

    public @pointer(target=VkFormat.class) MemorySegment pViewFormatsRaw() {
        return segment.get(LAYOUT$pViewFormats, OFFSET$pViewFormats);
    }

    public void pViewFormatsRaw(@pointer(target=VkFormat.class) MemorySegment value) {
        segment.set(LAYOUT$pViewFormats, OFFSET$pViewFormats, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewFormatCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pViewFormats")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$viewFormatCount = PathElement.groupElement("viewFormatCount");
    public static final PathElement PATH$pViewFormats = PathElement.groupElement("pViewFormats");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$viewFormatCount = (OfInt) LAYOUT.select(PATH$viewFormatCount);
    public static final AddressLayout LAYOUT$pViewFormats = (AddressLayout) LAYOUT.select(PATH$pViewFormats);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$viewFormatCount = LAYOUT$viewFormatCount.byteSize();
    public static final long SIZE$pViewFormats = LAYOUT$pViewFormats.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewFormatCount = LAYOUT.byteOffset(PATH$viewFormatCount);
    public static final long OFFSET$pViewFormats = LAYOUT.byteOffset(PATH$pViewFormats);
}

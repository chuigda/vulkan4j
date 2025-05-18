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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageViewCreateInfo.html"><code>VkImageViewCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageViewCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkImageViewCreateFlags flags; // optional // @link substring="VkImageViewCreateFlags" target="VkImageViewCreateFlags" @link substring="flags" target="#flags"
///     VkImage image; // @link substring="VkImage" target="VkImage" @link substring="image" target="#image"
///     VkImageViewType viewType; // @link substring="VkImageViewType" target="VkImageViewType" @link substring="viewType" target="#viewType"
///     VkFormat format; // @link substring="VkFormat" target="VkFormat" @link substring="format" target="#format"
///     VkComponentMapping components; // @link substring="VkComponentMapping" target="VkComponentMapping" @link substring="components" target="#components"
///     VkImageSubresourceRange subresourceRange; // @link substring="VkImageSubresourceRange" target="VkImageSubresourceRange" @link substring="subresourceRange" target="#subresourceRange"
/// } VkImageViewCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO`
///
/// The {@code allocate} ({@link VkImageViewCreateInfo#allocate(Arena)}, {@link VkImageViewCreateInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImageViewCreateInfo#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageViewCreateInfo.html"><code>VkImageViewCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageViewCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageViewCreateInfo allocate(Arena arena) {
        VkImageViewCreateInfo ret = new VkImageViewCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_VIEW_CREATE_INFO);
        return ret;
    }

    public static VkImageViewCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageViewCreateInfo[] ret = new VkImageViewCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageViewCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMAGE_VIEW_CREATE_INFO);
        }
        return ret;
    }

    public static VkImageViewCreateInfo clone(Arena arena, VkImageViewCreateInfo src) {
        VkImageViewCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageViewCreateInfo[] clone(Arena arena, VkImageViewCreateInfo[] src) {
        VkImageViewCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_VIEW_CREATE_INFO);
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

    public @enumtype(VkImageViewCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageViewCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VkImage image() {
        MemorySegment s = segment.asSlice(OFFSET$image, SIZE$image);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImage(s);
    }

    public void image(@Nullable VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkImageViewType.class) int viewType() {
        return segment.get(LAYOUT$viewType, OFFSET$viewType);
    }

    public void viewType(@enumtype(VkImageViewType.class) int value) {
        segment.set(LAYOUT$viewType, OFFSET$viewType, value);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @NotNull VkComponentMapping components() {
        return new VkComponentMapping(segment.asSlice(OFFSET$components, LAYOUT$components));
    }

    public void components(@NotNull VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$components, SIZE$components);
    }

    public @NotNull VkImageSubresourceRange subresourceRange() {
        return new VkImageSubresourceRange(segment.asSlice(OFFSET$subresourceRange, LAYOUT$subresourceRange));
    }

    public void subresourceRange(@NotNull VkImageSubresourceRange value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subresourceRange, SIZE$subresourceRange);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("viewType"),
        ValueLayout.JAVA_INT.withName("format"),
        VkComponentMapping.LAYOUT.withName("components"),
        VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$image = PathElement.groupElement("PATH$image");
    public static final PathElement PATH$viewType = PathElement.groupElement("PATH$viewType");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$components = PathElement.groupElement("PATH$components");
    public static final PathElement PATH$subresourceRange = PathElement.groupElement("PATH$subresourceRange");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final OfInt LAYOUT$viewType = (OfInt) LAYOUT.select(PATH$viewType);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final StructLayout LAYOUT$components = (StructLayout) LAYOUT.select(PATH$components);
    public static final StructLayout LAYOUT$subresourceRange = (StructLayout) LAYOUT.select(PATH$subresourceRange);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$viewType = LAYOUT$viewType.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$components = LAYOUT$components.byteSize();
    public static final long SIZE$subresourceRange = LAYOUT$subresourceRange.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$viewType = LAYOUT.byteOffset(PATH$viewType);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$components = LAYOUT.byteOffset(PATH$components);
    public static final long OFFSET$subresourceRange = LAYOUT.byteOffset(PATH$subresourceRange);
}

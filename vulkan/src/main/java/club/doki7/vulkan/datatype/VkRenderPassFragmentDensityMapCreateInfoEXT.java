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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassFragmentDensityMapCreateInfoEXT.html"><code>VkRenderPassFragmentDensityMapCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassFragmentDensityMapCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkAttachmentReference fragmentDensityMapAttachment; // @link substring="VkAttachmentReference" target="VkAttachmentReference" @link substring="fragmentDensityMapAttachment" target="#fragmentDensityMapAttachment"
/// } VkRenderPassFragmentDensityMapCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkRenderPassFragmentDensityMapCreateInfoEXT#allocate(Arena)}, {@link VkRenderPassFragmentDensityMapCreateInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkRenderPassFragmentDensityMapCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassFragmentDensityMapCreateInfoEXT.html"><code>VkRenderPassFragmentDensityMapCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassFragmentDensityMapCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderPassFragmentDensityMapCreateInfoEXT allocate(Arena arena) {
        VkRenderPassFragmentDensityMapCreateInfoEXT ret = new VkRenderPassFragmentDensityMapCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT);
        return ret;
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassFragmentDensityMapCreateInfoEXT[] ret = new VkRenderPassFragmentDensityMapCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassFragmentDensityMapCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT clone(Arena arena, VkRenderPassFragmentDensityMapCreateInfoEXT src) {
        VkRenderPassFragmentDensityMapCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT[] clone(Arena arena, VkRenderPassFragmentDensityMapCreateInfoEXT[] src) {
        VkRenderPassFragmentDensityMapCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT);
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

    public @NotNull VkAttachmentReference fragmentDensityMapAttachment() {
        return new VkAttachmentReference(segment.asSlice(OFFSET$fragmentDensityMapAttachment, LAYOUT$fragmentDensityMapAttachment));
    }

    public void fragmentDensityMapAttachment(@NotNull VkAttachmentReference value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentDensityMapAttachment, SIZE$fragmentDensityMapAttachment);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkAttachmentReference.LAYOUT.withName("fragmentDensityMapAttachment")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentDensityMapAttachment = PathElement.groupElement("fragmentDensityMapAttachment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$fragmentDensityMapAttachment = (StructLayout) LAYOUT.select(PATH$fragmentDensityMapAttachment);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentDensityMapAttachment = LAYOUT$fragmentDensityMapAttachment.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityMapAttachment = LAYOUT.byteOffset(PATH$fragmentDensityMapAttachment);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerBorderColorComponentMappingCreateInfoEXT.html"><code>VkSamplerBorderColorComponentMappingCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSamplerBorderColorComponentMappingCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkComponentMapping components; // @link substring="VkComponentMapping" target="VkComponentMapping" @link substring="components" target="#components"
///     VkBool32 srgb; // @link substring="srgb" target="#srgb"
/// } VkSamplerBorderColorComponentMappingCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkSamplerBorderColorComponentMappingCreateInfoEXT#allocate(Arena)}, {@link VkSamplerBorderColorComponentMappingCreateInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkSamplerBorderColorComponentMappingCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerBorderColorComponentMappingCreateInfoEXT.html"><code>VkSamplerBorderColorComponentMappingCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSamplerBorderColorComponentMappingCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocate(Arena arena) {
        VkSamplerBorderColorComponentMappingCreateInfoEXT ret = new VkSamplerBorderColorComponentMappingCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT);
        return ret;
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerBorderColorComponentMappingCreateInfoEXT[] ret = new VkSamplerBorderColorComponentMappingCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT clone(Arena arena, VkSamplerBorderColorComponentMappingCreateInfoEXT src) {
        VkSamplerBorderColorComponentMappingCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT[] clone(Arena arena, VkSamplerBorderColorComponentMappingCreateInfoEXT[] src) {
        VkSamplerBorderColorComponentMappingCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT);
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

    public @NotNull VkComponentMapping components() {
        return new VkComponentMapping(segment.asSlice(OFFSET$components, LAYOUT$components));
    }

    public void components(@NotNull VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$components, SIZE$components);
    }

    public @unsigned int srgb() {
        return segment.get(LAYOUT$srgb, OFFSET$srgb);
    }

    public void srgb(@unsigned int value) {
        segment.set(LAYOUT$srgb, OFFSET$srgb, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("srgb")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$components = PathElement.groupElement("PATH$components");
    public static final PathElement PATH$srgb = PathElement.groupElement("PATH$srgb");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$components = (StructLayout) LAYOUT.select(PATH$components);
    public static final OfInt LAYOUT$srgb = (OfInt) LAYOUT.select(PATH$srgb);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$components = LAYOUT$components.byteSize();
    public static final long SIZE$srgb = LAYOUT$srgb.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$components = LAYOUT.byteOffset(PATH$components);
    public static final long OFFSET$srgb = LAYOUT.byteOffset(PATH$srgb);
}

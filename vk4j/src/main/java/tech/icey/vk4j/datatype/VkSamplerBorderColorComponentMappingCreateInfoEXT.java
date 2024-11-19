package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkSamplerBorderColorComponentMappingCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkComponentMapping components;
///     VkBool32 srgb;
/// } VkSamplerBorderColorComponentMappingCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSamplerBorderColorComponentMappingCreateInfoEXT.html">VkSamplerBorderColorComponentMappingCreateInfoEXT</a>
public record VkSamplerBorderColorComponentMappingCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkSamplerBorderColorComponentMappingCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public VkComponentMapping components() {
        return new VkComponentMapping(segment.asSlice(OFFSET$components, LAYOUT$components));
    }

    public void components(VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$components, SIZE$components);
    }

    public @unsigned int srgb() {
        return segment.get(LAYOUT$srgb, OFFSET$srgb);
    }

    public void srgb(@unsigned int value) {
        segment.set(LAYOUT$srgb, OFFSET$srgb, value);
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocate(Arena arena) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerBorderColorComponentMappingCreateInfoEXT[] ret = new VkSamplerBorderColorComponentMappingCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("srgb")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$components = PathElement.groupElement("components");
    public static final PathElement PATH$srgb = PathElement.groupElement("srgb");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$components = (StructLayout) LAYOUT.select(PATH$components);
    public static final OfInt LAYOUT$srgb = (OfInt) LAYOUT.select(PATH$srgb);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$components = LAYOUT.byteOffset(PATH$components);
    public static final long OFFSET$srgb = LAYOUT.byteOffset(PATH$srgb);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$components = LAYOUT$components.byteSize();
    public static final long SIZE$srgb = LAYOUT$srgb.byteSize();
}

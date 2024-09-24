package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSamplerBorderColorComponentMappingCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("srgb")
    );

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

    public VkComponentMapping components() {
        return new VkComponentMapping(segment.asSlice(OFFSET$components, LAYOUT$components));
    }

    public void components(VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$components, LAYOUT$components.byteSize());
    }

    public @unsigned int srgb() {
        return segment.get(LAYOUT$srgb, OFFSET$srgb);
    }

    public void srgb(@unsigned int value) {
        segment.set(LAYOUT$srgb, OFFSET$srgb, value);
    }


    public static final class VkSamplerBorderColorComponentMappingCreateInfoEXTFactory implements IFactory<VkSamplerBorderColorComponentMappingCreateInfoEXT> {
        @Override
        public Class<VkSamplerBorderColorComponentMappingCreateInfoEXT> clazz() {
            return VkSamplerBorderColorComponentMappingCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSamplerBorderColorComponentMappingCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkSamplerBorderColorComponentMappingCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSamplerBorderColorComponentMappingCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment);
        }
    }

    public static final VkSamplerBorderColorComponentMappingCreateInfoEXTFactory FACTORY = new VkSamplerBorderColorComponentMappingCreateInfoEXTFactory();
}

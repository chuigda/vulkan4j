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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSamplerCustomBorderColorCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkClearColorValue.LAYOUT.withName("customBorderColor"),
        ValueLayout.JAVA_INT.withName("format")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$customBorderColor = PathElement.groupElement(2);
    public static final PathElement PATH$format = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final UnionLayout LAYOUT$customBorderColor = (UnionLayout) LAYOUT.select(PATH$customBorderColor);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$customBorderColor = LAYOUT.byteOffset(PATH$customBorderColor);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);

    public VkSamplerCustomBorderColorCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT);
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

    public VkClearColorValue customBorderColor() {
        return new VkClearColorValue(segment.asSlice(OFFSET$customBorderColor, LAYOUT$customBorderColor));
    }

    public void customBorderColor(VkClearColorValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$customBorderColor, LAYOUT$customBorderColor.byteSize());
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }


    public static final class VkSamplerCustomBorderColorCreateInfoEXTFactory implements IDataTypeFactory<VkSamplerCustomBorderColorCreateInfoEXT> {
        @Override
        public Class<VkSamplerCustomBorderColorCreateInfoEXT> clazz() {
            return VkSamplerCustomBorderColorCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSamplerCustomBorderColorCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkSamplerCustomBorderColorCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSamplerCustomBorderColorCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkSamplerCustomBorderColorCreateInfoEXT(segment);
        }
    }

    public static final VkSamplerCustomBorderColorCreateInfoEXTFactory FACTORY = new VkSamplerCustomBorderColorCreateInfoEXTFactory();
}
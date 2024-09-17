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

public record VkFilterCubicImageViewImageFormatPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("filterCubic"),
        ValueLayout.JAVA_INT.withName("filterCubicMinmax")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$filterCubic = PathElement.groupElement("filterCubic");
    public static final PathElement PATH$filterCubicMinmax = PathElement.groupElement("filterCubicMinmax");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$filterCubic = (OfInt) LAYOUT.select(PATH$filterCubic);
    public static final OfInt LAYOUT$filterCubicMinmax = (OfInt) LAYOUT.select(PATH$filterCubicMinmax);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$filterCubic = LAYOUT.byteOffset(PATH$filterCubic);
    public static final long OFFSET$filterCubicMinmax = LAYOUT.byteOffset(PATH$filterCubicMinmax);

    public VkFilterCubicImageViewImageFormatPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT);
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

    public @unsigned int filterCubic() {
        return segment.get(LAYOUT$filterCubic, OFFSET$filterCubic);
    }

    public void filterCubic(@unsigned int value) {
        segment.set(LAYOUT$filterCubic, OFFSET$filterCubic, value);
    }

    public @unsigned int filterCubicMinmax() {
        return segment.get(LAYOUT$filterCubicMinmax, OFFSET$filterCubicMinmax);
    }

    public void filterCubicMinmax(@unsigned int value) {
        segment.set(LAYOUT$filterCubicMinmax, OFFSET$filterCubicMinmax, value);
    }


    public static final class VkFilterCubicImageViewImageFormatPropertiesEXTFactory implements IFactory<VkFilterCubicImageViewImageFormatPropertiesEXT> {
        @Override
        public Class<VkFilterCubicImageViewImageFormatPropertiesEXT> clazz() {
            return VkFilterCubicImageViewImageFormatPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkFilterCubicImageViewImageFormatPropertiesEXT.LAYOUT;
        }

        @Override
        public VkFilterCubicImageViewImageFormatPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkFilterCubicImageViewImageFormatPropertiesEXT createUninit(MemorySegment segment) {
            return new VkFilterCubicImageViewImageFormatPropertiesEXT(segment);
        }
    }

    public static final VkFilterCubicImageViewImageFormatPropertiesEXTFactory FACTORY = new VkFilterCubicImageViewImageFormatPropertiesEXTFactory();
}

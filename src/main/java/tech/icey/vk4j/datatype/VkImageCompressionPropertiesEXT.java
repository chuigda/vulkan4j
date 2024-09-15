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

public record VkImageCompressionPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionFlags"),
        ValueLayout.JAVA_INT.withName("imageCompressionFixedRateFlags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$imageCompressionFlags = PathElement.groupElement(2);
    public static final PathElement PATH$imageCompressionFixedRateFlags = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$imageCompressionFlags = (OfInt) LAYOUT.select(PATH$imageCompressionFlags);
    public static final OfInt LAYOUT$imageCompressionFixedRateFlags = (OfInt) LAYOUT.select(PATH$imageCompressionFixedRateFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageCompressionFlags = LAYOUT.byteOffset(PATH$imageCompressionFlags);
    public static final long OFFSET$imageCompressionFixedRateFlags = LAYOUT.byteOffset(PATH$imageCompressionFixedRateFlags);

    public VkImageCompressionPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT);
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

    public @enumtype(VkImageCompressionFlagsEXT.class) int imageCompressionFlags() {
        return segment.get(LAYOUT$imageCompressionFlags, OFFSET$imageCompressionFlags);
    }

    public void imageCompressionFlags(@enumtype(VkImageCompressionFlagsEXT.class) int value) {
        segment.set(LAYOUT$imageCompressionFlags, OFFSET$imageCompressionFlags, value);
    }

    public @enumtype(VkImageCompressionFixedRateFlagsEXT.class) int imageCompressionFixedRateFlags() {
        return segment.get(LAYOUT$imageCompressionFixedRateFlags, OFFSET$imageCompressionFixedRateFlags);
    }

    public void imageCompressionFixedRateFlags(@enumtype(VkImageCompressionFixedRateFlagsEXT.class) int value) {
        segment.set(LAYOUT$imageCompressionFixedRateFlags, OFFSET$imageCompressionFixedRateFlags, value);
    }


    public static final class VkImageCompressionPropertiesEXTFactory implements IDataTypeFactory<VkImageCompressionPropertiesEXT> {
        @Override
        public Class<VkImageCompressionPropertiesEXT> clazz() {
            return VkImageCompressionPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageCompressionPropertiesEXT.LAYOUT;
        }

        @Override
        public VkImageCompressionPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImageCompressionPropertiesEXT createUninit(MemorySegment segment) {
            return new VkImageCompressionPropertiesEXT(segment);
        }
    }

    public static final VkImageCompressionPropertiesEXTFactory FACTORY = new VkImageCompressionPropertiesEXTFactory();
}

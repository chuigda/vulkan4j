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

public record VkImageViewSlicedCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sliceOffset"),
        ValueLayout.JAVA_INT.withName("sliceCount")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sliceOffset = PathElement.groupElement("sliceOffset");
    public static final PathElement PATH$sliceCount = PathElement.groupElement("sliceCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sliceOffset = (OfInt) LAYOUT.select(PATH$sliceOffset);
    public static final OfInt LAYOUT$sliceCount = (OfInt) LAYOUT.select(PATH$sliceCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sliceOffset = LAYOUT.byteOffset(PATH$sliceOffset);
    public static final long OFFSET$sliceCount = LAYOUT.byteOffset(PATH$sliceCount);

    public VkImageViewSlicedCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT);
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

    public @unsigned int sliceOffset() {
        return segment.get(LAYOUT$sliceOffset, OFFSET$sliceOffset);
    }

    public void sliceOffset(@unsigned int value) {
        segment.set(LAYOUT$sliceOffset, OFFSET$sliceOffset, value);
    }

    public @unsigned int sliceCount() {
        return segment.get(LAYOUT$sliceCount, OFFSET$sliceCount);
    }

    public void sliceCount(@unsigned int value) {
        segment.set(LAYOUT$sliceCount, OFFSET$sliceCount, value);
    }


    public static final class VkImageViewSlicedCreateInfoEXTFactory implements IFactory<VkImageViewSlicedCreateInfoEXT> {
        @Override
        public Class<VkImageViewSlicedCreateInfoEXT> clazz() {
            return VkImageViewSlicedCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageViewSlicedCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkImageViewSlicedCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImageViewSlicedCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkImageViewSlicedCreateInfoEXT(segment);
        }
    }

    public static final VkImageViewSlicedCreateInfoEXTFactory FACTORY = new VkImageViewSlicedCreateInfoEXTFactory();
}

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

public record VkMicromapBuildSizesInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("micromapSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize"),
        ValueLayout.JAVA_INT.withName("discardable")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$micromapSize = PathElement.groupElement(2);
    public static final PathElement PATH$buildScratchSize = PathElement.groupElement(3);
    public static final PathElement PATH$discardable = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$micromapSize = (OfLong) LAYOUT.select(PATH$micromapSize);
    public static final OfLong LAYOUT$buildScratchSize = (OfLong) LAYOUT.select(PATH$buildScratchSize);
    public static final OfInt LAYOUT$discardable = (OfInt) LAYOUT.select(PATH$discardable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$micromapSize = LAYOUT.byteOffset(PATH$micromapSize);
    public static final long OFFSET$buildScratchSize = LAYOUT.byteOffset(PATH$buildScratchSize);
    public static final long OFFSET$discardable = LAYOUT.byteOffset(PATH$discardable);

    public VkMicromapBuildSizesInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT);
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

    public @unsigned long micromapSize() {
        return segment.get(LAYOUT$micromapSize, OFFSET$micromapSize);
    }

    public void micromapSize(@unsigned long value) {
        segment.set(LAYOUT$micromapSize, OFFSET$micromapSize, value);
    }

    public @unsigned long buildScratchSize() {
        return segment.get(LAYOUT$buildScratchSize, OFFSET$buildScratchSize);
    }

    public void buildScratchSize(@unsigned long value) {
        segment.set(LAYOUT$buildScratchSize, OFFSET$buildScratchSize, value);
    }

    public @unsigned int discardable() {
        return segment.get(LAYOUT$discardable, OFFSET$discardable);
    }

    public void discardable(@unsigned int value) {
        segment.set(LAYOUT$discardable, OFFSET$discardable, value);
    }


    public static final class VkMicromapBuildSizesInfoEXTFactory implements IDataTypeFactory<VkMicromapBuildSizesInfoEXT> {
        @Override
        public Class<VkMicromapBuildSizesInfoEXT> clazz() {
            return VkMicromapBuildSizesInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMicromapBuildSizesInfoEXT.LAYOUT;
        }

        @Override
        public VkMicromapBuildSizesInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkMicromapBuildSizesInfoEXT createUninit(MemorySegment segment) {
            return new VkMicromapBuildSizesInfoEXT(segment);
        }
    }

    public static final VkMicromapBuildSizesInfoEXTFactory FACTORY = new VkMicromapBuildSizesInfoEXTFactory();
}

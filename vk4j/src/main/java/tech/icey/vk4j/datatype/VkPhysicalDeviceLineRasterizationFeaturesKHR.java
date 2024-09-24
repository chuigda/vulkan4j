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

public record VkPhysicalDeviceLineRasterizationFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rectangularLines"),
        ValueLayout.JAVA_INT.withName("bresenhamLines"),
        ValueLayout.JAVA_INT.withName("smoothLines"),
        ValueLayout.JAVA_INT.withName("stippledRectangularLines"),
        ValueLayout.JAVA_INT.withName("stippledBresenhamLines"),
        ValueLayout.JAVA_INT.withName("stippledSmoothLines")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rectangularLines = PathElement.groupElement("rectangularLines");
    public static final PathElement PATH$bresenhamLines = PathElement.groupElement("bresenhamLines");
    public static final PathElement PATH$smoothLines = PathElement.groupElement("smoothLines");
    public static final PathElement PATH$stippledRectangularLines = PathElement.groupElement("stippledRectangularLines");
    public static final PathElement PATH$stippledBresenhamLines = PathElement.groupElement("stippledBresenhamLines");
    public static final PathElement PATH$stippledSmoothLines = PathElement.groupElement("stippledSmoothLines");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rectangularLines = (OfInt) LAYOUT.select(PATH$rectangularLines);
    public static final OfInt LAYOUT$bresenhamLines = (OfInt) LAYOUT.select(PATH$bresenhamLines);
    public static final OfInt LAYOUT$smoothLines = (OfInt) LAYOUT.select(PATH$smoothLines);
    public static final OfInt LAYOUT$stippledRectangularLines = (OfInt) LAYOUT.select(PATH$stippledRectangularLines);
    public static final OfInt LAYOUT$stippledBresenhamLines = (OfInt) LAYOUT.select(PATH$stippledBresenhamLines);
    public static final OfInt LAYOUT$stippledSmoothLines = (OfInt) LAYOUT.select(PATH$stippledSmoothLines);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rectangularLines = LAYOUT.byteOffset(PATH$rectangularLines);
    public static final long OFFSET$bresenhamLines = LAYOUT.byteOffset(PATH$bresenhamLines);
    public static final long OFFSET$smoothLines = LAYOUT.byteOffset(PATH$smoothLines);
    public static final long OFFSET$stippledRectangularLines = LAYOUT.byteOffset(PATH$stippledRectangularLines);
    public static final long OFFSET$stippledBresenhamLines = LAYOUT.byteOffset(PATH$stippledBresenhamLines);
    public static final long OFFSET$stippledSmoothLines = LAYOUT.byteOffset(PATH$stippledSmoothLines);

    public VkPhysicalDeviceLineRasterizationFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR);
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

    public @unsigned int rectangularLines() {
        return segment.get(LAYOUT$rectangularLines, OFFSET$rectangularLines);
    }

    public void rectangularLines(@unsigned int value) {
        segment.set(LAYOUT$rectangularLines, OFFSET$rectangularLines, value);
    }

    public @unsigned int bresenhamLines() {
        return segment.get(LAYOUT$bresenhamLines, OFFSET$bresenhamLines);
    }

    public void bresenhamLines(@unsigned int value) {
        segment.set(LAYOUT$bresenhamLines, OFFSET$bresenhamLines, value);
    }

    public @unsigned int smoothLines() {
        return segment.get(LAYOUT$smoothLines, OFFSET$smoothLines);
    }

    public void smoothLines(@unsigned int value) {
        segment.set(LAYOUT$smoothLines, OFFSET$smoothLines, value);
    }

    public @unsigned int stippledRectangularLines() {
        return segment.get(LAYOUT$stippledRectangularLines, OFFSET$stippledRectangularLines);
    }

    public void stippledRectangularLines(@unsigned int value) {
        segment.set(LAYOUT$stippledRectangularLines, OFFSET$stippledRectangularLines, value);
    }

    public @unsigned int stippledBresenhamLines() {
        return segment.get(LAYOUT$stippledBresenhamLines, OFFSET$stippledBresenhamLines);
    }

    public void stippledBresenhamLines(@unsigned int value) {
        segment.set(LAYOUT$stippledBresenhamLines, OFFSET$stippledBresenhamLines, value);
    }

    public @unsigned int stippledSmoothLines() {
        return segment.get(LAYOUT$stippledSmoothLines, OFFSET$stippledSmoothLines);
    }

    public void stippledSmoothLines(@unsigned int value) {
        segment.set(LAYOUT$stippledSmoothLines, OFFSET$stippledSmoothLines, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceLineRasterizationFeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceLineRasterizationFeaturesKHR> clazz() {
            return VkPhysicalDeviceLineRasterizationFeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceLineRasterizationFeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceLineRasterizationFeaturesKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

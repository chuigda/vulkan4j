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

public record VkPipelineRasterizationLineStateCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineRasterizationMode"),
        ValueLayout.JAVA_INT.withName("stippledLineEnable"),
        ValueLayout.JAVA_INT.withName("lineStippleFactor"),
        ValueLayout.JAVA_SHORT.withName("lineStipplePattern")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$lineRasterizationMode = PathElement.groupElement(2);
    public static final PathElement PATH$stippledLineEnable = PathElement.groupElement(3);
    public static final PathElement PATH$lineStippleFactor = PathElement.groupElement(4);
    public static final PathElement PATH$lineStipplePattern = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$lineRasterizationMode = (OfInt) LAYOUT.select(PATH$lineRasterizationMode);
    public static final OfInt LAYOUT$stippledLineEnable = (OfInt) LAYOUT.select(PATH$stippledLineEnable);
    public static final OfInt LAYOUT$lineStippleFactor = (OfInt) LAYOUT.select(PATH$lineStippleFactor);
    public static final OfShort LAYOUT$lineStipplePattern = (OfShort) LAYOUT.select(PATH$lineStipplePattern);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$lineRasterizationMode = LAYOUT.byteOffset(PATH$lineRasterizationMode);
    public static final long OFFSET$stippledLineEnable = LAYOUT.byteOffset(PATH$stippledLineEnable);
    public static final long OFFSET$lineStippleFactor = LAYOUT.byteOffset(PATH$lineStippleFactor);
    public static final long OFFSET$lineStipplePattern = LAYOUT.byteOffset(PATH$lineStipplePattern);

    public VkPipelineRasterizationLineStateCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR);
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

    public @enumtype(VkLineRasterizationModeKHR.class) int lineRasterizationMode() {
        return segment.get(LAYOUT$lineRasterizationMode, OFFSET$lineRasterizationMode);
    }

    public void lineRasterizationMode(@enumtype(VkLineRasterizationModeKHR.class) int value) {
        segment.set(LAYOUT$lineRasterizationMode, OFFSET$lineRasterizationMode, value);
    }

    public @unsigned int stippledLineEnable() {
        return segment.get(LAYOUT$stippledLineEnable, OFFSET$stippledLineEnable);
    }

    public void stippledLineEnable(@unsigned int value) {
        segment.set(LAYOUT$stippledLineEnable, OFFSET$stippledLineEnable, value);
    }

    public @unsigned int lineStippleFactor() {
        return segment.get(LAYOUT$lineStippleFactor, OFFSET$lineStippleFactor);
    }

    public void lineStippleFactor(@unsigned int value) {
        segment.set(LAYOUT$lineStippleFactor, OFFSET$lineStippleFactor, value);
    }

    public @unsigned short lineStipplePattern() {
        return segment.get(LAYOUT$lineStipplePattern, OFFSET$lineStipplePattern);
    }

    public void lineStipplePattern(@unsigned short value) {
        segment.set(LAYOUT$lineStipplePattern, OFFSET$lineStipplePattern, value);
    }


    public static final class VkPipelineRasterizationLineStateCreateInfoKHRFactory implements IDataTypeFactory<VkPipelineRasterizationLineStateCreateInfoKHR> {
        @Override
        public Class<VkPipelineRasterizationLineStateCreateInfoKHR> clazz() {
            return VkPipelineRasterizationLineStateCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineRasterizationLineStateCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkPipelineRasterizationLineStateCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineRasterizationLineStateCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkPipelineRasterizationLineStateCreateInfoKHR(segment);
        }
    }

    public static final VkPipelineRasterizationLineStateCreateInfoKHRFactory FACTORY = new VkPipelineRasterizationLineStateCreateInfoKHRFactory();
}
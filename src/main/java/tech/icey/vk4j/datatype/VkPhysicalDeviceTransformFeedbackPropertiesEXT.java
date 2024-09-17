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

public record VkPhysicalDeviceTransformFeedbackPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreams"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBuffers"),
        ValueLayout.JAVA_LONG.withName("maxTransformFeedbackBufferSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreamDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataStride"),
        ValueLayout.JAVA_INT.withName("transformFeedbackQueries"),
        ValueLayout.JAVA_INT.withName("transformFeedbackStreamsLinesTriangles"),
        ValueLayout.JAVA_INT.withName("transformFeedbackRasterizationStreamSelect"),
        ValueLayout.JAVA_INT.withName("transformFeedbackDraw")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxTransformFeedbackStreams = PathElement.groupElement("maxTransformFeedbackStreams");
    public static final PathElement PATH$maxTransformFeedbackBuffers = PathElement.groupElement("maxTransformFeedbackBuffers");
    public static final PathElement PATH$maxTransformFeedbackBufferSize = PathElement.groupElement("maxTransformFeedbackBufferSize");
    public static final PathElement PATH$maxTransformFeedbackStreamDataSize = PathElement.groupElement("maxTransformFeedbackStreamDataSize");
    public static final PathElement PATH$maxTransformFeedbackBufferDataSize = PathElement.groupElement("maxTransformFeedbackBufferDataSize");
    public static final PathElement PATH$maxTransformFeedbackBufferDataStride = PathElement.groupElement("maxTransformFeedbackBufferDataStride");
    public static final PathElement PATH$transformFeedbackQueries = PathElement.groupElement("transformFeedbackQueries");
    public static final PathElement PATH$transformFeedbackStreamsLinesTriangles = PathElement.groupElement("transformFeedbackStreamsLinesTriangles");
    public static final PathElement PATH$transformFeedbackRasterizationStreamSelect = PathElement.groupElement("transformFeedbackRasterizationStreamSelect");
    public static final PathElement PATH$transformFeedbackDraw = PathElement.groupElement("transformFeedbackDraw");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxTransformFeedbackStreams = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackStreams);
    public static final OfInt LAYOUT$maxTransformFeedbackBuffers = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackBuffers);
    public static final OfLong LAYOUT$maxTransformFeedbackBufferSize = (OfLong) LAYOUT.select(PATH$maxTransformFeedbackBufferSize);
    public static final OfInt LAYOUT$maxTransformFeedbackStreamDataSize = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackStreamDataSize);
    public static final OfInt LAYOUT$maxTransformFeedbackBufferDataSize = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackBufferDataSize);
    public static final OfInt LAYOUT$maxTransformFeedbackBufferDataStride = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackBufferDataStride);
    public static final OfInt LAYOUT$transformFeedbackQueries = (OfInt) LAYOUT.select(PATH$transformFeedbackQueries);
    public static final OfInt LAYOUT$transformFeedbackStreamsLinesTriangles = (OfInt) LAYOUT.select(PATH$transformFeedbackStreamsLinesTriangles);
    public static final OfInt LAYOUT$transformFeedbackRasterizationStreamSelect = (OfInt) LAYOUT.select(PATH$transformFeedbackRasterizationStreamSelect);
    public static final OfInt LAYOUT$transformFeedbackDraw = (OfInt) LAYOUT.select(PATH$transformFeedbackDraw);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxTransformFeedbackStreams = LAYOUT.byteOffset(PATH$maxTransformFeedbackStreams);
    public static final long OFFSET$maxTransformFeedbackBuffers = LAYOUT.byteOffset(PATH$maxTransformFeedbackBuffers);
    public static final long OFFSET$maxTransformFeedbackBufferSize = LAYOUT.byteOffset(PATH$maxTransformFeedbackBufferSize);
    public static final long OFFSET$maxTransformFeedbackStreamDataSize = LAYOUT.byteOffset(PATH$maxTransformFeedbackStreamDataSize);
    public static final long OFFSET$maxTransformFeedbackBufferDataSize = LAYOUT.byteOffset(PATH$maxTransformFeedbackBufferDataSize);
    public static final long OFFSET$maxTransformFeedbackBufferDataStride = LAYOUT.byteOffset(PATH$maxTransformFeedbackBufferDataStride);
    public static final long OFFSET$transformFeedbackQueries = LAYOUT.byteOffset(PATH$transformFeedbackQueries);
    public static final long OFFSET$transformFeedbackStreamsLinesTriangles = LAYOUT.byteOffset(PATH$transformFeedbackStreamsLinesTriangles);
    public static final long OFFSET$transformFeedbackRasterizationStreamSelect = LAYOUT.byteOffset(PATH$transformFeedbackRasterizationStreamSelect);
    public static final long OFFSET$transformFeedbackDraw = LAYOUT.byteOffset(PATH$transformFeedbackDraw);

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT);
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

    public @unsigned int maxTransformFeedbackStreams() {
        return segment.get(LAYOUT$maxTransformFeedbackStreams, OFFSET$maxTransformFeedbackStreams);
    }

    public void maxTransformFeedbackStreams(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackStreams, OFFSET$maxTransformFeedbackStreams, value);
    }

    public @unsigned int maxTransformFeedbackBuffers() {
        return segment.get(LAYOUT$maxTransformFeedbackBuffers, OFFSET$maxTransformFeedbackBuffers);
    }

    public void maxTransformFeedbackBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackBuffers, OFFSET$maxTransformFeedbackBuffers, value);
    }

    public @unsigned long maxTransformFeedbackBufferSize() {
        return segment.get(LAYOUT$maxTransformFeedbackBufferSize, OFFSET$maxTransformFeedbackBufferSize);
    }

    public void maxTransformFeedbackBufferSize(@unsigned long value) {
        segment.set(LAYOUT$maxTransformFeedbackBufferSize, OFFSET$maxTransformFeedbackBufferSize, value);
    }

    public @unsigned int maxTransformFeedbackStreamDataSize() {
        return segment.get(LAYOUT$maxTransformFeedbackStreamDataSize, OFFSET$maxTransformFeedbackStreamDataSize);
    }

    public void maxTransformFeedbackStreamDataSize(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackStreamDataSize, OFFSET$maxTransformFeedbackStreamDataSize, value);
    }

    public @unsigned int maxTransformFeedbackBufferDataSize() {
        return segment.get(LAYOUT$maxTransformFeedbackBufferDataSize, OFFSET$maxTransformFeedbackBufferDataSize);
    }

    public void maxTransformFeedbackBufferDataSize(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackBufferDataSize, OFFSET$maxTransformFeedbackBufferDataSize, value);
    }

    public @unsigned int maxTransformFeedbackBufferDataStride() {
        return segment.get(LAYOUT$maxTransformFeedbackBufferDataStride, OFFSET$maxTransformFeedbackBufferDataStride);
    }

    public void maxTransformFeedbackBufferDataStride(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackBufferDataStride, OFFSET$maxTransformFeedbackBufferDataStride, value);
    }

    public @unsigned int transformFeedbackQueries() {
        return segment.get(LAYOUT$transformFeedbackQueries, OFFSET$transformFeedbackQueries);
    }

    public void transformFeedbackQueries(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackQueries, OFFSET$transformFeedbackQueries, value);
    }

    public @unsigned int transformFeedbackStreamsLinesTriangles() {
        return segment.get(LAYOUT$transformFeedbackStreamsLinesTriangles, OFFSET$transformFeedbackStreamsLinesTriangles);
    }

    public void transformFeedbackStreamsLinesTriangles(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackStreamsLinesTriangles, OFFSET$transformFeedbackStreamsLinesTriangles, value);
    }

    public @unsigned int transformFeedbackRasterizationStreamSelect() {
        return segment.get(LAYOUT$transformFeedbackRasterizationStreamSelect, OFFSET$transformFeedbackRasterizationStreamSelect);
    }

    public void transformFeedbackRasterizationStreamSelect(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackRasterizationStreamSelect, OFFSET$transformFeedbackRasterizationStreamSelect, value);
    }

    public @unsigned int transformFeedbackDraw() {
        return segment.get(LAYOUT$transformFeedbackDraw, OFFSET$transformFeedbackDraw);
    }

    public void transformFeedbackDraw(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackDraw, OFFSET$transformFeedbackDraw, value);
    }


    public static final class VkPhysicalDeviceTransformFeedbackPropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceTransformFeedbackPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceTransformFeedbackPropertiesEXT> clazz() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceTransformFeedbackPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceTransformFeedbackPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceTransformFeedbackPropertiesEXTFactory FACTORY = new VkPhysicalDeviceTransformFeedbackPropertiesEXTFactory();
}

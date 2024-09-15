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

public record VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxGraphicsShaderGroupCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectSequenceCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenOffset"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamStride"),
        ValueLayout.JAVA_INT.withName("minSequencesCountBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minSequencesIndexBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minIndirectCommandsBufferOffsetAlignment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$maxGraphicsShaderGroupCount = PathElement.groupElement(2);
    public static final PathElement PATH$maxIndirectSequenceCount = PathElement.groupElement(3);
    public static final PathElement PATH$maxIndirectCommandsTokenCount = PathElement.groupElement(4);
    public static final PathElement PATH$maxIndirectCommandsStreamCount = PathElement.groupElement(5);
    public static final PathElement PATH$maxIndirectCommandsTokenOffset = PathElement.groupElement(6);
    public static final PathElement PATH$maxIndirectCommandsStreamStride = PathElement.groupElement(7);
    public static final PathElement PATH$minSequencesCountBufferOffsetAlignment = PathElement.groupElement(8);
    public static final PathElement PATH$minSequencesIndexBufferOffsetAlignment = PathElement.groupElement(9);
    public static final PathElement PATH$minIndirectCommandsBufferOffsetAlignment = PathElement.groupElement(10);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxGraphicsShaderGroupCount = (OfInt) LAYOUT.select(PATH$maxGraphicsShaderGroupCount);
    public static final OfInt LAYOUT$maxIndirectSequenceCount = (OfInt) LAYOUT.select(PATH$maxIndirectSequenceCount);
    public static final OfInt LAYOUT$maxIndirectCommandsTokenCount = (OfInt) LAYOUT.select(PATH$maxIndirectCommandsTokenCount);
    public static final OfInt LAYOUT$maxIndirectCommandsStreamCount = (OfInt) LAYOUT.select(PATH$maxIndirectCommandsStreamCount);
    public static final OfInt LAYOUT$maxIndirectCommandsTokenOffset = (OfInt) LAYOUT.select(PATH$maxIndirectCommandsTokenOffset);
    public static final OfInt LAYOUT$maxIndirectCommandsStreamStride = (OfInt) LAYOUT.select(PATH$maxIndirectCommandsStreamStride);
    public static final OfInt LAYOUT$minSequencesCountBufferOffsetAlignment = (OfInt) LAYOUT.select(PATH$minSequencesCountBufferOffsetAlignment);
    public static final OfInt LAYOUT$minSequencesIndexBufferOffsetAlignment = (OfInt) LAYOUT.select(PATH$minSequencesIndexBufferOffsetAlignment);
    public static final OfInt LAYOUT$minIndirectCommandsBufferOffsetAlignment = (OfInt) LAYOUT.select(PATH$minIndirectCommandsBufferOffsetAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxGraphicsShaderGroupCount = LAYOUT.byteOffset(PATH$maxGraphicsShaderGroupCount);
    public static final long OFFSET$maxIndirectSequenceCount = LAYOUT.byteOffset(PATH$maxIndirectSequenceCount);
    public static final long OFFSET$maxIndirectCommandsTokenCount = LAYOUT.byteOffset(PATH$maxIndirectCommandsTokenCount);
    public static final long OFFSET$maxIndirectCommandsStreamCount = LAYOUT.byteOffset(PATH$maxIndirectCommandsStreamCount);
    public static final long OFFSET$maxIndirectCommandsTokenOffset = LAYOUT.byteOffset(PATH$maxIndirectCommandsTokenOffset);
    public static final long OFFSET$maxIndirectCommandsStreamStride = LAYOUT.byteOffset(PATH$maxIndirectCommandsStreamStride);
    public static final long OFFSET$minSequencesCountBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minSequencesCountBufferOffsetAlignment);
    public static final long OFFSET$minSequencesIndexBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minSequencesIndexBufferOffsetAlignment);
    public static final long OFFSET$minIndirectCommandsBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minIndirectCommandsBufferOffsetAlignment);

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV);
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

    public @unsigned int maxGraphicsShaderGroupCount() {
        return segment.get(LAYOUT$maxGraphicsShaderGroupCount, OFFSET$maxGraphicsShaderGroupCount);
    }

    public void maxGraphicsShaderGroupCount(@unsigned int value) {
        segment.set(LAYOUT$maxGraphicsShaderGroupCount, OFFSET$maxGraphicsShaderGroupCount, value);
    }

    public @unsigned int maxIndirectSequenceCount() {
        return segment.get(LAYOUT$maxIndirectSequenceCount, OFFSET$maxIndirectSequenceCount);
    }

    public void maxIndirectSequenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectSequenceCount, OFFSET$maxIndirectSequenceCount, value);
    }

    public @unsigned int maxIndirectCommandsTokenCount() {
        return segment.get(LAYOUT$maxIndirectCommandsTokenCount, OFFSET$maxIndirectCommandsTokenCount);
    }

    public void maxIndirectCommandsTokenCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsTokenCount, OFFSET$maxIndirectCommandsTokenCount, value);
    }

    public @unsigned int maxIndirectCommandsStreamCount() {
        return segment.get(LAYOUT$maxIndirectCommandsStreamCount, OFFSET$maxIndirectCommandsStreamCount);
    }

    public void maxIndirectCommandsStreamCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsStreamCount, OFFSET$maxIndirectCommandsStreamCount, value);
    }

    public @unsigned int maxIndirectCommandsTokenOffset() {
        return segment.get(LAYOUT$maxIndirectCommandsTokenOffset, OFFSET$maxIndirectCommandsTokenOffset);
    }

    public void maxIndirectCommandsTokenOffset(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsTokenOffset, OFFSET$maxIndirectCommandsTokenOffset, value);
    }

    public @unsigned int maxIndirectCommandsStreamStride() {
        return segment.get(LAYOUT$maxIndirectCommandsStreamStride, OFFSET$maxIndirectCommandsStreamStride);
    }

    public void maxIndirectCommandsStreamStride(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsStreamStride, OFFSET$maxIndirectCommandsStreamStride, value);
    }

    public @unsigned int minSequencesCountBufferOffsetAlignment() {
        return segment.get(LAYOUT$minSequencesCountBufferOffsetAlignment, OFFSET$minSequencesCountBufferOffsetAlignment);
    }

    public void minSequencesCountBufferOffsetAlignment(@unsigned int value) {
        segment.set(LAYOUT$minSequencesCountBufferOffsetAlignment, OFFSET$minSequencesCountBufferOffsetAlignment, value);
    }

    public @unsigned int minSequencesIndexBufferOffsetAlignment() {
        return segment.get(LAYOUT$minSequencesIndexBufferOffsetAlignment, OFFSET$minSequencesIndexBufferOffsetAlignment);
    }

    public void minSequencesIndexBufferOffsetAlignment(@unsigned int value) {
        segment.set(LAYOUT$minSequencesIndexBufferOffsetAlignment, OFFSET$minSequencesIndexBufferOffsetAlignment, value);
    }

    public @unsigned int minIndirectCommandsBufferOffsetAlignment() {
        return segment.get(LAYOUT$minIndirectCommandsBufferOffsetAlignment, OFFSET$minIndirectCommandsBufferOffsetAlignment);
    }

    public void minIndirectCommandsBufferOffsetAlignment(@unsigned int value) {
        segment.set(LAYOUT$minIndirectCommandsBufferOffsetAlignment, OFFSET$minIndirectCommandsBufferOffsetAlignment, value);
    }


    public static final class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNVFactory implements IDataTypeFactory<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> {
        @Override
        public Class<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> clazz() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment);
        }
    }

    public static final VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNVFactory FACTORY = new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNVFactory();
}

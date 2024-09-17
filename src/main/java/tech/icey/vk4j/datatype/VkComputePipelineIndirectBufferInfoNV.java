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

public record VkComputePipelineIndirectBufferInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("pipelineDeviceAddressCaptureReplay")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceAddress = PathElement.groupElement("deviceAddress");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$pipelineDeviceAddressCaptureReplay = PathElement.groupElement("pipelineDeviceAddressCaptureReplay");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$pipelineDeviceAddressCaptureReplay = (OfLong) LAYOUT.select(PATH$pipelineDeviceAddressCaptureReplay);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pipelineDeviceAddressCaptureReplay = LAYOUT.byteOffset(PATH$pipelineDeviceAddressCaptureReplay);

    public VkComputePipelineIndirectBufferInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV);
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

    public @unsigned long deviceAddress() {
        return segment.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);
    }

    public void deviceAddress(@unsigned long value) {
        segment.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @unsigned long pipelineDeviceAddressCaptureReplay() {
        return segment.get(LAYOUT$pipelineDeviceAddressCaptureReplay, OFFSET$pipelineDeviceAddressCaptureReplay);
    }

    public void pipelineDeviceAddressCaptureReplay(@unsigned long value) {
        segment.set(LAYOUT$pipelineDeviceAddressCaptureReplay, OFFSET$pipelineDeviceAddressCaptureReplay, value);
    }


    public static final class VkComputePipelineIndirectBufferInfoNVFactory implements IDataTypeFactory<VkComputePipelineIndirectBufferInfoNV> {
        @Override
        public Class<VkComputePipelineIndirectBufferInfoNV> clazz() {
            return VkComputePipelineIndirectBufferInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkComputePipelineIndirectBufferInfoNV.LAYOUT;
        }

        @Override
        public VkComputePipelineIndirectBufferInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkComputePipelineIndirectBufferInfoNV createUninit(MemorySegment segment) {
            return new VkComputePipelineIndirectBufferInfoNV(segment);
        }
    }

    public static final VkComputePipelineIndirectBufferInfoNVFactory FACTORY = new VkComputePipelineIndirectBufferInfoNVFactory();
}

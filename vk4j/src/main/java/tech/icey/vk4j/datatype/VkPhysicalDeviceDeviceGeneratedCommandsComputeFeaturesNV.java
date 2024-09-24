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

public record VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCompute"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputePipelines"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputeCaptureReplay")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceGeneratedCompute = PathElement.groupElement("deviceGeneratedCompute");
    public static final PathElement PATH$deviceGeneratedComputePipelines = PathElement.groupElement("deviceGeneratedComputePipelines");
    public static final PathElement PATH$deviceGeneratedComputeCaptureReplay = PathElement.groupElement("deviceGeneratedComputeCaptureReplay");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceGeneratedCompute = (OfInt) LAYOUT.select(PATH$deviceGeneratedCompute);
    public static final OfInt LAYOUT$deviceGeneratedComputePipelines = (OfInt) LAYOUT.select(PATH$deviceGeneratedComputePipelines);
    public static final OfInt LAYOUT$deviceGeneratedComputeCaptureReplay = (OfInt) LAYOUT.select(PATH$deviceGeneratedComputeCaptureReplay);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceGeneratedCompute = LAYOUT.byteOffset(PATH$deviceGeneratedCompute);
    public static final long OFFSET$deviceGeneratedComputePipelines = LAYOUT.byteOffset(PATH$deviceGeneratedComputePipelines);
    public static final long OFFSET$deviceGeneratedComputeCaptureReplay = LAYOUT.byteOffset(PATH$deviceGeneratedComputeCaptureReplay);

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV);
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

    public @unsigned int deviceGeneratedCompute() {
        return segment.get(LAYOUT$deviceGeneratedCompute, OFFSET$deviceGeneratedCompute);
    }

    public void deviceGeneratedCompute(@unsigned int value) {
        segment.set(LAYOUT$deviceGeneratedCompute, OFFSET$deviceGeneratedCompute, value);
    }

    public @unsigned int deviceGeneratedComputePipelines() {
        return segment.get(LAYOUT$deviceGeneratedComputePipelines, OFFSET$deviceGeneratedComputePipelines);
    }

    public void deviceGeneratedComputePipelines(@unsigned int value) {
        segment.set(LAYOUT$deviceGeneratedComputePipelines, OFFSET$deviceGeneratedComputePipelines, value);
    }

    public @unsigned int deviceGeneratedComputeCaptureReplay() {
        return segment.get(LAYOUT$deviceGeneratedComputeCaptureReplay, OFFSET$deviceGeneratedComputeCaptureReplay);
    }

    public void deviceGeneratedComputeCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$deviceGeneratedComputeCaptureReplay, OFFSET$deviceGeneratedComputeCaptureReplay, value);
    }


    public static final class VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNVFactory implements IFactory<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> clazz() {
            return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNVFactory FACTORY = new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNVFactory();
}

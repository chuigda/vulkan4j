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

public record VkPhysicalDeviceProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("apiVersion"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("deviceType"),
        MemoryLayout.sequenceLayout(VK_MAX_PHYSICAL_DEVICE_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("deviceName"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID"),
        VkPhysicalDeviceLimits.LAYOUT.withName("limits"),
        VkPhysicalDeviceSparseProperties.LAYOUT.withName("sparseProperties")
    );

    public static final PathElement PATH$apiVersion = PathElement.groupElement("apiVersion");
    public static final PathElement PATH$driverVersion = PathElement.groupElement("driverVersion");
    public static final PathElement PATH$vendorID = PathElement.groupElement("vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("deviceID");
    public static final PathElement PATH$deviceType = PathElement.groupElement("deviceType");
    public static final PathElement PATH$deviceName = PathElement.groupElement("deviceName");
    public static final PathElement PATH$pipelineCacheUUID = PathElement.groupElement("pipelineCacheUUID");
    public static final PathElement PATH$limits = PathElement.groupElement("limits");
    public static final PathElement PATH$sparseProperties = PathElement.groupElement("sparseProperties");

    public static final OfInt LAYOUT$apiVersion = (OfInt) LAYOUT.select(PATH$apiVersion);
    public static final OfInt LAYOUT$driverVersion = (OfInt) LAYOUT.select(PATH$driverVersion);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final OfInt LAYOUT$deviceType = (OfInt) LAYOUT.select(PATH$deviceType);
    public static final SequenceLayout LAYOUT$deviceName = (SequenceLayout) LAYOUT.select(PATH$deviceName);
    public static final SequenceLayout LAYOUT$pipelineCacheUUID = (SequenceLayout) LAYOUT.select(PATH$pipelineCacheUUID);
    public static final StructLayout LAYOUT$limits = (StructLayout) LAYOUT.select(PATH$limits);
    public static final StructLayout LAYOUT$sparseProperties = (StructLayout) LAYOUT.select(PATH$sparseProperties);

    public static final long OFFSET$apiVersion = LAYOUT.byteOffset(PATH$apiVersion);
    public static final long OFFSET$driverVersion = LAYOUT.byteOffset(PATH$driverVersion);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$deviceType = LAYOUT.byteOffset(PATH$deviceType);
    public static final long OFFSET$deviceName = LAYOUT.byteOffset(PATH$deviceName);
    public static final long OFFSET$pipelineCacheUUID = LAYOUT.byteOffset(PATH$pipelineCacheUUID);
    public static final long OFFSET$limits = LAYOUT.byteOffset(PATH$limits);
    public static final long OFFSET$sparseProperties = LAYOUT.byteOffset(PATH$sparseProperties);

    public VkPhysicalDeviceProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int apiVersion() {
        return segment.get(LAYOUT$apiVersion, OFFSET$apiVersion);
    }

    public void apiVersion(@unsigned int value) {
        segment.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);
    }

    public @unsigned int driverVersion() {
        return segment.get(LAYOUT$driverVersion, OFFSET$driverVersion);
    }

    public void driverVersion(@unsigned int value) {
        segment.set(LAYOUT$driverVersion, OFFSET$driverVersion, value);
    }

    public @unsigned int vendorID() {
        return segment.get(LAYOUT$vendorID, OFFSET$vendorID);
    }

    public void vendorID(@unsigned int value) {
        segment.set(LAYOUT$vendorID, OFFSET$vendorID, value);
    }

    public @unsigned int deviceID() {
        return segment.get(LAYOUT$deviceID, OFFSET$deviceID);
    }

    public void deviceID(@unsigned int value) {
        segment.set(LAYOUT$deviceID, OFFSET$deviceID, value);
    }

    public @enumtype(VkPhysicalDeviceType.class) int deviceType() {
        return segment.get(LAYOUT$deviceType, OFFSET$deviceType);
    }

    public void deviceType(@enumtype(VkPhysicalDeviceType.class) int value) {
        segment.set(LAYOUT$deviceType, OFFSET$deviceType, value);
    }

    public MemorySegment deviceNameRaw() {
        return segment.asSlice(OFFSET$deviceName, LAYOUT$deviceName.byteSize());
    }

    public ByteArray deviceName() {
        return new ByteArray(deviceNameRaw(), LAYOUT$deviceName.elementCount());
    }

    public void deviceName(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deviceName, LAYOUT$deviceName.byteSize());
    }

    public MemorySegment pipelineCacheUUIDRaw() {
        return segment.asSlice(OFFSET$pipelineCacheUUID, LAYOUT$pipelineCacheUUID.byteSize());
    }

    public @unsigned ByteArray pipelineCacheUUID() {
        return new ByteArray(pipelineCacheUUIDRaw(), LAYOUT$pipelineCacheUUID.elementCount());
    }

    public void pipelineCacheUUID(@unsigned ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipelineCacheUUID, LAYOUT$pipelineCacheUUID.byteSize());
    }

    public VkPhysicalDeviceLimits limits() {
        return new VkPhysicalDeviceLimits(segment.asSlice(OFFSET$limits, LAYOUT$limits));
    }

    public void limits(VkPhysicalDeviceLimits value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$limits, LAYOUT$limits.byteSize());
    }

    public VkPhysicalDeviceSparseProperties sparseProperties() {
        return new VkPhysicalDeviceSparseProperties(segment.asSlice(OFFSET$sparseProperties, LAYOUT$sparseProperties));
    }

    public void sparseProperties(VkPhysicalDeviceSparseProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sparseProperties, LAYOUT$sparseProperties.byteSize());
    }


    public static final class VkPhysicalDevicePropertiesFactory implements IDataTypeFactory<VkPhysicalDeviceProperties> {
        @Override
        public Class<VkPhysicalDeviceProperties> clazz() {
            return VkPhysicalDeviceProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceProperties(segment);
        }
    }

    public static final VkPhysicalDevicePropertiesFactory FACTORY = new VkPhysicalDevicePropertiesFactory();
}

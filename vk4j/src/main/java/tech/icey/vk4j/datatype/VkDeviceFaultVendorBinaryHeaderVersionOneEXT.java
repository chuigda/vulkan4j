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

public record VkDeviceFaultVendorBinaryHeaderVersionOneEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID"),
        ValueLayout.JAVA_INT.withName("applicationNameOffset"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.JAVA_INT.withName("engineNameOffset"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );

    public static final PathElement PATH$headerSize = PathElement.groupElement("headerSize");
    public static final PathElement PATH$headerVersion = PathElement.groupElement("headerVersion");
    public static final PathElement PATH$vendorID = PathElement.groupElement("vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("deviceID");
    public static final PathElement PATH$driverVersion = PathElement.groupElement("driverVersion");
    public static final PathElement PATH$pipelineCacheUUID = PathElement.groupElement("pipelineCacheUUID");
    public static final PathElement PATH$applicationNameOffset = PathElement.groupElement("applicationNameOffset");
    public static final PathElement PATH$applicationVersion = PathElement.groupElement("applicationVersion");
    public static final PathElement PATH$engineNameOffset = PathElement.groupElement("engineNameOffset");
    public static final PathElement PATH$engineVersion = PathElement.groupElement("engineVersion");
    public static final PathElement PATH$apiVersion = PathElement.groupElement("apiVersion");

    public static final OfInt LAYOUT$headerSize = (OfInt) LAYOUT.select(PATH$headerSize);
    public static final OfInt LAYOUT$headerVersion = (OfInt) LAYOUT.select(PATH$headerVersion);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final OfInt LAYOUT$driverVersion = (OfInt) LAYOUT.select(PATH$driverVersion);
    public static final SequenceLayout LAYOUT$pipelineCacheUUID = (SequenceLayout) LAYOUT.select(PATH$pipelineCacheUUID);
    public static final OfInt LAYOUT$applicationNameOffset = (OfInt) LAYOUT.select(PATH$applicationNameOffset);
    public static final OfInt LAYOUT$applicationVersion = (OfInt) LAYOUT.select(PATH$applicationVersion);
    public static final OfInt LAYOUT$engineNameOffset = (OfInt) LAYOUT.select(PATH$engineNameOffset);
    public static final OfInt LAYOUT$engineVersion = (OfInt) LAYOUT.select(PATH$engineVersion);
    public static final OfInt LAYOUT$apiVersion = (OfInt) LAYOUT.select(PATH$apiVersion);

    public static final long OFFSET$headerSize = LAYOUT.byteOffset(PATH$headerSize);
    public static final long OFFSET$headerVersion = LAYOUT.byteOffset(PATH$headerVersion);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$driverVersion = LAYOUT.byteOffset(PATH$driverVersion);
    public static final long OFFSET$pipelineCacheUUID = LAYOUT.byteOffset(PATH$pipelineCacheUUID);
    public static final long OFFSET$applicationNameOffset = LAYOUT.byteOffset(PATH$applicationNameOffset);
    public static final long OFFSET$applicationVersion = LAYOUT.byteOffset(PATH$applicationVersion);
    public static final long OFFSET$engineNameOffset = LAYOUT.byteOffset(PATH$engineNameOffset);
    public static final long OFFSET$engineVersion = LAYOUT.byteOffset(PATH$engineVersion);
    public static final long OFFSET$apiVersion = LAYOUT.byteOffset(PATH$apiVersion);

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int headerSize() {
        return segment.get(LAYOUT$headerSize, OFFSET$headerSize);
    }

    public void headerSize(@unsigned int value) {
        segment.set(LAYOUT$headerSize, OFFSET$headerSize, value);
    }

    public @enumtype(VkDeviceFaultVendorBinaryHeaderVersionEXT.class) int headerVersion() {
        return segment.get(LAYOUT$headerVersion, OFFSET$headerVersion);
    }

    public void headerVersion(@enumtype(VkDeviceFaultVendorBinaryHeaderVersionEXT.class) int value) {
        segment.set(LAYOUT$headerVersion, OFFSET$headerVersion, value);
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

    public @unsigned int driverVersion() {
        return segment.get(LAYOUT$driverVersion, OFFSET$driverVersion);
    }

    public void driverVersion(@unsigned int value) {
        segment.set(LAYOUT$driverVersion, OFFSET$driverVersion, value);
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

    public @unsigned int applicationNameOffset() {
        return segment.get(LAYOUT$applicationNameOffset, OFFSET$applicationNameOffset);
    }

    public void applicationNameOffset(@unsigned int value) {
        segment.set(LAYOUT$applicationNameOffset, OFFSET$applicationNameOffset, value);
    }

    public @unsigned int applicationVersion() {
        return segment.get(LAYOUT$applicationVersion, OFFSET$applicationVersion);
    }

    public void applicationVersion(@unsigned int value) {
        segment.set(LAYOUT$applicationVersion, OFFSET$applicationVersion, value);
    }

    public @unsigned int engineNameOffset() {
        return segment.get(LAYOUT$engineNameOffset, OFFSET$engineNameOffset);
    }

    public void engineNameOffset(@unsigned int value) {
        segment.set(LAYOUT$engineNameOffset, OFFSET$engineNameOffset, value);
    }

    public @unsigned int engineVersion() {
        return segment.get(LAYOUT$engineVersion, OFFSET$engineVersion);
    }

    public void engineVersion(@unsigned int value) {
        segment.set(LAYOUT$engineVersion, OFFSET$engineVersion, value);
    }

    public @unsigned int apiVersion() {
        return segment.get(LAYOUT$apiVersion, OFFSET$apiVersion);
    }

    public void apiVersion(@unsigned int value) {
        segment.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);
    }


    public static final class VkDeviceFaultVendorBinaryHeaderVersionOneEXTFactory implements IFactory<VkDeviceFaultVendorBinaryHeaderVersionOneEXT> {
        @Override
        public Class<VkDeviceFaultVendorBinaryHeaderVersionOneEXT> clazz() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.LAYOUT;
        }

        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT createUninit(MemorySegment segment) {
            return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment);
        }
    }

    public static final VkDeviceFaultVendorBinaryHeaderVersionOneEXTFactory FACTORY = new VkDeviceFaultVendorBinaryHeaderVersionOneEXTFactory();
}
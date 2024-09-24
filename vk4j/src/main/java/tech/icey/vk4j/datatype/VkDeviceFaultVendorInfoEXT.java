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

public record VkDeviceFaultVendorInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_LONG.withName("vendorFaultCode"),
        ValueLayout.JAVA_LONG.withName("vendorFaultData")
    );

    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$vendorFaultCode = PathElement.groupElement("vendorFaultCode");
    public static final PathElement PATH$vendorFaultData = PathElement.groupElement("vendorFaultData");

    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final OfLong LAYOUT$vendorFaultCode = (OfLong) LAYOUT.select(PATH$vendorFaultCode);
    public static final OfLong LAYOUT$vendorFaultData = (OfLong) LAYOUT.select(PATH$vendorFaultData);

    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$vendorFaultCode = LAYOUT.byteOffset(PATH$vendorFaultCode);
    public static final long OFFSET$vendorFaultData = LAYOUT.byteOffset(PATH$vendorFaultData);

    public VkDeviceFaultVendorInfoEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, LAYOUT$description.byteSize());
    }

    public ByteArray description() {
        return new ByteArray(descriptionRaw(), LAYOUT$description.elementCount());
    }

    public void description(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, LAYOUT$description.byteSize());
    }

    public @unsigned long vendorFaultCode() {
        return segment.get(LAYOUT$vendorFaultCode, OFFSET$vendorFaultCode);
    }

    public void vendorFaultCode(@unsigned long value) {
        segment.set(LAYOUT$vendorFaultCode, OFFSET$vendorFaultCode, value);
    }

    public @unsigned long vendorFaultData() {
        return segment.get(LAYOUT$vendorFaultData, OFFSET$vendorFaultData);
    }

    public void vendorFaultData(@unsigned long value) {
        segment.set(LAYOUT$vendorFaultData, OFFSET$vendorFaultData, value);
    }


    public static final class VkDeviceFaultVendorInfoEXTFactory implements IFactory<VkDeviceFaultVendorInfoEXT> {
        @Override
        public Class<VkDeviceFaultVendorInfoEXT> clazz() {
            return VkDeviceFaultVendorInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceFaultVendorInfoEXT.LAYOUT;
        }

        @Override
        public VkDeviceFaultVendorInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDeviceFaultVendorInfoEXT createUninit(MemorySegment segment) {
            return new VkDeviceFaultVendorInfoEXT(segment);
        }
    }

    public static final VkDeviceFaultVendorInfoEXTFactory FACTORY = new VkDeviceFaultVendorInfoEXTFactory();
}

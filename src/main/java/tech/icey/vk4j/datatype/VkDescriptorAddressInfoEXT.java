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

public record VkDescriptorAddressInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("address"),
        ValueLayout.JAVA_LONG.withName("range"),
        ValueLayout.JAVA_INT.withName("format")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$address = PathElement.groupElement("address");
    public static final PathElement PATH$range = PathElement.groupElement("range");
    public static final PathElement PATH$format = PathElement.groupElement("format");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$address = (OfLong) LAYOUT.select(PATH$address);
    public static final OfLong LAYOUT$range = (OfLong) LAYOUT.select(PATH$range);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$address = LAYOUT.byteOffset(PATH$address);
    public static final long OFFSET$range = LAYOUT.byteOffset(PATH$range);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);

    public VkDescriptorAddressInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT);
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

    public @unsigned long address() {
        return segment.get(LAYOUT$address, OFFSET$address);
    }

    public void address(@unsigned long value) {
        segment.set(LAYOUT$address, OFFSET$address, value);
    }

    public @unsigned long range() {
        return segment.get(LAYOUT$range, OFFSET$range);
    }

    public void range(@unsigned long value) {
        segment.set(LAYOUT$range, OFFSET$range, value);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }


    public static final class VkDescriptorAddressInfoEXTFactory implements IDataTypeFactory<VkDescriptorAddressInfoEXT> {
        @Override
        public Class<VkDescriptorAddressInfoEXT> clazz() {
            return VkDescriptorAddressInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDescriptorAddressInfoEXT.LAYOUT;
        }

        @Override
        public VkDescriptorAddressInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDescriptorAddressInfoEXT createUninit(MemorySegment segment) {
            return new VkDescriptorAddressInfoEXT(segment);
        }
    }

    public static final VkDescriptorAddressInfoEXTFactory FACTORY = new VkDescriptorAddressInfoEXTFactory();
}

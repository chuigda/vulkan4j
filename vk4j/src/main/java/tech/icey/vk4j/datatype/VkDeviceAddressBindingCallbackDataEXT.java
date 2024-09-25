package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkDeviceAddressBindingCallbackDataEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("baseAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("bindingType")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$baseAddress = PathElement.groupElement("baseAddress");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$bindingType = PathElement.groupElement("bindingType");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$baseAddress = (OfLong) LAYOUT.select(PATH$baseAddress);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$bindingType = (OfInt) LAYOUT.select(PATH$bindingType);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$baseAddress = LAYOUT.byteOffset(PATH$baseAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$bindingType = LAYOUT.byteOffset(PATH$bindingType);

    public VkDeviceAddressBindingCallbackDataEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT);
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

    public @enumtype(VkDeviceAddressBindingFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDeviceAddressBindingFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long baseAddress() {
        return segment.get(LAYOUT$baseAddress, OFFSET$baseAddress);
    }

    public void baseAddress(@unsigned long value) {
        segment.set(LAYOUT$baseAddress, OFFSET$baseAddress, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkDeviceAddressBindingTypeEXT.class) int bindingType() {
        return segment.get(LAYOUT$bindingType, OFFSET$bindingType);
    }

    public void bindingType(@enumtype(VkDeviceAddressBindingTypeEXT.class) int value) {
        segment.set(LAYOUT$bindingType, OFFSET$bindingType, value);
    }


    public static final class Factory implements IFactory<VkDeviceAddressBindingCallbackDataEXT> {
        @Override
        public Class<VkDeviceAddressBindingCallbackDataEXT> clazz() {
            return VkDeviceAddressBindingCallbackDataEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceAddressBindingCallbackDataEXT.LAYOUT;
        }

        @Override
        public VkDeviceAddressBindingCallbackDataEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDeviceAddressBindingCallbackDataEXT createUninit(MemorySegment segment) {
            return new VkDeviceAddressBindingCallbackDataEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

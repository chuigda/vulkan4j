package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDisplayProperties2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDisplayPropertiesKHR.LAYOUT.withName("displayProperties")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$displayProperties = PathElement.groupElement("displayProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$displayProperties = (StructLayout) LAYOUT.select(PATH$displayProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displayProperties = LAYOUT.byteOffset(PATH$displayProperties);

    public VkDisplayProperties2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR);
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

    public VkDisplayPropertiesKHR displayProperties() {
        return new VkDisplayPropertiesKHR(segment.asSlice(OFFSET$displayProperties, LAYOUT$displayProperties));
    }

    public void displayProperties(VkDisplayPropertiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayProperties, LAYOUT$displayProperties.byteSize());
    }


    public static final class Factory implements IFactory<VkDisplayProperties2KHR> {
        @Override
        public Class<VkDisplayProperties2KHR> clazz() {
            return VkDisplayProperties2KHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDisplayProperties2KHR.LAYOUT;
        }

        @Override
        public VkDisplayProperties2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayProperties2KHR createUninit(MemorySegment segment) {
            return new VkDisplayProperties2KHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

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

public record VkDisplayModeProperties2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDisplayModePropertiesKHR.LAYOUT.withName("displayModeProperties")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$displayModeProperties = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$displayModeProperties = (StructLayout) LAYOUT.select(PATH$displayModeProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displayModeProperties = LAYOUT.byteOffset(PATH$displayModeProperties);

    public VkDisplayModeProperties2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR);
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

    public VkDisplayModePropertiesKHR displayModeProperties() {
        return new VkDisplayModePropertiesKHR(segment.asSlice(OFFSET$displayModeProperties, LAYOUT$displayModeProperties));
    }

    public void displayModeProperties(VkDisplayModePropertiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayModeProperties, LAYOUT$displayModeProperties.byteSize());
    }


    public static final class VkDisplayModeProperties2KHRFactory implements IDataTypeFactory<VkDisplayModeProperties2KHR> {
        @Override
        public Class<VkDisplayModeProperties2KHR> clazz() {
            return VkDisplayModeProperties2KHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDisplayModeProperties2KHR.LAYOUT;
        }

        @Override
        public VkDisplayModeProperties2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDisplayModeProperties2KHR createUninit(MemorySegment segment) {
            return new VkDisplayModeProperties2KHR(segment);
        }
    }

    public static final VkDisplayModeProperties2KHRFactory FACTORY = new VkDisplayModeProperties2KHRFactory();
}
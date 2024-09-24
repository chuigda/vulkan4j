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

public record VkDisplayPlaneProperties2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDisplayPlanePropertiesKHR.LAYOUT.withName("displayPlaneProperties")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$displayPlaneProperties = PathElement.groupElement("displayPlaneProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$displayPlaneProperties = (StructLayout) LAYOUT.select(PATH$displayPlaneProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displayPlaneProperties = LAYOUT.byteOffset(PATH$displayPlaneProperties);

    public VkDisplayPlaneProperties2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR);
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

    public VkDisplayPlanePropertiesKHR displayPlaneProperties() {
        return new VkDisplayPlanePropertiesKHR(segment.asSlice(OFFSET$displayPlaneProperties, LAYOUT$displayPlaneProperties));
    }

    public void displayPlaneProperties(VkDisplayPlanePropertiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayPlaneProperties, LAYOUT$displayPlaneProperties.byteSize());
    }


    public static final class Factory implements IFactory<VkDisplayPlaneProperties2KHR> {
        @Override
        public Class<VkDisplayPlaneProperties2KHR> clazz() {
            return VkDisplayPlaneProperties2KHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDisplayPlaneProperties2KHR.LAYOUT;
        }

        @Override
        public VkDisplayPlaneProperties2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayPlaneProperties2KHR createUninit(MemorySegment segment) {
            return new VkDisplayPlaneProperties2KHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

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

public record VkDisplayEventInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displayEvent")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$displayEvent = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$displayEvent = (OfInt) LAYOUT.select(PATH$displayEvent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displayEvent = LAYOUT.byteOffset(PATH$displayEvent);

    public VkDisplayEventInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT);
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

    public @enumtype(VkDisplayEventTypeEXT.class) int displayEvent() {
        return segment.get(LAYOUT$displayEvent, OFFSET$displayEvent);
    }

    public void displayEvent(@enumtype(VkDisplayEventTypeEXT.class) int value) {
        segment.set(LAYOUT$displayEvent, OFFSET$displayEvent, value);
    }


    public static final class VkDisplayEventInfoEXTFactory implements IDataTypeFactory<VkDisplayEventInfoEXT> {
        @Override
        public Class<VkDisplayEventInfoEXT> clazz() {
            return VkDisplayEventInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDisplayEventInfoEXT.LAYOUT;
        }

        @Override
        public VkDisplayEventInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDisplayEventInfoEXT createUninit(MemorySegment segment) {
            return new VkDisplayEventInfoEXT(segment);
        }
    }

    public static final VkDisplayEventInfoEXTFactory FACTORY = new VkDisplayEventInfoEXTFactory();
}
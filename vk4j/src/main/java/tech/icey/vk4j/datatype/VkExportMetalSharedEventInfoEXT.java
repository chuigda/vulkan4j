package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkExportMetalSharedEventInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.ADDRESS.withName("event"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$semaphore = PathElement.groupElement("semaphore");
    public static final PathElement PATH$event = PathElement.groupElement("event");
    public static final PathElement PATH$mtlSharedEvent = PathElement.groupElement("mtlSharedEvent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphore = (AddressLayout) LAYOUT.select(PATH$semaphore);
    public static final AddressLayout LAYOUT$event = (AddressLayout) LAYOUT.select(PATH$event);
    public static final AddressLayout LAYOUT$mtlSharedEvent = (AddressLayout) LAYOUT.select(PATH$mtlSharedEvent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$event = LAYOUT.byteOffset(PATH$event);
    public static final long OFFSET$mtlSharedEvent = LAYOUT.byteOffset(PATH$mtlSharedEvent);

    public VkExportMetalSharedEventInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT);
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

    public VkSemaphore semaphore() {
        return new VkSemaphore(segment.asSlice(OFFSET$semaphore, LAYOUT$semaphore));
    }

    public void semaphore(VkSemaphore value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$semaphore, LAYOUT$semaphore.byteSize());
    }

    public VkEvent event() {
        return new VkEvent(segment.asSlice(OFFSET$event, LAYOUT$event));
    }

    public void event(VkEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$event, LAYOUT$event.byteSize());
    }

    public @pointer(comment="void*") MemorySegment mtlSharedEvent() {
        return segment.get(LAYOUT$mtlSharedEvent, OFFSET$mtlSharedEvent);
    }

    public void mtlSharedEvent(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlSharedEvent, OFFSET$mtlSharedEvent, value);
    }


    public static final class Factory implements IFactory<VkExportMetalSharedEventInfoEXT> {
        @Override
        public Class<VkExportMetalSharedEventInfoEXT> clazz() {
            return VkExportMetalSharedEventInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkExportMetalSharedEventInfoEXT.LAYOUT;
        }

        @Override
        public VkExportMetalSharedEventInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkExportMetalSharedEventInfoEXT createUninit(MemorySegment segment) {
            return new VkExportMetalSharedEventInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

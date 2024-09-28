package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkExportMetalSharedEventInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphore semaphore;
///     VkEvent event;
///     MTLSharedEvent_id mtlSharedEvent;
/// } VkExportMetalSharedEventInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkExportMetalSharedEventInfoEXT.html">VkExportMetalSharedEventInfoEXT</a>
public record VkExportMetalSharedEventInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.ADDRESS.withName("event"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$semaphore = LAYOUT$semaphore.byteSize();
    public static final long SIZE$event = LAYOUT$event.byteSize();
    public static final long SIZE$mtlSharedEvent = LAYOUT$mtlSharedEvent.byteSize();

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public VkSemaphore semaphore() {
        return new VkSemaphore(segment.get(LAYOUT$semaphore, OFFSET$semaphore));
    }

    public void semaphore(VkSemaphore value) {
        segment.set(LAYOUT$semaphore, OFFSET$semaphore, value.segment());
    }

    public VkEvent event() {
        return new VkEvent(segment.get(LAYOUT$event, OFFSET$event));
    }

    public void event(VkEvent value) {
        segment.set(LAYOUT$event, OFFSET$event, value.segment());
    }

    public @pointer(comment="void*") MemorySegment mtlSharedEvent() {
        return segment.get(LAYOUT$mtlSharedEvent, OFFSET$mtlSharedEvent);
    }

    public void mtlSharedEvent(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlSharedEvent, OFFSET$mtlSharedEvent, value);
    }

    public void mtlSharedEvent(IPointer pointer) {
        mtlSharedEvent(pointer.segment());
    }

    public static VkExportMetalSharedEventInfoEXT allocate(Arena arena) {
        return new VkExportMetalSharedEventInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkExportMetalSharedEventInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalSharedEventInfoEXT[] ret = new VkExportMetalSharedEventInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkExportMetalSharedEventInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

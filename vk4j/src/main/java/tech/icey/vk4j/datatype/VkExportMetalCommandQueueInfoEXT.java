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
/// typedef struct VkExportMetalCommandQueueInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkQueue queue;
///     MTLCommandQueue_id mtlCommandQueue;
/// } VkExportMetalCommandQueueInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkExportMetalCommandQueueInfoEXT.html">VkExportMetalCommandQueueInfoEXT</a>
public record VkExportMetalCommandQueueInfoEXT(MemorySegment segment) implements IPointer {
    public VkExportMetalCommandQueueInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT);
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

    public @nullable VkQueue queue() {
        MemorySegment s = segment.get(LAYOUT$queue, OFFSET$queue);
        if (s.address() == 0) {
            return null;
        }
        return new VkQueue(s);
    }

    public void queue(@nullable VkQueue value) {
        segment.set(
            LAYOUT$queue,
            OFFSET$queue,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @pointer(comment="void*") MemorySegment mtlCommandQueue() {
        return segment.get(LAYOUT$mtlCommandQueue, OFFSET$mtlCommandQueue);
    }

    public void mtlCommandQueue(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlCommandQueue, OFFSET$mtlCommandQueue, value);
    }

    public void mtlCommandQueue(IPointer pointer) {
        mtlCommandQueue(pointer.segment());
    }

    public static VkExportMetalCommandQueueInfoEXT allocate(Arena arena) {
        return new VkExportMetalCommandQueueInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkExportMetalCommandQueueInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalCommandQueueInfoEXT[] ret = new VkExportMetalCommandQueueInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkExportMetalCommandQueueInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExportMetalCommandQueueInfoEXT clone(Arena arena, VkExportMetalCommandQueueInfoEXT src) {
        VkExportMetalCommandQueueInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExportMetalCommandQueueInfoEXT[] clone(Arena arena, VkExportMetalCommandQueueInfoEXT[] src) {
        VkExportMetalCommandQueueInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("queue"),
        ValueLayout.ADDRESS.withName("mtlCommandQueue")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$queue = PathElement.groupElement("queue");
    public static final PathElement PATH$mtlCommandQueue = PathElement.groupElement("mtlCommandQueue");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$queue = (AddressLayout) LAYOUT.select(PATH$queue);
    public static final AddressLayout LAYOUT$mtlCommandQueue = (AddressLayout) LAYOUT.select(PATH$mtlCommandQueue);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queue = LAYOUT.byteOffset(PATH$queue);
    public static final long OFFSET$mtlCommandQueue = LAYOUT.byteOffset(PATH$mtlCommandQueue);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queue = LAYOUT$queue.byteSize();
    public static final long SIZE$mtlCommandQueue = LAYOUT$mtlCommandQueue.byteSize();
}

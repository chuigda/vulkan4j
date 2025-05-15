package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkExportMetalCommandQueueInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$queue = ValueLayout.ADDRESS.withName("queue");
    public static final AddressLayout LAYOUT$mtlCommandQueue = ValueLayout.ADDRESS.withName("mtlCommandQueue");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$queue, LAYOUT$mtlCommandQueue);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkExportMetalCommandQueueInfoEXT allocate(Arena arena) {
        return new VkExportMetalCommandQueueInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkExportMetalCommandQueueInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalCommandQueueInfoEXT[] ret = new VkExportMetalCommandQueueInfoEXT[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$queue = PathElement.groupElement("PATH$queue");
    public static final PathElement PATH$mtlCommandQueue = PathElement.groupElement("PATH$mtlCommandQueue");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queue = LAYOUT$queue.byteSize();
    public static final long SIZE$mtlCommandQueue = LAYOUT$mtlCommandQueue.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queue = LAYOUT.byteOffset(PATH$queue);
    public static final long OFFSET$mtlCommandQueue = LAYOUT.byteOffset(PATH$mtlCommandQueue);

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

    public @Nullable VkQueue queue() {
        MemorySegment s = segment.asSlice(OFFSET$queue, SIZE$queue);
        if (s.address() == 0) {
            return null;
        }
        return new VkQueue(s);
    }

    public void queue() {
        segment.set(LAYOUT$queue, OFFSET$queue, value != null ? value.segment() : MemorySegment.NULL);
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

}
/// dummy, not implemented yet

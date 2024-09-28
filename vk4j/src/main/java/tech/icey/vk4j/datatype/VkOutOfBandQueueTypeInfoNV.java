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

public record VkOutOfBandQueueTypeInfoNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueType")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$queueType = PathElement.groupElement("queueType");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$queueType = (OfInt) LAYOUT.select(PATH$queueType);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queueType = LAYOUT.byteOffset(PATH$queueType);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queueType = LAYOUT$queueType.byteSize();

    public VkOutOfBandQueueTypeInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV);
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

    public @enumtype(VkOutOfBandQueueTypeNV.class) int queueType() {
        return segment.get(LAYOUT$queueType, OFFSET$queueType);
    }

    public void queueType(@enumtype(VkOutOfBandQueueTypeNV.class) int value) {
        segment.set(LAYOUT$queueType, OFFSET$queueType, value);
    }

    public static VkOutOfBandQueueTypeInfoNV allocate(Arena arena) {
        return new VkOutOfBandQueueTypeInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkOutOfBandQueueTypeInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkOutOfBandQueueTypeInfoNV[] ret = new VkOutOfBandQueueTypeInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkOutOfBandQueueTypeInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

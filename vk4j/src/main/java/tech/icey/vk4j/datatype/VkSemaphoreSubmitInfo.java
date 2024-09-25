package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSemaphoreSubmitInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("value"),
        ValueLayout.JAVA_INT.withName("stageMask"),
        ValueLayout.JAVA_INT.withName("deviceIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$semaphore = PathElement.groupElement("semaphore");
    public static final PathElement PATH$value = PathElement.groupElement("value");
    public static final PathElement PATH$stageMask = PathElement.groupElement("stageMask");
    public static final PathElement PATH$deviceIndex = PathElement.groupElement("deviceIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphore = (AddressLayout) LAYOUT.select(PATH$semaphore);
    public static final OfLong LAYOUT$value = (OfLong) LAYOUT.select(PATH$value);
    public static final OfInt LAYOUT$stageMask = (OfInt) LAYOUT.select(PATH$stageMask);
    public static final OfInt LAYOUT$deviceIndex = (OfInt) LAYOUT.select(PATH$deviceIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);
    public static final long OFFSET$stageMask = LAYOUT.byteOffset(PATH$stageMask);
    public static final long OFFSET$deviceIndex = LAYOUT.byteOffset(PATH$deviceIndex);

    public VkSemaphoreSubmitInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO);
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

    public @unsigned long value() {
        return segment.get(LAYOUT$value, OFFSET$value);
    }

    public void value(@unsigned long value) {
        segment.set(LAYOUT$value, OFFSET$value, value);
    }

    public @enumtype(VkPipelineStageFlags2.class) int stageMask() {
        return segment.get(LAYOUT$stageMask, OFFSET$stageMask);
    }

    public void stageMask(@enumtype(VkPipelineStageFlags2.class) int value) {
        segment.set(LAYOUT$stageMask, OFFSET$stageMask, value);
    }

    public @unsigned int deviceIndex() {
        return segment.get(LAYOUT$deviceIndex, OFFSET$deviceIndex);
    }

    public void deviceIndex(@unsigned int value) {
        segment.set(LAYOUT$deviceIndex, OFFSET$deviceIndex, value);
    }

    public static VkSemaphoreSubmitInfo allocate(Arena arena) {
        return new VkSemaphoreSubmitInfo(arena.allocate(LAYOUT));
    }
    
    public static VkSemaphoreSubmitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSemaphoreSubmitInfo[] ret = new VkSemaphoreSubmitInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSemaphoreSubmitInfo(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

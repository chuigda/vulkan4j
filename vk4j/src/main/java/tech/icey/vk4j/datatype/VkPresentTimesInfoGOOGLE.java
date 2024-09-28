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

public record VkPresentTimesInfoGOOGLE(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPresentTimeGOOGLE.LAYOUT).withName("pTimes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("swapchainCount");
    public static final PathElement PATH$pTimes = PathElement.groupElement("pTimes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pTimes = (AddressLayout) LAYOUT.select(PATH$pTimes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pTimes = LAYOUT.byteOffset(PATH$pTimes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pTimes = LAYOUT$pTimes.byteSize();

    public VkPresentTimesInfoGOOGLE(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE);
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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="VkPresentTimeGOOGLE*") MemorySegment pTimesRaw() {
        return segment.get(LAYOUT$pTimes, OFFSET$pTimes);
    }

    public void pTimesRaw(@pointer(comment="VkPresentTimeGOOGLE*") MemorySegment value) {
        segment.set(LAYOUT$pTimes, OFFSET$pTimes, value);
    }
    
    public @nullable VkPresentTimeGOOGLE pTimes() {
        MemorySegment s = pTimesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPresentTimeGOOGLE(s);
    }

    @unsafe
    public @nullable VkPresentTimeGOOGLE[] pTimes(int assumedCount) {
        MemorySegment s = pTimesRaw().reinterpret(assumedCount * VkPresentTimeGOOGLE.SIZE);
        VkPresentTimeGOOGLE[] arr = new VkPresentTimeGOOGLE[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPresentTimeGOOGLE(s.asSlice(i * VkPresentTimeGOOGLE.SIZE, VkPresentTimeGOOGLE.SIZE));
        }
        return arr;
    }

    public void pTimes(@nullable VkPresentTimeGOOGLE value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTimesRaw(s);
    }

    public static VkPresentTimesInfoGOOGLE allocate(Arena arena) {
        return new VkPresentTimesInfoGOOGLE(arena.allocate(LAYOUT));
    }
    
    public static VkPresentTimesInfoGOOGLE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentTimesInfoGOOGLE[] ret = new VkPresentTimesInfoGOOGLE[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPresentTimesInfoGOOGLE(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

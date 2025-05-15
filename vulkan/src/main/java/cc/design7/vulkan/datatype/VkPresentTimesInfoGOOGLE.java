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

public record VkPresentTimesInfoGOOGLE(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$swapchainCount = ValueLayout.JAVA_INT.withName("swapchainCount");
    public static final AddressLayout LAYOUT$pTimes = ValueLayout.ADDRESS.withTargetLayout(VkPresentTimeGOOGLE.LAYOUT).withName("pTimes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$swapchainCount, LAYOUT$pTimes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPresentTimesInfoGOOGLE allocate(Arena arena) {
        return new VkPresentTimesInfoGOOGLE(arena.allocate(LAYOUT));
    }

    public static VkPresentTimesInfoGOOGLE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentTimesInfoGOOGLE[] ret = new VkPresentTimesInfoGOOGLE[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPresentTimesInfoGOOGLE(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPresentTimesInfoGOOGLE clone(Arena arena, VkPresentTimesInfoGOOGLE src) {
        VkPresentTimesInfoGOOGLE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPresentTimesInfoGOOGLE[] clone(Arena arena, VkPresentTimesInfoGOOGLE[] src) {
        VkPresentTimesInfoGOOGLE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("PATH$swapchainCount");
    public static final PathElement PATH$pTimes = PathElement.groupElement("PATH$pTimes");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pTimes = LAYOUT$pTimes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pTimes = LAYOUT.byteOffset(PATH$pTimes);

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

    public @Nullable VkPresentTimeGOOGLE pTimes() {
        MemorySegment s = pTimesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPresentTimeGOOGLE(s);
    }

    public void pTimes(@Nullable VkPresentTimeGOOGLE value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTimesRaw(s);
    }

    @unsafe public @Nullable VkPresentTimeGOOGLE[] pTimes(int assumedCount) {
        MemorySegment s = pTimesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPresentTimeGOOGLE.SIZE);
        VkPresentTimeGOOGLE[] ret = new VkPresentTimeGOOGLE[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPresentTimeGOOGLE(s.asSlice(i * VkPresentTimeGOOGLE.SIZE, VkPresentTimeGOOGLE.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet

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

public record VkMemoryBarrierAccessFlags3KHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$srcAccessMask3 = ValueLayout.JAVA_LONG.withName("srcAccessMask3");
    public static final OfLong LAYOUT$dstAccessMask3 = ValueLayout.JAVA_LONG.withName("dstAccessMask3");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$srcAccessMask3, LAYOUT$dstAccessMask3);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMemoryBarrierAccessFlags3KHR allocate(Arena arena) {
        return new VkMemoryBarrierAccessFlags3KHR(arena.allocate(LAYOUT));
    }

    public static VkMemoryBarrierAccessFlags3KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryBarrierAccessFlags3KHR[] ret = new VkMemoryBarrierAccessFlags3KHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryBarrierAccessFlags3KHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMemoryBarrierAccessFlags3KHR clone(Arena arena, VkMemoryBarrierAccessFlags3KHR src) {
        VkMemoryBarrierAccessFlags3KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryBarrierAccessFlags3KHR[] clone(Arena arena, VkMemoryBarrierAccessFlags3KHR[] src) {
        VkMemoryBarrierAccessFlags3KHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcAccessMask3 = PathElement.groupElement("PATH$srcAccessMask3");
    public static final PathElement PATH$dstAccessMask3 = PathElement.groupElement("PATH$dstAccessMask3");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcAccessMask3 = LAYOUT$srcAccessMask3.byteSize();
    public static final long SIZE$dstAccessMask3 = LAYOUT$dstAccessMask3.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcAccessMask3 = LAYOUT.byteOffset(PATH$srcAccessMask3);
    public static final long OFFSET$dstAccessMask3 = LAYOUT.byteOffset(PATH$dstAccessMask3);

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

    public @enumtype(VkAccessFlags3KHR.class) long srcAccessMask3() {
        return segment.get(LAYOUT$srcAccessMask3, OFFSET$srcAccessMask3);
    }

    public void srcAccessMask3(@enumtype(VkAccessFlags3KHR.class) long value) {
        segment.set(LAYOUT$srcAccessMask3, OFFSET$srcAccessMask3, value);
    }

    public @enumtype(VkAccessFlags3KHR.class) long dstAccessMask3() {
        return segment.get(LAYOUT$dstAccessMask3, OFFSET$dstAccessMask3);
    }

    public void dstAccessMask3(@enumtype(VkAccessFlags3KHR.class) long value) {
        segment.set(LAYOUT$dstAccessMask3, OFFSET$dstAccessMask3, value);
    }

}
/// dummy, not implemented yet

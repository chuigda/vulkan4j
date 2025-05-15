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

public record VkCommandBufferSubmitInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$commandBuffer = ValueLayout.ADDRESS.withName("commandBuffer");
    public static final OfInt LAYOUT$deviceMask = ValueLayout.JAVA_INT.withName("deviceMask");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$commandBuffer, LAYOUT$deviceMask);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCommandBufferSubmitInfo allocate(Arena arena) {
        return new VkCommandBufferSubmitInfo(arena.allocate(LAYOUT));
    }

    public static VkCommandBufferSubmitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferSubmitInfo[] ret = new VkCommandBufferSubmitInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCommandBufferSubmitInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCommandBufferSubmitInfo clone(Arena arena, VkCommandBufferSubmitInfo src) {
        VkCommandBufferSubmitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCommandBufferSubmitInfo[] clone(Arena arena, VkCommandBufferSubmitInfo[] src) {
        VkCommandBufferSubmitInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$commandBuffer = PathElement.groupElement("PATH$commandBuffer");
    public static final PathElement PATH$deviceMask = PathElement.groupElement("PATH$deviceMask");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$commandBuffer = LAYOUT$commandBuffer.byteSize();
    public static final long SIZE$deviceMask = LAYOUT$deviceMask.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$commandBuffer = LAYOUT.byteOffset(PATH$commandBuffer);
    public static final long OFFSET$deviceMask = LAYOUT.byteOffset(PATH$deviceMask);

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

    public @Nullable VkCommandBuffer commandBuffer() {
        MemorySegment s = segment.asSlice(OFFSET$commandBuffer, SIZE$commandBuffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkCommandBuffer(s);
    }

    public void commandBuffer() {
        segment.set(LAYOUT$commandBuffer, OFFSET$commandBuffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int deviceMask() {
        return segment.get(LAYOUT$deviceMask, OFFSET$deviceMask);
    }

    public void deviceMask(@unsigned int value) {
        segment.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);
    }

}
/// dummy, not implemented yet

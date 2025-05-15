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

public record VkCommandBufferInheritanceViewportScissorInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$viewportScissor2D = ValueLayout.JAVA_INT.withName("viewportScissor2D");
    public static final OfInt LAYOUT$viewportDepthCount = ValueLayout.JAVA_INT.withName("viewportDepthCount");
    public static final AddressLayout LAYOUT$pViewportDepths = ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT).withName("pViewportDepths");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$viewportScissor2D, LAYOUT$viewportDepthCount, LAYOUT$pViewportDepths);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCommandBufferInheritanceViewportScissorInfoNV allocate(Arena arena) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(arena.allocate(LAYOUT));
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferInheritanceViewportScissorInfoNV[] ret = new VkCommandBufferInheritanceViewportScissorInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCommandBufferInheritanceViewportScissorInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV clone(Arena arena, VkCommandBufferInheritanceViewportScissorInfoNV src) {
        VkCommandBufferInheritanceViewportScissorInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV[] clone(Arena arena, VkCommandBufferInheritanceViewportScissorInfoNV[] src) {
        VkCommandBufferInheritanceViewportScissorInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$viewportScissor2D = PathElement.groupElement("PATH$viewportScissor2D");
    public static final PathElement PATH$viewportDepthCount = PathElement.groupElement("PATH$viewportDepthCount");
    public static final PathElement PATH$pViewportDepths = PathElement.groupElement("PATH$pViewportDepths");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$viewportScissor2D = LAYOUT$viewportScissor2D.byteSize();
    public static final long SIZE$viewportDepthCount = LAYOUT$viewportDepthCount.byteSize();
    public static final long SIZE$pViewportDepths = LAYOUT$pViewportDepths.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewportScissor2D = LAYOUT.byteOffset(PATH$viewportScissor2D);
    public static final long OFFSET$viewportDepthCount = LAYOUT.byteOffset(PATH$viewportDepthCount);
    public static final long OFFSET$pViewportDepths = LAYOUT.byteOffset(PATH$pViewportDepths);

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

    public @unsigned int viewportScissor2D() {
        return segment.get(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D);
    }

    public void viewportScissor2D(@unsigned int value) {
        segment.set(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D, value);
    }

    public @unsigned int viewportDepthCount() {
        return segment.get(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount);
    }

    public void viewportDepthCount(@unsigned int value) {
        segment.set(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount, value);
    }

    public @pointer(comment="VkViewport*") MemorySegment pViewportDepthsRaw() {
        return segment.get(LAYOUT$pViewportDepths, OFFSET$pViewportDepths);
    }

    public void pViewportDepthsRaw(@pointer(comment="VkViewport*") MemorySegment value) {
        segment.set(LAYOUT$pViewportDepths, OFFSET$pViewportDepths, value);
    }

    public @Nullable VkViewport pViewportDepths() {
        MemorySegment s = pViewportDepthsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkViewport(s);
    }

    public void pViewportDepths(@Nullable VkViewport value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportDepthsRaw(s);
    }

    @unsafe public @Nullable VkViewport[] pViewportDepths(int assumedCount) {
        MemorySegment s = pViewportDepthsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkViewport.SIZE);
        VkViewport[] ret = new VkViewport[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkViewport(s.asSlice(i * VkViewport.SIZE, VkViewport.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet

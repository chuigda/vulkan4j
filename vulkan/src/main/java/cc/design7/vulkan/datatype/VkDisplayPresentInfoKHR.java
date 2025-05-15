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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPresentInfoKHR.html">VkDisplayPresentInfoKHR</a>
@ValueBasedCandidate
public record VkDisplayPresentInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$srcRect = VkRect2D.LAYOUT.withName("srcRect");
    public static final StructLayout LAYOUT$dstRect = VkRect2D.LAYOUT.withName("dstRect");
    public static final OfInt LAYOUT$persistent = ValueLayout.JAVA_INT.withName("persistent");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$srcRect, LAYOUT$dstRect, LAYOUT$persistent);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDisplayPresentInfoKHR allocate(Arena arena) {
        return new VkDisplayPresentInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayPresentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPresentInfoKHR[] ret = new VkDisplayPresentInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayPresentInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplayPresentInfoKHR clone(Arena arena, VkDisplayPresentInfoKHR src) {
        VkDisplayPresentInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayPresentInfoKHR[] clone(Arena arena, VkDisplayPresentInfoKHR[] src) {
        VkDisplayPresentInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcRect = PathElement.groupElement("PATH$srcRect");
    public static final PathElement PATH$dstRect = PathElement.groupElement("PATH$dstRect");
    public static final PathElement PATH$persistent = PathElement.groupElement("PATH$persistent");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcRect = LAYOUT$srcRect.byteSize();
    public static final long SIZE$dstRect = LAYOUT$dstRect.byteSize();
    public static final long SIZE$persistent = LAYOUT$persistent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcRect = LAYOUT.byteOffset(PATH$srcRect);
    public static final long OFFSET$dstRect = LAYOUT.byteOffset(PATH$dstRect);
    public static final long OFFSET$persistent = LAYOUT.byteOffset(PATH$persistent);

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

    public VkRect2D srcRect() {
        return new VkRect2D(segment.asSlice(OFFSET$srcRect, LAYOUT$srcRect));
    }

    public void srcRect(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcRect, SIZE$srcRect);
    }

    public VkRect2D dstRect() {
        return new VkRect2D(segment.asSlice(OFFSET$dstRect, LAYOUT$dstRect));
    }

    public void dstRect(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstRect, SIZE$dstRect);
    }

    public @unsigned int persistent() {
        return segment.get(LAYOUT$persistent, OFFSET$persistent);
    }

    public void persistent(@unsigned int value) {
        segment.set(LAYOUT$persistent, OFFSET$persistent, value);
    }

}

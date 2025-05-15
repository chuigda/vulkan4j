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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainPresentFenceInfoEXT.html">VkSwapchainPresentFenceInfoEXT</a>
@ValueBasedCandidate
public record VkSwapchainPresentFenceInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$swapchainCount = ValueLayout.JAVA_INT.withName("swapchainCount");
    public static final AddressLayout LAYOUT$pFences = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pFences");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$swapchainCount, LAYOUT$pFences);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSwapchainPresentFenceInfoEXT allocate(Arena arena) {
        return new VkSwapchainPresentFenceInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkSwapchainPresentFenceInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainPresentFenceInfoEXT[] ret = new VkSwapchainPresentFenceInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSwapchainPresentFenceInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSwapchainPresentFenceInfoEXT clone(Arena arena, VkSwapchainPresentFenceInfoEXT src) {
        VkSwapchainPresentFenceInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSwapchainPresentFenceInfoEXT[] clone(Arena arena, VkSwapchainPresentFenceInfoEXT[] src) {
        VkSwapchainPresentFenceInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("PATH$swapchainCount");
    public static final PathElement PATH$pFences = PathElement.groupElement("PATH$pFences");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pFences = LAYOUT$pFences.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pFences = LAYOUT.byteOffset(PATH$pFences);

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

    public @pointer(comment="VkFence*") MemorySegment pFencesRaw() {
        return segment.get(LAYOUT$pFences, OFFSET$pFences);
    }

    public void pFencesRaw(@pointer(comment="VkFence*") MemorySegment value) {
        segment.set(LAYOUT$pFences, OFFSET$pFences, value);
    }

    /// Note: the returned {@link VkFence.Buffer} does not have correct {@link VkFence.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkFence.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkFence.Buffer pFences() {
        MemorySegment s = pFencesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkFence.Buffer(s);
    }


}

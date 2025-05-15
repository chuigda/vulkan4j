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

public record VkSwapchainPresentScalingCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$scalingBehavior = ValueLayout.JAVA_INT.withName("scalingBehavior");
    public static final OfInt LAYOUT$presentGravityX = ValueLayout.JAVA_INT.withName("presentGravityX");
    public static final OfInt LAYOUT$presentGravityY = ValueLayout.JAVA_INT.withName("presentGravityY");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$scalingBehavior, LAYOUT$presentGravityX, LAYOUT$presentGravityY);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSwapchainPresentScalingCreateInfoEXT allocate(Arena arena) {
        return new VkSwapchainPresentScalingCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkSwapchainPresentScalingCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainPresentScalingCreateInfoEXT[] ret = new VkSwapchainPresentScalingCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSwapchainPresentScalingCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSwapchainPresentScalingCreateInfoEXT clone(Arena arena, VkSwapchainPresentScalingCreateInfoEXT src) {
        VkSwapchainPresentScalingCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSwapchainPresentScalingCreateInfoEXT[] clone(Arena arena, VkSwapchainPresentScalingCreateInfoEXT[] src) {
        VkSwapchainPresentScalingCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$scalingBehavior = PathElement.groupElement("PATH$scalingBehavior");
    public static final PathElement PATH$presentGravityX = PathElement.groupElement("PATH$presentGravityX");
    public static final PathElement PATH$presentGravityY = PathElement.groupElement("PATH$presentGravityY");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$scalingBehavior = LAYOUT$scalingBehavior.byteSize();
    public static final long SIZE$presentGravityX = LAYOUT$presentGravityX.byteSize();
    public static final long SIZE$presentGravityY = LAYOUT$presentGravityY.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$scalingBehavior = LAYOUT.byteOffset(PATH$scalingBehavior);
    public static final long OFFSET$presentGravityX = LAYOUT.byteOffset(PATH$presentGravityX);
    public static final long OFFSET$presentGravityY = LAYOUT.byteOffset(PATH$presentGravityY);

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

    public @enumtype(VkPresentScalingFlagsEXT.class) int scalingBehavior() {
        return segment.get(LAYOUT$scalingBehavior, OFFSET$scalingBehavior);
    }

    public void scalingBehavior(@enumtype(VkPresentScalingFlagsEXT.class) int value) {
        segment.set(LAYOUT$scalingBehavior, OFFSET$scalingBehavior, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int presentGravityX() {
        return segment.get(LAYOUT$presentGravityX, OFFSET$presentGravityX);
    }

    public void presentGravityX(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$presentGravityX, OFFSET$presentGravityX, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int presentGravityY() {
        return segment.get(LAYOUT$presentGravityY, OFFSET$presentGravityY);
    }

    public void presentGravityY(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$presentGravityY, OFFSET$presentGravityY, value);
    }

}
/// dummy, not implemented yet

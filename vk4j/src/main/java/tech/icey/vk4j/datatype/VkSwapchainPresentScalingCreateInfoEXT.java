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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSwapchainPresentScalingCreateInfoEXT.html">VkSwapchainPresentScalingCreateInfoEXT</a>
public record VkSwapchainPresentScalingCreateInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("scalingBehavior"),
        ValueLayout.JAVA_INT.withName("presentGravityX"),
        ValueLayout.JAVA_INT.withName("presentGravityY")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$scalingBehavior = PathElement.groupElement("scalingBehavior");
    public static final PathElement PATH$presentGravityX = PathElement.groupElement("presentGravityX");
    public static final PathElement PATH$presentGravityY = PathElement.groupElement("presentGravityY");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$scalingBehavior = (OfInt) LAYOUT.select(PATH$scalingBehavior);
    public static final OfInt LAYOUT$presentGravityX = (OfInt) LAYOUT.select(PATH$presentGravityX);
    public static final OfInt LAYOUT$presentGravityY = (OfInt) LAYOUT.select(PATH$presentGravityY);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$scalingBehavior = LAYOUT.byteOffset(PATH$scalingBehavior);
    public static final long OFFSET$presentGravityX = LAYOUT.byteOffset(PATH$presentGravityX);
    public static final long OFFSET$presentGravityY = LAYOUT.byteOffset(PATH$presentGravityY);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$scalingBehavior = LAYOUT$scalingBehavior.byteSize();
    public static final long SIZE$presentGravityX = LAYOUT$presentGravityX.byteSize();
    public static final long SIZE$presentGravityY = LAYOUT$presentGravityY.byteSize();

    public VkSwapchainPresentScalingCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT);
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

    public static VkSwapchainPresentScalingCreateInfoEXT allocate(Arena arena) {
        return new VkSwapchainPresentScalingCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkSwapchainPresentScalingCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainPresentScalingCreateInfoEXT[] ret = new VkSwapchainPresentScalingCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSwapchainPresentScalingCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

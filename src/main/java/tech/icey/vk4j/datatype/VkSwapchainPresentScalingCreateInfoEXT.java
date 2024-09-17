package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSwapchainPresentScalingCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("scalingBehavior"),
        ValueLayout.JAVA_INT.withName("presentGravityX"),
        ValueLayout.JAVA_INT.withName("presentGravityY")
    );

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


    public static final class VkSwapchainPresentScalingCreateInfoEXTFactory implements IFactory<VkSwapchainPresentScalingCreateInfoEXT> {
        @Override
        public Class<VkSwapchainPresentScalingCreateInfoEXT> clazz() {
            return VkSwapchainPresentScalingCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSwapchainPresentScalingCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkSwapchainPresentScalingCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSwapchainPresentScalingCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkSwapchainPresentScalingCreateInfoEXT(segment);
        }
    }

    public static final VkSwapchainPresentScalingCreateInfoEXTFactory FACTORY = new VkSwapchainPresentScalingCreateInfoEXTFactory();
}

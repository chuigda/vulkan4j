package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSwapchainPresentBarrierCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentBarrierEnable")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$presentBarrierEnable = PathElement.groupElement("presentBarrierEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$presentBarrierEnable = (OfInt) LAYOUT.select(PATH$presentBarrierEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentBarrierEnable = LAYOUT.byteOffset(PATH$presentBarrierEnable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$presentBarrierEnable = LAYOUT$presentBarrierEnable.byteSize();

    public VkSwapchainPresentBarrierCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV);
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

    public @unsigned int presentBarrierEnable() {
        return segment.get(LAYOUT$presentBarrierEnable, OFFSET$presentBarrierEnable);
    }

    public void presentBarrierEnable(@unsigned int value) {
        segment.set(LAYOUT$presentBarrierEnable, OFFSET$presentBarrierEnable, value);
    }

    public static VkSwapchainPresentBarrierCreateInfoNV allocate(Arena arena) {
        return new VkSwapchainPresentBarrierCreateInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkSwapchainPresentBarrierCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainPresentBarrierCreateInfoNV[] ret = new VkSwapchainPresentBarrierCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSwapchainPresentBarrierCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

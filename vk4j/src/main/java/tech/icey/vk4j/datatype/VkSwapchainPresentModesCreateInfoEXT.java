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

public record VkSwapchainPresentModesCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentModeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pPresentModes")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$presentModeCount = PathElement.groupElement("presentModeCount");
    public static final PathElement PATH$pPresentModes = PathElement.groupElement("pPresentModes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$presentModeCount = (OfInt) LAYOUT.select(PATH$presentModeCount);
    public static final AddressLayout LAYOUT$pPresentModes = (AddressLayout) LAYOUT.select(PATH$pPresentModes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentModeCount = LAYOUT.byteOffset(PATH$presentModeCount);
    public static final long OFFSET$pPresentModes = LAYOUT.byteOffset(PATH$pPresentModes);

    public VkSwapchainPresentModesCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT);
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

    public @unsigned int presentModeCount() {
        return segment.get(LAYOUT$presentModeCount, OFFSET$presentModeCount);
    }

    public void presentModeCount(@unsigned int value) {
        segment.set(LAYOUT$presentModeCount, OFFSET$presentModeCount, value);
    }

    public @pointer(target=VkPresentModeKHR.class) MemorySegment pPresentModesRaw() {
        return segment.get(LAYOUT$pPresentModes, OFFSET$pPresentModes);
    }
    
    public void pPresentModesRaw(@pointer(target=VkPresentModeKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pPresentModes, OFFSET$pPresentModes, value);
    }
    
    public @nullable IntBuffer pPresentModes() {
        MemorySegment s = pPresentModesRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }
    
    public void pPresentModes(@nullable IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPresentModesRaw(s);
    }

    public static VkSwapchainPresentModesCreateInfoEXT allocate(Arena arena) {
        return new VkSwapchainPresentModesCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkSwapchainPresentModesCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainPresentModesCreateInfoEXT[] ret = new VkSwapchainPresentModesCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSwapchainPresentModesCreateInfoEXT(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

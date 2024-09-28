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

/// {@snippet lang=c :
/// typedef struct VkSwapchainDisplayNativeHdrCreateInfoAMD {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 localDimmingEnable;
/// } VkSwapchainDisplayNativeHdrCreateInfoAMD;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSwapchainDisplayNativeHdrCreateInfoAMD.html">VkSwapchainDisplayNativeHdrCreateInfoAMD</a>
public record VkSwapchainDisplayNativeHdrCreateInfoAMD(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("localDimmingEnable")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$localDimmingEnable = PathElement.groupElement("localDimmingEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$localDimmingEnable = (OfInt) LAYOUT.select(PATH$localDimmingEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$localDimmingEnable = LAYOUT.byteOffset(PATH$localDimmingEnable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$localDimmingEnable = LAYOUT$localDimmingEnable.byteSize();

    public VkSwapchainDisplayNativeHdrCreateInfoAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD);
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

    public @unsigned int localDimmingEnable() {
        return segment.get(LAYOUT$localDimmingEnable, OFFSET$localDimmingEnable);
    }

    public void localDimmingEnable(@unsigned int value) {
        segment.set(LAYOUT$localDimmingEnable, OFFSET$localDimmingEnable, value);
    }

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD allocate(Arena arena) {
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(arena.allocate(LAYOUT));
    }
    
    public static VkSwapchainDisplayNativeHdrCreateInfoAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainDisplayNativeHdrCreateInfoAMD[] ret = new VkSwapchainDisplayNativeHdrCreateInfoAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSwapchainDisplayNativeHdrCreateInfoAMD(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkSwapchainLatencyCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 latencyModeEnable;
/// } VkSwapchainLatencyCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSwapchainLatencyCreateInfoNV.html">VkSwapchainLatencyCreateInfoNV</a>
public record VkSwapchainLatencyCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkSwapchainLatencyCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int latencyModeEnable() {
        return segment.get(LAYOUT$latencyModeEnable, OFFSET$latencyModeEnable);
    }

    public void latencyModeEnable(@unsigned int value) {
        segment.set(LAYOUT$latencyModeEnable, OFFSET$latencyModeEnable, value);
    }

    public static VkSwapchainLatencyCreateInfoNV allocate(Arena arena) {
        return new VkSwapchainLatencyCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkSwapchainLatencyCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainLatencyCreateInfoNV[] ret = new VkSwapchainLatencyCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSwapchainLatencyCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSwapchainLatencyCreateInfoNV clone(Arena arena, VkSwapchainLatencyCreateInfoNV src) {
        VkSwapchainLatencyCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSwapchainLatencyCreateInfoNV[] clone(Arena arena, VkSwapchainLatencyCreateInfoNV[] src) {
        VkSwapchainLatencyCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("latencyModeEnable")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$latencyModeEnable = PathElement.groupElement("latencyModeEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$latencyModeEnable = (OfInt) LAYOUT.select(PATH$latencyModeEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$latencyModeEnable = LAYOUT.byteOffset(PATH$latencyModeEnable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$latencyModeEnable = LAYOUT$latencyModeEnable.byteSize();
}

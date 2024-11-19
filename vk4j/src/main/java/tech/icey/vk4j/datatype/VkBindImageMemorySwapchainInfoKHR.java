package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
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
/// typedef struct VkBindImageMemorySwapchainInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSwapchainKHR swapchain;
///     uint32_t imageIndex;
/// } VkBindImageMemorySwapchainInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBindImageMemorySwapchainInfoKHR.html">VkBindImageMemorySwapchainInfoKHR</a>
public record VkBindImageMemorySwapchainInfoKHR(MemorySegment segment) implements IPointer {
    public VkBindImageMemorySwapchainInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkSwapchainKHR swapchain() {
        MemorySegment s = segment.get(LAYOUT$swapchain, OFFSET$swapchain);
        if (s.address() == 0) {
            return null;
        }
        return new VkSwapchainKHR(s);
    }

    public void swapchain(@Nullable VkSwapchainKHR value) {
        segment.set(
            LAYOUT$swapchain,
            OFFSET$swapchain,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int imageIndex() {
        return segment.get(LAYOUT$imageIndex, OFFSET$imageIndex);
    }

    public void imageIndex(@unsigned int value) {
        segment.set(LAYOUT$imageIndex, OFFSET$imageIndex, value);
    }

    public static VkBindImageMemorySwapchainInfoKHR allocate(Arena arena) {
        return new VkBindImageMemorySwapchainInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkBindImageMemorySwapchainInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindImageMemorySwapchainInfoKHR[] ret = new VkBindImageMemorySwapchainInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindImageMemorySwapchainInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindImageMemorySwapchainInfoKHR clone(Arena arena, VkBindImageMemorySwapchainInfoKHR src) {
        VkBindImageMemorySwapchainInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindImageMemorySwapchainInfoKHR[] clone(Arena arena, VkBindImageMemorySwapchainInfoKHR[] src) {
        VkBindImageMemorySwapchainInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchain = PathElement.groupElement("swapchain");
    public static final PathElement PATH$imageIndex = PathElement.groupElement("imageIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);
    public static final OfInt LAYOUT$imageIndex = (OfInt) LAYOUT.select(PATH$imageIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);
    public static final long OFFSET$imageIndex = LAYOUT.byteOffset(PATH$imageIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchain = LAYOUT$swapchain.byteSize();
    public static final long SIZE$imageIndex = LAYOUT$imageIndex.byteSize();
}

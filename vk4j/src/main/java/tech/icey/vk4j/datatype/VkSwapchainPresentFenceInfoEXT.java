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
/// typedef struct VkSwapchainPresentFenceInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkFence* pFences;
/// } VkSwapchainPresentFenceInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSwapchainPresentFenceInfoEXT.html">VkSwapchainPresentFenceInfoEXT</a>
public record VkSwapchainPresentFenceInfoEXT(MemorySegment segment) implements IPointer {
    public VkSwapchainPresentFenceInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT);
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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="VkFence") MemorySegment pFencesRaw() {
        return segment.get(LAYOUT$pFences, OFFSET$pFences);
    }

    public void pFencesRaw(@pointer(comment="VkFence") MemorySegment value) {
        segment.set(LAYOUT$pFences, OFFSET$pFences, value);
    }

    /// Note: the returned {@link VkFence.Buffer} does not have correct
    /// {@link VkFence.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkFence.Buffer#reinterpret} to set the size before actually
    /// {@link VkFence.Buffer#read}ing or {@link VkFence.Buffer#write}ing
    /// the buffer.
    public @nullable VkFence.Buffer pFences() {
        MemorySegment s = pFencesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkFence.Buffer(s);
    }

    public void pFences(@nullable VkFence.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFencesRaw(s);
    }

    public static VkSwapchainPresentFenceInfoEXT allocate(Arena arena) {
        return new VkSwapchainPresentFenceInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkSwapchainPresentFenceInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainPresentFenceInfoEXT[] ret = new VkSwapchainPresentFenceInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSwapchainPresentFenceInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pFences")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("swapchainCount");
    public static final PathElement PATH$pFences = PathElement.groupElement("pFences");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pFences = (AddressLayout) LAYOUT.select(PATH$pFences);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pFences = LAYOUT.byteOffset(PATH$pFences);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pFences = LAYOUT$pFences.byteSize();
}

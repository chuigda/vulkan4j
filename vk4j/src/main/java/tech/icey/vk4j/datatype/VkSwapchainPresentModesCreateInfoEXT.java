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
/// typedef struct VkSwapchainPresentModesCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t presentModeCount;
///     const VkPresentModeKHR* pPresentModes;
/// } VkSwapchainPresentModesCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSwapchainPresentModesCreateInfoEXT.html">VkSwapchainPresentModesCreateInfoEXT</a>
public record VkSwapchainPresentModesCreateInfoEXT(MemorySegment segment) implements IPointer {
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @Nullable @enumtype(VkPresentModeKHR.class) IntBuffer pPresentModes() {
        MemorySegment s = pPresentModesRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntBuffer(s);
    }

    public void pPresentModes(@Nullable @enumtype(VkPresentModeKHR.class) IntBuffer value) {
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
            ret[i] = new VkSwapchainPresentModesCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSwapchainPresentModesCreateInfoEXT clone(Arena arena, VkSwapchainPresentModesCreateInfoEXT src) {
        VkSwapchainPresentModesCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSwapchainPresentModesCreateInfoEXT[] clone(Arena arena, VkSwapchainPresentModesCreateInfoEXT[] src) {
        VkSwapchainPresentModesCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentModeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pPresentModes")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$presentModeCount = LAYOUT$presentModeCount.byteSize();
    public static final long SIZE$pPresentModes = LAYOUT$pPresentModes.byteSize();
}

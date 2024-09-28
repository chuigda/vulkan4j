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
/// typedef struct VkPhysicalDeviceInheritedViewportScissorFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 inheritedViewportScissor2D;
/// } VkPhysicalDeviceInheritedViewportScissorFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceInheritedViewportScissorFeaturesNV.html">VkPhysicalDeviceInheritedViewportScissorFeaturesNV</a>
public record VkPhysicalDeviceInheritedViewportScissorFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV);
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

    public @unsigned int inheritedViewportScissor2D() {
        return segment.get(LAYOUT$inheritedViewportScissor2D, OFFSET$inheritedViewportScissor2D);
    }

    public void inheritedViewportScissor2D(@unsigned int value) {
        segment.set(LAYOUT$inheritedViewportScissor2D, OFFSET$inheritedViewportScissor2D, value);
    }

    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceInheritedViewportScissorFeaturesNV[] ret = new VkPhysicalDeviceInheritedViewportScissorFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("inheritedViewportScissor2D")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$inheritedViewportScissor2D = PathElement.groupElement("inheritedViewportScissor2D");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$inheritedViewportScissor2D = (OfInt) LAYOUT.select(PATH$inheritedViewportScissor2D);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$inheritedViewportScissor2D = LAYOUT.byteOffset(PATH$inheritedViewportScissor2D);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$inheritedViewportScissor2D = LAYOUT$inheritedViewportScissor2D.byteSize();
}

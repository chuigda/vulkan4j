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
/// typedef struct VkPhysicalDeviceRenderPassStripedFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 renderPassStriped;
/// } VkPhysicalDeviceRenderPassStripedFeaturesARM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceRenderPassStripedFeaturesARM.html">VkPhysicalDeviceRenderPassStripedFeaturesARM</a>
public record VkPhysicalDeviceRenderPassStripedFeaturesARM(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("renderPassStriped")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$renderPassStriped = PathElement.groupElement("renderPassStriped");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$renderPassStriped = (OfInt) LAYOUT.select(PATH$renderPassStriped);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPassStriped = LAYOUT.byteOffset(PATH$renderPassStriped);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$renderPassStriped = LAYOUT$renderPassStriped.byteSize();

    public VkPhysicalDeviceRenderPassStripedFeaturesARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM);
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

    public @unsigned int renderPassStriped() {
        return segment.get(LAYOUT$renderPassStriped, OFFSET$renderPassStriped);
    }

    public void renderPassStriped(@unsigned int value) {
        segment.set(LAYOUT$renderPassStriped, OFFSET$renderPassStriped, value);
    }

    public static VkPhysicalDeviceRenderPassStripedFeaturesARM allocate(Arena arena) {
        return new VkPhysicalDeviceRenderPassStripedFeaturesARM(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRenderPassStripedFeaturesARM[] ret = new VkPhysicalDeviceRenderPassStripedFeaturesARM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

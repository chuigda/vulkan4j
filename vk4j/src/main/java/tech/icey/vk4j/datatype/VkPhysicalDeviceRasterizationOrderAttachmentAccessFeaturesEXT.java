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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.html">VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT</a>
public record VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderColorAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderDepthAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderStencilAttachmentAccess")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rasterizationOrderColorAttachmentAccess = PathElement.groupElement("rasterizationOrderColorAttachmentAccess");
    public static final PathElement PATH$rasterizationOrderDepthAttachmentAccess = PathElement.groupElement("rasterizationOrderDepthAttachmentAccess");
    public static final PathElement PATH$rasterizationOrderStencilAttachmentAccess = PathElement.groupElement("rasterizationOrderStencilAttachmentAccess");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rasterizationOrderColorAttachmentAccess = (OfInt) LAYOUT.select(PATH$rasterizationOrderColorAttachmentAccess);
    public static final OfInt LAYOUT$rasterizationOrderDepthAttachmentAccess = (OfInt) LAYOUT.select(PATH$rasterizationOrderDepthAttachmentAccess);
    public static final OfInt LAYOUT$rasterizationOrderStencilAttachmentAccess = (OfInt) LAYOUT.select(PATH$rasterizationOrderStencilAttachmentAccess);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rasterizationOrderColorAttachmentAccess = LAYOUT.byteOffset(PATH$rasterizationOrderColorAttachmentAccess);
    public static final long OFFSET$rasterizationOrderDepthAttachmentAccess = LAYOUT.byteOffset(PATH$rasterizationOrderDepthAttachmentAccess);
    public static final long OFFSET$rasterizationOrderStencilAttachmentAccess = LAYOUT.byteOffset(PATH$rasterizationOrderStencilAttachmentAccess);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rasterizationOrderColorAttachmentAccess = LAYOUT$rasterizationOrderColorAttachmentAccess.byteSize();
    public static final long SIZE$rasterizationOrderDepthAttachmentAccess = LAYOUT$rasterizationOrderDepthAttachmentAccess.byteSize();
    public static final long SIZE$rasterizationOrderStencilAttachmentAccess = LAYOUT$rasterizationOrderStencilAttachmentAccess.byteSize();

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT);
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

    public @unsigned int rasterizationOrderColorAttachmentAccess() {
        return segment.get(LAYOUT$rasterizationOrderColorAttachmentAccess, OFFSET$rasterizationOrderColorAttachmentAccess);
    }

    public void rasterizationOrderColorAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$rasterizationOrderColorAttachmentAccess, OFFSET$rasterizationOrderColorAttachmentAccess, value);
    }

    public @unsigned int rasterizationOrderDepthAttachmentAccess() {
        return segment.get(LAYOUT$rasterizationOrderDepthAttachmentAccess, OFFSET$rasterizationOrderDepthAttachmentAccess);
    }

    public void rasterizationOrderDepthAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$rasterizationOrderDepthAttachmentAccess, OFFSET$rasterizationOrderDepthAttachmentAccess, value);
    }

    public @unsigned int rasterizationOrderStencilAttachmentAccess() {
        return segment.get(LAYOUT$rasterizationOrderStencilAttachmentAccess, OFFSET$rasterizationOrderStencilAttachmentAccess);
    }

    public void rasterizationOrderStencilAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$rasterizationOrderStencilAttachmentAccess, OFFSET$rasterizationOrderStencilAttachmentAccess, value);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT[] ret = new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderColorAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderDepthAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderStencilAttachmentAccess")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$rasterizationOrderColorAttachmentAccess = PathElement.groupElement(2);
    public static final PathElement PATH$rasterizationOrderDepthAttachmentAccess = PathElement.groupElement(3);
    public static final PathElement PATH$rasterizationOrderStencilAttachmentAccess = PathElement.groupElement(4);

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


    public static final class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> clazz() {
            return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXTFactory FACTORY = new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXTFactory();
}
package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageSlicedViewOf3D")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageSlicedViewOf3D = PathElement.groupElement("imageSlicedViewOf3D");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$imageSlicedViewOf3D = (OfInt) LAYOUT.select(PATH$imageSlicedViewOf3D);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageSlicedViewOf3D = LAYOUT.byteOffset(PATH$imageSlicedViewOf3D);

    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT);
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

    public @unsigned int imageSlicedViewOf3D() {
        return segment.get(LAYOUT$imageSlicedViewOf3D, OFFSET$imageSlicedViewOf3D);
    }

    public void imageSlicedViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$imageSlicedViewOf3D, OFFSET$imageSlicedViewOf3D, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> clazz() {
            return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

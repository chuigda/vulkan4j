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

public record VkPhysicalDeviceFrameBoundaryFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("frameBoundary")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$frameBoundary = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$frameBoundary = (OfInt) LAYOUT.select(PATH$frameBoundary);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$frameBoundary = LAYOUT.byteOffset(PATH$frameBoundary);

    public VkPhysicalDeviceFrameBoundaryFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT);
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

    public @unsigned int frameBoundary() {
        return segment.get(LAYOUT$frameBoundary, OFFSET$frameBoundary);
    }

    public void frameBoundary(@unsigned int value) {
        segment.set(LAYOUT$frameBoundary, OFFSET$frameBoundary, value);
    }


    public static final class VkPhysicalDeviceFrameBoundaryFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceFrameBoundaryFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceFrameBoundaryFeaturesEXT> clazz() {
            return VkPhysicalDeviceFrameBoundaryFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFrameBoundaryFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFrameBoundaryFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceFrameBoundaryFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceFrameBoundaryFeaturesEXTFactory FACTORY = new VkPhysicalDeviceFrameBoundaryFeaturesEXTFactory();
}
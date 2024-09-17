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

public record VkPhysicalDeviceMultiviewFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiview"),
        ValueLayout.JAVA_INT.withName("multiviewGeometryShader"),
        ValueLayout.JAVA_INT.withName("multiviewTessellationShader")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$multiview = PathElement.groupElement("multiview");
    public static final PathElement PATH$multiviewGeometryShader = PathElement.groupElement("multiviewGeometryShader");
    public static final PathElement PATH$multiviewTessellationShader = PathElement.groupElement("multiviewTessellationShader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$multiview = (OfInt) LAYOUT.select(PATH$multiview);
    public static final OfInt LAYOUT$multiviewGeometryShader = (OfInt) LAYOUT.select(PATH$multiviewGeometryShader);
    public static final OfInt LAYOUT$multiviewTessellationShader = (OfInt) LAYOUT.select(PATH$multiviewTessellationShader);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$multiview = LAYOUT.byteOffset(PATH$multiview);
    public static final long OFFSET$multiviewGeometryShader = LAYOUT.byteOffset(PATH$multiviewGeometryShader);
    public static final long OFFSET$multiviewTessellationShader = LAYOUT.byteOffset(PATH$multiviewTessellationShader);

    public VkPhysicalDeviceMultiviewFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES);
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

    public @unsigned int multiview() {
        return segment.get(LAYOUT$multiview, OFFSET$multiview);
    }

    public void multiview(@unsigned int value) {
        segment.set(LAYOUT$multiview, OFFSET$multiview, value);
    }

    public @unsigned int multiviewGeometryShader() {
        return segment.get(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader);
    }

    public void multiviewGeometryShader(@unsigned int value) {
        segment.set(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader, value);
    }

    public @unsigned int multiviewTessellationShader() {
        return segment.get(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader);
    }

    public void multiviewTessellationShader(@unsigned int value) {
        segment.set(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader, value);
    }


    public static final class VkPhysicalDeviceMultiviewFeaturesFactory implements IDataTypeFactory<VkPhysicalDeviceMultiviewFeatures> {
        @Override
        public Class<VkPhysicalDeviceMultiviewFeatures> clazz() {
            return VkPhysicalDeviceMultiviewFeatures.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMultiviewFeatures.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMultiviewFeatures create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceMultiviewFeatures createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMultiviewFeatures(segment);
        }
    }

    public static final VkPhysicalDeviceMultiviewFeaturesFactory FACTORY = new VkPhysicalDeviceMultiviewFeaturesFactory();
}

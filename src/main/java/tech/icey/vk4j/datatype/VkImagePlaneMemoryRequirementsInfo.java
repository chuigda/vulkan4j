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

public record VkImagePlaneMemoryRequirementsInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("planeAspect")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$planeAspect = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$planeAspect = (OfInt) LAYOUT.select(PATH$planeAspect);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$planeAspect = LAYOUT.byteOffset(PATH$planeAspect);

    public VkImagePlaneMemoryRequirementsInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO);
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

    public @enumtype(VkImageAspectFlags.class) int planeAspect() {
        return segment.get(LAYOUT$planeAspect, OFFSET$planeAspect);
    }

    public void planeAspect(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$planeAspect, OFFSET$planeAspect, value);
    }


    public static final class VkImagePlaneMemoryRequirementsInfoFactory implements IDataTypeFactory<VkImagePlaneMemoryRequirementsInfo> {
        @Override
        public Class<VkImagePlaneMemoryRequirementsInfo> clazz() {
            return VkImagePlaneMemoryRequirementsInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImagePlaneMemoryRequirementsInfo.LAYOUT;
        }

        @Override
        public VkImagePlaneMemoryRequirementsInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImagePlaneMemoryRequirementsInfo createUninit(MemorySegment segment) {
            return new VkImagePlaneMemoryRequirementsInfo(segment);
        }
    }

    public static final VkImagePlaneMemoryRequirementsInfoFactory FACTORY = new VkImagePlaneMemoryRequirementsInfoFactory();
}

package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiviewPerViewRenderAreas")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$multiviewPerViewRenderAreas = PathElement.groupElement("multiviewPerViewRenderAreas");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$multiviewPerViewRenderAreas = (OfInt) LAYOUT.select(PATH$multiviewPerViewRenderAreas);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$multiviewPerViewRenderAreas = LAYOUT.byteOffset(PATH$multiviewPerViewRenderAreas);

    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM);
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

    public @unsigned int multiviewPerViewRenderAreas() {
        return segment.get(LAYOUT$multiviewPerViewRenderAreas, OFFSET$multiviewPerViewRenderAreas);
    }

    public void multiviewPerViewRenderAreas(@unsigned int value) {
        segment.set(LAYOUT$multiviewPerViewRenderAreas, OFFSET$multiviewPerViewRenderAreas, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM> {
        @Override
        public Class<VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM> clazz() {
            return VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

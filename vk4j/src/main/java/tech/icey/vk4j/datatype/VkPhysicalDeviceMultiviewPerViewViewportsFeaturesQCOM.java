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
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiviewPerViewViewports")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$multiviewPerViewViewports = PathElement.groupElement("multiviewPerViewViewports");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$multiviewPerViewViewports = (OfInt) LAYOUT.select(PATH$multiviewPerViewViewports);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$multiviewPerViewViewports = LAYOUT.byteOffset(PATH$multiviewPerViewViewports);

    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM);
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

    public @unsigned int multiviewPerViewViewports() {
        return segment.get(LAYOUT$multiviewPerViewViewports, OFFSET$multiviewPerViewViewports);
    }

    public void multiviewPerViewViewports(@unsigned int value) {
        segment.set(LAYOUT$multiviewPerViewViewports, OFFSET$multiviewPerViewViewports, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> {
        @Override
        public Class<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> clazz() {
            return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("customBorderColors"),
        ValueLayout.JAVA_INT.withName("customBorderColorWithoutFormat")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$customBorderColors = PathElement.groupElement("customBorderColors");
    public static final PathElement PATH$customBorderColorWithoutFormat = PathElement.groupElement("customBorderColorWithoutFormat");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$customBorderColors = (OfInt) LAYOUT.select(PATH$customBorderColors);
    public static final OfInt LAYOUT$customBorderColorWithoutFormat = (OfInt) LAYOUT.select(PATH$customBorderColorWithoutFormat);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$customBorderColors = LAYOUT.byteOffset(PATH$customBorderColors);
    public static final long OFFSET$customBorderColorWithoutFormat = LAYOUT.byteOffset(PATH$customBorderColorWithoutFormat);

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT);
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

    public @unsigned int customBorderColors() {
        return segment.get(LAYOUT$customBorderColors, OFFSET$customBorderColors);
    }

    public void customBorderColors(@unsigned int value) {
        segment.set(LAYOUT$customBorderColors, OFFSET$customBorderColors, value);
    }

    public @unsigned int customBorderColorWithoutFormat() {
        return segment.get(LAYOUT$customBorderColorWithoutFormat, OFFSET$customBorderColorWithoutFormat);
    }

    public void customBorderColorWithoutFormat(@unsigned int value) {
        segment.set(LAYOUT$customBorderColorWithoutFormat, OFFSET$customBorderColorWithoutFormat, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceCustomBorderColorFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceCustomBorderColorFeaturesEXT> clazz() {
            return VkPhysicalDeviceCustomBorderColorFeaturesEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceCustomBorderColorFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

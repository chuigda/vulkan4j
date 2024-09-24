package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDevice4444FormatsFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatA4R4G4B4"),
        ValueLayout.JAVA_INT.withName("formatA4B4G4R4")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$formatA4R4G4B4 = PathElement.groupElement("formatA4R4G4B4");
    public static final PathElement PATH$formatA4B4G4R4 = PathElement.groupElement("formatA4B4G4R4");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$formatA4R4G4B4 = (OfInt) LAYOUT.select(PATH$formatA4R4G4B4);
    public static final OfInt LAYOUT$formatA4B4G4R4 = (OfInt) LAYOUT.select(PATH$formatA4B4G4R4);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$formatA4R4G4B4 = LAYOUT.byteOffset(PATH$formatA4R4G4B4);
    public static final long OFFSET$formatA4B4G4R4 = LAYOUT.byteOffset(PATH$formatA4B4G4R4);

    public VkPhysicalDevice4444FormatsFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT);
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

    public @unsigned int formatA4R4G4B4() {
        return segment.get(LAYOUT$formatA4R4G4B4, OFFSET$formatA4R4G4B4);
    }

    public void formatA4R4G4B4(@unsigned int value) {
        segment.set(LAYOUT$formatA4R4G4B4, OFFSET$formatA4R4G4B4, value);
    }

    public @unsigned int formatA4B4G4R4() {
        return segment.get(LAYOUT$formatA4B4G4R4, OFFSET$formatA4B4G4R4);
    }

    public void formatA4B4G4R4(@unsigned int value) {
        segment.set(LAYOUT$formatA4B4G4R4, OFFSET$formatA4B4G4R4, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDevice4444FormatsFeaturesEXT> {
        @Override
        public Class<VkPhysicalDevice4444FormatsFeaturesEXT> clazz() {
            return VkPhysicalDevice4444FormatsFeaturesEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDevice4444FormatsFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDevice4444FormatsFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDevice4444FormatsFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDevice4444FormatsFeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

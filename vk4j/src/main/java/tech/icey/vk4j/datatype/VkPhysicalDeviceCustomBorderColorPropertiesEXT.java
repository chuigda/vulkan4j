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

public record VkPhysicalDeviceCustomBorderColorPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxCustomBorderColorSamplers")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxCustomBorderColorSamplers = PathElement.groupElement("maxCustomBorderColorSamplers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxCustomBorderColorSamplers = (OfInt) LAYOUT.select(PATH$maxCustomBorderColorSamplers);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxCustomBorderColorSamplers = LAYOUT.byteOffset(PATH$maxCustomBorderColorSamplers);

    public VkPhysicalDeviceCustomBorderColorPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT);
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

    public @unsigned int maxCustomBorderColorSamplers() {
        return segment.get(LAYOUT$maxCustomBorderColorSamplers, OFFSET$maxCustomBorderColorSamplers);
    }

    public void maxCustomBorderColorSamplers(@unsigned int value) {
        segment.set(LAYOUT$maxCustomBorderColorSamplers, OFFSET$maxCustomBorderColorSamplers, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceCustomBorderColorPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceCustomBorderColorPropertiesEXT> clazz() {
            return VkPhysicalDeviceCustomBorderColorPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceCustomBorderColorPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceCustomBorderColorPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceCustomBorderColorPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

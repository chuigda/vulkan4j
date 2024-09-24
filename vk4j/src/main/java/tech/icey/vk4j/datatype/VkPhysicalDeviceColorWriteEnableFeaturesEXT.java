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

public record VkPhysicalDeviceColorWriteEnableFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorWriteEnable")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$colorWriteEnable = PathElement.groupElement("colorWriteEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorWriteEnable = (OfInt) LAYOUT.select(PATH$colorWriteEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorWriteEnable = LAYOUT.byteOffset(PATH$colorWriteEnable);

    public VkPhysicalDeviceColorWriteEnableFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT);
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

    public @unsigned int colorWriteEnable() {
        return segment.get(LAYOUT$colorWriteEnable, OFFSET$colorWriteEnable);
    }

    public void colorWriteEnable(@unsigned int value) {
        segment.set(LAYOUT$colorWriteEnable, OFFSET$colorWriteEnable, value);
    }


    public static final class VkPhysicalDeviceColorWriteEnableFeaturesEXTFactory implements IFactory<VkPhysicalDeviceColorWriteEnableFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceColorWriteEnableFeaturesEXT> clazz() {
            return VkPhysicalDeviceColorWriteEnableFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceColorWriteEnableFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceColorWriteEnableFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceColorWriteEnableFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceColorWriteEnableFeaturesEXTFactory FACTORY = new VkPhysicalDeviceColorWriteEnableFeaturesEXTFactory();
}

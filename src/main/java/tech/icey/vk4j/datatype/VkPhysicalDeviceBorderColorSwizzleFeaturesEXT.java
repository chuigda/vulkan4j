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

public record VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzle"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzleFromImage")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$borderColorSwizzle = PathElement.groupElement("borderColorSwizzle");
    public static final PathElement PATH$borderColorSwizzleFromImage = PathElement.groupElement("borderColorSwizzleFromImage");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$borderColorSwizzle = (OfInt) LAYOUT.select(PATH$borderColorSwizzle);
    public static final OfInt LAYOUT$borderColorSwizzleFromImage = (OfInt) LAYOUT.select(PATH$borderColorSwizzleFromImage);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$borderColorSwizzle = LAYOUT.byteOffset(PATH$borderColorSwizzle);
    public static final long OFFSET$borderColorSwizzleFromImage = LAYOUT.byteOffset(PATH$borderColorSwizzleFromImage);

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT);
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

    public @unsigned int borderColorSwizzle() {
        return segment.get(LAYOUT$borderColorSwizzle, OFFSET$borderColorSwizzle);
    }

    public void borderColorSwizzle(@unsigned int value) {
        segment.set(LAYOUT$borderColorSwizzle, OFFSET$borderColorSwizzle, value);
    }

    public @unsigned int borderColorSwizzleFromImage() {
        return segment.get(LAYOUT$borderColorSwizzleFromImage, OFFSET$borderColorSwizzleFromImage);
    }

    public void borderColorSwizzleFromImage(@unsigned int value) {
        segment.set(LAYOUT$borderColorSwizzleFromImage, OFFSET$borderColorSwizzleFromImage, value);
    }


    public static final class VkPhysicalDeviceBorderColorSwizzleFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceBorderColorSwizzleFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceBorderColorSwizzleFeaturesEXT> clazz() {
            return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceBorderColorSwizzleFeaturesEXTFactory FACTORY = new VkPhysicalDeviceBorderColorSwizzleFeaturesEXTFactory();
}

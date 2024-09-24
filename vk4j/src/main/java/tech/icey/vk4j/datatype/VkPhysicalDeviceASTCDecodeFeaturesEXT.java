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

public record VkPhysicalDeviceASTCDecodeFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("decodeModeSharedExponent")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$decodeModeSharedExponent = PathElement.groupElement("decodeModeSharedExponent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$decodeModeSharedExponent = (OfInt) LAYOUT.select(PATH$decodeModeSharedExponent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$decodeModeSharedExponent = LAYOUT.byteOffset(PATH$decodeModeSharedExponent);

    public VkPhysicalDeviceASTCDecodeFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT);
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

    public @unsigned int decodeModeSharedExponent() {
        return segment.get(LAYOUT$decodeModeSharedExponent, OFFSET$decodeModeSharedExponent);
    }

    public void decodeModeSharedExponent(@unsigned int value) {
        segment.set(LAYOUT$decodeModeSharedExponent, OFFSET$decodeModeSharedExponent, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceASTCDecodeFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceASTCDecodeFeaturesEXT> clazz() {
            return VkPhysicalDeviceASTCDecodeFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceASTCDecodeFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceASTCDecodeFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceASTCDecodeFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

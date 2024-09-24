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

public record VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2LogicOp"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2PatchControlPoints")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$extendedDynamicState2 = PathElement.groupElement("extendedDynamicState2");
    public static final PathElement PATH$extendedDynamicState2LogicOp = PathElement.groupElement("extendedDynamicState2LogicOp");
    public static final PathElement PATH$extendedDynamicState2PatchControlPoints = PathElement.groupElement("extendedDynamicState2PatchControlPoints");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$extendedDynamicState2 = (OfInt) LAYOUT.select(PATH$extendedDynamicState2);
    public static final OfInt LAYOUT$extendedDynamicState2LogicOp = (OfInt) LAYOUT.select(PATH$extendedDynamicState2LogicOp);
    public static final OfInt LAYOUT$extendedDynamicState2PatchControlPoints = (OfInt) LAYOUT.select(PATH$extendedDynamicState2PatchControlPoints);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$extendedDynamicState2 = LAYOUT.byteOffset(PATH$extendedDynamicState2);
    public static final long OFFSET$extendedDynamicState2LogicOp = LAYOUT.byteOffset(PATH$extendedDynamicState2LogicOp);
    public static final long OFFSET$extendedDynamicState2PatchControlPoints = LAYOUT.byteOffset(PATH$extendedDynamicState2PatchControlPoints);

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT);
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

    public @unsigned int extendedDynamicState2() {
        return segment.get(LAYOUT$extendedDynamicState2, OFFSET$extendedDynamicState2);
    }

    public void extendedDynamicState2(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState2, OFFSET$extendedDynamicState2, value);
    }

    public @unsigned int extendedDynamicState2LogicOp() {
        return segment.get(LAYOUT$extendedDynamicState2LogicOp, OFFSET$extendedDynamicState2LogicOp);
    }

    public void extendedDynamicState2LogicOp(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState2LogicOp, OFFSET$extendedDynamicState2LogicOp, value);
    }

    public @unsigned int extendedDynamicState2PatchControlPoints() {
        return segment.get(LAYOUT$extendedDynamicState2PatchControlPoints, OFFSET$extendedDynamicState2PatchControlPoints);
    }

    public void extendedDynamicState2PatchControlPoints(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState2PatchControlPoints, OFFSET$extendedDynamicState2PatchControlPoints, value);
    }


    public static final class VkPhysicalDeviceExtendedDynamicState2FeaturesEXTFactory implements IFactory<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> clazz() {
            return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceExtendedDynamicState2FeaturesEXTFactory FACTORY = new VkPhysicalDeviceExtendedDynamicState2FeaturesEXTFactory();
}

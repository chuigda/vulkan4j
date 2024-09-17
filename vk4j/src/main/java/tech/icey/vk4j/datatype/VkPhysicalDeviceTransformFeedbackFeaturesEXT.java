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

public record VkPhysicalDeviceTransformFeedbackFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transformFeedback"),
        ValueLayout.JAVA_INT.withName("geometryStreams")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$transformFeedback = PathElement.groupElement("transformFeedback");
    public static final PathElement PATH$geometryStreams = PathElement.groupElement("geometryStreams");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$transformFeedback = (OfInt) LAYOUT.select(PATH$transformFeedback);
    public static final OfInt LAYOUT$geometryStreams = (OfInt) LAYOUT.select(PATH$geometryStreams);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$transformFeedback = LAYOUT.byteOffset(PATH$transformFeedback);
    public static final long OFFSET$geometryStreams = LAYOUT.byteOffset(PATH$geometryStreams);

    public VkPhysicalDeviceTransformFeedbackFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT);
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

    public @unsigned int transformFeedback() {
        return segment.get(LAYOUT$transformFeedback, OFFSET$transformFeedback);
    }

    public void transformFeedback(@unsigned int value) {
        segment.set(LAYOUT$transformFeedback, OFFSET$transformFeedback, value);
    }

    public @unsigned int geometryStreams() {
        return segment.get(LAYOUT$geometryStreams, OFFSET$geometryStreams);
    }

    public void geometryStreams(@unsigned int value) {
        segment.set(LAYOUT$geometryStreams, OFFSET$geometryStreams, value);
    }


    public static final class VkPhysicalDeviceTransformFeedbackFeaturesEXTFactory implements IFactory<VkPhysicalDeviceTransformFeedbackFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceTransformFeedbackFeaturesEXT> clazz() {
            return VkPhysicalDeviceTransformFeedbackFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceTransformFeedbackFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceTransformFeedbackFeaturesEXTFactory FACTORY = new VkPhysicalDeviceTransformFeedbackFeaturesEXTFactory();
}

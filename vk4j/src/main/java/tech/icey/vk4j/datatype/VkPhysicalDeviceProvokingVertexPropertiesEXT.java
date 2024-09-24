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

public record VkPhysicalDeviceProvokingVertexPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexModePerPipeline"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesTriangleFanProvokingVertex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$provokingVertexModePerPipeline = PathElement.groupElement("provokingVertexModePerPipeline");
    public static final PathElement PATH$transformFeedbackPreservesTriangleFanProvokingVertex = PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$provokingVertexModePerPipeline = (OfInt) LAYOUT.select(PATH$provokingVertexModePerPipeline);
    public static final OfInt LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex = (OfInt) LAYOUT.select(PATH$transformFeedbackPreservesTriangleFanProvokingVertex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$provokingVertexModePerPipeline = LAYOUT.byteOffset(PATH$provokingVertexModePerPipeline);
    public static final long OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.byteOffset(PATH$transformFeedbackPreservesTriangleFanProvokingVertex);

    public VkPhysicalDeviceProvokingVertexPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT);
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

    public @unsigned int provokingVertexModePerPipeline() {
        return segment.get(LAYOUT$provokingVertexModePerPipeline, OFFSET$provokingVertexModePerPipeline);
    }

    public void provokingVertexModePerPipeline(@unsigned int value) {
        segment.set(LAYOUT$provokingVertexModePerPipeline, OFFSET$provokingVertexModePerPipeline, value);
    }

    public @unsigned int transformFeedbackPreservesTriangleFanProvokingVertex() {
        return segment.get(LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex);
    }

    public void transformFeedbackPreservesTriangleFanProvokingVertex(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceProvokingVertexPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceProvokingVertexPropertiesEXT> clazz() {
            return VkPhysicalDeviceProvokingVertexPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceProvokingVertexPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceProvokingVertexPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceProvokingVertexPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

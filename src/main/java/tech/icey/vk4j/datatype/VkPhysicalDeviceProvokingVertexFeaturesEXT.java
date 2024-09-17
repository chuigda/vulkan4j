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

public record VkPhysicalDeviceProvokingVertexFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexLast"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesProvokingVertex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$provokingVertexLast = PathElement.groupElement("provokingVertexLast");
    public static final PathElement PATH$transformFeedbackPreservesProvokingVertex = PathElement.groupElement("transformFeedbackPreservesProvokingVertex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$provokingVertexLast = (OfInt) LAYOUT.select(PATH$provokingVertexLast);
    public static final OfInt LAYOUT$transformFeedbackPreservesProvokingVertex = (OfInt) LAYOUT.select(PATH$transformFeedbackPreservesProvokingVertex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$provokingVertexLast = LAYOUT.byteOffset(PATH$provokingVertexLast);
    public static final long OFFSET$transformFeedbackPreservesProvokingVertex = LAYOUT.byteOffset(PATH$transformFeedbackPreservesProvokingVertex);

    public VkPhysicalDeviceProvokingVertexFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT);
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

    public @unsigned int provokingVertexLast() {
        return segment.get(LAYOUT$provokingVertexLast, OFFSET$provokingVertexLast);
    }

    public void provokingVertexLast(@unsigned int value) {
        segment.set(LAYOUT$provokingVertexLast, OFFSET$provokingVertexLast, value);
    }

    public @unsigned int transformFeedbackPreservesProvokingVertex() {
        return segment.get(LAYOUT$transformFeedbackPreservesProvokingVertex, OFFSET$transformFeedbackPreservesProvokingVertex);
    }

    public void transformFeedbackPreservesProvokingVertex(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackPreservesProvokingVertex, OFFSET$transformFeedbackPreservesProvokingVertex, value);
    }


    public static final class VkPhysicalDeviceProvokingVertexFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceProvokingVertexFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceProvokingVertexFeaturesEXT> clazz() {
            return VkPhysicalDeviceProvokingVertexFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceProvokingVertexFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceProvokingVertexFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceProvokingVertexFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceProvokingVertexFeaturesEXTFactory FACTORY = new VkPhysicalDeviceProvokingVertexFeaturesEXTFactory();
}

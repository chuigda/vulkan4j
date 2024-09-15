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

public record VkDepthBiasRepresentationInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$depthBiasRepresentation = PathElement.groupElement(2);
    public static final PathElement PATH$depthBiasExact = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$depthBiasRepresentation = (OfInt) LAYOUT.select(PATH$depthBiasRepresentation);
    public static final OfInt LAYOUT$depthBiasExact = (OfInt) LAYOUT.select(PATH$depthBiasExact);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthBiasRepresentation = LAYOUT.byteOffset(PATH$depthBiasRepresentation);
    public static final long OFFSET$depthBiasExact = LAYOUT.byteOffset(PATH$depthBiasExact);

    public VkDepthBiasRepresentationInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT);
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

    public @enumtype(VkDepthBiasRepresentationEXT.class) int depthBiasRepresentation() {
        return segment.get(LAYOUT$depthBiasRepresentation, OFFSET$depthBiasRepresentation);
    }

    public void depthBiasRepresentation(@enumtype(VkDepthBiasRepresentationEXT.class) int value) {
        segment.set(LAYOUT$depthBiasRepresentation, OFFSET$depthBiasRepresentation, value);
    }

    public @unsigned int depthBiasExact() {
        return segment.get(LAYOUT$depthBiasExact, OFFSET$depthBiasExact);
    }

    public void depthBiasExact(@unsigned int value) {
        segment.set(LAYOUT$depthBiasExact, OFFSET$depthBiasExact, value);
    }


    public static final class VkDepthBiasRepresentationInfoEXTFactory implements IDataTypeFactory<VkDepthBiasRepresentationInfoEXT> {
        @Override
        public Class<VkDepthBiasRepresentationInfoEXT> clazz() {
            return VkDepthBiasRepresentationInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDepthBiasRepresentationInfoEXT.LAYOUT;
        }

        @Override
        public VkDepthBiasRepresentationInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDepthBiasRepresentationInfoEXT createUninit(MemorySegment segment) {
            return new VkDepthBiasRepresentationInfoEXT(segment);
        }
    }

    public static final VkDepthBiasRepresentationInfoEXTFactory FACTORY = new VkDepthBiasRepresentationInfoEXTFactory();
}

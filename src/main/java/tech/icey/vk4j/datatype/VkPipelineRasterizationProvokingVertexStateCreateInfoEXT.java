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

public record VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexMode")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$provokingVertexMode = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$provokingVertexMode = (OfInt) LAYOUT.select(PATH$provokingVertexMode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$provokingVertexMode = LAYOUT.byteOffset(PATH$provokingVertexMode);

    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT);
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

    public @enumtype(VkProvokingVertexModeEXT.class) int provokingVertexMode() {
        return segment.get(LAYOUT$provokingVertexMode, OFFSET$provokingVertexMode);
    }

    public void provokingVertexMode(@enumtype(VkProvokingVertexModeEXT.class) int value) {
        segment.set(LAYOUT$provokingVertexMode, OFFSET$provokingVertexMode, value);
    }


    public static final class VkPipelineRasterizationProvokingVertexStateCreateInfoEXTFactory implements IDataTypeFactory<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> {
        @Override
        public Class<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> clazz() {
            return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(segment);
        }
    }

    public static final VkPipelineRasterizationProvokingVertexStateCreateInfoEXTFactory FACTORY = new VkPipelineRasterizationProvokingVertexStateCreateInfoEXTFactory();
}

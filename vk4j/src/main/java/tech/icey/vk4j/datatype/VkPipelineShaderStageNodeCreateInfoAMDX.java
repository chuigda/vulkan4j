package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineShaderStageNodeCreateInfoAMDX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pName"),
        ValueLayout.JAVA_INT.withName("index")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pName = PathElement.groupElement("pName");
    public static final PathElement PATH$index = PathElement.groupElement("index");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pName = (AddressLayout) LAYOUT.select(PATH$pName);
    public static final OfInt LAYOUT$index = (OfInt) LAYOUT.select(PATH$index);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pName = LAYOUT.byteOffset(PATH$pName);
    public static final long OFFSET$index = LAYOUT.byteOffset(PATH$index);

    public VkPipelineShaderStageNodeCreateInfoAMDX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX);
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

    public @pointer(comment="int8_t*") MemorySegment pNameRaw() {
        return segment.get(LAYOUT$pName, OFFSET$pName);
    }

    public void pNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pName, OFFSET$pName, value);
    }

    public BytePtr pName() {
        return new BytePtr(pNameRaw());
    }

    public void pName(BytePtr value) {
        pNameRaw(value.segment());
    }

    public @unsigned int index() {
        return segment.get(LAYOUT$index, OFFSET$index);
    }

    public void index(@unsigned int value) {
        segment.set(LAYOUT$index, OFFSET$index, value);
    }


    public static final class Factory implements IFactory<VkPipelineShaderStageNodeCreateInfoAMDX> {
        @Override
        public Class<VkPipelineShaderStageNodeCreateInfoAMDX> clazz() {
            return VkPipelineShaderStageNodeCreateInfoAMDX.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPipelineShaderStageNodeCreateInfoAMDX.LAYOUT;
        }

        @Override
        public VkPipelineShaderStageNodeCreateInfoAMDX create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineShaderStageNodeCreateInfoAMDX createUninit(MemorySegment segment) {
            return new VkPipelineShaderStageNodeCreateInfoAMDX(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

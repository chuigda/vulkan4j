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

public record VkPipelineDepthStencilStateCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthTestEnable"),
        ValueLayout.JAVA_INT.withName("depthWriteEnable"),
        ValueLayout.JAVA_INT.withName("depthCompareOp"),
        ValueLayout.JAVA_INT.withName("depthBoundsTestEnable"),
        ValueLayout.JAVA_INT.withName("stencilTestEnable"),
        VkStencilOpState.LAYOUT.withName("front"),
        VkStencilOpState.LAYOUT.withName("back"),
        ValueLayout.JAVA_FLOAT.withName("minDepthBounds"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthBounds")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$depthTestEnable = PathElement.groupElement(3);
    public static final PathElement PATH$depthWriteEnable = PathElement.groupElement(4);
    public static final PathElement PATH$depthCompareOp = PathElement.groupElement(5);
    public static final PathElement PATH$depthBoundsTestEnable = PathElement.groupElement(6);
    public static final PathElement PATH$stencilTestEnable = PathElement.groupElement(7);
    public static final PathElement PATH$front = PathElement.groupElement(8);
    public static final PathElement PATH$back = PathElement.groupElement(9);
    public static final PathElement PATH$minDepthBounds = PathElement.groupElement(10);
    public static final PathElement PATH$maxDepthBounds = PathElement.groupElement(11);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$depthTestEnable = (OfInt) LAYOUT.select(PATH$depthTestEnable);
    public static final OfInt LAYOUT$depthWriteEnable = (OfInt) LAYOUT.select(PATH$depthWriteEnable);
    public static final OfInt LAYOUT$depthCompareOp = (OfInt) LAYOUT.select(PATH$depthCompareOp);
    public static final OfInt LAYOUT$depthBoundsTestEnable = (OfInt) LAYOUT.select(PATH$depthBoundsTestEnable);
    public static final OfInt LAYOUT$stencilTestEnable = (OfInt) LAYOUT.select(PATH$stencilTestEnable);
    public static final StructLayout LAYOUT$front = (StructLayout) LAYOUT.select(PATH$front);
    public static final StructLayout LAYOUT$back = (StructLayout) LAYOUT.select(PATH$back);
    public static final OfFloat LAYOUT$minDepthBounds = (OfFloat) LAYOUT.select(PATH$minDepthBounds);
    public static final OfFloat LAYOUT$maxDepthBounds = (OfFloat) LAYOUT.select(PATH$maxDepthBounds);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$depthTestEnable = LAYOUT.byteOffset(PATH$depthTestEnable);
    public static final long OFFSET$depthWriteEnable = LAYOUT.byteOffset(PATH$depthWriteEnable);
    public static final long OFFSET$depthCompareOp = LAYOUT.byteOffset(PATH$depthCompareOp);
    public static final long OFFSET$depthBoundsTestEnable = LAYOUT.byteOffset(PATH$depthBoundsTestEnable);
    public static final long OFFSET$stencilTestEnable = LAYOUT.byteOffset(PATH$stencilTestEnable);
    public static final long OFFSET$front = LAYOUT.byteOffset(PATH$front);
    public static final long OFFSET$back = LAYOUT.byteOffset(PATH$back);
    public static final long OFFSET$minDepthBounds = LAYOUT.byteOffset(PATH$minDepthBounds);
    public static final long OFFSET$maxDepthBounds = LAYOUT.byteOffset(PATH$maxDepthBounds);

    public VkPipelineDepthStencilStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineDepthStencilStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineDepthStencilStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int depthTestEnable() {
        return segment.get(LAYOUT$depthTestEnable, OFFSET$depthTestEnable);
    }

    public void depthTestEnable(@unsigned int value) {
        segment.set(LAYOUT$depthTestEnable, OFFSET$depthTestEnable, value);
    }

    public @unsigned int depthWriteEnable() {
        return segment.get(LAYOUT$depthWriteEnable, OFFSET$depthWriteEnable);
    }

    public void depthWriteEnable(@unsigned int value) {
        segment.set(LAYOUT$depthWriteEnable, OFFSET$depthWriteEnable, value);
    }

    public @enumtype(VkCompareOp.class) int depthCompareOp() {
        return segment.get(LAYOUT$depthCompareOp, OFFSET$depthCompareOp);
    }

    public void depthCompareOp(@enumtype(VkCompareOp.class) int value) {
        segment.set(LAYOUT$depthCompareOp, OFFSET$depthCompareOp, value);
    }

    public @unsigned int depthBoundsTestEnable() {
        return segment.get(LAYOUT$depthBoundsTestEnable, OFFSET$depthBoundsTestEnable);
    }

    public void depthBoundsTestEnable(@unsigned int value) {
        segment.set(LAYOUT$depthBoundsTestEnable, OFFSET$depthBoundsTestEnable, value);
    }

    public @unsigned int stencilTestEnable() {
        return segment.get(LAYOUT$stencilTestEnable, OFFSET$stencilTestEnable);
    }

    public void stencilTestEnable(@unsigned int value) {
        segment.set(LAYOUT$stencilTestEnable, OFFSET$stencilTestEnable, value);
    }

    public VkStencilOpState front() {
        return new VkStencilOpState(segment.asSlice(OFFSET$front, LAYOUT$front));
    }

    public void front(VkStencilOpState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$front, LAYOUT$front.byteSize());
    }

    public VkStencilOpState back() {
        return new VkStencilOpState(segment.asSlice(OFFSET$back, LAYOUT$back));
    }

    public void back(VkStencilOpState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$back, LAYOUT$back.byteSize());
    }

    public float minDepthBounds() {
        return segment.get(LAYOUT$minDepthBounds, OFFSET$minDepthBounds);
    }

    public void minDepthBounds(float value) {
        segment.set(LAYOUT$minDepthBounds, OFFSET$minDepthBounds, value);
    }

    public float maxDepthBounds() {
        return segment.get(LAYOUT$maxDepthBounds, OFFSET$maxDepthBounds);
    }

    public void maxDepthBounds(float value) {
        segment.set(LAYOUT$maxDepthBounds, OFFSET$maxDepthBounds, value);
    }


    public static final class VkPipelineDepthStencilStateCreateInfoFactory implements IDataTypeFactory<VkPipelineDepthStencilStateCreateInfo> {
        @Override
        public Class<VkPipelineDepthStencilStateCreateInfo> clazz() {
            return VkPipelineDepthStencilStateCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineDepthStencilStateCreateInfo.LAYOUT;
        }

        @Override
        public VkPipelineDepthStencilStateCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineDepthStencilStateCreateInfo createUninit(MemorySegment segment) {
            return new VkPipelineDepthStencilStateCreateInfo(segment);
        }
    }

    public static final VkPipelineDepthStencilStateCreateInfoFactory FACTORY = new VkPipelineDepthStencilStateCreateInfoFactory();
}
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

public record VkRenderPassBeginInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.ADDRESS.withName("framebuffer"),
        VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("clearValueCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkClearValue.LAYOUT).withName("pClearValues")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$renderPass = PathElement.groupElement("renderPass");
    public static final PathElement PATH$framebuffer = PathElement.groupElement("framebuffer");
    public static final PathElement PATH$renderArea = PathElement.groupElement("renderArea");
    public static final PathElement PATH$clearValueCount = PathElement.groupElement("clearValueCount");
    public static final PathElement PATH$pClearValues = PathElement.groupElement("pClearValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$renderPass = (AddressLayout) LAYOUT.select(PATH$renderPass);
    public static final AddressLayout LAYOUT$framebuffer = (AddressLayout) LAYOUT.select(PATH$framebuffer);
    public static final StructLayout LAYOUT$renderArea = (StructLayout) LAYOUT.select(PATH$renderArea);
    public static final OfInt LAYOUT$clearValueCount = (OfInt) LAYOUT.select(PATH$clearValueCount);
    public static final AddressLayout LAYOUT$pClearValues = (AddressLayout) LAYOUT.select(PATH$pClearValues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPass = LAYOUT.byteOffset(PATH$renderPass);
    public static final long OFFSET$framebuffer = LAYOUT.byteOffset(PATH$framebuffer);
    public static final long OFFSET$renderArea = LAYOUT.byteOffset(PATH$renderArea);
    public static final long OFFSET$clearValueCount = LAYOUT.byteOffset(PATH$clearValueCount);
    public static final long OFFSET$pClearValues = LAYOUT.byteOffset(PATH$pClearValues);

    public VkRenderPassBeginInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO);
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

    public VkRenderPass renderPass() {
        return new VkRenderPass(segment.asSlice(OFFSET$renderPass, LAYOUT$renderPass));
    }

    public void renderPass(VkRenderPass value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderPass, LAYOUT$renderPass.byteSize());
    }

    public VkFramebuffer framebuffer() {
        return new VkFramebuffer(segment.asSlice(OFFSET$framebuffer, LAYOUT$framebuffer));
    }

    public void framebuffer(VkFramebuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$framebuffer, LAYOUT$framebuffer.byteSize());
    }

    public VkRect2D renderArea() {
        return new VkRect2D(segment.asSlice(OFFSET$renderArea, LAYOUT$renderArea));
    }

    public void renderArea(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderArea, LAYOUT$renderArea.byteSize());
    }

    public @unsigned int clearValueCount() {
        return segment.get(LAYOUT$clearValueCount, OFFSET$clearValueCount);
    }

    public void clearValueCount(@unsigned int value) {
        segment.set(LAYOUT$clearValueCount, OFFSET$clearValueCount, value);
    }

    public @pointer(comment="VkClearValue*") MemorySegment pClearValuesRaw() {
        return segment.get(LAYOUT$pClearValues, OFFSET$pClearValues);
    }

    public void pClearValuesRaw(@pointer(comment="VkClearValue*") MemorySegment value) {
        segment.set(LAYOUT$pClearValues, OFFSET$pClearValues, value);
    }
    
    public @nullable VkClearValue pClearValues() {
        MemorySegment s = pClearValuesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkClearValue(s);
    }

    public void pClearValues(@nullable VkClearValue value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pClearValuesRaw(s);
    }


    public static final class VkRenderPassBeginInfoFactory implements IDataTypeFactory<VkRenderPassBeginInfo> {
        @Override
        public Class<VkRenderPassBeginInfo> clazz() {
            return VkRenderPassBeginInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderPassBeginInfo.LAYOUT;
        }

        @Override
        public VkRenderPassBeginInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderPassBeginInfo createUninit(MemorySegment segment) {
            return new VkRenderPassBeginInfo(segment);
        }
    }

    public static final VkRenderPassBeginInfoFactory FACTORY = new VkRenderPassBeginInfoFactory();
}

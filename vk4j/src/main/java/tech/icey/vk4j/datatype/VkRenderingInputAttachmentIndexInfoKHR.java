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

public record VkRenderingInputAttachmentIndexInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorAttachmentInputIndices"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDepthInputAttachmentIndex"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pStencilInputAttachmentIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("colorAttachmentCount");
    public static final PathElement PATH$pColorAttachmentInputIndices = PathElement.groupElement("pColorAttachmentInputIndices");
    public static final PathElement PATH$pDepthInputAttachmentIndex = PathElement.groupElement("pDepthInputAttachmentIndex");
    public static final PathElement PATH$pStencilInputAttachmentIndex = PathElement.groupElement("pStencilInputAttachmentIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachmentInputIndices = (AddressLayout) LAYOUT.select(PATH$pColorAttachmentInputIndices);
    public static final AddressLayout LAYOUT$pDepthInputAttachmentIndex = (AddressLayout) LAYOUT.select(PATH$pDepthInputAttachmentIndex);
    public static final AddressLayout LAYOUT$pStencilInputAttachmentIndex = (AddressLayout) LAYOUT.select(PATH$pStencilInputAttachmentIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachmentInputIndices = LAYOUT.byteOffset(PATH$pColorAttachmentInputIndices);
    public static final long OFFSET$pDepthInputAttachmentIndex = LAYOUT.byteOffset(PATH$pDepthInputAttachmentIndex);
    public static final long OFFSET$pStencilInputAttachmentIndex = LAYOUT.byteOffset(PATH$pStencilInputAttachmentIndex);

    public VkRenderingInputAttachmentIndexInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR);
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

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pColorAttachmentInputIndicesRaw() {
        return segment.get(LAYOUT$pColorAttachmentInputIndices, OFFSET$pColorAttachmentInputIndices);
    }

    public void pColorAttachmentInputIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pColorAttachmentInputIndices, OFFSET$pColorAttachmentInputIndices, value);
    }
    
    public @unsigned IntPtr pColorAttachmentInputIndices() {
        return new IntPtr(pColorAttachmentInputIndicesRaw());
    }

    public void pColorAttachmentInputIndices(@unsigned IntPtr value) {
        pColorAttachmentInputIndicesRaw(value.segment());
    }

    public @pointer(comment="uint32_t*") MemorySegment pDepthInputAttachmentIndexRaw() {
        return segment.get(LAYOUT$pDepthInputAttachmentIndex, OFFSET$pDepthInputAttachmentIndex);
    }

    public void pDepthInputAttachmentIndexRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pDepthInputAttachmentIndex, OFFSET$pDepthInputAttachmentIndex, value);
    }
    
    public @unsigned IntPtr pDepthInputAttachmentIndex() {
        return new IntPtr(pDepthInputAttachmentIndexRaw());
    }

    public void pDepthInputAttachmentIndex(@unsigned IntPtr value) {
        pDepthInputAttachmentIndexRaw(value.segment());
    }

    public @pointer(comment="uint32_t*") MemorySegment pStencilInputAttachmentIndexRaw() {
        return segment.get(LAYOUT$pStencilInputAttachmentIndex, OFFSET$pStencilInputAttachmentIndex);
    }

    public void pStencilInputAttachmentIndexRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pStencilInputAttachmentIndex, OFFSET$pStencilInputAttachmentIndex, value);
    }
    
    public @unsigned IntPtr pStencilInputAttachmentIndex() {
        return new IntPtr(pStencilInputAttachmentIndexRaw());
    }

    public void pStencilInputAttachmentIndex(@unsigned IntPtr value) {
        pStencilInputAttachmentIndexRaw(value.segment());
    }


    public static final class VkRenderingInputAttachmentIndexInfoKHRFactory implements IFactory<VkRenderingInputAttachmentIndexInfoKHR> {
        @Override
        public Class<VkRenderingInputAttachmentIndexInfoKHR> clazz() {
            return VkRenderingInputAttachmentIndexInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderingInputAttachmentIndexInfoKHR.LAYOUT;
        }

        @Override
        public VkRenderingInputAttachmentIndexInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderingInputAttachmentIndexInfoKHR createUninit(MemorySegment segment) {
            return new VkRenderingInputAttachmentIndexInfoKHR(segment);
        }
    }

    public static final VkRenderingInputAttachmentIndexInfoKHRFactory FACTORY = new VkRenderingInputAttachmentIndexInfoKHRFactory();
}
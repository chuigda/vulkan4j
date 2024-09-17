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

public record VkCommandBufferInheritanceViewportScissorInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportScissor2D"),
        ValueLayout.JAVA_INT.withName("viewportDepthCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT).withName("pViewportDepths")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$viewportScissor2D = PathElement.groupElement("viewportScissor2D");
    public static final PathElement PATH$viewportDepthCount = PathElement.groupElement("viewportDepthCount");
    public static final PathElement PATH$pViewportDepths = PathElement.groupElement("pViewportDepths");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$viewportScissor2D = (OfInt) LAYOUT.select(PATH$viewportScissor2D);
    public static final OfInt LAYOUT$viewportDepthCount = (OfInt) LAYOUT.select(PATH$viewportDepthCount);
    public static final AddressLayout LAYOUT$pViewportDepths = (AddressLayout) LAYOUT.select(PATH$pViewportDepths);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewportScissor2D = LAYOUT.byteOffset(PATH$viewportScissor2D);
    public static final long OFFSET$viewportDepthCount = LAYOUT.byteOffset(PATH$viewportDepthCount);
    public static final long OFFSET$pViewportDepths = LAYOUT.byteOffset(PATH$pViewportDepths);

    public VkCommandBufferInheritanceViewportScissorInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV);
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

    public @unsigned int viewportScissor2D() {
        return segment.get(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D);
    }

    public void viewportScissor2D(@unsigned int value) {
        segment.set(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D, value);
    }

    public @unsigned int viewportDepthCount() {
        return segment.get(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount);
    }

    public void viewportDepthCount(@unsigned int value) {
        segment.set(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount, value);
    }

    public @pointer(comment="VkViewport*") MemorySegment pViewportDepthsRaw() {
        return segment.get(LAYOUT$pViewportDepths, OFFSET$pViewportDepths);
    }

    public void pViewportDepthsRaw(@pointer(comment="VkViewport*") MemorySegment value) {
        segment.set(LAYOUT$pViewportDepths, OFFSET$pViewportDepths, value);
    }
    
    public @nullable VkViewport pViewportDepths() {
        MemorySegment s = pViewportDepthsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkViewport(s);
    }

    public void pViewportDepths(@nullable VkViewport value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportDepthsRaw(s);
    }


    public static final class VkCommandBufferInheritanceViewportScissorInfoNVFactory implements IDataTypeFactory<VkCommandBufferInheritanceViewportScissorInfoNV> {
        @Override
        public Class<VkCommandBufferInheritanceViewportScissorInfoNV> clazz() {
            return VkCommandBufferInheritanceViewportScissorInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCommandBufferInheritanceViewportScissorInfoNV.LAYOUT;
        }

        @Override
        public VkCommandBufferInheritanceViewportScissorInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCommandBufferInheritanceViewportScissorInfoNV createUninit(MemorySegment segment) {
            return new VkCommandBufferInheritanceViewportScissorInfoNV(segment);
        }
    }

    public static final VkCommandBufferInheritanceViewportScissorInfoNVFactory FACTORY = new VkCommandBufferInheritanceViewportScissorInfoNVFactory();
}

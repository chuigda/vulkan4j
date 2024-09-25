package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkPipelineViewportStateCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT).withName("pViewports"),
        ValueLayout.JAVA_INT.withName("scissorCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pScissors")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("viewportCount");
    public static final PathElement PATH$pViewports = PathElement.groupElement("pViewports");
    public static final PathElement PATH$scissorCount = PathElement.groupElement("scissorCount");
    public static final PathElement PATH$pScissors = PathElement.groupElement("pScissors");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$viewportCount = (OfInt) LAYOUT.select(PATH$viewportCount);
    public static final AddressLayout LAYOUT$pViewports = (AddressLayout) LAYOUT.select(PATH$pViewports);
    public static final OfInt LAYOUT$scissorCount = (OfInt) LAYOUT.select(PATH$scissorCount);
    public static final AddressLayout LAYOUT$pScissors = (AddressLayout) LAYOUT.select(PATH$pScissors);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pViewports = LAYOUT.byteOffset(PATH$pViewports);
    public static final long OFFSET$scissorCount = LAYOUT.byteOffset(PATH$scissorCount);
    public static final long OFFSET$pScissors = LAYOUT.byteOffset(PATH$pScissors);

    public VkPipelineViewportStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineViewportStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineViewportStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int viewportCount() {
        return segment.get(LAYOUT$viewportCount, OFFSET$viewportCount);
    }

    public void viewportCount(@unsigned int value) {
        segment.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);
    }

    public @pointer(comment="VkViewport*") MemorySegment pViewportsRaw() {
        return segment.get(LAYOUT$pViewports, OFFSET$pViewports);
    }

    public void pViewportsRaw(@pointer(comment="VkViewport*") MemorySegment value) {
        segment.set(LAYOUT$pViewports, OFFSET$pViewports, value);
    }
    
    public @nullable VkViewport pViewports() {
        MemorySegment s = pViewportsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkViewport(s);
    }

    public void pViewports(@nullable VkViewport value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportsRaw(s);
    }

    public @unsigned int scissorCount() {
        return segment.get(LAYOUT$scissorCount, OFFSET$scissorCount);
    }

    public void scissorCount(@unsigned int value) {
        segment.set(LAYOUT$scissorCount, OFFSET$scissorCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pScissorsRaw() {
        return segment.get(LAYOUT$pScissors, OFFSET$pScissors);
    }

    public void pScissorsRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pScissors, OFFSET$pScissors, value);
    }
    
    public @nullable VkRect2D pScissors() {
        MemorySegment s = pScissorsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pScissors(@nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pScissorsRaw(s);
    }


    public static final class Factory implements IFactory<VkPipelineViewportStateCreateInfo> {
        @Override
        public Class<VkPipelineViewportStateCreateInfo> clazz() {
            return VkPipelineViewportStateCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineViewportStateCreateInfo.LAYOUT;
        }

        @Override
        public VkPipelineViewportStateCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineViewportStateCreateInfo createUninit(MemorySegment segment) {
            return new VkPipelineViewportStateCreateInfo(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

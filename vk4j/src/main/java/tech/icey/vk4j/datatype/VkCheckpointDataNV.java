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

public record VkCheckpointDataNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.ADDRESS.withName("pCheckpointMarker")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stage = PathElement.groupElement("stage");
    public static final PathElement PATH$pCheckpointMarker = PathElement.groupElement("pCheckpointMarker");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stage = (OfInt) LAYOUT.select(PATH$stage);
    public static final AddressLayout LAYOUT$pCheckpointMarker = (AddressLayout) LAYOUT.select(PATH$pCheckpointMarker);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stage = LAYOUT.byteOffset(PATH$stage);
    public static final long OFFSET$pCheckpointMarker = LAYOUT.byteOffset(PATH$pCheckpointMarker);

    public VkCheckpointDataNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV);
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

    public @enumtype(VkPipelineStageFlags.class) int stage() {
        return segment.get(LAYOUT$stage, OFFSET$stage);
    }

    public void stage(@enumtype(VkPipelineStageFlags.class) int value) {
        segment.set(LAYOUT$stage, OFFSET$stage, value);
    }

    public @pointer(comment="void*") MemorySegment pCheckpointMarker() {
        return segment.get(LAYOUT$pCheckpointMarker, OFFSET$pCheckpointMarker);
    }

    public void pCheckpointMarker(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pCheckpointMarker, OFFSET$pCheckpointMarker, value);
    }


    public static final class VkCheckpointDataNVFactory implements IFactory<VkCheckpointDataNV> {
        @Override
        public Class<VkCheckpointDataNV> clazz() {
            return VkCheckpointDataNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCheckpointDataNV.LAYOUT;
        }

        @Override
        public VkCheckpointDataNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCheckpointDataNV createUninit(MemorySegment segment) {
            return new VkCheckpointDataNV(segment);
        }
    }

    public static final VkCheckpointDataNVFactory FACTORY = new VkCheckpointDataNVFactory();
}
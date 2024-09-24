package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelinePropertiesIdentifierEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineIdentifier")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineIdentifier = PathElement.groupElement("pipelineIdentifier");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$pipelineIdentifier = (SequenceLayout) LAYOUT.select(PATH$pipelineIdentifier);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineIdentifier = LAYOUT.byteOffset(PATH$pipelineIdentifier);

    public VkPipelinePropertiesIdentifierEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT);
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

    public MemorySegment pipelineIdentifierRaw() {
        return segment.asSlice(OFFSET$pipelineIdentifier, LAYOUT$pipelineIdentifier.byteSize());
    }

    public @unsigned ByteArray pipelineIdentifier() {
        return new ByteArray(pipelineIdentifierRaw(), LAYOUT$pipelineIdentifier.elementCount());
    }

    public void pipelineIdentifier(@unsigned ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipelineIdentifier, LAYOUT$pipelineIdentifier.byteSize());
    }


    public static final class Factory implements IFactory<VkPipelinePropertiesIdentifierEXT> {
        @Override
        public Class<VkPipelinePropertiesIdentifierEXT> clazz() {
            return VkPipelinePropertiesIdentifierEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPipelinePropertiesIdentifierEXT.LAYOUT;
        }

        @Override
        public VkPipelinePropertiesIdentifierEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelinePropertiesIdentifierEXT createUninit(MemorySegment segment) {
            return new VkPipelinePropertiesIdentifierEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

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

public record VkShaderModuleIdentifierEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        MemoryLayout.sequenceLayout(VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT, ValueLayout.JAVA_BYTE).withName("identifier")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$identifierSize = PathElement.groupElement("identifierSize");
    public static final PathElement PATH$identifier = PathElement.groupElement("identifier");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$identifierSize = (OfInt) LAYOUT.select(PATH$identifierSize);
    public static final SequenceLayout LAYOUT$identifier = (SequenceLayout) LAYOUT.select(PATH$identifier);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$identifierSize = LAYOUT.byteOffset(PATH$identifierSize);
    public static final long OFFSET$identifier = LAYOUT.byteOffset(PATH$identifier);

    public VkShaderModuleIdentifierEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT);
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

    public @unsigned int identifierSize() {
        return segment.get(LAYOUT$identifierSize, OFFSET$identifierSize);
    }

    public void identifierSize(@unsigned int value) {
        segment.set(LAYOUT$identifierSize, OFFSET$identifierSize, value);
    }

    public MemorySegment identifierRaw() {
        return segment.asSlice(OFFSET$identifier, LAYOUT$identifier.byteSize());
    }

    public @unsigned ByteArray identifier() {
        return new ByteArray(identifierRaw(), LAYOUT$identifier.elementCount());
    }

    public void identifier(@unsigned ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$identifier, LAYOUT$identifier.byteSize());
    }


    public static final class Factory implements IFactory<VkShaderModuleIdentifierEXT> {
        @Override
        public Class<VkShaderModuleIdentifierEXT> clazz() {
            return VkShaderModuleIdentifierEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkShaderModuleIdentifierEXT.LAYOUT;
        }

        @Override
        public VkShaderModuleIdentifierEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkShaderModuleIdentifierEXT createUninit(MemorySegment segment) {
            return new VkShaderModuleIdentifierEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

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

public record VkPipelineShaderStageModuleIdentifierCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pIdentifier")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$identifierSize = PathElement.groupElement("identifierSize");
    public static final PathElement PATH$pIdentifier = PathElement.groupElement("pIdentifier");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$identifierSize = (OfInt) LAYOUT.select(PATH$identifierSize);
    public static final AddressLayout LAYOUT$pIdentifier = (AddressLayout) LAYOUT.select(PATH$pIdentifier);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$identifierSize = LAYOUT.byteOffset(PATH$identifierSize);
    public static final long OFFSET$pIdentifier = LAYOUT.byteOffset(PATH$pIdentifier);

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT);
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

    public @pointer(comment="uint8_t*") MemorySegment pIdentifierRaw() {
        return segment.get(LAYOUT$pIdentifier, OFFSET$pIdentifier);
    }

    public void pIdentifierRaw(@pointer(comment="uint8_t*") MemorySegment value) {
        segment.set(LAYOUT$pIdentifier, OFFSET$pIdentifier, value);
    }
    
    public @unsigned BytePtr pIdentifier() {
        return new BytePtr(pIdentifierRaw());
    }

    public void pIdentifier(@unsigned BytePtr value) {
        pIdentifierRaw(value.segment());
    }


    public static final class Factory implements IFactory<VkPipelineShaderStageModuleIdentifierCreateInfoEXT> {
        @Override
        public Class<VkPipelineShaderStageModuleIdentifierCreateInfoEXT> clazz() {
            return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkPipelineShaderStageModuleIdentifierCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineShaderStageModuleIdentifierCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

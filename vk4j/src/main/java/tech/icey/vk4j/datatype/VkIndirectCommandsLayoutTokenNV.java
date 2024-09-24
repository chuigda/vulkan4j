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

public record VkIndirectCommandsLayoutTokenNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tokenType"),
        ValueLayout.JAVA_INT.withName("stream"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("vertexBindingUnit"),
        ValueLayout.JAVA_INT.withName("vertexDynamicStride"),
        ValueLayout.ADDRESS.withName("pushconstantPipelineLayout"),
        ValueLayout.JAVA_INT.withName("pushconstantShaderStageFlags"),
        ValueLayout.JAVA_INT.withName("pushconstantOffset"),
        ValueLayout.JAVA_INT.withName("pushconstantSize"),
        ValueLayout.JAVA_INT.withName("indirectStateFlags"),
        ValueLayout.JAVA_INT.withName("indexTypeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pIndexTypes"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pIndexTypeValues")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$tokenType = PathElement.groupElement("tokenType");
    public static final PathElement PATH$stream = PathElement.groupElement("stream");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$vertexBindingUnit = PathElement.groupElement("vertexBindingUnit");
    public static final PathElement PATH$vertexDynamicStride = PathElement.groupElement("vertexDynamicStride");
    public static final PathElement PATH$pushconstantPipelineLayout = PathElement.groupElement("pushconstantPipelineLayout");
    public static final PathElement PATH$pushconstantShaderStageFlags = PathElement.groupElement("pushconstantShaderStageFlags");
    public static final PathElement PATH$pushconstantOffset = PathElement.groupElement("pushconstantOffset");
    public static final PathElement PATH$pushconstantSize = PathElement.groupElement("pushconstantSize");
    public static final PathElement PATH$indirectStateFlags = PathElement.groupElement("indirectStateFlags");
    public static final PathElement PATH$indexTypeCount = PathElement.groupElement("indexTypeCount");
    public static final PathElement PATH$pIndexTypes = PathElement.groupElement("pIndexTypes");
    public static final PathElement PATH$pIndexTypeValues = PathElement.groupElement("pIndexTypeValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$tokenType = (OfInt) LAYOUT.select(PATH$tokenType);
    public static final OfInt LAYOUT$stream = (OfInt) LAYOUT.select(PATH$stream);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);
    public static final OfInt LAYOUT$vertexBindingUnit = (OfInt) LAYOUT.select(PATH$vertexBindingUnit);
    public static final OfInt LAYOUT$vertexDynamicStride = (OfInt) LAYOUT.select(PATH$vertexDynamicStride);
    public static final AddressLayout LAYOUT$pushconstantPipelineLayout = (AddressLayout) LAYOUT.select(PATH$pushconstantPipelineLayout);
    public static final OfInt LAYOUT$pushconstantShaderStageFlags = (OfInt) LAYOUT.select(PATH$pushconstantShaderStageFlags);
    public static final OfInt LAYOUT$pushconstantOffset = (OfInt) LAYOUT.select(PATH$pushconstantOffset);
    public static final OfInt LAYOUT$pushconstantSize = (OfInt) LAYOUT.select(PATH$pushconstantSize);
    public static final OfInt LAYOUT$indirectStateFlags = (OfInt) LAYOUT.select(PATH$indirectStateFlags);
    public static final OfInt LAYOUT$indexTypeCount = (OfInt) LAYOUT.select(PATH$indexTypeCount);
    public static final AddressLayout LAYOUT$pIndexTypes = (AddressLayout) LAYOUT.select(PATH$pIndexTypes);
    public static final AddressLayout LAYOUT$pIndexTypeValues = (AddressLayout) LAYOUT.select(PATH$pIndexTypeValues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$tokenType = LAYOUT.byteOffset(PATH$tokenType);
    public static final long OFFSET$stream = LAYOUT.byteOffset(PATH$stream);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$vertexBindingUnit = LAYOUT.byteOffset(PATH$vertexBindingUnit);
    public static final long OFFSET$vertexDynamicStride = LAYOUT.byteOffset(PATH$vertexDynamicStride);
    public static final long OFFSET$pushconstantPipelineLayout = LAYOUT.byteOffset(PATH$pushconstantPipelineLayout);
    public static final long OFFSET$pushconstantShaderStageFlags = LAYOUT.byteOffset(PATH$pushconstantShaderStageFlags);
    public static final long OFFSET$pushconstantOffset = LAYOUT.byteOffset(PATH$pushconstantOffset);
    public static final long OFFSET$pushconstantSize = LAYOUT.byteOffset(PATH$pushconstantSize);
    public static final long OFFSET$indirectStateFlags = LAYOUT.byteOffset(PATH$indirectStateFlags);
    public static final long OFFSET$indexTypeCount = LAYOUT.byteOffset(PATH$indexTypeCount);
    public static final long OFFSET$pIndexTypes = LAYOUT.byteOffset(PATH$pIndexTypes);
    public static final long OFFSET$pIndexTypeValues = LAYOUT.byteOffset(PATH$pIndexTypeValues);

    public VkIndirectCommandsLayoutTokenNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV);
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

    public @enumtype(VkIndirectCommandsTokenTypeNV.class) int tokenType() {
        return segment.get(LAYOUT$tokenType, OFFSET$tokenType);
    }

    public void tokenType(@enumtype(VkIndirectCommandsTokenTypeNV.class) int value) {
        segment.set(LAYOUT$tokenType, OFFSET$tokenType, value);
    }

    public @unsigned int stream() {
        return segment.get(LAYOUT$stream, OFFSET$stream);
    }

    public void stream(@unsigned int value) {
        segment.set(LAYOUT$stream, OFFSET$stream, value);
    }

    public @unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned int vertexBindingUnit() {
        return segment.get(LAYOUT$vertexBindingUnit, OFFSET$vertexBindingUnit);
    }

    public void vertexBindingUnit(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingUnit, OFFSET$vertexBindingUnit, value);
    }

    public @unsigned int vertexDynamicStride() {
        return segment.get(LAYOUT$vertexDynamicStride, OFFSET$vertexDynamicStride);
    }

    public void vertexDynamicStride(@unsigned int value) {
        segment.set(LAYOUT$vertexDynamicStride, OFFSET$vertexDynamicStride, value);
    }

    public VkPipelineLayout pushconstantPipelineLayout() {
        return new VkPipelineLayout(segment.asSlice(OFFSET$pushconstantPipelineLayout, LAYOUT$pushconstantPipelineLayout));
    }

    public void pushconstantPipelineLayout(VkPipelineLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pushconstantPipelineLayout, LAYOUT$pushconstantPipelineLayout.byteSize());
    }

    public @enumtype(VkShaderStageFlags.class) int pushconstantShaderStageFlags() {
        return segment.get(LAYOUT$pushconstantShaderStageFlags, OFFSET$pushconstantShaderStageFlags);
    }

    public void pushconstantShaderStageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$pushconstantShaderStageFlags, OFFSET$pushconstantShaderStageFlags, value);
    }

    public @unsigned int pushconstantOffset() {
        return segment.get(LAYOUT$pushconstantOffset, OFFSET$pushconstantOffset);
    }

    public void pushconstantOffset(@unsigned int value) {
        segment.set(LAYOUT$pushconstantOffset, OFFSET$pushconstantOffset, value);
    }

    public @unsigned int pushconstantSize() {
        return segment.get(LAYOUT$pushconstantSize, OFFSET$pushconstantSize);
    }

    public void pushconstantSize(@unsigned int value) {
        segment.set(LAYOUT$pushconstantSize, OFFSET$pushconstantSize, value);
    }

    public @enumtype(VkIndirectStateFlagsNV.class) int indirectStateFlags() {
        return segment.get(LAYOUT$indirectStateFlags, OFFSET$indirectStateFlags);
    }

    public void indirectStateFlags(@enumtype(VkIndirectStateFlagsNV.class) int value) {
        segment.set(LAYOUT$indirectStateFlags, OFFSET$indirectStateFlags, value);
    }

    public @unsigned int indexTypeCount() {
        return segment.get(LAYOUT$indexTypeCount, OFFSET$indexTypeCount);
    }

    public void indexTypeCount(@unsigned int value) {
        segment.set(LAYOUT$indexTypeCount, OFFSET$indexTypeCount, value);
    }

    public @pointer(target=VkIndexType.class) MemorySegment pIndexTypesRaw() {
        return segment.get(LAYOUT$pIndexTypes, OFFSET$pIndexTypes);
    }
    
    public void pIndexTypesRaw(@pointer(target=VkIndexType.class) MemorySegment value) {
        segment.set(LAYOUT$pIndexTypes, OFFSET$pIndexTypes, value);
    }
    
    public @nullable IntPtr pIndexTypes() {
        MemorySegment s = pIndexTypesRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntPtr(s);
    }
    
    public void pIndexTypes(@nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pIndexTypesRaw(s);
    }

    public @pointer(comment="uint32_t*") MemorySegment pIndexTypeValuesRaw() {
        return segment.get(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues);
    }

    public void pIndexTypeValuesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues, value);
    }
    
    public @unsigned IntPtr pIndexTypeValues() {
        return new IntPtr(pIndexTypeValuesRaw());
    }

    public void pIndexTypeValues(@unsigned IntPtr value) {
        pIndexTypeValuesRaw(value.segment());
    }


    public static final class Factory implements IFactory<VkIndirectCommandsLayoutTokenNV> {
        @Override
        public Class<VkIndirectCommandsLayoutTokenNV> clazz() {
            return VkIndirectCommandsLayoutTokenNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkIndirectCommandsLayoutTokenNV.LAYOUT;
        }

        @Override
        public VkIndirectCommandsLayoutTokenNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkIndirectCommandsLayoutTokenNV createUninit(MemorySegment segment) {
            return new VkIndirectCommandsLayoutTokenNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

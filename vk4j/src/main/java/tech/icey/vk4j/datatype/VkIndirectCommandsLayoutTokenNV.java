package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkIndirectCommandsLayoutTokenNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkIndirectCommandsTokenTypeNV tokenType;
///     uint32_t stream;
///     uint32_t offset;
///     uint32_t vertexBindingUnit;
///     VkBool32 vertexDynamicStride;
///     VkPipelineLayout pushconstantPipelineLayout;
///     VkShaderStageFlags pushconstantShaderStageFlags;
///     uint32_t pushconstantOffset;
///     uint32_t pushconstantSize;
///     VkIndirectStateFlagsNV indirectStateFlags;
///     uint32_t indexTypeCount;
///     const VkIndexType* pIndexTypes;
///     const uint32_t* pIndexTypeValues;
/// } VkIndirectCommandsLayoutTokenNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkIndirectCommandsLayoutTokenNV.html">VkIndirectCommandsLayoutTokenNV</a>
public record VkIndirectCommandsLayoutTokenNV(MemorySegment segment) implements IPointer {
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public @nullable VkPipelineLayout pushconstantPipelineLayout() {
        MemorySegment s = segment.get(LAYOUT$pushconstantPipelineLayout, OFFSET$pushconstantPipelineLayout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void pushconstantPipelineLayout(@nullable VkPipelineLayout value) {
        segment.set(
            LAYOUT$pushconstantPipelineLayout,
            OFFSET$pushconstantPipelineLayout,
            value != null ? value.segment() : MemorySegment.NULL
        );
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

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @nullable @enumtype(VkIndexType.class) IntBuffer pIndexTypes() {
        MemorySegment s = pIndexTypesRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntBuffer(s);
    }

    public void pIndexTypes(@nullable @enumtype(VkIndexType.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pIndexTypesRaw(s);
    }

    public @pointer(comment="uint32_t*") MemorySegment pIndexTypeValuesRaw() {
        return segment.get(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues);
    }

    public void pIndexTypeValuesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pIndexTypeValues() {
        MemorySegment s = pIndexTypeValuesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pIndexTypeValues(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pIndexTypeValuesRaw(s);
    }

    public static VkIndirectCommandsLayoutTokenNV allocate(Arena arena) {
        return new VkIndirectCommandsLayoutTokenNV(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsLayoutTokenNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsLayoutTokenNV[] ret = new VkIndirectCommandsLayoutTokenNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkIndirectCommandsLayoutTokenNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkIndirectCommandsLayoutTokenNV clone(Arena arena, VkIndirectCommandsLayoutTokenNV src) {
        VkIndirectCommandsLayoutTokenNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsLayoutTokenNV[] clone(Arena arena, VkIndirectCommandsLayoutTokenNV[] src) {
        VkIndirectCommandsLayoutTokenNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

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
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$tokenType = LAYOUT$tokenType.byteSize();
    public static final long SIZE$stream = LAYOUT$stream.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$vertexBindingUnit = LAYOUT$vertexBindingUnit.byteSize();
    public static final long SIZE$vertexDynamicStride = LAYOUT$vertexDynamicStride.byteSize();
    public static final long SIZE$pushconstantPipelineLayout = LAYOUT$pushconstantPipelineLayout.byteSize();
    public static final long SIZE$pushconstantShaderStageFlags = LAYOUT$pushconstantShaderStageFlags.byteSize();
    public static final long SIZE$pushconstantOffset = LAYOUT$pushconstantOffset.byteSize();
    public static final long SIZE$pushconstantSize = LAYOUT$pushconstantSize.byteSize();
    public static final long SIZE$indirectStateFlags = LAYOUT$indirectStateFlags.byteSize();
    public static final long SIZE$indexTypeCount = LAYOUT$indexTypeCount.byteSize();
    public static final long SIZE$pIndexTypes = LAYOUT$pIndexTypes.byteSize();
    public static final long SIZE$pIndexTypeValues = LAYOUT$pIndexTypeValues.byteSize();
}

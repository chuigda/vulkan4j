package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkIndirectCommandsLayoutTokenNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$tokenType = ValueLayout.JAVA_INT.withName("tokenType");
    public static final OfInt LAYOUT$stream = ValueLayout.JAVA_INT.withName("stream");
    public static final OfInt LAYOUT$offset = ValueLayout.JAVA_INT.withName("offset");
    public static final OfInt LAYOUT$vertexBindingUnit = ValueLayout.JAVA_INT.withName("vertexBindingUnit");
    public static final OfInt LAYOUT$vertexDynamicStride = ValueLayout.JAVA_INT.withName("vertexDynamicStride");
    public static final AddressLayout LAYOUT$pushconstantPipelineLayout = ValueLayout.ADDRESS.withName("pushconstantPipelineLayout");
    public static final OfInt LAYOUT$pushconstantShaderStageFlags = ValueLayout.JAVA_INT.withName("pushconstantShaderStageFlags");
    public static final OfInt LAYOUT$pushconstantOffset = ValueLayout.JAVA_INT.withName("pushconstantOffset");
    public static final OfInt LAYOUT$pushconstantSize = ValueLayout.JAVA_INT.withName("pushconstantSize");
    public static final OfInt LAYOUT$indirectStateFlags = ValueLayout.JAVA_INT.withName("indirectStateFlags");
    public static final OfInt LAYOUT$indexTypeCount = ValueLayout.JAVA_INT.withName("indexTypeCount");
    public static final AddressLayout LAYOUT$pIndexTypes = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pIndexTypes");
    public static final AddressLayout LAYOUT$pIndexTypeValues = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pIndexTypeValues");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$tokenType, LAYOUT$stream, LAYOUT$offset, LAYOUT$vertexBindingUnit, LAYOUT$vertexDynamicStride, LAYOUT$pushconstantPipelineLayout, LAYOUT$pushconstantShaderStageFlags, LAYOUT$pushconstantOffset, LAYOUT$pushconstantSize, LAYOUT$indirectStateFlags, LAYOUT$indexTypeCount, LAYOUT$pIndexTypes, LAYOUT$pIndexTypeValues);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkIndirectCommandsLayoutTokenNV allocate(Arena arena) {
        return new VkIndirectCommandsLayoutTokenNV(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsLayoutTokenNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsLayoutTokenNV[] ret = new VkIndirectCommandsLayoutTokenNV[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$tokenType = PathElement.groupElement("PATH$tokenType");
    public static final PathElement PATH$stream = PathElement.groupElement("PATH$stream");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$vertexBindingUnit = PathElement.groupElement("PATH$vertexBindingUnit");
    public static final PathElement PATH$vertexDynamicStride = PathElement.groupElement("PATH$vertexDynamicStride");
    public static final PathElement PATH$pushconstantPipelineLayout = PathElement.groupElement("PATH$pushconstantPipelineLayout");
    public static final PathElement PATH$pushconstantShaderStageFlags = PathElement.groupElement("PATH$pushconstantShaderStageFlags");
    public static final PathElement PATH$pushconstantOffset = PathElement.groupElement("PATH$pushconstantOffset");
    public static final PathElement PATH$pushconstantSize = PathElement.groupElement("PATH$pushconstantSize");
    public static final PathElement PATH$indirectStateFlags = PathElement.groupElement("PATH$indirectStateFlags");
    public static final PathElement PATH$indexTypeCount = PathElement.groupElement("PATH$indexTypeCount");
    public static final PathElement PATH$pIndexTypes = PathElement.groupElement("PATH$pIndexTypes");
    public static final PathElement PATH$pIndexTypeValues = PathElement.groupElement("PATH$pIndexTypeValues");

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    public @Nullable VkPipelineLayout pushconstantPipelineLayout() {
        MemorySegment s = segment.asSlice(OFFSET$pushconstantPipelineLayout, SIZE$pushconstantPipelineLayout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void pushconstantPipelineLayout() {
        segment.set(LAYOUT$pushconstantPipelineLayout, OFFSET$pushconstantPipelineLayout, value != null ? value.segment() : MemorySegment.NULL);
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

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkIndexType.class) IntPtr pIndexTypes() {
        MemorySegment s = pIndexTypesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pIndexTypes(@Nullable @enumtype(VkIndexType.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pIndexTypesRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pIndexTypeValuesRaw() {
        return segment.get(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues);
    }

    public void pIndexTypeValuesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pIndexTypeValues() {
        MemorySegment s = pIndexTypeValuesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pIndexTypeValues(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pIndexTypeValuesRaw(s);
    }

}
/// dummy, not implemented yet

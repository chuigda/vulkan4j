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

/// Represents a pointer to a {@code VkIndirectExecutionSetShaderInfoEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetShaderInfoEXT.html">VkIndirectExecutionSetShaderInfoEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectExecutionSetShaderInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkIndirectExecutionSetShaderInfoEXT {
        sType(VkStructureType.INDIRECT_EXECUTION_SET_SHADER_INFO_EXT);
    }

    public static VkIndirectExecutionSetShaderInfoEXT allocate(Arena arena) {
        return new VkIndirectExecutionSetShaderInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectExecutionSetShaderInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectExecutionSetShaderInfoEXT[] ret = new VkIndirectExecutionSetShaderInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectExecutionSetShaderInfoEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkIndirectExecutionSetShaderInfoEXT clone(Arena arena, VkIndirectExecutionSetShaderInfoEXT src) {
        VkIndirectExecutionSetShaderInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectExecutionSetShaderInfoEXT[] clone(Arena arena, VkIndirectExecutionSetShaderInfoEXT[] src) {
        VkIndirectExecutionSetShaderInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pInitialShaders"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectExecutionSetShaderLayoutInfoEXT.LAYOUT).withName("pSetLayoutInfos"),
        ValueLayout.JAVA_INT.withName("maxShaderCount"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPushConstantRange.LAYOUT).withName("pPushConstantRanges")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderCount = PathElement.groupElement("PATH$shaderCount");
    public static final PathElement PATH$pInitialShaders = PathElement.groupElement("PATH$pInitialShaders");
    public static final PathElement PATH$pSetLayoutInfos = PathElement.groupElement("PATH$pSetLayoutInfos");
    public static final PathElement PATH$maxShaderCount = PathElement.groupElement("PATH$maxShaderCount");
    public static final PathElement PATH$pushConstantRangeCount = PathElement.groupElement("PATH$pushConstantRangeCount");
    public static final PathElement PATH$pPushConstantRanges = PathElement.groupElement("PATH$pPushConstantRanges");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderCount = (OfInt) LAYOUT.select(PATH$shaderCount);
    public static final AddressLayout LAYOUT$pInitialShaders = (AddressLayout) LAYOUT.select(PATH$pInitialShaders);
    public static final AddressLayout LAYOUT$pSetLayoutInfos = (AddressLayout) LAYOUT.select(PATH$pSetLayoutInfos);
    public static final OfInt LAYOUT$maxShaderCount = (OfInt) LAYOUT.select(PATH$maxShaderCount);
    public static final OfInt LAYOUT$pushConstantRangeCount = (OfInt) LAYOUT.select(PATH$pushConstantRangeCount);
    public static final AddressLayout LAYOUT$pPushConstantRanges = (AddressLayout) LAYOUT.select(PATH$pPushConstantRanges);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderCount = LAYOUT$shaderCount.byteSize();
    public static final long SIZE$pInitialShaders = LAYOUT$pInitialShaders.byteSize();
    public static final long SIZE$pSetLayoutInfos = LAYOUT$pSetLayoutInfos.byteSize();
    public static final long SIZE$maxShaderCount = LAYOUT$maxShaderCount.byteSize();
    public static final long SIZE$pushConstantRangeCount = LAYOUT$pushConstantRangeCount.byteSize();
    public static final long SIZE$pPushConstantRanges = LAYOUT$pPushConstantRanges.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderCount = LAYOUT.byteOffset(PATH$shaderCount);
    public static final long OFFSET$pInitialShaders = LAYOUT.byteOffset(PATH$pInitialShaders);
    public static final long OFFSET$pSetLayoutInfos = LAYOUT.byteOffset(PATH$pSetLayoutInfos);
    public static final long OFFSET$maxShaderCount = LAYOUT.byteOffset(PATH$maxShaderCount);
    public static final long OFFSET$pushConstantRangeCount = LAYOUT.byteOffset(PATH$pushConstantRangeCount);
    public static final long OFFSET$pPushConstantRanges = LAYOUT.byteOffset(PATH$pPushConstantRanges);

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

    public @unsigned int shaderCount() {
        return segment.get(LAYOUT$shaderCount, OFFSET$shaderCount);
    }

    public void shaderCount(@unsigned int value) {
        segment.set(LAYOUT$shaderCount, OFFSET$shaderCount, value);
    }

    public @pointer(comment="VkShaderEXT*") MemorySegment pInitialShadersRaw() {
        return segment.get(LAYOUT$pInitialShaders, OFFSET$pInitialShaders);
    }

    public void pInitialShadersRaw(@pointer(comment="VkShaderEXT*") MemorySegment value) {
        segment.set(LAYOUT$pInitialShaders, OFFSET$pInitialShaders, value);
    }

    /// Note: the returned {@link VkShaderEXT.Buffer} does not have correct {@link VkShaderEXT.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkShaderEXT.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkShaderEXT.Buffer pInitialShaders() {
        MemorySegment s = pInitialShadersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkShaderEXT.Buffer(s);
    }


    public @pointer(comment="VkIndirectExecutionSetShaderLayoutInfoEXT*") MemorySegment pSetLayoutInfosRaw() {
        return segment.get(LAYOUT$pSetLayoutInfos, OFFSET$pSetLayoutInfos);
    }

    public void pSetLayoutInfosRaw(@pointer(comment="VkIndirectExecutionSetShaderLayoutInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pSetLayoutInfos, OFFSET$pSetLayoutInfos, value);
    }

    public @Nullable VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayoutInfos() {
        MemorySegment s = pSetLayoutInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(s);
    }

    public void pSetLayoutInfos(@Nullable VkIndirectExecutionSetShaderLayoutInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSetLayoutInfosRaw(s);
    }

    @unsafe public @Nullable VkIndirectExecutionSetShaderLayoutInfoEXT[] pSetLayoutInfos(int assumedCount) {
        MemorySegment s = pSetLayoutInfosRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectExecutionSetShaderLayoutInfoEXT.SIZE);
        VkIndirectExecutionSetShaderLayoutInfoEXT[] ret = new VkIndirectExecutionSetShaderLayoutInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectExecutionSetShaderLayoutInfoEXT(s.asSlice(i * VkIndirectExecutionSetShaderLayoutInfoEXT.SIZE, VkIndirectExecutionSetShaderLayoutInfoEXT.SIZE));
        }
        return ret;
    }

    public @unsigned int maxShaderCount() {
        return segment.get(LAYOUT$maxShaderCount, OFFSET$maxShaderCount);
    }

    public void maxShaderCount(@unsigned int value) {
        segment.set(LAYOUT$maxShaderCount, OFFSET$maxShaderCount, value);
    }

    public @unsigned int pushConstantRangeCount() {
        return segment.get(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount);
    }

    public void pushConstantRangeCount(@unsigned int value) {
        segment.set(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount, value);
    }

    public @pointer(comment="VkPushConstantRange*") MemorySegment pPushConstantRangesRaw() {
        return segment.get(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges);
    }

    public void pPushConstantRangesRaw(@pointer(comment="VkPushConstantRange*") MemorySegment value) {
        segment.set(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges, value);
    }

    public @Nullable VkPushConstantRange pPushConstantRanges() {
        MemorySegment s = pPushConstantRangesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPushConstantRange(s);
    }

    public void pPushConstantRanges(@Nullable VkPushConstantRange value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPushConstantRangesRaw(s);
    }

    @unsafe public @Nullable VkPushConstantRange[] pPushConstantRanges(int assumedCount) {
        MemorySegment s = pPushConstantRangesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPushConstantRange.SIZE);
        VkPushConstantRange[] ret = new VkPushConstantRange[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPushConstantRange(s.asSlice(i * VkPushConstantRange.SIZE, VkPushConstantRange.SIZE));
        }
        return ret;
    }

}

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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetInfoEXT.html">VkIndirectExecutionSetInfoEXT</a>
@ValueBasedCandidate
public record VkIndirectExecutionSetInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final AddressLayout LAYOUT$pPipelineInfo = ValueLayout.ADDRESS.withTargetLayout(VkIndirectExecutionSetPipelineInfoEXT.LAYOUT).withName("pPipelineInfo");
    public static final AddressLayout LAYOUT$pShaderInfo = ValueLayout.ADDRESS.withTargetLayout(VkIndirectExecutionSetShaderInfoEXT.LAYOUT).withName("pShaderInfo");

    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(LAYOUT$pPipelineInfo, LAYOUT$pShaderInfo);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkIndirectExecutionSetInfoEXT allocate(Arena arena) {
        return new VkIndirectExecutionSetInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectExecutionSetInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectExecutionSetInfoEXT[] ret = new VkIndirectExecutionSetInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectExecutionSetInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkIndirectExecutionSetInfoEXT clone(Arena arena, VkIndirectExecutionSetInfoEXT src) {
        VkIndirectExecutionSetInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectExecutionSetInfoEXT[] clone(Arena arena, VkIndirectExecutionSetInfoEXT[] src) {
        VkIndirectExecutionSetInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$pPipelineInfo = PathElement.groupElement("PATH$pPipelineInfo");
    public static final PathElement PATH$pShaderInfo = PathElement.groupElement("PATH$pShaderInfo");

    public static final long SIZE$pPipelineInfo = LAYOUT$pPipelineInfo.byteSize();
    public static final long SIZE$pShaderInfo = LAYOUT$pShaderInfo.byteSize();

    public static final long OFFSET$pPipelineInfo = LAYOUT.byteOffset(PATH$pPipelineInfo);
    public static final long OFFSET$pShaderInfo = LAYOUT.byteOffset(PATH$pShaderInfo);

    public @pointer(comment="VkIndirectExecutionSetPipelineInfoEXT*") MemorySegment pPipelineInfoRaw() {
        return segment.get(LAYOUT$pPipelineInfo, OFFSET$pPipelineInfo);
    }

    public void pPipelineInfoRaw(@pointer(comment="VkIndirectExecutionSetPipelineInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineInfo, OFFSET$pPipelineInfo, value);
    }

    public @Nullable VkIndirectExecutionSetPipelineInfoEXT pPipelineInfo() {
        MemorySegment s = pPipelineInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkIndirectExecutionSetPipelineInfoEXT(s);
    }

    public void pPipelineInfo(@Nullable VkIndirectExecutionSetPipelineInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineInfoRaw(s);
    }

    @unsafe public @Nullable VkIndirectExecutionSetPipelineInfoEXT[] pPipelineInfo(int assumedCount) {
        MemorySegment s = pPipelineInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectExecutionSetPipelineInfoEXT.SIZE);
        VkIndirectExecutionSetPipelineInfoEXT[] ret = new VkIndirectExecutionSetPipelineInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectExecutionSetPipelineInfoEXT(s.asSlice(i * VkIndirectExecutionSetPipelineInfoEXT.SIZE, VkIndirectExecutionSetPipelineInfoEXT.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkIndirectExecutionSetShaderInfoEXT*") MemorySegment pShaderInfoRaw() {
        return segment.get(LAYOUT$pShaderInfo, OFFSET$pShaderInfo);
    }

    public void pShaderInfoRaw(@pointer(comment="VkIndirectExecutionSetShaderInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pShaderInfo, OFFSET$pShaderInfo, value);
    }

    public @Nullable VkIndirectExecutionSetShaderInfoEXT pShaderInfo() {
        MemorySegment s = pShaderInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkIndirectExecutionSetShaderInfoEXT(s);
    }

    public void pShaderInfo(@Nullable VkIndirectExecutionSetShaderInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShaderInfoRaw(s);
    }

    @unsafe public @Nullable VkIndirectExecutionSetShaderInfoEXT[] pShaderInfo(int assumedCount) {
        MemorySegment s = pShaderInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectExecutionSetShaderInfoEXT.SIZE);
        VkIndirectExecutionSetShaderInfoEXT[] ret = new VkIndirectExecutionSetShaderInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectExecutionSetShaderInfoEXT(s.asSlice(i * VkIndirectExecutionSetShaderInfoEXT.SIZE, VkIndirectExecutionSetShaderInfoEXT.SIZE));
        }
        return ret;
    }

}

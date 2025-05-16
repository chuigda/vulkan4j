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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetInfoEXT.html"><code>VkIndirectExecutionSetInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectExecutionSetInfoEXT {
///     VkIndirectExecutionSetPipelineInfoEXT const* pPipelineInfo;
///     VkIndirectExecutionSetShaderInfoEXT const* pShaderInfo;
/// } VkIndirectExecutionSetInfoEXT;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetInfoEXT.html"><code>VkIndirectExecutionSetInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectExecutionSetInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectExecutionSetInfoEXT allocate(Arena arena) {
        VkIndirectExecutionSetInfoEXT ret = new VkIndirectExecutionSetInfoEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkIndirectExecutionSetInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectExecutionSetInfoEXT[] ret = new VkIndirectExecutionSetInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectExecutionSetInfoEXT(segment.asSlice(i * BYTES, BYTES));
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

    public @pointer(comment="VkIndirectExecutionSetPipelineInfoEXT*") MemorySegment pPipelineInfoRaw() {
        return segment.get(LAYOUT$pPipelineInfo, OFFSET$pPipelineInfo);
    }

    public void pPipelineInfoRaw(@pointer(comment="VkIndirectExecutionSetPipelineInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineInfo, OFFSET$pPipelineInfo, value);
    }

    public @Nullable VkIndirectExecutionSetPipelineInfoEXT pPipelineInfo() {
        MemorySegment s = pPipelineInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectExecutionSetPipelineInfoEXT.BYTES);
        VkIndirectExecutionSetPipelineInfoEXT[] ret = new VkIndirectExecutionSetPipelineInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectExecutionSetPipelineInfoEXT(s.asSlice(i * VkIndirectExecutionSetPipelineInfoEXT.BYTES, VkIndirectExecutionSetPipelineInfoEXT.BYTES));
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
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectExecutionSetShaderInfoEXT.BYTES);
        VkIndirectExecutionSetShaderInfoEXT[] ret = new VkIndirectExecutionSetShaderInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectExecutionSetShaderInfoEXT(s.asSlice(i * VkIndirectExecutionSetShaderInfoEXT.BYTES, VkIndirectExecutionSetShaderInfoEXT.BYTES));
        }
        return ret;
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectExecutionSetPipelineInfoEXT.LAYOUT).withName("pPipelineInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectExecutionSetShaderInfoEXT.LAYOUT).withName("pShaderInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$pPipelineInfo = PathElement.groupElement("PATH$pPipelineInfo");
    public static final PathElement PATH$pShaderInfo = PathElement.groupElement("PATH$pShaderInfo");

    public static final AddressLayout LAYOUT$pPipelineInfo = (AddressLayout) LAYOUT.select(PATH$pPipelineInfo);
    public static final AddressLayout LAYOUT$pShaderInfo = (AddressLayout) LAYOUT.select(PATH$pShaderInfo);

    public static final long SIZE$pPipelineInfo = LAYOUT$pPipelineInfo.byteSize();
    public static final long SIZE$pShaderInfo = LAYOUT$pShaderInfo.byteSize();

    public static final long OFFSET$pPipelineInfo = LAYOUT.byteOffset(PATH$pPipelineInfo);
    public static final long OFFSET$pShaderInfo = LAYOUT.byteOffset(PATH$pShaderInfo);
}

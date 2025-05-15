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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetPipelineInfoEXT.html"><code>VkIndirectExecutionSetPipelineInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectExecutionSetPipelineInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkPipeline initialPipeline;
///     uint32_t maxPipelineCount;
/// } VkIndirectExecutionSetPipelineInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT`
///
/// The {@link VkIndirectExecutionSetPipelineInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkIndirectExecutionSetPipelineInfoEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetPipelineInfoEXT.html"><code>VkIndirectExecutionSetPipelineInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectExecutionSetPipelineInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectExecutionSetPipelineInfoEXT allocate(Arena arena) {
        VkIndirectExecutionSetPipelineInfoEXT ret = new VkIndirectExecutionSetPipelineInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT);
        return ret;
    }

    public static VkIndirectExecutionSetPipelineInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectExecutionSetPipelineInfoEXT[] ret = new VkIndirectExecutionSetPipelineInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectExecutionSetPipelineInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT);
        }
        return ret;
    }

    public static VkIndirectExecutionSetPipelineInfoEXT clone(Arena arena, VkIndirectExecutionSetPipelineInfoEXT src) {
        VkIndirectExecutionSetPipelineInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectExecutionSetPipelineInfoEXT[] clone(Arena arena, VkIndirectExecutionSetPipelineInfoEXT[] src) {
        VkIndirectExecutionSetPipelineInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @Nullable VkPipeline initialPipeline() {
        MemorySegment s = segment.asSlice(OFFSET$initialPipeline, SIZE$initialPipeline);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void initialPipeline(@Nullable VkPipeline value) {
        segment.set(LAYOUT$initialPipeline, OFFSET$initialPipeline, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int maxPipelineCount() {
        return segment.get(LAYOUT$maxPipelineCount, OFFSET$maxPipelineCount);
    }

    public void maxPipelineCount(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineCount, OFFSET$maxPipelineCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("initialPipeline"),
        ValueLayout.JAVA_INT.withName("maxPipelineCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$initialPipeline = PathElement.groupElement("PATH$initialPipeline");
    public static final PathElement PATH$maxPipelineCount = PathElement.groupElement("PATH$maxPipelineCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$initialPipeline = (AddressLayout) LAYOUT.select(PATH$initialPipeline);
    public static final OfInt LAYOUT$maxPipelineCount = (OfInt) LAYOUT.select(PATH$maxPipelineCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$initialPipeline = LAYOUT$initialPipeline.byteSize();
    public static final long SIZE$maxPipelineCount = LAYOUT$maxPipelineCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$initialPipeline = LAYOUT.byteOffset(PATH$initialPipeline);
    public static final long OFFSET$maxPipelineCount = LAYOUT.byteOffset(PATH$maxPipelineCount);
}

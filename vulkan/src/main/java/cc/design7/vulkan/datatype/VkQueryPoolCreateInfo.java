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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryPoolCreateInfo.html"><code>VkQueryPoolCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkQueryPoolCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkQueryPoolCreateFlags flags; // optional
///     VkQueryType queryType;
///     uint32_t queryCount;
///     VkQueryPipelineStatisticFlags pipelineStatistics; // optional
/// } VkQueryPoolCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO`
///
/// The {@link VkQueryPoolCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkQueryPoolCreateInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryPoolCreateInfo.html"><code>VkQueryPoolCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkQueryPoolCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkQueryPoolCreateInfo allocate(Arena arena) {
        VkQueryPoolCreateInfo ret = new VkQueryPoolCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.QUERY_POOL_CREATE_INFO);
        return ret;
    }

    public static VkQueryPoolCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueryPoolCreateInfo[] ret = new VkQueryPoolCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkQueryPoolCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.QUERY_POOL_CREATE_INFO);
        }
        return ret;
    }

    public static VkQueryPoolCreateInfo clone(Arena arena, VkQueryPoolCreateInfo src) {
        VkQueryPoolCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueryPoolCreateInfo[] clone(Arena arena, VkQueryPoolCreateInfo[] src) {
        VkQueryPoolCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.QUERY_POOL_CREATE_INFO);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkQueryPoolCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkQueryPoolCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkQueryType.class) int queryType() {
        return segment.get(LAYOUT$queryType, OFFSET$queryType);
    }

    public void queryType(@enumtype(VkQueryType.class) int value) {
        segment.set(LAYOUT$queryType, OFFSET$queryType, value);
    }

    public @unsigned int queryCount() {
        return segment.get(LAYOUT$queryCount, OFFSET$queryCount);
    }

    public void queryCount(@unsigned int value) {
        segment.set(LAYOUT$queryCount, OFFSET$queryCount, value);
    }

    public @enumtype(VkQueryPipelineStatisticFlags.class) int pipelineStatistics() {
        return segment.get(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics);
    }

    public void pipelineStatistics(@enumtype(VkQueryPipelineStatisticFlags.class) int value) {
        segment.set(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queryType"),
        ValueLayout.JAVA_INT.withName("queryCount"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$queryType = PathElement.groupElement("PATH$queryType");
    public static final PathElement PATH$queryCount = PathElement.groupElement("PATH$queryCount");
    public static final PathElement PATH$pipelineStatistics = PathElement.groupElement("PATH$pipelineStatistics");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$queryType = (OfInt) LAYOUT.select(PATH$queryType);
    public static final OfInt LAYOUT$queryCount = (OfInt) LAYOUT.select(PATH$queryCount);
    public static final OfInt LAYOUT$pipelineStatistics = (OfInt) LAYOUT.select(PATH$pipelineStatistics);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$queryType = LAYOUT$queryType.byteSize();
    public static final long SIZE$queryCount = LAYOUT$queryCount.byteSize();
    public static final long SIZE$pipelineStatistics = LAYOUT$pipelineStatistics.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$queryType = LAYOUT.byteOffset(PATH$queryType);
    public static final long OFFSET$queryCount = LAYOUT.byteOffset(PATH$queryCount);
    public static final long OFFSET$pipelineStatistics = LAYOUT.byteOffset(PATH$pipelineStatistics);
}

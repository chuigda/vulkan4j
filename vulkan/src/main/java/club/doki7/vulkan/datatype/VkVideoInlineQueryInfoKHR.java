package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoInlineQueryInfoKHR.html"><code>VkVideoInlineQueryInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoInlineQueryInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkQueryPool queryPool; // optional // @link substring="VkQueryPool" target="VkQueryPool" @link substring="queryPool" target="#queryPool"
///     uint32_t firstQuery; // @link substring="firstQuery" target="#firstQuery"
///     uint32_t queryCount; // @link substring="queryCount" target="#queryCount"
/// } VkVideoInlineQueryInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoInlineQueryInfoKHR#allocate(Arena)}, {@link VkVideoInlineQueryInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoInlineQueryInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoInlineQueryInfoKHR.html"><code>VkVideoInlineQueryInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoInlineQueryInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoInlineQueryInfoKHR allocate(Arena arena) {
        VkVideoInlineQueryInfoKHR ret = new VkVideoInlineQueryInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_INLINE_QUERY_INFO_KHR);
        return ret;
    }

    public static VkVideoInlineQueryInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoInlineQueryInfoKHR[] ret = new VkVideoInlineQueryInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoInlineQueryInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_INLINE_QUERY_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoInlineQueryInfoKHR clone(Arena arena, VkVideoInlineQueryInfoKHR src) {
        VkVideoInlineQueryInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoInlineQueryInfoKHR[] clone(Arena arena, VkVideoInlineQueryInfoKHR[] src) {
        VkVideoInlineQueryInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_INLINE_QUERY_INFO_KHR);
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

    public @Nullable VkQueryPool queryPool() {
        MemorySegment s = segment.asSlice(OFFSET$queryPool, SIZE$queryPool);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkQueryPool(s);
    }

    public void queryPool(@Nullable VkQueryPool value) {
        segment.set(LAYOUT$queryPool, OFFSET$queryPool, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int firstQuery() {
        return segment.get(LAYOUT$firstQuery, OFFSET$firstQuery);
    }

    public void firstQuery(@unsigned int value) {
        segment.set(LAYOUT$firstQuery, OFFSET$firstQuery, value);
    }

    public @unsigned int queryCount() {
        return segment.get(LAYOUT$queryCount, OFFSET$queryCount);
    }

    public void queryCount(@unsigned int value) {
        segment.set(LAYOUT$queryCount, OFFSET$queryCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("queryPool"),
        ValueLayout.JAVA_INT.withName("firstQuery"),
        ValueLayout.JAVA_INT.withName("queryCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$queryPool = PathElement.groupElement("PATH$queryPool");
    public static final PathElement PATH$firstQuery = PathElement.groupElement("PATH$firstQuery");
    public static final PathElement PATH$queryCount = PathElement.groupElement("PATH$queryCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$queryPool = (AddressLayout) LAYOUT.select(PATH$queryPool);
    public static final OfInt LAYOUT$firstQuery = (OfInt) LAYOUT.select(PATH$firstQuery);
    public static final OfInt LAYOUT$queryCount = (OfInt) LAYOUT.select(PATH$queryCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queryPool = LAYOUT$queryPool.byteSize();
    public static final long SIZE$firstQuery = LAYOUT$firstQuery.byteSize();
    public static final long SIZE$queryCount = LAYOUT$queryCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queryPool = LAYOUT.byteOffset(PATH$queryPool);
    public static final long OFFSET$firstQuery = LAYOUT.byteOffset(PATH$firstQuery);
    public static final long OFFSET$queryCount = LAYOUT.byteOffset(PATH$queryCount);
}

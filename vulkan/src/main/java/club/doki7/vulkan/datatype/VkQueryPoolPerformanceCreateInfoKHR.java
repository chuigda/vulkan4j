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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryPoolPerformanceCreateInfoKHR.html"><code>VkQueryPoolPerformanceCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkQueryPoolPerformanceCreateInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t queueFamilyIndex;
///     uint32_t counterIndexCount;
///     uint32_t const* pCounterIndices;
/// } VkQueryPoolPerformanceCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR`
///
/// The {@link VkQueryPoolPerformanceCreateInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkQueryPoolPerformanceCreateInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryPoolPerformanceCreateInfoKHR.html"><code>VkQueryPoolPerformanceCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkQueryPoolPerformanceCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkQueryPoolPerformanceCreateInfoKHR allocate(Arena arena) {
        VkQueryPoolPerformanceCreateInfoKHR ret = new VkQueryPoolPerformanceCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR);
        return ret;
    }

    public static VkQueryPoolPerformanceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueryPoolPerformanceCreateInfoKHR[] ret = new VkQueryPoolPerformanceCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkQueryPoolPerformanceCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkQueryPoolPerformanceCreateInfoKHR clone(Arena arena, VkQueryPoolPerformanceCreateInfoKHR src) {
        VkQueryPoolPerformanceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueryPoolPerformanceCreateInfoKHR[] clone(Arena arena, VkQueryPoolPerformanceCreateInfoKHR[] src) {
        VkQueryPoolPerformanceCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR);
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

    public @unsigned int queueFamilyIndex() {
        return segment.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);
    }

    public void queueFamilyIndex(@unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);
    }

    public @unsigned int counterIndexCount() {
        return segment.get(LAYOUT$counterIndexCount, OFFSET$counterIndexCount);
    }

    public void counterIndexCount(@unsigned int value) {
        segment.set(LAYOUT$counterIndexCount, OFFSET$counterIndexCount, value);
    }

    public @pointer(comment="int*") MemorySegment pCounterIndicesRaw() {
        return segment.get(LAYOUT$pCounterIndices, OFFSET$pCounterIndices);
    }

    public void pCounterIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pCounterIndices, OFFSET$pCounterIndices, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pCounterIndices() {
        MemorySegment s = pCounterIndicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCounterIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCounterIndicesRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("counterIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCounterIndices")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$queueFamilyIndex = PathElement.groupElement("PATH$queueFamilyIndex");
    public static final PathElement PATH$counterIndexCount = PathElement.groupElement("PATH$counterIndexCount");
    public static final PathElement PATH$pCounterIndices = PathElement.groupElement("PATH$pCounterIndices");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$queueFamilyIndex = (OfInt) LAYOUT.select(PATH$queueFamilyIndex);
    public static final OfInt LAYOUT$counterIndexCount = (OfInt) LAYOUT.select(PATH$counterIndexCount);
    public static final AddressLayout LAYOUT$pCounterIndices = (AddressLayout) LAYOUT.select(PATH$pCounterIndices);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queueFamilyIndex = LAYOUT$queueFamilyIndex.byteSize();
    public static final long SIZE$counterIndexCount = LAYOUT$counterIndexCount.byteSize();
    public static final long SIZE$pCounterIndices = LAYOUT$pCounterIndices.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queueFamilyIndex = LAYOUT.byteOffset(PATH$queueFamilyIndex);
    public static final long OFFSET$counterIndexCount = LAYOUT.byteOffset(PATH$counterIndexCount);
    public static final long OFFSET$pCounterIndices = LAYOUT.byteOffset(PATH$pCounterIndices);
}

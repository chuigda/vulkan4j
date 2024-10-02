package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR;

/// {@snippet lang=c :
/// typedef struct VkQueryPoolPerformanceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t queueFamilyIndex;
///     uint32_t counterIndexCount;
///     const uint32_t* pCounterIndices;
/// } VkQueryPoolPerformanceCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkQueryPoolPerformanceCreateInfoKHR.html">VkQueryPoolPerformanceCreateInfoKHR</a>
public record VkQueryPoolPerformanceCreateInfoKHR(MemorySegment segment) implements IPointer {
    public VkQueryPoolPerformanceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR);
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

    public @pointer(comment="uint32_t*") MemorySegment pCounterIndicesRaw() {
        return segment.get(LAYOUT$pCounterIndices, OFFSET$pCounterIndices);
    }

    public void pCounterIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pCounterIndices, OFFSET$pCounterIndices, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pCounterIndices() {
        MemorySegment s = pCounterIndicesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pCounterIndices(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCounterIndicesRaw(s);
    }

    public static VkQueryPoolPerformanceCreateInfoKHR allocate(Arena arena) {
        return new VkQueryPoolPerformanceCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkQueryPoolPerformanceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueryPoolPerformanceCreateInfoKHR[] ret = new VkQueryPoolPerformanceCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkQueryPoolPerformanceCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("counterIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCounterIndices")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$queueFamilyIndex = PathElement.groupElement("queueFamilyIndex");
    public static final PathElement PATH$counterIndexCount = PathElement.groupElement("counterIndexCount");
    public static final PathElement PATH$pCounterIndices = PathElement.groupElement("pCounterIndices");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$queueFamilyIndex = (OfInt) LAYOUT.select(PATH$queueFamilyIndex);
    public static final OfInt LAYOUT$counterIndexCount = (OfInt) LAYOUT.select(PATH$counterIndexCount);
    public static final AddressLayout LAYOUT$pCounterIndices = (AddressLayout) LAYOUT.select(PATH$pCounterIndices);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queueFamilyIndex = LAYOUT.byteOffset(PATH$queueFamilyIndex);
    public static final long OFFSET$counterIndexCount = LAYOUT.byteOffset(PATH$counterIndexCount);
    public static final long OFFSET$pCounterIndices = LAYOUT.byteOffset(PATH$pCounterIndices);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queueFamilyIndex = LAYOUT$queueFamilyIndex.byteSize();
    public static final long SIZE$counterIndexCount = LAYOUT$counterIndexCount.byteSize();
    public static final long SIZE$pCounterIndices = LAYOUT$pCounterIndices.byteSize();
}

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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryPoolPerformanceCreateInfoKHR.html">VkQueryPoolPerformanceCreateInfoKHR</a>
@ValueBasedCandidate
public record VkQueryPoolPerformanceCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$queueFamilyIndex = ValueLayout.JAVA_INT.withName("queueFamilyIndex");
    public static final OfInt LAYOUT$counterIndexCount = ValueLayout.JAVA_INT.withName("counterIndexCount");
    public static final AddressLayout LAYOUT$pCounterIndices = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCounterIndices");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$queueFamilyIndex, LAYOUT$counterIndexCount, LAYOUT$pCounterIndices);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkQueryPoolPerformanceCreateInfoKHR allocate(Arena arena) {
        return new VkQueryPoolPerformanceCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkQueryPoolPerformanceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueryPoolPerformanceCreateInfoKHR[] ret = new VkQueryPoolPerformanceCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$queueFamilyIndex = PathElement.groupElement("PATH$queueFamilyIndex");
    public static final PathElement PATH$counterIndexCount = PathElement.groupElement("PATH$counterIndexCount");
    public static final PathElement PATH$pCounterIndices = PathElement.groupElement("PATH$pCounterIndices");

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
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCounterIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCounterIndicesRaw(s);
    }

}

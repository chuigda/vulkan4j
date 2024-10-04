package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV;

/// {@snippet lang=c :
/// typedef struct VkGetLatencyMarkerInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t timingCount;
///     VkLatencyTimingsFrameReportNV* pTimings;
/// } VkGetLatencyMarkerInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkGetLatencyMarkerInfoNV.html">VkGetLatencyMarkerInfoNV</a>
public record VkGetLatencyMarkerInfoNV(MemorySegment segment) implements IPointer {
    public VkGetLatencyMarkerInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int timingCount() {
        return segment.get(LAYOUT$timingCount, OFFSET$timingCount);
    }

    public void timingCount(@unsigned int value) {
        segment.set(LAYOUT$timingCount, OFFSET$timingCount, value);
    }

    public @pointer(comment="VkLatencyTimingsFrameReportNV*") MemorySegment pTimingsRaw() {
        return segment.get(LAYOUT$pTimings, OFFSET$pTimings);
    }

    public void pTimingsRaw(@pointer(comment="VkLatencyTimingsFrameReportNV*") MemorySegment value) {
        segment.set(LAYOUT$pTimings, OFFSET$pTimings, value);
    }

    public @nullable VkLatencyTimingsFrameReportNV pTimings() {
        MemorySegment s = pTimingsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkLatencyTimingsFrameReportNV(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkLatencyTimingsFrameReportNV[] pTimings(int assumedCount) {
        MemorySegment s = pTimingsRaw().reinterpret(assumedCount * VkLatencyTimingsFrameReportNV.SIZE);
        VkLatencyTimingsFrameReportNV[] arr = new VkLatencyTimingsFrameReportNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkLatencyTimingsFrameReportNV(s.asSlice(i * VkLatencyTimingsFrameReportNV.SIZE, VkLatencyTimingsFrameReportNV.SIZE));
        }
        return arr;
    }

    public void pTimings(@nullable VkLatencyTimingsFrameReportNV value) {
        pTimingsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkGetLatencyMarkerInfoNV allocate(Arena arena) {
        return new VkGetLatencyMarkerInfoNV(arena.allocate(LAYOUT));
    }

    public static VkGetLatencyMarkerInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGetLatencyMarkerInfoNV[] ret = new VkGetLatencyMarkerInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkGetLatencyMarkerInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkGetLatencyMarkerInfoNV clone(Arena arena, VkGetLatencyMarkerInfoNV src) {
        VkGetLatencyMarkerInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGetLatencyMarkerInfoNV[] clone(Arena arena, VkGetLatencyMarkerInfoNV[] src) {
        VkGetLatencyMarkerInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timingCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkLatencyTimingsFrameReportNV.LAYOUT).withName("pTimings")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$timingCount = PathElement.groupElement("timingCount");
    public static final PathElement PATH$pTimings = PathElement.groupElement("pTimings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$timingCount = (OfInt) LAYOUT.select(PATH$timingCount);
    public static final AddressLayout LAYOUT$pTimings = (AddressLayout) LAYOUT.select(PATH$pTimings);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$timingCount = LAYOUT.byteOffset(PATH$timingCount);
    public static final long OFFSET$pTimings = LAYOUT.byteOffset(PATH$pTimings);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$timingCount = LAYOUT$timingCount.byteSize();
    public static final long SIZE$pTimings = LAYOUT$pTimings.byteSize();
}

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

/// Represents a pointer to a {@code VkGetLatencyMarkerInfoNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGetLatencyMarkerInfoNV.html">VkGetLatencyMarkerInfoNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGetLatencyMarkerInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public VkGetLatencyMarkerInfoNV {
        sType(VkStructureType.GET_LATENCY_MARKER_INFO_NV);
    }

    public static VkGetLatencyMarkerInfoNV allocate(Arena arena) {
        return new VkGetLatencyMarkerInfoNV(arena.allocate(LAYOUT));
    }

    public static VkGetLatencyMarkerInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGetLatencyMarkerInfoNV[] ret = new VkGetLatencyMarkerInfoNV[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timingCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkLatencyTimingsFrameReportNV.LAYOUT).withName("pTimings")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$timingCount = PathElement.groupElement("PATH$timingCount");
    public static final PathElement PATH$pTimings = PathElement.groupElement("PATH$pTimings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$timingCount = (OfInt) LAYOUT.select(PATH$timingCount);
    public static final AddressLayout LAYOUT$pTimings = (AddressLayout) LAYOUT.select(PATH$pTimings);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$timingCount = LAYOUT$timingCount.byteSize();
    public static final long SIZE$pTimings = LAYOUT$pTimings.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$timingCount = LAYOUT.byteOffset(PATH$timingCount);
    public static final long OFFSET$pTimings = LAYOUT.byteOffset(PATH$pTimings);

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

    public @Nullable VkLatencyTimingsFrameReportNV pTimings() {
        MemorySegment s = pTimingsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkLatencyTimingsFrameReportNV(s);
    }

    public void pTimings(@Nullable VkLatencyTimingsFrameReportNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTimingsRaw(s);
    }

    @unsafe public @Nullable VkLatencyTimingsFrameReportNV[] pTimings(int assumedCount) {
        MemorySegment s = pTimingsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkLatencyTimingsFrameReportNV.SIZE);
        VkLatencyTimingsFrameReportNV[] ret = new VkLatencyTimingsFrameReportNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkLatencyTimingsFrameReportNV(s.asSlice(i * VkLatencyTimingsFrameReportNV.SIZE, VkLatencyTimingsFrameReportNV.SIZE));
        }
        return ret;
    }

}

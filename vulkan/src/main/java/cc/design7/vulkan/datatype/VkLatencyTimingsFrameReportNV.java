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

public record VkLatencyTimingsFrameReportNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$presentID = ValueLayout.JAVA_LONG.withName("presentID");
    public static final OfLong LAYOUT$inputSampleTimeUs = ValueLayout.JAVA_LONG.withName("inputSampleTimeUs");
    public static final OfLong LAYOUT$simStartTimeUs = ValueLayout.JAVA_LONG.withName("simStartTimeUs");
    public static final OfLong LAYOUT$simEndTimeUs = ValueLayout.JAVA_LONG.withName("simEndTimeUs");
    public static final OfLong LAYOUT$renderSubmitStartTimeUs = ValueLayout.JAVA_LONG.withName("renderSubmitStartTimeUs");
    public static final OfLong LAYOUT$renderSubmitEndTimeUs = ValueLayout.JAVA_LONG.withName("renderSubmitEndTimeUs");
    public static final OfLong LAYOUT$presentStartTimeUs = ValueLayout.JAVA_LONG.withName("presentStartTimeUs");
    public static final OfLong LAYOUT$presentEndTimeUs = ValueLayout.JAVA_LONG.withName("presentEndTimeUs");
    public static final OfLong LAYOUT$driverStartTimeUs = ValueLayout.JAVA_LONG.withName("driverStartTimeUs");
    public static final OfLong LAYOUT$driverEndTimeUs = ValueLayout.JAVA_LONG.withName("driverEndTimeUs");
    public static final OfLong LAYOUT$osRenderQueueStartTimeUs = ValueLayout.JAVA_LONG.withName("osRenderQueueStartTimeUs");
    public static final OfLong LAYOUT$osRenderQueueEndTimeUs = ValueLayout.JAVA_LONG.withName("osRenderQueueEndTimeUs");
    public static final OfLong LAYOUT$gpuRenderStartTimeUs = ValueLayout.JAVA_LONG.withName("gpuRenderStartTimeUs");
    public static final OfLong LAYOUT$gpuRenderEndTimeUs = ValueLayout.JAVA_LONG.withName("gpuRenderEndTimeUs");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$presentID, LAYOUT$inputSampleTimeUs, LAYOUT$simStartTimeUs, LAYOUT$simEndTimeUs, LAYOUT$renderSubmitStartTimeUs, LAYOUT$renderSubmitEndTimeUs, LAYOUT$presentStartTimeUs, LAYOUT$presentEndTimeUs, LAYOUT$driverStartTimeUs, LAYOUT$driverEndTimeUs, LAYOUT$osRenderQueueStartTimeUs, LAYOUT$osRenderQueueEndTimeUs, LAYOUT$gpuRenderStartTimeUs, LAYOUT$gpuRenderEndTimeUs);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkLatencyTimingsFrameReportNV allocate(Arena arena) {
        return new VkLatencyTimingsFrameReportNV(arena.allocate(LAYOUT));
    }

    public static VkLatencyTimingsFrameReportNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLatencyTimingsFrameReportNV[] ret = new VkLatencyTimingsFrameReportNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkLatencyTimingsFrameReportNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkLatencyTimingsFrameReportNV clone(Arena arena, VkLatencyTimingsFrameReportNV src) {
        VkLatencyTimingsFrameReportNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkLatencyTimingsFrameReportNV[] clone(Arena arena, VkLatencyTimingsFrameReportNV[] src) {
        VkLatencyTimingsFrameReportNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$presentID = PathElement.groupElement("PATH$presentID");
    public static final PathElement PATH$inputSampleTimeUs = PathElement.groupElement("PATH$inputSampleTimeUs");
    public static final PathElement PATH$simStartTimeUs = PathElement.groupElement("PATH$simStartTimeUs");
    public static final PathElement PATH$simEndTimeUs = PathElement.groupElement("PATH$simEndTimeUs");
    public static final PathElement PATH$renderSubmitStartTimeUs = PathElement.groupElement("PATH$renderSubmitStartTimeUs");
    public static final PathElement PATH$renderSubmitEndTimeUs = PathElement.groupElement("PATH$renderSubmitEndTimeUs");
    public static final PathElement PATH$presentStartTimeUs = PathElement.groupElement("PATH$presentStartTimeUs");
    public static final PathElement PATH$presentEndTimeUs = PathElement.groupElement("PATH$presentEndTimeUs");
    public static final PathElement PATH$driverStartTimeUs = PathElement.groupElement("PATH$driverStartTimeUs");
    public static final PathElement PATH$driverEndTimeUs = PathElement.groupElement("PATH$driverEndTimeUs");
    public static final PathElement PATH$osRenderQueueStartTimeUs = PathElement.groupElement("PATH$osRenderQueueStartTimeUs");
    public static final PathElement PATH$osRenderQueueEndTimeUs = PathElement.groupElement("PATH$osRenderQueueEndTimeUs");
    public static final PathElement PATH$gpuRenderStartTimeUs = PathElement.groupElement("PATH$gpuRenderStartTimeUs");
    public static final PathElement PATH$gpuRenderEndTimeUs = PathElement.groupElement("PATH$gpuRenderEndTimeUs");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$presentID = LAYOUT$presentID.byteSize();
    public static final long SIZE$inputSampleTimeUs = LAYOUT$inputSampleTimeUs.byteSize();
    public static final long SIZE$simStartTimeUs = LAYOUT$simStartTimeUs.byteSize();
    public static final long SIZE$simEndTimeUs = LAYOUT$simEndTimeUs.byteSize();
    public static final long SIZE$renderSubmitStartTimeUs = LAYOUT$renderSubmitStartTimeUs.byteSize();
    public static final long SIZE$renderSubmitEndTimeUs = LAYOUT$renderSubmitEndTimeUs.byteSize();
    public static final long SIZE$presentStartTimeUs = LAYOUT$presentStartTimeUs.byteSize();
    public static final long SIZE$presentEndTimeUs = LAYOUT$presentEndTimeUs.byteSize();
    public static final long SIZE$driverStartTimeUs = LAYOUT$driverStartTimeUs.byteSize();
    public static final long SIZE$driverEndTimeUs = LAYOUT$driverEndTimeUs.byteSize();
    public static final long SIZE$osRenderQueueStartTimeUs = LAYOUT$osRenderQueueStartTimeUs.byteSize();
    public static final long SIZE$osRenderQueueEndTimeUs = LAYOUT$osRenderQueueEndTimeUs.byteSize();
    public static final long SIZE$gpuRenderStartTimeUs = LAYOUT$gpuRenderStartTimeUs.byteSize();
    public static final long SIZE$gpuRenderEndTimeUs = LAYOUT$gpuRenderEndTimeUs.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentID = LAYOUT.byteOffset(PATH$presentID);
    public static final long OFFSET$inputSampleTimeUs = LAYOUT.byteOffset(PATH$inputSampleTimeUs);
    public static final long OFFSET$simStartTimeUs = LAYOUT.byteOffset(PATH$simStartTimeUs);
    public static final long OFFSET$simEndTimeUs = LAYOUT.byteOffset(PATH$simEndTimeUs);
    public static final long OFFSET$renderSubmitStartTimeUs = LAYOUT.byteOffset(PATH$renderSubmitStartTimeUs);
    public static final long OFFSET$renderSubmitEndTimeUs = LAYOUT.byteOffset(PATH$renderSubmitEndTimeUs);
    public static final long OFFSET$presentStartTimeUs = LAYOUT.byteOffset(PATH$presentStartTimeUs);
    public static final long OFFSET$presentEndTimeUs = LAYOUT.byteOffset(PATH$presentEndTimeUs);
    public static final long OFFSET$driverStartTimeUs = LAYOUT.byteOffset(PATH$driverStartTimeUs);
    public static final long OFFSET$driverEndTimeUs = LAYOUT.byteOffset(PATH$driverEndTimeUs);
    public static final long OFFSET$osRenderQueueStartTimeUs = LAYOUT.byteOffset(PATH$osRenderQueueStartTimeUs);
    public static final long OFFSET$osRenderQueueEndTimeUs = LAYOUT.byteOffset(PATH$osRenderQueueEndTimeUs);
    public static final long OFFSET$gpuRenderStartTimeUs = LAYOUT.byteOffset(PATH$gpuRenderStartTimeUs);
    public static final long OFFSET$gpuRenderEndTimeUs = LAYOUT.byteOffset(PATH$gpuRenderEndTimeUs);

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

    public @unsigned long presentID() {
        return segment.get(LAYOUT$presentID, OFFSET$presentID);
    }

    public void presentID(@unsigned long value) {
        segment.set(LAYOUT$presentID, OFFSET$presentID, value);
    }

    public @unsigned long inputSampleTimeUs() {
        return segment.get(LAYOUT$inputSampleTimeUs, OFFSET$inputSampleTimeUs);
    }

    public void inputSampleTimeUs(@unsigned long value) {
        segment.set(LAYOUT$inputSampleTimeUs, OFFSET$inputSampleTimeUs, value);
    }

    public @unsigned long simStartTimeUs() {
        return segment.get(LAYOUT$simStartTimeUs, OFFSET$simStartTimeUs);
    }

    public void simStartTimeUs(@unsigned long value) {
        segment.set(LAYOUT$simStartTimeUs, OFFSET$simStartTimeUs, value);
    }

    public @unsigned long simEndTimeUs() {
        return segment.get(LAYOUT$simEndTimeUs, OFFSET$simEndTimeUs);
    }

    public void simEndTimeUs(@unsigned long value) {
        segment.set(LAYOUT$simEndTimeUs, OFFSET$simEndTimeUs, value);
    }

    public @unsigned long renderSubmitStartTimeUs() {
        return segment.get(LAYOUT$renderSubmitStartTimeUs, OFFSET$renderSubmitStartTimeUs);
    }

    public void renderSubmitStartTimeUs(@unsigned long value) {
        segment.set(LAYOUT$renderSubmitStartTimeUs, OFFSET$renderSubmitStartTimeUs, value);
    }

    public @unsigned long renderSubmitEndTimeUs() {
        return segment.get(LAYOUT$renderSubmitEndTimeUs, OFFSET$renderSubmitEndTimeUs);
    }

    public void renderSubmitEndTimeUs(@unsigned long value) {
        segment.set(LAYOUT$renderSubmitEndTimeUs, OFFSET$renderSubmitEndTimeUs, value);
    }

    public @unsigned long presentStartTimeUs() {
        return segment.get(LAYOUT$presentStartTimeUs, OFFSET$presentStartTimeUs);
    }

    public void presentStartTimeUs(@unsigned long value) {
        segment.set(LAYOUT$presentStartTimeUs, OFFSET$presentStartTimeUs, value);
    }

    public @unsigned long presentEndTimeUs() {
        return segment.get(LAYOUT$presentEndTimeUs, OFFSET$presentEndTimeUs);
    }

    public void presentEndTimeUs(@unsigned long value) {
        segment.set(LAYOUT$presentEndTimeUs, OFFSET$presentEndTimeUs, value);
    }

    public @unsigned long driverStartTimeUs() {
        return segment.get(LAYOUT$driverStartTimeUs, OFFSET$driverStartTimeUs);
    }

    public void driverStartTimeUs(@unsigned long value) {
        segment.set(LAYOUT$driverStartTimeUs, OFFSET$driverStartTimeUs, value);
    }

    public @unsigned long driverEndTimeUs() {
        return segment.get(LAYOUT$driverEndTimeUs, OFFSET$driverEndTimeUs);
    }

    public void driverEndTimeUs(@unsigned long value) {
        segment.set(LAYOUT$driverEndTimeUs, OFFSET$driverEndTimeUs, value);
    }

    public @unsigned long osRenderQueueStartTimeUs() {
        return segment.get(LAYOUT$osRenderQueueStartTimeUs, OFFSET$osRenderQueueStartTimeUs);
    }

    public void osRenderQueueStartTimeUs(@unsigned long value) {
        segment.set(LAYOUT$osRenderQueueStartTimeUs, OFFSET$osRenderQueueStartTimeUs, value);
    }

    public @unsigned long osRenderQueueEndTimeUs() {
        return segment.get(LAYOUT$osRenderQueueEndTimeUs, OFFSET$osRenderQueueEndTimeUs);
    }

    public void osRenderQueueEndTimeUs(@unsigned long value) {
        segment.set(LAYOUT$osRenderQueueEndTimeUs, OFFSET$osRenderQueueEndTimeUs, value);
    }

    public @unsigned long gpuRenderStartTimeUs() {
        return segment.get(LAYOUT$gpuRenderStartTimeUs, OFFSET$gpuRenderStartTimeUs);
    }

    public void gpuRenderStartTimeUs(@unsigned long value) {
        segment.set(LAYOUT$gpuRenderStartTimeUs, OFFSET$gpuRenderStartTimeUs, value);
    }

    public @unsigned long gpuRenderEndTimeUs() {
        return segment.get(LAYOUT$gpuRenderEndTimeUs, OFFSET$gpuRenderEndTimeUs);
    }

    public void gpuRenderEndTimeUs(@unsigned long value) {
        segment.set(LAYOUT$gpuRenderEndTimeUs, OFFSET$gpuRenderEndTimeUs, value);
    }

}
/// dummy, not implemented yet

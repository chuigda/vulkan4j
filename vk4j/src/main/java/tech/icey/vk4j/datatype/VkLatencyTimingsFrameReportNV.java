package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkLatencyTimingsFrameReportNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("inputSampleTimeUs"),
        ValueLayout.JAVA_LONG.withName("simStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("simEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("renderSubmitStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("renderSubmitEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("presentStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("presentEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("driverStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("driverEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("osRenderQueueStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("osRenderQueueEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("gpuRenderStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("gpuRenderEndTimeUs")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$presentID = PathElement.groupElement("presentID");
    public static final PathElement PATH$inputSampleTimeUs = PathElement.groupElement("inputSampleTimeUs");
    public static final PathElement PATH$simStartTimeUs = PathElement.groupElement("simStartTimeUs");
    public static final PathElement PATH$simEndTimeUs = PathElement.groupElement("simEndTimeUs");
    public static final PathElement PATH$renderSubmitStartTimeUs = PathElement.groupElement("renderSubmitStartTimeUs");
    public static final PathElement PATH$renderSubmitEndTimeUs = PathElement.groupElement("renderSubmitEndTimeUs");
    public static final PathElement PATH$presentStartTimeUs = PathElement.groupElement("presentStartTimeUs");
    public static final PathElement PATH$presentEndTimeUs = PathElement.groupElement("presentEndTimeUs");
    public static final PathElement PATH$driverStartTimeUs = PathElement.groupElement("driverStartTimeUs");
    public static final PathElement PATH$driverEndTimeUs = PathElement.groupElement("driverEndTimeUs");
    public static final PathElement PATH$osRenderQueueStartTimeUs = PathElement.groupElement("osRenderQueueStartTimeUs");
    public static final PathElement PATH$osRenderQueueEndTimeUs = PathElement.groupElement("osRenderQueueEndTimeUs");
    public static final PathElement PATH$gpuRenderStartTimeUs = PathElement.groupElement("gpuRenderStartTimeUs");
    public static final PathElement PATH$gpuRenderEndTimeUs = PathElement.groupElement("gpuRenderEndTimeUs");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$presentID = (OfLong) LAYOUT.select(PATH$presentID);
    public static final OfLong LAYOUT$inputSampleTimeUs = (OfLong) LAYOUT.select(PATH$inputSampleTimeUs);
    public static final OfLong LAYOUT$simStartTimeUs = (OfLong) LAYOUT.select(PATH$simStartTimeUs);
    public static final OfLong LAYOUT$simEndTimeUs = (OfLong) LAYOUT.select(PATH$simEndTimeUs);
    public static final OfLong LAYOUT$renderSubmitStartTimeUs = (OfLong) LAYOUT.select(PATH$renderSubmitStartTimeUs);
    public static final OfLong LAYOUT$renderSubmitEndTimeUs = (OfLong) LAYOUT.select(PATH$renderSubmitEndTimeUs);
    public static final OfLong LAYOUT$presentStartTimeUs = (OfLong) LAYOUT.select(PATH$presentStartTimeUs);
    public static final OfLong LAYOUT$presentEndTimeUs = (OfLong) LAYOUT.select(PATH$presentEndTimeUs);
    public static final OfLong LAYOUT$driverStartTimeUs = (OfLong) LAYOUT.select(PATH$driverStartTimeUs);
    public static final OfLong LAYOUT$driverEndTimeUs = (OfLong) LAYOUT.select(PATH$driverEndTimeUs);
    public static final OfLong LAYOUT$osRenderQueueStartTimeUs = (OfLong) LAYOUT.select(PATH$osRenderQueueStartTimeUs);
    public static final OfLong LAYOUT$osRenderQueueEndTimeUs = (OfLong) LAYOUT.select(PATH$osRenderQueueEndTimeUs);
    public static final OfLong LAYOUT$gpuRenderStartTimeUs = (OfLong) LAYOUT.select(PATH$gpuRenderStartTimeUs);
    public static final OfLong LAYOUT$gpuRenderEndTimeUs = (OfLong) LAYOUT.select(PATH$gpuRenderEndTimeUs);

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

    public VkLatencyTimingsFrameReportNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV);
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


    public static final class VkLatencyTimingsFrameReportNVFactory implements IFactory<VkLatencyTimingsFrameReportNV> {
        @Override
        public Class<VkLatencyTimingsFrameReportNV> clazz() {
            return VkLatencyTimingsFrameReportNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkLatencyTimingsFrameReportNV.LAYOUT;
        }

        @Override
        public VkLatencyTimingsFrameReportNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkLatencyTimingsFrameReportNV createUninit(MemorySegment segment) {
            return new VkLatencyTimingsFrameReportNV(segment);
        }
    }

    public static final VkLatencyTimingsFrameReportNVFactory FACTORY = new VkLatencyTimingsFrameReportNVFactory();
}

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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkGetLatencyMarkerInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timingCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkLatencyTimingsFrameReportNV.LAYOUT).withName("pTimings")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$timingCount = PathElement.groupElement(2);
    public static final PathElement PATH$pTimings = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$timingCount = (OfInt) LAYOUT.select(PATH$timingCount);
    public static final AddressLayout LAYOUT$pTimings = (AddressLayout) LAYOUT.select(PATH$pTimings);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$timingCount = LAYOUT.byteOffset(PATH$timingCount);
    public static final long OFFSET$pTimings = LAYOUT.byteOffset(PATH$pTimings);

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

    public void pTimings(@nullable VkLatencyTimingsFrameReportNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTimingsRaw(s);
    }


    public static final class VkGetLatencyMarkerInfoNVFactory implements IDataTypeFactory<VkGetLatencyMarkerInfoNV> {
        @Override
        public Class<VkGetLatencyMarkerInfoNV> clazz() {
            return VkGetLatencyMarkerInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkGetLatencyMarkerInfoNV.LAYOUT;
        }

        @Override
        public VkGetLatencyMarkerInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkGetLatencyMarkerInfoNV createUninit(MemorySegment segment) {
            return new VkGetLatencyMarkerInfoNV(segment);
        }
    }

    public static final VkGetLatencyMarkerInfoNVFactory FACTORY = new VkGetLatencyMarkerInfoNVFactory();
}

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

public record VkLatencySleepModeInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lowLatencyMode"),
        ValueLayout.JAVA_INT.withName("lowLatencyBoost"),
        ValueLayout.JAVA_INT.withName("minimumIntervalUs")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$lowLatencyMode = PathElement.groupElement(2);
    public static final PathElement PATH$lowLatencyBoost = PathElement.groupElement(3);
    public static final PathElement PATH$minimumIntervalUs = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$lowLatencyMode = (OfInt) LAYOUT.select(PATH$lowLatencyMode);
    public static final OfInt LAYOUT$lowLatencyBoost = (OfInt) LAYOUT.select(PATH$lowLatencyBoost);
    public static final OfInt LAYOUT$minimumIntervalUs = (OfInt) LAYOUT.select(PATH$minimumIntervalUs);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$lowLatencyMode = LAYOUT.byteOffset(PATH$lowLatencyMode);
    public static final long OFFSET$lowLatencyBoost = LAYOUT.byteOffset(PATH$lowLatencyBoost);
    public static final long OFFSET$minimumIntervalUs = LAYOUT.byteOffset(PATH$minimumIntervalUs);

    public VkLatencySleepModeInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV);
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

    public @unsigned int lowLatencyMode() {
        return segment.get(LAYOUT$lowLatencyMode, OFFSET$lowLatencyMode);
    }

    public void lowLatencyMode(@unsigned int value) {
        segment.set(LAYOUT$lowLatencyMode, OFFSET$lowLatencyMode, value);
    }

    public @unsigned int lowLatencyBoost() {
        return segment.get(LAYOUT$lowLatencyBoost, OFFSET$lowLatencyBoost);
    }

    public void lowLatencyBoost(@unsigned int value) {
        segment.set(LAYOUT$lowLatencyBoost, OFFSET$lowLatencyBoost, value);
    }

    public @unsigned int minimumIntervalUs() {
        return segment.get(LAYOUT$minimumIntervalUs, OFFSET$minimumIntervalUs);
    }

    public void minimumIntervalUs(@unsigned int value) {
        segment.set(LAYOUT$minimumIntervalUs, OFFSET$minimumIntervalUs, value);
    }


    public static final class VkLatencySleepModeInfoNVFactory implements IDataTypeFactory<VkLatencySleepModeInfoNV> {
        @Override
        public Class<VkLatencySleepModeInfoNV> clazz() {
            return VkLatencySleepModeInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkLatencySleepModeInfoNV.LAYOUT;
        }

        @Override
        public VkLatencySleepModeInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkLatencySleepModeInfoNV createUninit(MemorySegment segment) {
            return new VkLatencySleepModeInfoNV(segment);
        }
    }

    public static final VkLatencySleepModeInfoNVFactory FACTORY = new VkLatencySleepModeInfoNVFactory();
}
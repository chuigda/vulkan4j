package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkLatencySleepModeInfoNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lowLatencyMode"),
        ValueLayout.JAVA_INT.withName("lowLatencyBoost"),
        ValueLayout.JAVA_INT.withName("minimumIntervalUs")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$lowLatencyMode = PathElement.groupElement("lowLatencyMode");
    public static final PathElement PATH$lowLatencyBoost = PathElement.groupElement("lowLatencyBoost");
    public static final PathElement PATH$minimumIntervalUs = PathElement.groupElement("minimumIntervalUs");

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$lowLatencyMode = LAYOUT$lowLatencyMode.byteSize();
    public static final long SIZE$lowLatencyBoost = LAYOUT$lowLatencyBoost.byteSize();
    public static final long SIZE$minimumIntervalUs = LAYOUT$minimumIntervalUs.byteSize();

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

    public static VkLatencySleepModeInfoNV allocate(Arena arena) {
        return new VkLatencySleepModeInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkLatencySleepModeInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLatencySleepModeInfoNV[] ret = new VkLatencySleepModeInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkLatencySleepModeInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

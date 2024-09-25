package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSetLatencyMarkerInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentID"),
        ValueLayout.JAVA_INT.withName("marker")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$presentID = PathElement.groupElement("presentID");
    public static final PathElement PATH$marker = PathElement.groupElement("marker");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$presentID = (OfLong) LAYOUT.select(PATH$presentID);
    public static final OfInt LAYOUT$marker = (OfInt) LAYOUT.select(PATH$marker);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentID = LAYOUT.byteOffset(PATH$presentID);
    public static final long OFFSET$marker = LAYOUT.byteOffset(PATH$marker);

    public VkSetLatencyMarkerInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV);
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

    public @enumtype(VkLatencyMarkerNV.class) int marker() {
        return segment.get(LAYOUT$marker, OFFSET$marker);
    }

    public void marker(@enumtype(VkLatencyMarkerNV.class) int value) {
        segment.set(LAYOUT$marker, OFFSET$marker, value);
    }

    public static VkSetLatencyMarkerInfoNV allocate(Arena arena) {
        return new VkSetLatencyMarkerInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkSetLatencyMarkerInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSetLatencyMarkerInfoNV[] ret = new VkSetLatencyMarkerInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSetLatencyMarkerInfoNV(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

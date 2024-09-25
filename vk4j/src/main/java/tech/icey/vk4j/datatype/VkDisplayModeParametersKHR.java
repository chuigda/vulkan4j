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

public record VkDisplayModeParametersKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkExtent2D.LAYOUT.withName("visibleRegion"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );

    public static final PathElement PATH$visibleRegion = PathElement.groupElement("visibleRegion");
    public static final PathElement PATH$refreshRate = PathElement.groupElement("refreshRate");

    public static final StructLayout LAYOUT$visibleRegion = (StructLayout) LAYOUT.select(PATH$visibleRegion);
    public static final OfInt LAYOUT$refreshRate = (OfInt) LAYOUT.select(PATH$refreshRate);

    public static final long OFFSET$visibleRegion = LAYOUT.byteOffset(PATH$visibleRegion);
    public static final long OFFSET$refreshRate = LAYOUT.byteOffset(PATH$refreshRate);

    public VkDisplayModeParametersKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkExtent2D visibleRegion() {
        return new VkExtent2D(segment.asSlice(OFFSET$visibleRegion, LAYOUT$visibleRegion));
    }

    public void visibleRegion(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$visibleRegion, LAYOUT$visibleRegion.byteSize());
    }

    public @unsigned int refreshRate() {
        return segment.get(LAYOUT$refreshRate, OFFSET$refreshRate);
    }

    public void refreshRate(@unsigned int value) {
        segment.set(LAYOUT$refreshRate, OFFSET$refreshRate, value);
    }

    public static VkDisplayModeParametersKHR allocate(Arena arena) {
        return new VkDisplayModeParametersKHR(arena.allocate(LAYOUT));
    }
    
    public static VkDisplayModeParametersKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayModeParametersKHR[] ret = new VkDisplayModeParametersKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayModeParametersKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

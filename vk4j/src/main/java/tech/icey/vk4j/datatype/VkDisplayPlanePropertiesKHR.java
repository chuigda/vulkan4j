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

public record VkDisplayPlanePropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("currentDisplay"),
        ValueLayout.JAVA_INT.withName("currentStackIndex")
    );

    public static final PathElement PATH$currentDisplay = PathElement.groupElement("currentDisplay");
    public static final PathElement PATH$currentStackIndex = PathElement.groupElement("currentStackIndex");

    public static final AddressLayout LAYOUT$currentDisplay = (AddressLayout) LAYOUT.select(PATH$currentDisplay);
    public static final OfInt LAYOUT$currentStackIndex = (OfInt) LAYOUT.select(PATH$currentStackIndex);

    public static final long OFFSET$currentDisplay = LAYOUT.byteOffset(PATH$currentDisplay);
    public static final long OFFSET$currentStackIndex = LAYOUT.byteOffset(PATH$currentStackIndex);

    public VkDisplayPlanePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkDisplayKHR currentDisplay() {
        return new VkDisplayKHR(segment.get(LAYOUT$currentDisplay, OFFSET$currentDisplay));
    }

    public void currentDisplay(VkDisplayKHR value) {
        segment.set(LAYOUT$currentDisplay, OFFSET$currentDisplay, value.segment());
    }

    public @unsigned int currentStackIndex() {
        return segment.get(LAYOUT$currentStackIndex, OFFSET$currentStackIndex);
    }

    public void currentStackIndex(@unsigned int value) {
        segment.set(LAYOUT$currentStackIndex, OFFSET$currentStackIndex, value);
    }

    public static VkDisplayPlanePropertiesKHR allocate(Arena arena) {
        return new VkDisplayPlanePropertiesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkDisplayPlanePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPlanePropertiesKHR[] ret = new VkDisplayPlanePropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayPlanePropertiesKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

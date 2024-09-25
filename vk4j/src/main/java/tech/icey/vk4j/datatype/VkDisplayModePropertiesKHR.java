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

public record VkDisplayModePropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("displayMode"),
        VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );

    public static final PathElement PATH$displayMode = PathElement.groupElement("displayMode");
    public static final PathElement PATH$parameters = PathElement.groupElement("parameters");

    public static final AddressLayout LAYOUT$displayMode = (AddressLayout) LAYOUT.select(PATH$displayMode);
    public static final StructLayout LAYOUT$parameters = (StructLayout) LAYOUT.select(PATH$parameters);

    public static final long OFFSET$displayMode = LAYOUT.byteOffset(PATH$displayMode);
    public static final long OFFSET$parameters = LAYOUT.byteOffset(PATH$parameters);

    public VkDisplayModePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkDisplayModeKHR displayMode() {
        return new VkDisplayModeKHR(segment.get(LAYOUT$displayMode, OFFSET$displayMode));
    }

    public void displayMode(VkDisplayModeKHR value) {
        segment.set(LAYOUT$displayMode, OFFSET$displayMode, value.segment());
    }

    public VkDisplayModeParametersKHR parameters() {
        return new VkDisplayModeParametersKHR(segment.asSlice(OFFSET$parameters, LAYOUT$parameters));
    }

    public void parameters(VkDisplayModeParametersKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$parameters, LAYOUT$parameters.byteSize());
    }

    public static VkDisplayModePropertiesKHR allocate(Arena arena) {
        return new VkDisplayModePropertiesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkDisplayModePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayModePropertiesKHR[] ret = new VkDisplayModePropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayModePropertiesKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

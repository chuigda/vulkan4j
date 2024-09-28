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

public record VkViewportWScalingNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("xcoeff"),
        ValueLayout.JAVA_FLOAT.withName("ycoeff")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$xcoeff = PathElement.groupElement("xcoeff");
    public static final PathElement PATH$ycoeff = PathElement.groupElement("ycoeff");

    public static final OfFloat LAYOUT$xcoeff = (OfFloat) LAYOUT.select(PATH$xcoeff);
    public static final OfFloat LAYOUT$ycoeff = (OfFloat) LAYOUT.select(PATH$ycoeff);

    public static final long OFFSET$xcoeff = LAYOUT.byteOffset(PATH$xcoeff);
    public static final long OFFSET$ycoeff = LAYOUT.byteOffset(PATH$ycoeff);

    public static final long SIZE$xcoeff = LAYOUT$xcoeff.byteSize();
    public static final long SIZE$ycoeff = LAYOUT$ycoeff.byteSize();

    public VkViewportWScalingNV(MemorySegment segment) {
        this.segment = segment;
    }

    public float xcoeff() {
        return segment.get(LAYOUT$xcoeff, OFFSET$xcoeff);
    }

    public void xcoeff(float value) {
        segment.set(LAYOUT$xcoeff, OFFSET$xcoeff, value);
    }

    public float ycoeff() {
        return segment.get(LAYOUT$ycoeff, OFFSET$ycoeff);
    }

    public void ycoeff(float value) {
        segment.set(LAYOUT$ycoeff, OFFSET$ycoeff, value);
    }

    public static VkViewportWScalingNV allocate(Arena arena) {
        return new VkViewportWScalingNV(arena.allocate(LAYOUT));
    }
    
    public static VkViewportWScalingNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkViewportWScalingNV[] ret = new VkViewportWScalingNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkViewportWScalingNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

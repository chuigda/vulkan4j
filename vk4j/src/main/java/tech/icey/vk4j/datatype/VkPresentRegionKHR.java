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

public record VkPresentRegionKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("rectangleCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRectLayerKHR.LAYOUT).withName("pRectangles")
    );

    public static final PathElement PATH$rectangleCount = PathElement.groupElement("rectangleCount");
    public static final PathElement PATH$pRectangles = PathElement.groupElement("pRectangles");

    public static final OfInt LAYOUT$rectangleCount = (OfInt) LAYOUT.select(PATH$rectangleCount);
    public static final AddressLayout LAYOUT$pRectangles = (AddressLayout) LAYOUT.select(PATH$pRectangles);

    public static final long OFFSET$rectangleCount = LAYOUT.byteOffset(PATH$rectangleCount);
    public static final long OFFSET$pRectangles = LAYOUT.byteOffset(PATH$pRectangles);

    public VkPresentRegionKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int rectangleCount() {
        return segment.get(LAYOUT$rectangleCount, OFFSET$rectangleCount);
    }

    public void rectangleCount(@unsigned int value) {
        segment.set(LAYOUT$rectangleCount, OFFSET$rectangleCount, value);
    }

    public @pointer(comment="VkRectLayerKHR*") MemorySegment pRectanglesRaw() {
        return segment.get(LAYOUT$pRectangles, OFFSET$pRectangles);
    }

    public void pRectanglesRaw(@pointer(comment="VkRectLayerKHR*") MemorySegment value) {
        segment.set(LAYOUT$pRectangles, OFFSET$pRectangles, value);
    }
    
    public @nullable VkRectLayerKHR pRectangles() {
        MemorySegment s = pRectanglesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRectLayerKHR(s);
    }

    public void pRectangles(@nullable VkRectLayerKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRectanglesRaw(s);
    }

    public static VkPresentRegionKHR allocate(Arena arena) {
        return new VkPresentRegionKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPresentRegionKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentRegionKHR[] ret = new VkPresentRegionKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPresentRegionKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

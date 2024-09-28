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

public record VkRenderingAttachmentLocationInfoKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorAttachmentLocations")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("colorAttachmentCount");
    public static final PathElement PATH$pColorAttachmentLocations = PathElement.groupElement("pColorAttachmentLocations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachmentLocations = (AddressLayout) LAYOUT.select(PATH$pColorAttachmentLocations);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachmentLocations = LAYOUT.byteOffset(PATH$pColorAttachmentLocations);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$colorAttachmentCount = LAYOUT$colorAttachmentCount.byteSize();
    public static final long SIZE$pColorAttachmentLocations = LAYOUT$pColorAttachmentLocations.byteSize();

    public VkRenderingAttachmentLocationInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR);
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

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pColorAttachmentLocationsRaw() {
        return segment.get(LAYOUT$pColorAttachmentLocations, OFFSET$pColorAttachmentLocations);
    }

    public void pColorAttachmentLocationsRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pColorAttachmentLocations, OFFSET$pColorAttachmentLocations, value);
    }

    public @nullable @unsigned IntBuffer pColorAttachmentLocations() {
        MemorySegment s = pColorAttachmentLocationsRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pColorAttachmentLocations(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentLocationsRaw(s);
    }

    public static VkRenderingAttachmentLocationInfoKHR allocate(Arena arena) {
        return new VkRenderingAttachmentLocationInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkRenderingAttachmentLocationInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderingAttachmentLocationInfoKHR[] ret = new VkRenderingAttachmentLocationInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderingAttachmentLocationInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

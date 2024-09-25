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

public record VkDisplayPlaneCapabilities2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDisplayPlaneCapabilitiesKHR.LAYOUT.withName("capabilities")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$capabilities = PathElement.groupElement("capabilities");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$capabilities = (StructLayout) LAYOUT.select(PATH$capabilities);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$capabilities = LAYOUT.byteOffset(PATH$capabilities);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$capabilities = LAYOUT$capabilities.byteSize();

    public VkDisplayPlaneCapabilities2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR);
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

    public VkDisplayPlaneCapabilitiesKHR capabilities() {
        return new VkDisplayPlaneCapabilitiesKHR(segment.asSlice(OFFSET$capabilities, LAYOUT$capabilities));
    }

    public void capabilities(VkDisplayPlaneCapabilitiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$capabilities, SIZE$capabilities);
    }

    public static VkDisplayPlaneCapabilities2KHR allocate(Arena arena) {
        return new VkDisplayPlaneCapabilities2KHR(arena.allocate(LAYOUT));
    }
    
    public static VkDisplayPlaneCapabilities2KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPlaneCapabilities2KHR[] ret = new VkDisplayPlaneCapabilities2KHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayPlaneCapabilities2KHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

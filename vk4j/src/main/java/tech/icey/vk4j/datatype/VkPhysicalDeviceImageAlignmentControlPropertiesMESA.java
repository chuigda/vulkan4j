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

public record VkPhysicalDeviceImageAlignmentControlPropertiesMESA(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedImageAlignmentMask")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$supportedImageAlignmentMask = PathElement.groupElement("supportedImageAlignmentMask");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$supportedImageAlignmentMask = (OfInt) LAYOUT.select(PATH$supportedImageAlignmentMask);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportedImageAlignmentMask = LAYOUT.byteOffset(PATH$supportedImageAlignmentMask);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$supportedImageAlignmentMask = LAYOUT$supportedImageAlignmentMask.byteSize();

    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA);
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

    public @unsigned int supportedImageAlignmentMask() {
        return segment.get(LAYOUT$supportedImageAlignmentMask, OFFSET$supportedImageAlignmentMask);
    }

    public void supportedImageAlignmentMask(@unsigned int value) {
        segment.set(LAYOUT$supportedImageAlignmentMask, OFFSET$supportedImageAlignmentMask, value);
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA allocate(Arena arena) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageAlignmentControlPropertiesMESA[] ret = new VkPhysicalDeviceImageAlignmentControlPropertiesMESA[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

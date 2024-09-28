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

public record VkPhysicalDeviceSchedulingControlsFeaturesARM(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("schedulingControls")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$schedulingControls = PathElement.groupElement("schedulingControls");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$schedulingControls = (OfInt) LAYOUT.select(PATH$schedulingControls);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$schedulingControls = LAYOUT.byteOffset(PATH$schedulingControls);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$schedulingControls = LAYOUT$schedulingControls.byteSize();

    public VkPhysicalDeviceSchedulingControlsFeaturesARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int schedulingControls() {
        return segment.get(LAYOUT$schedulingControls, OFFSET$schedulingControls);
    }

    public void schedulingControls(@unsigned int value) {
        segment.set(LAYOUT$schedulingControls, OFFSET$schedulingControls, value);
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM allocate(Arena arena) {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSchedulingControlsFeaturesARM[] ret = new VkPhysicalDeviceSchedulingControlsFeaturesARM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

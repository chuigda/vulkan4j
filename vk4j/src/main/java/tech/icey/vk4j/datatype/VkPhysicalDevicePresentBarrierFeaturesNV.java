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

public record VkPhysicalDevicePresentBarrierFeaturesNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentBarrier")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$presentBarrier = PathElement.groupElement("presentBarrier");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$presentBarrier = (OfInt) LAYOUT.select(PATH$presentBarrier);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentBarrier = LAYOUT.byteOffset(PATH$presentBarrier);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$presentBarrier = LAYOUT$presentBarrier.byteSize();

    public VkPhysicalDevicePresentBarrierFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV);
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

    public @unsigned int presentBarrier() {
        return segment.get(LAYOUT$presentBarrier, OFFSET$presentBarrier);
    }

    public void presentBarrier(@unsigned int value) {
        segment.set(LAYOUT$presentBarrier, OFFSET$presentBarrier, value);
    }

    public static VkPhysicalDevicePresentBarrierFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDevicePresentBarrierFeaturesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevicePresentBarrierFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePresentBarrierFeaturesNV[] ret = new VkPhysicalDevicePresentBarrierFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePresentBarrierFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

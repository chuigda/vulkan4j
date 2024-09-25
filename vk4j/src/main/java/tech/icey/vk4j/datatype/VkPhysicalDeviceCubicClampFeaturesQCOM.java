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

public record VkPhysicalDeviceCubicClampFeaturesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cubicRangeClamp")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$cubicRangeClamp = PathElement.groupElement("cubicRangeClamp");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cubicRangeClamp = (OfInt) LAYOUT.select(PATH$cubicRangeClamp);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cubicRangeClamp = LAYOUT.byteOffset(PATH$cubicRangeClamp);

    public VkPhysicalDeviceCubicClampFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM);
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

    public @unsigned int cubicRangeClamp() {
        return segment.get(LAYOUT$cubicRangeClamp, OFFSET$cubicRangeClamp);
    }

    public void cubicRangeClamp(@unsigned int value) {
        segment.set(LAYOUT$cubicRangeClamp, OFFSET$cubicRangeClamp, value);
    }

    public static VkPhysicalDeviceCubicClampFeaturesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceCubicClampFeaturesQCOM(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceCubicClampFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCubicClampFeaturesQCOM[] ret = new VkPhysicalDeviceCubicClampFeaturesQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceCubicClampFeaturesQCOM(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

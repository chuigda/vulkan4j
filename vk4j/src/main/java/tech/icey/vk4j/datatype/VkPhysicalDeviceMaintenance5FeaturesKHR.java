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

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMaintenance5FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 maintenance5;
/// } VkPhysicalDeviceMaintenance5FeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMaintenance5FeaturesKHR.html">VkPhysicalDeviceMaintenance5FeaturesKHR</a>
public record VkPhysicalDeviceMaintenance5FeaturesKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maintenance5")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maintenance5 = PathElement.groupElement("maintenance5");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maintenance5 = (OfInt) LAYOUT.select(PATH$maintenance5);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maintenance5 = LAYOUT.byteOffset(PATH$maintenance5);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maintenance5 = LAYOUT$maintenance5.byteSize();

    public VkPhysicalDeviceMaintenance5FeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR);
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

    public @unsigned int maintenance5() {
        return segment.get(LAYOUT$maintenance5, OFFSET$maintenance5);
    }

    public void maintenance5(@unsigned int value) {
        segment.set(LAYOUT$maintenance5, OFFSET$maintenance5, value);
    }

    public static VkPhysicalDeviceMaintenance5FeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceMaintenance5FeaturesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMaintenance5FeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMaintenance5FeaturesKHR[] ret = new VkPhysicalDeviceMaintenance5FeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMaintenance5FeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

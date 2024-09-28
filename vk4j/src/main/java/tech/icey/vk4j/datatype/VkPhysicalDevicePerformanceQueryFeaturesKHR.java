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
/// typedef struct VkPhysicalDevicePerformanceQueryFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 performanceCounterQueryPools;
///     VkBool32 performanceCounterMultipleQueryPools;
/// } VkPhysicalDevicePerformanceQueryFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDevicePerformanceQueryFeaturesKHR.html">VkPhysicalDevicePerformanceQueryFeaturesKHR</a>
public record VkPhysicalDevicePerformanceQueryFeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDevicePerformanceQueryFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR);
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

    public @unsigned int performanceCounterQueryPools() {
        return segment.get(LAYOUT$performanceCounterQueryPools, OFFSET$performanceCounterQueryPools);
    }

    public void performanceCounterQueryPools(@unsigned int value) {
        segment.set(LAYOUT$performanceCounterQueryPools, OFFSET$performanceCounterQueryPools, value);
    }

    public @unsigned int performanceCounterMultipleQueryPools() {
        return segment.get(LAYOUT$performanceCounterMultipleQueryPools, OFFSET$performanceCounterMultipleQueryPools);
    }

    public void performanceCounterMultipleQueryPools(@unsigned int value) {
        segment.set(LAYOUT$performanceCounterMultipleQueryPools, OFFSET$performanceCounterMultipleQueryPools, value);
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePerformanceQueryFeaturesKHR[] ret = new VkPhysicalDevicePerformanceQueryFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performanceCounterQueryPools"),
        ValueLayout.JAVA_INT.withName("performanceCounterMultipleQueryPools")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$performanceCounterQueryPools = PathElement.groupElement("performanceCounterQueryPools");
    public static final PathElement PATH$performanceCounterMultipleQueryPools = PathElement.groupElement("performanceCounterMultipleQueryPools");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$performanceCounterQueryPools = (OfInt) LAYOUT.select(PATH$performanceCounterQueryPools);
    public static final OfInt LAYOUT$performanceCounterMultipleQueryPools = (OfInt) LAYOUT.select(PATH$performanceCounterMultipleQueryPools);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$performanceCounterQueryPools = LAYOUT.byteOffset(PATH$performanceCounterQueryPools);
    public static final long OFFSET$performanceCounterMultipleQueryPools = LAYOUT.byteOffset(PATH$performanceCounterMultipleQueryPools);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$performanceCounterQueryPools = LAYOUT$performanceCounterQueryPools.byteSize();
    public static final long SIZE$performanceCounterMultipleQueryPools = LAYOUT$performanceCounterMultipleQueryPools.byteSize();

}

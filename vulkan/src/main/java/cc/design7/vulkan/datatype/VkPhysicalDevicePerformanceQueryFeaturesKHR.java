package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePerformanceQueryFeaturesKHR.html">VkPhysicalDevicePerformanceQueryFeaturesKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDevicePerformanceQueryFeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDevicePerformanceQueryFeaturesKHR {
        sType(VkStructureType.PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR);
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePerformanceQueryFeaturesKHR[] ret = new VkPhysicalDevicePerformanceQueryFeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR clone(Arena arena, VkPhysicalDevicePerformanceQueryFeaturesKHR src) {
        VkPhysicalDevicePerformanceQueryFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR[] clone(Arena arena, VkPhysicalDevicePerformanceQueryFeaturesKHR[] src) {
        VkPhysicalDevicePerformanceQueryFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performanceCounterQueryPools"),
        ValueLayout.JAVA_INT.withName("performanceCounterMultipleQueryPools")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$performanceCounterQueryPools = PathElement.groupElement("PATH$performanceCounterQueryPools");
    public static final PathElement PATH$performanceCounterMultipleQueryPools = PathElement.groupElement("PATH$performanceCounterMultipleQueryPools");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$performanceCounterQueryPools = (OfInt) LAYOUT.select(PATH$performanceCounterQueryPools);
    public static final OfInt LAYOUT$performanceCounterMultipleQueryPools = (OfInt) LAYOUT.select(PATH$performanceCounterMultipleQueryPools);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$performanceCounterQueryPools = LAYOUT$performanceCounterQueryPools.byteSize();
    public static final long SIZE$performanceCounterMultipleQueryPools = LAYOUT$performanceCounterMultipleQueryPools.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$performanceCounterQueryPools = LAYOUT.byteOffset(PATH$performanceCounterQueryPools);
    public static final long OFFSET$performanceCounterMultipleQueryPools = LAYOUT.byteOffset(PATH$performanceCounterMultipleQueryPools);

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

}

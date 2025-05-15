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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.html"><code>VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 rayTracingMaintenance1;
///     VkBool32 rayTracingPipelineTraceRaysIndirect2;
/// } VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR`
///
/// The {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.html"><code>VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR allocate(Arena arena) {
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ret = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] ret = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR);
        }
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR clone(Arena arena, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR src) {
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] clone(Arena arena, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] src) {
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int rayTracingMaintenance1() {
        return segment.get(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1);
    }

    public void rayTracingMaintenance1(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1, value);
    }

    public @unsigned int rayTracingPipelineTraceRaysIndirect2() {
        return segment.get(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2);
    }

    public void rayTracingPipelineTraceRaysIndirect2(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMaintenance1"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$rayTracingMaintenance1 = PathElement.groupElement("PATH$rayTracingMaintenance1");
    public static final PathElement PATH$rayTracingPipelineTraceRaysIndirect2 = PathElement.groupElement("PATH$rayTracingPipelineTraceRaysIndirect2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingMaintenance1 = (OfInt) LAYOUT.select(PATH$rayTracingMaintenance1);
    public static final OfInt LAYOUT$rayTracingPipelineTraceRaysIndirect2 = (OfInt) LAYOUT.select(PATH$rayTracingPipelineTraceRaysIndirect2);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rayTracingMaintenance1 = LAYOUT$rayTracingMaintenance1.byteSize();
    public static final long SIZE$rayTracingPipelineTraceRaysIndirect2 = LAYOUT$rayTracingPipelineTraceRaysIndirect2.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingMaintenance1 = LAYOUT.byteOffset(PATH$rayTracingMaintenance1);
    public static final long OFFSET$rayTracingPipelineTraceRaysIndirect2 = LAYOUT.byteOffset(PATH$rayTracingPipelineTraceRaysIndirect2);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.html"><code>VkPhysicalDeviceRayTracingMotionBlurFeaturesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRayTracingMotionBlurFeaturesNV {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 rayTracingMotionBlur;
///     VkBool32 rayTracingMotionBlurPipelineTraceRaysIndirect;
/// } VkPhysicalDeviceRayTracingMotionBlurFeaturesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV`
///
/// The {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.html"><code>VkPhysicalDeviceRayTracingMotionBlurFeaturesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV allocate(Arena arena) {
        VkPhysicalDeviceRayTracingMotionBlurFeaturesNV ret = new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] ret = new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV);
        }
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV clone(Arena arena, VkPhysicalDeviceRayTracingMotionBlurFeaturesNV src) {
        VkPhysicalDeviceRayTracingMotionBlurFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] clone(Arena arena, VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] src) {
        VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV);
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

    public @unsigned int rayTracingMotionBlur() {
        return segment.get(LAYOUT$rayTracingMotionBlur, OFFSET$rayTracingMotionBlur);
    }

    public void rayTracingMotionBlur(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMotionBlur, OFFSET$rayTracingMotionBlur, value);
    }

    public @unsigned int rayTracingMotionBlurPipelineTraceRaysIndirect() {
        return segment.get(LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect);
    }

    public void rayTracingMotionBlurPipelineTraceRaysIndirect(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlur"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlurPipelineTraceRaysIndirect")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$rayTracingMotionBlur = PathElement.groupElement("PATH$rayTracingMotionBlur");
    public static final PathElement PATH$rayTracingMotionBlurPipelineTraceRaysIndirect = PathElement.groupElement("PATH$rayTracingMotionBlurPipelineTraceRaysIndirect");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingMotionBlur = (OfInt) LAYOUT.select(PATH$rayTracingMotionBlur);
    public static final OfInt LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect = (OfInt) LAYOUT.select(PATH$rayTracingMotionBlurPipelineTraceRaysIndirect);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rayTracingMotionBlur = LAYOUT$rayTracingMotionBlur.byteSize();
    public static final long SIZE$rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingMotionBlur = LAYOUT.byteOffset(PATH$rayTracingMotionBlur);
    public static final long OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.byteOffset(PATH$rayTracingMotionBlurPipelineTraceRaysIndirect);
}

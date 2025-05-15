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

/// Represents a pointer to a {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingPipelineFeaturesKHR.html">VkPhysicalDeviceRayTracingPipelineFeaturesKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceRayTracingPipelineFeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR {
        sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR);
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingPipelineFeaturesKHR[] ret = new VkPhysicalDeviceRayTracingPipelineFeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR clone(Arena arena, VkPhysicalDeviceRayTracingPipelineFeaturesKHR src) {
        VkPhysicalDeviceRayTracingPipelineFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceRayTracingPipelineFeaturesKHR[] src) {
        VkPhysicalDeviceRayTracingPipelineFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingPipeline"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplay"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect"),
        ValueLayout.JAVA_INT.withName("rayTraversalPrimitiveCulling")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$rayTracingPipeline = PathElement.groupElement("PATH$rayTracingPipeline");
    public static final PathElement PATH$rayTracingPipelineShaderGroupHandleCaptureReplay = PathElement.groupElement("PATH$rayTracingPipelineShaderGroupHandleCaptureReplay");
    public static final PathElement PATH$rayTracingPipelineShaderGroupHandleCaptureReplayMixed = PathElement.groupElement("PATH$rayTracingPipelineShaderGroupHandleCaptureReplayMixed");
    public static final PathElement PATH$rayTracingPipelineTraceRaysIndirect = PathElement.groupElement("PATH$rayTracingPipelineTraceRaysIndirect");
    public static final PathElement PATH$rayTraversalPrimitiveCulling = PathElement.groupElement("PATH$rayTraversalPrimitiveCulling");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingPipeline = (OfInt) LAYOUT.select(PATH$rayTracingPipeline);
    public static final OfInt LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay = (OfInt) LAYOUT.select(PATH$rayTracingPipelineShaderGroupHandleCaptureReplay);
    public static final OfInt LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed = (OfInt) LAYOUT.select(PATH$rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
    public static final OfInt LAYOUT$rayTracingPipelineTraceRaysIndirect = (OfInt) LAYOUT.select(PATH$rayTracingPipelineTraceRaysIndirect);
    public static final OfInt LAYOUT$rayTraversalPrimitiveCulling = (OfInt) LAYOUT.select(PATH$rayTraversalPrimitiveCulling);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rayTracingPipeline = LAYOUT$rayTracingPipeline.byteSize();
    public static final long SIZE$rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay.byteSize();
    public static final long SIZE$rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed.byteSize();
    public static final long SIZE$rayTracingPipelineTraceRaysIndirect = LAYOUT$rayTracingPipelineTraceRaysIndirect.byteSize();
    public static final long SIZE$rayTraversalPrimitiveCulling = LAYOUT$rayTraversalPrimitiveCulling.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingPipeline = LAYOUT.byteOffset(PATH$rayTracingPipeline);
    public static final long OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT.byteOffset(PATH$rayTracingPipelineShaderGroupHandleCaptureReplay);
    public static final long OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT.byteOffset(PATH$rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
    public static final long OFFSET$rayTracingPipelineTraceRaysIndirect = LAYOUT.byteOffset(PATH$rayTracingPipelineTraceRaysIndirect);
    public static final long OFFSET$rayTraversalPrimitiveCulling = LAYOUT.byteOffset(PATH$rayTraversalPrimitiveCulling);

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

    public @unsigned int rayTracingPipeline() {
        return segment.get(LAYOUT$rayTracingPipeline, OFFSET$rayTracingPipeline);
    }

    public void rayTracingPipeline(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipeline, OFFSET$rayTracingPipeline, value);
    }

    public @unsigned int rayTracingPipelineShaderGroupHandleCaptureReplay() {
        return segment.get(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay);
    }

    public void rayTracingPipelineShaderGroupHandleCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay, value);
    }

    public @unsigned int rayTracingPipelineShaderGroupHandleCaptureReplayMixed() {
        return segment.get(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
    }

    public void rayTracingPipelineShaderGroupHandleCaptureReplayMixed(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, value);
    }

    public @unsigned int rayTracingPipelineTraceRaysIndirect() {
        return segment.get(LAYOUT$rayTracingPipelineTraceRaysIndirect, OFFSET$rayTracingPipelineTraceRaysIndirect);
    }

    public void rayTracingPipelineTraceRaysIndirect(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineTraceRaysIndirect, OFFSET$rayTracingPipelineTraceRaysIndirect, value);
    }

    public @unsigned int rayTraversalPrimitiveCulling() {
        return segment.get(LAYOUT$rayTraversalPrimitiveCulling, OFFSET$rayTraversalPrimitiveCulling);
    }

    public void rayTraversalPrimitiveCulling(@unsigned int value) {
        segment.set(LAYOUT$rayTraversalPrimitiveCulling, OFFSET$rayTraversalPrimitiveCulling, value);
    }

}

package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan14Features.html"><code>VkPhysicalDeviceVulkan14Features</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVulkan14Features {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 globalPriorityQuery; // @link substring="globalPriorityQuery" target="#globalPriorityQuery"
///     VkBool32 shaderSubgroupRotate; // @link substring="shaderSubgroupRotate" target="#shaderSubgroupRotate"
///     VkBool32 shaderSubgroupRotateClustered; // @link substring="shaderSubgroupRotateClustered" target="#shaderSubgroupRotateClustered"
///     VkBool32 shaderFloatControls2; // @link substring="shaderFloatControls2" target="#shaderFloatControls2"
///     VkBool32 shaderExpectAssume; // @link substring="shaderExpectAssume" target="#shaderExpectAssume"
///     VkBool32 rectangularLines; // @link substring="rectangularLines" target="#rectangularLines"
///     VkBool32 bresenhamLines; // @link substring="bresenhamLines" target="#bresenhamLines"
///     VkBool32 smoothLines; // @link substring="smoothLines" target="#smoothLines"
///     VkBool32 stippledRectangularLines; // @link substring="stippledRectangularLines" target="#stippledRectangularLines"
///     VkBool32 stippledBresenhamLines; // @link substring="stippledBresenhamLines" target="#stippledBresenhamLines"
///     VkBool32 stippledSmoothLines; // @link substring="stippledSmoothLines" target="#stippledSmoothLines"
///     VkBool32 vertexAttributeInstanceRateDivisor; // @link substring="vertexAttributeInstanceRateDivisor" target="#vertexAttributeInstanceRateDivisor"
///     VkBool32 vertexAttributeInstanceRateZeroDivisor; // @link substring="vertexAttributeInstanceRateZeroDivisor" target="#vertexAttributeInstanceRateZeroDivisor"
///     VkBool32 indexTypeUint8; // @link substring="indexTypeUint8" target="#indexTypeUint8"
///     VkBool32 dynamicRenderingLocalRead; // @link substring="dynamicRenderingLocalRead" target="#dynamicRenderingLocalRead"
///     VkBool32 maintenance5; // @link substring="maintenance5" target="#maintenance5"
///     VkBool32 maintenance6; // @link substring="maintenance6" target="#maintenance6"
///     VkBool32 pipelineProtectedAccess; // @link substring="pipelineProtectedAccess" target="#pipelineProtectedAccess"
///     VkBool32 pipelineRobustness; // @link substring="pipelineRobustness" target="#pipelineRobustness"
///     VkBool32 hostImageCopy; // @link substring="hostImageCopy" target="#hostImageCopy"
///     VkBool32 pushDescriptor; // @link substring="pushDescriptor" target="#pushDescriptor"
/// } VkPhysicalDeviceVulkan14Features;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES`
///
/// The {@code allocate} ({@link VkPhysicalDeviceVulkan14Features#allocate(Arena)}, {@link VkPhysicalDeviceVulkan14Features#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceVulkan14Features#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan14Features.html"><code>VkPhysicalDeviceVulkan14Features</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceVulkan14Features(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceVulkan14Features allocate(Arena arena) {
        VkPhysicalDeviceVulkan14Features ret = new VkPhysicalDeviceVulkan14Features(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_4_FEATURES);
        return ret;
    }

    public static VkPhysicalDeviceVulkan14Features[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkan14Features[] ret = new VkPhysicalDeviceVulkan14Features[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVulkan14Features(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_4_FEATURES);
        }
        return ret;
    }

    public static VkPhysicalDeviceVulkan14Features clone(Arena arena, VkPhysicalDeviceVulkan14Features src) {
        VkPhysicalDeviceVulkan14Features ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVulkan14Features[] clone(Arena arena, VkPhysicalDeviceVulkan14Features[] src) {
        VkPhysicalDeviceVulkan14Features[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_4_FEATURES);
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

    public @unsigned int globalPriorityQuery() {
        return segment.get(LAYOUT$globalPriorityQuery, OFFSET$globalPriorityQuery);
    }

    public void globalPriorityQuery(@unsigned int value) {
        segment.set(LAYOUT$globalPriorityQuery, OFFSET$globalPriorityQuery, value);
    }

    public @unsigned int shaderSubgroupRotate() {
        return segment.get(LAYOUT$shaderSubgroupRotate, OFFSET$shaderSubgroupRotate);
    }

    public void shaderSubgroupRotate(@unsigned int value) {
        segment.set(LAYOUT$shaderSubgroupRotate, OFFSET$shaderSubgroupRotate, value);
    }

    public @unsigned int shaderSubgroupRotateClustered() {
        return segment.get(LAYOUT$shaderSubgroupRotateClustered, OFFSET$shaderSubgroupRotateClustered);
    }

    public void shaderSubgroupRotateClustered(@unsigned int value) {
        segment.set(LAYOUT$shaderSubgroupRotateClustered, OFFSET$shaderSubgroupRotateClustered, value);
    }

    public @unsigned int shaderFloatControls2() {
        return segment.get(LAYOUT$shaderFloatControls2, OFFSET$shaderFloatControls2);
    }

    public void shaderFloatControls2(@unsigned int value) {
        segment.set(LAYOUT$shaderFloatControls2, OFFSET$shaderFloatControls2, value);
    }

    public @unsigned int shaderExpectAssume() {
        return segment.get(LAYOUT$shaderExpectAssume, OFFSET$shaderExpectAssume);
    }

    public void shaderExpectAssume(@unsigned int value) {
        segment.set(LAYOUT$shaderExpectAssume, OFFSET$shaderExpectAssume, value);
    }

    public @unsigned int rectangularLines() {
        return segment.get(LAYOUT$rectangularLines, OFFSET$rectangularLines);
    }

    public void rectangularLines(@unsigned int value) {
        segment.set(LAYOUT$rectangularLines, OFFSET$rectangularLines, value);
    }

    public @unsigned int bresenhamLines() {
        return segment.get(LAYOUT$bresenhamLines, OFFSET$bresenhamLines);
    }

    public void bresenhamLines(@unsigned int value) {
        segment.set(LAYOUT$bresenhamLines, OFFSET$bresenhamLines, value);
    }

    public @unsigned int smoothLines() {
        return segment.get(LAYOUT$smoothLines, OFFSET$smoothLines);
    }

    public void smoothLines(@unsigned int value) {
        segment.set(LAYOUT$smoothLines, OFFSET$smoothLines, value);
    }

    public @unsigned int stippledRectangularLines() {
        return segment.get(LAYOUT$stippledRectangularLines, OFFSET$stippledRectangularLines);
    }

    public void stippledRectangularLines(@unsigned int value) {
        segment.set(LAYOUT$stippledRectangularLines, OFFSET$stippledRectangularLines, value);
    }

    public @unsigned int stippledBresenhamLines() {
        return segment.get(LAYOUT$stippledBresenhamLines, OFFSET$stippledBresenhamLines);
    }

    public void stippledBresenhamLines(@unsigned int value) {
        segment.set(LAYOUT$stippledBresenhamLines, OFFSET$stippledBresenhamLines, value);
    }

    public @unsigned int stippledSmoothLines() {
        return segment.get(LAYOUT$stippledSmoothLines, OFFSET$stippledSmoothLines);
    }

    public void stippledSmoothLines(@unsigned int value) {
        segment.set(LAYOUT$stippledSmoothLines, OFFSET$stippledSmoothLines, value);
    }

    public @unsigned int vertexAttributeInstanceRateDivisor() {
        return segment.get(LAYOUT$vertexAttributeInstanceRateDivisor, OFFSET$vertexAttributeInstanceRateDivisor);
    }

    public void vertexAttributeInstanceRateDivisor(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeInstanceRateDivisor, OFFSET$vertexAttributeInstanceRateDivisor, value);
    }

    public @unsigned int vertexAttributeInstanceRateZeroDivisor() {
        return segment.get(LAYOUT$vertexAttributeInstanceRateZeroDivisor, OFFSET$vertexAttributeInstanceRateZeroDivisor);
    }

    public void vertexAttributeInstanceRateZeroDivisor(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeInstanceRateZeroDivisor, OFFSET$vertexAttributeInstanceRateZeroDivisor, value);
    }

    public @unsigned int indexTypeUint8() {
        return segment.get(LAYOUT$indexTypeUint8, OFFSET$indexTypeUint8);
    }

    public void indexTypeUint8(@unsigned int value) {
        segment.set(LAYOUT$indexTypeUint8, OFFSET$indexTypeUint8, value);
    }

    public @unsigned int dynamicRenderingLocalRead() {
        return segment.get(LAYOUT$dynamicRenderingLocalRead, OFFSET$dynamicRenderingLocalRead);
    }

    public void dynamicRenderingLocalRead(@unsigned int value) {
        segment.set(LAYOUT$dynamicRenderingLocalRead, OFFSET$dynamicRenderingLocalRead, value);
    }

    public @unsigned int maintenance5() {
        return segment.get(LAYOUT$maintenance5, OFFSET$maintenance5);
    }

    public void maintenance5(@unsigned int value) {
        segment.set(LAYOUT$maintenance5, OFFSET$maintenance5, value);
    }

    public @unsigned int maintenance6() {
        return segment.get(LAYOUT$maintenance6, OFFSET$maintenance6);
    }

    public void maintenance6(@unsigned int value) {
        segment.set(LAYOUT$maintenance6, OFFSET$maintenance6, value);
    }

    public @unsigned int pipelineProtectedAccess() {
        return segment.get(LAYOUT$pipelineProtectedAccess, OFFSET$pipelineProtectedAccess);
    }

    public void pipelineProtectedAccess(@unsigned int value) {
        segment.set(LAYOUT$pipelineProtectedAccess, OFFSET$pipelineProtectedAccess, value);
    }

    public @unsigned int pipelineRobustness() {
        return segment.get(LAYOUT$pipelineRobustness, OFFSET$pipelineRobustness);
    }

    public void pipelineRobustness(@unsigned int value) {
        segment.set(LAYOUT$pipelineRobustness, OFFSET$pipelineRobustness, value);
    }

    public @unsigned int hostImageCopy() {
        return segment.get(LAYOUT$hostImageCopy, OFFSET$hostImageCopy);
    }

    public void hostImageCopy(@unsigned int value) {
        segment.set(LAYOUT$hostImageCopy, OFFSET$hostImageCopy, value);
    }

    public @unsigned int pushDescriptor() {
        return segment.get(LAYOUT$pushDescriptor, OFFSET$pushDescriptor);
    }

    public void pushDescriptor(@unsigned int value) {
        segment.set(LAYOUT$pushDescriptor, OFFSET$pushDescriptor, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriorityQuery"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotate"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotateClustered"),
        ValueLayout.JAVA_INT.withName("shaderFloatControls2"),
        ValueLayout.JAVA_INT.withName("shaderExpectAssume"),
        ValueLayout.JAVA_INT.withName("rectangularLines"),
        ValueLayout.JAVA_INT.withName("bresenhamLines"),
        ValueLayout.JAVA_INT.withName("smoothLines"),
        ValueLayout.JAVA_INT.withName("stippledRectangularLines"),
        ValueLayout.JAVA_INT.withName("stippledBresenhamLines"),
        ValueLayout.JAVA_INT.withName("stippledSmoothLines"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor"),
        ValueLayout.JAVA_INT.withName("indexTypeUint8"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalRead"),
        ValueLayout.JAVA_INT.withName("maintenance5"),
        ValueLayout.JAVA_INT.withName("maintenance6"),
        ValueLayout.JAVA_INT.withName("pipelineProtectedAccess"),
        ValueLayout.JAVA_INT.withName("pipelineRobustness"),
        ValueLayout.JAVA_INT.withName("hostImageCopy"),
        ValueLayout.JAVA_INT.withName("pushDescriptor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$globalPriorityQuery = PathElement.groupElement("PATH$globalPriorityQuery");
    public static final PathElement PATH$shaderSubgroupRotate = PathElement.groupElement("PATH$shaderSubgroupRotate");
    public static final PathElement PATH$shaderSubgroupRotateClustered = PathElement.groupElement("PATH$shaderSubgroupRotateClustered");
    public static final PathElement PATH$shaderFloatControls2 = PathElement.groupElement("PATH$shaderFloatControls2");
    public static final PathElement PATH$shaderExpectAssume = PathElement.groupElement("PATH$shaderExpectAssume");
    public static final PathElement PATH$rectangularLines = PathElement.groupElement("PATH$rectangularLines");
    public static final PathElement PATH$bresenhamLines = PathElement.groupElement("PATH$bresenhamLines");
    public static final PathElement PATH$smoothLines = PathElement.groupElement("PATH$smoothLines");
    public static final PathElement PATH$stippledRectangularLines = PathElement.groupElement("PATH$stippledRectangularLines");
    public static final PathElement PATH$stippledBresenhamLines = PathElement.groupElement("PATH$stippledBresenhamLines");
    public static final PathElement PATH$stippledSmoothLines = PathElement.groupElement("PATH$stippledSmoothLines");
    public static final PathElement PATH$vertexAttributeInstanceRateDivisor = PathElement.groupElement("PATH$vertexAttributeInstanceRateDivisor");
    public static final PathElement PATH$vertexAttributeInstanceRateZeroDivisor = PathElement.groupElement("PATH$vertexAttributeInstanceRateZeroDivisor");
    public static final PathElement PATH$indexTypeUint8 = PathElement.groupElement("PATH$indexTypeUint8");
    public static final PathElement PATH$dynamicRenderingLocalRead = PathElement.groupElement("PATH$dynamicRenderingLocalRead");
    public static final PathElement PATH$maintenance5 = PathElement.groupElement("PATH$maintenance5");
    public static final PathElement PATH$maintenance6 = PathElement.groupElement("PATH$maintenance6");
    public static final PathElement PATH$pipelineProtectedAccess = PathElement.groupElement("PATH$pipelineProtectedAccess");
    public static final PathElement PATH$pipelineRobustness = PathElement.groupElement("PATH$pipelineRobustness");
    public static final PathElement PATH$hostImageCopy = PathElement.groupElement("PATH$hostImageCopy");
    public static final PathElement PATH$pushDescriptor = PathElement.groupElement("PATH$pushDescriptor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$globalPriorityQuery = (OfInt) LAYOUT.select(PATH$globalPriorityQuery);
    public static final OfInt LAYOUT$shaderSubgroupRotate = (OfInt) LAYOUT.select(PATH$shaderSubgroupRotate);
    public static final OfInt LAYOUT$shaderSubgroupRotateClustered = (OfInt) LAYOUT.select(PATH$shaderSubgroupRotateClustered);
    public static final OfInt LAYOUT$shaderFloatControls2 = (OfInt) LAYOUT.select(PATH$shaderFloatControls2);
    public static final OfInt LAYOUT$shaderExpectAssume = (OfInt) LAYOUT.select(PATH$shaderExpectAssume);
    public static final OfInt LAYOUT$rectangularLines = (OfInt) LAYOUT.select(PATH$rectangularLines);
    public static final OfInt LAYOUT$bresenhamLines = (OfInt) LAYOUT.select(PATH$bresenhamLines);
    public static final OfInt LAYOUT$smoothLines = (OfInt) LAYOUT.select(PATH$smoothLines);
    public static final OfInt LAYOUT$stippledRectangularLines = (OfInt) LAYOUT.select(PATH$stippledRectangularLines);
    public static final OfInt LAYOUT$stippledBresenhamLines = (OfInt) LAYOUT.select(PATH$stippledBresenhamLines);
    public static final OfInt LAYOUT$stippledSmoothLines = (OfInt) LAYOUT.select(PATH$stippledSmoothLines);
    public static final OfInt LAYOUT$vertexAttributeInstanceRateDivisor = (OfInt) LAYOUT.select(PATH$vertexAttributeInstanceRateDivisor);
    public static final OfInt LAYOUT$vertexAttributeInstanceRateZeroDivisor = (OfInt) LAYOUT.select(PATH$vertexAttributeInstanceRateZeroDivisor);
    public static final OfInt LAYOUT$indexTypeUint8 = (OfInt) LAYOUT.select(PATH$indexTypeUint8);
    public static final OfInt LAYOUT$dynamicRenderingLocalRead = (OfInt) LAYOUT.select(PATH$dynamicRenderingLocalRead);
    public static final OfInt LAYOUT$maintenance5 = (OfInt) LAYOUT.select(PATH$maintenance5);
    public static final OfInt LAYOUT$maintenance6 = (OfInt) LAYOUT.select(PATH$maintenance6);
    public static final OfInt LAYOUT$pipelineProtectedAccess = (OfInt) LAYOUT.select(PATH$pipelineProtectedAccess);
    public static final OfInt LAYOUT$pipelineRobustness = (OfInt) LAYOUT.select(PATH$pipelineRobustness);
    public static final OfInt LAYOUT$hostImageCopy = (OfInt) LAYOUT.select(PATH$hostImageCopy);
    public static final OfInt LAYOUT$pushDescriptor = (OfInt) LAYOUT.select(PATH$pushDescriptor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$globalPriorityQuery = LAYOUT$globalPriorityQuery.byteSize();
    public static final long SIZE$shaderSubgroupRotate = LAYOUT$shaderSubgroupRotate.byteSize();
    public static final long SIZE$shaderSubgroupRotateClustered = LAYOUT$shaderSubgroupRotateClustered.byteSize();
    public static final long SIZE$shaderFloatControls2 = LAYOUT$shaderFloatControls2.byteSize();
    public static final long SIZE$shaderExpectAssume = LAYOUT$shaderExpectAssume.byteSize();
    public static final long SIZE$rectangularLines = LAYOUT$rectangularLines.byteSize();
    public static final long SIZE$bresenhamLines = LAYOUT$bresenhamLines.byteSize();
    public static final long SIZE$smoothLines = LAYOUT$smoothLines.byteSize();
    public static final long SIZE$stippledRectangularLines = LAYOUT$stippledRectangularLines.byteSize();
    public static final long SIZE$stippledBresenhamLines = LAYOUT$stippledBresenhamLines.byteSize();
    public static final long SIZE$stippledSmoothLines = LAYOUT$stippledSmoothLines.byteSize();
    public static final long SIZE$vertexAttributeInstanceRateDivisor = LAYOUT$vertexAttributeInstanceRateDivisor.byteSize();
    public static final long SIZE$vertexAttributeInstanceRateZeroDivisor = LAYOUT$vertexAttributeInstanceRateZeroDivisor.byteSize();
    public static final long SIZE$indexTypeUint8 = LAYOUT$indexTypeUint8.byteSize();
    public static final long SIZE$dynamicRenderingLocalRead = LAYOUT$dynamicRenderingLocalRead.byteSize();
    public static final long SIZE$maintenance5 = LAYOUT$maintenance5.byteSize();
    public static final long SIZE$maintenance6 = LAYOUT$maintenance6.byteSize();
    public static final long SIZE$pipelineProtectedAccess = LAYOUT$pipelineProtectedAccess.byteSize();
    public static final long SIZE$pipelineRobustness = LAYOUT$pipelineRobustness.byteSize();
    public static final long SIZE$hostImageCopy = LAYOUT$hostImageCopy.byteSize();
    public static final long SIZE$pushDescriptor = LAYOUT$pushDescriptor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$globalPriorityQuery = LAYOUT.byteOffset(PATH$globalPriorityQuery);
    public static final long OFFSET$shaderSubgroupRotate = LAYOUT.byteOffset(PATH$shaderSubgroupRotate);
    public static final long OFFSET$shaderSubgroupRotateClustered = LAYOUT.byteOffset(PATH$shaderSubgroupRotateClustered);
    public static final long OFFSET$shaderFloatControls2 = LAYOUT.byteOffset(PATH$shaderFloatControls2);
    public static final long OFFSET$shaderExpectAssume = LAYOUT.byteOffset(PATH$shaderExpectAssume);
    public static final long OFFSET$rectangularLines = LAYOUT.byteOffset(PATH$rectangularLines);
    public static final long OFFSET$bresenhamLines = LAYOUT.byteOffset(PATH$bresenhamLines);
    public static final long OFFSET$smoothLines = LAYOUT.byteOffset(PATH$smoothLines);
    public static final long OFFSET$stippledRectangularLines = LAYOUT.byteOffset(PATH$stippledRectangularLines);
    public static final long OFFSET$stippledBresenhamLines = LAYOUT.byteOffset(PATH$stippledBresenhamLines);
    public static final long OFFSET$stippledSmoothLines = LAYOUT.byteOffset(PATH$stippledSmoothLines);
    public static final long OFFSET$vertexAttributeInstanceRateDivisor = LAYOUT.byteOffset(PATH$vertexAttributeInstanceRateDivisor);
    public static final long OFFSET$vertexAttributeInstanceRateZeroDivisor = LAYOUT.byteOffset(PATH$vertexAttributeInstanceRateZeroDivisor);
    public static final long OFFSET$indexTypeUint8 = LAYOUT.byteOffset(PATH$indexTypeUint8);
    public static final long OFFSET$dynamicRenderingLocalRead = LAYOUT.byteOffset(PATH$dynamicRenderingLocalRead);
    public static final long OFFSET$maintenance5 = LAYOUT.byteOffset(PATH$maintenance5);
    public static final long OFFSET$maintenance6 = LAYOUT.byteOffset(PATH$maintenance6);
    public static final long OFFSET$pipelineProtectedAccess = LAYOUT.byteOffset(PATH$pipelineProtectedAccess);
    public static final long OFFSET$pipelineRobustness = LAYOUT.byteOffset(PATH$pipelineRobustness);
    public static final long OFFSET$hostImageCopy = LAYOUT.byteOffset(PATH$hostImageCopy);
    public static final long OFFSET$pushDescriptor = LAYOUT.byteOffset(PATH$pushDescriptor);
}

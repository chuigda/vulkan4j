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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceConservativeRasterizationPropertiesEXT.html"><code>VkPhysicalDeviceConservativeRasterizationPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceConservativeRasterizationPropertiesEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     float primitiveOverestimationSize;
///     float maxExtraPrimitiveOverestimationSize;
///     float extraPrimitiveOverestimationSizeGranularity;
///     VkBool32 primitiveUnderestimation;
///     VkBool32 conservativePointAndLineRasterization;
///     VkBool32 degenerateTrianglesRasterized;
///     VkBool32 degenerateLinesRasterized;
///     VkBool32 fullyCoveredFragmentShaderInputVariable;
///     VkBool32 conservativeRasterizationPostDepthCoverage;
/// } VkPhysicalDeviceConservativeRasterizationPropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT`
///
/// The {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceConservativeRasterizationPropertiesEXT.html"><code>VkPhysicalDeviceConservativeRasterizationPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceConservativeRasterizationPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceConservativeRasterizationPropertiesEXT ret = new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceConservativeRasterizationPropertiesEXT[] ret = new VkPhysicalDeviceConservativeRasterizationPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT clone(Arena arena, VkPhysicalDeviceConservativeRasterizationPropertiesEXT src) {
        VkPhysicalDeviceConservativeRasterizationPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceConservativeRasterizationPropertiesEXT[] src) {
        VkPhysicalDeviceConservativeRasterizationPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT);
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

    public float primitiveOverestimationSize() {
        return segment.get(LAYOUT$primitiveOverestimationSize, OFFSET$primitiveOverestimationSize);
    }

    public void primitiveOverestimationSize(float value) {
        segment.set(LAYOUT$primitiveOverestimationSize, OFFSET$primitiveOverestimationSize, value);
    }

    public float maxExtraPrimitiveOverestimationSize() {
        return segment.get(LAYOUT$maxExtraPrimitiveOverestimationSize, OFFSET$maxExtraPrimitiveOverestimationSize);
    }

    public void maxExtraPrimitiveOverestimationSize(float value) {
        segment.set(LAYOUT$maxExtraPrimitiveOverestimationSize, OFFSET$maxExtraPrimitiveOverestimationSize, value);
    }

    public float extraPrimitiveOverestimationSizeGranularity() {
        return segment.get(LAYOUT$extraPrimitiveOverestimationSizeGranularity, OFFSET$extraPrimitiveOverestimationSizeGranularity);
    }

    public void extraPrimitiveOverestimationSizeGranularity(float value) {
        segment.set(LAYOUT$extraPrimitiveOverestimationSizeGranularity, OFFSET$extraPrimitiveOverestimationSizeGranularity, value);
    }

    public @unsigned int primitiveUnderestimation() {
        return segment.get(LAYOUT$primitiveUnderestimation, OFFSET$primitiveUnderestimation);
    }

    public void primitiveUnderestimation(@unsigned int value) {
        segment.set(LAYOUT$primitiveUnderestimation, OFFSET$primitiveUnderestimation, value);
    }

    public @unsigned int conservativePointAndLineRasterization() {
        return segment.get(LAYOUT$conservativePointAndLineRasterization, OFFSET$conservativePointAndLineRasterization);
    }

    public void conservativePointAndLineRasterization(@unsigned int value) {
        segment.set(LAYOUT$conservativePointAndLineRasterization, OFFSET$conservativePointAndLineRasterization, value);
    }

    public @unsigned int degenerateTrianglesRasterized() {
        return segment.get(LAYOUT$degenerateTrianglesRasterized, OFFSET$degenerateTrianglesRasterized);
    }

    public void degenerateTrianglesRasterized(@unsigned int value) {
        segment.set(LAYOUT$degenerateTrianglesRasterized, OFFSET$degenerateTrianglesRasterized, value);
    }

    public @unsigned int degenerateLinesRasterized() {
        return segment.get(LAYOUT$degenerateLinesRasterized, OFFSET$degenerateLinesRasterized);
    }

    public void degenerateLinesRasterized(@unsigned int value) {
        segment.set(LAYOUT$degenerateLinesRasterized, OFFSET$degenerateLinesRasterized, value);
    }

    public @unsigned int fullyCoveredFragmentShaderInputVariable() {
        return segment.get(LAYOUT$fullyCoveredFragmentShaderInputVariable, OFFSET$fullyCoveredFragmentShaderInputVariable);
    }

    public void fullyCoveredFragmentShaderInputVariable(@unsigned int value) {
        segment.set(LAYOUT$fullyCoveredFragmentShaderInputVariable, OFFSET$fullyCoveredFragmentShaderInputVariable, value);
    }

    public @unsigned int conservativeRasterizationPostDepthCoverage() {
        return segment.get(LAYOUT$conservativeRasterizationPostDepthCoverage, OFFSET$conservativeRasterizationPostDepthCoverage);
    }

    public void conservativeRasterizationPostDepthCoverage(@unsigned int value) {
        segment.set(LAYOUT$conservativeRasterizationPostDepthCoverage, OFFSET$conservativeRasterizationPostDepthCoverage, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("primitiveOverestimationSize"),
        ValueLayout.JAVA_FLOAT.withName("maxExtraPrimitiveOverestimationSize"),
        ValueLayout.JAVA_FLOAT.withName("extraPrimitiveOverestimationSizeGranularity"),
        ValueLayout.JAVA_INT.withName("primitiveUnderestimation"),
        ValueLayout.JAVA_INT.withName("conservativePointAndLineRasterization"),
        ValueLayout.JAVA_INT.withName("degenerateTrianglesRasterized"),
        ValueLayout.JAVA_INT.withName("degenerateLinesRasterized"),
        ValueLayout.JAVA_INT.withName("fullyCoveredFragmentShaderInputVariable"),
        ValueLayout.JAVA_INT.withName("conservativeRasterizationPostDepthCoverage")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$primitiveOverestimationSize = PathElement.groupElement("PATH$primitiveOverestimationSize");
    public static final PathElement PATH$maxExtraPrimitiveOverestimationSize = PathElement.groupElement("PATH$maxExtraPrimitiveOverestimationSize");
    public static final PathElement PATH$extraPrimitiveOverestimationSizeGranularity = PathElement.groupElement("PATH$extraPrimitiveOverestimationSizeGranularity");
    public static final PathElement PATH$primitiveUnderestimation = PathElement.groupElement("PATH$primitiveUnderestimation");
    public static final PathElement PATH$conservativePointAndLineRasterization = PathElement.groupElement("PATH$conservativePointAndLineRasterization");
    public static final PathElement PATH$degenerateTrianglesRasterized = PathElement.groupElement("PATH$degenerateTrianglesRasterized");
    public static final PathElement PATH$degenerateLinesRasterized = PathElement.groupElement("PATH$degenerateLinesRasterized");
    public static final PathElement PATH$fullyCoveredFragmentShaderInputVariable = PathElement.groupElement("PATH$fullyCoveredFragmentShaderInputVariable");
    public static final PathElement PATH$conservativeRasterizationPostDepthCoverage = PathElement.groupElement("PATH$conservativeRasterizationPostDepthCoverage");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfFloat LAYOUT$primitiveOverestimationSize = (OfFloat) LAYOUT.select(PATH$primitiveOverestimationSize);
    public static final OfFloat LAYOUT$maxExtraPrimitiveOverestimationSize = (OfFloat) LAYOUT.select(PATH$maxExtraPrimitiveOverestimationSize);
    public static final OfFloat LAYOUT$extraPrimitiveOverestimationSizeGranularity = (OfFloat) LAYOUT.select(PATH$extraPrimitiveOverestimationSizeGranularity);
    public static final OfInt LAYOUT$primitiveUnderestimation = (OfInt) LAYOUT.select(PATH$primitiveUnderestimation);
    public static final OfInt LAYOUT$conservativePointAndLineRasterization = (OfInt) LAYOUT.select(PATH$conservativePointAndLineRasterization);
    public static final OfInt LAYOUT$degenerateTrianglesRasterized = (OfInt) LAYOUT.select(PATH$degenerateTrianglesRasterized);
    public static final OfInt LAYOUT$degenerateLinesRasterized = (OfInt) LAYOUT.select(PATH$degenerateLinesRasterized);
    public static final OfInt LAYOUT$fullyCoveredFragmentShaderInputVariable = (OfInt) LAYOUT.select(PATH$fullyCoveredFragmentShaderInputVariable);
    public static final OfInt LAYOUT$conservativeRasterizationPostDepthCoverage = (OfInt) LAYOUT.select(PATH$conservativeRasterizationPostDepthCoverage);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$primitiveOverestimationSize = LAYOUT$primitiveOverestimationSize.byteSize();
    public static final long SIZE$maxExtraPrimitiveOverestimationSize = LAYOUT$maxExtraPrimitiveOverestimationSize.byteSize();
    public static final long SIZE$extraPrimitiveOverestimationSizeGranularity = LAYOUT$extraPrimitiveOverestimationSizeGranularity.byteSize();
    public static final long SIZE$primitiveUnderestimation = LAYOUT$primitiveUnderestimation.byteSize();
    public static final long SIZE$conservativePointAndLineRasterization = LAYOUT$conservativePointAndLineRasterization.byteSize();
    public static final long SIZE$degenerateTrianglesRasterized = LAYOUT$degenerateTrianglesRasterized.byteSize();
    public static final long SIZE$degenerateLinesRasterized = LAYOUT$degenerateLinesRasterized.byteSize();
    public static final long SIZE$fullyCoveredFragmentShaderInputVariable = LAYOUT$fullyCoveredFragmentShaderInputVariable.byteSize();
    public static final long SIZE$conservativeRasterizationPostDepthCoverage = LAYOUT$conservativeRasterizationPostDepthCoverage.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$primitiveOverestimationSize = LAYOUT.byteOffset(PATH$primitiveOverestimationSize);
    public static final long OFFSET$maxExtraPrimitiveOverestimationSize = LAYOUT.byteOffset(PATH$maxExtraPrimitiveOverestimationSize);
    public static final long OFFSET$extraPrimitiveOverestimationSizeGranularity = LAYOUT.byteOffset(PATH$extraPrimitiveOverestimationSizeGranularity);
    public static final long OFFSET$primitiveUnderestimation = LAYOUT.byteOffset(PATH$primitiveUnderestimation);
    public static final long OFFSET$conservativePointAndLineRasterization = LAYOUT.byteOffset(PATH$conservativePointAndLineRasterization);
    public static final long OFFSET$degenerateTrianglesRasterized = LAYOUT.byteOffset(PATH$degenerateTrianglesRasterized);
    public static final long OFFSET$degenerateLinesRasterized = LAYOUT.byteOffset(PATH$degenerateLinesRasterized);
    public static final long OFFSET$fullyCoveredFragmentShaderInputVariable = LAYOUT.byteOffset(PATH$fullyCoveredFragmentShaderInputVariable);
    public static final long OFFSET$conservativeRasterizationPostDepthCoverage = LAYOUT.byteOffset(PATH$conservativeRasterizationPostDepthCoverage);
}

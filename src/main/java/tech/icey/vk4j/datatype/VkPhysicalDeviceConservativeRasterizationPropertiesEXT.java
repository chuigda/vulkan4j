package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceConservativeRasterizationPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
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

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$primitiveOverestimationSize = PathElement.groupElement(2);
    public static final PathElement PATH$maxExtraPrimitiveOverestimationSize = PathElement.groupElement(3);
    public static final PathElement PATH$extraPrimitiveOverestimationSizeGranularity = PathElement.groupElement(4);
    public static final PathElement PATH$primitiveUnderestimation = PathElement.groupElement(5);
    public static final PathElement PATH$conservativePointAndLineRasterization = PathElement.groupElement(6);
    public static final PathElement PATH$degenerateTrianglesRasterized = PathElement.groupElement(7);
    public static final PathElement PATH$degenerateLinesRasterized = PathElement.groupElement(8);
    public static final PathElement PATH$fullyCoveredFragmentShaderInputVariable = PathElement.groupElement(9);
    public static final PathElement PATH$conservativeRasterizationPostDepthCoverage = PathElement.groupElement(10);

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

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT);
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


    public static final class VkPhysicalDeviceConservativeRasterizationPropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> clazz() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceConservativeRasterizationPropertiesEXTFactory FACTORY = new VkPhysicalDeviceConservativeRasterizationPropertiesEXTFactory();
}
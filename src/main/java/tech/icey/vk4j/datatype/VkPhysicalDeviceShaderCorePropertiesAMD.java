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

public record VkPhysicalDeviceShaderCorePropertiesAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderEngineCount"),
        ValueLayout.JAVA_INT.withName("shaderArraysPerEngineCount"),
        ValueLayout.JAVA_INT.withName("computeUnitsPerShaderArray"),
        ValueLayout.JAVA_INT.withName("simdPerComputeUnit"),
        ValueLayout.JAVA_INT.withName("wavefrontsPerSimd"),
        ValueLayout.JAVA_INT.withName("wavefrontSize"),
        ValueLayout.JAVA_INT.withName("sgprsPerSimd"),
        ValueLayout.JAVA_INT.withName("minSgprAllocation"),
        ValueLayout.JAVA_INT.withName("maxSgprAllocation"),
        ValueLayout.JAVA_INT.withName("sgprAllocationGranularity"),
        ValueLayout.JAVA_INT.withName("vgprsPerSimd"),
        ValueLayout.JAVA_INT.withName("minVgprAllocation"),
        ValueLayout.JAVA_INT.withName("maxVgprAllocation"),
        ValueLayout.JAVA_INT.withName("vgprAllocationGranularity")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$shaderEngineCount = PathElement.groupElement(2);
    public static final PathElement PATH$shaderArraysPerEngineCount = PathElement.groupElement(3);
    public static final PathElement PATH$computeUnitsPerShaderArray = PathElement.groupElement(4);
    public static final PathElement PATH$simdPerComputeUnit = PathElement.groupElement(5);
    public static final PathElement PATH$wavefrontsPerSimd = PathElement.groupElement(6);
    public static final PathElement PATH$wavefrontSize = PathElement.groupElement(7);
    public static final PathElement PATH$sgprsPerSimd = PathElement.groupElement(8);
    public static final PathElement PATH$minSgprAllocation = PathElement.groupElement(9);
    public static final PathElement PATH$maxSgprAllocation = PathElement.groupElement(10);
    public static final PathElement PATH$sgprAllocationGranularity = PathElement.groupElement(11);
    public static final PathElement PATH$vgprsPerSimd = PathElement.groupElement(12);
    public static final PathElement PATH$minVgprAllocation = PathElement.groupElement(13);
    public static final PathElement PATH$maxVgprAllocation = PathElement.groupElement(14);
    public static final PathElement PATH$vgprAllocationGranularity = PathElement.groupElement(15);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderEngineCount = (OfInt) LAYOUT.select(PATH$shaderEngineCount);
    public static final OfInt LAYOUT$shaderArraysPerEngineCount = (OfInt) LAYOUT.select(PATH$shaderArraysPerEngineCount);
    public static final OfInt LAYOUT$computeUnitsPerShaderArray = (OfInt) LAYOUT.select(PATH$computeUnitsPerShaderArray);
    public static final OfInt LAYOUT$simdPerComputeUnit = (OfInt) LAYOUT.select(PATH$simdPerComputeUnit);
    public static final OfInt LAYOUT$wavefrontsPerSimd = (OfInt) LAYOUT.select(PATH$wavefrontsPerSimd);
    public static final OfInt LAYOUT$wavefrontSize = (OfInt) LAYOUT.select(PATH$wavefrontSize);
    public static final OfInt LAYOUT$sgprsPerSimd = (OfInt) LAYOUT.select(PATH$sgprsPerSimd);
    public static final OfInt LAYOUT$minSgprAllocation = (OfInt) LAYOUT.select(PATH$minSgprAllocation);
    public static final OfInt LAYOUT$maxSgprAllocation = (OfInt) LAYOUT.select(PATH$maxSgprAllocation);
    public static final OfInt LAYOUT$sgprAllocationGranularity = (OfInt) LAYOUT.select(PATH$sgprAllocationGranularity);
    public static final OfInt LAYOUT$vgprsPerSimd = (OfInt) LAYOUT.select(PATH$vgprsPerSimd);
    public static final OfInt LAYOUT$minVgprAllocation = (OfInt) LAYOUT.select(PATH$minVgprAllocation);
    public static final OfInt LAYOUT$maxVgprAllocation = (OfInt) LAYOUT.select(PATH$maxVgprAllocation);
    public static final OfInt LAYOUT$vgprAllocationGranularity = (OfInt) LAYOUT.select(PATH$vgprAllocationGranularity);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderEngineCount = LAYOUT.byteOffset(PATH$shaderEngineCount);
    public static final long OFFSET$shaderArraysPerEngineCount = LAYOUT.byteOffset(PATH$shaderArraysPerEngineCount);
    public static final long OFFSET$computeUnitsPerShaderArray = LAYOUT.byteOffset(PATH$computeUnitsPerShaderArray);
    public static final long OFFSET$simdPerComputeUnit = LAYOUT.byteOffset(PATH$simdPerComputeUnit);
    public static final long OFFSET$wavefrontsPerSimd = LAYOUT.byteOffset(PATH$wavefrontsPerSimd);
    public static final long OFFSET$wavefrontSize = LAYOUT.byteOffset(PATH$wavefrontSize);
    public static final long OFFSET$sgprsPerSimd = LAYOUT.byteOffset(PATH$sgprsPerSimd);
    public static final long OFFSET$minSgprAllocation = LAYOUT.byteOffset(PATH$minSgprAllocation);
    public static final long OFFSET$maxSgprAllocation = LAYOUT.byteOffset(PATH$maxSgprAllocation);
    public static final long OFFSET$sgprAllocationGranularity = LAYOUT.byteOffset(PATH$sgprAllocationGranularity);
    public static final long OFFSET$vgprsPerSimd = LAYOUT.byteOffset(PATH$vgprsPerSimd);
    public static final long OFFSET$minVgprAllocation = LAYOUT.byteOffset(PATH$minVgprAllocation);
    public static final long OFFSET$maxVgprAllocation = LAYOUT.byteOffset(PATH$maxVgprAllocation);
    public static final long OFFSET$vgprAllocationGranularity = LAYOUT.byteOffset(PATH$vgprAllocationGranularity);

    public VkPhysicalDeviceShaderCorePropertiesAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD);
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

    public @unsigned int shaderEngineCount() {
        return segment.get(LAYOUT$shaderEngineCount, OFFSET$shaderEngineCount);
    }

    public void shaderEngineCount(@unsigned int value) {
        segment.set(LAYOUT$shaderEngineCount, OFFSET$shaderEngineCount, value);
    }

    public @unsigned int shaderArraysPerEngineCount() {
        return segment.get(LAYOUT$shaderArraysPerEngineCount, OFFSET$shaderArraysPerEngineCount);
    }

    public void shaderArraysPerEngineCount(@unsigned int value) {
        segment.set(LAYOUT$shaderArraysPerEngineCount, OFFSET$shaderArraysPerEngineCount, value);
    }

    public @unsigned int computeUnitsPerShaderArray() {
        return segment.get(LAYOUT$computeUnitsPerShaderArray, OFFSET$computeUnitsPerShaderArray);
    }

    public void computeUnitsPerShaderArray(@unsigned int value) {
        segment.set(LAYOUT$computeUnitsPerShaderArray, OFFSET$computeUnitsPerShaderArray, value);
    }

    public @unsigned int simdPerComputeUnit() {
        return segment.get(LAYOUT$simdPerComputeUnit, OFFSET$simdPerComputeUnit);
    }

    public void simdPerComputeUnit(@unsigned int value) {
        segment.set(LAYOUT$simdPerComputeUnit, OFFSET$simdPerComputeUnit, value);
    }

    public @unsigned int wavefrontsPerSimd() {
        return segment.get(LAYOUT$wavefrontsPerSimd, OFFSET$wavefrontsPerSimd);
    }

    public void wavefrontsPerSimd(@unsigned int value) {
        segment.set(LAYOUT$wavefrontsPerSimd, OFFSET$wavefrontsPerSimd, value);
    }

    public @unsigned int wavefrontSize() {
        return segment.get(LAYOUT$wavefrontSize, OFFSET$wavefrontSize);
    }

    public void wavefrontSize(@unsigned int value) {
        segment.set(LAYOUT$wavefrontSize, OFFSET$wavefrontSize, value);
    }

    public @unsigned int sgprsPerSimd() {
        return segment.get(LAYOUT$sgprsPerSimd, OFFSET$sgprsPerSimd);
    }

    public void sgprsPerSimd(@unsigned int value) {
        segment.set(LAYOUT$sgprsPerSimd, OFFSET$sgprsPerSimd, value);
    }

    public @unsigned int minSgprAllocation() {
        return segment.get(LAYOUT$minSgprAllocation, OFFSET$minSgprAllocation);
    }

    public void minSgprAllocation(@unsigned int value) {
        segment.set(LAYOUT$minSgprAllocation, OFFSET$minSgprAllocation, value);
    }

    public @unsigned int maxSgprAllocation() {
        return segment.get(LAYOUT$maxSgprAllocation, OFFSET$maxSgprAllocation);
    }

    public void maxSgprAllocation(@unsigned int value) {
        segment.set(LAYOUT$maxSgprAllocation, OFFSET$maxSgprAllocation, value);
    }

    public @unsigned int sgprAllocationGranularity() {
        return segment.get(LAYOUT$sgprAllocationGranularity, OFFSET$sgprAllocationGranularity);
    }

    public void sgprAllocationGranularity(@unsigned int value) {
        segment.set(LAYOUT$sgprAllocationGranularity, OFFSET$sgprAllocationGranularity, value);
    }

    public @unsigned int vgprsPerSimd() {
        return segment.get(LAYOUT$vgprsPerSimd, OFFSET$vgprsPerSimd);
    }

    public void vgprsPerSimd(@unsigned int value) {
        segment.set(LAYOUT$vgprsPerSimd, OFFSET$vgprsPerSimd, value);
    }

    public @unsigned int minVgprAllocation() {
        return segment.get(LAYOUT$minVgprAllocation, OFFSET$minVgprAllocation);
    }

    public void minVgprAllocation(@unsigned int value) {
        segment.set(LAYOUT$minVgprAllocation, OFFSET$minVgprAllocation, value);
    }

    public @unsigned int maxVgprAllocation() {
        return segment.get(LAYOUT$maxVgprAllocation, OFFSET$maxVgprAllocation);
    }

    public void maxVgprAllocation(@unsigned int value) {
        segment.set(LAYOUT$maxVgprAllocation, OFFSET$maxVgprAllocation, value);
    }

    public @unsigned int vgprAllocationGranularity() {
        return segment.get(LAYOUT$vgprAllocationGranularity, OFFSET$vgprAllocationGranularity);
    }

    public void vgprAllocationGranularity(@unsigned int value) {
        segment.set(LAYOUT$vgprAllocationGranularity, OFFSET$vgprAllocationGranularity, value);
    }


    public static final class VkPhysicalDeviceShaderCorePropertiesAMDFactory implements IDataTypeFactory<VkPhysicalDeviceShaderCorePropertiesAMD> {
        @Override
        public Class<VkPhysicalDeviceShaderCorePropertiesAMD> clazz() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderCorePropertiesAMD create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShaderCorePropertiesAMD createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderCorePropertiesAMD(segment);
        }
    }

    public static final VkPhysicalDeviceShaderCorePropertiesAMDFactory FACTORY = new VkPhysicalDeviceShaderCorePropertiesAMDFactory();
}
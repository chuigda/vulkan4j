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
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicAdd")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderBufferFloat32Atomics = PathElement.groupElement("shaderBufferFloat32Atomics");
    public static final PathElement PATH$shaderBufferFloat32AtomicAdd = PathElement.groupElement("shaderBufferFloat32AtomicAdd");
    public static final PathElement PATH$shaderBufferFloat64Atomics = PathElement.groupElement("shaderBufferFloat64Atomics");
    public static final PathElement PATH$shaderBufferFloat64AtomicAdd = PathElement.groupElement("shaderBufferFloat64AtomicAdd");
    public static final PathElement PATH$shaderSharedFloat32Atomics = PathElement.groupElement("shaderSharedFloat32Atomics");
    public static final PathElement PATH$shaderSharedFloat32AtomicAdd = PathElement.groupElement("shaderSharedFloat32AtomicAdd");
    public static final PathElement PATH$shaderSharedFloat64Atomics = PathElement.groupElement("shaderSharedFloat64Atomics");
    public static final PathElement PATH$shaderSharedFloat64AtomicAdd = PathElement.groupElement("shaderSharedFloat64AtomicAdd");
    public static final PathElement PATH$shaderImageFloat32Atomics = PathElement.groupElement("shaderImageFloat32Atomics");
    public static final PathElement PATH$shaderImageFloat32AtomicAdd = PathElement.groupElement("shaderImageFloat32AtomicAdd");
    public static final PathElement PATH$sparseImageFloat32Atomics = PathElement.groupElement("sparseImageFloat32Atomics");
    public static final PathElement PATH$sparseImageFloat32AtomicAdd = PathElement.groupElement("sparseImageFloat32AtomicAdd");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderBufferFloat32Atomics = (OfInt) LAYOUT.select(PATH$shaderBufferFloat32Atomics);
    public static final OfInt LAYOUT$shaderBufferFloat32AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderBufferFloat32AtomicAdd);
    public static final OfInt LAYOUT$shaderBufferFloat64Atomics = (OfInt) LAYOUT.select(PATH$shaderBufferFloat64Atomics);
    public static final OfInt LAYOUT$shaderBufferFloat64AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderBufferFloat64AtomicAdd);
    public static final OfInt LAYOUT$shaderSharedFloat32Atomics = (OfInt) LAYOUT.select(PATH$shaderSharedFloat32Atomics);
    public static final OfInt LAYOUT$shaderSharedFloat32AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderSharedFloat32AtomicAdd);
    public static final OfInt LAYOUT$shaderSharedFloat64Atomics = (OfInt) LAYOUT.select(PATH$shaderSharedFloat64Atomics);
    public static final OfInt LAYOUT$shaderSharedFloat64AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderSharedFloat64AtomicAdd);
    public static final OfInt LAYOUT$shaderImageFloat32Atomics = (OfInt) LAYOUT.select(PATH$shaderImageFloat32Atomics);
    public static final OfInt LAYOUT$shaderImageFloat32AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderImageFloat32AtomicAdd);
    public static final OfInt LAYOUT$sparseImageFloat32Atomics = (OfInt) LAYOUT.select(PATH$sparseImageFloat32Atomics);
    public static final OfInt LAYOUT$sparseImageFloat32AtomicAdd = (OfInt) LAYOUT.select(PATH$sparseImageFloat32AtomicAdd);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderBufferFloat32Atomics = LAYOUT.byteOffset(PATH$shaderBufferFloat32Atomics);
    public static final long OFFSET$shaderBufferFloat32AtomicAdd = LAYOUT.byteOffset(PATH$shaderBufferFloat32AtomicAdd);
    public static final long OFFSET$shaderBufferFloat64Atomics = LAYOUT.byteOffset(PATH$shaderBufferFloat64Atomics);
    public static final long OFFSET$shaderBufferFloat64AtomicAdd = LAYOUT.byteOffset(PATH$shaderBufferFloat64AtomicAdd);
    public static final long OFFSET$shaderSharedFloat32Atomics = LAYOUT.byteOffset(PATH$shaderSharedFloat32Atomics);
    public static final long OFFSET$shaderSharedFloat32AtomicAdd = LAYOUT.byteOffset(PATH$shaderSharedFloat32AtomicAdd);
    public static final long OFFSET$shaderSharedFloat64Atomics = LAYOUT.byteOffset(PATH$shaderSharedFloat64Atomics);
    public static final long OFFSET$shaderSharedFloat64AtomicAdd = LAYOUT.byteOffset(PATH$shaderSharedFloat64AtomicAdd);
    public static final long OFFSET$shaderImageFloat32Atomics = LAYOUT.byteOffset(PATH$shaderImageFloat32Atomics);
    public static final long OFFSET$shaderImageFloat32AtomicAdd = LAYOUT.byteOffset(PATH$shaderImageFloat32AtomicAdd);
    public static final long OFFSET$sparseImageFloat32Atomics = LAYOUT.byteOffset(PATH$sparseImageFloat32Atomics);
    public static final long OFFSET$sparseImageFloat32AtomicAdd = LAYOUT.byteOffset(PATH$sparseImageFloat32AtomicAdd);

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT);
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

    public @unsigned int shaderBufferFloat32Atomics() {
        return segment.get(LAYOUT$shaderBufferFloat32Atomics, OFFSET$shaderBufferFloat32Atomics);
    }

    public void shaderBufferFloat32Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat32Atomics, OFFSET$shaderBufferFloat32Atomics, value);
    }

    public @unsigned int shaderBufferFloat32AtomicAdd() {
        return segment.get(LAYOUT$shaderBufferFloat32AtomicAdd, OFFSET$shaderBufferFloat32AtomicAdd);
    }

    public void shaderBufferFloat32AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat32AtomicAdd, OFFSET$shaderBufferFloat32AtomicAdd, value);
    }

    public @unsigned int shaderBufferFloat64Atomics() {
        return segment.get(LAYOUT$shaderBufferFloat64Atomics, OFFSET$shaderBufferFloat64Atomics);
    }

    public void shaderBufferFloat64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat64Atomics, OFFSET$shaderBufferFloat64Atomics, value);
    }

    public @unsigned int shaderBufferFloat64AtomicAdd() {
        return segment.get(LAYOUT$shaderBufferFloat64AtomicAdd, OFFSET$shaderBufferFloat64AtomicAdd);
    }

    public void shaderBufferFloat64AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat64AtomicAdd, OFFSET$shaderBufferFloat64AtomicAdd, value);
    }

    public @unsigned int shaderSharedFloat32Atomics() {
        return segment.get(LAYOUT$shaderSharedFloat32Atomics, OFFSET$shaderSharedFloat32Atomics);
    }

    public void shaderSharedFloat32Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat32Atomics, OFFSET$shaderSharedFloat32Atomics, value);
    }

    public @unsigned int shaderSharedFloat32AtomicAdd() {
        return segment.get(LAYOUT$shaderSharedFloat32AtomicAdd, OFFSET$shaderSharedFloat32AtomicAdd);
    }

    public void shaderSharedFloat32AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat32AtomicAdd, OFFSET$shaderSharedFloat32AtomicAdd, value);
    }

    public @unsigned int shaderSharedFloat64Atomics() {
        return segment.get(LAYOUT$shaderSharedFloat64Atomics, OFFSET$shaderSharedFloat64Atomics);
    }

    public void shaderSharedFloat64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat64Atomics, OFFSET$shaderSharedFloat64Atomics, value);
    }

    public @unsigned int shaderSharedFloat64AtomicAdd() {
        return segment.get(LAYOUT$shaderSharedFloat64AtomicAdd, OFFSET$shaderSharedFloat64AtomicAdd);
    }

    public void shaderSharedFloat64AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat64AtomicAdd, OFFSET$shaderSharedFloat64AtomicAdd, value);
    }

    public @unsigned int shaderImageFloat32Atomics() {
        return segment.get(LAYOUT$shaderImageFloat32Atomics, OFFSET$shaderImageFloat32Atomics);
    }

    public void shaderImageFloat32Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderImageFloat32Atomics, OFFSET$shaderImageFloat32Atomics, value);
    }

    public @unsigned int shaderImageFloat32AtomicAdd() {
        return segment.get(LAYOUT$shaderImageFloat32AtomicAdd, OFFSET$shaderImageFloat32AtomicAdd);
    }

    public void shaderImageFloat32AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderImageFloat32AtomicAdd, OFFSET$shaderImageFloat32AtomicAdd, value);
    }

    public @unsigned int sparseImageFloat32Atomics() {
        return segment.get(LAYOUT$sparseImageFloat32Atomics, OFFSET$sparseImageFloat32Atomics);
    }

    public void sparseImageFloat32Atomics(@unsigned int value) {
        segment.set(LAYOUT$sparseImageFloat32Atomics, OFFSET$sparseImageFloat32Atomics, value);
    }

    public @unsigned int sparseImageFloat32AtomicAdd() {
        return segment.get(LAYOUT$sparseImageFloat32AtomicAdd, OFFSET$sparseImageFloat32AtomicAdd);
    }

    public void sparseImageFloat32AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$sparseImageFloat32AtomicAdd, OFFSET$sparseImageFloat32AtomicAdd, value);
    }


    public static final class VkPhysicalDeviceShaderAtomicFloatFeaturesEXTFactory implements IFactory<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> clazz() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceShaderAtomicFloatFeaturesEXTFactory FACTORY = new VkPhysicalDeviceShaderAtomicFloatFeaturesEXTFactory();
}

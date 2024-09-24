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

public record VkPhysicalDeviceShaderAtomicInt64Features(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferInt64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedInt64Atomics")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderBufferInt64Atomics = PathElement.groupElement("shaderBufferInt64Atomics");
    public static final PathElement PATH$shaderSharedInt64Atomics = PathElement.groupElement("shaderSharedInt64Atomics");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderBufferInt64Atomics = (OfInt) LAYOUT.select(PATH$shaderBufferInt64Atomics);
    public static final OfInt LAYOUT$shaderSharedInt64Atomics = (OfInt) LAYOUT.select(PATH$shaderSharedInt64Atomics);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderBufferInt64Atomics = LAYOUT.byteOffset(PATH$shaderBufferInt64Atomics);
    public static final long OFFSET$shaderSharedInt64Atomics = LAYOUT.byteOffset(PATH$shaderSharedInt64Atomics);

    public VkPhysicalDeviceShaderAtomicInt64Features(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES);
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

    public @unsigned int shaderBufferInt64Atomics() {
        return segment.get(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics);
    }

    public void shaderBufferInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics, value);
    }

    public @unsigned int shaderSharedInt64Atomics() {
        return segment.get(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics);
    }

    public void shaderSharedInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics, value);
    }


    public static final class VkPhysicalDeviceShaderAtomicInt64FeaturesFactory implements IFactory<VkPhysicalDeviceShaderAtomicInt64Features> {
        @Override
        public Class<VkPhysicalDeviceShaderAtomicInt64Features> clazz() {
            return VkPhysicalDeviceShaderAtomicInt64Features.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderAtomicInt64Features.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderAtomicInt64Features create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceShaderAtomicInt64Features createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderAtomicInt64Features(segment);
        }
    }

    public static final VkPhysicalDeviceShaderAtomicInt64FeaturesFactory FACTORY = new VkPhysicalDeviceShaderAtomicInt64FeaturesFactory();
}

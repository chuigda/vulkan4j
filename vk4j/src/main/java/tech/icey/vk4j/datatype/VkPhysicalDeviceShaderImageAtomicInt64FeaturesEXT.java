package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderImageInt64Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageInt64Atomics")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderImageInt64Atomics = PathElement.groupElement("shaderImageInt64Atomics");
    public static final PathElement PATH$sparseImageInt64Atomics = PathElement.groupElement("sparseImageInt64Atomics");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderImageInt64Atomics = (OfInt) LAYOUT.select(PATH$shaderImageInt64Atomics);
    public static final OfInt LAYOUT$sparseImageInt64Atomics = (OfInt) LAYOUT.select(PATH$sparseImageInt64Atomics);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderImageInt64Atomics = LAYOUT.byteOffset(PATH$shaderImageInt64Atomics);
    public static final long OFFSET$sparseImageInt64Atomics = LAYOUT.byteOffset(PATH$sparseImageInt64Atomics);

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT);
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

    public @unsigned int shaderImageInt64Atomics() {
        return segment.get(LAYOUT$shaderImageInt64Atomics, OFFSET$shaderImageInt64Atomics);
    }

    public void shaderImageInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderImageInt64Atomics, OFFSET$shaderImageInt64Atomics, value);
    }

    public @unsigned int sparseImageInt64Atomics() {
        return segment.get(LAYOUT$sparseImageInt64Atomics, OFFSET$sparseImageInt64Atomics);
    }

    public void sparseImageInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$sparseImageInt64Atomics, OFFSET$sparseImageInt64Atomics, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> clazz() {
            return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

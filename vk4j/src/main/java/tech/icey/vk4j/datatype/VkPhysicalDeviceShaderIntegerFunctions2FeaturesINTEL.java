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

public record VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderIntegerFunctions2")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderIntegerFunctions2 = PathElement.groupElement("shaderIntegerFunctions2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderIntegerFunctions2 = (OfInt) LAYOUT.select(PATH$shaderIntegerFunctions2);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderIntegerFunctions2 = LAYOUT.byteOffset(PATH$shaderIntegerFunctions2);

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL);
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

    public @unsigned int shaderIntegerFunctions2() {
        return segment.get(LAYOUT$shaderIntegerFunctions2, OFFSET$shaderIntegerFunctions2);
    }

    public void shaderIntegerFunctions2(@unsigned int value) {
        segment.set(LAYOUT$shaderIntegerFunctions2, OFFSET$shaderIntegerFunctions2, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> {
        @Override
        public Class<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> clazz() {
            return VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

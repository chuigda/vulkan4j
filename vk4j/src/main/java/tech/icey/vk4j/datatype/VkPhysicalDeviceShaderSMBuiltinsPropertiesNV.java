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

public record VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSMCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerSM")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderSMCount = PathElement.groupElement("shaderSMCount");
    public static final PathElement PATH$shaderWarpsPerSM = PathElement.groupElement("shaderWarpsPerSM");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderSMCount = (OfInt) LAYOUT.select(PATH$shaderSMCount);
    public static final OfInt LAYOUT$shaderWarpsPerSM = (OfInt) LAYOUT.select(PATH$shaderWarpsPerSM);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderSMCount = LAYOUT.byteOffset(PATH$shaderSMCount);
    public static final long OFFSET$shaderWarpsPerSM = LAYOUT.byteOffset(PATH$shaderWarpsPerSM);

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV);
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

    public @unsigned int shaderSMCount() {
        return segment.get(LAYOUT$shaderSMCount, OFFSET$shaderSMCount);
    }

    public void shaderSMCount(@unsigned int value) {
        segment.set(LAYOUT$shaderSMCount, OFFSET$shaderSMCount, value);
    }

    public @unsigned int shaderWarpsPerSM() {
        return segment.get(LAYOUT$shaderWarpsPerSM, OFFSET$shaderWarpsPerSM);
    }

    public void shaderWarpsPerSM(@unsigned int value) {
        segment.set(LAYOUT$shaderWarpsPerSM, OFFSET$shaderWarpsPerSM, value);
    }


    public static final class VkPhysicalDeviceShaderSMBuiltinsPropertiesNVFactory implements IFactory<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> {
        @Override
        public Class<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> clazz() {
            return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment);
        }
    }

    public static final VkPhysicalDeviceShaderSMBuiltinsPropertiesNVFactory FACTORY = new VkPhysicalDeviceShaderSMBuiltinsPropertiesNVFactory();
}

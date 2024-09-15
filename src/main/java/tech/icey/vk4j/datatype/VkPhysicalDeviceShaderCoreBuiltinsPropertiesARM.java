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

public record VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("shaderCoreMask"),
        ValueLayout.JAVA_INT.withName("shaderCoreCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerCore")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$shaderCoreMask = PathElement.groupElement(2);
    public static final PathElement PATH$shaderCoreCount = PathElement.groupElement(3);
    public static final PathElement PATH$shaderWarpsPerCore = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$shaderCoreMask = (OfLong) LAYOUT.select(PATH$shaderCoreMask);
    public static final OfInt LAYOUT$shaderCoreCount = (OfInt) LAYOUT.select(PATH$shaderCoreCount);
    public static final OfInt LAYOUT$shaderWarpsPerCore = (OfInt) LAYOUT.select(PATH$shaderWarpsPerCore);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderCoreMask = LAYOUT.byteOffset(PATH$shaderCoreMask);
    public static final long OFFSET$shaderCoreCount = LAYOUT.byteOffset(PATH$shaderCoreCount);
    public static final long OFFSET$shaderWarpsPerCore = LAYOUT.byteOffset(PATH$shaderWarpsPerCore);

    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM);
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

    public @unsigned long shaderCoreMask() {
        return segment.get(LAYOUT$shaderCoreMask, OFFSET$shaderCoreMask);
    }

    public void shaderCoreMask(@unsigned long value) {
        segment.set(LAYOUT$shaderCoreMask, OFFSET$shaderCoreMask, value);
    }

    public @unsigned int shaderCoreCount() {
        return segment.get(LAYOUT$shaderCoreCount, OFFSET$shaderCoreCount);
    }

    public void shaderCoreCount(@unsigned int value) {
        segment.set(LAYOUT$shaderCoreCount, OFFSET$shaderCoreCount, value);
    }

    public @unsigned int shaderWarpsPerCore() {
        return segment.get(LAYOUT$shaderWarpsPerCore, OFFSET$shaderWarpsPerCore);
    }

    public void shaderWarpsPerCore(@unsigned int value) {
        segment.set(LAYOUT$shaderWarpsPerCore, OFFSET$shaderWarpsPerCore, value);
    }


    public static final class VkPhysicalDeviceShaderCoreBuiltinsPropertiesARMFactory implements IDataTypeFactory<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> {
        @Override
        public Class<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> clazz() {
            return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment);
        }
    }

    public static final VkPhysicalDeviceShaderCoreBuiltinsPropertiesARMFactory FACTORY = new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARMFactory();
}

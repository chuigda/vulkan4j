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

public record VkPhysicalDeviceShaderCorePropertiesARM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pixelRate"),
        ValueLayout.JAVA_INT.withName("texelRate"),
        ValueLayout.JAVA_INT.withName("fmaRate")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pixelRate = PathElement.groupElement(2);
    public static final PathElement PATH$texelRate = PathElement.groupElement(3);
    public static final PathElement PATH$fmaRate = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pixelRate = (OfInt) LAYOUT.select(PATH$pixelRate);
    public static final OfInt LAYOUT$texelRate = (OfInt) LAYOUT.select(PATH$texelRate);
    public static final OfInt LAYOUT$fmaRate = (OfInt) LAYOUT.select(PATH$fmaRate);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pixelRate = LAYOUT.byteOffset(PATH$pixelRate);
    public static final long OFFSET$texelRate = LAYOUT.byteOffset(PATH$texelRate);
    public static final long OFFSET$fmaRate = LAYOUT.byteOffset(PATH$fmaRate);

    public VkPhysicalDeviceShaderCorePropertiesARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM);
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

    public @unsigned int pixelRate() {
        return segment.get(LAYOUT$pixelRate, OFFSET$pixelRate);
    }

    public void pixelRate(@unsigned int value) {
        segment.set(LAYOUT$pixelRate, OFFSET$pixelRate, value);
    }

    public @unsigned int texelRate() {
        return segment.get(LAYOUT$texelRate, OFFSET$texelRate);
    }

    public void texelRate(@unsigned int value) {
        segment.set(LAYOUT$texelRate, OFFSET$texelRate, value);
    }

    public @unsigned int fmaRate() {
        return segment.get(LAYOUT$fmaRate, OFFSET$fmaRate);
    }

    public void fmaRate(@unsigned int value) {
        segment.set(LAYOUT$fmaRate, OFFSET$fmaRate, value);
    }


    public static final class VkPhysicalDeviceShaderCorePropertiesARMFactory implements IDataTypeFactory<VkPhysicalDeviceShaderCorePropertiesARM> {
        @Override
        public Class<VkPhysicalDeviceShaderCorePropertiesARM> clazz() {
            return VkPhysicalDeviceShaderCorePropertiesARM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderCorePropertiesARM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderCorePropertiesARM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShaderCorePropertiesARM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderCorePropertiesARM(segment);
        }
    }

    public static final VkPhysicalDeviceShaderCorePropertiesARMFactory FACTORY = new VkPhysicalDeviceShaderCorePropertiesARMFactory();
}
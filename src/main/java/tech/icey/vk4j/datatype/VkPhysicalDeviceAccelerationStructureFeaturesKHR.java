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

public record VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructure"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCaptureReplay"),
        ValueLayout.JAVA_INT.withName("accelerationStructureIndirectBuild"),
        ValueLayout.JAVA_INT.withName("accelerationStructureHostCommands"),
        ValueLayout.JAVA_INT.withName("descriptorBindingAccelerationStructureUpdateAfterBind")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement(2);
    public static final PathElement PATH$accelerationStructureCaptureReplay = PathElement.groupElement(3);
    public static final PathElement PATH$accelerationStructureIndirectBuild = PathElement.groupElement(4);
    public static final PathElement PATH$accelerationStructureHostCommands = PathElement.groupElement(5);
    public static final PathElement PATH$descriptorBindingAccelerationStructureUpdateAfterBind = PathElement.groupElement(6);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$accelerationStructure = (OfInt) LAYOUT.select(PATH$accelerationStructure);
    public static final OfInt LAYOUT$accelerationStructureCaptureReplay = (OfInt) LAYOUT.select(PATH$accelerationStructureCaptureReplay);
    public static final OfInt LAYOUT$accelerationStructureIndirectBuild = (OfInt) LAYOUT.select(PATH$accelerationStructureIndirectBuild);
    public static final OfInt LAYOUT$accelerationStructureHostCommands = (OfInt) LAYOUT.select(PATH$accelerationStructureHostCommands);
    public static final OfInt LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingAccelerationStructureUpdateAfterBind);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
    public static final long OFFSET$accelerationStructureCaptureReplay = LAYOUT.byteOffset(PATH$accelerationStructureCaptureReplay);
    public static final long OFFSET$accelerationStructureIndirectBuild = LAYOUT.byteOffset(PATH$accelerationStructureIndirectBuild);
    public static final long OFFSET$accelerationStructureHostCommands = LAYOUT.byteOffset(PATH$accelerationStructureHostCommands);
    public static final long OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingAccelerationStructureUpdateAfterBind);

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR);
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

    public @unsigned int accelerationStructure() {
        return segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
    }

    public void accelerationStructure(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);
    }

    public @unsigned int accelerationStructureCaptureReplay() {
        return segment.get(LAYOUT$accelerationStructureCaptureReplay, OFFSET$accelerationStructureCaptureReplay);
    }

    public void accelerationStructureCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureCaptureReplay, OFFSET$accelerationStructureCaptureReplay, value);
    }

    public @unsigned int accelerationStructureIndirectBuild() {
        return segment.get(LAYOUT$accelerationStructureIndirectBuild, OFFSET$accelerationStructureIndirectBuild);
    }

    public void accelerationStructureIndirectBuild(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureIndirectBuild, OFFSET$accelerationStructureIndirectBuild, value);
    }

    public @unsigned int accelerationStructureHostCommands() {
        return segment.get(LAYOUT$accelerationStructureHostCommands, OFFSET$accelerationStructureHostCommands);
    }

    public void accelerationStructureHostCommands(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureHostCommands, OFFSET$accelerationStructureHostCommands, value);
    }

    public @unsigned int descriptorBindingAccelerationStructureUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind);
    }

    public void descriptorBindingAccelerationStructureUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind, value);
    }


    public static final class VkPhysicalDeviceAccelerationStructureFeaturesKHRFactory implements IDataTypeFactory<VkPhysicalDeviceAccelerationStructureFeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceAccelerationStructureFeaturesKHR> clazz() {
            return VkPhysicalDeviceAccelerationStructureFeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceAccelerationStructureFeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceAccelerationStructureFeaturesKHRFactory FACTORY = new VkPhysicalDeviceAccelerationStructureFeaturesKHRFactory();
}

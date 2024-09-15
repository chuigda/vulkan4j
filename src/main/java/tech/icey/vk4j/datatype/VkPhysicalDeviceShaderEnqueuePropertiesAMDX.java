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

public record VkPhysicalDeviceShaderEnqueuePropertiesAMDX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphDepth"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderOutputNodes"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadCount"),
        ValueLayout.JAVA_INT.withName("executionGraphDispatchAddressAlignment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$maxExecutionGraphDepth = PathElement.groupElement(2);
    public static final PathElement PATH$maxExecutionGraphShaderOutputNodes = PathElement.groupElement(3);
    public static final PathElement PATH$maxExecutionGraphShaderPayloadSize = PathElement.groupElement(4);
    public static final PathElement PATH$maxExecutionGraphShaderPayloadCount = PathElement.groupElement(5);
    public static final PathElement PATH$executionGraphDispatchAddressAlignment = PathElement.groupElement(6);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxExecutionGraphDepth = (OfInt) LAYOUT.select(PATH$maxExecutionGraphDepth);
    public static final OfInt LAYOUT$maxExecutionGraphShaderOutputNodes = (OfInt) LAYOUT.select(PATH$maxExecutionGraphShaderOutputNodes);
    public static final OfInt LAYOUT$maxExecutionGraphShaderPayloadSize = (OfInt) LAYOUT.select(PATH$maxExecutionGraphShaderPayloadSize);
    public static final OfInt LAYOUT$maxExecutionGraphShaderPayloadCount = (OfInt) LAYOUT.select(PATH$maxExecutionGraphShaderPayloadCount);
    public static final OfInt LAYOUT$executionGraphDispatchAddressAlignment = (OfInt) LAYOUT.select(PATH$executionGraphDispatchAddressAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxExecutionGraphDepth = LAYOUT.byteOffset(PATH$maxExecutionGraphDepth);
    public static final long OFFSET$maxExecutionGraphShaderOutputNodes = LAYOUT.byteOffset(PATH$maxExecutionGraphShaderOutputNodes);
    public static final long OFFSET$maxExecutionGraphShaderPayloadSize = LAYOUT.byteOffset(PATH$maxExecutionGraphShaderPayloadSize);
    public static final long OFFSET$maxExecutionGraphShaderPayloadCount = LAYOUT.byteOffset(PATH$maxExecutionGraphShaderPayloadCount);
    public static final long OFFSET$executionGraphDispatchAddressAlignment = LAYOUT.byteOffset(PATH$executionGraphDispatchAddressAlignment);

    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX);
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

    public @unsigned int maxExecutionGraphDepth() {
        return segment.get(LAYOUT$maxExecutionGraphDepth, OFFSET$maxExecutionGraphDepth);
    }

    public void maxExecutionGraphDepth(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphDepth, OFFSET$maxExecutionGraphDepth, value);
    }

    public @unsigned int maxExecutionGraphShaderOutputNodes() {
        return segment.get(LAYOUT$maxExecutionGraphShaderOutputNodes, OFFSET$maxExecutionGraphShaderOutputNodes);
    }

    public void maxExecutionGraphShaderOutputNodes(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphShaderOutputNodes, OFFSET$maxExecutionGraphShaderOutputNodes, value);
    }

    public @unsigned int maxExecutionGraphShaderPayloadSize() {
        return segment.get(LAYOUT$maxExecutionGraphShaderPayloadSize, OFFSET$maxExecutionGraphShaderPayloadSize);
    }

    public void maxExecutionGraphShaderPayloadSize(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphShaderPayloadSize, OFFSET$maxExecutionGraphShaderPayloadSize, value);
    }

    public @unsigned int maxExecutionGraphShaderPayloadCount() {
        return segment.get(LAYOUT$maxExecutionGraphShaderPayloadCount, OFFSET$maxExecutionGraphShaderPayloadCount);
    }

    public void maxExecutionGraphShaderPayloadCount(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphShaderPayloadCount, OFFSET$maxExecutionGraphShaderPayloadCount, value);
    }

    public @unsigned int executionGraphDispatchAddressAlignment() {
        return segment.get(LAYOUT$executionGraphDispatchAddressAlignment, OFFSET$executionGraphDispatchAddressAlignment);
    }

    public void executionGraphDispatchAddressAlignment(@unsigned int value) {
        segment.set(LAYOUT$executionGraphDispatchAddressAlignment, OFFSET$executionGraphDispatchAddressAlignment, value);
    }


    public static final class VkPhysicalDeviceShaderEnqueuePropertiesAMDXFactory implements IDataTypeFactory<VkPhysicalDeviceShaderEnqueuePropertiesAMDX> {
        @Override
        public Class<VkPhysicalDeviceShaderEnqueuePropertiesAMDX> clazz() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment);
        }
    }

    public static final VkPhysicalDeviceShaderEnqueuePropertiesAMDXFactory FACTORY = new VkPhysicalDeviceShaderEnqueuePropertiesAMDXFactory();
}

package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceRawAccessChainsFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderRawAccessChains")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderRawAccessChains = PathElement.groupElement("shaderRawAccessChains");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderRawAccessChains = (OfInt) LAYOUT.select(PATH$shaderRawAccessChains);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderRawAccessChains = LAYOUT.byteOffset(PATH$shaderRawAccessChains);

    public VkPhysicalDeviceRawAccessChainsFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV);
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

    public @unsigned int shaderRawAccessChains() {
        return segment.get(LAYOUT$shaderRawAccessChains, OFFSET$shaderRawAccessChains);
    }

    public void shaderRawAccessChains(@unsigned int value) {
        segment.set(LAYOUT$shaderRawAccessChains, OFFSET$shaderRawAccessChains, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceRawAccessChainsFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceRawAccessChainsFeaturesNV> clazz() {
            return VkPhysicalDeviceRawAccessChainsFeaturesNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRawAccessChainsFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRawAccessChainsFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceRawAccessChainsFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRawAccessChainsFeaturesNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

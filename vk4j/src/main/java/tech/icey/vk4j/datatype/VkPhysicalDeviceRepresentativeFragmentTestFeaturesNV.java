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

public record VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("representativeFragmentTest")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$representativeFragmentTest = PathElement.groupElement("representativeFragmentTest");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$representativeFragmentTest = (OfInt) LAYOUT.select(PATH$representativeFragmentTest);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$representativeFragmentTest = LAYOUT.byteOffset(PATH$representativeFragmentTest);

    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV);
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

    public @unsigned int representativeFragmentTest() {
        return segment.get(LAYOUT$representativeFragmentTest, OFFSET$representativeFragmentTest);
    }

    public void representativeFragmentTest(@unsigned int value) {
        segment.set(LAYOUT$representativeFragmentTest, OFFSET$representativeFragmentTest, value);
    }


    public static final class VkPhysicalDeviceRepresentativeFragmentTestFeaturesNVFactory implements IFactory<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> clazz() {
            return VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceRepresentativeFragmentTestFeaturesNVFactory FACTORY = new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNVFactory();
}

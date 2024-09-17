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

public record VkPhysicalDeviceFeatures2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkPhysicalDeviceFeatures.LAYOUT.withName("features")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$features = PathElement.groupElement("features");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$features = (StructLayout) LAYOUT.select(PATH$features);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$features = LAYOUT.byteOffset(PATH$features);

    public VkPhysicalDeviceFeatures2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2);
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

    public VkPhysicalDeviceFeatures features() {
        return new VkPhysicalDeviceFeatures(segment.asSlice(OFFSET$features, LAYOUT$features));
    }

    public void features(VkPhysicalDeviceFeatures value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$features, LAYOUT$features.byteSize());
    }


    public static final class VkPhysicalDeviceFeatures2Factory implements IDataTypeFactory<VkPhysicalDeviceFeatures2> {
        @Override
        public Class<VkPhysicalDeviceFeatures2> clazz() {
            return VkPhysicalDeviceFeatures2.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFeatures2.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFeatures2 create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceFeatures2 createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFeatures2(segment);
        }
    }

    public static final VkPhysicalDeviceFeatures2Factory FACTORY = new VkPhysicalDeviceFeatures2Factory();
}

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

public record VkPhysicalDevice16BitStorageFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant16"),
        ValueLayout.JAVA_INT.withName("storageInputOutput16")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$storageBuffer16BitAccess = PathElement.groupElement(2);
    public static final PathElement PATH$uniformAndStorageBuffer16BitAccess = PathElement.groupElement(3);
    public static final PathElement PATH$storagePushConstant16 = PathElement.groupElement(4);
    public static final PathElement PATH$storageInputOutput16 = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$storageBuffer16BitAccess = (OfInt) LAYOUT.select(PATH$storageBuffer16BitAccess);
    public static final OfInt LAYOUT$uniformAndStorageBuffer16BitAccess = (OfInt) LAYOUT.select(PATH$uniformAndStorageBuffer16BitAccess);
    public static final OfInt LAYOUT$storagePushConstant16 = (OfInt) LAYOUT.select(PATH$storagePushConstant16);
    public static final OfInt LAYOUT$storageInputOutput16 = (OfInt) LAYOUT.select(PATH$storageInputOutput16);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffer16BitAccess = LAYOUT.byteOffset(PATH$storageBuffer16BitAccess);
    public static final long OFFSET$uniformAndStorageBuffer16BitAccess = LAYOUT.byteOffset(PATH$uniformAndStorageBuffer16BitAccess);
    public static final long OFFSET$storagePushConstant16 = LAYOUT.byteOffset(PATH$storagePushConstant16);
    public static final long OFFSET$storageInputOutput16 = LAYOUT.byteOffset(PATH$storageInputOutput16);

    public VkPhysicalDevice16BitStorageFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES);
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

    public @unsigned int storageBuffer16BitAccess() {
        return segment.get(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess);
    }

    public void storageBuffer16BitAccess(@unsigned int value) {
        segment.set(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess, value);
    }

    public @unsigned int uniformAndStorageBuffer16BitAccess() {
        return segment.get(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess);
    }

    public void uniformAndStorageBuffer16BitAccess(@unsigned int value) {
        segment.set(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess, value);
    }

    public @unsigned int storagePushConstant16() {
        return segment.get(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16);
    }

    public void storagePushConstant16(@unsigned int value) {
        segment.set(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16, value);
    }

    public @unsigned int storageInputOutput16() {
        return segment.get(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16);
    }

    public void storageInputOutput16(@unsigned int value) {
        segment.set(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16, value);
    }


    public static final class VkPhysicalDevice16BitStorageFeaturesFactory implements IDataTypeFactory<VkPhysicalDevice16BitStorageFeatures> {
        @Override
        public Class<VkPhysicalDevice16BitStorageFeatures> clazz() {
            return VkPhysicalDevice16BitStorageFeatures.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDevice16BitStorageFeatures.LAYOUT;
        }

        @Override
        public VkPhysicalDevice16BitStorageFeatures create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDevice16BitStorageFeatures createUninit(MemorySegment segment) {
            return new VkPhysicalDevice16BitStorageFeatures(segment);
        }
    }

    public static final VkPhysicalDevice16BitStorageFeaturesFactory FACTORY = new VkPhysicalDevice16BitStorageFeaturesFactory();
}

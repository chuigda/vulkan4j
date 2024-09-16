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

public record VkBindImageMemoryDeviceGroupInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDeviceIndices"),
        ValueLayout.JAVA_INT.withName("splitInstanceBindRegionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pSplitInstanceBindRegions")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$deviceIndexCount = PathElement.groupElement(2);
    public static final PathElement PATH$pDeviceIndices = PathElement.groupElement(3);
    public static final PathElement PATH$splitInstanceBindRegionCount = PathElement.groupElement(4);
    public static final PathElement PATH$pSplitInstanceBindRegions = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceIndexCount = (OfInt) LAYOUT.select(PATH$deviceIndexCount);
    public static final AddressLayout LAYOUT$pDeviceIndices = (AddressLayout) LAYOUT.select(PATH$pDeviceIndices);
    public static final OfInt LAYOUT$splitInstanceBindRegionCount = (OfInt) LAYOUT.select(PATH$splitInstanceBindRegionCount);
    public static final AddressLayout LAYOUT$pSplitInstanceBindRegions = (AddressLayout) LAYOUT.select(PATH$pSplitInstanceBindRegions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceIndexCount = LAYOUT.byteOffset(PATH$deviceIndexCount);
    public static final long OFFSET$pDeviceIndices = LAYOUT.byteOffset(PATH$pDeviceIndices);
    public static final long OFFSET$splitInstanceBindRegionCount = LAYOUT.byteOffset(PATH$splitInstanceBindRegionCount);
    public static final long OFFSET$pSplitInstanceBindRegions = LAYOUT.byteOffset(PATH$pSplitInstanceBindRegions);

    public VkBindImageMemoryDeviceGroupInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO);
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

    public @unsigned int deviceIndexCount() {
        return segment.get(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount);
    }

    public void deviceIndexCount(@unsigned int value) {
        segment.set(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pDeviceIndicesRaw() {
        return segment.get(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices);
    }

    public void pDeviceIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices, value);
    }
    
    public @unsigned IntPtr pDeviceIndices() {
        return new IntPtr(pDeviceIndicesRaw());
    }

    public void pDeviceIndices(@unsigned IntPtr value) {
        pDeviceIndicesRaw(value.segment());
    }

    public @unsigned int splitInstanceBindRegionCount() {
        return segment.get(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount);
    }

    public void splitInstanceBindRegionCount(@unsigned int value) {
        segment.set(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pSplitInstanceBindRegionsRaw() {
        return segment.get(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions);
    }

    public void pSplitInstanceBindRegionsRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions, value);
    }
    
    public @nullable VkRect2D pSplitInstanceBindRegions() {
        MemorySegment s = pSplitInstanceBindRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pSplitInstanceBindRegions(@nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSplitInstanceBindRegionsRaw(s);
    }


    public static final class VkBindImageMemoryDeviceGroupInfoFactory implements IDataTypeFactory<VkBindImageMemoryDeviceGroupInfo> {
        @Override
        public Class<VkBindImageMemoryDeviceGroupInfo> clazz() {
            return VkBindImageMemoryDeviceGroupInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBindImageMemoryDeviceGroupInfo.LAYOUT;
        }

        @Override
        public VkBindImageMemoryDeviceGroupInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBindImageMemoryDeviceGroupInfo createUninit(MemorySegment segment) {
            return new VkBindImageMemoryDeviceGroupInfo(segment);
        }
    }

    public static final VkBindImageMemoryDeviceGroupInfoFactory FACTORY = new VkBindImageMemoryDeviceGroupInfoFactory();
}

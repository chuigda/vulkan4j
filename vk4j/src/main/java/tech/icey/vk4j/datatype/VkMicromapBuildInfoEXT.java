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

public record VkMicromapBuildInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.ADDRESS.withName("dstMicromap"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT).withName("pUsageCounts"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT)).withName("ppUsageCounts"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
        VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("triangleArray"),
        ValueLayout.JAVA_LONG.withName("triangleArrayStride")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");
    public static final PathElement PATH$dstMicromap = PathElement.groupElement("dstMicromap");
    public static final PathElement PATH$usageCountsCount = PathElement.groupElement("usageCountsCount");
    public static final PathElement PATH$pUsageCounts = PathElement.groupElement("pUsageCounts");
    public static final PathElement PATH$ppUsageCounts = PathElement.groupElement("ppUsageCounts");
    public static final PathElement PATH$data = PathElement.groupElement("data");
    public static final PathElement PATH$scratchData = PathElement.groupElement("scratchData");
    public static final PathElement PATH$triangleArray = PathElement.groupElement("triangleArray");
    public static final PathElement PATH$triangleArrayStride = PathElement.groupElement("triangleArrayStride");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final AddressLayout LAYOUT$dstMicromap = (AddressLayout) LAYOUT.select(PATH$dstMicromap);
    public static final OfInt LAYOUT$usageCountsCount = (OfInt) LAYOUT.select(PATH$usageCountsCount);
    public static final AddressLayout LAYOUT$pUsageCounts = (AddressLayout) LAYOUT.select(PATH$pUsageCounts);
    public static final AddressLayout LAYOUT$ppUsageCounts = (AddressLayout) LAYOUT.select(PATH$ppUsageCounts);
    public static final UnionLayout LAYOUT$data = (UnionLayout) LAYOUT.select(PATH$data);
    public static final UnionLayout LAYOUT$scratchData = (UnionLayout) LAYOUT.select(PATH$scratchData);
    public static final UnionLayout LAYOUT$triangleArray = (UnionLayout) LAYOUT.select(PATH$triangleArray);
    public static final OfLong LAYOUT$triangleArrayStride = (OfLong) LAYOUT.select(PATH$triangleArrayStride);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$dstMicromap = LAYOUT.byteOffset(PATH$dstMicromap);
    public static final long OFFSET$usageCountsCount = LAYOUT.byteOffset(PATH$usageCountsCount);
    public static final long OFFSET$pUsageCounts = LAYOUT.byteOffset(PATH$pUsageCounts);
    public static final long OFFSET$ppUsageCounts = LAYOUT.byteOffset(PATH$ppUsageCounts);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
    public static final long OFFSET$scratchData = LAYOUT.byteOffset(PATH$scratchData);
    public static final long OFFSET$triangleArray = LAYOUT.byteOffset(PATH$triangleArray);
    public static final long OFFSET$triangleArrayStride = LAYOUT.byteOffset(PATH$triangleArrayStride);

    public VkMicromapBuildInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT);
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

    public @enumtype(VkMicromapTypeEXT.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkMicromapTypeEXT.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @enumtype(VkBuildMicromapFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkBuildMicromapFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkBuildMicromapModeEXT.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkBuildMicromapModeEXT.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public VkMicromapEXT dstMicromap() {
        return new VkMicromapEXT(segment.asSlice(OFFSET$dstMicromap, LAYOUT$dstMicromap));
    }

    public void dstMicromap(VkMicromapEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstMicromap, LAYOUT$dstMicromap.byteSize());
    }

    public @unsigned int usageCountsCount() {
        return segment.get(LAYOUT$usageCountsCount, OFFSET$usageCountsCount);
    }

    public void usageCountsCount(@unsigned int value) {
        segment.set(LAYOUT$usageCountsCount, OFFSET$usageCountsCount, value);
    }

    public @pointer(comment="VkMicromapUsageEXT*") MemorySegment pUsageCountsRaw() {
        return segment.get(LAYOUT$pUsageCounts, OFFSET$pUsageCounts);
    }

    public void pUsageCountsRaw(@pointer(comment="VkMicromapUsageEXT*") MemorySegment value) {
        segment.set(LAYOUT$pUsageCounts, OFFSET$pUsageCounts, value);
    }
    
    public @nullable VkMicromapUsageEXT pUsageCounts() {
        MemorySegment s = pUsageCountsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkMicromapUsageEXT(s);
    }

    public void pUsageCounts(@nullable VkMicromapUsageEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pUsageCountsRaw(s);
    }

    public @pointer(comment="void**") MemorySegment ppUsageCounts() {
        return segment.get(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts);
    }

    public void ppUsageCounts(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts, value);
    }

    public VkDeviceOrHostAddressConstKHR data() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, LAYOUT$data.byteSize());
    }

    public VkDeviceOrHostAddressKHR scratchData() {
        return new VkDeviceOrHostAddressKHR(segment.asSlice(OFFSET$scratchData, LAYOUT$scratchData));
    }

    public void scratchData(VkDeviceOrHostAddressKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$scratchData, LAYOUT$scratchData.byteSize());
    }

    public VkDeviceOrHostAddressConstKHR triangleArray() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$triangleArray, LAYOUT$triangleArray));
    }

    public void triangleArray(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$triangleArray, LAYOUT$triangleArray.byteSize());
    }

    public @unsigned long triangleArrayStride() {
        return segment.get(LAYOUT$triangleArrayStride, OFFSET$triangleArrayStride);
    }

    public void triangleArrayStride(@unsigned long value) {
        segment.set(LAYOUT$triangleArrayStride, OFFSET$triangleArrayStride, value);
    }


    public static final class VkMicromapBuildInfoEXTFactory implements IFactory<VkMicromapBuildInfoEXT> {
        @Override
        public Class<VkMicromapBuildInfoEXT> clazz() {
            return VkMicromapBuildInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMicromapBuildInfoEXT.LAYOUT;
        }

        @Override
        public VkMicromapBuildInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkMicromapBuildInfoEXT createUninit(MemorySegment segment) {
            return new VkMicromapBuildInfoEXT(segment);
        }
    }

    public static final VkMicromapBuildInfoEXTFactory FACTORY = new VkMicromapBuildInfoEXTFactory();
}

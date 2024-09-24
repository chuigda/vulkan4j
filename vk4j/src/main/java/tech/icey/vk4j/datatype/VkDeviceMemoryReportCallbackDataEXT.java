package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDeviceMemoryReportCallbackDataEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("memoryObjectId"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.JAVA_INT.withName("heapIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$memoryObjectId = PathElement.groupElement("memoryObjectId");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$objectType = PathElement.groupElement("objectType");
    public static final PathElement PATH$objectHandle = PathElement.groupElement("objectHandle");
    public static final PathElement PATH$heapIndex = PathElement.groupElement("heapIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$memoryObjectId = (OfLong) LAYOUT.select(PATH$memoryObjectId);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$objectType = (OfInt) LAYOUT.select(PATH$objectType);
    public static final OfLong LAYOUT$objectHandle = (OfLong) LAYOUT.select(PATH$objectHandle);
    public static final OfInt LAYOUT$heapIndex = (OfInt) LAYOUT.select(PATH$heapIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$memoryObjectId = LAYOUT.byteOffset(PATH$memoryObjectId);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$objectType = LAYOUT.byteOffset(PATH$objectType);
    public static final long OFFSET$objectHandle = LAYOUT.byteOffset(PATH$objectHandle);
    public static final long OFFSET$heapIndex = LAYOUT.byteOffset(PATH$heapIndex);

    public VkDeviceMemoryReportCallbackDataEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT);
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

    public @enumtype(VkDeviceMemoryReportFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDeviceMemoryReportFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkDeviceMemoryReportEventTypeEXT.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkDeviceMemoryReportEventTypeEXT.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned long memoryObjectId() {
        return segment.get(LAYOUT$memoryObjectId, OFFSET$memoryObjectId);
    }

    public void memoryObjectId(@unsigned long value) {
        segment.set(LAYOUT$memoryObjectId, OFFSET$memoryObjectId, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkObjectType.class) int objectType() {
        return segment.get(LAYOUT$objectType, OFFSET$objectType);
    }

    public void objectType(@enumtype(VkObjectType.class) int value) {
        segment.set(LAYOUT$objectType, OFFSET$objectType, value);
    }

    public @unsigned long objectHandle() {
        return segment.get(LAYOUT$objectHandle, OFFSET$objectHandle);
    }

    public void objectHandle(@unsigned long value) {
        segment.set(LAYOUT$objectHandle, OFFSET$objectHandle, value);
    }

    public @unsigned int heapIndex() {
        return segment.get(LAYOUT$heapIndex, OFFSET$heapIndex);
    }

    public void heapIndex(@unsigned int value) {
        segment.set(LAYOUT$heapIndex, OFFSET$heapIndex, value);
    }


    public static final class Factory implements IFactory<VkDeviceMemoryReportCallbackDataEXT> {
        @Override
        public Class<VkDeviceMemoryReportCallbackDataEXT> clazz() {
            return VkDeviceMemoryReportCallbackDataEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDeviceMemoryReportCallbackDataEXT.LAYOUT;
        }

        @Override
        public VkDeviceMemoryReportCallbackDataEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDeviceMemoryReportCallbackDataEXT createUninit(MemorySegment segment) {
            return new VkDeviceMemoryReportCallbackDataEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

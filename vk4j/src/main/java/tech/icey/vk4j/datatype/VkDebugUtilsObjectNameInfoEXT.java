package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDebugUtilsObjectNameInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pObjectName")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$objectType = PathElement.groupElement("objectType");
    public static final PathElement PATH$objectHandle = PathElement.groupElement("objectHandle");
    public static final PathElement PATH$pObjectName = PathElement.groupElement("pObjectName");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$objectType = (OfInt) LAYOUT.select(PATH$objectType);
    public static final OfLong LAYOUT$objectHandle = (OfLong) LAYOUT.select(PATH$objectHandle);
    public static final AddressLayout LAYOUT$pObjectName = (AddressLayout) LAYOUT.select(PATH$pObjectName);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$objectType = LAYOUT.byteOffset(PATH$objectType);
    public static final long OFFSET$objectHandle = LAYOUT.byteOffset(PATH$objectHandle);
    public static final long OFFSET$pObjectName = LAYOUT.byteOffset(PATH$pObjectName);

    public VkDebugUtilsObjectNameInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT);
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

    public @pointer(comment="int8_t*") MemorySegment pObjectNameRaw() {
        return segment.get(LAYOUT$pObjectName, OFFSET$pObjectName);
    }

    public void pObjectNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pObjectName, OFFSET$pObjectName, value);
    }

    public BytePtr pObjectName() {
        return new BytePtr(pObjectNameRaw());
    }

    public void pObjectName(BytePtr value) {
        pObjectNameRaw(value.segment());
    }


    public static final class Factory implements IFactory<VkDebugUtilsObjectNameInfoEXT> {
        @Override
        public Class<VkDebugUtilsObjectNameInfoEXT> clazz() {
            return VkDebugUtilsObjectNameInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDebugUtilsObjectNameInfoEXT.LAYOUT;
        }

        @Override
        public VkDebugUtilsObjectNameInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDebugUtilsObjectNameInfoEXT createUninit(MemorySegment segment) {
            return new VkDebugUtilsObjectNameInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

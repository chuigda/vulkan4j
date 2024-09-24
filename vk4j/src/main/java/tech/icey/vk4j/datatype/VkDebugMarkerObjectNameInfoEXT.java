package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDebugMarkerObjectNameInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("object"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pObjectName")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$objectType = PathElement.groupElement("objectType");
    public static final PathElement PATH$object = PathElement.groupElement("object");
    public static final PathElement PATH$pObjectName = PathElement.groupElement("pObjectName");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$objectType = (OfInt) LAYOUT.select(PATH$objectType);
    public static final OfLong LAYOUT$object = (OfLong) LAYOUT.select(PATH$object);
    public static final AddressLayout LAYOUT$pObjectName = (AddressLayout) LAYOUT.select(PATH$pObjectName);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$objectType = LAYOUT.byteOffset(PATH$objectType);
    public static final long OFFSET$object = LAYOUT.byteOffset(PATH$object);
    public static final long OFFSET$pObjectName = LAYOUT.byteOffset(PATH$pObjectName);

    public VkDebugMarkerObjectNameInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT);
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

    public @enumtype(VkDebugReportObjectTypeEXT.class) int objectType() {
        return segment.get(LAYOUT$objectType, OFFSET$objectType);
    }

    public void objectType(@enumtype(VkDebugReportObjectTypeEXT.class) int value) {
        segment.set(LAYOUT$objectType, OFFSET$objectType, value);
    }

    public @unsigned long object() {
        return segment.get(LAYOUT$object, OFFSET$object);
    }

    public void object(@unsigned long value) {
        segment.set(LAYOUT$object, OFFSET$object, value);
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


    public static final class Factory implements IFactory<VkDebugMarkerObjectNameInfoEXT> {
        @Override
        public Class<VkDebugMarkerObjectNameInfoEXT> clazz() {
            return VkDebugMarkerObjectNameInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDebugMarkerObjectNameInfoEXT.LAYOUT;
        }

        @Override
        public VkDebugMarkerObjectNameInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDebugMarkerObjectNameInfoEXT createUninit(MemorySegment segment) {
            return new VkDebugMarkerObjectNameInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

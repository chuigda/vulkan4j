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

public record VkPhysicalDeviceDrmPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasPrimary"),
        ValueLayout.JAVA_INT.withName("hasRender"),
        ValueLayout.JAVA_LONG.withName("primaryMajor"),
        ValueLayout.JAVA_LONG.withName("primaryMinor"),
        ValueLayout.JAVA_LONG.withName("renderMajor"),
        ValueLayout.JAVA_LONG.withName("renderMinor")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$hasPrimary = PathElement.groupElement("hasPrimary");
    public static final PathElement PATH$hasRender = PathElement.groupElement("hasRender");
    public static final PathElement PATH$primaryMajor = PathElement.groupElement("primaryMajor");
    public static final PathElement PATH$primaryMinor = PathElement.groupElement("primaryMinor");
    public static final PathElement PATH$renderMajor = PathElement.groupElement("renderMajor");
    public static final PathElement PATH$renderMinor = PathElement.groupElement("renderMinor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$hasPrimary = (OfInt) LAYOUT.select(PATH$hasPrimary);
    public static final OfInt LAYOUT$hasRender = (OfInt) LAYOUT.select(PATH$hasRender);
    public static final OfLong LAYOUT$primaryMajor = (OfLong) LAYOUT.select(PATH$primaryMajor);
    public static final OfLong LAYOUT$primaryMinor = (OfLong) LAYOUT.select(PATH$primaryMinor);
    public static final OfLong LAYOUT$renderMajor = (OfLong) LAYOUT.select(PATH$renderMajor);
    public static final OfLong LAYOUT$renderMinor = (OfLong) LAYOUT.select(PATH$renderMinor);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$hasPrimary = LAYOUT.byteOffset(PATH$hasPrimary);
    public static final long OFFSET$hasRender = LAYOUT.byteOffset(PATH$hasRender);
    public static final long OFFSET$primaryMajor = LAYOUT.byteOffset(PATH$primaryMajor);
    public static final long OFFSET$primaryMinor = LAYOUT.byteOffset(PATH$primaryMinor);
    public static final long OFFSET$renderMajor = LAYOUT.byteOffset(PATH$renderMajor);
    public static final long OFFSET$renderMinor = LAYOUT.byteOffset(PATH$renderMinor);

    public VkPhysicalDeviceDrmPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT);
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

    public @unsigned int hasPrimary() {
        return segment.get(LAYOUT$hasPrimary, OFFSET$hasPrimary);
    }

    public void hasPrimary(@unsigned int value) {
        segment.set(LAYOUT$hasPrimary, OFFSET$hasPrimary, value);
    }

    public @unsigned int hasRender() {
        return segment.get(LAYOUT$hasRender, OFFSET$hasRender);
    }

    public void hasRender(@unsigned int value) {
        segment.set(LAYOUT$hasRender, OFFSET$hasRender, value);
    }

    public long primaryMajor() {
        return segment.get(LAYOUT$primaryMajor, OFFSET$primaryMajor);
    }

    public void primaryMajor(long value) {
        segment.set(LAYOUT$primaryMajor, OFFSET$primaryMajor, value);
    }

    public long primaryMinor() {
        return segment.get(LAYOUT$primaryMinor, OFFSET$primaryMinor);
    }

    public void primaryMinor(long value) {
        segment.set(LAYOUT$primaryMinor, OFFSET$primaryMinor, value);
    }

    public long renderMajor() {
        return segment.get(LAYOUT$renderMajor, OFFSET$renderMajor);
    }

    public void renderMajor(long value) {
        segment.set(LAYOUT$renderMajor, OFFSET$renderMajor, value);
    }

    public long renderMinor() {
        return segment.get(LAYOUT$renderMinor, OFFSET$renderMinor);
    }

    public void renderMinor(long value) {
        segment.set(LAYOUT$renderMinor, OFFSET$renderMinor, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceDrmPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceDrmPropertiesEXT> clazz() {
            return VkPhysicalDeviceDrmPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDrmPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDrmPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceDrmPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDrmPropertiesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

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

public record VkImageViewUsageCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("usage")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$usage = (OfInt) LAYOUT.select(PATH$usage);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);

    public VkImageViewUsageCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO);
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

    public @enumtype(VkImageUsageFlags.class) int usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public void usage(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
    }


    public static final class VkImageViewUsageCreateInfoFactory implements IFactory<VkImageViewUsageCreateInfo> {
        @Override
        public Class<VkImageViewUsageCreateInfo> clazz() {
            return VkImageViewUsageCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageViewUsageCreateInfo.LAYOUT;
        }

        @Override
        public VkImageViewUsageCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImageViewUsageCreateInfo createUninit(MemorySegment segment) {
            return new VkImageViewUsageCreateInfo(segment);
        }
    }

    public static final VkImageViewUsageCreateInfoFactory FACTORY = new VkImageViewUsageCreateInfoFactory();
}

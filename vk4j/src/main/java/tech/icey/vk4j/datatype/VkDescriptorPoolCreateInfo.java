package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.nullable;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.bitmask.VkDescriptorPoolCreateFlags;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO;

public record VkDescriptorPoolCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxSets"),
        ValueLayout.JAVA_INT.withName("poolSizeCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorPoolSize.LAYOUT).withName("pPoolSizes")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$maxSets = PathElement.groupElement("maxSets");
    public static final PathElement PATH$poolSizeCount = PathElement.groupElement("poolSizeCount");
    public static final PathElement PATH$pPoolSizes = PathElement.groupElement("pPoolSizes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$maxSets = (OfInt) LAYOUT.select(PATH$maxSets);
    public static final OfInt LAYOUT$poolSizeCount = (OfInt) LAYOUT.select(PATH$poolSizeCount);
    public static final AddressLayout LAYOUT$pPoolSizes = (AddressLayout) LAYOUT.select(PATH$pPoolSizes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$maxSets = LAYOUT.byteOffset(PATH$maxSets);
    public static final long OFFSET$poolSizeCount = LAYOUT.byteOffset(PATH$poolSizeCount);
    public static final long OFFSET$pPoolSizes = LAYOUT.byteOffset(PATH$pPoolSizes);

    public VkDescriptorPoolCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO);
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

    public @enumtype(VkDescriptorPoolCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorPoolCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int maxSets() {
        return segment.get(LAYOUT$maxSets, OFFSET$maxSets);
    }

    public void maxSets(@unsigned int value) {
        segment.set(LAYOUT$maxSets, OFFSET$maxSets, value);
    }

    public @unsigned int poolSizeCount() {
        return segment.get(LAYOUT$poolSizeCount, OFFSET$poolSizeCount);
    }

    public void poolSizeCount(@unsigned int value) {
        segment.set(LAYOUT$poolSizeCount, OFFSET$poolSizeCount, value);
    }

    public @pointer(comment="VkDescriptorPoolSize*") MemorySegment pPoolSizesRaw() {
        return segment.get(LAYOUT$pPoolSizes, OFFSET$pPoolSizes);
    }

    public void pPoolSizesRaw(@pointer(comment="VkDescriptorPoolSize*") MemorySegment value) {
        segment.set(LAYOUT$pPoolSizes, OFFSET$pPoolSizes, value);
    }

    public @nullable VkDescriptorPoolSize pPoolSizes() {
        MemorySegment s = pPoolSizesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorPoolSize(s);
    }

    public void pPoolSizes(@nullable VkDescriptorPoolSize value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPoolSizesRaw(s);
    }


    public static final class Factory implements IFactory<VkDescriptorPoolCreateInfo> {
        @Override
        public Class<VkDescriptorPoolCreateInfo> clazz() {
            return VkDescriptorPoolCreateInfo.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDescriptorPoolCreateInfo.LAYOUT;
        }

        @Override
        public VkDescriptorPoolCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorPoolCreateInfo createUninit(MemorySegment segment) {
            return new VkDescriptorPoolCreateInfo(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

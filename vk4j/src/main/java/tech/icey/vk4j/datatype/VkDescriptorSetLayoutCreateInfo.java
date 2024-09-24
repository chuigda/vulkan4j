package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDescriptorSetLayoutCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutBinding.LAYOUT).withName("pBindings")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$bindingCount = PathElement.groupElement("bindingCount");
    public static final PathElement PATH$pBindings = PathElement.groupElement("pBindings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$bindingCount = (OfInt) LAYOUT.select(PATH$bindingCount);
    public static final AddressLayout LAYOUT$pBindings = (AddressLayout) LAYOUT.select(PATH$pBindings);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$bindingCount = LAYOUT.byteOffset(PATH$bindingCount);
    public static final long OFFSET$pBindings = LAYOUT.byteOffset(PATH$pBindings);

    public VkDescriptorSetLayoutCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
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

    public @enumtype(VkDescriptorSetLayoutCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorSetLayoutCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int bindingCount() {
        return segment.get(LAYOUT$bindingCount, OFFSET$bindingCount);
    }

    public void bindingCount(@unsigned int value) {
        segment.set(LAYOUT$bindingCount, OFFSET$bindingCount, value);
    }

    public @pointer(comment="VkDescriptorSetLayoutBinding*") MemorySegment pBindingsRaw() {
        return segment.get(LAYOUT$pBindings, OFFSET$pBindings);
    }

    public void pBindingsRaw(@pointer(comment="VkDescriptorSetLayoutBinding*") MemorySegment value) {
        segment.set(LAYOUT$pBindings, OFFSET$pBindings, value);
    }

    public @nullable VkDescriptorSetLayoutBinding pBindings() {
        MemorySegment s = pBindingsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSetLayoutBinding(s);
    }

    public void pBindings(@nullable VkDescriptorSetLayoutBinding value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindingsRaw(s);
    }


    public static final class Factory implements IFactory<VkDescriptorSetLayoutCreateInfo> {
        @Override
        public Class<VkDescriptorSetLayoutCreateInfo> clazz() {
            return VkDescriptorSetLayoutCreateInfo.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDescriptorSetLayoutCreateInfo.LAYOUT;
        }

        @Override
        public VkDescriptorSetLayoutCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorSetLayoutCreateInfo createUninit(MemorySegment segment) {
            return new VkDescriptorSetLayoutCreateInfo(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

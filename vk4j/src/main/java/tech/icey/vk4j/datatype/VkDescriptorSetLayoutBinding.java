package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkDescriptorSetLayoutBinding(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pImmutableSamplers")
    );

    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("descriptorType");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("descriptorCount");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("stageFlags");
    public static final PathElement PATH$pImmutableSamplers = PathElement.groupElement("pImmutableSamplers");

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$descriptorType = (OfInt) LAYOUT.select(PATH$descriptorType);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final AddressLayout LAYOUT$pImmutableSamplers = (AddressLayout) LAYOUT.select(PATH$pImmutableSamplers);

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$pImmutableSamplers = LAYOUT.byteOffset(PATH$pImmutableSamplers);

    public VkDescriptorSetLayoutBinding(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @enumtype(VkDescriptorType.class) int descriptorType() {
        return segment.get(LAYOUT$descriptorType, OFFSET$descriptorType);
    }

    public void descriptorType(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);
    }

    public @unsigned int descriptorCount() {
        return segment.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);
    }

    public void descriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);
    }

    public @enumtype(VkShaderStageFlags.class) int stageFlags() {
        return segment.get(LAYOUT$stageFlags, OFFSET$stageFlags);
    }

    public void stageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);
    }

    public @pointer(comment="VkSampler*") MemorySegment pImmutableSamplersRaw() {
        return segment.get(LAYOUT$pImmutableSamplers, OFFSET$pImmutableSamplers);
    }

    public void pImmutableSamplersRaw(@pointer(comment="VkSampler*") MemorySegment value) {
        segment.set(LAYOUT$pImmutableSamplers, OFFSET$pImmutableSamplers, value);
    }

    public @nullable VkSampler pImmutableSamplers() {
        MemorySegment s = pImmutableSamplersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSampler(s);
    }

    public void pImmutableSamplers(@nullable VkSampler value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImmutableSamplersRaw(s);
    }


    public static final class Factory implements IFactory<VkDescriptorSetLayoutBinding> {
        @Override
        public Class<VkDescriptorSetLayoutBinding> clazz() {
            return VkDescriptorSetLayoutBinding.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDescriptorSetLayoutBinding.LAYOUT;
        }

        @Override
        public VkDescriptorSetLayoutBinding create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorSetLayoutBinding createUninit(MemorySegment segment) {
            return new VkDescriptorSetLayoutBinding(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

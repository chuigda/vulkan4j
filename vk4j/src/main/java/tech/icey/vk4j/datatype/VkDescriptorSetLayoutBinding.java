package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.bitmask.VkShaderStageFlags;
import tech.icey.vk4j.enumtype.VkDescriptorType;
import tech.icey.vk4j.handle.VkSampler;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef struct VkDescriptorSetLayoutBinding {
///     uint32_t binding;
///     VkDescriptorType descriptorType;
///     uint32_t descriptorCount;
///     VkShaderStageFlags stageFlags;
///     const VkSampler* pImmutableSamplers;
/// } VkDescriptorSetLayoutBinding;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorSetLayoutBinding.html">VkDescriptorSetLayoutBinding</a>
public record VkDescriptorSetLayoutBinding(MemorySegment segment) implements IPointer {
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

    public @pointer(comment="VkSampler") MemorySegment pImmutableSamplersRaw() {
        return segment.get(LAYOUT$pImmutableSamplers, OFFSET$pImmutableSamplers);
    }

    public void pImmutableSamplersRaw(@pointer(comment="VkSampler") MemorySegment value) {
        segment.set(LAYOUT$pImmutableSamplers, OFFSET$pImmutableSamplers, value);
    }

    /// Note: the returned {@link VkSampler.Buffer} does not have correct
    /// {@link VkSampler.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkSampler.Buffer#reinterpret} to set the size before actually
    /// {@link VkSampler.Buffer#read}ing or {@link VkSampler.Buffer#write}ing
    /// the buffer.
    public @nullable VkSampler.Buffer pImmutableSamplers() {
        MemorySegment s = pImmutableSamplersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSampler.Buffer(s);
    }

    public void pImmutableSamplers(@nullable VkSampler.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImmutableSamplersRaw(s);
    }

    public static VkDescriptorSetLayoutBinding allocate(Arena arena) {
        return new VkDescriptorSetLayoutBinding(arena.allocate(LAYOUT));
    }

    public static VkDescriptorSetLayoutBinding[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutBinding[] ret = new VkDescriptorSetLayoutBinding[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorSetLayoutBinding(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorSetLayoutBinding clone(Arena arena, VkDescriptorSetLayoutBinding src) {
        VkDescriptorSetLayoutBinding ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetLayoutBinding[] clone(Arena arena, VkDescriptorSetLayoutBinding[] src) {
        VkDescriptorSetLayoutBinding[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pImmutableSamplers")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$descriptorType = LAYOUT$descriptorType.byteSize();
    public static final long SIZE$descriptorCount = LAYOUT$descriptorCount.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$pImmutableSamplers = LAYOUT$pImmutableSamplers.byteSize();
}

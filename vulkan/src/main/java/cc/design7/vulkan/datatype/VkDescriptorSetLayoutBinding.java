package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkDescriptorSetLayoutBinding(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$binding = ValueLayout.JAVA_INT.withName("binding");
    public static final OfInt LAYOUT$descriptorType = ValueLayout.JAVA_INT.withName("descriptorType");
    public static final OfInt LAYOUT$descriptorCount = ValueLayout.JAVA_INT.withName("descriptorCount");
    public static final OfInt LAYOUT$stageFlags = ValueLayout.JAVA_INT.withName("stageFlags");
    public static final AddressLayout LAYOUT$pImmutableSamplers = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pImmutableSamplers");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$binding, LAYOUT$descriptorType, LAYOUT$descriptorCount, LAYOUT$stageFlags, LAYOUT$pImmutableSamplers);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDescriptorSetLayoutBinding allocate(Arena arena) {
        return new VkDescriptorSetLayoutBinding(arena.allocate(LAYOUT));
    }

    public static VkDescriptorSetLayoutBinding[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutBinding[] ret = new VkDescriptorSetLayoutBinding[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$binding = PathElement.groupElement("PATH$binding");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("PATH$descriptorType");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("PATH$descriptorCount");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("PATH$stageFlags");
    public static final PathElement PATH$pImmutableSamplers = PathElement.groupElement("PATH$pImmutableSamplers");

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$descriptorType = LAYOUT$descriptorType.byteSize();
    public static final long SIZE$descriptorCount = LAYOUT$descriptorCount.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$pImmutableSamplers = LAYOUT$pImmutableSamplers.byteSize();

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$pImmutableSamplers = LAYOUT.byteOffset(PATH$pImmutableSamplers);

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

    /// Note: the returned {@link VkSampler.Buffer} does not have correct {@link VkSampler.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSampler.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSampler.Buffer pImmutableSamplers() {
        MemorySegment s = pImmutableSamplersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSampler.Buffer(s);
    }


}
/// dummy, not implemented yet

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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyDescriptorSet.html">VkCopyDescriptorSet</a>
@ValueBasedCandidate
public record VkCopyDescriptorSet(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$srcSet = ValueLayout.ADDRESS.withName("srcSet");
    public static final OfInt LAYOUT$srcBinding = ValueLayout.JAVA_INT.withName("srcBinding");
    public static final OfInt LAYOUT$srcArrayElement = ValueLayout.JAVA_INT.withName("srcArrayElement");
    public static final AddressLayout LAYOUT$dstSet = ValueLayout.ADDRESS.withName("dstSet");
    public static final OfInt LAYOUT$dstBinding = ValueLayout.JAVA_INT.withName("dstBinding");
    public static final OfInt LAYOUT$dstArrayElement = ValueLayout.JAVA_INT.withName("dstArrayElement");
    public static final OfInt LAYOUT$descriptorCount = ValueLayout.JAVA_INT.withName("descriptorCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$srcSet, LAYOUT$srcBinding, LAYOUT$srcArrayElement, LAYOUT$dstSet, LAYOUT$dstBinding, LAYOUT$dstArrayElement, LAYOUT$descriptorCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCopyDescriptorSet allocate(Arena arena) {
        return new VkCopyDescriptorSet(arena.allocate(LAYOUT));
    }

    public static VkCopyDescriptorSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyDescriptorSet[] ret = new VkCopyDescriptorSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCopyDescriptorSet(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCopyDescriptorSet clone(Arena arena, VkCopyDescriptorSet src) {
        VkCopyDescriptorSet ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCopyDescriptorSet[] clone(Arena arena, VkCopyDescriptorSet[] src) {
        VkCopyDescriptorSet[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcSet = PathElement.groupElement("PATH$srcSet");
    public static final PathElement PATH$srcBinding = PathElement.groupElement("PATH$srcBinding");
    public static final PathElement PATH$srcArrayElement = PathElement.groupElement("PATH$srcArrayElement");
    public static final PathElement PATH$dstSet = PathElement.groupElement("PATH$dstSet");
    public static final PathElement PATH$dstBinding = PathElement.groupElement("PATH$dstBinding");
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement("PATH$dstArrayElement");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("PATH$descriptorCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcSet = LAYOUT$srcSet.byteSize();
    public static final long SIZE$srcBinding = LAYOUT$srcBinding.byteSize();
    public static final long SIZE$srcArrayElement = LAYOUT$srcArrayElement.byteSize();
    public static final long SIZE$dstSet = LAYOUT$dstSet.byteSize();
    public static final long SIZE$dstBinding = LAYOUT$dstBinding.byteSize();
    public static final long SIZE$dstArrayElement = LAYOUT$dstArrayElement.byteSize();
    public static final long SIZE$descriptorCount = LAYOUT$descriptorCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSet = LAYOUT.byteOffset(PATH$srcSet);
    public static final long OFFSET$srcBinding = LAYOUT.byteOffset(PATH$srcBinding);
    public static final long OFFSET$srcArrayElement = LAYOUT.byteOffset(PATH$srcArrayElement);
    public static final long OFFSET$dstSet = LAYOUT.byteOffset(PATH$dstSet);
    public static final long OFFSET$dstBinding = LAYOUT.byteOffset(PATH$dstBinding);
    public static final long OFFSET$dstArrayElement = LAYOUT.byteOffset(PATH$dstArrayElement);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @Nullable VkDescriptorSet srcSet() {
        MemorySegment s = segment.asSlice(OFFSET$srcSet, SIZE$srcSet);
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSet(s);
    }

    public void srcSet() {
        segment.set(LAYOUT$srcSet, OFFSET$srcSet, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int srcBinding() {
        return segment.get(LAYOUT$srcBinding, OFFSET$srcBinding);
    }

    public void srcBinding(@unsigned int value) {
        segment.set(LAYOUT$srcBinding, OFFSET$srcBinding, value);
    }

    public @unsigned int srcArrayElement() {
        return segment.get(LAYOUT$srcArrayElement, OFFSET$srcArrayElement);
    }

    public void srcArrayElement(@unsigned int value) {
        segment.set(LAYOUT$srcArrayElement, OFFSET$srcArrayElement, value);
    }

    public @Nullable VkDescriptorSet dstSet() {
        MemorySegment s = segment.asSlice(OFFSET$dstSet, SIZE$dstSet);
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSet(s);
    }

    public void dstSet() {
        segment.set(LAYOUT$dstSet, OFFSET$dstSet, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int dstBinding() {
        return segment.get(LAYOUT$dstBinding, OFFSET$dstBinding);
    }

    public void dstBinding(@unsigned int value) {
        segment.set(LAYOUT$dstBinding, OFFSET$dstBinding, value);
    }

    public @unsigned int dstArrayElement() {
        return segment.get(LAYOUT$dstArrayElement, OFFSET$dstArrayElement);
    }

    public void dstArrayElement(@unsigned int value) {
        segment.set(LAYOUT$dstArrayElement, OFFSET$dstArrayElement, value);
    }

    public @unsigned int descriptorCount() {
        return segment.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);
    }

    public void descriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);
    }

}

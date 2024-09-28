package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkCopyDescriptorSet {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorSet srcSet;
///     uint32_t srcBinding;
///     uint32_t srcArrayElement;
///     VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
/// } VkCopyDescriptorSet;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCopyDescriptorSet.html">VkCopyDescriptorSet</a>
public record VkCopyDescriptorSet(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("srcSet"),
        ValueLayout.JAVA_INT.withName("srcBinding"),
        ValueLayout.JAVA_INT.withName("srcArrayElement"),
        ValueLayout.ADDRESS.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$srcSet = PathElement.groupElement("srcSet");
    public static final PathElement PATH$srcBinding = PathElement.groupElement("srcBinding");
    public static final PathElement PATH$srcArrayElement = PathElement.groupElement("srcArrayElement");
    public static final PathElement PATH$dstSet = PathElement.groupElement("dstSet");
    public static final PathElement PATH$dstBinding = PathElement.groupElement("dstBinding");
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement("dstArrayElement");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("descriptorCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$srcSet = (AddressLayout) LAYOUT.select(PATH$srcSet);
    public static final OfInt LAYOUT$srcBinding = (OfInt) LAYOUT.select(PATH$srcBinding);
    public static final OfInt LAYOUT$srcArrayElement = (OfInt) LAYOUT.select(PATH$srcArrayElement);
    public static final AddressLayout LAYOUT$dstSet = (AddressLayout) LAYOUT.select(PATH$dstSet);
    public static final OfInt LAYOUT$dstBinding = (OfInt) LAYOUT.select(PATH$dstBinding);
    public static final OfInt LAYOUT$dstArrayElement = (OfInt) LAYOUT.select(PATH$dstArrayElement);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSet = LAYOUT.byteOffset(PATH$srcSet);
    public static final long OFFSET$srcBinding = LAYOUT.byteOffset(PATH$srcBinding);
    public static final long OFFSET$srcArrayElement = LAYOUT.byteOffset(PATH$srcArrayElement);
    public static final long OFFSET$dstSet = LAYOUT.byteOffset(PATH$dstSet);
    public static final long OFFSET$dstBinding = LAYOUT.byteOffset(PATH$dstBinding);
    public static final long OFFSET$dstArrayElement = LAYOUT.byteOffset(PATH$dstArrayElement);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcSet = LAYOUT$srcSet.byteSize();
    public static final long SIZE$srcBinding = LAYOUT$srcBinding.byteSize();
    public static final long SIZE$srcArrayElement = LAYOUT$srcArrayElement.byteSize();
    public static final long SIZE$dstSet = LAYOUT$dstSet.byteSize();
    public static final long SIZE$dstBinding = LAYOUT$dstBinding.byteSize();
    public static final long SIZE$dstArrayElement = LAYOUT$dstArrayElement.byteSize();
    public static final long SIZE$descriptorCount = LAYOUT$descriptorCount.byteSize();

    public VkCopyDescriptorSet(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public VkDescriptorSet srcSet() {
        return new VkDescriptorSet(segment.get(LAYOUT$srcSet, OFFSET$srcSet));
    }

    public void srcSet(VkDescriptorSet value) {
        segment.set(LAYOUT$srcSet, OFFSET$srcSet, value.segment());
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

    public VkDescriptorSet dstSet() {
        return new VkDescriptorSet(segment.get(LAYOUT$dstSet, OFFSET$dstSet));
    }

    public void dstSet(VkDescriptorSet value) {
        segment.set(LAYOUT$dstSet, OFFSET$dstSet, value.segment());
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

    public static VkCopyDescriptorSet allocate(Arena arena) {
        return new VkCopyDescriptorSet(arena.allocate(LAYOUT));
    }
    
    public static VkCopyDescriptorSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyDescriptorSet[] ret = new VkCopyDescriptorSet[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCopyDescriptorSet(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

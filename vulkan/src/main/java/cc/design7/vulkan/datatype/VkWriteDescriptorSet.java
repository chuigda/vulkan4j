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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWriteDescriptorSet.html">VkWriteDescriptorSet</a>
@ValueBasedCandidate
public record VkWriteDescriptorSet(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$dstSet = ValueLayout.ADDRESS.withName("dstSet");
    public static final OfInt LAYOUT$dstBinding = ValueLayout.JAVA_INT.withName("dstBinding");
    public static final OfInt LAYOUT$dstArrayElement = ValueLayout.JAVA_INT.withName("dstArrayElement");
    public static final OfInt LAYOUT$descriptorCount = ValueLayout.JAVA_INT.withName("descriptorCount");
    public static final OfInt LAYOUT$descriptorType = ValueLayout.JAVA_INT.withName("descriptorType");
    public static final AddressLayout LAYOUT$pImageInfo = ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pImageInfo");
    public static final AddressLayout LAYOUT$pBufferInfo = ValueLayout.ADDRESS.withTargetLayout(VkDescriptorBufferInfo.LAYOUT).withName("pBufferInfo");
    public static final AddressLayout LAYOUT$pTexelBufferView = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pTexelBufferView");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$dstSet, LAYOUT$dstBinding, LAYOUT$dstArrayElement, LAYOUT$descriptorCount, LAYOUT$descriptorType, LAYOUT$pImageInfo, LAYOUT$pBufferInfo, LAYOUT$pTexelBufferView);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkWriteDescriptorSet allocate(Arena arena) {
        return new VkWriteDescriptorSet(arena.allocate(LAYOUT));
    }

    public static VkWriteDescriptorSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWriteDescriptorSet[] ret = new VkWriteDescriptorSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkWriteDescriptorSet(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkWriteDescriptorSet clone(Arena arena, VkWriteDescriptorSet src) {
        VkWriteDescriptorSet ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkWriteDescriptorSet[] clone(Arena arena, VkWriteDescriptorSet[] src) {
        VkWriteDescriptorSet[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$dstSet = PathElement.groupElement("PATH$dstSet");
    public static final PathElement PATH$dstBinding = PathElement.groupElement("PATH$dstBinding");
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement("PATH$dstArrayElement");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("PATH$descriptorCount");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("PATH$descriptorType");
    public static final PathElement PATH$pImageInfo = PathElement.groupElement("PATH$pImageInfo");
    public static final PathElement PATH$pBufferInfo = PathElement.groupElement("PATH$pBufferInfo");
    public static final PathElement PATH$pTexelBufferView = PathElement.groupElement("PATH$pTexelBufferView");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$dstSet = LAYOUT$dstSet.byteSize();
    public static final long SIZE$dstBinding = LAYOUT$dstBinding.byteSize();
    public static final long SIZE$dstArrayElement = LAYOUT$dstArrayElement.byteSize();
    public static final long SIZE$descriptorCount = LAYOUT$descriptorCount.byteSize();
    public static final long SIZE$descriptorType = LAYOUT$descriptorType.byteSize();
    public static final long SIZE$pImageInfo = LAYOUT$pImageInfo.byteSize();
    public static final long SIZE$pBufferInfo = LAYOUT$pBufferInfo.byteSize();
    public static final long SIZE$pTexelBufferView = LAYOUT$pTexelBufferView.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dstSet = LAYOUT.byteOffset(PATH$dstSet);
    public static final long OFFSET$dstBinding = LAYOUT.byteOffset(PATH$dstBinding);
    public static final long OFFSET$dstArrayElement = LAYOUT.byteOffset(PATH$dstArrayElement);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$pImageInfo = LAYOUT.byteOffset(PATH$pImageInfo);
    public static final long OFFSET$pBufferInfo = LAYOUT.byteOffset(PATH$pBufferInfo);
    public static final long OFFSET$pTexelBufferView = LAYOUT.byteOffset(PATH$pTexelBufferView);

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

    public @enumtype(VkDescriptorType.class) int descriptorType() {
        return segment.get(LAYOUT$descriptorType, OFFSET$descriptorType);
    }

    public void descriptorType(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pImageInfoRaw() {
        return segment.get(LAYOUT$pImageInfo, OFFSET$pImageInfo);
    }

    public void pImageInfoRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pImageInfo, OFFSET$pImageInfo, value);
    }

    public @Nullable VkDescriptorImageInfo pImageInfo() {
        MemorySegment s = pImageInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pImageInfo(@Nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageInfoRaw(s);
    }

    @unsafe public @Nullable VkDescriptorImageInfo[] pImageInfo(int assumedCount) {
        MemorySegment s = pImageInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkDescriptorBufferInfo*") MemorySegment pBufferInfoRaw() {
        return segment.get(LAYOUT$pBufferInfo, OFFSET$pBufferInfo);
    }

    public void pBufferInfoRaw(@pointer(comment="VkDescriptorBufferInfo*") MemorySegment value) {
        segment.set(LAYOUT$pBufferInfo, OFFSET$pBufferInfo, value);
    }

    public @Nullable VkDescriptorBufferInfo pBufferInfo() {
        MemorySegment s = pBufferInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorBufferInfo(s);
    }

    public void pBufferInfo(@Nullable VkDescriptorBufferInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferInfoRaw(s);
    }

    @unsafe public @Nullable VkDescriptorBufferInfo[] pBufferInfo(int assumedCount) {
        MemorySegment s = pBufferInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorBufferInfo.SIZE);
        VkDescriptorBufferInfo[] ret = new VkDescriptorBufferInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorBufferInfo(s.asSlice(i * VkDescriptorBufferInfo.SIZE, VkDescriptorBufferInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkBufferView*") MemorySegment pTexelBufferViewRaw() {
        return segment.get(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView);
    }

    public void pTexelBufferViewRaw(@pointer(comment="VkBufferView*") MemorySegment value) {
        segment.set(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView, value);
    }

    /// Note: the returned {@link VkBufferView.Buffer} does not have correct {@link VkBufferView.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkBufferView.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkBufferView.Buffer pTexelBufferView() {
        MemorySegment s = pTexelBufferViewRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferView.Buffer(s);
    }


}

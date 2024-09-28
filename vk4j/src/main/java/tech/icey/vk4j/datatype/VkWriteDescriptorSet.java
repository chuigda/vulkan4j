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
/// typedef struct VkWriteDescriptorSet {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
///     VkDescriptorType descriptorType;
///     const VkDescriptorImageInfo* pImageInfo;
///     const VkDescriptorBufferInfo* pBufferInfo;
///     const VkBufferView* pTexelBufferView;
/// } VkWriteDescriptorSet;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkWriteDescriptorSet.html">VkWriteDescriptorSet</a>
public record VkWriteDescriptorSet(MemorySegment segment) implements IPointer {
    public VkWriteDescriptorSet(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET);
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
    
    public @nullable VkDescriptorImageInfo pImageInfo() {
        MemorySegment s = pImageInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkDescriptorImageInfo[] pImageInfo(int assumedCount) {
        MemorySegment s = pImageInfoRaw().reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] arr = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return arr;
    }

    public void pImageInfo(@nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageInfoRaw(s);
    }

    public @pointer(comment="VkDescriptorBufferInfo*") MemorySegment pBufferInfoRaw() {
        return segment.get(LAYOUT$pBufferInfo, OFFSET$pBufferInfo);
    }

    public void pBufferInfoRaw(@pointer(comment="VkDescriptorBufferInfo*") MemorySegment value) {
        segment.set(LAYOUT$pBufferInfo, OFFSET$pBufferInfo, value);
    }
    
    public @nullable VkDescriptorBufferInfo pBufferInfo() {
        MemorySegment s = pBufferInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorBufferInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkDescriptorBufferInfo[] pBufferInfo(int assumedCount) {
        MemorySegment s = pBufferInfoRaw().reinterpret(assumedCount * VkDescriptorBufferInfo.SIZE);
        VkDescriptorBufferInfo[] arr = new VkDescriptorBufferInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorBufferInfo(s.asSlice(i * VkDescriptorBufferInfo.SIZE, VkDescriptorBufferInfo.SIZE));
        }
        return arr;
    }

    public void pBufferInfo(@nullable VkDescriptorBufferInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferInfoRaw(s);
    }

    public @pointer(comment="VkBufferView") MemorySegment pTexelBufferViewRaw() {
        return segment.get(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView);
    }

    public void pTexelBufferViewRaw(@pointer(comment="VkBufferView") MemorySegment value) {
        segment.set(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView, value);
    }

    /// Note: the returned {@link VkBufferView.Buffer} does not have correct
    /// {@link VkBufferView.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkBufferView.Buffer#reinterpret} to set the size before actually
    /// {@link VkBufferView.Buffer#read}ing or {@link VkBufferView.Buffer#write}ing
    /// the buffer.
    public @nullable VkBufferView.Buffer pTexelBufferView() {
        MemorySegment s = pTexelBufferViewRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferView.Buffer(s);
    }

    public void pTexelBufferView(@nullable VkBufferView.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTexelBufferViewRaw(s);
    }

    public static VkWriteDescriptorSet allocate(Arena arena) {
        return new VkWriteDescriptorSet(arena.allocate(LAYOUT));
    }
    
    public static VkWriteDescriptorSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWriteDescriptorSet[] ret = new VkWriteDescriptorSet[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkWriteDescriptorSet(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pImageInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorBufferInfo.LAYOUT).withName("pBufferInfo"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pTexelBufferView")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$dstSet = PathElement.groupElement("dstSet");
    public static final PathElement PATH$dstBinding = PathElement.groupElement("dstBinding");
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement("dstArrayElement");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("descriptorCount");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("descriptorType");
    public static final PathElement PATH$pImageInfo = PathElement.groupElement("pImageInfo");
    public static final PathElement PATH$pBufferInfo = PathElement.groupElement("pBufferInfo");
    public static final PathElement PATH$pTexelBufferView = PathElement.groupElement("pTexelBufferView");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$dstSet = (AddressLayout) LAYOUT.select(PATH$dstSet);
    public static final OfInt LAYOUT$dstBinding = (OfInt) LAYOUT.select(PATH$dstBinding);
    public static final OfInt LAYOUT$dstArrayElement = (OfInt) LAYOUT.select(PATH$dstArrayElement);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);
    public static final OfInt LAYOUT$descriptorType = (OfInt) LAYOUT.select(PATH$descriptorType);
    public static final AddressLayout LAYOUT$pImageInfo = (AddressLayout) LAYOUT.select(PATH$pImageInfo);
    public static final AddressLayout LAYOUT$pBufferInfo = (AddressLayout) LAYOUT.select(PATH$pBufferInfo);
    public static final AddressLayout LAYOUT$pTexelBufferView = (AddressLayout) LAYOUT.select(PATH$pTexelBufferView);

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

}

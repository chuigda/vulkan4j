package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWriteDescriptorSet.html"><code>VkWriteDescriptorSet</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkWriteDescriptorSet {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
///     VkDescriptorType descriptorType;
///     VkDescriptorImageInfo const* pImageInfo;
///     VkDescriptorBufferInfo const* pBufferInfo;
///     VkBufferView const* pTexelBufferView;
/// } VkWriteDescriptorSet;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET`
///
/// The {@link VkWriteDescriptorSet#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkWriteDescriptorSet#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWriteDescriptorSet.html"><code>VkWriteDescriptorSet</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkWriteDescriptorSet(@NotNull MemorySegment segment) implements IPointer {
    public static VkWriteDescriptorSet allocate(Arena arena) {
        VkWriteDescriptorSet ret = new VkWriteDescriptorSet(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.WRITE_DESCRIPTOR_SET);
        return ret;
    }

    public static VkWriteDescriptorSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWriteDescriptorSet[] ret = new VkWriteDescriptorSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkWriteDescriptorSet(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.WRITE_DESCRIPTOR_SET);
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

    public void autoInit() {
        sType(VkStructureType.WRITE_DESCRIPTOR_SET);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Nullable VkDescriptorSet dstSet() {
        MemorySegment s = segment.asSlice(OFFSET$dstSet, SIZE$dstSet);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorSet(s);
    }

    public void dstSet(@Nullable VkDescriptorSet value) {
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
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.BYTES);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.BYTES, VkDescriptorImageInfo.BYTES));
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
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorBufferInfo.BYTES);
        VkDescriptorBufferInfo[] ret = new VkDescriptorBufferInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorBufferInfo(s.asSlice(i * VkDescriptorBufferInfo.BYTES, VkDescriptorBufferInfo.BYTES));
        }
        return ret;
    }

    public @pointer(comment="VkBufferView*") MemorySegment pTexelBufferViewRaw() {
        return segment.get(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView);
    }

    public void pTexelBufferViewRaw(@pointer(comment="VkBufferView*") MemorySegment value) {
        segment.set(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView, value);
    }

    /// Note: the returned {@link VkBufferView.Ptr} does not have correct {@link VkBufferView.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkBufferView.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkBufferView.Ptr pTexelBufferView() {
        MemorySegment s = pTexelBufferViewRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBufferView.Ptr(s);
    }

    public void pTexelBufferView(@Nullable VkBufferView.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTexelBufferViewRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

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
}

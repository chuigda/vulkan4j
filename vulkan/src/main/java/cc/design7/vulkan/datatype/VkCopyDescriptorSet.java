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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyDescriptorSet.html"><code>VkCopyDescriptorSet</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCopyDescriptorSet {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDescriptorSet srcSet;
///     uint32_t srcBinding;
///     uint32_t srcArrayElement;
///     VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
/// } VkCopyDescriptorSet;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET`
///
/// The {@link VkCopyDescriptorSet#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkCopyDescriptorSet#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyDescriptorSet.html"><code>VkCopyDescriptorSet</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCopyDescriptorSet(@NotNull MemorySegment segment) implements IPointer {
    public static VkCopyDescriptorSet allocate(Arena arena) {
        VkCopyDescriptorSet ret = new VkCopyDescriptorSet(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.COPY_DESCRIPTOR_SET);
        return ret;
    }

    public static VkCopyDescriptorSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyDescriptorSet[] ret = new VkCopyDescriptorSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCopyDescriptorSet(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.COPY_DESCRIPTOR_SET);
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

    public void autoInit() {
        sType(VkStructureType.COPY_DESCRIPTOR_SET);
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

    public @Nullable VkDescriptorSet srcSet() {
        MemorySegment s = segment.asSlice(OFFSET$srcSet, SIZE$srcSet);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorSet(s);
    }

    public void srcSet(@Nullable VkDescriptorSet value) {
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcSet = PathElement.groupElement("PATH$srcSet");
    public static final PathElement PATH$srcBinding = PathElement.groupElement("PATH$srcBinding");
    public static final PathElement PATH$srcArrayElement = PathElement.groupElement("PATH$srcArrayElement");
    public static final PathElement PATH$dstSet = PathElement.groupElement("PATH$dstSet");
    public static final PathElement PATH$dstBinding = PathElement.groupElement("PATH$dstBinding");
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement("PATH$dstArrayElement");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("PATH$descriptorCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$srcSet = (AddressLayout) LAYOUT.select(PATH$srcSet);
    public static final OfInt LAYOUT$srcBinding = (OfInt) LAYOUT.select(PATH$srcBinding);
    public static final OfInt LAYOUT$srcArrayElement = (OfInt) LAYOUT.select(PATH$srcArrayElement);
    public static final AddressLayout LAYOUT$dstSet = (AddressLayout) LAYOUT.select(PATH$dstSet);
    public static final OfInt LAYOUT$dstBinding = (OfInt) LAYOUT.select(PATH$dstBinding);
    public static final OfInt LAYOUT$dstArrayElement = (OfInt) LAYOUT.select(PATH$dstArrayElement);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);

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
}

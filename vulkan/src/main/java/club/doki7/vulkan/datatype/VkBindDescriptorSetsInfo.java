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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindDescriptorSetsInfo.html"><code>VkBindDescriptorSetsInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBindDescriptorSetsInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkShaderStageFlags stageFlags;
///     VkPipelineLayout layout; // optional
///     uint32_t firstSet; // optional
///     uint32_t descriptorSetCount;
///     VkDescriptorSet const* pDescriptorSets;
///     uint32_t dynamicOffsetCount; // optional
///     uint32_t const* pDynamicOffsets;
/// } VkBindDescriptorSetsInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO`
///
/// The {@link VkBindDescriptorSetsInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkBindDescriptorSetsInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindDescriptorSetsInfo.html"><code>VkBindDescriptorSetsInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBindDescriptorSetsInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkBindDescriptorSetsInfo allocate(Arena arena) {
        VkBindDescriptorSetsInfo ret = new VkBindDescriptorSetsInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BIND_DESCRIPTOR_SETS_INFO);
        return ret;
    }

    public static VkBindDescriptorSetsInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindDescriptorSetsInfo[] ret = new VkBindDescriptorSetsInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindDescriptorSetsInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.BIND_DESCRIPTOR_SETS_INFO);
        }
        return ret;
    }

    public static VkBindDescriptorSetsInfo clone(Arena arena, VkBindDescriptorSetsInfo src) {
        VkBindDescriptorSetsInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindDescriptorSetsInfo[] clone(Arena arena, VkBindDescriptorSetsInfo[] src) {
        VkBindDescriptorSetsInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BIND_DESCRIPTOR_SETS_INFO);
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

    public @enumtype(VkShaderStageFlags.class) int stageFlags() {
        return segment.get(LAYOUT$stageFlags, OFFSET$stageFlags);
    }

    public void stageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int firstSet() {
        return segment.get(LAYOUT$firstSet, OFFSET$firstSet);
    }

    public void firstSet(@unsigned int value) {
        segment.set(LAYOUT$firstSet, OFFSET$firstSet, value);
    }

    public @unsigned int descriptorSetCount() {
        return segment.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);
    }

    public void descriptorSetCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);
    }

    public @pointer(target=VkDescriptorSet.class) MemorySegment pDescriptorSetsRaw() {
        return segment.get(LAYOUT$pDescriptorSets, OFFSET$pDescriptorSets);
    }

    public void pDescriptorSetsRaw(@pointer(target=VkDescriptorSet.class) MemorySegment value) {
        segment.set(LAYOUT$pDescriptorSets, OFFSET$pDescriptorSets, value);
    }

    /// Note: the returned {@link VkDescriptorSet.Ptr} does not have correct {@link VkDescriptorSet.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDescriptorSet.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDescriptorSet.Ptr pDescriptorSets() {
        MemorySegment s = pDescriptorSetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorSet.Ptr(s);
    }

    public void pDescriptorSets(@Nullable VkDescriptorSet.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorSetsRaw(s);
    }

    public @unsigned int dynamicOffsetCount() {
        return segment.get(LAYOUT$dynamicOffsetCount, OFFSET$dynamicOffsetCount);
    }

    public void dynamicOffsetCount(@unsigned int value) {
        segment.set(LAYOUT$dynamicOffsetCount, OFFSET$dynamicOffsetCount, value);
    }

    public @pointer(comment="int*") MemorySegment pDynamicOffsetsRaw() {
        return segment.get(LAYOUT$pDynamicOffsets, OFFSET$pDynamicOffsets);
    }

    public void pDynamicOffsetsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pDynamicOffsets, OFFSET$pDynamicOffsets, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pDynamicOffsets() {
        MemorySegment s = pDynamicOffsetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDynamicOffsets(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDynamicOffsetsRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pDescriptorSets"),
        ValueLayout.JAVA_INT.withName("dynamicOffsetCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDynamicOffsets")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("PATH$stageFlags");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$firstSet = PathElement.groupElement("PATH$firstSet");
    public static final PathElement PATH$descriptorSetCount = PathElement.groupElement("PATH$descriptorSetCount");
    public static final PathElement PATH$pDescriptorSets = PathElement.groupElement("PATH$pDescriptorSets");
    public static final PathElement PATH$dynamicOffsetCount = PathElement.groupElement("PATH$dynamicOffsetCount");
    public static final PathElement PATH$pDynamicOffsets = PathElement.groupElement("PATH$pDynamicOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$firstSet = (OfInt) LAYOUT.select(PATH$firstSet);
    public static final OfInt LAYOUT$descriptorSetCount = (OfInt) LAYOUT.select(PATH$descriptorSetCount);
    public static final AddressLayout LAYOUT$pDescriptorSets = (AddressLayout) LAYOUT.select(PATH$pDescriptorSets);
    public static final OfInt LAYOUT$dynamicOffsetCount = (OfInt) LAYOUT.select(PATH$dynamicOffsetCount);
    public static final AddressLayout LAYOUT$pDynamicOffsets = (AddressLayout) LAYOUT.select(PATH$pDynamicOffsets);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$firstSet = LAYOUT$firstSet.byteSize();
    public static final long SIZE$descriptorSetCount = LAYOUT$descriptorSetCount.byteSize();
    public static final long SIZE$pDescriptorSets = LAYOUT$pDescriptorSets.byteSize();
    public static final long SIZE$dynamicOffsetCount = LAYOUT$dynamicOffsetCount.byteSize();
    public static final long SIZE$pDynamicOffsets = LAYOUT$pDynamicOffsets.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$firstSet = LAYOUT.byteOffset(PATH$firstSet);
    public static final long OFFSET$descriptorSetCount = LAYOUT.byteOffset(PATH$descriptorSetCount);
    public static final long OFFSET$pDescriptorSets = LAYOUT.byteOffset(PATH$pDescriptorSets);
    public static final long OFFSET$dynamicOffsetCount = LAYOUT.byteOffset(PATH$dynamicOffsetCount);
    public static final long OFFSET$pDynamicOffsets = LAYOUT.byteOffset(PATH$pDynamicOffsets);
}

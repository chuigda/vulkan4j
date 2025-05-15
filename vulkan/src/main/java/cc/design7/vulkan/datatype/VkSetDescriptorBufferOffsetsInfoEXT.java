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

/// Represents a pointer to a {@code VkSetDescriptorBufferOffsetsInfoEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSetDescriptorBufferOffsetsInfoEXT.html">VkSetDescriptorBufferOffsetsInfoEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSetDescriptorBufferOffsetsInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkSetDescriptorBufferOffsetsInfoEXT {
        sType(VkStructureType.SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT);
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT allocate(Arena arena) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSetDescriptorBufferOffsetsInfoEXT[] ret = new VkSetDescriptorBufferOffsetsInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSetDescriptorBufferOffsetsInfoEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT clone(Arena arena, VkSetDescriptorBufferOffsetsInfoEXT src) {
        VkSetDescriptorBufferOffsetsInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT[] clone(Arena arena, VkSetDescriptorBufferOffsetsInfoEXT[] src) {
        VkSetDescriptorBufferOffsetsInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("setCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pBufferIndices"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pOffsets")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("PATH$stageFlags");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$firstSet = PathElement.groupElement("PATH$firstSet");
    public static final PathElement PATH$setCount = PathElement.groupElement("PATH$setCount");
    public static final PathElement PATH$pBufferIndices = PathElement.groupElement("PATH$pBufferIndices");
    public static final PathElement PATH$pOffsets = PathElement.groupElement("PATH$pOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$firstSet = (OfInt) LAYOUT.select(PATH$firstSet);
    public static final OfInt LAYOUT$setCount = (OfInt) LAYOUT.select(PATH$setCount);
    public static final AddressLayout LAYOUT$pBufferIndices = (AddressLayout) LAYOUT.select(PATH$pBufferIndices);
    public static final AddressLayout LAYOUT$pOffsets = (AddressLayout) LAYOUT.select(PATH$pOffsets);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$firstSet = LAYOUT$firstSet.byteSize();
    public static final long SIZE$setCount = LAYOUT$setCount.byteSize();
    public static final long SIZE$pBufferIndices = LAYOUT$pBufferIndices.byteSize();
    public static final long SIZE$pOffsets = LAYOUT$pOffsets.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$firstSet = LAYOUT.byteOffset(PATH$firstSet);
    public static final long OFFSET$setCount = LAYOUT.byteOffset(PATH$setCount);
    public static final long OFFSET$pBufferIndices = LAYOUT.byteOffset(PATH$pBufferIndices);
    public static final long OFFSET$pOffsets = LAYOUT.byteOffset(PATH$pOffsets);

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

    public @enumtype(VkShaderStageFlags.class) int stageFlags() {
        return segment.get(LAYOUT$stageFlags, OFFSET$stageFlags);
    }

    public void stageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.address() == 0) {
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

    public @unsigned int setCount() {
        return segment.get(LAYOUT$setCount, OFFSET$setCount);
    }

    public void setCount(@unsigned int value) {
        segment.set(LAYOUT$setCount, OFFSET$setCount, value);
    }

    public @pointer(comment="int*") MemorySegment pBufferIndicesRaw() {
        return segment.get(LAYOUT$pBufferIndices, OFFSET$pBufferIndices);
    }

    public void pBufferIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pBufferIndices, OFFSET$pBufferIndices, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pBufferIndices() {
        MemorySegment s = pBufferIndicesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pBufferIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferIndicesRaw(s);
    }

    public @pointer(comment="long*") MemorySegment pOffsetsRaw() {
        return segment.get(LAYOUT$pOffsets, OFFSET$pOffsets);
    }

    public void pOffsetsRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pOffsets, OFFSET$pOffsets, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pOffsets() {
        MemorySegment s = pOffsetsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pOffsets(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pOffsetsRaw(s);
    }

}

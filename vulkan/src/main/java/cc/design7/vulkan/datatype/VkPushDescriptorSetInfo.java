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

/// Represents a pointer to a {@code VkPushDescriptorSetInfo} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPushDescriptorSetInfo.html">VkPushDescriptorSetInfo</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPushDescriptorSetInfo(@NotNull MemorySegment segment) implements IPointer {
    public VkPushDescriptorSetInfo {
        sType(VkStructureType.PUSH_DESCRIPTOR_SET_INFO);
    }

    public static VkPushDescriptorSetInfo allocate(Arena arena) {
        return new VkPushDescriptorSetInfo(arena.allocate(LAYOUT));
    }

    public static VkPushDescriptorSetInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPushDescriptorSetInfo[] ret = new VkPushDescriptorSetInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPushDescriptorSetInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPushDescriptorSetInfo clone(Arena arena, VkPushDescriptorSetInfo src) {
        VkPushDescriptorSetInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPushDescriptorSetInfo[] clone(Arena arena, VkPushDescriptorSetInfo[] src) {
        VkPushDescriptorSetInfo[] ret = allocate(arena, src.length);
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
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.JAVA_INT.withName("descriptorWriteCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkWriteDescriptorSet.LAYOUT).withName("pDescriptorWrites")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("PATH$stageFlags");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$set = PathElement.groupElement("PATH$set");
    public static final PathElement PATH$descriptorWriteCount = PathElement.groupElement("PATH$descriptorWriteCount");
    public static final PathElement PATH$pDescriptorWrites = PathElement.groupElement("PATH$pDescriptorWrites");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$set = (OfInt) LAYOUT.select(PATH$set);
    public static final OfInt LAYOUT$descriptorWriteCount = (OfInt) LAYOUT.select(PATH$descriptorWriteCount);
    public static final AddressLayout LAYOUT$pDescriptorWrites = (AddressLayout) LAYOUT.select(PATH$pDescriptorWrites);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$set = LAYOUT$set.byteSize();
    public static final long SIZE$descriptorWriteCount = LAYOUT$descriptorWriteCount.byteSize();
    public static final long SIZE$pDescriptorWrites = LAYOUT$pDescriptorWrites.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$set = LAYOUT.byteOffset(PATH$set);
    public static final long OFFSET$descriptorWriteCount = LAYOUT.byteOffset(PATH$descriptorWriteCount);
    public static final long OFFSET$pDescriptorWrites = LAYOUT.byteOffset(PATH$pDescriptorWrites);

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

    public @unsigned int set() {
        return segment.get(LAYOUT$set, OFFSET$set);
    }

    public void set(@unsigned int value) {
        segment.set(LAYOUT$set, OFFSET$set, value);
    }

    public @unsigned int descriptorWriteCount() {
        return segment.get(LAYOUT$descriptorWriteCount, OFFSET$descriptorWriteCount);
    }

    public void descriptorWriteCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorWriteCount, OFFSET$descriptorWriteCount, value);
    }

    public @pointer(comment="VkWriteDescriptorSet*") MemorySegment pDescriptorWritesRaw() {
        return segment.get(LAYOUT$pDescriptorWrites, OFFSET$pDescriptorWrites);
    }

    public void pDescriptorWritesRaw(@pointer(comment="VkWriteDescriptorSet*") MemorySegment value) {
        segment.set(LAYOUT$pDescriptorWrites, OFFSET$pDescriptorWrites, value);
    }

    public @Nullable VkWriteDescriptorSet pDescriptorWrites() {
        MemorySegment s = pDescriptorWritesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkWriteDescriptorSet(s);
    }

    public void pDescriptorWrites(@Nullable VkWriteDescriptorSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorWritesRaw(s);
    }

    @unsafe public @Nullable VkWriteDescriptorSet[] pDescriptorWrites(int assumedCount) {
        MemorySegment s = pDescriptorWritesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkWriteDescriptorSet.SIZE);
        VkWriteDescriptorSet[] ret = new VkWriteDescriptorSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkWriteDescriptorSet(s.asSlice(i * VkWriteDescriptorSet.SIZE, VkWriteDescriptorSet.SIZE));
        }
        return ret;
    }

}

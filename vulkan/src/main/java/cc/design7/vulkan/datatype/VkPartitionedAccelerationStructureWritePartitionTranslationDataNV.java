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

/// Represents a pointer to a {@code VkPartitionedAccelerationStructureWritePartitionTranslationDataNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.html">VkPartitionedAccelerationStructureWritePartitionTranslationDataNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV allocate(Arena arena) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(arena.allocate(LAYOUT));
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] ret = new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV clone(Arena arena, VkPartitionedAccelerationStructureWritePartitionTranslationDataNV src) {
        VkPartitionedAccelerationStructureWritePartitionTranslationDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] clone(Arena arena, VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] src) {
        VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("partitionIndex"),
        ValueLayout.JAVA_FLOAT.withName("partitionTranslation")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$partitionIndex = PathElement.groupElement("PATH$partitionIndex");
    public static final PathElement PATH$partitionTranslation = PathElement.groupElement("PATH$partitionTranslation");

    public static final OfInt LAYOUT$partitionIndex = (OfInt) LAYOUT.select(PATH$partitionIndex);
    public static final OfFloat LAYOUT$partitionTranslation = (OfFloat) LAYOUT.select(PATH$partitionTranslation);

    public static final long SIZE$partitionIndex = LAYOUT$partitionIndex.byteSize();
    public static final long SIZE$partitionTranslation = LAYOUT$partitionTranslation.byteSize();

    public static final long OFFSET$partitionIndex = LAYOUT.byteOffset(PATH$partitionIndex);
    public static final long OFFSET$partitionTranslation = LAYOUT.byteOffset(PATH$partitionTranslation);

    public @unsigned int partitionIndex() {
        return segment.get(LAYOUT$partitionIndex, OFFSET$partitionIndex);
    }

    public void partitionIndex(@unsigned int value) {
        segment.set(LAYOUT$partitionIndex, OFFSET$partitionIndex, value);
    }

    public float partitionTranslation() {
        return segment.get(LAYOUT$partitionTranslation, OFFSET$partitionTranslation);
    }

    public void partitionTranslation(float value) {
        segment.set(LAYOUT$partitionTranslation, OFFSET$partitionTranslation, value);
    }

}

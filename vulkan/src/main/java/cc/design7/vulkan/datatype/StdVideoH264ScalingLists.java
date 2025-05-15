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

/// Represents a pointer to a {@code StdVideoH264ScalingLists} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264ScalingLists {
///     uint16_t scaling_list_present_mask;
///     uint16_t use_default_scaling_matrix_mask;
///     uint8_t ScalingList4x4;
///     uint8_t ScalingList8x8;
/// } StdVideoH264ScalingLists;
/// }
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
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoH264ScalingLists(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH264ScalingLists allocate(Arena arena) {
        StdVideoH264ScalingLists ret = new StdVideoH264ScalingLists(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH264ScalingLists[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264ScalingLists[] ret = new StdVideoH264ScalingLists[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264ScalingLists(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH264ScalingLists clone(Arena arena, StdVideoH264ScalingLists src) {
        StdVideoH264ScalingLists ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH264ScalingLists[] clone(Arena arena, StdVideoH264ScalingLists[] src) {
        StdVideoH264ScalingLists[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned short scaling_list_present_mask() {
        return segment.get(LAYOUT$scaling_list_present_mask, OFFSET$scaling_list_present_mask);
    }

    public void scaling_list_present_mask(@unsigned short value) {
        segment.set(LAYOUT$scaling_list_present_mask, OFFSET$scaling_list_present_mask, value);
    }

    public @unsigned short use_default_scaling_matrix_mask() {
        return segment.get(LAYOUT$use_default_scaling_matrix_mask, OFFSET$use_default_scaling_matrix_mask);
    }

    public void use_default_scaling_matrix_mask(@unsigned short value) {
        segment.set(LAYOUT$use_default_scaling_matrix_mask, OFFSET$use_default_scaling_matrix_mask, value);
    }

    public @unsigned byte ScalingList4x4() {
        return segment.get(LAYOUT$ScalingList4x4, OFFSET$ScalingList4x4);
    }

    public void ScalingList4x4(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList4x4, OFFSET$ScalingList4x4, value);
    }

    public @unsigned byte ScalingList8x8() {
        return segment.get(LAYOUT$ScalingList8x8, OFFSET$ScalingList8x8);
    }

    public void ScalingList8x8(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList8x8, OFFSET$ScalingList8x8, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("scaling_list_present_mask"),
        ValueLayout.JAVA_SHORT.withName("use_default_scaling_matrix_mask"),
        ValueLayout.JAVA_BYTE.withName("ScalingList4x4"),
        ValueLayout.JAVA_BYTE.withName("ScalingList8x8")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$scaling_list_present_mask = PathElement.groupElement("PATH$scaling_list_present_mask");
    public static final PathElement PATH$use_default_scaling_matrix_mask = PathElement.groupElement("PATH$use_default_scaling_matrix_mask");
    public static final PathElement PATH$ScalingList4x4 = PathElement.groupElement("PATH$ScalingList4x4");
    public static final PathElement PATH$ScalingList8x8 = PathElement.groupElement("PATH$ScalingList8x8");

    public static final OfShort LAYOUT$scaling_list_present_mask = (OfShort) LAYOUT.select(PATH$scaling_list_present_mask);
    public static final OfShort LAYOUT$use_default_scaling_matrix_mask = (OfShort) LAYOUT.select(PATH$use_default_scaling_matrix_mask);
    public static final OfByte LAYOUT$ScalingList4x4 = (OfByte) LAYOUT.select(PATH$ScalingList4x4);
    public static final OfByte LAYOUT$ScalingList8x8 = (OfByte) LAYOUT.select(PATH$ScalingList8x8);

    public static final long SIZE$scaling_list_present_mask = LAYOUT$scaling_list_present_mask.byteSize();
    public static final long SIZE$use_default_scaling_matrix_mask = LAYOUT$use_default_scaling_matrix_mask.byteSize();
    public static final long SIZE$ScalingList4x4 = LAYOUT$ScalingList4x4.byteSize();
    public static final long SIZE$ScalingList8x8 = LAYOUT$ScalingList8x8.byteSize();

    public static final long OFFSET$scaling_list_present_mask = LAYOUT.byteOffset(PATH$scaling_list_present_mask);
    public static final long OFFSET$use_default_scaling_matrix_mask = LAYOUT.byteOffset(PATH$use_default_scaling_matrix_mask);
    public static final long OFFSET$ScalingList4x4 = LAYOUT.byteOffset(PATH$ScalingList4x4);
    public static final long OFFSET$ScalingList8x8 = LAYOUT.byteOffset(PATH$ScalingList8x8);
}

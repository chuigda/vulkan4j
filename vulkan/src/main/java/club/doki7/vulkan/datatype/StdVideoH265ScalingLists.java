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

/// Represents a pointer to a {@code StdVideoH265ScalingLists} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265ScalingLists {
///     uint8_t ScalingList4x4; // @link substring="ScalingList4x4" target="#ScalingList4x4"
///     uint8_t ScalingList8x8; // @link substring="ScalingList8x8" target="#ScalingList8x8"
///     uint8_t ScalingList16x16; // @link substring="ScalingList16x16" target="#ScalingList16x16"
///     uint8_t ScalingList32x32; // @link substring="ScalingList32x32" target="#ScalingList32x32"
///     uint8_t ScalingListDCCoef16x16; // @link substring="ScalingListDCCoef16x16" target="#ScalingListDCCoef16x16"
///     uint8_t ScalingListDCCoef32x32; // @link substring="ScalingListDCCoef32x32" target="#ScalingListDCCoef32x32"
/// } StdVideoH265ScalingLists;
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
public record StdVideoH265ScalingLists(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265ScalingLists allocate(Arena arena) {
        return new StdVideoH265ScalingLists(arena.allocate(LAYOUT));
    }

    public static StdVideoH265ScalingLists[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265ScalingLists[] ret = new StdVideoH265ScalingLists[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265ScalingLists(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265ScalingLists clone(Arena arena, StdVideoH265ScalingLists src) {
        StdVideoH265ScalingLists ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265ScalingLists[] clone(Arena arena, StdVideoH265ScalingLists[] src) {
        StdVideoH265ScalingLists[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
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

    public @unsigned byte ScalingList16x16() {
        return segment.get(LAYOUT$ScalingList16x16, OFFSET$ScalingList16x16);
    }

    public void ScalingList16x16(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList16x16, OFFSET$ScalingList16x16, value);
    }

    public @unsigned byte ScalingList32x32() {
        return segment.get(LAYOUT$ScalingList32x32, OFFSET$ScalingList32x32);
    }

    public void ScalingList32x32(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList32x32, OFFSET$ScalingList32x32, value);
    }

    public @unsigned byte ScalingListDCCoef16x16() {
        return segment.get(LAYOUT$ScalingListDCCoef16x16, OFFSET$ScalingListDCCoef16x16);
    }

    public void ScalingListDCCoef16x16(@unsigned byte value) {
        segment.set(LAYOUT$ScalingListDCCoef16x16, OFFSET$ScalingListDCCoef16x16, value);
    }

    public @unsigned byte ScalingListDCCoef32x32() {
        return segment.get(LAYOUT$ScalingListDCCoef32x32, OFFSET$ScalingListDCCoef32x32);
    }

    public void ScalingListDCCoef32x32(@unsigned byte value) {
        segment.set(LAYOUT$ScalingListDCCoef32x32, OFFSET$ScalingListDCCoef32x32, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("ScalingList4x4"),
        ValueLayout.JAVA_BYTE.withName("ScalingList8x8"),
        ValueLayout.JAVA_BYTE.withName("ScalingList16x16"),
        ValueLayout.JAVA_BYTE.withName("ScalingList32x32"),
        ValueLayout.JAVA_BYTE.withName("ScalingListDCCoef16x16"),
        ValueLayout.JAVA_BYTE.withName("ScalingListDCCoef32x32")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$ScalingList4x4 = PathElement.groupElement("PATH$ScalingList4x4");
    public static final PathElement PATH$ScalingList8x8 = PathElement.groupElement("PATH$ScalingList8x8");
    public static final PathElement PATH$ScalingList16x16 = PathElement.groupElement("PATH$ScalingList16x16");
    public static final PathElement PATH$ScalingList32x32 = PathElement.groupElement("PATH$ScalingList32x32");
    public static final PathElement PATH$ScalingListDCCoef16x16 = PathElement.groupElement("PATH$ScalingListDCCoef16x16");
    public static final PathElement PATH$ScalingListDCCoef32x32 = PathElement.groupElement("PATH$ScalingListDCCoef32x32");

    public static final OfByte LAYOUT$ScalingList4x4 = (OfByte) LAYOUT.select(PATH$ScalingList4x4);
    public static final OfByte LAYOUT$ScalingList8x8 = (OfByte) LAYOUT.select(PATH$ScalingList8x8);
    public static final OfByte LAYOUT$ScalingList16x16 = (OfByte) LAYOUT.select(PATH$ScalingList16x16);
    public static final OfByte LAYOUT$ScalingList32x32 = (OfByte) LAYOUT.select(PATH$ScalingList32x32);
    public static final OfByte LAYOUT$ScalingListDCCoef16x16 = (OfByte) LAYOUT.select(PATH$ScalingListDCCoef16x16);
    public static final OfByte LAYOUT$ScalingListDCCoef32x32 = (OfByte) LAYOUT.select(PATH$ScalingListDCCoef32x32);

    public static final long SIZE$ScalingList4x4 = LAYOUT$ScalingList4x4.byteSize();
    public static final long SIZE$ScalingList8x8 = LAYOUT$ScalingList8x8.byteSize();
    public static final long SIZE$ScalingList16x16 = LAYOUT$ScalingList16x16.byteSize();
    public static final long SIZE$ScalingList32x32 = LAYOUT$ScalingList32x32.byteSize();
    public static final long SIZE$ScalingListDCCoef16x16 = LAYOUT$ScalingListDCCoef16x16.byteSize();
    public static final long SIZE$ScalingListDCCoef32x32 = LAYOUT$ScalingListDCCoef32x32.byteSize();

    public static final long OFFSET$ScalingList4x4 = LAYOUT.byteOffset(PATH$ScalingList4x4);
    public static final long OFFSET$ScalingList8x8 = LAYOUT.byteOffset(PATH$ScalingList8x8);
    public static final long OFFSET$ScalingList16x16 = LAYOUT.byteOffset(PATH$ScalingList16x16);
    public static final long OFFSET$ScalingList32x32 = LAYOUT.byteOffset(PATH$ScalingList32x32);
    public static final long OFFSET$ScalingListDCCoef16x16 = LAYOUT.byteOffset(PATH$ScalingListDCCoef16x16);
    public static final long OFFSET$ScalingListDCCoef32x32 = LAYOUT.byteOffset(PATH$ScalingListDCCoef32x32);
}

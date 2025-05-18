package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoDecodeH264ReferenceInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoDecodeH264ReferenceInfoFlags {
///     uint32_t top_field_flag : 1; // @link substring="top_field_flag" target="#top_field_flag"
///     uint32_t bottom_field_flag : 1; // @link substring="bottom_field_flag" target="#bottom_field_flag"
///     uint32_t used_for_long_term_reference : 1; // @link substring="used_for_long_term_reference" target="#used_for_long_term_reference"
///     uint32_t is_non_existing : 1; // @link substring="is_non_existing" target="#is_non_existing"
/// } StdVideoDecodeH264ReferenceInfoFlags;
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
public record StdVideoDecodeH264ReferenceInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoDecodeH264ReferenceInfoFlags allocate(Arena arena) {
        StdVideoDecodeH264ReferenceInfoFlags ret = new StdVideoDecodeH264ReferenceInfoFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoDecodeH264ReferenceInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH264ReferenceInfoFlags[] ret = new StdVideoDecodeH264ReferenceInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH264ReferenceInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoDecodeH264ReferenceInfoFlags clone(Arena arena, StdVideoDecodeH264ReferenceInfoFlags src) {
        StdVideoDecodeH264ReferenceInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeH264ReferenceInfoFlags[] clone(Arena arena, StdVideoDecodeH264ReferenceInfoFlags[] src) {
        StdVideoDecodeH264ReferenceInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean top_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        return BitfieldUtil.readBit(s, 0);
    }

    public void top_field_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean bottom_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        return BitfieldUtil.readBit(s, 1);
    }

    public void bottom_field_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean used_for_long_term_reference() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        return BitfieldUtil.readBit(s, 2);
    }

    public void used_for_long_term_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean is_non_existing() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        return BitfieldUtil.readBit(s, 3);
    }

    public void is_non_existing(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$top_field_flag_is_non_existing")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$top_field_flag_is_non_existing = PathElement.groupElement("PATH$bitfield$top_field_flag_is_non_existing");

    public static final OfInt LAYOUT$top_field_flag_is_non_existing = (OfInt) LAYOUT.select(PATH$bitfield$top_field_flag_is_non_existing);


    public static final long OFFSET$bitfield$top_field_flag_is_non_existing = LAYOUT.byteOffset(PATH$bitfield$top_field_flag_is_non_existing);
}

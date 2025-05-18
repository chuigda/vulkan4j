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

/// Represents a pointer to a {@code StdVideoH265ProfileTierLevelFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265ProfileTierLevelFlags {
///     uint32_t general_tier_flag : 1; // @link substring="general_tier_flag" target="#general_tier_flag"
///     uint32_t general_progressive_source_flag : 1; // @link substring="general_progressive_source_flag" target="#general_progressive_source_flag"
///     uint32_t general_interlaced_source_flag : 1; // @link substring="general_interlaced_source_flag" target="#general_interlaced_source_flag"
///     uint32_t general_non_packed_constraint_flag : 1; // @link substring="general_non_packed_constraint_flag" target="#general_non_packed_constraint_flag"
///     uint32_t general_frame_only_constraint_flag : 1; // @link substring="general_frame_only_constraint_flag" target="#general_frame_only_constraint_flag"
/// } StdVideoH265ProfileTierLevelFlags;
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
public record StdVideoH265ProfileTierLevelFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265ProfileTierLevelFlags allocate(Arena arena) {
        StdVideoH265ProfileTierLevelFlags ret = new StdVideoH265ProfileTierLevelFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265ProfileTierLevelFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265ProfileTierLevelFlags[] ret = new StdVideoH265ProfileTierLevelFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265ProfileTierLevelFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265ProfileTierLevelFlags clone(Arena arena, StdVideoH265ProfileTierLevelFlags src) {
        StdVideoH265ProfileTierLevelFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265ProfileTierLevelFlags[] clone(Arena arena, StdVideoH265ProfileTierLevelFlags[] src) {
        StdVideoH265ProfileTierLevelFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean general_tier_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void general_tier_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean general_progressive_source_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void general_progressive_source_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean general_interlaced_source_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void general_interlaced_source_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean general_non_packed_constraint_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void general_non_packed_constraint_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean general_frame_only_constraint_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 4);
    }

    public void general_frame_only_constraint_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$general_tier_flag_general_frame_only_constraint_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$general_tier_flag_general_frame_only_constraint_flag = PathElement.groupElement("PATH$bitfield$general_tier_flag_general_frame_only_constraint_flag");

    public static final OfInt LAYOUT$general_tier_flag_general_frame_only_constraint_flag = (OfInt) LAYOUT.select(PATH$bitfield$general_tier_flag_general_frame_only_constraint_flag);


    public static final long OFFSET$bitfield$general_tier_flag_general_frame_only_constraint_flag = LAYOUT.byteOffset(PATH$bitfield$general_tier_flag_general_frame_only_constraint_flag);
}

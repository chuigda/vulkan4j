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

/// Represents a pointer to a {@code StdVideoAV1FilmGrainFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1FilmGrainFlags {
///     uint32_t chroma_scaling_from_luma : 1; // @link substring="chroma_scaling_from_luma" target="#chroma_scaling_from_luma"
///     uint32_t overlap_flag : 1; // @link substring="overlap_flag" target="#overlap_flag"
///     uint32_t clip_to_restricted_range : 1; // @link substring="clip_to_restricted_range" target="#clip_to_restricted_range"
///     uint32_t update_grain : 1; // @link substring="update_grain" target="#update_grain"
///     uint32_t reserved : 28;
/// } StdVideoAV1FilmGrainFlags;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoAV1FilmGrainFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1FilmGrainFlags allocate(Arena arena) {
        return new StdVideoAV1FilmGrainFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1FilmGrainFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1FilmGrainFlags[] ret = new StdVideoAV1FilmGrainFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1FilmGrainFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1FilmGrainFlags clone(Arena arena, StdVideoAV1FilmGrainFlags src) {
        StdVideoAV1FilmGrainFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1FilmGrainFlags[] clone(Arena arena, StdVideoAV1FilmGrainFlags[] src) {
        StdVideoAV1FilmGrainFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean chroma_scaling_from_luma() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void chroma_scaling_from_luma(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean overlap_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void overlap_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean clip_to_restricted_range() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void clip_to_restricted_range(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean update_grain() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        return BitfieldUtil.readBit(s, 3);
    }

    public void update_grain(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$chroma_scaling_from_luma$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$chroma_scaling_from_luma$reserved = PathElement.groupElement("PATH$bitfield$chroma_scaling_from_luma$reserved");

    public static final OfInt LAYOUT$bitfield$chroma_scaling_from_luma$reserved = (OfInt) LAYOUT.select(PATH$bitfield$chroma_scaling_from_luma$reserved);


    public static final long OFFSET$bitfield$chroma_scaling_from_luma$reserved = LAYOUT.byteOffset(PATH$bitfield$chroma_scaling_from_luma$reserved);
}

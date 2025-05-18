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

/// Represents a pointer to a {@code StdVideoAV1TileInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1TileInfoFlags {
///     uint32_t uniform_tile_spacing_flag : 1; // @link substring="uniform_tile_spacing_flag" target="#uniform_tile_spacing_flag"
///     uint32_t reserved : 31;
/// } StdVideoAV1TileInfoFlags;
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
public record StdVideoAV1TileInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1TileInfoFlags allocate(Arena arena) {
        StdVideoAV1TileInfoFlags ret = new StdVideoAV1TileInfoFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoAV1TileInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TileInfoFlags[] ret = new StdVideoAV1TileInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1TileInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1TileInfoFlags clone(Arena arena, StdVideoAV1TileInfoFlags src) {
        StdVideoAV1TileInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1TileInfoFlags[] clone(Arena arena, StdVideoAV1TileInfoFlags[] src) {
        StdVideoAV1TileInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean uniform_tile_spacing_flag() {
        MemorySegment s = segment.asSlice(OFFSET$uniform_tile_spacing_flag_reserved, LAYOUT$uniform_tile_spacing_flag_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void uniform_tile_spacing_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$uniform_tile_spacing_flag_reserved, LAYOUT$uniform_tile_spacing_flag_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$uniform_tile_spacing_flag_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$uniform_tile_spacing_flag_reserved = PathElement.groupElement("PATH$bitfield$uniform_tile_spacing_flag_reserved");

    public static final OfInt LAYOUT$uniform_tile_spacing_flag_reserved = (OfInt) LAYOUT.select(PATH$bitfield$uniform_tile_spacing_flag_reserved);


    public static final long OFFSET$uniform_tile_spacing_flag_reserved = LAYOUT.byteOffset(PATH$bitfield$uniform_tile_spacing_flag_reserved);
}

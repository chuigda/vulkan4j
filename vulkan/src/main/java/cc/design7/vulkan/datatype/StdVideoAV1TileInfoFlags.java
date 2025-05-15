package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.bits.BitfieldUtil;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoAV1TileInfoFlags} structure in native memory.
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
        return new StdVideoAV1TileInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1TileInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TileInfoFlags[] ret = new StdVideoAV1TileInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1TileInfoFlags(segment.asSlice(i * SIZE, SIZE));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$uniform_tile_spacing_flag_reserved")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$uniform_tile_spacing_flag_reserved = PathElement.groupElement("PATH$bitfield$uniform_tile_spacing_flag_reserved");

    public static final OfInt LAYOUT$uniform_tile_spacing_flag_reserved = (OfInt) LAYOUT.select(PATH$bitfield$uniform_tile_spacing_flag_reserved);


    public static final long OFFSET$uniform_tile_spacing_flag_reserved = LAYOUT.byteOffset(PATH$bitfield$uniform_tile_spacing_flag_reserved);

    public boolean uniform_tile_spacing_flag() {
        MemorySegment s = segment.asSlice(OFFSET$uniform_tile_spacing_flag_reserved, LAYOUT$uniform_tile_spacing_flag_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void uniform_tile_spacing_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$uniform_tile_spacing_flag_reserved, LAYOUT$uniform_tile_spacing_flag_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }


}

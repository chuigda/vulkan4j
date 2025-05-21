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

/// Represents a pointer to a {@code StdVideoAV1LoopFilterFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1LoopFilterFlags {
///     uint32_t loop_filter_delta_enabled : 1; // @link substring="loop_filter_delta_enabled" target="#loop_filter_delta_enabled"
///     uint32_t loop_filter_delta_update : 1; // @link substring="loop_filter_delta_update" target="#loop_filter_delta_update"
///     uint32_t reserved : 30;
/// } StdVideoAV1LoopFilterFlags;
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
public record StdVideoAV1LoopFilterFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1LoopFilterFlags allocate(Arena arena) {
        return new StdVideoAV1LoopFilterFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1LoopFilterFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1LoopFilterFlags[] ret = new StdVideoAV1LoopFilterFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1LoopFilterFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1LoopFilterFlags clone(Arena arena, StdVideoAV1LoopFilterFlags src) {
        StdVideoAV1LoopFilterFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1LoopFilterFlags[] clone(Arena arena, StdVideoAV1LoopFilterFlags[] src) {
        StdVideoAV1LoopFilterFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean loop_filter_delta_enabled() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$loop_filter_delta_enabled$reserved, LAYOUT$bitfield$loop_filter_delta_enabled$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void loop_filter_delta_enabled(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$loop_filter_delta_enabled$reserved, LAYOUT$bitfield$loop_filter_delta_enabled$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean loop_filter_delta_update() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$loop_filter_delta_enabled$reserved, LAYOUT$bitfield$loop_filter_delta_enabled$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void loop_filter_delta_update(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$loop_filter_delta_enabled$reserved, LAYOUT$bitfield$loop_filter_delta_enabled$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$loop_filter_delta_enabled$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$loop_filter_delta_enabled$reserved = PathElement.groupElement("loop_filter_delta_enabled$reserved");

    public static final OfInt LAYOUT$bitfield$loop_filter_delta_enabled$reserved = (OfInt) LAYOUT.select(PATH$bitfield$loop_filter_delta_enabled$reserved);


    public static final long OFFSET$bitfield$loop_filter_delta_enabled$reserved = LAYOUT.byteOffset(PATH$bitfield$loop_filter_delta_enabled$reserved);
}

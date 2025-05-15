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

/// Represents a pointer to a {@code StdVideoAV1LoopFilter} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1LoopFilter {
///     StdVideoAV1LoopFilterFlags flags;
///     uint8_t loop_filter_level;
///     uint8_t loop_filter_sharpness;
///     uint8_t update_ref_delta;
///     int8_t loop_filter_ref_deltas;
///     uint8_t update_mode_delta;
///     int8_t loop_filter_mode_deltas;
/// } StdVideoAV1LoopFilter;
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
public record StdVideoAV1LoopFilter(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1LoopFilter allocate(Arena arena) {
        StdVideoAV1LoopFilter ret = new StdVideoAV1LoopFilter(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoAV1LoopFilter[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1LoopFilter[] ret = new StdVideoAV1LoopFilter[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1LoopFilter(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1LoopFilter clone(Arena arena, StdVideoAV1LoopFilter src) {
        StdVideoAV1LoopFilter ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1LoopFilter[] clone(Arena arena, StdVideoAV1LoopFilter[] src) {
        StdVideoAV1LoopFilter[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoAV1LoopFilterFlags flags() {
        return new StdVideoAV1LoopFilterFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoAV1LoopFilterFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte loop_filter_level() {
        return segment.get(LAYOUT$loop_filter_level, OFFSET$loop_filter_level);
    }

    public void loop_filter_level(@unsigned byte value) {
        segment.set(LAYOUT$loop_filter_level, OFFSET$loop_filter_level, value);
    }

    public @unsigned byte loop_filter_sharpness() {
        return segment.get(LAYOUT$loop_filter_sharpness, OFFSET$loop_filter_sharpness);
    }

    public void loop_filter_sharpness(@unsigned byte value) {
        segment.set(LAYOUT$loop_filter_sharpness, OFFSET$loop_filter_sharpness, value);
    }

    public @unsigned byte update_ref_delta() {
        return segment.get(LAYOUT$update_ref_delta, OFFSET$update_ref_delta);
    }

    public void update_ref_delta(@unsigned byte value) {
        segment.set(LAYOUT$update_ref_delta, OFFSET$update_ref_delta, value);
    }

    public byte loop_filter_ref_deltas() {
        return segment.get(LAYOUT$loop_filter_ref_deltas, OFFSET$loop_filter_ref_deltas);
    }

    public void loop_filter_ref_deltas(byte value) {
        segment.set(LAYOUT$loop_filter_ref_deltas, OFFSET$loop_filter_ref_deltas, value);
    }

    public @unsigned byte update_mode_delta() {
        return segment.get(LAYOUT$update_mode_delta, OFFSET$update_mode_delta);
    }

    public void update_mode_delta(@unsigned byte value) {
        segment.set(LAYOUT$update_mode_delta, OFFSET$update_mode_delta, value);
    }

    public byte loop_filter_mode_deltas() {
        return segment.get(LAYOUT$loop_filter_mode_deltas, OFFSET$loop_filter_mode_deltas);
    }

    public void loop_filter_mode_deltas(byte value) {
        segment.set(LAYOUT$loop_filter_mode_deltas, OFFSET$loop_filter_mode_deltas, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoAV1LoopFilterFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_level"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_sharpness"),
        ValueLayout.JAVA_BYTE.withName("update_ref_delta"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_ref_deltas"),
        ValueLayout.JAVA_BYTE.withName("update_mode_delta"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_mode_deltas")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$loop_filter_level = PathElement.groupElement("PATH$loop_filter_level");
    public static final PathElement PATH$loop_filter_sharpness = PathElement.groupElement("PATH$loop_filter_sharpness");
    public static final PathElement PATH$update_ref_delta = PathElement.groupElement("PATH$update_ref_delta");
    public static final PathElement PATH$loop_filter_ref_deltas = PathElement.groupElement("PATH$loop_filter_ref_deltas");
    public static final PathElement PATH$update_mode_delta = PathElement.groupElement("PATH$update_mode_delta");
    public static final PathElement PATH$loop_filter_mode_deltas = PathElement.groupElement("PATH$loop_filter_mode_deltas");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$loop_filter_level = (OfByte) LAYOUT.select(PATH$loop_filter_level);
    public static final OfByte LAYOUT$loop_filter_sharpness = (OfByte) LAYOUT.select(PATH$loop_filter_sharpness);
    public static final OfByte LAYOUT$update_ref_delta = (OfByte) LAYOUT.select(PATH$update_ref_delta);
    public static final OfByte LAYOUT$loop_filter_ref_deltas = (OfByte) LAYOUT.select(PATH$loop_filter_ref_deltas);
    public static final OfByte LAYOUT$update_mode_delta = (OfByte) LAYOUT.select(PATH$update_mode_delta);
    public static final OfByte LAYOUT$loop_filter_mode_deltas = (OfByte) LAYOUT.select(PATH$loop_filter_mode_deltas);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$loop_filter_level = LAYOUT$loop_filter_level.byteSize();
    public static final long SIZE$loop_filter_sharpness = LAYOUT$loop_filter_sharpness.byteSize();
    public static final long SIZE$update_ref_delta = LAYOUT$update_ref_delta.byteSize();
    public static final long SIZE$loop_filter_ref_deltas = LAYOUT$loop_filter_ref_deltas.byteSize();
    public static final long SIZE$update_mode_delta = LAYOUT$update_mode_delta.byteSize();
    public static final long SIZE$loop_filter_mode_deltas = LAYOUT$loop_filter_mode_deltas.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$loop_filter_level = LAYOUT.byteOffset(PATH$loop_filter_level);
    public static final long OFFSET$loop_filter_sharpness = LAYOUT.byteOffset(PATH$loop_filter_sharpness);
    public static final long OFFSET$update_ref_delta = LAYOUT.byteOffset(PATH$update_ref_delta);
    public static final long OFFSET$loop_filter_ref_deltas = LAYOUT.byteOffset(PATH$loop_filter_ref_deltas);
    public static final long OFFSET$update_mode_delta = LAYOUT.byteOffset(PATH$update_mode_delta);
    public static final long OFFSET$loop_filter_mode_deltas = LAYOUT.byteOffset(PATH$loop_filter_mode_deltas);
}

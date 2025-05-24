package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a {@code StdVideoEncodeAV1OperatingPointInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeAV1OperatingPointInfo {
///     StdVideoEncodeAV1OperatingPointInfoFlags flags; // @link substring="StdVideoEncodeAV1OperatingPointInfoFlags" target="StdVideoEncodeAV1OperatingPointInfoFlags" @link substring="flags" target="#flags"
///     uint16_t operating_point_idc; // @link substring="operating_point_idc" target="#operating_point_idc"
///     uint8_t seq_level_idx; // @link substring="seq_level_idx" target="#seq_level_idx"
///     uint8_t seq_tier; // @link substring="seq_tier" target="#seq_tier"
///     uint32_t decoder_buffer_delay; // @link substring="decoder_buffer_delay" target="#decoder_buffer_delay"
///     uint32_t encoder_buffer_delay; // @link substring="encoder_buffer_delay" target="#encoder_buffer_delay"
///     uint8_t initial_display_delay_minus_1; // @link substring="initial_display_delay_minus_1" target="#initial_display_delay_minus_1"
/// } StdVideoEncodeAV1OperatingPointInfo;
/// }
///
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoEncodeAV1OperatingPointInfo(@NotNull MemorySegment segment) implements IStdVideoEncodeAV1OperatingPointInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeAV1OperatingPointInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeAV1OperatingPointInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeAV1OperatingPointInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeAV1OperatingPointInfo {
        public long size() {
            return segment.byteSize() / StdVideoEncodeAV1OperatingPointInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeAV1OperatingPointInfo at(long index) {
            return new StdVideoEncodeAV1OperatingPointInfo(segment.asSlice(index * StdVideoEncodeAV1OperatingPointInfo.BYTES, StdVideoEncodeAV1OperatingPointInfo.BYTES));
        }

        public void write(long index, @NotNull StdVideoEncodeAV1OperatingPointInfo value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeAV1OperatingPointInfo.BYTES, StdVideoEncodeAV1OperatingPointInfo.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * StdVideoEncodeAV1OperatingPointInfo.BYTES, StdVideoEncodeAV1OperatingPointInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoEncodeAV1OperatingPointInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoEncodeAV1OperatingPointInfo.BYTES,
                (end - start) * StdVideoEncodeAV1OperatingPointInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoEncodeAV1OperatingPointInfo.BYTES));
        }

        public StdVideoEncodeAV1OperatingPointInfo[] toArray() {
            StdVideoEncodeAV1OperatingPointInfo[] ret = new StdVideoEncodeAV1OperatingPointInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static StdVideoEncodeAV1OperatingPointInfo allocate(Arena arena) {
        return new StdVideoEncodeAV1OperatingPointInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1OperatingPointInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoEncodeAV1OperatingPointInfo.Ptr(segment);
    }

    public static StdVideoEncodeAV1OperatingPointInfo clone(Arena arena, StdVideoEncodeAV1OperatingPointInfo src) {
        StdVideoEncodeAV1OperatingPointInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull StdVideoEncodeAV1OperatingPointInfoFlags flags() {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoEncodeAV1OperatingPointInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @Unsigned short operating_point_idc() {
        return segment.get(LAYOUT$operating_point_idc, OFFSET$operating_point_idc);
    }

    public void operating_point_idc(@Unsigned short value) {
        segment.set(LAYOUT$operating_point_idc, OFFSET$operating_point_idc, value);
    }

    public @Unsigned byte seq_level_idx() {
        return segment.get(LAYOUT$seq_level_idx, OFFSET$seq_level_idx);
    }

    public void seq_level_idx(@Unsigned byte value) {
        segment.set(LAYOUT$seq_level_idx, OFFSET$seq_level_idx, value);
    }

    public @Unsigned byte seq_tier() {
        return segment.get(LAYOUT$seq_tier, OFFSET$seq_tier);
    }

    public void seq_tier(@Unsigned byte value) {
        segment.set(LAYOUT$seq_tier, OFFSET$seq_tier, value);
    }

    public @Unsigned int decoder_buffer_delay() {
        return segment.get(LAYOUT$decoder_buffer_delay, OFFSET$decoder_buffer_delay);
    }

    public void decoder_buffer_delay(@Unsigned int value) {
        segment.set(LAYOUT$decoder_buffer_delay, OFFSET$decoder_buffer_delay, value);
    }

    public @Unsigned int encoder_buffer_delay() {
        return segment.get(LAYOUT$encoder_buffer_delay, OFFSET$encoder_buffer_delay);
    }

    public void encoder_buffer_delay(@Unsigned int value) {
        segment.set(LAYOUT$encoder_buffer_delay, OFFSET$encoder_buffer_delay, value);
    }

    public @Unsigned byte initial_display_delay_minus_1() {
        return segment.get(LAYOUT$initial_display_delay_minus_1, OFFSET$initial_display_delay_minus_1);
    }

    public void initial_display_delay_minus_1(@Unsigned byte value) {
        segment.set(LAYOUT$initial_display_delay_minus_1, OFFSET$initial_display_delay_minus_1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeAV1OperatingPointInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_SHORT.withName("operating_point_idc"),
        ValueLayout.JAVA_BYTE.withName("seq_level_idx"),
        ValueLayout.JAVA_BYTE.withName("seq_tier"),
        ValueLayout.JAVA_INT.withName("decoder_buffer_delay"),
        ValueLayout.JAVA_INT.withName("encoder_buffer_delay"),
        ValueLayout.JAVA_BYTE.withName("initial_display_delay_minus_1")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$operating_point_idc = PathElement.groupElement("operating_point_idc");
    public static final PathElement PATH$seq_level_idx = PathElement.groupElement("seq_level_idx");
    public static final PathElement PATH$seq_tier = PathElement.groupElement("seq_tier");
    public static final PathElement PATH$decoder_buffer_delay = PathElement.groupElement("decoder_buffer_delay");
    public static final PathElement PATH$encoder_buffer_delay = PathElement.groupElement("encoder_buffer_delay");
    public static final PathElement PATH$initial_display_delay_minus_1 = PathElement.groupElement("initial_display_delay_minus_1");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfShort LAYOUT$operating_point_idc = (OfShort) LAYOUT.select(PATH$operating_point_idc);
    public static final OfByte LAYOUT$seq_level_idx = (OfByte) LAYOUT.select(PATH$seq_level_idx);
    public static final OfByte LAYOUT$seq_tier = (OfByte) LAYOUT.select(PATH$seq_tier);
    public static final OfInt LAYOUT$decoder_buffer_delay = (OfInt) LAYOUT.select(PATH$decoder_buffer_delay);
    public static final OfInt LAYOUT$encoder_buffer_delay = (OfInt) LAYOUT.select(PATH$encoder_buffer_delay);
    public static final OfByte LAYOUT$initial_display_delay_minus_1 = (OfByte) LAYOUT.select(PATH$initial_display_delay_minus_1);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$operating_point_idc = LAYOUT$operating_point_idc.byteSize();
    public static final long SIZE$seq_level_idx = LAYOUT$seq_level_idx.byteSize();
    public static final long SIZE$seq_tier = LAYOUT$seq_tier.byteSize();
    public static final long SIZE$decoder_buffer_delay = LAYOUT$decoder_buffer_delay.byteSize();
    public static final long SIZE$encoder_buffer_delay = LAYOUT$encoder_buffer_delay.byteSize();
    public static final long SIZE$initial_display_delay_minus_1 = LAYOUT$initial_display_delay_minus_1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$operating_point_idc = LAYOUT.byteOffset(PATH$operating_point_idc);
    public static final long OFFSET$seq_level_idx = LAYOUT.byteOffset(PATH$seq_level_idx);
    public static final long OFFSET$seq_tier = LAYOUT.byteOffset(PATH$seq_tier);
    public static final long OFFSET$decoder_buffer_delay = LAYOUT.byteOffset(PATH$decoder_buffer_delay);
    public static final long OFFSET$encoder_buffer_delay = LAYOUT.byteOffset(PATH$encoder_buffer_delay);
    public static final long OFFSET$initial_display_delay_minus_1 = LAYOUT.byteOffset(PATH$initial_display_delay_minus_1);
}

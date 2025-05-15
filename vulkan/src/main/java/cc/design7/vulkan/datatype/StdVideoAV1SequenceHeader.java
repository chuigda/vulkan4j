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

/// Represents a pointer to a {@code StdVideoAV1SequenceHeader} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1SequenceHeader {
///     StdVideoAV1SequenceHeaderFlags flags;
///     StdVideoAV1Profile seq_profile;
///     uint8_t frame_width_bits_minus_1;
///     uint8_t frame_height_bits_minus_1;
///     uint16_t max_frame_width_minus_1;
///     uint16_t max_frame_height_minus_1;
///     uint8_t delta_frame_id_length_minus_2;
///     uint8_t additional_frame_id_length_minus_1;
///     uint8_t order_hint_bits_minus_1;
///     uint8_t seq_force_integer_mv;
///     uint8_t seq_force_screen_content_tools;
///     uint8_t reserved1;
///     StdVideoAV1ColorConfig const* pColorConfig;
///     StdVideoAV1TimingInfo const* pTimingInfo;
/// } StdVideoAV1SequenceHeader;
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
public record StdVideoAV1SequenceHeader(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1SequenceHeader allocate(Arena arena) {
        StdVideoAV1SequenceHeader ret = new StdVideoAV1SequenceHeader(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoAV1SequenceHeader[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1SequenceHeader[] ret = new StdVideoAV1SequenceHeader[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1SequenceHeader(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1SequenceHeader clone(Arena arena, StdVideoAV1SequenceHeader src) {
        StdVideoAV1SequenceHeader ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1SequenceHeader[] clone(Arena arena, StdVideoAV1SequenceHeader[] src) {
        StdVideoAV1SequenceHeader[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoAV1SequenceHeaderFlags flags() {
        return new StdVideoAV1SequenceHeaderFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoAV1SequenceHeaderFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoAV1Profile.class) int seq_profile() {
        return segment.get(LAYOUT$seq_profile, OFFSET$seq_profile);
    }

    public void seq_profile(@enumtype(StdVideoAV1Profile.class) int value) {
        segment.set(LAYOUT$seq_profile, OFFSET$seq_profile, value);
    }

    public @unsigned byte frame_width_bits_minus_1() {
        return segment.get(LAYOUT$frame_width_bits_minus_1, OFFSET$frame_width_bits_minus_1);
    }

    public void frame_width_bits_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$frame_width_bits_minus_1, OFFSET$frame_width_bits_minus_1, value);
    }

    public @unsigned byte frame_height_bits_minus_1() {
        return segment.get(LAYOUT$frame_height_bits_minus_1, OFFSET$frame_height_bits_minus_1);
    }

    public void frame_height_bits_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$frame_height_bits_minus_1, OFFSET$frame_height_bits_minus_1, value);
    }

    public @unsigned short max_frame_width_minus_1() {
        return segment.get(LAYOUT$max_frame_width_minus_1, OFFSET$max_frame_width_minus_1);
    }

    public void max_frame_width_minus_1(@unsigned short value) {
        segment.set(LAYOUT$max_frame_width_minus_1, OFFSET$max_frame_width_minus_1, value);
    }

    public @unsigned short max_frame_height_minus_1() {
        return segment.get(LAYOUT$max_frame_height_minus_1, OFFSET$max_frame_height_minus_1);
    }

    public void max_frame_height_minus_1(@unsigned short value) {
        segment.set(LAYOUT$max_frame_height_minus_1, OFFSET$max_frame_height_minus_1, value);
    }

    public @unsigned byte delta_frame_id_length_minus_2() {
        return segment.get(LAYOUT$delta_frame_id_length_minus_2, OFFSET$delta_frame_id_length_minus_2);
    }

    public void delta_frame_id_length_minus_2(@unsigned byte value) {
        segment.set(LAYOUT$delta_frame_id_length_minus_2, OFFSET$delta_frame_id_length_minus_2, value);
    }

    public @unsigned byte additional_frame_id_length_minus_1() {
        return segment.get(LAYOUT$additional_frame_id_length_minus_1, OFFSET$additional_frame_id_length_minus_1);
    }

    public void additional_frame_id_length_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$additional_frame_id_length_minus_1, OFFSET$additional_frame_id_length_minus_1, value);
    }

    public @unsigned byte order_hint_bits_minus_1() {
        return segment.get(LAYOUT$order_hint_bits_minus_1, OFFSET$order_hint_bits_minus_1);
    }

    public void order_hint_bits_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$order_hint_bits_minus_1, OFFSET$order_hint_bits_minus_1, value);
    }

    public @unsigned byte seq_force_integer_mv() {
        return segment.get(LAYOUT$seq_force_integer_mv, OFFSET$seq_force_integer_mv);
    }

    public void seq_force_integer_mv(@unsigned byte value) {
        segment.set(LAYOUT$seq_force_integer_mv, OFFSET$seq_force_integer_mv, value);
    }

    public @unsigned byte seq_force_screen_content_tools() {
        return segment.get(LAYOUT$seq_force_screen_content_tools, OFFSET$seq_force_screen_content_tools);
    }

    public void seq_force_screen_content_tools(@unsigned byte value) {
        segment.set(LAYOUT$seq_force_screen_content_tools, OFFSET$seq_force_screen_content_tools, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @pointer(comment="StdVideoAV1ColorConfig*") MemorySegment pColorConfigRaw() {
        return segment.get(LAYOUT$pColorConfig, OFFSET$pColorConfig);
    }

    public void pColorConfigRaw(@pointer(comment="StdVideoAV1ColorConfig*") MemorySegment value) {
        segment.set(LAYOUT$pColorConfig, OFFSET$pColorConfig, value);
    }

    public @Nullable StdVideoAV1ColorConfig pColorConfig() {
        MemorySegment s = pColorConfigRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoAV1ColorConfig(s);
    }

    public void pColorConfig(@Nullable StdVideoAV1ColorConfig value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorConfigRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1ColorConfig[] pColorConfig(int assumedCount) {
        MemorySegment s = pColorConfigRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1ColorConfig.SIZE);
        StdVideoAV1ColorConfig[] ret = new StdVideoAV1ColorConfig[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1ColorConfig(s.asSlice(i * StdVideoAV1ColorConfig.SIZE, StdVideoAV1ColorConfig.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoAV1TimingInfo*") MemorySegment pTimingInfoRaw() {
        return segment.get(LAYOUT$pTimingInfo, OFFSET$pTimingInfo);
    }

    public void pTimingInfoRaw(@pointer(comment="StdVideoAV1TimingInfo*") MemorySegment value) {
        segment.set(LAYOUT$pTimingInfo, OFFSET$pTimingInfo, value);
    }

    public @Nullable StdVideoAV1TimingInfo pTimingInfo() {
        MemorySegment s = pTimingInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoAV1TimingInfo(s);
    }

    public void pTimingInfo(@Nullable StdVideoAV1TimingInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTimingInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1TimingInfo[] pTimingInfo(int assumedCount) {
        MemorySegment s = pTimingInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1TimingInfo.SIZE);
        StdVideoAV1TimingInfo[] ret = new StdVideoAV1TimingInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1TimingInfo(s.asSlice(i * StdVideoAV1TimingInfo.SIZE, StdVideoAV1TimingInfo.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoAV1SequenceHeaderFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("seq_profile"),
        ValueLayout.JAVA_BYTE.withName("frame_width_bits_minus_1"),
        ValueLayout.JAVA_BYTE.withName("frame_height_bits_minus_1"),
        ValueLayout.JAVA_SHORT.withName("max_frame_width_minus_1"),
        ValueLayout.JAVA_SHORT.withName("max_frame_height_minus_1"),
        ValueLayout.JAVA_BYTE.withName("delta_frame_id_length_minus_2"),
        ValueLayout.JAVA_BYTE.withName("additional_frame_id_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("order_hint_bits_minus_1"),
        ValueLayout.JAVA_BYTE.withName("seq_force_integer_mv"),
        ValueLayout.JAVA_BYTE.withName("seq_force_screen_content_tools"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1ColorConfig.LAYOUT).withName("pColorConfig"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1TimingInfo.LAYOUT).withName("pTimingInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$seq_profile = PathElement.groupElement("PATH$seq_profile");
    public static final PathElement PATH$frame_width_bits_minus_1 = PathElement.groupElement("PATH$frame_width_bits_minus_1");
    public static final PathElement PATH$frame_height_bits_minus_1 = PathElement.groupElement("PATH$frame_height_bits_minus_1");
    public static final PathElement PATH$max_frame_width_minus_1 = PathElement.groupElement("PATH$max_frame_width_minus_1");
    public static final PathElement PATH$max_frame_height_minus_1 = PathElement.groupElement("PATH$max_frame_height_minus_1");
    public static final PathElement PATH$delta_frame_id_length_minus_2 = PathElement.groupElement("PATH$delta_frame_id_length_minus_2");
    public static final PathElement PATH$additional_frame_id_length_minus_1 = PathElement.groupElement("PATH$additional_frame_id_length_minus_1");
    public static final PathElement PATH$order_hint_bits_minus_1 = PathElement.groupElement("PATH$order_hint_bits_minus_1");
    public static final PathElement PATH$seq_force_integer_mv = PathElement.groupElement("PATH$seq_force_integer_mv");
    public static final PathElement PATH$seq_force_screen_content_tools = PathElement.groupElement("PATH$seq_force_screen_content_tools");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$pColorConfig = PathElement.groupElement("PATH$pColorConfig");
    public static final PathElement PATH$pTimingInfo = PathElement.groupElement("PATH$pTimingInfo");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$seq_profile = (OfInt) LAYOUT.select(PATH$seq_profile);
    public static final OfByte LAYOUT$frame_width_bits_minus_1 = (OfByte) LAYOUT.select(PATH$frame_width_bits_minus_1);
    public static final OfByte LAYOUT$frame_height_bits_minus_1 = (OfByte) LAYOUT.select(PATH$frame_height_bits_minus_1);
    public static final OfShort LAYOUT$max_frame_width_minus_1 = (OfShort) LAYOUT.select(PATH$max_frame_width_minus_1);
    public static final OfShort LAYOUT$max_frame_height_minus_1 = (OfShort) LAYOUT.select(PATH$max_frame_height_minus_1);
    public static final OfByte LAYOUT$delta_frame_id_length_minus_2 = (OfByte) LAYOUT.select(PATH$delta_frame_id_length_minus_2);
    public static final OfByte LAYOUT$additional_frame_id_length_minus_1 = (OfByte) LAYOUT.select(PATH$additional_frame_id_length_minus_1);
    public static final OfByte LAYOUT$order_hint_bits_minus_1 = (OfByte) LAYOUT.select(PATH$order_hint_bits_minus_1);
    public static final OfByte LAYOUT$seq_force_integer_mv = (OfByte) LAYOUT.select(PATH$seq_force_integer_mv);
    public static final OfByte LAYOUT$seq_force_screen_content_tools = (OfByte) LAYOUT.select(PATH$seq_force_screen_content_tools);
    public static final OfByte LAYOUT$reserved1 = (OfByte) LAYOUT.select(PATH$reserved1);
    public static final AddressLayout LAYOUT$pColorConfig = (AddressLayout) LAYOUT.select(PATH$pColorConfig);
    public static final AddressLayout LAYOUT$pTimingInfo = (AddressLayout) LAYOUT.select(PATH$pTimingInfo);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$seq_profile = LAYOUT$seq_profile.byteSize();
    public static final long SIZE$frame_width_bits_minus_1 = LAYOUT$frame_width_bits_minus_1.byteSize();
    public static final long SIZE$frame_height_bits_minus_1 = LAYOUT$frame_height_bits_minus_1.byteSize();
    public static final long SIZE$max_frame_width_minus_1 = LAYOUT$max_frame_width_minus_1.byteSize();
    public static final long SIZE$max_frame_height_minus_1 = LAYOUT$max_frame_height_minus_1.byteSize();
    public static final long SIZE$delta_frame_id_length_minus_2 = LAYOUT$delta_frame_id_length_minus_2.byteSize();
    public static final long SIZE$additional_frame_id_length_minus_1 = LAYOUT$additional_frame_id_length_minus_1.byteSize();
    public static final long SIZE$order_hint_bits_minus_1 = LAYOUT$order_hint_bits_minus_1.byteSize();
    public static final long SIZE$seq_force_integer_mv = LAYOUT$seq_force_integer_mv.byteSize();
    public static final long SIZE$seq_force_screen_content_tools = LAYOUT$seq_force_screen_content_tools.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$pColorConfig = LAYOUT$pColorConfig.byteSize();
    public static final long SIZE$pTimingInfo = LAYOUT$pTimingInfo.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$seq_profile = LAYOUT.byteOffset(PATH$seq_profile);
    public static final long OFFSET$frame_width_bits_minus_1 = LAYOUT.byteOffset(PATH$frame_width_bits_minus_1);
    public static final long OFFSET$frame_height_bits_minus_1 = LAYOUT.byteOffset(PATH$frame_height_bits_minus_1);
    public static final long OFFSET$max_frame_width_minus_1 = LAYOUT.byteOffset(PATH$max_frame_width_minus_1);
    public static final long OFFSET$max_frame_height_minus_1 = LAYOUT.byteOffset(PATH$max_frame_height_minus_1);
    public static final long OFFSET$delta_frame_id_length_minus_2 = LAYOUT.byteOffset(PATH$delta_frame_id_length_minus_2);
    public static final long OFFSET$additional_frame_id_length_minus_1 = LAYOUT.byteOffset(PATH$additional_frame_id_length_minus_1);
    public static final long OFFSET$order_hint_bits_minus_1 = LAYOUT.byteOffset(PATH$order_hint_bits_minus_1);
    public static final long OFFSET$seq_force_integer_mv = LAYOUT.byteOffset(PATH$seq_force_integer_mv);
    public static final long OFFSET$seq_force_screen_content_tools = LAYOUT.byteOffset(PATH$seq_force_screen_content_tools);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$pColorConfig = LAYOUT.byteOffset(PATH$pColorConfig);
    public static final long OFFSET$pTimingInfo = LAYOUT.byteOffset(PATH$pTimingInfo);
}

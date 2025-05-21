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

/// Represents a pointer to a {@code StdVideoAV1Quantization} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1Quantization {
///     StdVideoAV1QuantizationFlags flags; // @link substring="StdVideoAV1QuantizationFlags" target="StdVideoAV1QuantizationFlags" @link substring="flags" target="#flags"
///     uint8_t base_q_idx; // @link substring="base_q_idx" target="#base_q_idx"
///     int8_t DeltaQYDc; // @link substring="DeltaQYDc" target="#DeltaQYDc"
///     int8_t DeltaQUDc; // @link substring="DeltaQUDc" target="#DeltaQUDc"
///     int8_t DeltaQUAc; // @link substring="DeltaQUAc" target="#DeltaQUAc"
///     int8_t DeltaQVDc; // @link substring="DeltaQVDc" target="#DeltaQVDc"
///     int8_t DeltaQVAc; // @link substring="DeltaQVAc" target="#DeltaQVAc"
///     uint8_t qm_y; // @link substring="qm_y" target="#qm_y"
///     uint8_t qm_u; // @link substring="qm_u" target="#qm_u"
///     uint8_t qm_v; // @link substring="qm_v" target="#qm_v"
/// } StdVideoAV1Quantization;
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
public record StdVideoAV1Quantization(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1Quantization allocate(Arena arena) {
        return new StdVideoAV1Quantization(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1Quantization[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1Quantization[] ret = new StdVideoAV1Quantization[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1Quantization(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1Quantization clone(Arena arena, StdVideoAV1Quantization src) {
        StdVideoAV1Quantization ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1Quantization[] clone(Arena arena, StdVideoAV1Quantization[] src) {
        StdVideoAV1Quantization[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull StdVideoAV1QuantizationFlags flags() {
        return new StdVideoAV1QuantizationFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoAV1QuantizationFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte base_q_idx() {
        return segment.get(LAYOUT$base_q_idx, OFFSET$base_q_idx);
    }

    public void base_q_idx(@unsigned byte value) {
        segment.set(LAYOUT$base_q_idx, OFFSET$base_q_idx, value);
    }

    public byte DeltaQYDc() {
        return segment.get(LAYOUT$DeltaQYDc, OFFSET$DeltaQYDc);
    }

    public void DeltaQYDc(byte value) {
        segment.set(LAYOUT$DeltaQYDc, OFFSET$DeltaQYDc, value);
    }

    public byte DeltaQUDc() {
        return segment.get(LAYOUT$DeltaQUDc, OFFSET$DeltaQUDc);
    }

    public void DeltaQUDc(byte value) {
        segment.set(LAYOUT$DeltaQUDc, OFFSET$DeltaQUDc, value);
    }

    public byte DeltaQUAc() {
        return segment.get(LAYOUT$DeltaQUAc, OFFSET$DeltaQUAc);
    }

    public void DeltaQUAc(byte value) {
        segment.set(LAYOUT$DeltaQUAc, OFFSET$DeltaQUAc, value);
    }

    public byte DeltaQVDc() {
        return segment.get(LAYOUT$DeltaQVDc, OFFSET$DeltaQVDc);
    }

    public void DeltaQVDc(byte value) {
        segment.set(LAYOUT$DeltaQVDc, OFFSET$DeltaQVDc, value);
    }

    public byte DeltaQVAc() {
        return segment.get(LAYOUT$DeltaQVAc, OFFSET$DeltaQVAc);
    }

    public void DeltaQVAc(byte value) {
        segment.set(LAYOUT$DeltaQVAc, OFFSET$DeltaQVAc, value);
    }

    public @unsigned byte qm_y() {
        return segment.get(LAYOUT$qm_y, OFFSET$qm_y);
    }

    public void qm_y(@unsigned byte value) {
        segment.set(LAYOUT$qm_y, OFFSET$qm_y, value);
    }

    public @unsigned byte qm_u() {
        return segment.get(LAYOUT$qm_u, OFFSET$qm_u);
    }

    public void qm_u(@unsigned byte value) {
        segment.set(LAYOUT$qm_u, OFFSET$qm_u, value);
    }

    public @unsigned byte qm_v() {
        return segment.get(LAYOUT$qm_v, OFFSET$qm_v);
    }

    public void qm_v(@unsigned byte value) {
        segment.set(LAYOUT$qm_v, OFFSET$qm_v, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoAV1QuantizationFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("base_q_idx"),
        ValueLayout.JAVA_BYTE.withName("DeltaQYDc"),
        ValueLayout.JAVA_BYTE.withName("DeltaQUDc"),
        ValueLayout.JAVA_BYTE.withName("DeltaQUAc"),
        ValueLayout.JAVA_BYTE.withName("DeltaQVDc"),
        ValueLayout.JAVA_BYTE.withName("DeltaQVAc"),
        ValueLayout.JAVA_BYTE.withName("qm_y"),
        ValueLayout.JAVA_BYTE.withName("qm_u"),
        ValueLayout.JAVA_BYTE.withName("qm_v")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$base_q_idx = PathElement.groupElement("base_q_idx");
    public static final PathElement PATH$DeltaQYDc = PathElement.groupElement("DeltaQYDc");
    public static final PathElement PATH$DeltaQUDc = PathElement.groupElement("DeltaQUDc");
    public static final PathElement PATH$DeltaQUAc = PathElement.groupElement("DeltaQUAc");
    public static final PathElement PATH$DeltaQVDc = PathElement.groupElement("DeltaQVDc");
    public static final PathElement PATH$DeltaQVAc = PathElement.groupElement("DeltaQVAc");
    public static final PathElement PATH$qm_y = PathElement.groupElement("qm_y");
    public static final PathElement PATH$qm_u = PathElement.groupElement("qm_u");
    public static final PathElement PATH$qm_v = PathElement.groupElement("qm_v");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$base_q_idx = (OfByte) LAYOUT.select(PATH$base_q_idx);
    public static final OfByte LAYOUT$DeltaQYDc = (OfByte) LAYOUT.select(PATH$DeltaQYDc);
    public static final OfByte LAYOUT$DeltaQUDc = (OfByte) LAYOUT.select(PATH$DeltaQUDc);
    public static final OfByte LAYOUT$DeltaQUAc = (OfByte) LAYOUT.select(PATH$DeltaQUAc);
    public static final OfByte LAYOUT$DeltaQVDc = (OfByte) LAYOUT.select(PATH$DeltaQVDc);
    public static final OfByte LAYOUT$DeltaQVAc = (OfByte) LAYOUT.select(PATH$DeltaQVAc);
    public static final OfByte LAYOUT$qm_y = (OfByte) LAYOUT.select(PATH$qm_y);
    public static final OfByte LAYOUT$qm_u = (OfByte) LAYOUT.select(PATH$qm_u);
    public static final OfByte LAYOUT$qm_v = (OfByte) LAYOUT.select(PATH$qm_v);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$base_q_idx = LAYOUT$base_q_idx.byteSize();
    public static final long SIZE$DeltaQYDc = LAYOUT$DeltaQYDc.byteSize();
    public static final long SIZE$DeltaQUDc = LAYOUT$DeltaQUDc.byteSize();
    public static final long SIZE$DeltaQUAc = LAYOUT$DeltaQUAc.byteSize();
    public static final long SIZE$DeltaQVDc = LAYOUT$DeltaQVDc.byteSize();
    public static final long SIZE$DeltaQVAc = LAYOUT$DeltaQVAc.byteSize();
    public static final long SIZE$qm_y = LAYOUT$qm_y.byteSize();
    public static final long SIZE$qm_u = LAYOUT$qm_u.byteSize();
    public static final long SIZE$qm_v = LAYOUT$qm_v.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$base_q_idx = LAYOUT.byteOffset(PATH$base_q_idx);
    public static final long OFFSET$DeltaQYDc = LAYOUT.byteOffset(PATH$DeltaQYDc);
    public static final long OFFSET$DeltaQUDc = LAYOUT.byteOffset(PATH$DeltaQUDc);
    public static final long OFFSET$DeltaQUAc = LAYOUT.byteOffset(PATH$DeltaQUAc);
    public static final long OFFSET$DeltaQVDc = LAYOUT.byteOffset(PATH$DeltaQVDc);
    public static final long OFFSET$DeltaQVAc = LAYOUT.byteOffset(PATH$DeltaQVAc);
    public static final long OFFSET$qm_y = LAYOUT.byteOffset(PATH$qm_y);
    public static final long OFFSET$qm_u = LAYOUT.byteOffset(PATH$qm_u);
    public static final long OFFSET$qm_v = LAYOUT.byteOffset(PATH$qm_v);
}

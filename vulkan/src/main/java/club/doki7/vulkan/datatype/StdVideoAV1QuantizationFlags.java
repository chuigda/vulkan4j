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

/// Represents a pointer to a {@code StdVideoAV1QuantizationFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1QuantizationFlags {
///     uint32_t using_qmatrix : 1; // @link substring="using_qmatrix" target="#using_qmatrix"
///     uint32_t diff_uv_delta : 1; // @link substring="diff_uv_delta" target="#diff_uv_delta"
///     uint32_t reserved : 30;
/// } StdVideoAV1QuantizationFlags;
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
public record StdVideoAV1QuantizationFlags(@NotNull MemorySegment segment) implements IStdVideoAV1QuantizationFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoAV1QuantizationFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoAV1QuantizationFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoAV1QuantizationFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoAV1QuantizationFlags {
        public long size() {
            return segment.byteSize() / StdVideoAV1QuantizationFlags.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoAV1QuantizationFlags at(long index) {
            return new StdVideoAV1QuantizationFlags(segment.asSlice(index * StdVideoAV1QuantizationFlags.BYTES, StdVideoAV1QuantizationFlags.BYTES));
        }
        public void write(long index, @NotNull StdVideoAV1QuantizationFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoAV1QuantizationFlags.BYTES, StdVideoAV1QuantizationFlags.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoAV1QuantizationFlags allocate(Arena arena) {
        return new StdVideoAV1QuantizationFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1QuantizationFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1QuantizationFlags.Ptr ret = new StdVideoAV1QuantizationFlags.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoAV1QuantizationFlags clone(Arena arena, StdVideoAV1QuantizationFlags src) {
        StdVideoAV1QuantizationFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean using_qmatrix() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$using_qmatrix$reserved, LAYOUT$bitfield$using_qmatrix$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void using_qmatrix(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$using_qmatrix$reserved, LAYOUT$bitfield$using_qmatrix$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean diff_uv_delta() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$using_qmatrix$reserved, LAYOUT$bitfield$using_qmatrix$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void diff_uv_delta(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$using_qmatrix$reserved, LAYOUT$bitfield$using_qmatrix$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$using_qmatrix$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$using_qmatrix$reserved = PathElement.groupElement("using_qmatrix$reserved");

    public static final OfInt LAYOUT$bitfield$using_qmatrix$reserved = (OfInt) LAYOUT.select(PATH$bitfield$using_qmatrix$reserved);


    public static final long OFFSET$bitfield$using_qmatrix$reserved = LAYOUT.byteOffset(PATH$bitfield$using_qmatrix$reserved);
}

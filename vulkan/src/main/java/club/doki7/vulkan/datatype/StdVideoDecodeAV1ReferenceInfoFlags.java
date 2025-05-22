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

/// Represents a pointer to a {@code StdVideoDecodeAV1ReferenceInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoDecodeAV1ReferenceInfoFlags {
///     uint32_t disable_frame_end_update_cdf : 1; // @link substring="disable_frame_end_update_cdf" target="#disable_frame_end_update_cdf"
///     uint32_t segmentation_enabled : 1; // @link substring="segmentation_enabled" target="#segmentation_enabled"
///     uint32_t reserved : 30;
/// } StdVideoDecodeAV1ReferenceInfoFlags;
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
public record StdVideoDecodeAV1ReferenceInfoFlags(@NotNull MemorySegment segment) implements IStdVideoDecodeAV1ReferenceInfoFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoDecodeAV1ReferenceInfoFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoDecodeAV1ReferenceInfoFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoDecodeAV1ReferenceInfoFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoDecodeAV1ReferenceInfoFlags {
        public long size() {
            return segment.byteSize() / StdVideoDecodeAV1ReferenceInfoFlags.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoDecodeAV1ReferenceInfoFlags at(long index) {
            return new StdVideoDecodeAV1ReferenceInfoFlags(segment.asSlice(index * StdVideoDecodeAV1ReferenceInfoFlags.BYTES, StdVideoDecodeAV1ReferenceInfoFlags.BYTES));
        }
        public void write(long index, @NotNull StdVideoDecodeAV1ReferenceInfoFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoDecodeAV1ReferenceInfoFlags.BYTES, StdVideoDecodeAV1ReferenceInfoFlags.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoDecodeAV1ReferenceInfoFlags allocate(Arena arena) {
        return new StdVideoDecodeAV1ReferenceInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeAV1ReferenceInfoFlags.Ptr ret = new StdVideoDecodeAV1ReferenceInfoFlags.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags clone(Arena arena, StdVideoDecodeAV1ReferenceInfoFlags src) {
        StdVideoDecodeAV1ReferenceInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean disable_frame_end_update_cdf() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$disable_frame_end_update_cdf$reserved, LAYOUT$bitfield$disable_frame_end_update_cdf$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void disable_frame_end_update_cdf(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$disable_frame_end_update_cdf$reserved, LAYOUT$bitfield$disable_frame_end_update_cdf$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean segmentation_enabled() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$disable_frame_end_update_cdf$reserved, LAYOUT$bitfield$disable_frame_end_update_cdf$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void segmentation_enabled(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$disable_frame_end_update_cdf$reserved, LAYOUT$bitfield$disable_frame_end_update_cdf$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$disable_frame_end_update_cdf$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$disable_frame_end_update_cdf$reserved = PathElement.groupElement("disable_frame_end_update_cdf$reserved");

    public static final OfInt LAYOUT$bitfield$disable_frame_end_update_cdf$reserved = (OfInt) LAYOUT.select(PATH$bitfield$disable_frame_end_update_cdf$reserved);


    public static final long OFFSET$bitfield$disable_frame_end_update_cdf$reserved = LAYOUT.byteOffset(PATH$bitfield$disable_frame_end_update_cdf$reserved);
}

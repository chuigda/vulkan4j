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

/// Represents a pointer to a {@code StdVideoAV1TimingInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1TimingInfoFlags {
///     uint32_t equal_picture_interval : 1; // @link substring="equal_picture_interval" target="#equal_picture_interval"
///     uint32_t reserved : 31;
/// } StdVideoAV1TimingInfoFlags;
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
public record StdVideoAV1TimingInfoFlags(@NotNull MemorySegment segment) implements IStdVideoAV1TimingInfoFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoAV1TimingInfoFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoAV1TimingInfoFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoAV1TimingInfoFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoAV1TimingInfoFlags {
        public long size() {
            return segment.byteSize() / StdVideoAV1TimingInfoFlags.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoAV1TimingInfoFlags at(long index) {
            return new StdVideoAV1TimingInfoFlags(segment.asSlice(index * StdVideoAV1TimingInfoFlags.BYTES, StdVideoAV1TimingInfoFlags.BYTES));
        }
        public void write(long index, @NotNull StdVideoAV1TimingInfoFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoAV1TimingInfoFlags.BYTES, StdVideoAV1TimingInfoFlags.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoAV1TimingInfoFlags allocate(Arena arena) {
        return new StdVideoAV1TimingInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1TimingInfoFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TimingInfoFlags.Ptr ret = new StdVideoAV1TimingInfoFlags.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoAV1TimingInfoFlags clone(Arena arena, StdVideoAV1TimingInfoFlags src) {
        StdVideoAV1TimingInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean equal_picture_interval() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$equal_picture_interval$reserved, LAYOUT$bitfield$equal_picture_interval$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void equal_picture_interval(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$equal_picture_interval$reserved, LAYOUT$bitfield$equal_picture_interval$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$equal_picture_interval$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$equal_picture_interval$reserved = PathElement.groupElement("equal_picture_interval$reserved");

    public static final OfInt LAYOUT$bitfield$equal_picture_interval$reserved = (OfInt) LAYOUT.select(PATH$bitfield$equal_picture_interval$reserved);


    public static final long OFFSET$bitfield$equal_picture_interval$reserved = LAYOUT.byteOffset(PATH$bitfield$equal_picture_interval$reserved);
}

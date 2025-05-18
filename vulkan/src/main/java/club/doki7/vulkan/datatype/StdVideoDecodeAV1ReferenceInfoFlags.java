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
///     uint32_t reserved : 30; // @link substring="reserved" target="#reserved"
/// } StdVideoDecodeAV1ReferenceInfoFlags;
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
public record StdVideoDecodeAV1ReferenceInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoDecodeAV1ReferenceInfoFlags allocate(Arena arena) {
        StdVideoDecodeAV1ReferenceInfoFlags ret = new StdVideoDecodeAV1ReferenceInfoFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeAV1ReferenceInfoFlags[] ret = new StdVideoDecodeAV1ReferenceInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeAV1ReferenceInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags clone(Arena arena, StdVideoDecodeAV1ReferenceInfoFlags src) {
        StdVideoDecodeAV1ReferenceInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags[] clone(Arena arena, StdVideoDecodeAV1ReferenceInfoFlags[] src) {
        StdVideoDecodeAV1ReferenceInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean disable_frame_end_update_cdf() {
        MemorySegment s = segment.asSlice(OFFSET$disable_frame_end_update_cdf_reserved, LAYOUT$disable_frame_end_update_cdf_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void disable_frame_end_update_cdf(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$disable_frame_end_update_cdf_reserved, LAYOUT$disable_frame_end_update_cdf_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean segmentation_enabled() {
        MemorySegment s = segment.asSlice(OFFSET$disable_frame_end_update_cdf_reserved, LAYOUT$disable_frame_end_update_cdf_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void segmentation_enabled(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$disable_frame_end_update_cdf_reserved, LAYOUT$disable_frame_end_update_cdf_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$disable_frame_end_update_cdf_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$disable_frame_end_update_cdf_reserved = PathElement.groupElement("PATH$bitfield$disable_frame_end_update_cdf_reserved");

    public static final OfInt LAYOUT$disable_frame_end_update_cdf_reserved = (OfInt) LAYOUT.select(PATH$bitfield$disable_frame_end_update_cdf_reserved);


    public static final long OFFSET$disable_frame_end_update_cdf_reserved = LAYOUT.byteOffset(PATH$bitfield$disable_frame_end_update_cdf_reserved);
}

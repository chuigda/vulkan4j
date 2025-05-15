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

/// Represents a pointer to a {@code StdVideoEncodeAV1ReferenceInfoFlags} structure in native memory.
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
public record StdVideoEncodeAV1ReferenceInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeAV1ReferenceInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeAV1ReferenceInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1ReferenceInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1ReferenceInfoFlags[] ret = new StdVideoEncodeAV1ReferenceInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1ReferenceInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeAV1ReferenceInfoFlags clone(Arena arena, StdVideoEncodeAV1ReferenceInfoFlags src) {
        StdVideoEncodeAV1ReferenceInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeAV1ReferenceInfoFlags[] clone(Arena arena, StdVideoEncodeAV1ReferenceInfoFlags[] src) {
        StdVideoEncodeAV1ReferenceInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$disable_frame_end_update_cdf_reserved")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$disable_frame_end_update_cdf_reserved = PathElement.groupElement("PATH$bitfield$disable_frame_end_update_cdf_reserved");

    public static final OfInt LAYOUT$disable_frame_end_update_cdf_reserved = (OfInt) LAYOUT.select(PATH$bitfield$disable_frame_end_update_cdf_reserved);


    public static final long OFFSET$disable_frame_end_update_cdf_reserved = LAYOUT.byteOffset(PATH$bitfield$disable_frame_end_update_cdf_reserved);

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


}

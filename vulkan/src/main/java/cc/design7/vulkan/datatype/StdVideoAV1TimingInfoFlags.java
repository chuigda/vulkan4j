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

/// Represents a pointer to a {@code StdVideoAV1TimingInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1TimingInfoFlags {
///     uint32_t equal_picture_interval : 1;
///     uint32_t reserved : 31;
/// } StdVideoAV1TimingInfoFlags;
/// }
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoAV1TimingInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1TimingInfoFlags allocate(Arena arena) {
        StdVideoAV1TimingInfoFlags ret = new StdVideoAV1TimingInfoFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoAV1TimingInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TimingInfoFlags[] ret = new StdVideoAV1TimingInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1TimingInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1TimingInfoFlags clone(Arena arena, StdVideoAV1TimingInfoFlags src) {
        StdVideoAV1TimingInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1TimingInfoFlags[] clone(Arena arena, StdVideoAV1TimingInfoFlags[] src) {
        StdVideoAV1TimingInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean equal_picture_interval() {
        MemorySegment s = segment.asSlice(OFFSET$equal_picture_interval_reserved, LAYOUT$equal_picture_interval_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void equal_picture_interval(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$equal_picture_interval_reserved, LAYOUT$equal_picture_interval_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$equal_picture_interval_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$equal_picture_interval_reserved = PathElement.groupElement("PATH$bitfield$equal_picture_interval_reserved");

    public static final OfInt LAYOUT$equal_picture_interval_reserved = (OfInt) LAYOUT.select(PATH$bitfield$equal_picture_interval_reserved);


    public static final long OFFSET$equal_picture_interval_reserved = LAYOUT.byteOffset(PATH$bitfield$equal_picture_interval_reserved);
}

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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoDecodeAV1ReferenceInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoDecodeAV1ReferenceInfo {
///     StdVideoDecodeAV1ReferenceInfoFlags flags;
///     uint8_t frame_type;
///     uint8_t RefFrameSignBias;
///     uint8_t OrderHint;
///     uint8_t SavedOrderHints;
/// } StdVideoDecodeAV1ReferenceInfo;
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
public record StdVideoDecodeAV1ReferenceInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoDecodeAV1ReferenceInfo allocate(Arena arena) {
        StdVideoDecodeAV1ReferenceInfo ret = new StdVideoDecodeAV1ReferenceInfo(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoDecodeAV1ReferenceInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeAV1ReferenceInfo[] ret = new StdVideoDecodeAV1ReferenceInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeAV1ReferenceInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoDecodeAV1ReferenceInfo clone(Arena arena, StdVideoDecodeAV1ReferenceInfo src) {
        StdVideoDecodeAV1ReferenceInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeAV1ReferenceInfo[] clone(Arena arena, StdVideoDecodeAV1ReferenceInfo[] src) {
        StdVideoDecodeAV1ReferenceInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoDecodeAV1ReferenceInfoFlags flags() {
        return new StdVideoDecodeAV1ReferenceInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoDecodeAV1ReferenceInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte frame_type() {
        return segment.get(LAYOUT$frame_type, OFFSET$frame_type);
    }

    public void frame_type(@unsigned byte value) {
        segment.set(LAYOUT$frame_type, OFFSET$frame_type, value);
    }

    public @unsigned byte RefFrameSignBias() {
        return segment.get(LAYOUT$RefFrameSignBias, OFFSET$RefFrameSignBias);
    }

    public void RefFrameSignBias(@unsigned byte value) {
        segment.set(LAYOUT$RefFrameSignBias, OFFSET$RefFrameSignBias, value);
    }

    public @unsigned byte OrderHint() {
        return segment.get(LAYOUT$OrderHint, OFFSET$OrderHint);
    }

    public void OrderHint(@unsigned byte value) {
        segment.set(LAYOUT$OrderHint, OFFSET$OrderHint, value);
    }

    public @unsigned byte SavedOrderHints() {
        return segment.get(LAYOUT$SavedOrderHints, OFFSET$SavedOrderHints);
    }

    public void SavedOrderHints(@unsigned byte value) {
        segment.set(LAYOUT$SavedOrderHints, OFFSET$SavedOrderHints, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoDecodeAV1ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("frame_type"),
        ValueLayout.JAVA_BYTE.withName("RefFrameSignBias"),
        ValueLayout.JAVA_BYTE.withName("OrderHint"),
        ValueLayout.JAVA_BYTE.withName("SavedOrderHints")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$frame_type = PathElement.groupElement("PATH$frame_type");
    public static final PathElement PATH$RefFrameSignBias = PathElement.groupElement("PATH$RefFrameSignBias");
    public static final PathElement PATH$OrderHint = PathElement.groupElement("PATH$OrderHint");
    public static final PathElement PATH$SavedOrderHints = PathElement.groupElement("PATH$SavedOrderHints");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$frame_type = (OfByte) LAYOUT.select(PATH$frame_type);
    public static final OfByte LAYOUT$RefFrameSignBias = (OfByte) LAYOUT.select(PATH$RefFrameSignBias);
    public static final OfByte LAYOUT$OrderHint = (OfByte) LAYOUT.select(PATH$OrderHint);
    public static final OfByte LAYOUT$SavedOrderHints = (OfByte) LAYOUT.select(PATH$SavedOrderHints);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$frame_type = LAYOUT$frame_type.byteSize();
    public static final long SIZE$RefFrameSignBias = LAYOUT$RefFrameSignBias.byteSize();
    public static final long SIZE$OrderHint = LAYOUT$OrderHint.byteSize();
    public static final long SIZE$SavedOrderHints = LAYOUT$SavedOrderHints.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$frame_type = LAYOUT.byteOffset(PATH$frame_type);
    public static final long OFFSET$RefFrameSignBias = LAYOUT.byteOffset(PATH$RefFrameSignBias);
    public static final long OFFSET$OrderHint = LAYOUT.byteOffset(PATH$OrderHint);
    public static final long OFFSET$SavedOrderHints = LAYOUT.byteOffset(PATH$SavedOrderHints);
}

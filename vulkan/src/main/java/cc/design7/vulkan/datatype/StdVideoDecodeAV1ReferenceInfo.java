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

public record StdVideoDecodeAV1ReferenceInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoDecodeAV1ReferenceInfoFlags.LAYOUT.withName("flags");
    public static final OfByte LAYOUT$frame_type = ValueLayout.JAVA_BYTE.withName("frame_type");
    public static final OfByte LAYOUT$RefFrameSignBias = ValueLayout.JAVA_BYTE.withName("RefFrameSignBias");
    public static final OfByte LAYOUT$OrderHint = ValueLayout.JAVA_BYTE.withName("OrderHint");
    public static final OfByte LAYOUT$SavedOrderHints = ValueLayout.JAVA_BYTE.withName("SavedOrderHints");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$frame_type, LAYOUT$RefFrameSignBias, LAYOUT$OrderHint, LAYOUT$SavedOrderHints);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoDecodeAV1ReferenceInfo allocate(Arena arena) {
        return new StdVideoDecodeAV1ReferenceInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeAV1ReferenceInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeAV1ReferenceInfo[] ret = new StdVideoDecodeAV1ReferenceInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeAV1ReferenceInfo(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$frame_type = PathElement.groupElement("PATH$frame_type");
    public static final PathElement PATH$RefFrameSignBias = PathElement.groupElement("PATH$RefFrameSignBias");
    public static final PathElement PATH$OrderHint = PathElement.groupElement("PATH$OrderHint");
    public static final PathElement PATH$SavedOrderHints = PathElement.groupElement("PATH$SavedOrderHints");

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

}
/// dummy, not implemented yet

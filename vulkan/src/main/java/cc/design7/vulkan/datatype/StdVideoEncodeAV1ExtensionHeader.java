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

@ValueBasedCandidate
public record StdVideoEncodeAV1ExtensionHeader(@NotNull MemorySegment segment) implements IPointer {
    public static final OfByte LAYOUT$temporal_id = ValueLayout.JAVA_BYTE.withName("temporal_id");
    public static final OfByte LAYOUT$spatial_id = ValueLayout.JAVA_BYTE.withName("spatial_id");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$temporal_id, LAYOUT$spatial_id);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeAV1ExtensionHeader allocate(Arena arena) {
        return new StdVideoEncodeAV1ExtensionHeader(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1ExtensionHeader[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1ExtensionHeader[] ret = new StdVideoEncodeAV1ExtensionHeader[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1ExtensionHeader(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeAV1ExtensionHeader clone(Arena arena, StdVideoEncodeAV1ExtensionHeader src) {
        StdVideoEncodeAV1ExtensionHeader ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeAV1ExtensionHeader[] clone(Arena arena, StdVideoEncodeAV1ExtensionHeader[] src) {
        StdVideoEncodeAV1ExtensionHeader[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$temporal_id = PathElement.groupElement("PATH$temporal_id");
    public static final PathElement PATH$spatial_id = PathElement.groupElement("PATH$spatial_id");

    public static final long SIZE$temporal_id = LAYOUT$temporal_id.byteSize();
    public static final long SIZE$spatial_id = LAYOUT$spatial_id.byteSize();

    public static final long OFFSET$temporal_id = LAYOUT.byteOffset(PATH$temporal_id);
    public static final long OFFSET$spatial_id = LAYOUT.byteOffset(PATH$spatial_id);

    public @unsigned byte temporal_id() {
        return segment.get(LAYOUT$temporal_id, OFFSET$temporal_id);
    }

    public void temporal_id(@unsigned byte value) {
        segment.set(LAYOUT$temporal_id, OFFSET$temporal_id, value);
    }

    public @unsigned byte spatial_id() {
        return segment.get(LAYOUT$spatial_id, OFFSET$spatial_id);
    }

    public void spatial_id(@unsigned byte value) {
        segment.set(LAYOUT$spatial_id, OFFSET$spatial_id, value);
    }

}

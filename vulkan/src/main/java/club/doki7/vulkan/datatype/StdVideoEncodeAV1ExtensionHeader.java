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

/// Represents a pointer to a {@code StdVideoEncodeAV1ExtensionHeader} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeAV1ExtensionHeader {
///     uint8_t temporal_id; // @link substring="temporal_id" target="#temporal_id"
///     uint8_t spatial_id; // @link substring="spatial_id" target="#spatial_id"
/// } StdVideoEncodeAV1ExtensionHeader;
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
public record StdVideoEncodeAV1ExtensionHeader(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeAV1ExtensionHeader allocate(Arena arena) {
        StdVideoEncodeAV1ExtensionHeader ret = new StdVideoEncodeAV1ExtensionHeader(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeAV1ExtensionHeader[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1ExtensionHeader[] ret = new StdVideoEncodeAV1ExtensionHeader[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1ExtensionHeader(segment.asSlice(i * BYTES, BYTES));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("temporal_id"),
        ValueLayout.JAVA_BYTE.withName("spatial_id")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$temporal_id = PathElement.groupElement("PATH$temporal_id");
    public static final PathElement PATH$spatial_id = PathElement.groupElement("PATH$spatial_id");

    public static final OfByte LAYOUT$temporal_id = (OfByte) LAYOUT.select(PATH$temporal_id);
    public static final OfByte LAYOUT$spatial_id = (OfByte) LAYOUT.select(PATH$spatial_id);

    public static final long SIZE$temporal_id = LAYOUT$temporal_id.byteSize();
    public static final long SIZE$spatial_id = LAYOUT$spatial_id.byteSize();

    public static final long OFFSET$temporal_id = LAYOUT.byteOffset(PATH$temporal_id);
    public static final long OFFSET$spatial_id = LAYOUT.byteOffset(PATH$spatial_id);
}

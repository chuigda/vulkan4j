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

/// Represents a pointer to a {@code StdVideoAV1GlobalMotion} structure in native memory.
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
public record StdVideoAV1GlobalMotion(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1GlobalMotion allocate(Arena arena) {
        return new StdVideoAV1GlobalMotion(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1GlobalMotion[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1GlobalMotion[] ret = new StdVideoAV1GlobalMotion[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1GlobalMotion(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoAV1GlobalMotion clone(Arena arena, StdVideoAV1GlobalMotion src) {
        StdVideoAV1GlobalMotion ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1GlobalMotion[] clone(Arena arena, StdVideoAV1GlobalMotion[] src) {
        StdVideoAV1GlobalMotion[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("GmType"),
        ValueLayout.JAVA_INT.withName("gm_params")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$GmType = PathElement.groupElement("PATH$GmType");
    public static final PathElement PATH$gm_params = PathElement.groupElement("PATH$gm_params");

    public static final OfByte LAYOUT$GmType = (OfByte) LAYOUT.select(PATH$GmType);
    public static final OfInt LAYOUT$gm_params = (OfInt) LAYOUT.select(PATH$gm_params);

    public static final long SIZE$GmType = LAYOUT$GmType.byteSize();
    public static final long SIZE$gm_params = LAYOUT$gm_params.byteSize();

    public static final long OFFSET$GmType = LAYOUT.byteOffset(PATH$GmType);
    public static final long OFFSET$gm_params = LAYOUT.byteOffset(PATH$gm_params);

    public @unsigned byte GmType() {
        return segment.get(LAYOUT$GmType, OFFSET$GmType);
    }

    public void GmType(@unsigned byte value) {
        segment.set(LAYOUT$GmType, OFFSET$GmType, value);
    }

    public int gm_params() {
        return segment.get(LAYOUT$gm_params, OFFSET$gm_params);
    }

    public void gm_params(int value) {
        segment.set(LAYOUT$gm_params, OFFSET$gm_params, value);
    }

}

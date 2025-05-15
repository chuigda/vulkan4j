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

/// Represents a pointer to a {@code StdVideoAV1LoopRestoration} structure in native memory.
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
public record StdVideoAV1LoopRestoration(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1LoopRestoration allocate(Arena arena) {
        return new StdVideoAV1LoopRestoration(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1LoopRestoration[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1LoopRestoration[] ret = new StdVideoAV1LoopRestoration[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1LoopRestoration(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1LoopRestoration clone(Arena arena, StdVideoAV1LoopRestoration src) {
        StdVideoAV1LoopRestoration ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1LoopRestoration[] clone(Arena arena, StdVideoAV1LoopRestoration[] src) {
        StdVideoAV1LoopRestoration[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("FrameRestorationType"),
        ValueLayout.JAVA_SHORT.withName("LoopRestorationSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$FrameRestorationType = PathElement.groupElement("PATH$FrameRestorationType");
    public static final PathElement PATH$LoopRestorationSize = PathElement.groupElement("PATH$LoopRestorationSize");

    public static final OfInt LAYOUT$FrameRestorationType = (OfInt) LAYOUT.select(PATH$FrameRestorationType);
    public static final OfShort LAYOUT$LoopRestorationSize = (OfShort) LAYOUT.select(PATH$LoopRestorationSize);

    public static final long SIZE$FrameRestorationType = LAYOUT$FrameRestorationType.byteSize();
    public static final long SIZE$LoopRestorationSize = LAYOUT$LoopRestorationSize.byteSize();

    public static final long OFFSET$FrameRestorationType = LAYOUT.byteOffset(PATH$FrameRestorationType);
    public static final long OFFSET$LoopRestorationSize = LAYOUT.byteOffset(PATH$LoopRestorationSize);

    public @enumtype(StdVideoAV1FrameRestorationType.class) int FrameRestorationType() {
        return segment.get(LAYOUT$FrameRestorationType, OFFSET$FrameRestorationType);
    }

    public void FrameRestorationType(@enumtype(StdVideoAV1FrameRestorationType.class) int value) {
        segment.set(LAYOUT$FrameRestorationType, OFFSET$FrameRestorationType, value);
    }

    public @unsigned short LoopRestorationSize() {
        return segment.get(LAYOUT$LoopRestorationSize, OFFSET$LoopRestorationSize);
    }

    public void LoopRestorationSize(@unsigned short value) {
        segment.set(LAYOUT$LoopRestorationSize, OFFSET$LoopRestorationSize, value);
    }

}

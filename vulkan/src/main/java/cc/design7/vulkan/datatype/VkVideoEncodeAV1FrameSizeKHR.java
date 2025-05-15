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

/// Represents a pointer to a {@code VkVideoEncodeAV1FrameSizeKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1FrameSizeKHR.html">VkVideoEncodeAV1FrameSizeKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1FrameSizeKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeAV1FrameSizeKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1FrameSizeKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1FrameSizeKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1FrameSizeKHR[] ret = new VkVideoEncodeAV1FrameSizeKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1FrameSizeKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1FrameSizeKHR clone(Arena arena, VkVideoEncodeAV1FrameSizeKHR src) {
        VkVideoEncodeAV1FrameSizeKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1FrameSizeKHR[] clone(Arena arena, VkVideoEncodeAV1FrameSizeKHR[] src) {
        VkVideoEncodeAV1FrameSizeKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("intraFrameSize"),
        ValueLayout.JAVA_INT.withName("predictiveFrameSize"),
        ValueLayout.JAVA_INT.withName("bipredictiveFrameSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$intraFrameSize = PathElement.groupElement("PATH$intraFrameSize");
    public static final PathElement PATH$predictiveFrameSize = PathElement.groupElement("PATH$predictiveFrameSize");
    public static final PathElement PATH$bipredictiveFrameSize = PathElement.groupElement("PATH$bipredictiveFrameSize");

    public static final OfInt LAYOUT$intraFrameSize = (OfInt) LAYOUT.select(PATH$intraFrameSize);
    public static final OfInt LAYOUT$predictiveFrameSize = (OfInt) LAYOUT.select(PATH$predictiveFrameSize);
    public static final OfInt LAYOUT$bipredictiveFrameSize = (OfInt) LAYOUT.select(PATH$bipredictiveFrameSize);

    public static final long SIZE$intraFrameSize = LAYOUT$intraFrameSize.byteSize();
    public static final long SIZE$predictiveFrameSize = LAYOUT$predictiveFrameSize.byteSize();
    public static final long SIZE$bipredictiveFrameSize = LAYOUT$bipredictiveFrameSize.byteSize();

    public static final long OFFSET$intraFrameSize = LAYOUT.byteOffset(PATH$intraFrameSize);
    public static final long OFFSET$predictiveFrameSize = LAYOUT.byteOffset(PATH$predictiveFrameSize);
    public static final long OFFSET$bipredictiveFrameSize = LAYOUT.byteOffset(PATH$bipredictiveFrameSize);

    public @unsigned int intraFrameSize() {
        return segment.get(LAYOUT$intraFrameSize, OFFSET$intraFrameSize);
    }

    public void intraFrameSize(@unsigned int value) {
        segment.set(LAYOUT$intraFrameSize, OFFSET$intraFrameSize, value);
    }

    public @unsigned int predictiveFrameSize() {
        return segment.get(LAYOUT$predictiveFrameSize, OFFSET$predictiveFrameSize);
    }

    public void predictiveFrameSize(@unsigned int value) {
        segment.set(LAYOUT$predictiveFrameSize, OFFSET$predictiveFrameSize, value);
    }

    public @unsigned int bipredictiveFrameSize() {
        return segment.get(LAYOUT$bipredictiveFrameSize, OFFSET$bipredictiveFrameSize);
    }

    public void bipredictiveFrameSize(@unsigned int value) {
        segment.set(LAYOUT$bipredictiveFrameSize, OFFSET$bipredictiveFrameSize, value);
    }

}

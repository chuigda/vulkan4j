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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264FrameSizeKHR.html"><code>VkVideoEncodeH264FrameSizeKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264FrameSizeKHR {
///     uint32_t frameISize;
///     uint32_t framePSize;
///     uint32_t frameBSize;
/// } VkVideoEncodeH264FrameSizeKHR;
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
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264FrameSizeKHR.html"><code>VkVideoEncodeH264FrameSizeKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264FrameSizeKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH264FrameSizeKHR allocate(Arena arena) {
        VkVideoEncodeH264FrameSizeKHR ret = new VkVideoEncodeH264FrameSizeKHR(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkVideoEncodeH264FrameSizeKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264FrameSizeKHR[] ret = new VkVideoEncodeH264FrameSizeKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264FrameSizeKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkVideoEncodeH264FrameSizeKHR clone(Arena arena, VkVideoEncodeH264FrameSizeKHR src) {
        VkVideoEncodeH264FrameSizeKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH264FrameSizeKHR[] clone(Arena arena, VkVideoEncodeH264FrameSizeKHR[] src) {
        VkVideoEncodeH264FrameSizeKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int frameISize() {
        return segment.get(LAYOUT$frameISize, OFFSET$frameISize);
    }

    public void frameISize(@unsigned int value) {
        segment.set(LAYOUT$frameISize, OFFSET$frameISize, value);
    }

    public @unsigned int framePSize() {
        return segment.get(LAYOUT$framePSize, OFFSET$framePSize);
    }

    public void framePSize(@unsigned int value) {
        segment.set(LAYOUT$framePSize, OFFSET$framePSize, value);
    }

    public @unsigned int frameBSize() {
        return segment.get(LAYOUT$frameBSize, OFFSET$frameBSize);
    }

    public void frameBSize(@unsigned int value) {
        segment.set(LAYOUT$frameBSize, OFFSET$frameBSize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("frameISize"),
        ValueLayout.JAVA_INT.withName("framePSize"),
        ValueLayout.JAVA_INT.withName("frameBSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$frameISize = PathElement.groupElement("PATH$frameISize");
    public static final PathElement PATH$framePSize = PathElement.groupElement("PATH$framePSize");
    public static final PathElement PATH$frameBSize = PathElement.groupElement("PATH$frameBSize");

    public static final OfInt LAYOUT$frameISize = (OfInt) LAYOUT.select(PATH$frameISize);
    public static final OfInt LAYOUT$framePSize = (OfInt) LAYOUT.select(PATH$framePSize);
    public static final OfInt LAYOUT$frameBSize = (OfInt) LAYOUT.select(PATH$frameBSize);

    public static final long SIZE$frameISize = LAYOUT$frameISize.byteSize();
    public static final long SIZE$framePSize = LAYOUT$framePSize.byteSize();
    public static final long SIZE$frameBSize = LAYOUT$frameBSize.byteSize();

    public static final long OFFSET$frameISize = LAYOUT.byteOffset(PATH$frameISize);
    public static final long OFFSET$framePSize = LAYOUT.byteOffset(PATH$framePSize);
    public static final long OFFSET$frameBSize = LAYOUT.byteOffset(PATH$frameBSize);
}

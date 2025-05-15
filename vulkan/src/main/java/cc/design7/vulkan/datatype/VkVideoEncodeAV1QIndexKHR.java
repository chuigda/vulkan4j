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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1QIndexKHR.html"><code>VkVideoEncodeAV1QIndexKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1QIndexKHR {
///     uint32_t intraQIndex;
///     uint32_t predictiveQIndex;
///     uint32_t bipredictiveQIndex;
/// } VkVideoEncodeAV1QIndexKHR;
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
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1QIndexKHR.html"><code>VkVideoEncodeAV1QIndexKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1QIndexKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeAV1QIndexKHR allocate(Arena arena) {
        VkVideoEncodeAV1QIndexKHR ret = new VkVideoEncodeAV1QIndexKHR(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkVideoEncodeAV1QIndexKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1QIndexKHR[] ret = new VkVideoEncodeAV1QIndexKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1QIndexKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkVideoEncodeAV1QIndexKHR clone(Arena arena, VkVideoEncodeAV1QIndexKHR src) {
        VkVideoEncodeAV1QIndexKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1QIndexKHR[] clone(Arena arena, VkVideoEncodeAV1QIndexKHR[] src) {
        VkVideoEncodeAV1QIndexKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int intraQIndex() {
        return segment.get(LAYOUT$intraQIndex, OFFSET$intraQIndex);
    }

    public void intraQIndex(@unsigned int value) {
        segment.set(LAYOUT$intraQIndex, OFFSET$intraQIndex, value);
    }

    public @unsigned int predictiveQIndex() {
        return segment.get(LAYOUT$predictiveQIndex, OFFSET$predictiveQIndex);
    }

    public void predictiveQIndex(@unsigned int value) {
        segment.set(LAYOUT$predictiveQIndex, OFFSET$predictiveQIndex, value);
    }

    public @unsigned int bipredictiveQIndex() {
        return segment.get(LAYOUT$bipredictiveQIndex, OFFSET$bipredictiveQIndex);
    }

    public void bipredictiveQIndex(@unsigned int value) {
        segment.set(LAYOUT$bipredictiveQIndex, OFFSET$bipredictiveQIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("intraQIndex"),
        ValueLayout.JAVA_INT.withName("predictiveQIndex"),
        ValueLayout.JAVA_INT.withName("bipredictiveQIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$intraQIndex = PathElement.groupElement("PATH$intraQIndex");
    public static final PathElement PATH$predictiveQIndex = PathElement.groupElement("PATH$predictiveQIndex");
    public static final PathElement PATH$bipredictiveQIndex = PathElement.groupElement("PATH$bipredictiveQIndex");

    public static final OfInt LAYOUT$intraQIndex = (OfInt) LAYOUT.select(PATH$intraQIndex);
    public static final OfInt LAYOUT$predictiveQIndex = (OfInt) LAYOUT.select(PATH$predictiveQIndex);
    public static final OfInt LAYOUT$bipredictiveQIndex = (OfInt) LAYOUT.select(PATH$bipredictiveQIndex);

    public static final long SIZE$intraQIndex = LAYOUT$intraQIndex.byteSize();
    public static final long SIZE$predictiveQIndex = LAYOUT$predictiveQIndex.byteSize();
    public static final long SIZE$bipredictiveQIndex = LAYOUT$bipredictiveQIndex.byteSize();

    public static final long OFFSET$intraQIndex = LAYOUT.byteOffset(PATH$intraQIndex);
    public static final long OFFSET$predictiveQIndex = LAYOUT.byteOffset(PATH$predictiveQIndex);
    public static final long OFFSET$bipredictiveQIndex = LAYOUT.byteOffset(PATH$bipredictiveQIndex);
}

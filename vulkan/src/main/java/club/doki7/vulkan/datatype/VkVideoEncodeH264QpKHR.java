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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264QpKHR.html"><code>VkVideoEncodeH264QpKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264QpKHR {
///     int32_t qpI; // @link substring="qpI" target="#qpI"
///     int32_t qpP; // @link substring="qpP" target="#qpP"
///     int32_t qpB; // @link substring="qpB" target="#qpB"
/// } VkVideoEncodeH264QpKHR;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264QpKHR.html"><code>VkVideoEncodeH264QpKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264QpKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH264QpKHR allocate(Arena arena) {
        return new VkVideoEncodeH264QpKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH264QpKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264QpKHR[] ret = new VkVideoEncodeH264QpKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264QpKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkVideoEncodeH264QpKHR clone(Arena arena, VkVideoEncodeH264QpKHR src) {
        VkVideoEncodeH264QpKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH264QpKHR[] clone(Arena arena, VkVideoEncodeH264QpKHR[] src) {
        VkVideoEncodeH264QpKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public int qpI() {
        return segment.get(LAYOUT$qpI, OFFSET$qpI);
    }

    public void qpI(int value) {
        segment.set(LAYOUT$qpI, OFFSET$qpI, value);
    }

    public int qpP() {
        return segment.get(LAYOUT$qpP, OFFSET$qpP);
    }

    public void qpP(int value) {
        segment.set(LAYOUT$qpP, OFFSET$qpP, value);
    }

    public int qpB() {
        return segment.get(LAYOUT$qpB, OFFSET$qpB);
    }

    public void qpB(int value) {
        segment.set(LAYOUT$qpB, OFFSET$qpB, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("qpI"),
        ValueLayout.JAVA_INT.withName("qpP"),
        ValueLayout.JAVA_INT.withName("qpB")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$qpI = PathElement.groupElement("PATH$qpI");
    public static final PathElement PATH$qpP = PathElement.groupElement("PATH$qpP");
    public static final PathElement PATH$qpB = PathElement.groupElement("PATH$qpB");

    public static final OfInt LAYOUT$qpI = (OfInt) LAYOUT.select(PATH$qpI);
    public static final OfInt LAYOUT$qpP = (OfInt) LAYOUT.select(PATH$qpP);
    public static final OfInt LAYOUT$qpB = (OfInt) LAYOUT.select(PATH$qpB);

    public static final long SIZE$qpI = LAYOUT$qpI.byteSize();
    public static final long SIZE$qpP = LAYOUT$qpP.byteSize();
    public static final long SIZE$qpB = LAYOUT$qpB.byteSize();

    public static final long OFFSET$qpI = LAYOUT.byteOffset(PATH$qpI);
    public static final long OFFSET$qpP = LAYOUT.byteOffset(PATH$qpP);
    public static final long OFFSET$qpB = LAYOUT.byteOffset(PATH$qpB);
}

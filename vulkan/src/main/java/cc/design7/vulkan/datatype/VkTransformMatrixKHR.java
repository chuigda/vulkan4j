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

/// Represents a pointer to a {@code VkTransformMatrixKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTransformMatrixKHR.html">VkTransformMatrixKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkTransformMatrixKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkTransformMatrixKHR allocate(Arena arena) {
        return new VkTransformMatrixKHR(arena.allocate(LAYOUT));
    }

    public static VkTransformMatrixKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTransformMatrixKHR[] ret = new VkTransformMatrixKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkTransformMatrixKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkTransformMatrixKHR clone(Arena arena, VkTransformMatrixKHR src) {
        VkTransformMatrixKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkTransformMatrixKHR[] clone(Arena arena, VkTransformMatrixKHR[] src) {
        VkTransformMatrixKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("matrix")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$matrix = PathElement.groupElement("PATH$matrix");

    public static final OfFloat LAYOUT$matrix = (OfFloat) LAYOUT.select(PATH$matrix);

    public static final long SIZE$matrix = LAYOUT$matrix.byteSize();

    public static final long OFFSET$matrix = LAYOUT.byteOffset(PATH$matrix);

    public float matrix() {
        return segment.get(LAYOUT$matrix, OFFSET$matrix);
    }

    public void matrix(float value) {
        segment.set(LAYOUT$matrix, OFFSET$matrix, value);
    }

}

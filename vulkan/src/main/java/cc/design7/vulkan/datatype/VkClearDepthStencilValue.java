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

/// Represents a pointer to a {@code VkClearDepthStencilValue} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearDepthStencilValue.html">VkClearDepthStencilValue</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClearDepthStencilValue(@NotNull MemorySegment segment) implements IPointer {
    public static VkClearDepthStencilValue allocate(Arena arena) {
        return new VkClearDepthStencilValue(arena.allocate(LAYOUT));
    }

    public static VkClearDepthStencilValue[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearDepthStencilValue[] ret = new VkClearDepthStencilValue[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClearDepthStencilValue(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClearDepthStencilValue clone(Arena arena, VkClearDepthStencilValue src) {
        VkClearDepthStencilValue ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClearDepthStencilValue[] clone(Arena arena, VkClearDepthStencilValue[] src) {
        VkClearDepthStencilValue[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("depth"),
        ValueLayout.JAVA_INT.withName("stencil")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$depth = PathElement.groupElement("PATH$depth");
    public static final PathElement PATH$stencil = PathElement.groupElement("PATH$stencil");

    public static final OfFloat LAYOUT$depth = (OfFloat) LAYOUT.select(PATH$depth);
    public static final OfInt LAYOUT$stencil = (OfInt) LAYOUT.select(PATH$stencil);

    public static final long SIZE$depth = LAYOUT$depth.byteSize();
    public static final long SIZE$stencil = LAYOUT$stencil.byteSize();

    public static final long OFFSET$depth = LAYOUT.byteOffset(PATH$depth);
    public static final long OFFSET$stencil = LAYOUT.byteOffset(PATH$stencil);

    public float depth() {
        return segment.get(LAYOUT$depth, OFFSET$depth);
    }

    public void depth(float value) {
        segment.set(LAYOUT$depth, OFFSET$depth, value);
    }

    public @unsigned int stencil() {
        return segment.get(LAYOUT$stencil, OFFSET$stencil);
    }

    public void stencil(@unsigned int value) {
        segment.set(LAYOUT$stencil, OFFSET$stencil, value);
    }

}

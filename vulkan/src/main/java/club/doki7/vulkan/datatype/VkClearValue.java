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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearValue.html"><code>VkClearValue</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClearValue {
///     VkClearColorValue color;
///     VkClearDepthStencilValue depthStencil;
/// } VkClearValue;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearValue.html"><code>VkClearValue</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClearValue(@NotNull MemorySegment segment) implements IPointer {
    public static VkClearValue allocate(Arena arena) {
        VkClearValue ret = new VkClearValue(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkClearValue[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearValue[] ret = new VkClearValue[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClearValue(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkClearValue clone(Arena arena, VkClearValue src) {
        VkClearValue ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClearValue[] clone(Arena arena, VkClearValue[] src) {
        VkClearValue[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public VkClearColorValue color() {
        return new VkClearColorValue(segment.asSlice(OFFSET$color, LAYOUT$color));
    }

    public void color(VkClearColorValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$color, SIZE$color);
    }

    public VkClearDepthStencilValue depthStencil() {
        return new VkClearDepthStencilValue(segment.asSlice(OFFSET$depthStencil, LAYOUT$depthStencil));
    }

    public void depthStencil(VkClearDepthStencilValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$depthStencil, SIZE$depthStencil);
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        VkClearColorValue.LAYOUT.withName("color"),
        VkClearDepthStencilValue.LAYOUT.withName("depthStencil")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$color = PathElement.groupElement("PATH$color");
    public static final PathElement PATH$depthStencil = PathElement.groupElement("PATH$depthStencil");

    public static final StructLayout LAYOUT$color = (StructLayout) LAYOUT.select(PATH$color);
    public static final StructLayout LAYOUT$depthStencil = (StructLayout) LAYOUT.select(PATH$depthStencil);

    public static final long SIZE$color = LAYOUT$color.byteSize();
    public static final long SIZE$depthStencil = LAYOUT$depthStencil.byteSize();

    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);
    public static final long OFFSET$depthStencil = LAYOUT.byteOffset(PATH$depthStencil);
}

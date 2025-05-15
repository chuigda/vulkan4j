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

/// Represents a pointer to a {@code VkVertexInputBindingDivisorDescription} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDivisorDescription.html">VkVertexInputBindingDivisorDescription</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVertexInputBindingDivisorDescription(@NotNull MemorySegment segment) implements IPointer {
    public static VkVertexInputBindingDivisorDescription allocate(Arena arena) {
        return new VkVertexInputBindingDivisorDescription(arena.allocate(LAYOUT));
    }

    public static VkVertexInputBindingDivisorDescription[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVertexInputBindingDivisorDescription[] ret = new VkVertexInputBindingDivisorDescription[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVertexInputBindingDivisorDescription(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVertexInputBindingDivisorDescription clone(Arena arena, VkVertexInputBindingDivisorDescription src) {
        VkVertexInputBindingDivisorDescription ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVertexInputBindingDivisorDescription[] clone(Arena arena, VkVertexInputBindingDivisorDescription[] src) {
        VkVertexInputBindingDivisorDescription[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$binding = PathElement.groupElement("PATH$binding");
    public static final PathElement PATH$divisor = PathElement.groupElement("PATH$divisor");

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$divisor = (OfInt) LAYOUT.select(PATH$divisor);

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$divisor = LAYOUT$divisor.byteSize();

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$divisor = LAYOUT.byteOffset(PATH$divisor);

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @unsigned int divisor() {
        return segment.get(LAYOUT$divisor, OFFSET$divisor);
    }

    public void divisor(@unsigned int value) {
        segment.set(LAYOUT$divisor, OFFSET$divisor, value);
    }

}

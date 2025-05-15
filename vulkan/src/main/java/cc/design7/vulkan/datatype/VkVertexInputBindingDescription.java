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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDescription.html"><code>VkVertexInputBindingDescription</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVertexInputBindingDescription {
///     uint32_t binding;
///     uint32_t stride;
///     VkVertexInputRate inputRate;
/// } VkVertexInputBindingDescription;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDescription.html"><code>VkVertexInputBindingDescription</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVertexInputBindingDescription(@NotNull MemorySegment segment) implements IPointer {
    public static VkVertexInputBindingDescription allocate(Arena arena) {
        VkVertexInputBindingDescription ret = new VkVertexInputBindingDescription(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkVertexInputBindingDescription[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVertexInputBindingDescription[] ret = new VkVertexInputBindingDescription[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVertexInputBindingDescription(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkVertexInputBindingDescription clone(Arena arena, VkVertexInputBindingDescription src) {
        VkVertexInputBindingDescription ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVertexInputBindingDescription[] clone(Arena arena, VkVertexInputBindingDescription[] src) {
        VkVertexInputBindingDescription[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @enumtype(VkVertexInputRate.class) int inputRate() {
        return segment.get(LAYOUT$inputRate, OFFSET$inputRate);
    }

    public void inputRate(@enumtype(VkVertexInputRate.class) int value) {
        segment.set(LAYOUT$inputRate, OFFSET$inputRate, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$binding = PathElement.groupElement("PATH$binding");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");
    public static final PathElement PATH$inputRate = PathElement.groupElement("PATH$inputRate");

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final OfInt LAYOUT$inputRate = (OfInt) LAYOUT.select(PATH$inputRate);

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$inputRate = LAYOUT$inputRate.byteSize();

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$inputRate = LAYOUT.byteOffset(PATH$inputRate);
}

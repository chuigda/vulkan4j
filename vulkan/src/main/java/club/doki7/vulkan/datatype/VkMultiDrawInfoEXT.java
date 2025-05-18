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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiDrawInfoEXT.html"><code>VkMultiDrawInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMultiDrawInfoEXT {
///     uint32_t firstVertex; // @link substring="firstVertex" target="#firstVertex"
///     uint32_t vertexCount; // @link substring="vertexCount" target="#vertexCount"
/// } VkMultiDrawInfoEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiDrawInfoEXT.html"><code>VkMultiDrawInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMultiDrawInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkMultiDrawInfoEXT allocate(Arena arena) {
        return new VkMultiDrawInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkMultiDrawInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMultiDrawInfoEXT[] ret = new VkMultiDrawInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMultiDrawInfoEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkMultiDrawInfoEXT clone(Arena arena, VkMultiDrawInfoEXT src) {
        VkMultiDrawInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMultiDrawInfoEXT[] clone(Arena arena, VkMultiDrawInfoEXT[] src) {
        VkMultiDrawInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int firstVertex() {
        return segment.get(LAYOUT$firstVertex, OFFSET$firstVertex);
    }

    public void firstVertex(@unsigned int value) {
        segment.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);
    }

    public @unsigned int vertexCount() {
        return segment.get(LAYOUT$vertexCount, OFFSET$vertexCount);
    }

    public void vertexCount(@unsigned int value) {
        segment.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("vertexCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$firstVertex = PathElement.groupElement("PATH$firstVertex");
    public static final PathElement PATH$vertexCount = PathElement.groupElement("PATH$vertexCount");

    public static final OfInt LAYOUT$firstVertex = (OfInt) LAYOUT.select(PATH$firstVertex);
    public static final OfInt LAYOUT$vertexCount = (OfInt) LAYOUT.select(PATH$vertexCount);

    public static final long SIZE$firstVertex = LAYOUT$firstVertex.byteSize();
    public static final long SIZE$vertexCount = LAYOUT$vertexCount.byteSize();

    public static final long OFFSET$firstVertex = LAYOUT.byteOffset(PATH$firstVertex);
    public static final long OFFSET$vertexCount = LAYOUT.byteOffset(PATH$vertexCount);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDepthClampRangeEXT.html"><code>VkDepthClampRangeEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDepthClampRangeEXT {
///     float minDepthClamp; // @link substring="minDepthClamp" target="#minDepthClamp"
///     float maxDepthClamp; // @link substring="maxDepthClamp" target="#maxDepthClamp"
/// } VkDepthClampRangeEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDepthClampRangeEXT.html"><code>VkDepthClampRangeEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDepthClampRangeEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDepthClampRangeEXT allocate(Arena arena) {
        return new VkDepthClampRangeEXT(arena.allocate(LAYOUT));
    }

    public static VkDepthClampRangeEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDepthClampRangeEXT[] ret = new VkDepthClampRangeEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDepthClampRangeEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDepthClampRangeEXT clone(Arena arena, VkDepthClampRangeEXT src) {
        VkDepthClampRangeEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDepthClampRangeEXT[] clone(Arena arena, VkDepthClampRangeEXT[] src) {
        VkDepthClampRangeEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public float minDepthClamp() {
        return segment.get(LAYOUT$minDepthClamp, OFFSET$minDepthClamp);
    }

    public void minDepthClamp(float value) {
        segment.set(LAYOUT$minDepthClamp, OFFSET$minDepthClamp, value);
    }

    public float maxDepthClamp() {
        return segment.get(LAYOUT$maxDepthClamp, OFFSET$maxDepthClamp);
    }

    public void maxDepthClamp(float value) {
        segment.set(LAYOUT$maxDepthClamp, OFFSET$maxDepthClamp, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("minDepthClamp"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthClamp")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$minDepthClamp = PathElement.groupElement("PATH$minDepthClamp");
    public static final PathElement PATH$maxDepthClamp = PathElement.groupElement("PATH$maxDepthClamp");

    public static final OfFloat LAYOUT$minDepthClamp = (OfFloat) LAYOUT.select(PATH$minDepthClamp);
    public static final OfFloat LAYOUT$maxDepthClamp = (OfFloat) LAYOUT.select(PATH$maxDepthClamp);

    public static final long SIZE$minDepthClamp = LAYOUT$minDepthClamp.byteSize();
    public static final long SIZE$maxDepthClamp = LAYOUT$maxDepthClamp.byteSize();

    public static final long OFFSET$minDepthClamp = LAYOUT.byteOffset(PATH$minDepthClamp);
    public static final long OFFSET$maxDepthClamp = LAYOUT.byteOffset(PATH$maxDepthClamp);
}

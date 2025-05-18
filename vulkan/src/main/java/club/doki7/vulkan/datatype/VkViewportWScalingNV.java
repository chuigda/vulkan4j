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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkViewportWScalingNV.html"><code>VkViewportWScalingNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkViewportWScalingNV {
///     float xcoeff; // @link substring="xcoeff" target="#xcoeff"
///     float ycoeff; // @link substring="ycoeff" target="#ycoeff"
/// } VkViewportWScalingNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkViewportWScalingNV.html"><code>VkViewportWScalingNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkViewportWScalingNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkViewportWScalingNV allocate(Arena arena) {
        return new VkViewportWScalingNV(arena.allocate(LAYOUT));
    }

    public static VkViewportWScalingNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkViewportWScalingNV[] ret = new VkViewportWScalingNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkViewportWScalingNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkViewportWScalingNV clone(Arena arena, VkViewportWScalingNV src) {
        VkViewportWScalingNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkViewportWScalingNV[] clone(Arena arena, VkViewportWScalingNV[] src) {
        VkViewportWScalingNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public float xcoeff() {
        return segment.get(LAYOUT$xcoeff, OFFSET$xcoeff);
    }

    public void xcoeff(float value) {
        segment.set(LAYOUT$xcoeff, OFFSET$xcoeff, value);
    }

    public float ycoeff() {
        return segment.get(LAYOUT$ycoeff, OFFSET$ycoeff);
    }

    public void ycoeff(float value) {
        segment.set(LAYOUT$ycoeff, OFFSET$ycoeff, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("xcoeff"),
        ValueLayout.JAVA_FLOAT.withName("ycoeff")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$xcoeff = PathElement.groupElement("PATH$xcoeff");
    public static final PathElement PATH$ycoeff = PathElement.groupElement("PATH$ycoeff");

    public static final OfFloat LAYOUT$xcoeff = (OfFloat) LAYOUT.select(PATH$xcoeff);
    public static final OfFloat LAYOUT$ycoeff = (OfFloat) LAYOUT.select(PATH$ycoeff);

    public static final long SIZE$xcoeff = LAYOUT$xcoeff.byteSize();
    public static final long SIZE$ycoeff = LAYOUT$ycoeff.byteSize();

    public static final long OFFSET$xcoeff = LAYOUT.byteOffset(PATH$xcoeff);
    public static final long OFFSET$ycoeff = LAYOUT.byteOffset(PATH$ycoeff);
}

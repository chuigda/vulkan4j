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

/// Represents a pointer to a {@code VkSurfaceFormatKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfaceFormatKHR.html">VkSurfaceFormatKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSurfaceFormatKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkSurfaceFormatKHR allocate(Arena arena) {
        return new VkSurfaceFormatKHR(arena.allocate(LAYOUT));
    }

    public static VkSurfaceFormatKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfaceFormatKHR[] ret = new VkSurfaceFormatKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSurfaceFormatKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSurfaceFormatKHR clone(Arena arena, VkSurfaceFormatKHR src) {
        VkSurfaceFormatKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSurfaceFormatKHR[] clone(Arena arena, VkSurfaceFormatKHR[] src) {
        VkSurfaceFormatKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$colorSpace = PathElement.groupElement("PATH$colorSpace");

    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$colorSpace = (OfInt) LAYOUT.select(PATH$colorSpace);

    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$colorSpace = LAYOUT$colorSpace.byteSize();

    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$colorSpace = LAYOUT.byteOffset(PATH$colorSpace);

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @enumtype(VkColorSpaceKHR.class) int colorSpace() {
        return segment.get(LAYOUT$colorSpace, OFFSET$colorSpace);
    }

    public void colorSpace(@enumtype(VkColorSpaceKHR.class) int value) {
        segment.set(LAYOUT$colorSpace, OFFSET$colorSpace, value);
    }

}

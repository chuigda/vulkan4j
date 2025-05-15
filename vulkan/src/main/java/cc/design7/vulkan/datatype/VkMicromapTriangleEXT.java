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

/// Represents a pointer to a {@code VkMicromapTriangleEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMicromapTriangleEXT.html">VkMicromapTriangleEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMicromapTriangleEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkMicromapTriangleEXT allocate(Arena arena) {
        return new VkMicromapTriangleEXT(arena.allocate(LAYOUT));
    }

    public static VkMicromapTriangleEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMicromapTriangleEXT[] ret = new VkMicromapTriangleEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMicromapTriangleEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkMicromapTriangleEXT clone(Arena arena, VkMicromapTriangleEXT src) {
        VkMicromapTriangleEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMicromapTriangleEXT[] clone(Arena arena, VkMicromapTriangleEXT[] src) {
        VkMicromapTriangleEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("dataOffset"),
        ValueLayout.JAVA_SHORT.withName("subdivisionLevel"),
        ValueLayout.JAVA_SHORT.withName("format")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$dataOffset = PathElement.groupElement("PATH$dataOffset");
    public static final PathElement PATH$subdivisionLevel = PathElement.groupElement("PATH$subdivisionLevel");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");

    public static final OfInt LAYOUT$dataOffset = (OfInt) LAYOUT.select(PATH$dataOffset);
    public static final OfShort LAYOUT$subdivisionLevel = (OfShort) LAYOUT.select(PATH$subdivisionLevel);
    public static final OfShort LAYOUT$format = (OfShort) LAYOUT.select(PATH$format);

    public static final long SIZE$dataOffset = LAYOUT$dataOffset.byteSize();
    public static final long SIZE$subdivisionLevel = LAYOUT$subdivisionLevel.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();

    public static final long OFFSET$dataOffset = LAYOUT.byteOffset(PATH$dataOffset);
    public static final long OFFSET$subdivisionLevel = LAYOUT.byteOffset(PATH$subdivisionLevel);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);

    public @unsigned int dataOffset() {
        return segment.get(LAYOUT$dataOffset, OFFSET$dataOffset);
    }

    public void dataOffset(@unsigned int value) {
        segment.set(LAYOUT$dataOffset, OFFSET$dataOffset, value);
    }

    public @unsigned short subdivisionLevel() {
        return segment.get(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel);
    }

    public void subdivisionLevel(@unsigned short value) {
        segment.set(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel, value);
    }

    public @unsigned short format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@unsigned short value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

}

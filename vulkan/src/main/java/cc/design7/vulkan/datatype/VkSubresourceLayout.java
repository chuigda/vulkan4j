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

/// Represents a pointer to a {@code VkSubresourceLayout} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubresourceLayout.html">VkSubresourceLayout</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubresourceLayout(@NotNull MemorySegment segment) implements IPointer {
    public static VkSubresourceLayout allocate(Arena arena) {
        return new VkSubresourceLayout(arena.allocate(LAYOUT));
    }

    public static VkSubresourceLayout[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubresourceLayout[] ret = new VkSubresourceLayout[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubresourceLayout(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkSubresourceLayout clone(Arena arena, VkSubresourceLayout src) {
        VkSubresourceLayout ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubresourceLayout[] clone(Arena arena, VkSubresourceLayout[] src) {
        VkSubresourceLayout[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("rowPitch"),
        ValueLayout.JAVA_LONG.withName("arrayPitch"),
        ValueLayout.JAVA_LONG.withName("depthPitch")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$rowPitch = PathElement.groupElement("PATH$rowPitch");
    public static final PathElement PATH$arrayPitch = PathElement.groupElement("PATH$arrayPitch");
    public static final PathElement PATH$depthPitch = PathElement.groupElement("PATH$depthPitch");

    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$rowPitch = (OfLong) LAYOUT.select(PATH$rowPitch);
    public static final OfLong LAYOUT$arrayPitch = (OfLong) LAYOUT.select(PATH$arrayPitch);
    public static final OfLong LAYOUT$depthPitch = (OfLong) LAYOUT.select(PATH$depthPitch);

    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$rowPitch = LAYOUT$rowPitch.byteSize();
    public static final long SIZE$arrayPitch = LAYOUT$arrayPitch.byteSize();
    public static final long SIZE$depthPitch = LAYOUT$depthPitch.byteSize();

    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$rowPitch = LAYOUT.byteOffset(PATH$rowPitch);
    public static final long OFFSET$arrayPitch = LAYOUT.byteOffset(PATH$arrayPitch);
    public static final long OFFSET$depthPitch = LAYOUT.byteOffset(PATH$depthPitch);

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @unsigned long rowPitch() {
        return segment.get(LAYOUT$rowPitch, OFFSET$rowPitch);
    }

    public void rowPitch(@unsigned long value) {
        segment.set(LAYOUT$rowPitch, OFFSET$rowPitch, value);
    }

    public @unsigned long arrayPitch() {
        return segment.get(LAYOUT$arrayPitch, OFFSET$arrayPitch);
    }

    public void arrayPitch(@unsigned long value) {
        segment.set(LAYOUT$arrayPitch, OFFSET$arrayPitch, value);
    }

    public @unsigned long depthPitch() {
        return segment.get(LAYOUT$depthPitch, OFFSET$depthPitch);
    }

    public void depthPitch(@unsigned long value) {
        segment.set(LAYOUT$depthPitch, OFFSET$depthPitch, value);
    }

}

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

/// Represents a pointer to a {@code VkBufferCopy} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferCopy.html">VkBufferCopy</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBufferCopy(@NotNull MemorySegment segment) implements IPointer {
    public static VkBufferCopy allocate(Arena arena) {
        return new VkBufferCopy(arena.allocate(LAYOUT));
    }

    public static VkBufferCopy[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferCopy[] ret = new VkBufferCopy[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBufferCopy(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkBufferCopy clone(Arena arena, VkBufferCopy src) {
        VkBufferCopy ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBufferCopy[] clone(Arena arena, VkBufferCopy[] src) {
        VkBufferCopy[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("srcOffset"),
        ValueLayout.JAVA_LONG.withName("dstOffset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$srcOffset = PathElement.groupElement("PATH$srcOffset");
    public static final PathElement PATH$dstOffset = PathElement.groupElement("PATH$dstOffset");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");

    public static final OfLong LAYOUT$srcOffset = (OfLong) LAYOUT.select(PATH$srcOffset);
    public static final OfLong LAYOUT$dstOffset = (OfLong) LAYOUT.select(PATH$dstOffset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);

    public static final long SIZE$srcOffset = LAYOUT$srcOffset.byteSize();
    public static final long SIZE$dstOffset = LAYOUT$dstOffset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();

    public static final long OFFSET$srcOffset = LAYOUT.byteOffset(PATH$srcOffset);
    public static final long OFFSET$dstOffset = LAYOUT.byteOffset(PATH$dstOffset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public @unsigned long srcOffset() {
        return segment.get(LAYOUT$srcOffset, OFFSET$srcOffset);
    }

    public void srcOffset(@unsigned long value) {
        segment.set(LAYOUT$srcOffset, OFFSET$srcOffset, value);
    }

    public @unsigned long dstOffset() {
        return segment.get(LAYOUT$dstOffset, OFFSET$dstOffset);
    }

    public void dstOffset(@unsigned long value) {
        segment.set(LAYOUT$dstOffset, OFFSET$dstOffset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

}

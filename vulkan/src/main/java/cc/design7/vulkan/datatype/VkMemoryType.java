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

/// Represents a pointer to a {@code VkMemoryType} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryType.html">VkMemoryType</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMemoryType(@NotNull MemorySegment segment) implements IPointer {
    public static VkMemoryType allocate(Arena arena) {
        return new VkMemoryType(arena.allocate(LAYOUT));
    }

    public static VkMemoryType[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryType[] ret = new VkMemoryType[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryType(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMemoryType clone(Arena arena, VkMemoryType src) {
        VkMemoryType ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryType[] clone(Arena arena, VkMemoryType[] src) {
        VkMemoryType[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("propertyFlags"),
        ValueLayout.JAVA_INT.withName("heapIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$propertyFlags = PathElement.groupElement("PATH$propertyFlags");
    public static final PathElement PATH$heapIndex = PathElement.groupElement("PATH$heapIndex");

    public static final OfInt LAYOUT$propertyFlags = (OfInt) LAYOUT.select(PATH$propertyFlags);
    public static final OfInt LAYOUT$heapIndex = (OfInt) LAYOUT.select(PATH$heapIndex);

    public static final long SIZE$propertyFlags = LAYOUT$propertyFlags.byteSize();
    public static final long SIZE$heapIndex = LAYOUT$heapIndex.byteSize();

    public static final long OFFSET$propertyFlags = LAYOUT.byteOffset(PATH$propertyFlags);
    public static final long OFFSET$heapIndex = LAYOUT.byteOffset(PATH$heapIndex);

    public @enumtype(VkMemoryPropertyFlags.class) int propertyFlags() {
        return segment.get(LAYOUT$propertyFlags, OFFSET$propertyFlags);
    }

    public void propertyFlags(@enumtype(VkMemoryPropertyFlags.class) int value) {
        segment.set(LAYOUT$propertyFlags, OFFSET$propertyFlags, value);
    }

    public @unsigned int heapIndex() {
        return segment.get(LAYOUT$heapIndex, OFFSET$heapIndex);
    }

    public void heapIndex(@unsigned int value) {
        segment.set(LAYOUT$heapIndex, OFFSET$heapIndex, value);
    }

}

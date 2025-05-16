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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchIndirectCommand.html"><code>VkDispatchIndirectCommand</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDispatchIndirectCommand {
///     uint32_t x;
///     uint32_t y;
///     uint32_t z;
/// } VkDispatchIndirectCommand;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchIndirectCommand.html"><code>VkDispatchIndirectCommand</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDispatchIndirectCommand(@NotNull MemorySegment segment) implements IPointer {
    public static VkDispatchIndirectCommand allocate(Arena arena) {
        VkDispatchIndirectCommand ret = new VkDispatchIndirectCommand(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDispatchIndirectCommand[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDispatchIndirectCommand[] ret = new VkDispatchIndirectCommand[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDispatchIndirectCommand(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDispatchIndirectCommand clone(Arena arena, VkDispatchIndirectCommand src) {
        VkDispatchIndirectCommand ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDispatchIndirectCommand[] clone(Arena arena, VkDispatchIndirectCommand[] src) {
        VkDispatchIndirectCommand[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public void x(@unsigned int value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
    }

    public @unsigned int y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public void y(@unsigned int value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
    }

    public @unsigned int z() {
        return segment.get(LAYOUT$z, OFFSET$z);
    }

    public void z(@unsigned int value) {
        segment.set(LAYOUT$z, OFFSET$z, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("PATH$x");
    public static final PathElement PATH$y = PathElement.groupElement("PATH$y");
    public static final PathElement PATH$z = PathElement.groupElement("PATH$z");

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);
    public static final OfInt LAYOUT$z = (OfInt) LAYOUT.select(PATH$z);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$z = LAYOUT$z.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$z = LAYOUT.byteOffset(PATH$z);
}

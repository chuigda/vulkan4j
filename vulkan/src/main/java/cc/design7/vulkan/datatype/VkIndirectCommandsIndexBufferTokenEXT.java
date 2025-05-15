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

/// Represents a pointer to a {@code VkIndirectCommandsIndexBufferTokenEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsIndexBufferTokenEXT.html">VkIndirectCommandsIndexBufferTokenEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsIndexBufferTokenEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectCommandsIndexBufferTokenEXT allocate(Arena arena) {
        return new VkIndirectCommandsIndexBufferTokenEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsIndexBufferTokenEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsIndexBufferTokenEXT[] ret = new VkIndirectCommandsIndexBufferTokenEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectCommandsIndexBufferTokenEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkIndirectCommandsIndexBufferTokenEXT clone(Arena arena, VkIndirectCommandsIndexBufferTokenEXT src) {
        VkIndirectCommandsIndexBufferTokenEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsIndexBufferTokenEXT[] clone(Arena arena, VkIndirectCommandsIndexBufferTokenEXT[] src) {
        VkIndirectCommandsIndexBufferTokenEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");

    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);

    public static final long SIZE$mode = LAYOUT$mode.byteSize();

    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);

    public @enumtype(VkIndirectCommandsInputModeFlagsEXT.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkIndirectCommandsInputModeFlagsEXT.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

}

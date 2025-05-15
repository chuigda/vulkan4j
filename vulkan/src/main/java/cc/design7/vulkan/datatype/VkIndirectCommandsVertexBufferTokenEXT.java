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

/// Represents a pointer to a {@code VkIndirectCommandsVertexBufferTokenEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsVertexBufferTokenEXT.html">VkIndirectCommandsVertexBufferTokenEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsVertexBufferTokenEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectCommandsVertexBufferTokenEXT allocate(Arena arena) {
        return new VkIndirectCommandsVertexBufferTokenEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsVertexBufferTokenEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsVertexBufferTokenEXT[] ret = new VkIndirectCommandsVertexBufferTokenEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectCommandsVertexBufferTokenEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkIndirectCommandsVertexBufferTokenEXT clone(Arena arena, VkIndirectCommandsVertexBufferTokenEXT src) {
        VkIndirectCommandsVertexBufferTokenEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsVertexBufferTokenEXT[] clone(Arena arena, VkIndirectCommandsVertexBufferTokenEXT[] src) {
        VkIndirectCommandsVertexBufferTokenEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("vertexBindingUnit")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$vertexBindingUnit = PathElement.groupElement("PATH$vertexBindingUnit");

    public static final OfInt LAYOUT$vertexBindingUnit = (OfInt) LAYOUT.select(PATH$vertexBindingUnit);

    public static final long SIZE$vertexBindingUnit = LAYOUT$vertexBindingUnit.byteSize();

    public static final long OFFSET$vertexBindingUnit = LAYOUT.byteOffset(PATH$vertexBindingUnit);

    public @unsigned int vertexBindingUnit() {
        return segment.get(LAYOUT$vertexBindingUnit, OFFSET$vertexBindingUnit);
    }

    public void vertexBindingUnit(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingUnit, OFFSET$vertexBindingUnit, value);
    }

}

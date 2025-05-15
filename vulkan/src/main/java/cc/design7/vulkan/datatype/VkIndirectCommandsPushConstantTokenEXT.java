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

/// Represents a pointer to a {@code VkIndirectCommandsPushConstantTokenEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsPushConstantTokenEXT.html">VkIndirectCommandsPushConstantTokenEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsPushConstantTokenEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectCommandsPushConstantTokenEXT allocate(Arena arena) {
        return new VkIndirectCommandsPushConstantTokenEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsPushConstantTokenEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsPushConstantTokenEXT[] ret = new VkIndirectCommandsPushConstantTokenEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectCommandsPushConstantTokenEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkIndirectCommandsPushConstantTokenEXT clone(Arena arena, VkIndirectCommandsPushConstantTokenEXT src) {
        VkIndirectCommandsPushConstantTokenEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsPushConstantTokenEXT[] clone(Arena arena, VkIndirectCommandsPushConstantTokenEXT[] src) {
        VkIndirectCommandsPushConstantTokenEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkPushConstantRange.LAYOUT.withName("updateRange")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$updateRange = PathElement.groupElement("PATH$updateRange");

    public static final StructLayout LAYOUT$updateRange = (StructLayout) LAYOUT.select(PATH$updateRange);

    public static final long SIZE$updateRange = LAYOUT$updateRange.byteSize();

    public static final long OFFSET$updateRange = LAYOUT.byteOffset(PATH$updateRange);

    public VkPushConstantRange updateRange() {
        return new VkPushConstantRange(segment.asSlice(OFFSET$updateRange, LAYOUT$updateRange));
    }

    public void updateRange(VkPushConstantRange value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$updateRange, SIZE$updateRange);
    }

}

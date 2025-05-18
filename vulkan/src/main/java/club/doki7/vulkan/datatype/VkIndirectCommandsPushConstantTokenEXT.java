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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsPushConstantTokenEXT.html"><code>VkIndirectCommandsPushConstantTokenEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectCommandsPushConstantTokenEXT {
///     VkPushConstantRange updateRange; // @link substring="VkPushConstantRange" target="VkPushConstantRange" @link substring="updateRange" target="#updateRange"
/// } VkIndirectCommandsPushConstantTokenEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsPushConstantTokenEXT.html"><code>VkIndirectCommandsPushConstantTokenEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsPushConstantTokenEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectCommandsPushConstantTokenEXT allocate(Arena arena) {
        VkIndirectCommandsPushConstantTokenEXT ret = new VkIndirectCommandsPushConstantTokenEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkIndirectCommandsPushConstantTokenEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsPushConstantTokenEXT[] ret = new VkIndirectCommandsPushConstantTokenEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectCommandsPushConstantTokenEXT(segment.asSlice(i * BYTES, BYTES));
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

    public @NotNull VkPushConstantRange updateRange() {
        return new VkPushConstantRange(segment.asSlice(OFFSET$updateRange, LAYOUT$updateRange));
    }

    public void updateRange(@NotNull VkPushConstantRange value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$updateRange, SIZE$updateRange);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkPushConstantRange.LAYOUT.withName("updateRange")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$updateRange = PathElement.groupElement("PATH$updateRange");

    public static final StructLayout LAYOUT$updateRange = (StructLayout) LAYOUT.select(PATH$updateRange);

    public static final long SIZE$updateRange = LAYOUT$updateRange.byteSize();

    public static final long OFFSET$updateRange = LAYOUT.byteOffset(PATH$updateRange);
}

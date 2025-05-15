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

/// Represents a pointer to a {@code VkBindPipelineIndirectCommandNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindPipelineIndirectCommandNV.html">VkBindPipelineIndirectCommandNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBindPipelineIndirectCommandNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkBindPipelineIndirectCommandNV allocate(Arena arena) {
        return new VkBindPipelineIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkBindPipelineIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindPipelineIndirectCommandNV[] ret = new VkBindPipelineIndirectCommandNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindPipelineIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindPipelineIndirectCommandNV clone(Arena arena, VkBindPipelineIndirectCommandNV src) {
        VkBindPipelineIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindPipelineIndirectCommandNV[] clone(Arena arena, VkBindPipelineIndirectCommandNV[] src) {
        VkBindPipelineIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("pipelineAddress")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$pipelineAddress = PathElement.groupElement("PATH$pipelineAddress");

    public static final OfLong LAYOUT$pipelineAddress = (OfLong) LAYOUT.select(PATH$pipelineAddress);

    public static final long SIZE$pipelineAddress = LAYOUT$pipelineAddress.byteSize();

    public static final long OFFSET$pipelineAddress = LAYOUT.byteOffset(PATH$pipelineAddress);

    public @unsigned long pipelineAddress() {
        return segment.get(LAYOUT$pipelineAddress, OFFSET$pipelineAddress);
    }

    public void pipelineAddress(@unsigned long value) {
        segment.set(LAYOUT$pipelineAddress, OFFSET$pipelineAddress, value);
    }

}

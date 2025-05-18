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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindPipelineIndirectCommandNV.html"><code>VkBindPipelineIndirectCommandNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBindPipelineIndirectCommandNV {
///     VkDeviceAddress pipelineAddress; // @link substring="pipelineAddress" target="#pipelineAddress"
/// } VkBindPipelineIndirectCommandNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindPipelineIndirectCommandNV.html"><code>VkBindPipelineIndirectCommandNV</code></a>
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
            ret[i] = new VkBindPipelineIndirectCommandNV(segment.asSlice(i * BYTES, BYTES));
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

    public @unsigned long pipelineAddress() {
        return segment.get(LAYOUT$pipelineAddress, OFFSET$pipelineAddress);
    }

    public void pipelineAddress(@unsigned long value) {
        segment.set(LAYOUT$pipelineAddress, OFFSET$pipelineAddress, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("pipelineAddress")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$pipelineAddress = PathElement.groupElement("PATH$pipelineAddress");

    public static final OfLong LAYOUT$pipelineAddress = (OfLong) LAYOUT.select(PATH$pipelineAddress);

    public static final long SIZE$pipelineAddress = LAYOUT$pipelineAddress.byteSize();

    public static final long OFFSET$pipelineAddress = LAYOUT.byteOffset(PATH$pipelineAddress);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawIndexedIndirectCommand.html"><code>VkDrawIndexedIndirectCommand</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDrawIndexedIndirectCommand {
///     uint32_t indexCount;
///     uint32_t instanceCount;
///     uint32_t firstIndex;
///     int32_t vertexOffset;
///     uint32_t firstInstance;
/// } VkDrawIndexedIndirectCommand;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawIndexedIndirectCommand.html"><code>VkDrawIndexedIndirectCommand</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDrawIndexedIndirectCommand(@NotNull MemorySegment segment) implements IPointer {
    public static VkDrawIndexedIndirectCommand allocate(Arena arena) {
        VkDrawIndexedIndirectCommand ret = new VkDrawIndexedIndirectCommand(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDrawIndexedIndirectCommand[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawIndexedIndirectCommand[] ret = new VkDrawIndexedIndirectCommand[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrawIndexedIndirectCommand(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDrawIndexedIndirectCommand clone(Arena arena, VkDrawIndexedIndirectCommand src) {
        VkDrawIndexedIndirectCommand ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrawIndexedIndirectCommand[] clone(Arena arena, VkDrawIndexedIndirectCommand[] src) {
        VkDrawIndexedIndirectCommand[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public void indexCount(@unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
    }

    public @unsigned int instanceCount() {
        return segment.get(LAYOUT$instanceCount, OFFSET$instanceCount);
    }

    public void instanceCount(@unsigned int value) {
        segment.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);
    }

    public @unsigned int firstIndex() {
        return segment.get(LAYOUT$firstIndex, OFFSET$firstIndex);
    }

    public void firstIndex(@unsigned int value) {
        segment.set(LAYOUT$firstIndex, OFFSET$firstIndex, value);
    }

    public int vertexOffset() {
        return segment.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);
    }

    public void vertexOffset(int value) {
        segment.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);
    }

    public @unsigned int firstInstance() {
        return segment.get(LAYOUT$firstInstance, OFFSET$firstInstance);
    }

    public void firstInstance(@unsigned int value) {
        segment.set(LAYOUT$firstInstance, OFFSET$firstInstance, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("firstInstance")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$indexCount = PathElement.groupElement("PATH$indexCount");
    public static final PathElement PATH$instanceCount = PathElement.groupElement("PATH$instanceCount");
    public static final PathElement PATH$firstIndex = PathElement.groupElement("PATH$firstIndex");
    public static final PathElement PATH$vertexOffset = PathElement.groupElement("PATH$vertexOffset");
    public static final PathElement PATH$firstInstance = PathElement.groupElement("PATH$firstInstance");

    public static final OfInt LAYOUT$indexCount = (OfInt) LAYOUT.select(PATH$indexCount);
    public static final OfInt LAYOUT$instanceCount = (OfInt) LAYOUT.select(PATH$instanceCount);
    public static final OfInt LAYOUT$firstIndex = (OfInt) LAYOUT.select(PATH$firstIndex);
    public static final OfInt LAYOUT$vertexOffset = (OfInt) LAYOUT.select(PATH$vertexOffset);
    public static final OfInt LAYOUT$firstInstance = (OfInt) LAYOUT.select(PATH$firstInstance);

    public static final long SIZE$indexCount = LAYOUT$indexCount.byteSize();
    public static final long SIZE$instanceCount = LAYOUT$instanceCount.byteSize();
    public static final long SIZE$firstIndex = LAYOUT$firstIndex.byteSize();
    public static final long SIZE$vertexOffset = LAYOUT$vertexOffset.byteSize();
    public static final long SIZE$firstInstance = LAYOUT$firstInstance.byteSize();

    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$instanceCount = LAYOUT.byteOffset(PATH$instanceCount);
    public static final long OFFSET$firstIndex = LAYOUT.byteOffset(PATH$firstIndex);
    public static final long OFFSET$vertexOffset = LAYOUT.byteOffset(PATH$vertexOffset);
    public static final long OFFSET$firstInstance = LAYOUT.byteOffset(PATH$firstInstance);
}

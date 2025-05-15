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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawIndirectCountIndirectCommandEXT.html"><code>VkDrawIndirectCountIndirectCommandEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDrawIndirectCountIndirectCommandEXT {
///     VkDeviceAddress bufferAddress;
///     uint32_t stride;
///     uint32_t commandCount;
/// } VkDrawIndirectCountIndirectCommandEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawIndirectCountIndirectCommandEXT.html"><code>VkDrawIndirectCountIndirectCommandEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDrawIndirectCountIndirectCommandEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDrawIndirectCountIndirectCommandEXT allocate(Arena arena) {
        VkDrawIndirectCountIndirectCommandEXT ret = new VkDrawIndirectCountIndirectCommandEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDrawIndirectCountIndirectCommandEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawIndirectCountIndirectCommandEXT[] ret = new VkDrawIndirectCountIndirectCommandEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrawIndirectCountIndirectCommandEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDrawIndirectCountIndirectCommandEXT clone(Arena arena, VkDrawIndirectCountIndirectCommandEXT src) {
        VkDrawIndirectCountIndirectCommandEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrawIndirectCountIndirectCommandEXT[] clone(Arena arena, VkDrawIndirectCountIndirectCommandEXT[] src) {
        VkDrawIndirectCountIndirectCommandEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned long bufferAddress() {
        return segment.get(LAYOUT$bufferAddress, OFFSET$bufferAddress);
    }

    public void bufferAddress(@unsigned long value) {
        segment.set(LAYOUT$bufferAddress, OFFSET$bufferAddress, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @unsigned int commandCount() {
        return segment.get(LAYOUT$commandCount, OFFSET$commandCount);
    }

    public void commandCount(@unsigned int value) {
        segment.set(LAYOUT$commandCount, OFFSET$commandCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("commandCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bufferAddress = PathElement.groupElement("PATH$bufferAddress");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");
    public static final PathElement PATH$commandCount = PathElement.groupElement("PATH$commandCount");

    public static final OfLong LAYOUT$bufferAddress = (OfLong) LAYOUT.select(PATH$bufferAddress);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final OfInt LAYOUT$commandCount = (OfInt) LAYOUT.select(PATH$commandCount);

    public static final long SIZE$bufferAddress = LAYOUT$bufferAddress.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$commandCount = LAYOUT$commandCount.byteSize();

    public static final long OFFSET$bufferAddress = LAYOUT.byteOffset(PATH$bufferAddress);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$commandCount = LAYOUT.byteOffset(PATH$commandCount);
}

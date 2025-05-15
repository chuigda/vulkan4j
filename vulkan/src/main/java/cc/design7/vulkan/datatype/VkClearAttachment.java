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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearAttachment.html"><code>VkClearAttachment</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClearAttachment {
///     VkImageAspectFlags aspectMask;
///     uint32_t colorAttachment;
///     VkClearValue clearValue;
/// } VkClearAttachment;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearAttachment.html"><code>VkClearAttachment</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClearAttachment(@NotNull MemorySegment segment) implements IPointer {
    public static VkClearAttachment allocate(Arena arena) {
        VkClearAttachment ret = new VkClearAttachment(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkClearAttachment[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearAttachment[] ret = new VkClearAttachment[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClearAttachment(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkClearAttachment clone(Arena arena, VkClearAttachment src) {
        VkClearAttachment ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClearAttachment[] clone(Arena arena, VkClearAttachment[] src) {
        VkClearAttachment[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public @unsigned int colorAttachment() {
        return segment.get(LAYOUT$colorAttachment, OFFSET$colorAttachment);
    }

    public void colorAttachment(@unsigned int value) {
        segment.set(LAYOUT$colorAttachment, OFFSET$colorAttachment, value);
    }

    public VkClearValue clearValue() {
        return new VkClearValue(segment.asSlice(OFFSET$clearValue, LAYOUT$clearValue));
    }

    public void clearValue(VkClearValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clearValue, SIZE$clearValue);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("colorAttachment"),
        VkClearValue.LAYOUT.withName("clearValue")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$aspectMask = PathElement.groupElement("PATH$aspectMask");
    public static final PathElement PATH$colorAttachment = PathElement.groupElement("PATH$colorAttachment");
    public static final PathElement PATH$clearValue = PathElement.groupElement("PATH$clearValue");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final OfInt LAYOUT$colorAttachment = (OfInt) LAYOUT.select(PATH$colorAttachment);
    public static final StructLayout LAYOUT$clearValue = (StructLayout) LAYOUT.select(PATH$clearValue);

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$colorAttachment = LAYOUT$colorAttachment.byteSize();
    public static final long SIZE$clearValue = LAYOUT$clearValue.byteSize();

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$colorAttachment = LAYOUT.byteOffset(PATH$colorAttachment);
    public static final long OFFSET$clearValue = LAYOUT.byteOffset(PATH$clearValue);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkInputAttachmentAspectReference.html"><code>VkInputAttachmentAspectReference</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkInputAttachmentAspectReference {
///     uint32_t subpass; // @link substring="subpass" target="#subpass"
///     uint32_t inputAttachmentIndex; // @link substring="inputAttachmentIndex" target="#inputAttachmentIndex"
///     VkImageAspectFlags aspectMask; // @link substring="VkImageAspectFlags" target="VkImageAspectFlags" @link substring="aspectMask" target="#aspectMask"
/// } VkInputAttachmentAspectReference;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkInputAttachmentAspectReference.html"><code>VkInputAttachmentAspectReference</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkInputAttachmentAspectReference(@NotNull MemorySegment segment) implements IPointer {
    public static VkInputAttachmentAspectReference allocate(Arena arena) {
        VkInputAttachmentAspectReference ret = new VkInputAttachmentAspectReference(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkInputAttachmentAspectReference[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkInputAttachmentAspectReference[] ret = new VkInputAttachmentAspectReference[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkInputAttachmentAspectReference(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkInputAttachmentAspectReference clone(Arena arena, VkInputAttachmentAspectReference src) {
        VkInputAttachmentAspectReference ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkInputAttachmentAspectReference[] clone(Arena arena, VkInputAttachmentAspectReference[] src) {
        VkInputAttachmentAspectReference[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int subpass() {
        return segment.get(LAYOUT$subpass, OFFSET$subpass);
    }

    public void subpass(@unsigned int value) {
        segment.set(LAYOUT$subpass, OFFSET$subpass, value);
    }

    public @unsigned int inputAttachmentIndex() {
        return segment.get(LAYOUT$inputAttachmentIndex, OFFSET$inputAttachmentIndex);
    }

    public void inputAttachmentIndex(@unsigned int value) {
        segment.set(LAYOUT$inputAttachmentIndex, OFFSET$inputAttachmentIndex, value);
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_INT.withName("inputAttachmentIndex"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$subpass = PathElement.groupElement("PATH$subpass");
    public static final PathElement PATH$inputAttachmentIndex = PathElement.groupElement("PATH$inputAttachmentIndex");
    public static final PathElement PATH$aspectMask = PathElement.groupElement("PATH$aspectMask");

    public static final OfInt LAYOUT$subpass = (OfInt) LAYOUT.select(PATH$subpass);
    public static final OfInt LAYOUT$inputAttachmentIndex = (OfInt) LAYOUT.select(PATH$inputAttachmentIndex);
    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);

    public static final long SIZE$subpass = LAYOUT$subpass.byteSize();
    public static final long SIZE$inputAttachmentIndex = LAYOUT$inputAttachmentIndex.byteSize();
    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();

    public static final long OFFSET$subpass = LAYOUT.byteOffset(PATH$subpass);
    public static final long OFFSET$inputAttachmentIndex = LAYOUT.byteOffset(PATH$inputAttachmentIndex);
    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
}

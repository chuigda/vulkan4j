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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentReference.html"><code>VkAttachmentReference</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAttachmentReference {
///     uint32_t attachment; // @link substring="attachment" target="#attachment"
///     VkImageLayout layout; // @link substring="VkImageLayout" target="VkImageLayout" @link substring="layout" target="#layout"
/// } VkAttachmentReference;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentReference.html"><code>VkAttachmentReference</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAttachmentReference(@NotNull MemorySegment segment) implements IPointer {
    public static VkAttachmentReference allocate(Arena arena) {
        return new VkAttachmentReference(arena.allocate(LAYOUT));
    }

    public static VkAttachmentReference[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentReference[] ret = new VkAttachmentReference[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAttachmentReference(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkAttachmentReference clone(Arena arena, VkAttachmentReference src) {
        VkAttachmentReference ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentReference[] clone(Arena arena, VkAttachmentReference[] src) {
        VkAttachmentReference[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int attachment() {
        return segment.get(LAYOUT$attachment, OFFSET$attachment);
    }

    public void attachment(@unsigned int value) {
        segment.set(LAYOUT$attachment, OFFSET$attachment, value);
    }

    public @enumtype(VkImageLayout.class) int layout() {
        return segment.get(LAYOUT$layout, OFFSET$layout);
    }

    public void layout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("attachment"),
        ValueLayout.JAVA_INT.withName("layout")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$attachment = PathElement.groupElement("PATH$attachment");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");

    public static final OfInt LAYOUT$attachment = (OfInt) LAYOUT.select(PATH$attachment);
    public static final OfInt LAYOUT$layout = (OfInt) LAYOUT.select(PATH$layout);

    public static final long SIZE$attachment = LAYOUT$attachment.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();

    public static final long OFFSET$attachment = LAYOUT.byteOffset(PATH$attachment);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassSubpassFeedbackInfoEXT.html"><code>VkRenderPassSubpassFeedbackInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassSubpassFeedbackInfoEXT {
///     VkSubpassMergeStatusEXT subpassMergeStatus; // @link substring="VkSubpassMergeStatusEXT" target="VkSubpassMergeStatusEXT" @link substring="subpassMergeStatus" target="#subpassMergeStatus"
///     char description; // @link substring="description" target="#description"
///     uint32_t postMergeIndex; // @link substring="postMergeIndex" target="#postMergeIndex"
/// } VkRenderPassSubpassFeedbackInfoEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassSubpassFeedbackInfoEXT.html"><code>VkRenderPassSubpassFeedbackInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassSubpassFeedbackInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderPassSubpassFeedbackInfoEXT allocate(Arena arena) {
        VkRenderPassSubpassFeedbackInfoEXT ret = new VkRenderPassSubpassFeedbackInfoEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkRenderPassSubpassFeedbackInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassSubpassFeedbackInfoEXT[] ret = new VkRenderPassSubpassFeedbackInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassSubpassFeedbackInfoEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkRenderPassSubpassFeedbackInfoEXT clone(Arena arena, VkRenderPassSubpassFeedbackInfoEXT src) {
        VkRenderPassSubpassFeedbackInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassSubpassFeedbackInfoEXT[] clone(Arena arena, VkRenderPassSubpassFeedbackInfoEXT[] src) {
        VkRenderPassSubpassFeedbackInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkSubpassMergeStatusEXT.class) int subpassMergeStatus() {
        return segment.get(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus);
    }

    public void subpassMergeStatus(@enumtype(VkSubpassMergeStatusEXT.class) int value) {
        segment.set(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus, value);
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public @unsigned int postMergeIndex() {
        return segment.get(LAYOUT$postMergeIndex, OFFSET$postMergeIndex);
    }

    public void postMergeIndex(@unsigned int value) {
        segment.set(LAYOUT$postMergeIndex, OFFSET$postMergeIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpassMergeStatus"),
        ValueLayout.JAVA_BYTE.withName("description"),
        ValueLayout.JAVA_INT.withName("postMergeIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$subpassMergeStatus = PathElement.groupElement("PATH$subpassMergeStatus");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");
    public static final PathElement PATH$postMergeIndex = PathElement.groupElement("PATH$postMergeIndex");

    public static final OfInt LAYOUT$subpassMergeStatus = (OfInt) LAYOUT.select(PATH$subpassMergeStatus);
    public static final OfByte LAYOUT$description = (OfByte) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$postMergeIndex = (OfInt) LAYOUT.select(PATH$postMergeIndex);

    public static final long SIZE$subpassMergeStatus = LAYOUT$subpassMergeStatus.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$postMergeIndex = LAYOUT$postMergeIndex.byteSize();

    public static final long OFFSET$subpassMergeStatus = LAYOUT.byteOffset(PATH$subpassMergeStatus);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$postMergeIndex = LAYOUT.byteOffset(PATH$postMergeIndex);
}

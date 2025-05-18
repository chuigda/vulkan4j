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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassCreationFeedbackInfoEXT.html"><code>VkRenderPassCreationFeedbackInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassCreationFeedbackInfoEXT {
///     uint32_t postMergeSubpassCount; // @link substring="postMergeSubpassCount" target="#postMergeSubpassCount"
/// } VkRenderPassCreationFeedbackInfoEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassCreationFeedbackInfoEXT.html"><code>VkRenderPassCreationFeedbackInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassCreationFeedbackInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderPassCreationFeedbackInfoEXT allocate(Arena arena) {
        return new VkRenderPassCreationFeedbackInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkRenderPassCreationFeedbackInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassCreationFeedbackInfoEXT[] ret = new VkRenderPassCreationFeedbackInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassCreationFeedbackInfoEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkRenderPassCreationFeedbackInfoEXT clone(Arena arena, VkRenderPassCreationFeedbackInfoEXT src) {
        VkRenderPassCreationFeedbackInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassCreationFeedbackInfoEXT[] clone(Arena arena, VkRenderPassCreationFeedbackInfoEXT[] src) {
        VkRenderPassCreationFeedbackInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int postMergeSubpassCount() {
        return segment.get(LAYOUT$postMergeSubpassCount, OFFSET$postMergeSubpassCount);
    }

    public void postMergeSubpassCount(@unsigned int value) {
        segment.set(LAYOUT$postMergeSubpassCount, OFFSET$postMergeSubpassCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("postMergeSubpassCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$postMergeSubpassCount = PathElement.groupElement("PATH$postMergeSubpassCount");

    public static final OfInt LAYOUT$postMergeSubpassCount = (OfInt) LAYOUT.select(PATH$postMergeSubpassCount);

    public static final long SIZE$postMergeSubpassCount = LAYOUT$postMergeSubpassCount.byteSize();

    public static final long OFFSET$postMergeSubpassCount = LAYOUT.byteOffset(PATH$postMergeSubpassCount);
}

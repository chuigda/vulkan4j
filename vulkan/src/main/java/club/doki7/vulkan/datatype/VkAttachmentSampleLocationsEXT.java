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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentSampleLocationsEXT.html"><code>VkAttachmentSampleLocationsEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAttachmentSampleLocationsEXT {
///     uint32_t attachmentIndex;
///     VkSampleLocationsInfoEXT sampleLocationsInfo;
/// } VkAttachmentSampleLocationsEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentSampleLocationsEXT.html"><code>VkAttachmentSampleLocationsEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAttachmentSampleLocationsEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkAttachmentSampleLocationsEXT allocate(Arena arena) {
        VkAttachmentSampleLocationsEXT ret = new VkAttachmentSampleLocationsEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkAttachmentSampleLocationsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentSampleLocationsEXT[] ret = new VkAttachmentSampleLocationsEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAttachmentSampleLocationsEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkAttachmentSampleLocationsEXT clone(Arena arena, VkAttachmentSampleLocationsEXT src) {
        VkAttachmentSampleLocationsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentSampleLocationsEXT[] clone(Arena arena, VkAttachmentSampleLocationsEXT[] src) {
        VkAttachmentSampleLocationsEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int attachmentIndex() {
        return segment.get(LAYOUT$attachmentIndex, OFFSET$attachmentIndex);
    }

    public void attachmentIndex(@unsigned int value) {
        segment.set(LAYOUT$attachmentIndex, OFFSET$attachmentIndex, value);
    }

    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(segment.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));
    }

    public void sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationsInfo, SIZE$sampleLocationsInfo);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("attachmentIndex"),
        VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$attachmentIndex = PathElement.groupElement("PATH$attachmentIndex");
    public static final PathElement PATH$sampleLocationsInfo = PathElement.groupElement("PATH$sampleLocationsInfo");

    public static final OfInt LAYOUT$attachmentIndex = (OfInt) LAYOUT.select(PATH$attachmentIndex);
    public static final StructLayout LAYOUT$sampleLocationsInfo = (StructLayout) LAYOUT.select(PATH$sampleLocationsInfo);

    public static final long SIZE$attachmentIndex = LAYOUT$attachmentIndex.byteSize();
    public static final long SIZE$sampleLocationsInfo = LAYOUT$sampleLocationsInfo.byteSize();

    public static final long OFFSET$attachmentIndex = LAYOUT.byteOffset(PATH$attachmentIndex);
    public static final long OFFSET$sampleLocationsInfo = LAYOUT.byteOffset(PATH$sampleLocationsInfo);
}

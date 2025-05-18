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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassSampleLocationsEXT.html"><code>VkSubpassSampleLocationsEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSubpassSampleLocationsEXT {
///     uint32_t subpassIndex; // @link substring="subpassIndex" target="#subpassIndex"
///     VkSampleLocationsInfoEXT sampleLocationsInfo; // @link substring="VkSampleLocationsInfoEXT" target="VkSampleLocationsInfoEXT" @link substring="sampleLocationsInfo" target="#sampleLocationsInfo"
/// } VkSubpassSampleLocationsEXT;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassSampleLocationsEXT.html"><code>VkSubpassSampleLocationsEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubpassSampleLocationsEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkSubpassSampleLocationsEXT allocate(Arena arena) {
        return new VkSubpassSampleLocationsEXT(arena.allocate(LAYOUT));
    }

    public static VkSubpassSampleLocationsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassSampleLocationsEXT[] ret = new VkSubpassSampleLocationsEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubpassSampleLocationsEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkSubpassSampleLocationsEXT clone(Arena arena, VkSubpassSampleLocationsEXT src) {
        VkSubpassSampleLocationsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubpassSampleLocationsEXT[] clone(Arena arena, VkSubpassSampleLocationsEXT[] src) {
        VkSubpassSampleLocationsEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int subpassIndex() {
        return segment.get(LAYOUT$subpassIndex, OFFSET$subpassIndex);
    }

    public void subpassIndex(@unsigned int value) {
        segment.set(LAYOUT$subpassIndex, OFFSET$subpassIndex, value);
    }

    public @NotNull VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(segment.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));
    }

    public void sampleLocationsInfo(@NotNull VkSampleLocationsInfoEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationsInfo, SIZE$sampleLocationsInfo);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpassIndex"),
        VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$subpassIndex = PathElement.groupElement("PATH$subpassIndex");
    public static final PathElement PATH$sampleLocationsInfo = PathElement.groupElement("PATH$sampleLocationsInfo");

    public static final OfInt LAYOUT$subpassIndex = (OfInt) LAYOUT.select(PATH$subpassIndex);
    public static final StructLayout LAYOUT$sampleLocationsInfo = (StructLayout) LAYOUT.select(PATH$sampleLocationsInfo);

    public static final long SIZE$subpassIndex = LAYOUT$subpassIndex.byteSize();
    public static final long SIZE$sampleLocationsInfo = LAYOUT$sampleLocationsInfo.byteSize();

    public static final long OFFSET$subpassIndex = LAYOUT.byteOffset(PATH$subpassIndex);
    public static final long OFFSET$sampleLocationsInfo = LAYOUT.byteOffset(PATH$sampleLocationsInfo);
}

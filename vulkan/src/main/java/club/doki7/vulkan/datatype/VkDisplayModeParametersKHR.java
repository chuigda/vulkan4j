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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayModeParametersKHR.html"><code>VkDisplayModeParametersKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDisplayModeParametersKHR {
///     VkExtent2D visibleRegion; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="visibleRegion" target="#visibleRegion"
///     uint32_t refreshRate; // @link substring="refreshRate" target="#refreshRate"
/// } VkDisplayModeParametersKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayModeParametersKHR.html"><code>VkDisplayModeParametersKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDisplayModeParametersKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkDisplayModeParametersKHR allocate(Arena arena) {
        return new VkDisplayModeParametersKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayModeParametersKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayModeParametersKHR[] ret = new VkDisplayModeParametersKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayModeParametersKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDisplayModeParametersKHR clone(Arena arena, VkDisplayModeParametersKHR src) {
        VkDisplayModeParametersKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayModeParametersKHR[] clone(Arena arena, VkDisplayModeParametersKHR[] src) {
        VkDisplayModeParametersKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull VkExtent2D visibleRegion() {
        return new VkExtent2D(segment.asSlice(OFFSET$visibleRegion, LAYOUT$visibleRegion));
    }

    public void visibleRegion(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$visibleRegion, SIZE$visibleRegion);
    }

    public @unsigned int refreshRate() {
        return segment.get(LAYOUT$refreshRate, OFFSET$refreshRate);
    }

    public void refreshRate(@unsigned int value) {
        segment.set(LAYOUT$refreshRate, OFFSET$refreshRate, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkExtent2D.LAYOUT.withName("visibleRegion"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$visibleRegion = PathElement.groupElement("PATH$visibleRegion");
    public static final PathElement PATH$refreshRate = PathElement.groupElement("PATH$refreshRate");

    public static final StructLayout LAYOUT$visibleRegion = (StructLayout) LAYOUT.select(PATH$visibleRegion);
    public static final OfInt LAYOUT$refreshRate = (OfInt) LAYOUT.select(PATH$refreshRate);

    public static final long SIZE$visibleRegion = LAYOUT$visibleRegion.byteSize();
    public static final long SIZE$refreshRate = LAYOUT$refreshRate.byteSize();

    public static final long OFFSET$visibleRegion = LAYOUT.byteOffset(PATH$visibleRegion);
    public static final long OFFSET$refreshRate = LAYOUT.byteOffset(PATH$refreshRate);
}

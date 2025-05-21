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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRefreshCycleDurationGOOGLE.html"><code>VkRefreshCycleDurationGOOGLE</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRefreshCycleDurationGOOGLE {
///     uint64_t refreshDuration; // @link substring="refreshDuration" target="#refreshDuration"
/// } VkRefreshCycleDurationGOOGLE;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRefreshCycleDurationGOOGLE.html"><code>VkRefreshCycleDurationGOOGLE</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRefreshCycleDurationGOOGLE(@NotNull MemorySegment segment) implements IPointer {
    public static VkRefreshCycleDurationGOOGLE allocate(Arena arena) {
        return new VkRefreshCycleDurationGOOGLE(arena.allocate(LAYOUT));
    }

    public static VkRefreshCycleDurationGOOGLE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRefreshCycleDurationGOOGLE[] ret = new VkRefreshCycleDurationGOOGLE[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRefreshCycleDurationGOOGLE(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkRefreshCycleDurationGOOGLE clone(Arena arena, VkRefreshCycleDurationGOOGLE src) {
        VkRefreshCycleDurationGOOGLE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRefreshCycleDurationGOOGLE[] clone(Arena arena, VkRefreshCycleDurationGOOGLE[] src) {
        VkRefreshCycleDurationGOOGLE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned long refreshDuration() {
        return segment.get(LAYOUT$refreshDuration, OFFSET$refreshDuration);
    }

    public void refreshDuration(@unsigned long value) {
        segment.set(LAYOUT$refreshDuration, OFFSET$refreshDuration, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("refreshDuration")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$refreshDuration = PathElement.groupElement("refreshDuration");

    public static final OfLong LAYOUT$refreshDuration = (OfLong) LAYOUT.select(PATH$refreshDuration);

    public static final long SIZE$refreshDuration = LAYOUT$refreshDuration.byteSize();

    public static final long OFFSET$refreshDuration = LAYOUT.byteOffset(PATH$refreshDuration);
}

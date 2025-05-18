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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentTimeGOOGLE.html"><code>VkPresentTimeGOOGLE</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPresentTimeGOOGLE {
///     uint32_t presentID; // @link substring="presentID" target="#presentID"
///     uint64_t desiredPresentTime; // @link substring="desiredPresentTime" target="#desiredPresentTime"
/// } VkPresentTimeGOOGLE;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentTimeGOOGLE.html"><code>VkPresentTimeGOOGLE</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPresentTimeGOOGLE(@NotNull MemorySegment segment) implements IPointer {
    public static VkPresentTimeGOOGLE allocate(Arena arena) {
        return new VkPresentTimeGOOGLE(arena.allocate(LAYOUT));
    }

    public static VkPresentTimeGOOGLE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentTimeGOOGLE[] ret = new VkPresentTimeGOOGLE[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPresentTimeGOOGLE(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPresentTimeGOOGLE clone(Arena arena, VkPresentTimeGOOGLE src) {
        VkPresentTimeGOOGLE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPresentTimeGOOGLE[] clone(Arena arena, VkPresentTimeGOOGLE[] src) {
        VkPresentTimeGOOGLE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int presentID() {
        return segment.get(LAYOUT$presentID, OFFSET$presentID);
    }

    public void presentID(@unsigned int value) {
        segment.set(LAYOUT$presentID, OFFSET$presentID, value);
    }

    public @unsigned long desiredPresentTime() {
        return segment.get(LAYOUT$desiredPresentTime, OFFSET$desiredPresentTime);
    }

    public void desiredPresentTime(@unsigned long value) {
        segment.set(LAYOUT$desiredPresentTime, OFFSET$desiredPresentTime, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$presentID = PathElement.groupElement("PATH$presentID");
    public static final PathElement PATH$desiredPresentTime = PathElement.groupElement("PATH$desiredPresentTime");

    public static final OfInt LAYOUT$presentID = (OfInt) LAYOUT.select(PATH$presentID);
    public static final OfLong LAYOUT$desiredPresentTime = (OfLong) LAYOUT.select(PATH$desiredPresentTime);

    public static final long SIZE$presentID = LAYOUT$presentID.byteSize();
    public static final long SIZE$desiredPresentTime = LAYOUT$desiredPresentTime.byteSize();

    public static final long OFFSET$presentID = LAYOUT.byteOffset(PATH$presentID);
    public static final long OFFSET$desiredPresentTime = LAYOUT.byteOffset(PATH$desiredPresentTime);
}

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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentTimeGOOGLE.html">VkPresentTimeGOOGLE</a>
@ValueBasedCandidate
public record VkPresentTimeGOOGLE(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$presentID = ValueLayout.JAVA_INT.withName("presentID");
    public static final OfLong LAYOUT$desiredPresentTime = ValueLayout.JAVA_LONG.withName("desiredPresentTime");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$presentID, LAYOUT$desiredPresentTime);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPresentTimeGOOGLE allocate(Arena arena) {
        return new VkPresentTimeGOOGLE(arena.allocate(LAYOUT));
    }

    public static VkPresentTimeGOOGLE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentTimeGOOGLE[] ret = new VkPresentTimeGOOGLE[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPresentTimeGOOGLE(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$presentID = PathElement.groupElement("PATH$presentID");
    public static final PathElement PATH$desiredPresentTime = PathElement.groupElement("PATH$desiredPresentTime");

    public static final long SIZE$presentID = LAYOUT$presentID.byteSize();
    public static final long SIZE$desiredPresentTime = LAYOUT$desiredPresentTime.byteSize();

    public static final long OFFSET$presentID = LAYOUT.byteOffset(PATH$presentID);
    public static final long OFFSET$desiredPresentTime = LAYOUT.byteOffset(PATH$desiredPresentTime);

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

}

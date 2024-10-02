package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.unsigned;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.*;

/// {@snippet lang=c :
/// typedef struct VkPastPresentationTimingGOOGLE {
///     uint32_t presentID;
///     uint64_t desiredPresentTime;
///     uint64_t actualPresentTime;
///     uint64_t earliestPresentTime;
///     uint64_t presentMargin;
/// } VkPastPresentationTimingGOOGLE;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPastPresentationTimingGOOGLE.html">VkPastPresentationTimingGOOGLE</a>
public record VkPastPresentationTimingGOOGLE(MemorySegment segment) implements IPointer {
    public VkPastPresentationTimingGOOGLE(MemorySegment segment) {
        this.segment = segment;
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

    public @unsigned long actualPresentTime() {
        return segment.get(LAYOUT$actualPresentTime, OFFSET$actualPresentTime);
    }

    public void actualPresentTime(@unsigned long value) {
        segment.set(LAYOUT$actualPresentTime, OFFSET$actualPresentTime, value);
    }

    public @unsigned long earliestPresentTime() {
        return segment.get(LAYOUT$earliestPresentTime, OFFSET$earliestPresentTime);
    }

    public void earliestPresentTime(@unsigned long value) {
        segment.set(LAYOUT$earliestPresentTime, OFFSET$earliestPresentTime, value);
    }

    public @unsigned long presentMargin() {
        return segment.get(LAYOUT$presentMargin, OFFSET$presentMargin);
    }

    public void presentMargin(@unsigned long value) {
        segment.set(LAYOUT$presentMargin, OFFSET$presentMargin, value);
    }

    public static VkPastPresentationTimingGOOGLE allocate(Arena arena) {
        return new VkPastPresentationTimingGOOGLE(arena.allocate(LAYOUT));
    }

    public static VkPastPresentationTimingGOOGLE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPastPresentationTimingGOOGLE[] ret = new VkPastPresentationTimingGOOGLE[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPastPresentationTimingGOOGLE(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPastPresentationTimingGOOGLE clone(Arena arena, VkPastPresentationTimingGOOGLE src) {
        VkPastPresentationTimingGOOGLE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPastPresentationTimingGOOGLE[] clone(Arena arena, VkPastPresentationTimingGOOGLE[] src) {
        VkPastPresentationTimingGOOGLE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime"),
        ValueLayout.JAVA_LONG.withName("actualPresentTime"),
        ValueLayout.JAVA_LONG.withName("earliestPresentTime"),
        ValueLayout.JAVA_LONG.withName("presentMargin")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$presentID = PathElement.groupElement("presentID");
    public static final PathElement PATH$desiredPresentTime = PathElement.groupElement("desiredPresentTime");
    public static final PathElement PATH$actualPresentTime = PathElement.groupElement("actualPresentTime");
    public static final PathElement PATH$earliestPresentTime = PathElement.groupElement("earliestPresentTime");
    public static final PathElement PATH$presentMargin = PathElement.groupElement("presentMargin");

    public static final OfInt LAYOUT$presentID = (OfInt) LAYOUT.select(PATH$presentID);
    public static final OfLong LAYOUT$desiredPresentTime = (OfLong) LAYOUT.select(PATH$desiredPresentTime);
    public static final OfLong LAYOUT$actualPresentTime = (OfLong) LAYOUT.select(PATH$actualPresentTime);
    public static final OfLong LAYOUT$earliestPresentTime = (OfLong) LAYOUT.select(PATH$earliestPresentTime);
    public static final OfLong LAYOUT$presentMargin = (OfLong) LAYOUT.select(PATH$presentMargin);

    public static final long OFFSET$presentID = LAYOUT.byteOffset(PATH$presentID);
    public static final long OFFSET$desiredPresentTime = LAYOUT.byteOffset(PATH$desiredPresentTime);
    public static final long OFFSET$actualPresentTime = LAYOUT.byteOffset(PATH$actualPresentTime);
    public static final long OFFSET$earliestPresentTime = LAYOUT.byteOffset(PATH$earliestPresentTime);
    public static final long OFFSET$presentMargin = LAYOUT.byteOffset(PATH$presentMargin);

    public static final long SIZE$presentID = LAYOUT$presentID.byteSize();
    public static final long SIZE$desiredPresentTime = LAYOUT$desiredPresentTime.byteSize();
    public static final long SIZE$actualPresentTime = LAYOUT$actualPresentTime.byteSize();
    public static final long SIZE$earliestPresentTime = LAYOUT$earliestPresentTime.byteSize();
    public static final long SIZE$presentMargin = LAYOUT$presentMargin.byteSize();
}

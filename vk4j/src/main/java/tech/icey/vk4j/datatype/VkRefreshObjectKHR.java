package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkRefreshObjectKHR {
///     VkObjectType objectType;
///     uint64_t objectHandle;
///     VkRefreshObjectFlagsKHR flags;
/// } VkRefreshObjectKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRefreshObjectKHR.html">VkRefreshObjectKHR</a>
public record VkRefreshObjectKHR(MemorySegment segment) implements IPointer {
    public VkRefreshObjectKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkObjectType.class) int objectType() {
        return segment.get(LAYOUT$objectType, OFFSET$objectType);
    }

    public void objectType(@enumtype(VkObjectType.class) int value) {
        segment.set(LAYOUT$objectType, OFFSET$objectType, value);
    }

    public @unsigned long objectHandle() {
        return segment.get(LAYOUT$objectHandle, OFFSET$objectHandle);
    }

    public void objectHandle(@unsigned long value) {
        segment.set(LAYOUT$objectHandle, OFFSET$objectHandle, value);
    }

    public @enumtype(VkRefreshObjectFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkRefreshObjectFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public static VkRefreshObjectKHR allocate(Arena arena) {
        return new VkRefreshObjectKHR(arena.allocate(LAYOUT));
    }

    public static VkRefreshObjectKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRefreshObjectKHR[] ret = new VkRefreshObjectKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRefreshObjectKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRefreshObjectKHR clone(Arena arena, VkRefreshObjectKHR src) {
        VkRefreshObjectKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRefreshObjectKHR[] clone(Arena arena, VkRefreshObjectKHR[] src) {
        VkRefreshObjectKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$objectType = PathElement.groupElement("objectType");
    public static final PathElement PATH$objectHandle = PathElement.groupElement("objectHandle");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$objectType = (OfInt) LAYOUT.select(PATH$objectType);
    public static final OfLong LAYOUT$objectHandle = (OfLong) LAYOUT.select(PATH$objectHandle);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$objectType = LAYOUT.byteOffset(PATH$objectType);
    public static final long OFFSET$objectHandle = LAYOUT.byteOffset(PATH$objectHandle);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public static final long SIZE$objectType = LAYOUT$objectType.byteSize();
    public static final long SIZE$objectHandle = LAYOUT$objectHandle.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
}

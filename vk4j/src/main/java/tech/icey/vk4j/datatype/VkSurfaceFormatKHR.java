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
/// typedef struct VkSurfaceFormatKHR {
///     VkFormat format;
///     VkColorSpaceKHR colorSpace;
/// } VkSurfaceFormatKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSurfaceFormatKHR.html">VkSurfaceFormatKHR</a>
public record VkSurfaceFormatKHR(MemorySegment segment) implements IPointer {
    public VkSurfaceFormatKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @enumtype(VkColorSpaceKHR.class) int colorSpace() {
        return segment.get(LAYOUT$colorSpace, OFFSET$colorSpace);
    }

    public void colorSpace(@enumtype(VkColorSpaceKHR.class) int value) {
        segment.set(LAYOUT$colorSpace, OFFSET$colorSpace, value);
    }

    public static VkSurfaceFormatKHR allocate(Arena arena) {
        return new VkSurfaceFormatKHR(arena.allocate(LAYOUT));
    }

    public static VkSurfaceFormatKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfaceFormatKHR[] ret = new VkSurfaceFormatKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSurfaceFormatKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSurfaceFormatKHR clone(Arena arena, VkSurfaceFormatKHR src) {
        VkSurfaceFormatKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSurfaceFormatKHR[] clone(Arena arena, VkSurfaceFormatKHR[] src) {
        VkSurfaceFormatKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$colorSpace = PathElement.groupElement("colorSpace");

    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$colorSpace = (OfInt) LAYOUT.select(PATH$colorSpace);

    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$colorSpace = LAYOUT.byteOffset(PATH$colorSpace);

    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$colorSpace = LAYOUT$colorSpace.byteSize();
}

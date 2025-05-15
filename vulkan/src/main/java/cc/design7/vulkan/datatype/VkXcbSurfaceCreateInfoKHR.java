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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkXcbSurfaceCreateInfoKHR.html">VkXcbSurfaceCreateInfoKHR</a>
@ValueBasedCandidate
public record VkXcbSurfaceCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$connection = ValueLayout.ADDRESS.withName("connection");
    public static final OfInt LAYOUT$window = ValueLayout.JAVA_INT.withName("window");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$connection, LAYOUT$window);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkXcbSurfaceCreateInfoKHR allocate(Arena arena) {
        return new VkXcbSurfaceCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkXcbSurfaceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkXcbSurfaceCreateInfoKHR[] ret = new VkXcbSurfaceCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkXcbSurfaceCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkXcbSurfaceCreateInfoKHR clone(Arena arena, VkXcbSurfaceCreateInfoKHR src) {
        VkXcbSurfaceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkXcbSurfaceCreateInfoKHR[] clone(Arena arena, VkXcbSurfaceCreateInfoKHR[] src) {
        VkXcbSurfaceCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$connection = PathElement.groupElement("PATH$connection");
    public static final PathElement PATH$window = PathElement.groupElement("PATH$window");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$connection = LAYOUT$connection.byteSize();
    public static final long SIZE$window = LAYOUT$window.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$connection = LAYOUT.byteOffset(PATH$connection);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkXcbSurfaceCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkXcbSurfaceCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment connection() {
        return segment.get(LAYOUT$connection, OFFSET$connection);
    }

    public void connection(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$connection, OFFSET$connection, value);
    }

    public void connection(IPointer pointer) {
        connection(pointer.segment());
    }

    public @unsigned int window() {
        return segment.get(LAYOUT$window, OFFSET$window);
    }

    public void window(@unsigned int value) {
        segment.set(LAYOUT$window, OFFSET$window, value);
    }

}

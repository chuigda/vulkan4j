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
/// typedef struct VkScreenSurfaceCreateInfoQNX {
///     VkStructureType sType;
///     const void* pNext;
///     VkScreenSurfaceCreateFlagsQNX flags;
///     struct _screen_context* context;
///     struct _screen_window* window;
/// } VkScreenSurfaceCreateInfoQNX;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkScreenSurfaceCreateInfoQNX.html">VkScreenSurfaceCreateInfoQNX</a>
public record VkScreenSurfaceCreateInfoQNX(MemorySegment segment) implements IPointer {
    public VkScreenSurfaceCreateInfoQNX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SCREEN_SURFACE_CREATE_INFO_QNX);
    }

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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkScreenSurfaceCreateFlagsQNX.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkScreenSurfaceCreateFlagsQNX.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment context() {
        return segment.get(LAYOUT$context, OFFSET$context);
    }

    public void context(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$context, OFFSET$context, value);
    }

    public void context(@Nullable IPointer pointer) {
        context(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @pointer(comment="void*") MemorySegment window() {
        return segment.get(LAYOUT$window, OFFSET$window);
    }

    public void window(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$window, OFFSET$window, value);
    }

    public void window(@Nullable IPointer pointer) {
        window(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkScreenSurfaceCreateInfoQNX allocate(Arena arena) {
        return new VkScreenSurfaceCreateInfoQNX(arena.allocate(LAYOUT));
    }

    public static VkScreenSurfaceCreateInfoQNX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkScreenSurfaceCreateInfoQNX[] ret = new VkScreenSurfaceCreateInfoQNX[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkScreenSurfaceCreateInfoQNX(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkScreenSurfaceCreateInfoQNX clone(Arena arena, VkScreenSurfaceCreateInfoQNX src) {
        VkScreenSurfaceCreateInfoQNX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkScreenSurfaceCreateInfoQNX[] clone(Arena arena, VkScreenSurfaceCreateInfoQNX[] src) {
        VkScreenSurfaceCreateInfoQNX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("context"),
        ValueLayout.ADDRESS.withName("window")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$context = PathElement.groupElement("context");
    public static final PathElement PATH$window = PathElement.groupElement("window");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$context = (AddressLayout) LAYOUT.select(PATH$context);
    public static final AddressLayout LAYOUT$window = (AddressLayout) LAYOUT.select(PATH$window);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$context = LAYOUT.byteOffset(PATH$context);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$context = LAYOUT$context.byteSize();
    public static final long SIZE$window = LAYOUT$window.byteSize();
}

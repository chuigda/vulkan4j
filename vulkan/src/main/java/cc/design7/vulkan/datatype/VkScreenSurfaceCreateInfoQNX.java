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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkScreenSurfaceCreateInfoQNX.html">VkScreenSurfaceCreateInfoQNX</a>
@ValueBasedCandidate
public record VkScreenSurfaceCreateInfoQNX(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$context = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("context");
    public static final AddressLayout LAYOUT$window = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("window");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$context, LAYOUT$window);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkScreenSurfaceCreateInfoQNX allocate(Arena arena) {
        return new VkScreenSurfaceCreateInfoQNX(arena.allocate(LAYOUT));
    }

    public static VkScreenSurfaceCreateInfoQNX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkScreenSurfaceCreateInfoQNX[] ret = new VkScreenSurfaceCreateInfoQNX[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$context = PathElement.groupElement("PATH$context");
    public static final PathElement PATH$window = PathElement.groupElement("PATH$window");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$context = LAYOUT$context.byteSize();
    public static final long SIZE$window = LAYOUT$window.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$context = LAYOUT.byteOffset(PATH$context);
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

    public @enumtype(VkScreenSurfaceCreateFlagsQNX.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkScreenSurfaceCreateFlagsQNX.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void**") MemorySegment contextRaw() {
        return segment.get(LAYOUT$context, OFFSET$context);
    }

    public void contextRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$context, OFFSET$context, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerBuffer context() {
        MemorySegment s = contextRaw();
        if (s.address() == 0) {
            return null;
        }
        return new PointerBuffer(s);
    }

    public void context(@Nullable PointerBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        contextRaw(s);
    }

    public @pointer(comment="void**") MemorySegment windowRaw() {
        return segment.get(LAYOUT$window, OFFSET$window);
    }

    public void windowRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$window, OFFSET$window, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerBuffer window() {
        MemorySegment s = windowRaw();
        if (s.address() == 0) {
            return null;
        }
        return new PointerBuffer(s);
    }

    public void window(@Nullable PointerBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        windowRaw(s);
    }

}

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
/// typedef struct VkWin32SurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkWin32SurfaceCreateFlagsKHR flags;
///     HINSTANCE hinstance;
///     HWND hwnd;
/// } VkWin32SurfaceCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkWin32SurfaceCreateInfoKHR.html">VkWin32SurfaceCreateInfoKHR</a>
public record VkWin32SurfaceCreateInfoKHR(MemorySegment segment) implements IPointer {
    public VkWin32SurfaceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR);
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

    public @enumtype(VkWin32SurfaceCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkWin32SurfaceCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment hinstance() {
        return segment.get(LAYOUT$hinstance, OFFSET$hinstance);
    }

    public void hinstance(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hinstance, OFFSET$hinstance, value);
    }

    public void hinstance(@Nullable IPointer pointer) {
        hinstance(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @pointer(comment="void*") MemorySegment hwnd() {
        return segment.get(LAYOUT$hwnd, OFFSET$hwnd);
    }

    public void hwnd(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hwnd, OFFSET$hwnd, value);
    }

    public void hwnd(@Nullable IPointer pointer) {
        hwnd(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkWin32SurfaceCreateInfoKHR allocate(Arena arena) {
        return new VkWin32SurfaceCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkWin32SurfaceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWin32SurfaceCreateInfoKHR[] ret = new VkWin32SurfaceCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkWin32SurfaceCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkWin32SurfaceCreateInfoKHR clone(Arena arena, VkWin32SurfaceCreateInfoKHR src) {
        VkWin32SurfaceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkWin32SurfaceCreateInfoKHR[] clone(Arena arena, VkWin32SurfaceCreateInfoKHR[] src) {
        VkWin32SurfaceCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("hinstance"),
        ValueLayout.ADDRESS.withName("hwnd")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$hinstance = PathElement.groupElement("hinstance");
    public static final PathElement PATH$hwnd = PathElement.groupElement("hwnd");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$hinstance = (AddressLayout) LAYOUT.select(PATH$hinstance);
    public static final AddressLayout LAYOUT$hwnd = (AddressLayout) LAYOUT.select(PATH$hwnd);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$hinstance = LAYOUT.byteOffset(PATH$hinstance);
    public static final long OFFSET$hwnd = LAYOUT.byteOffset(PATH$hwnd);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$hinstance = LAYOUT$hinstance.byteSize();
    public static final long SIZE$hwnd = LAYOUT$hwnd.byteSize();
}

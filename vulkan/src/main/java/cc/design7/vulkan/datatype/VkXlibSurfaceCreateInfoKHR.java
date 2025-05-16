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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkXlibSurfaceCreateInfoKHR.html"><code>VkXlibSurfaceCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkXlibSurfaceCreateInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkXlibSurfaceCreateFlagsKHR flags; // optional
///     Display* dpy;
///     Window window;
/// } VkXlibSurfaceCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR`
///
/// The {@link VkXlibSurfaceCreateInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkXlibSurfaceCreateInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkXlibSurfaceCreateInfoKHR.html"><code>VkXlibSurfaceCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkXlibSurfaceCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkXlibSurfaceCreateInfoKHR allocate(Arena arena) {
        VkXlibSurfaceCreateInfoKHR ret = new VkXlibSurfaceCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.XLIB_SURFACE_CREATE_INFO_KHR);
        return ret;
    }

    public static VkXlibSurfaceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkXlibSurfaceCreateInfoKHR[] ret = new VkXlibSurfaceCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkXlibSurfaceCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.XLIB_SURFACE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkXlibSurfaceCreateInfoKHR clone(Arena arena, VkXlibSurfaceCreateInfoKHR src) {
        VkXlibSurfaceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkXlibSurfaceCreateInfoKHR[] clone(Arena arena, VkXlibSurfaceCreateInfoKHR[] src) {
        VkXlibSurfaceCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.XLIB_SURFACE_CREATE_INFO_KHR);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkXlibSurfaceCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkXlibSurfaceCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void**") MemorySegment dpyRaw() {
        return segment.get(LAYOUT$dpy, OFFSET$dpy);
    }

    public void dpyRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$dpy, OFFSET$dpy, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr dpy() {
        MemorySegment s = dpyRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void dpy(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        dpyRaw(s);
    }

    public long window() {
        return NativeLayout.readCLong(segment, OFFSET$window);
    }

    public void window(long value) {
        NativeLayout.writeCLong(segment, OFFSET$window, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("dpy"),
        NativeLayout.C_LONG.withName("window")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$dpy = PathElement.groupElement("PATH$dpy");
    public static final PathElement PATH$window = PathElement.groupElement("PATH$window");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$dpy = (AddressLayout) LAYOUT.select(PATH$dpy);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$dpy = LAYOUT$dpy.byteSize();
    public static final long SIZE$window = NativeLayout.C_LONG.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dpy = LAYOUT.byteOffset(PATH$dpy);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32SurfaceCreateInfoKHR.html"><code>VkWin32SurfaceCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkWin32SurfaceCreateInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkWin32SurfaceCreateFlagsKHR flags; // optional // @link substring="VkWin32SurfaceCreateFlagsKHR" target="VkWin32SurfaceCreateFlagsKHR" @link substring="flags" target="#flags"
///     HINSTANCE hinstance; // @link substring="hinstance" target="#hinstance"
///     HWND hwnd; // @link substring="hwnd" target="#hwnd"
/// } VkWin32SurfaceCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link VkWin32SurfaceCreateInfoKHR#allocate(Arena)}, {@link VkWin32SurfaceCreateInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkWin32SurfaceCreateInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32SurfaceCreateInfoKHR.html"><code>VkWin32SurfaceCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkWin32SurfaceCreateInfoKHR(@NotNull MemorySegment segment) implements IVkWin32SurfaceCreateInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32SurfaceCreateInfoKHR.html"><code>VkWin32SurfaceCreateInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkWin32SurfaceCreateInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkWin32SurfaceCreateInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkWin32SurfaceCreateInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkWin32SurfaceCreateInfoKHR {
        public long size() {
            return segment.byteSize() / VkWin32SurfaceCreateInfoKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkWin32SurfaceCreateInfoKHR at(long index) {
            return new VkWin32SurfaceCreateInfoKHR(segment.asSlice(index * VkWin32SurfaceCreateInfoKHR.BYTES, VkWin32SurfaceCreateInfoKHR.BYTES));
        }
        public void write(long index, @NotNull VkWin32SurfaceCreateInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkWin32SurfaceCreateInfoKHR.BYTES, VkWin32SurfaceCreateInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkWin32SurfaceCreateInfoKHR allocate(Arena arena) {
        VkWin32SurfaceCreateInfoKHR ret = new VkWin32SurfaceCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.WIN32_SURFACE_CREATE_INFO_KHR);
        return ret;
    }

    public static VkWin32SurfaceCreateInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWin32SurfaceCreateInfoKHR.Ptr ret = new VkWin32SurfaceCreateInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.WIN32_SURFACE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkWin32SurfaceCreateInfoKHR clone(Arena arena, VkWin32SurfaceCreateInfoKHR src) {
        VkWin32SurfaceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.WIN32_SURFACE_CREATE_INFO_KHR);
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
        hinstance(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="void*") MemorySegment hwnd() {
        return segment.get(LAYOUT$hwnd, OFFSET$hwnd);
    }

    public void hwnd(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hwnd, OFFSET$hwnd, value);
    }

    public void hwnd(@Nullable IPointer pointer) {
        hwnd(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("hinstance"),
        ValueLayout.ADDRESS.withName("hwnd")
    );
    public static final long BYTES = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$hinstance = LAYOUT$hinstance.byteSize();
    public static final long SIZE$hwnd = LAYOUT$hwnd.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$hinstance = LAYOUT.byteOffset(PATH$hinstance);
    public static final long OFFSET$hwnd = LAYOUT.byteOffset(PATH$hwnd);
}

package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

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
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link VkWin32SurfaceCreateInfoKHR#allocate(Arena)}, {@link VkWin32SurfaceCreateInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkWin32SurfaceCreateInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
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
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkWin32SurfaceCreateInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkWin32SurfaceCreateInfoKHR, Iterable<VkWin32SurfaceCreateInfoKHR> {
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

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkWin32SurfaceCreateInfoKHR.BYTES, VkWin32SurfaceCreateInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkWin32SurfaceCreateInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkWin32SurfaceCreateInfoKHR.BYTES,
                (end - start) * VkWin32SurfaceCreateInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkWin32SurfaceCreateInfoKHR.BYTES));
        }

        public VkWin32SurfaceCreateInfoKHR[] toArray() {
            VkWin32SurfaceCreateInfoKHR[] ret = new VkWin32SurfaceCreateInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures in this pointer.
        public static final class Iter implements Iterator<VkWin32SurfaceCreateInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return (segment.byteSize() / VkWin32SurfaceCreateInfoKHR.BYTES) > 0;
            }

            @Override
            public VkWin32SurfaceCreateInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkWin32SurfaceCreateInfoKHR ret = new VkWin32SurfaceCreateInfoKHR(segment.asSlice(0, VkWin32SurfaceCreateInfoKHR.BYTES));
                segment = segment.asSlice(VkWin32SurfaceCreateInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
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
        for (long i = 0; i < count; i++) {
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

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @EnumType(VkWin32SurfaceCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@EnumType(VkWin32SurfaceCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Pointer(comment="HINSTANCE") MemorySegment hinstance() {
        return segment.get(LAYOUT$hinstance, OFFSET$hinstance);
    }

    public void hinstance(@Pointer(comment="HINSTANCE") MemorySegment value) {
        segment.set(LAYOUT$hinstance, OFFSET$hinstance, value);
    }

    public void hinstance(@Nullable IPointer pointer) {
        hinstance(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Pointer(comment="HWND") MemorySegment hwnd() {
        return segment.get(LAYOUT$hwnd, OFFSET$hwnd);
    }

    public void hwnd(@Pointer(comment="HWND") MemorySegment value) {
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

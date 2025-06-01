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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalIOSurfaceInfoEXT.html"><code>VkExportMetalIOSurfaceInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkExportMetalIOSurfaceInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkImage image; // @link substring="VkImage" target="VkImage" @link substring="image" target="#image"
///     IOSurfaceRef ioSurface; // @link substring="ioSurface" target="#ioSurface"
/// } VkExportMetalIOSurfaceInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT`
///
/// The {@code allocate} ({@link VkExportMetalIOSurfaceInfoEXT#allocate(Arena)}, {@link VkExportMetalIOSurfaceInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkExportMetalIOSurfaceInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalIOSurfaceInfoEXT.html"><code>VkExportMetalIOSurfaceInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExportMetalIOSurfaceInfoEXT(@NotNull MemorySegment segment) implements IVkExportMetalIOSurfaceInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalIOSurfaceInfoEXT.html"><code>VkExportMetalIOSurfaceInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkExportMetalIOSurfaceInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkExportMetalIOSurfaceInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkExportMetalIOSurfaceInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkExportMetalIOSurfaceInfoEXT, Iterable<VkExportMetalIOSurfaceInfoEXT> {
        public long size() {
            return segment.byteSize() / VkExportMetalIOSurfaceInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkExportMetalIOSurfaceInfoEXT at(long index) {
            return new VkExportMetalIOSurfaceInfoEXT(segment.asSlice(index * VkExportMetalIOSurfaceInfoEXT.BYTES, VkExportMetalIOSurfaceInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkExportMetalIOSurfaceInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkExportMetalIOSurfaceInfoEXT.BYTES, VkExportMetalIOSurfaceInfoEXT.BYTES);
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
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VkExportMetalIOSurfaceInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkExportMetalIOSurfaceInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkExportMetalIOSurfaceInfoEXT.BYTES,
                (end - start) * VkExportMetalIOSurfaceInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkExportMetalIOSurfaceInfoEXT.BYTES));
        }

        public VkExportMetalIOSurfaceInfoEXT[] toArray() {
            VkExportMetalIOSurfaceInfoEXT[] ret = new VkExportMetalIOSurfaceInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<VkExportMetalIOSurfaceInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkExportMetalIOSurfaceInfoEXT.BYTES;
            }

            @Override
            public VkExportMetalIOSurfaceInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkExportMetalIOSurfaceInfoEXT ret = new VkExportMetalIOSurfaceInfoEXT(segment.asSlice(0, VkExportMetalIOSurfaceInfoEXT.BYTES));
                segment = segment.asSlice(VkExportMetalIOSurfaceInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkExportMetalIOSurfaceInfoEXT allocate(Arena arena) {
        VkExportMetalIOSurfaceInfoEXT ret = new VkExportMetalIOSurfaceInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.EXPORT_METAL_IO_SURFACE_INFO_EXT);
        return ret;
    }

    public static VkExportMetalIOSurfaceInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalIOSurfaceInfoEXT.Ptr ret = new VkExportMetalIOSurfaceInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.EXPORT_METAL_IO_SURFACE_INFO_EXT);
        }
        return ret;
    }

    public static VkExportMetalIOSurfaceInfoEXT clone(Arena arena, VkExportMetalIOSurfaceInfoEXT src) {
        VkExportMetalIOSurfaceInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.EXPORT_METAL_IO_SURFACE_INFO_EXT);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkExportMetalIOSurfaceInfoEXT sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkExportMetalIOSurfaceInfoEXT pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable VkImage image() {
        MemorySegment s = segment.asSlice(OFFSET$image, SIZE$image);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImage(s);
    }

    public VkExportMetalIOSurfaceInfoEXT image(@Nullable VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="IOSurfaceRef") MemorySegment ioSurface() {
        return segment.get(LAYOUT$ioSurface, OFFSET$ioSurface);
    }

    public void ioSurface(@Pointer(comment="IOSurfaceRef") MemorySegment value) {
        segment.set(LAYOUT$ioSurface, OFFSET$ioSurface, value);
    }

    public VkExportMetalIOSurfaceInfoEXT ioSurface(@Nullable IPointer pointer) {
        ioSurface(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.ADDRESS.withName("ioSurface")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$ioSurface = PathElement.groupElement("ioSurface");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final AddressLayout LAYOUT$ioSurface = (AddressLayout) LAYOUT.select(PATH$ioSurface);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$ioSurface = LAYOUT$ioSurface.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$ioSurface = LAYOUT.byteOffset(PATH$ioSurface);
}

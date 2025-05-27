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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.html"><code>VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkExtent2D fragmentDensityOffsetGranularity; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="fragmentDensityOffsetGranularity" target="#fragmentDensityOffsetGranularity"
/// } VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT#allocate(Arena)}, {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.html"><code>VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(@NotNull MemorySegment segment) implements IVkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.html"><code>VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT, Iterable<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT at(long index) {
            return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(segment.asSlice(index * VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES, VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES, VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES, VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES,
                (end - start) * VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES));
        }

        public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT[] toArray() {
            VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT[] ret = new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT[(int) size()];
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
        public static final class Iter implements Iterator<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return (segment.byteSize() / VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES) > 0;
            }

            @Override
            public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT ret = new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(segment.asSlice(0, VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES));
                segment = segment.asSlice(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT ret = new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.Ptr ret = new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT clone(Arena arena, VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT src) {
        VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT);
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

    public @NotNull VkExtent2D fragmentDensityOffsetGranularity() {
        return new VkExtent2D(segment.asSlice(OFFSET$fragmentDensityOffsetGranularity, LAYOUT$fragmentDensityOffsetGranularity));
    }

    public void fragmentDensityOffsetGranularity(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentDensityOffsetGranularity, SIZE$fragmentDensityOffsetGranularity);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("fragmentDensityOffsetGranularity")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentDensityOffsetGranularity = PathElement.groupElement("fragmentDensityOffsetGranularity");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$fragmentDensityOffsetGranularity = (StructLayout) LAYOUT.select(PATH$fragmentDensityOffsetGranularity);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentDensityOffsetGranularity = LAYOUT$fragmentDensityOffsetGranularity.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityOffsetGranularity = LAYOUT.byteOffset(PATH$fragmentDensityOffsetGranularity);
}

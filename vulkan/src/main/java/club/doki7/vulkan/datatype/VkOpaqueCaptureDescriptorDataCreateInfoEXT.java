package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpaqueCaptureDescriptorDataCreateInfoEXT.html"><code>VkOpaqueCaptureDescriptorDataCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkOpaqueCaptureDescriptorDataCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     void const* opaqueCaptureDescriptorData; // @link substring="opaqueCaptureDescriptorData" target="#opaqueCaptureDescriptorData"
/// } VkOpaqueCaptureDescriptorDataCreateInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#allocate(Arena)}, {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpaqueCaptureDescriptorDataCreateInfoEXT.html"><code>VkOpaqueCaptureDescriptorDataCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkOpaqueCaptureDescriptorDataCreateInfoEXT(@NotNull MemorySegment segment) implements IVkOpaqueCaptureDescriptorDataCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpaqueCaptureDescriptorDataCreateInfoEXT.html"><code>VkOpaqueCaptureDescriptorDataCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkOpaqueCaptureDescriptorDataCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkOpaqueCaptureDescriptorDataCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkOpaqueCaptureDescriptorDataCreateInfoEXT {
        public long size() {
            return segment.byteSize() / VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkOpaqueCaptureDescriptorDataCreateInfoEXT at(long index) {
            return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(segment.asSlice(index * VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES, VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES, VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES, VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES,
                (end - start) * VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkOpaqueCaptureDescriptorDataCreateInfoEXT.BYTES));
        }

        public VkOpaqueCaptureDescriptorDataCreateInfoEXT[] toArray() {
            VkOpaqueCaptureDescriptorDataCreateInfoEXT[] ret = new VkOpaqueCaptureDescriptorDataCreateInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT allocate(Arena arena) {
        VkOpaqueCaptureDescriptorDataCreateInfoEXT ret = new VkOpaqueCaptureDescriptorDataCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT);
        return ret;
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkOpaqueCaptureDescriptorDataCreateInfoEXT.Ptr ret = new VkOpaqueCaptureDescriptorDataCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT clone(Arena arena, VkOpaqueCaptureDescriptorDataCreateInfoEXT src) {
        VkOpaqueCaptureDescriptorDataCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT);
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

    public @Pointer(comment="void*") MemorySegment opaqueCaptureDescriptorData() {
        return segment.get(LAYOUT$opaqueCaptureDescriptorData, OFFSET$opaqueCaptureDescriptorData);
    }

    public void opaqueCaptureDescriptorData(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$opaqueCaptureDescriptorData, OFFSET$opaqueCaptureDescriptorData, value);
    }

    public void opaqueCaptureDescriptorData(@Nullable IPointer pointer) {
        opaqueCaptureDescriptorData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("opaqueCaptureDescriptorData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$opaqueCaptureDescriptorData = PathElement.groupElement("opaqueCaptureDescriptorData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$opaqueCaptureDescriptorData = (AddressLayout) LAYOUT.select(PATH$opaqueCaptureDescriptorData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$opaqueCaptureDescriptorData = LAYOUT$opaqueCaptureDescriptorData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$opaqueCaptureDescriptorData = LAYOUT.byteOffset(PATH$opaqueCaptureDescriptorData);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageResolve2.html"><code>VkImageResolve2</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageResolve2 {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkImageSubresourceLayers srcSubresource; // @link substring="VkImageSubresourceLayers" target="VkImageSubresourceLayers" @link substring="srcSubresource" target="#srcSubresource"
///     VkOffset3D srcOffset; // @link substring="VkOffset3D" target="VkOffset3D" @link substring="srcOffset" target="#srcOffset"
///     VkImageSubresourceLayers dstSubresource; // @link substring="VkImageSubresourceLayers" target="VkImageSubresourceLayers" @link substring="dstSubresource" target="#dstSubresource"
///     VkOffset3D dstOffset; // @link substring="VkOffset3D" target="VkOffset3D" @link substring="dstOffset" target="#dstOffset"
///     VkExtent3D extent; // @link substring="VkExtent3D" target="VkExtent3D" @link substring="extent" target="#extent"
/// } VkImageResolve2;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2`
///
/// The {@code allocate} ({@link VkImageResolve2#allocate(Arena)}, {@link VkImageResolve2#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImageResolve2#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageResolve2.html"><code>VkImageResolve2</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageResolve2(@NotNull MemorySegment segment) implements IVkImageResolve2 {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageResolve2.html"><code>VkImageResolve2</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkImageResolve2}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkImageResolve2 to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkImageResolve2.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkImageResolve2 {
        public long size() {
            return segment.byteSize() / VkImageResolve2.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkImageResolve2 at(long index) {
            return new VkImageResolve2(segment.asSlice(index * VkImageResolve2.BYTES, VkImageResolve2.BYTES));
        }

        public void write(long index, @NotNull VkImageResolve2 value) {
            MemorySegment s = segment.asSlice(index * VkImageResolve2.BYTES, VkImageResolve2.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkImageResolve2.BYTES, VkImageResolve2.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkImageResolve2.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkImageResolve2.BYTES,
                (end - start) * VkImageResolve2.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkImageResolve2.BYTES));
        }

        public VkImageResolve2[] toArray() {
            VkImageResolve2[] ret = new VkImageResolve2[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkImageResolve2 allocate(Arena arena) {
        VkImageResolve2 ret = new VkImageResolve2(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_RESOLVE_2);
        return ret;
    }

    public static VkImageResolve2.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageResolve2.Ptr ret = new VkImageResolve2.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.IMAGE_RESOLVE_2);
        }
        return ret;
    }

    public static VkImageResolve2 clone(Arena arena, VkImageResolve2 src) {
        VkImageResolve2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_RESOLVE_2);
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

    public @NotNull VkImageSubresourceLayers srcSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));
    }

    public void srcSubresource(@NotNull VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcSubresource, SIZE$srcSubresource);
    }

    public @NotNull VkOffset3D srcOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$srcOffset, LAYOUT$srcOffset));
    }

    public void srcOffset(@NotNull VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcOffset, SIZE$srcOffset);
    }

    public @NotNull VkImageSubresourceLayers dstSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));
    }

    public void dstSubresource(@NotNull VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstSubresource, SIZE$dstSubresource);
    }

    public @NotNull VkOffset3D dstOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$dstOffset, LAYOUT$dstOffset));
    }

    public void dstOffset(@NotNull VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstOffset, SIZE$dstOffset);
    }

    public @NotNull VkExtent3D extent() {
        return new VkExtent3D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(@NotNull VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        VkOffset3D.LAYOUT.withName("srcOffset"),
        VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        VkOffset3D.LAYOUT.withName("dstOffset"),
        VkExtent3D.LAYOUT.withName("extent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$srcSubresource = PathElement.groupElement("srcSubresource");
    public static final PathElement PATH$srcOffset = PathElement.groupElement("srcOffset");
    public static final PathElement PATH$dstSubresource = PathElement.groupElement("dstSubresource");
    public static final PathElement PATH$dstOffset = PathElement.groupElement("dstOffset");
    public static final PathElement PATH$extent = PathElement.groupElement("extent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$srcSubresource = (StructLayout) LAYOUT.select(PATH$srcSubresource);
    public static final StructLayout LAYOUT$srcOffset = (StructLayout) LAYOUT.select(PATH$srcOffset);
    public static final StructLayout LAYOUT$dstSubresource = (StructLayout) LAYOUT.select(PATH$dstSubresource);
    public static final StructLayout LAYOUT$dstOffset = (StructLayout) LAYOUT.select(PATH$dstOffset);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcSubresource = LAYOUT$srcSubresource.byteSize();
    public static final long SIZE$srcOffset = LAYOUT$srcOffset.byteSize();
    public static final long SIZE$dstSubresource = LAYOUT$dstSubresource.byteSize();
    public static final long SIZE$dstOffset = LAYOUT$dstOffset.byteSize();
    public static final long SIZE$extent = LAYOUT$extent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSubresource = LAYOUT.byteOffset(PATH$srcSubresource);
    public static final long OFFSET$srcOffset = LAYOUT.byteOffset(PATH$srcOffset);
    public static final long OFFSET$dstSubresource = LAYOUT.byteOffset(PATH$dstSubresource);
    public static final long OFFSET$dstOffset = LAYOUT.byteOffset(PATH$dstOffset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);
}

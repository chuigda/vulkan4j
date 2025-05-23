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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderTileImageFeaturesEXT.html"><code>VkPhysicalDeviceShaderTileImageFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderTileImageFeaturesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 shaderTileImageColorReadAccess; // @link substring="shaderTileImageColorReadAccess" target="#shaderTileImageColorReadAccess"
///     VkBool32 shaderTileImageDepthReadAccess; // @link substring="shaderTileImageDepthReadAccess" target="#shaderTileImageDepthReadAccess"
///     VkBool32 shaderTileImageStencilReadAccess; // @link substring="shaderTileImageStencilReadAccess" target="#shaderTileImageStencilReadAccess"
/// } VkPhysicalDeviceShaderTileImageFeaturesEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceShaderTileImageFeaturesEXT#allocate(Arena)}, {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderTileImageFeaturesEXT.html"><code>VkPhysicalDeviceShaderTileImageFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderTileImageFeaturesEXT(@NotNull MemorySegment segment) implements IVkPhysicalDeviceShaderTileImageFeaturesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderTileImageFeaturesEXT.html"><code>VkPhysicalDeviceShaderTileImageFeaturesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceShaderTileImageFeaturesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceShaderTileImageFeaturesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceShaderTileImageFeaturesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceShaderTileImageFeaturesEXT {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceShaderTileImageFeaturesEXT at(long index) {
            return new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment.asSlice(index * VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES, VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDeviceShaderTileImageFeaturesEXT value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES, VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES, VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES,
                (end - start) * VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDeviceShaderTileImageFeaturesEXT.BYTES));
        }

        public VkPhysicalDeviceShaderTileImageFeaturesEXT[] toArray() {
            VkPhysicalDeviceShaderTileImageFeaturesEXT[] ret = new VkPhysicalDeviceShaderTileImageFeaturesEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceShaderTileImageFeaturesEXT ret = new VkPhysicalDeviceShaderTileImageFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderTileImageFeaturesEXT.Ptr ret = new VkPhysicalDeviceShaderTileImageFeaturesEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT clone(Arena arena, VkPhysicalDeviceShaderTileImageFeaturesEXT src) {
        VkPhysicalDeviceShaderTileImageFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT);
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

    public @unsigned int shaderTileImageColorReadAccess() {
        return segment.get(LAYOUT$shaderTileImageColorReadAccess, OFFSET$shaderTileImageColorReadAccess);
    }

    public void shaderTileImageColorReadAccess(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageColorReadAccess, OFFSET$shaderTileImageColorReadAccess, value);
    }

    public @unsigned int shaderTileImageDepthReadAccess() {
        return segment.get(LAYOUT$shaderTileImageDepthReadAccess, OFFSET$shaderTileImageDepthReadAccess);
    }

    public void shaderTileImageDepthReadAccess(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageDepthReadAccess, OFFSET$shaderTileImageDepthReadAccess, value);
    }

    public @unsigned int shaderTileImageStencilReadAccess() {
        return segment.get(LAYOUT$shaderTileImageStencilReadAccess, OFFSET$shaderTileImageStencilReadAccess);
    }

    public void shaderTileImageStencilReadAccess(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageStencilReadAccess, OFFSET$shaderTileImageStencilReadAccess, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageColorReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageDepthReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageStencilReadAccess")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderTileImageColorReadAccess = PathElement.groupElement("shaderTileImageColorReadAccess");
    public static final PathElement PATH$shaderTileImageDepthReadAccess = PathElement.groupElement("shaderTileImageDepthReadAccess");
    public static final PathElement PATH$shaderTileImageStencilReadAccess = PathElement.groupElement("shaderTileImageStencilReadAccess");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderTileImageColorReadAccess = (OfInt) LAYOUT.select(PATH$shaderTileImageColorReadAccess);
    public static final OfInt LAYOUT$shaderTileImageDepthReadAccess = (OfInt) LAYOUT.select(PATH$shaderTileImageDepthReadAccess);
    public static final OfInt LAYOUT$shaderTileImageStencilReadAccess = (OfInt) LAYOUT.select(PATH$shaderTileImageStencilReadAccess);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderTileImageColorReadAccess = LAYOUT$shaderTileImageColorReadAccess.byteSize();
    public static final long SIZE$shaderTileImageDepthReadAccess = LAYOUT$shaderTileImageDepthReadAccess.byteSize();
    public static final long SIZE$shaderTileImageStencilReadAccess = LAYOUT$shaderTileImageStencilReadAccess.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderTileImageColorReadAccess = LAYOUT.byteOffset(PATH$shaderTileImageColorReadAccess);
    public static final long OFFSET$shaderTileImageDepthReadAccess = LAYOUT.byteOffset(PATH$shaderTileImageDepthReadAccess);
    public static final long OFFSET$shaderTileImageStencilReadAccess = LAYOUT.byteOffset(PATH$shaderTileImageStencilReadAccess);
}

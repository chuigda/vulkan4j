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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderTileImagePropertiesEXT.html"><code>VkPhysicalDeviceShaderTileImagePropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderTileImagePropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 shaderTileImageCoherentReadAccelerated; // @link substring="shaderTileImageCoherentReadAccelerated" target="#shaderTileImageCoherentReadAccelerated"
///     VkBool32 shaderTileImageReadSampleFromPixelRateInvocation; // @link substring="shaderTileImageReadSampleFromPixelRateInvocation" target="#shaderTileImageReadSampleFromPixelRateInvocation"
///     VkBool32 shaderTileImageReadFromHelperInvocation; // @link substring="shaderTileImageReadFromHelperInvocation" target="#shaderTileImageReadFromHelperInvocation"
/// } VkPhysicalDeviceShaderTileImagePropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceShaderTileImagePropertiesEXT#allocate(Arena)}, {@link VkPhysicalDeviceShaderTileImagePropertiesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceShaderTileImagePropertiesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderTileImagePropertiesEXT.html"><code>VkPhysicalDeviceShaderTileImagePropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderTileImagePropertiesEXT(@NotNull MemorySegment segment) implements IVkPhysicalDeviceShaderTileImagePropertiesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderTileImagePropertiesEXT.html"><code>VkPhysicalDeviceShaderTileImagePropertiesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceShaderTileImagePropertiesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceShaderTileImagePropertiesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceShaderTileImagePropertiesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceShaderTileImagePropertiesEXT {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceShaderTileImagePropertiesEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceShaderTileImagePropertiesEXT at(long index) {
            return new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment.asSlice(index * VkPhysicalDeviceShaderTileImagePropertiesEXT.BYTES, VkPhysicalDeviceShaderTileImagePropertiesEXT.BYTES));
        }
        public void write(long index, @NotNull VkPhysicalDeviceShaderTileImagePropertiesEXT value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceShaderTileImagePropertiesEXT.BYTES, VkPhysicalDeviceShaderTileImagePropertiesEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceShaderTileImagePropertiesEXT ret = new VkPhysicalDeviceShaderTileImagePropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderTileImagePropertiesEXT.Ptr ret = new VkPhysicalDeviceShaderTileImagePropertiesEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT clone(Arena arena, VkPhysicalDeviceShaderTileImagePropertiesEXT src) {
        VkPhysicalDeviceShaderTileImagePropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT);
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

    public @unsigned int shaderTileImageCoherentReadAccelerated() {
        return segment.get(LAYOUT$shaderTileImageCoherentReadAccelerated, OFFSET$shaderTileImageCoherentReadAccelerated);
    }

    public void shaderTileImageCoherentReadAccelerated(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageCoherentReadAccelerated, OFFSET$shaderTileImageCoherentReadAccelerated, value);
    }

    public @unsigned int shaderTileImageReadSampleFromPixelRateInvocation() {
        return segment.get(LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation, OFFSET$shaderTileImageReadSampleFromPixelRateInvocation);
    }

    public void shaderTileImageReadSampleFromPixelRateInvocation(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation, OFFSET$shaderTileImageReadSampleFromPixelRateInvocation, value);
    }

    public @unsigned int shaderTileImageReadFromHelperInvocation() {
        return segment.get(LAYOUT$shaderTileImageReadFromHelperInvocation, OFFSET$shaderTileImageReadFromHelperInvocation);
    }

    public void shaderTileImageReadFromHelperInvocation(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageReadFromHelperInvocation, OFFSET$shaderTileImageReadFromHelperInvocation, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageCoherentReadAccelerated"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadSampleFromPixelRateInvocation"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadFromHelperInvocation")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderTileImageCoherentReadAccelerated = PathElement.groupElement("shaderTileImageCoherentReadAccelerated");
    public static final PathElement PATH$shaderTileImageReadSampleFromPixelRateInvocation = PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation");
    public static final PathElement PATH$shaderTileImageReadFromHelperInvocation = PathElement.groupElement("shaderTileImageReadFromHelperInvocation");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderTileImageCoherentReadAccelerated = (OfInt) LAYOUT.select(PATH$shaderTileImageCoherentReadAccelerated);
    public static final OfInt LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation = (OfInt) LAYOUT.select(PATH$shaderTileImageReadSampleFromPixelRateInvocation);
    public static final OfInt LAYOUT$shaderTileImageReadFromHelperInvocation = (OfInt) LAYOUT.select(PATH$shaderTileImageReadFromHelperInvocation);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderTileImageCoherentReadAccelerated = LAYOUT$shaderTileImageCoherentReadAccelerated.byteSize();
    public static final long SIZE$shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation.byteSize();
    public static final long SIZE$shaderTileImageReadFromHelperInvocation = LAYOUT$shaderTileImageReadFromHelperInvocation.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderTileImageCoherentReadAccelerated = LAYOUT.byteOffset(PATH$shaderTileImageCoherentReadAccelerated);
    public static final long OFFSET$shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.byteOffset(PATH$shaderTileImageReadSampleFromPixelRateInvocation);
    public static final long OFFSET$shaderTileImageReadFromHelperInvocation = LAYOUT.byteOffset(PATH$shaderTileImageReadFromHelperInvocation);
}

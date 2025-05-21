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
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceShaderTileImageFeaturesEXT#allocate(Arena)}, {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderTileImageFeaturesEXT.html"><code>VkPhysicalDeviceShaderTileImageFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderTileImageFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceShaderTileImageFeaturesEXT ret = new VkPhysicalDeviceShaderTileImageFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderTileImageFeaturesEXT[] ret = new VkPhysicalDeviceShaderTileImageFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT clone(Arena arena, VkPhysicalDeviceShaderTileImageFeaturesEXT src) {
        VkPhysicalDeviceShaderTileImageFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceShaderTileImageFeaturesEXT[] src) {
        VkPhysicalDeviceShaderTileImageFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
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

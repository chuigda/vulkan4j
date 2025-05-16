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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.html"><code>VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 imageSlicedViewOf3D;
/// } VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT`
///
/// The {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.html"><code>VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ret = new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] ret = new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT clone(Arena arena, VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT src) {
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] src) {
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT);
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

    public @unsigned int imageSlicedViewOf3D() {
        return segment.get(LAYOUT$imageSlicedViewOf3D, OFFSET$imageSlicedViewOf3D);
    }

    public void imageSlicedViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$imageSlicedViewOf3D, OFFSET$imageSlicedViewOf3D, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageSlicedViewOf3D")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$imageSlicedViewOf3D = PathElement.groupElement("PATH$imageSlicedViewOf3D");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$imageSlicedViewOf3D = (OfInt) LAYOUT.select(PATH$imageSlicedViewOf3D);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageSlicedViewOf3D = LAYOUT$imageSlicedViewOf3D.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageSlicedViewOf3D = LAYOUT.byteOffset(PATH$imageSlicedViewOf3D);
}

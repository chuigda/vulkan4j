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
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.html"><code>VkPhysicalDeviceImage2DViewOf3DFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceImage2DViewOf3DFeaturesEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 image2DViewOf3D;
///     VkBool32 sampler2DViewOf3D;
/// } VkPhysicalDeviceImage2DViewOf3DFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT`
///
/// The {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.html"><code>VkPhysicalDeviceImage2DViewOf3DFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceImage2DViewOf3DFeaturesEXT ret = new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] ret = new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT clone(Arena arena, VkPhysicalDeviceImage2DViewOf3DFeaturesEXT src) {
        VkPhysicalDeviceImage2DViewOf3DFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] src) {
        VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int image2DViewOf3D() {
        return segment.get(LAYOUT$image2DViewOf3D, OFFSET$image2DViewOf3D);
    }

    public void image2DViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$image2DViewOf3D, OFFSET$image2DViewOf3D, value);
    }

    public @unsigned int sampler2DViewOf3D() {
        return segment.get(LAYOUT$sampler2DViewOf3D, OFFSET$sampler2DViewOf3D);
    }

    public void sampler2DViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$sampler2DViewOf3D, OFFSET$sampler2DViewOf3D, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("image2DViewOf3D"),
        ValueLayout.JAVA_INT.withName("sampler2DViewOf3D")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$image2DViewOf3D = PathElement.groupElement("PATH$image2DViewOf3D");
    public static final PathElement PATH$sampler2DViewOf3D = PathElement.groupElement("PATH$sampler2DViewOf3D");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$image2DViewOf3D = (OfInt) LAYOUT.select(PATH$image2DViewOf3D);
    public static final OfInt LAYOUT$sampler2DViewOf3D = (OfInt) LAYOUT.select(PATH$sampler2DViewOf3D);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image2DViewOf3D = LAYOUT$image2DViewOf3D.byteSize();
    public static final long SIZE$sampler2DViewOf3D = LAYOUT$sampler2DViewOf3D.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image2DViewOf3D = LAYOUT.byteOffset(PATH$image2DViewOf3D);
    public static final long OFFSET$sampler2DViewOf3D = LAYOUT.byteOffset(PATH$sampler2DViewOf3D);
}

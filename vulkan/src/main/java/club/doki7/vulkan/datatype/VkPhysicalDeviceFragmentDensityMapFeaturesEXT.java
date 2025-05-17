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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentDensityMapFeaturesEXT.html"><code>VkPhysicalDeviceFragmentDensityMapFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceFragmentDensityMapFeaturesEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 fragmentDensityMap;
///     VkBool32 fragmentDensityMapDynamic;
///     VkBool32 fragmentDensityMapNonSubsampledImages;
/// } VkPhysicalDeviceFragmentDensityMapFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT`
///
/// The {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentDensityMapFeaturesEXT.html"><code>VkPhysicalDeviceFragmentDensityMapFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceFragmentDensityMapFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceFragmentDensityMapFeaturesEXT ret = new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] ret = new VkPhysicalDeviceFragmentDensityMapFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT clone(Arena arena, VkPhysicalDeviceFragmentDensityMapFeaturesEXT src) {
        VkPhysicalDeviceFragmentDensityMapFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] src) {
        VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT);
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

    public @unsigned int fragmentDensityMap() {
        return segment.get(LAYOUT$fragmentDensityMap, OFFSET$fragmentDensityMap);
    }

    public void fragmentDensityMap(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMap, OFFSET$fragmentDensityMap, value);
    }

    public @unsigned int fragmentDensityMapDynamic() {
        return segment.get(LAYOUT$fragmentDensityMapDynamic, OFFSET$fragmentDensityMapDynamic);
    }

    public void fragmentDensityMapDynamic(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMapDynamic, OFFSET$fragmentDensityMapDynamic, value);
    }

    public @unsigned int fragmentDensityMapNonSubsampledImages() {
        return segment.get(LAYOUT$fragmentDensityMapNonSubsampledImages, OFFSET$fragmentDensityMapNonSubsampledImages);
    }

    public void fragmentDensityMapNonSubsampledImages(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMapNonSubsampledImages, OFFSET$fragmentDensityMapNonSubsampledImages, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMap"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapDynamic"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapNonSubsampledImages")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fragmentDensityMap = PathElement.groupElement("PATH$fragmentDensityMap");
    public static final PathElement PATH$fragmentDensityMapDynamic = PathElement.groupElement("PATH$fragmentDensityMapDynamic");
    public static final PathElement PATH$fragmentDensityMapNonSubsampledImages = PathElement.groupElement("PATH$fragmentDensityMapNonSubsampledImages");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentDensityMap = (OfInt) LAYOUT.select(PATH$fragmentDensityMap);
    public static final OfInt LAYOUT$fragmentDensityMapDynamic = (OfInt) LAYOUT.select(PATH$fragmentDensityMapDynamic);
    public static final OfInt LAYOUT$fragmentDensityMapNonSubsampledImages = (OfInt) LAYOUT.select(PATH$fragmentDensityMapNonSubsampledImages);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentDensityMap = LAYOUT$fragmentDensityMap.byteSize();
    public static final long SIZE$fragmentDensityMapDynamic = LAYOUT$fragmentDensityMapDynamic.byteSize();
    public static final long SIZE$fragmentDensityMapNonSubsampledImages = LAYOUT$fragmentDensityMapNonSubsampledImages.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityMap = LAYOUT.byteOffset(PATH$fragmentDensityMap);
    public static final long OFFSET$fragmentDensityMapDynamic = LAYOUT.byteOffset(PATH$fragmentDensityMapDynamic);
    public static final long OFFSET$fragmentDensityMapNonSubsampledImages = LAYOUT.byteOffset(PATH$fragmentDensityMapNonSubsampledImages);
}

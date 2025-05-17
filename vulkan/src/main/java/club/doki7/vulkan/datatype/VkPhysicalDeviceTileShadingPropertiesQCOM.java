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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceTileShadingPropertiesQCOM.html"><code>VkPhysicalDeviceTileShadingPropertiesQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceTileShadingPropertiesQCOM {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t maxApronSize;
///     VkBool32 preferNonCoherent;
///     VkExtent2D tileGranularity;
///     VkExtent2D maxTileShadingRate;
/// } VkPhysicalDeviceTileShadingPropertiesQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM`
///
/// The {@link VkPhysicalDeviceTileShadingPropertiesQCOM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceTileShadingPropertiesQCOM#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceTileShadingPropertiesQCOM.html"><code>VkPhysicalDeviceTileShadingPropertiesQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceTileShadingPropertiesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocate(Arena arena) {
        VkPhysicalDeviceTileShadingPropertiesQCOM ret = new VkPhysicalDeviceTileShadingPropertiesQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM);
        return ret;
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTileShadingPropertiesQCOM[] ret = new VkPhysicalDeviceTileShadingPropertiesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceTileShadingPropertiesQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM);
        }
        return ret;
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM clone(Arena arena, VkPhysicalDeviceTileShadingPropertiesQCOM src) {
        VkPhysicalDeviceTileShadingPropertiesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM[] clone(Arena arena, VkPhysicalDeviceTileShadingPropertiesQCOM[] src) {
        VkPhysicalDeviceTileShadingPropertiesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM);
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

    public @unsigned int maxApronSize() {
        return segment.get(LAYOUT$maxApronSize, OFFSET$maxApronSize);
    }

    public void maxApronSize(@unsigned int value) {
        segment.set(LAYOUT$maxApronSize, OFFSET$maxApronSize, value);
    }

    public @unsigned int preferNonCoherent() {
        return segment.get(LAYOUT$preferNonCoherent, OFFSET$preferNonCoherent);
    }

    public void preferNonCoherent(@unsigned int value) {
        segment.set(LAYOUT$preferNonCoherent, OFFSET$preferNonCoherent, value);
    }

    public VkExtent2D tileGranularity() {
        return new VkExtent2D(segment.asSlice(OFFSET$tileGranularity, LAYOUT$tileGranularity));
    }

    public void tileGranularity(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$tileGranularity, SIZE$tileGranularity);
    }

    public VkExtent2D maxTileShadingRate() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxTileShadingRate, LAYOUT$maxTileShadingRate));
    }

    public void maxTileShadingRate(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTileShadingRate, SIZE$maxTileShadingRate);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxApronSize"),
        ValueLayout.JAVA_INT.withName("preferNonCoherent"),
        VkExtent2D.LAYOUT.withName("tileGranularity"),
        VkExtent2D.LAYOUT.withName("maxTileShadingRate")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxApronSize = PathElement.groupElement("PATH$maxApronSize");
    public static final PathElement PATH$preferNonCoherent = PathElement.groupElement("PATH$preferNonCoherent");
    public static final PathElement PATH$tileGranularity = PathElement.groupElement("PATH$tileGranularity");
    public static final PathElement PATH$maxTileShadingRate = PathElement.groupElement("PATH$maxTileShadingRate");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxApronSize = (OfInt) LAYOUT.select(PATH$maxApronSize);
    public static final OfInt LAYOUT$preferNonCoherent = (OfInt) LAYOUT.select(PATH$preferNonCoherent);
    public static final StructLayout LAYOUT$tileGranularity = (StructLayout) LAYOUT.select(PATH$tileGranularity);
    public static final StructLayout LAYOUT$maxTileShadingRate = (StructLayout) LAYOUT.select(PATH$maxTileShadingRate);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxApronSize = LAYOUT$maxApronSize.byteSize();
    public static final long SIZE$preferNonCoherent = LAYOUT$preferNonCoherent.byteSize();
    public static final long SIZE$tileGranularity = LAYOUT$tileGranularity.byteSize();
    public static final long SIZE$maxTileShadingRate = LAYOUT$maxTileShadingRate.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxApronSize = LAYOUT.byteOffset(PATH$maxApronSize);
    public static final long OFFSET$preferNonCoherent = LAYOUT.byteOffset(PATH$preferNonCoherent);
    public static final long OFFSET$tileGranularity = LAYOUT.byteOffset(PATH$tileGranularity);
    public static final long OFFSET$maxTileShadingRate = LAYOUT.byteOffset(PATH$maxTileShadingRate);
}

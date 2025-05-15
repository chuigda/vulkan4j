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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShadingRateImagePropertiesNV.html"><code>VkPhysicalDeviceShadingRateImagePropertiesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShadingRateImagePropertiesNV {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkExtent2D shadingRateTexelSize;
///     uint32_t shadingRatePaletteSize;
///     uint32_t shadingRateMaxCoarseSamples;
/// } VkPhysicalDeviceShadingRateImagePropertiesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV`
///
/// The {@link VkPhysicalDeviceShadingRateImagePropertiesNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceShadingRateImagePropertiesNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShadingRateImagePropertiesNV.html"><code>VkPhysicalDeviceShadingRateImagePropertiesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShadingRateImagePropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceShadingRateImagePropertiesNV allocate(Arena arena) {
        VkPhysicalDeviceShadingRateImagePropertiesNV ret = new VkPhysicalDeviceShadingRateImagePropertiesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
        return ret;
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShadingRateImagePropertiesNV[] ret = new VkPhysicalDeviceShadingRateImagePropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShadingRateImagePropertiesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
        }
        return ret;
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV clone(Arena arena, VkPhysicalDeviceShadingRateImagePropertiesNV src) {
        VkPhysicalDeviceShadingRateImagePropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV[] clone(Arena arena, VkPhysicalDeviceShadingRateImagePropertiesNV[] src) {
        VkPhysicalDeviceShadingRateImagePropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
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

    public VkExtent2D shadingRateTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$shadingRateTexelSize, LAYOUT$shadingRateTexelSize));
    }

    public void shadingRateTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shadingRateTexelSize, SIZE$shadingRateTexelSize);
    }

    public @unsigned int shadingRatePaletteSize() {
        return segment.get(LAYOUT$shadingRatePaletteSize, OFFSET$shadingRatePaletteSize);
    }

    public void shadingRatePaletteSize(@unsigned int value) {
        segment.set(LAYOUT$shadingRatePaletteSize, OFFSET$shadingRatePaletteSize, value);
    }

    public @unsigned int shadingRateMaxCoarseSamples() {
        return segment.get(LAYOUT$shadingRateMaxCoarseSamples, OFFSET$shadingRateMaxCoarseSamples);
    }

    public void shadingRateMaxCoarseSamples(@unsigned int value) {
        segment.set(LAYOUT$shadingRateMaxCoarseSamples, OFFSET$shadingRateMaxCoarseSamples, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("shadingRateTexelSize"),
        ValueLayout.JAVA_INT.withName("shadingRatePaletteSize"),
        ValueLayout.JAVA_INT.withName("shadingRateMaxCoarseSamples")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shadingRateTexelSize = PathElement.groupElement("PATH$shadingRateTexelSize");
    public static final PathElement PATH$shadingRatePaletteSize = PathElement.groupElement("PATH$shadingRatePaletteSize");
    public static final PathElement PATH$shadingRateMaxCoarseSamples = PathElement.groupElement("PATH$shadingRateMaxCoarseSamples");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$shadingRateTexelSize = (StructLayout) LAYOUT.select(PATH$shadingRateTexelSize);
    public static final OfInt LAYOUT$shadingRatePaletteSize = (OfInt) LAYOUT.select(PATH$shadingRatePaletteSize);
    public static final OfInt LAYOUT$shadingRateMaxCoarseSamples = (OfInt) LAYOUT.select(PATH$shadingRateMaxCoarseSamples);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shadingRateTexelSize = LAYOUT$shadingRateTexelSize.byteSize();
    public static final long SIZE$shadingRatePaletteSize = LAYOUT$shadingRatePaletteSize.byteSize();
    public static final long SIZE$shadingRateMaxCoarseSamples = LAYOUT$shadingRateMaxCoarseSamples.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateTexelSize = LAYOUT.byteOffset(PATH$shadingRateTexelSize);
    public static final long OFFSET$shadingRatePaletteSize = LAYOUT.byteOffset(PATH$shadingRatePaletteSize);
    public static final long OFFSET$shadingRateMaxCoarseSamples = LAYOUT.byteOffset(PATH$shadingRateMaxCoarseSamples);
}

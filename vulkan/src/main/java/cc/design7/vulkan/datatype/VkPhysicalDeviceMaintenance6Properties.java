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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMaintenance6Properties.html"><code>VkPhysicalDeviceMaintenance6Properties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMaintenance6Properties {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 blockTexelViewCompatibleMultipleLayers;
///     uint32_t maxCombinedImageSamplerDescriptorCount;
///     VkBool32 fragmentShadingRateClampCombinerInputs;
/// } VkPhysicalDeviceMaintenance6Properties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES`
///
/// The {@link VkPhysicalDeviceMaintenance6Properties#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceMaintenance6Properties#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMaintenance6Properties.html"><code>VkPhysicalDeviceMaintenance6Properties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMaintenance6Properties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceMaintenance6Properties allocate(Arena arena) {
        VkPhysicalDeviceMaintenance6Properties ret = new VkPhysicalDeviceMaintenance6Properties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDeviceMaintenance6Properties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMaintenance6Properties[] ret = new VkPhysicalDeviceMaintenance6Properties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMaintenance6Properties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDeviceMaintenance6Properties clone(Arena arena, VkPhysicalDeviceMaintenance6Properties src) {
        VkPhysicalDeviceMaintenance6Properties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMaintenance6Properties[] clone(Arena arena, VkPhysicalDeviceMaintenance6Properties[] src) {
        VkPhysicalDeviceMaintenance6Properties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES);
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

    public @unsigned int blockTexelViewCompatibleMultipleLayers() {
        return segment.get(LAYOUT$blockTexelViewCompatibleMultipleLayers, OFFSET$blockTexelViewCompatibleMultipleLayers);
    }

    public void blockTexelViewCompatibleMultipleLayers(@unsigned int value) {
        segment.set(LAYOUT$blockTexelViewCompatibleMultipleLayers, OFFSET$blockTexelViewCompatibleMultipleLayers, value);
    }

    public @unsigned int maxCombinedImageSamplerDescriptorCount() {
        return segment.get(LAYOUT$maxCombinedImageSamplerDescriptorCount, OFFSET$maxCombinedImageSamplerDescriptorCount);
    }

    public void maxCombinedImageSamplerDescriptorCount(@unsigned int value) {
        segment.set(LAYOUT$maxCombinedImageSamplerDescriptorCount, OFFSET$maxCombinedImageSamplerDescriptorCount, value);
    }

    public @unsigned int fragmentShadingRateClampCombinerInputs() {
        return segment.get(LAYOUT$fragmentShadingRateClampCombinerInputs, OFFSET$fragmentShadingRateClampCombinerInputs);
    }

    public void fragmentShadingRateClampCombinerInputs(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateClampCombinerInputs, OFFSET$fragmentShadingRateClampCombinerInputs, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
        ValueLayout.JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateClampCombinerInputs")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$blockTexelViewCompatibleMultipleLayers = PathElement.groupElement("PATH$blockTexelViewCompatibleMultipleLayers");
    public static final PathElement PATH$maxCombinedImageSamplerDescriptorCount = PathElement.groupElement("PATH$maxCombinedImageSamplerDescriptorCount");
    public static final PathElement PATH$fragmentShadingRateClampCombinerInputs = PathElement.groupElement("PATH$fragmentShadingRateClampCombinerInputs");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$blockTexelViewCompatibleMultipleLayers = (OfInt) LAYOUT.select(PATH$blockTexelViewCompatibleMultipleLayers);
    public static final OfInt LAYOUT$maxCombinedImageSamplerDescriptorCount = (OfInt) LAYOUT.select(PATH$maxCombinedImageSamplerDescriptorCount);
    public static final OfInt LAYOUT$fragmentShadingRateClampCombinerInputs = (OfInt) LAYOUT.select(PATH$fragmentShadingRateClampCombinerInputs);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$blockTexelViewCompatibleMultipleLayers = LAYOUT$blockTexelViewCompatibleMultipleLayers.byteSize();
    public static final long SIZE$maxCombinedImageSamplerDescriptorCount = LAYOUT$maxCombinedImageSamplerDescriptorCount.byteSize();
    public static final long SIZE$fragmentShadingRateClampCombinerInputs = LAYOUT$fragmentShadingRateClampCombinerInputs.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$blockTexelViewCompatibleMultipleLayers = LAYOUT.byteOffset(PATH$blockTexelViewCompatibleMultipleLayers);
    public static final long OFFSET$maxCombinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PATH$maxCombinedImageSamplerDescriptorCount);
    public static final long OFFSET$fragmentShadingRateClampCombinerInputs = LAYOUT.byteOffset(PATH$fragmentShadingRateClampCombinerInputs);
}

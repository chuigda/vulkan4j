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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkanMemoryModelFeatures.html"><code>VkPhysicalDeviceVulkanMemoryModelFeatures</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVulkanMemoryModelFeatures {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 vulkanMemoryModel;
///     VkBool32 vulkanMemoryModelDeviceScope;
///     VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
/// } VkPhysicalDeviceVulkanMemoryModelFeatures;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES`
///
/// The {@link VkPhysicalDeviceVulkanMemoryModelFeatures#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceVulkanMemoryModelFeatures#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkanMemoryModelFeatures.html"><code>VkPhysicalDeviceVulkanMemoryModelFeatures</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceVulkanMemoryModelFeatures(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceVulkanMemoryModelFeatures allocate(Arena arena) {
        VkPhysicalDeviceVulkanMemoryModelFeatures ret = new VkPhysicalDeviceVulkanMemoryModelFeatures(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES);
        return ret;
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkanMemoryModelFeatures[] ret = new VkPhysicalDeviceVulkanMemoryModelFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVulkanMemoryModelFeatures(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES);
        }
        return ret;
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures clone(Arena arena, VkPhysicalDeviceVulkanMemoryModelFeatures src) {
        VkPhysicalDeviceVulkanMemoryModelFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures[] clone(Arena arena, VkPhysicalDeviceVulkanMemoryModelFeatures[] src) {
        VkPhysicalDeviceVulkanMemoryModelFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES);
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

    public @unsigned int vulkanMemoryModel() {
        return segment.get(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel);
    }

    public void vulkanMemoryModel(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel, value);
    }

    public @unsigned int vulkanMemoryModelDeviceScope() {
        return segment.get(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope);
    }

    public void vulkanMemoryModelDeviceScope(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope, value);
    }

    public @unsigned int vulkanMemoryModelAvailabilityVisibilityChains() {
        return segment.get(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains);
    }

    public void vulkanMemoryModelAvailabilityVisibilityChains(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModel"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vulkanMemoryModel = PathElement.groupElement("PATH$vulkanMemoryModel");
    public static final PathElement PATH$vulkanMemoryModelDeviceScope = PathElement.groupElement("PATH$vulkanMemoryModelDeviceScope");
    public static final PathElement PATH$vulkanMemoryModelAvailabilityVisibilityChains = PathElement.groupElement("PATH$vulkanMemoryModelAvailabilityVisibilityChains");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vulkanMemoryModel = (OfInt) LAYOUT.select(PATH$vulkanMemoryModel);
    public static final OfInt LAYOUT$vulkanMemoryModelDeviceScope = (OfInt) LAYOUT.select(PATH$vulkanMemoryModelDeviceScope);
    public static final OfInt LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains = (OfInt) LAYOUT.select(PATH$vulkanMemoryModelAvailabilityVisibilityChains);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vulkanMemoryModel = LAYOUT$vulkanMemoryModel.byteSize();
    public static final long SIZE$vulkanMemoryModelDeviceScope = LAYOUT$vulkanMemoryModelDeviceScope.byteSize();
    public static final long SIZE$vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vulkanMemoryModel = LAYOUT.byteOffset(PATH$vulkanMemoryModel);
    public static final long OFFSET$vulkanMemoryModelDeviceScope = LAYOUT.byteOffset(PATH$vulkanMemoryModelDeviceScope);
    public static final long OFFSET$vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.byteOffset(PATH$vulkanMemoryModelAvailabilityVisibilityChains);
}

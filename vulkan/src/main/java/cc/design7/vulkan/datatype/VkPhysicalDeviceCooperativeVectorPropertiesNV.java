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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCooperativeVectorPropertiesNV.html"><code>VkPhysicalDeviceCooperativeVectorPropertiesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceCooperativeVectorPropertiesNV {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkShaderStageFlags cooperativeVectorSupportedStages;
///     VkBool32 cooperativeVectorTrainingFloat16Accumulation;
///     VkBool32 cooperativeVectorTrainingFloat32Accumulation;
///     uint32_t maxCooperativeVectorComponents;
/// } VkPhysicalDeviceCooperativeVectorPropertiesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV`
///
/// The {@link VkPhysicalDeviceCooperativeVectorPropertiesNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceCooperativeVectorPropertiesNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCooperativeVectorPropertiesNV.html"><code>VkPhysicalDeviceCooperativeVectorPropertiesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceCooperativeVectorPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV allocate(Arena arena) {
        VkPhysicalDeviceCooperativeVectorPropertiesNV ret = new VkPhysicalDeviceCooperativeVectorPropertiesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV);
        return ret;
    }

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCooperativeVectorPropertiesNV[] ret = new VkPhysicalDeviceCooperativeVectorPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV);
        }
        return ret;
    }

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV clone(Arena arena, VkPhysicalDeviceCooperativeVectorPropertiesNV src) {
        VkPhysicalDeviceCooperativeVectorPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV[] clone(Arena arena, VkPhysicalDeviceCooperativeVectorPropertiesNV[] src) {
        VkPhysicalDeviceCooperativeVectorPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV);
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

    public @enumtype(VkShaderStageFlags.class) int cooperativeVectorSupportedStages() {
        return segment.get(LAYOUT$cooperativeVectorSupportedStages, OFFSET$cooperativeVectorSupportedStages);
    }

    public void cooperativeVectorSupportedStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$cooperativeVectorSupportedStages, OFFSET$cooperativeVectorSupportedStages, value);
    }

    public @unsigned int cooperativeVectorTrainingFloat16Accumulation() {
        return segment.get(LAYOUT$cooperativeVectorTrainingFloat16Accumulation, OFFSET$cooperativeVectorTrainingFloat16Accumulation);
    }

    public void cooperativeVectorTrainingFloat16Accumulation(@unsigned int value) {
        segment.set(LAYOUT$cooperativeVectorTrainingFloat16Accumulation, OFFSET$cooperativeVectorTrainingFloat16Accumulation, value);
    }

    public @unsigned int cooperativeVectorTrainingFloat32Accumulation() {
        return segment.get(LAYOUT$cooperativeVectorTrainingFloat32Accumulation, OFFSET$cooperativeVectorTrainingFloat32Accumulation);
    }

    public void cooperativeVectorTrainingFloat32Accumulation(@unsigned int value) {
        segment.set(LAYOUT$cooperativeVectorTrainingFloat32Accumulation, OFFSET$cooperativeVectorTrainingFloat32Accumulation, value);
    }

    public @unsigned int maxCooperativeVectorComponents() {
        return segment.get(LAYOUT$maxCooperativeVectorComponents, OFFSET$maxCooperativeVectorComponents);
    }

    public void maxCooperativeVectorComponents(@unsigned int value) {
        segment.set(LAYOUT$maxCooperativeVectorComponents, OFFSET$maxCooperativeVectorComponents, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorSupportedStages"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorTrainingFloat16Accumulation"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorTrainingFloat32Accumulation"),
        ValueLayout.JAVA_INT.withName("maxCooperativeVectorComponents")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$cooperativeVectorSupportedStages = PathElement.groupElement("PATH$cooperativeVectorSupportedStages");
    public static final PathElement PATH$cooperativeVectorTrainingFloat16Accumulation = PathElement.groupElement("PATH$cooperativeVectorTrainingFloat16Accumulation");
    public static final PathElement PATH$cooperativeVectorTrainingFloat32Accumulation = PathElement.groupElement("PATH$cooperativeVectorTrainingFloat32Accumulation");
    public static final PathElement PATH$maxCooperativeVectorComponents = PathElement.groupElement("PATH$maxCooperativeVectorComponents");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cooperativeVectorSupportedStages = (OfInt) LAYOUT.select(PATH$cooperativeVectorSupportedStages);
    public static final OfInt LAYOUT$cooperativeVectorTrainingFloat16Accumulation = (OfInt) LAYOUT.select(PATH$cooperativeVectorTrainingFloat16Accumulation);
    public static final OfInt LAYOUT$cooperativeVectorTrainingFloat32Accumulation = (OfInt) LAYOUT.select(PATH$cooperativeVectorTrainingFloat32Accumulation);
    public static final OfInt LAYOUT$maxCooperativeVectorComponents = (OfInt) LAYOUT.select(PATH$maxCooperativeVectorComponents);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$cooperativeVectorSupportedStages = LAYOUT$cooperativeVectorSupportedStages.byteSize();
    public static final long SIZE$cooperativeVectorTrainingFloat16Accumulation = LAYOUT$cooperativeVectorTrainingFloat16Accumulation.byteSize();
    public static final long SIZE$cooperativeVectorTrainingFloat32Accumulation = LAYOUT$cooperativeVectorTrainingFloat32Accumulation.byteSize();
    public static final long SIZE$maxCooperativeVectorComponents = LAYOUT$maxCooperativeVectorComponents.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cooperativeVectorSupportedStages = LAYOUT.byteOffset(PATH$cooperativeVectorSupportedStages);
    public static final long OFFSET$cooperativeVectorTrainingFloat16Accumulation = LAYOUT.byteOffset(PATH$cooperativeVectorTrainingFloat16Accumulation);
    public static final long OFFSET$cooperativeVectorTrainingFloat32Accumulation = LAYOUT.byteOffset(PATH$cooperativeVectorTrainingFloat32Accumulation);
    public static final long OFFSET$maxCooperativeVectorComponents = LAYOUT.byteOffset(PATH$maxCooperativeVectorComponents);
}

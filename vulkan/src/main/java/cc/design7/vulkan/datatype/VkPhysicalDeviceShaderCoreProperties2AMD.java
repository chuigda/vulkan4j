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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderCoreProperties2AMD.html"><code>VkPhysicalDeviceShaderCoreProperties2AMD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderCoreProperties2AMD {
///     VkStructureType sType;
///     void* pNext;
///     VkShaderCorePropertiesFlagsAMD shaderCoreFeatures;
///     uint32_t activeComputeUnitCount;
/// } VkPhysicalDeviceShaderCoreProperties2AMD;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD`
///
/// The {@link VkPhysicalDeviceShaderCoreProperties2AMD#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceShaderCoreProperties2AMD#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderCoreProperties2AMD.html"><code>VkPhysicalDeviceShaderCoreProperties2AMD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderCoreProperties2AMD(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceShaderCoreProperties2AMD allocate(Arena arena) {
        VkPhysicalDeviceShaderCoreProperties2AMD ret = new VkPhysicalDeviceShaderCoreProperties2AMD(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD);
        return ret;
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderCoreProperties2AMD[] ret = new VkPhysicalDeviceShaderCoreProperties2AMD[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderCoreProperties2AMD(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD clone(Arena arena, VkPhysicalDeviceShaderCoreProperties2AMD src) {
        VkPhysicalDeviceShaderCoreProperties2AMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD[] clone(Arena arena, VkPhysicalDeviceShaderCoreProperties2AMD[] src) {
        VkPhysicalDeviceShaderCoreProperties2AMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD);
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

    public @enumtype(VkShaderCorePropertiesFlagsAMD.class) int shaderCoreFeatures() {
        return segment.get(LAYOUT$shaderCoreFeatures, OFFSET$shaderCoreFeatures);
    }

    public void shaderCoreFeatures(@enumtype(VkShaderCorePropertiesFlagsAMD.class) int value) {
        segment.set(LAYOUT$shaderCoreFeatures, OFFSET$shaderCoreFeatures, value);
    }

    public @unsigned int activeComputeUnitCount() {
        return segment.get(LAYOUT$activeComputeUnitCount, OFFSET$activeComputeUnitCount);
    }

    public void activeComputeUnitCount(@unsigned int value) {
        segment.set(LAYOUT$activeComputeUnitCount, OFFSET$activeComputeUnitCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCoreFeatures"),
        ValueLayout.JAVA_INT.withName("activeComputeUnitCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderCoreFeatures = PathElement.groupElement("PATH$shaderCoreFeatures");
    public static final PathElement PATH$activeComputeUnitCount = PathElement.groupElement("PATH$activeComputeUnitCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderCoreFeatures = (OfInt) LAYOUT.select(PATH$shaderCoreFeatures);
    public static final OfInt LAYOUT$activeComputeUnitCount = (OfInt) LAYOUT.select(PATH$activeComputeUnitCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderCoreFeatures = LAYOUT$shaderCoreFeatures.byteSize();
    public static final long SIZE$activeComputeUnitCount = LAYOUT$activeComputeUnitCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderCoreFeatures = LAYOUT.byteOffset(PATH$shaderCoreFeatures);
    public static final long OFFSET$activeComputeUnitCount = LAYOUT.byteOffset(PATH$activeComputeUnitCount);
}

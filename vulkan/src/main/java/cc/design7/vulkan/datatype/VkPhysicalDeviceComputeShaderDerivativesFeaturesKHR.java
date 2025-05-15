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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.html"><code>VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 computeDerivativeGroupQuads;
///     VkBool32 computeDerivativeGroupLinear;
/// } VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR`
///
/// The {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.html"><code>VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR allocate(Arena arena) {
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR ret = new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR);
        return ret;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] ret = new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR);
        }
        return ret;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR clone(Arena arena, VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR src) {
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] src) {
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR);
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

    public @unsigned int computeDerivativeGroupQuads() {
        return segment.get(LAYOUT$computeDerivativeGroupQuads, OFFSET$computeDerivativeGroupQuads);
    }

    public void computeDerivativeGroupQuads(@unsigned int value) {
        segment.set(LAYOUT$computeDerivativeGroupQuads, OFFSET$computeDerivativeGroupQuads, value);
    }

    public @unsigned int computeDerivativeGroupLinear() {
        return segment.get(LAYOUT$computeDerivativeGroupLinear, OFFSET$computeDerivativeGroupLinear);
    }

    public void computeDerivativeGroupLinear(@unsigned int value) {
        segment.set(LAYOUT$computeDerivativeGroupLinear, OFFSET$computeDerivativeGroupLinear, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupQuads"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupLinear")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$computeDerivativeGroupQuads = PathElement.groupElement("PATH$computeDerivativeGroupQuads");
    public static final PathElement PATH$computeDerivativeGroupLinear = PathElement.groupElement("PATH$computeDerivativeGroupLinear");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$computeDerivativeGroupQuads = (OfInt) LAYOUT.select(PATH$computeDerivativeGroupQuads);
    public static final OfInt LAYOUT$computeDerivativeGroupLinear = (OfInt) LAYOUT.select(PATH$computeDerivativeGroupLinear);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$computeDerivativeGroupQuads = LAYOUT$computeDerivativeGroupQuads.byteSize();
    public static final long SIZE$computeDerivativeGroupLinear = LAYOUT$computeDerivativeGroupLinear.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$computeDerivativeGroupQuads = LAYOUT.byteOffset(PATH$computeDerivativeGroupQuads);
    public static final long OFFSET$computeDerivativeGroupLinear = LAYOUT.byteOffset(PATH$computeDerivativeGroupLinear);
}

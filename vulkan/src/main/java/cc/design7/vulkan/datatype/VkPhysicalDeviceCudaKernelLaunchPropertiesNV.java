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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCudaKernelLaunchPropertiesNV.html"><code>VkPhysicalDeviceCudaKernelLaunchPropertiesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceCudaKernelLaunchPropertiesNV {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t computeCapabilityMinor;
///     uint32_t computeCapabilityMajor;
/// } VkPhysicalDeviceCudaKernelLaunchPropertiesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV`
///
/// The {@link VkPhysicalDeviceCudaKernelLaunchPropertiesNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceCudaKernelLaunchPropertiesNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCudaKernelLaunchPropertiesNV.html"><code>VkPhysicalDeviceCudaKernelLaunchPropertiesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceCudaKernelLaunchPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV allocate(Arena arena) {
        VkPhysicalDeviceCudaKernelLaunchPropertiesNV ret = new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV);
        return ret;
    }

    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] ret = new VkPhysicalDeviceCudaKernelLaunchPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV);
        }
        return ret;
    }

    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV clone(Arena arena, VkPhysicalDeviceCudaKernelLaunchPropertiesNV src) {
        VkPhysicalDeviceCudaKernelLaunchPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] clone(Arena arena, VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] src) {
        VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV);
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

    public @unsigned int computeCapabilityMinor() {
        return segment.get(LAYOUT$computeCapabilityMinor, OFFSET$computeCapabilityMinor);
    }

    public void computeCapabilityMinor(@unsigned int value) {
        segment.set(LAYOUT$computeCapabilityMinor, OFFSET$computeCapabilityMinor, value);
    }

    public @unsigned int computeCapabilityMajor() {
        return segment.get(LAYOUT$computeCapabilityMajor, OFFSET$computeCapabilityMajor);
    }

    public void computeCapabilityMajor(@unsigned int value) {
        segment.set(LAYOUT$computeCapabilityMajor, OFFSET$computeCapabilityMajor, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMinor"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMajor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$computeCapabilityMinor = PathElement.groupElement("PATH$computeCapabilityMinor");
    public static final PathElement PATH$computeCapabilityMajor = PathElement.groupElement("PATH$computeCapabilityMajor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$computeCapabilityMinor = (OfInt) LAYOUT.select(PATH$computeCapabilityMinor);
    public static final OfInt LAYOUT$computeCapabilityMajor = (OfInt) LAYOUT.select(PATH$computeCapabilityMajor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$computeCapabilityMinor = LAYOUT$computeCapabilityMinor.byteSize();
    public static final long SIZE$computeCapabilityMajor = LAYOUT$computeCapabilityMajor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$computeCapabilityMinor = LAYOUT.byteOffset(PATH$computeCapabilityMinor);
    public static final long OFFSET$computeCapabilityMajor = LAYOUT.byteOffset(PATH$computeCapabilityMajor);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCooperativeMatrix2PropertiesNV.html"><code>VkPhysicalDeviceCooperativeMatrix2PropertiesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceCooperativeMatrix2PropertiesNV {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t cooperativeMatrixWorkgroupScopeMaxWorkgroupSize;
///     uint32_t cooperativeMatrixFlexibleDimensionsMaxDimension;
///     uint32_t cooperativeMatrixWorkgroupScopeReservedSharedMemory;
/// } VkPhysicalDeviceCooperativeMatrix2PropertiesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV`
///
/// The {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCooperativeMatrix2PropertiesNV.html"><code>VkPhysicalDeviceCooperativeMatrix2PropertiesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceCooperativeMatrix2PropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV allocate(Arena arena) {
        VkPhysicalDeviceCooperativeMatrix2PropertiesNV ret = new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV);
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCooperativeMatrix2PropertiesNV[] ret = new VkPhysicalDeviceCooperativeMatrix2PropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV);
        }
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV clone(Arena arena, VkPhysicalDeviceCooperativeMatrix2PropertiesNV src) {
        VkPhysicalDeviceCooperativeMatrix2PropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV[] clone(Arena arena, VkPhysicalDeviceCooperativeMatrix2PropertiesNV[] src) {
        VkPhysicalDeviceCooperativeMatrix2PropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV);
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

    public @unsigned int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize() {
        return segment.get(LAYOUT$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize, OFFSET$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize);
    }

    public void cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize, OFFSET$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize, value);
    }

    public @unsigned int cooperativeMatrixFlexibleDimensionsMaxDimension() {
        return segment.get(LAYOUT$cooperativeMatrixFlexibleDimensionsMaxDimension, OFFSET$cooperativeMatrixFlexibleDimensionsMaxDimension);
    }

    public void cooperativeMatrixFlexibleDimensionsMaxDimension(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixFlexibleDimensionsMaxDimension, OFFSET$cooperativeMatrixFlexibleDimensionsMaxDimension, value);
    }

    public @unsigned int cooperativeMatrixWorkgroupScopeReservedSharedMemory() {
        return segment.get(LAYOUT$cooperativeMatrixWorkgroupScopeReservedSharedMemory, OFFSET$cooperativeMatrixWorkgroupScopeReservedSharedMemory);
    }

    public void cooperativeMatrixWorkgroupScopeReservedSharedMemory(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixWorkgroupScopeReservedSharedMemory, OFFSET$cooperativeMatrixWorkgroupScopeReservedSharedMemory, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixFlexibleDimensionsMaxDimension"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScopeReservedSharedMemory")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = PathElement.groupElement("PATH$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize");
    public static final PathElement PATH$cooperativeMatrixFlexibleDimensionsMaxDimension = PathElement.groupElement("PATH$cooperativeMatrixFlexibleDimensionsMaxDimension");
    public static final PathElement PATH$cooperativeMatrixWorkgroupScopeReservedSharedMemory = PathElement.groupElement("PATH$cooperativeMatrixWorkgroupScopeReservedSharedMemory");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = (OfInt) LAYOUT.select(PATH$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize);
    public static final OfInt LAYOUT$cooperativeMatrixFlexibleDimensionsMaxDimension = (OfInt) LAYOUT.select(PATH$cooperativeMatrixFlexibleDimensionsMaxDimension);
    public static final OfInt LAYOUT$cooperativeMatrixWorkgroupScopeReservedSharedMemory = (OfInt) LAYOUT.select(PATH$cooperativeMatrixWorkgroupScopeReservedSharedMemory);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = LAYOUT$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize.byteSize();
    public static final long SIZE$cooperativeMatrixFlexibleDimensionsMaxDimension = LAYOUT$cooperativeMatrixFlexibleDimensionsMaxDimension.byteSize();
    public static final long SIZE$cooperativeMatrixWorkgroupScopeReservedSharedMemory = LAYOUT$cooperativeMatrixWorkgroupScopeReservedSharedMemory.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = LAYOUT.byteOffset(PATH$cooperativeMatrixWorkgroupScopeMaxWorkgroupSize);
    public static final long OFFSET$cooperativeMatrixFlexibleDimensionsMaxDimension = LAYOUT.byteOffset(PATH$cooperativeMatrixFlexibleDimensionsMaxDimension);
    public static final long OFFSET$cooperativeMatrixWorkgroupScopeReservedSharedMemory = LAYOUT.byteOffset(PATH$cooperativeMatrixWorkgroupScopeReservedSharedMemory);
}

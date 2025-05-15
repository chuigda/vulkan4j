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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageProcessingPropertiesQCOM.html"><code>VkPhysicalDeviceImageProcessingPropertiesQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceImageProcessingPropertiesQCOM {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t maxWeightFilterPhases; // optional
///     VkExtent2D maxWeightFilterDimension; // optional
///     VkExtent2D maxBlockMatchRegion; // optional
///     VkExtent2D maxBoxFilterBlockSize; // optional
/// } VkPhysicalDeviceImageProcessingPropertiesQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM`
///
/// The {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageProcessingPropertiesQCOM.html"><code>VkPhysicalDeviceImageProcessingPropertiesQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceImageProcessingPropertiesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM allocate(Arena arena) {
        VkPhysicalDeviceImageProcessingPropertiesQCOM ret = new VkPhysicalDeviceImageProcessingPropertiesQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageProcessingPropertiesQCOM[] ret = new VkPhysicalDeviceImageProcessingPropertiesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM);
        }
        return ret;
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM clone(Arena arena, VkPhysicalDeviceImageProcessingPropertiesQCOM src) {
        VkPhysicalDeviceImageProcessingPropertiesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM[] clone(Arena arena, VkPhysicalDeviceImageProcessingPropertiesQCOM[] src) {
        VkPhysicalDeviceImageProcessingPropertiesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM);
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

    public @unsigned int maxWeightFilterPhases() {
        return segment.get(LAYOUT$maxWeightFilterPhases, OFFSET$maxWeightFilterPhases);
    }

    public void maxWeightFilterPhases(@unsigned int value) {
        segment.set(LAYOUT$maxWeightFilterPhases, OFFSET$maxWeightFilterPhases, value);
    }

    public VkExtent2D maxWeightFilterDimension() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxWeightFilterDimension, LAYOUT$maxWeightFilterDimension));
    }

    public void maxWeightFilterDimension(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxWeightFilterDimension, SIZE$maxWeightFilterDimension);
    }

    public VkExtent2D maxBlockMatchRegion() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxBlockMatchRegion, LAYOUT$maxBlockMatchRegion));
    }

    public void maxBlockMatchRegion(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxBlockMatchRegion, SIZE$maxBlockMatchRegion);
    }

    public VkExtent2D maxBoxFilterBlockSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxBoxFilterBlockSize, LAYOUT$maxBoxFilterBlockSize));
    }

    public void maxBoxFilterBlockSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxBoxFilterBlockSize, SIZE$maxBoxFilterBlockSize);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxWeightFilterPhases"),
        VkExtent2D.LAYOUT.withName("maxWeightFilterDimension"),
        VkExtent2D.LAYOUT.withName("maxBlockMatchRegion"),
        VkExtent2D.LAYOUT.withName("maxBoxFilterBlockSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxWeightFilterPhases = PathElement.groupElement("PATH$maxWeightFilterPhases");
    public static final PathElement PATH$maxWeightFilterDimension = PathElement.groupElement("PATH$maxWeightFilterDimension");
    public static final PathElement PATH$maxBlockMatchRegion = PathElement.groupElement("PATH$maxBlockMatchRegion");
    public static final PathElement PATH$maxBoxFilterBlockSize = PathElement.groupElement("PATH$maxBoxFilterBlockSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxWeightFilterPhases = (OfInt) LAYOUT.select(PATH$maxWeightFilterPhases);
    public static final StructLayout LAYOUT$maxWeightFilterDimension = (StructLayout) LAYOUT.select(PATH$maxWeightFilterDimension);
    public static final StructLayout LAYOUT$maxBlockMatchRegion = (StructLayout) LAYOUT.select(PATH$maxBlockMatchRegion);
    public static final StructLayout LAYOUT$maxBoxFilterBlockSize = (StructLayout) LAYOUT.select(PATH$maxBoxFilterBlockSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxWeightFilterPhases = LAYOUT$maxWeightFilterPhases.byteSize();
    public static final long SIZE$maxWeightFilterDimension = LAYOUT$maxWeightFilterDimension.byteSize();
    public static final long SIZE$maxBlockMatchRegion = LAYOUT$maxBlockMatchRegion.byteSize();
    public static final long SIZE$maxBoxFilterBlockSize = LAYOUT$maxBoxFilterBlockSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxWeightFilterPhases = LAYOUT.byteOffset(PATH$maxWeightFilterPhases);
    public static final long OFFSET$maxWeightFilterDimension = LAYOUT.byteOffset(PATH$maxWeightFilterDimension);
    public static final long OFFSET$maxBlockMatchRegion = LAYOUT.byteOffset(PATH$maxBlockMatchRegion);
    public static final long OFFSET$maxBoxFilterBlockSize = LAYOUT.byteOffset(PATH$maxBoxFilterBlockSize);
}

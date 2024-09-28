package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceImageProcessingPropertiesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxWeightFilterPhases;
///     VkExtent2D maxWeightFilterDimension;
///     VkExtent2D maxBlockMatchRegion;
///     VkExtent2D maxBoxFilterBlockSize;
/// } VkPhysicalDeviceImageProcessingPropertiesQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceImageProcessingPropertiesQCOM.html">VkPhysicalDeviceImageProcessingPropertiesQCOM</a>
public record VkPhysicalDeviceImageProcessingPropertiesQCOM(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceImageProcessingPropertiesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM);
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

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageProcessingPropertiesQCOM[] ret = new VkPhysicalDeviceImageProcessingPropertiesQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxWeightFilterPhases"),
        VkExtent2D.LAYOUT.withName("maxWeightFilterDimension"),
        VkExtent2D.LAYOUT.withName("maxBlockMatchRegion"),
        VkExtent2D.LAYOUT.withName("maxBoxFilterBlockSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxWeightFilterPhases = PathElement.groupElement("maxWeightFilterPhases");
    public static final PathElement PATH$maxWeightFilterDimension = PathElement.groupElement("maxWeightFilterDimension");
    public static final PathElement PATH$maxBlockMatchRegion = PathElement.groupElement("maxBlockMatchRegion");
    public static final PathElement PATH$maxBoxFilterBlockSize = PathElement.groupElement("maxBoxFilterBlockSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxWeightFilterPhases = (OfInt) LAYOUT.select(PATH$maxWeightFilterPhases);
    public static final StructLayout LAYOUT$maxWeightFilterDimension = (StructLayout) LAYOUT.select(PATH$maxWeightFilterDimension);
    public static final StructLayout LAYOUT$maxBlockMatchRegion = (StructLayout) LAYOUT.select(PATH$maxBlockMatchRegion);
    public static final StructLayout LAYOUT$maxBoxFilterBlockSize = (StructLayout) LAYOUT.select(PATH$maxBoxFilterBlockSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxWeightFilterPhases = LAYOUT.byteOffset(PATH$maxWeightFilterPhases);
    public static final long OFFSET$maxWeightFilterDimension = LAYOUT.byteOffset(PATH$maxWeightFilterDimension);
    public static final long OFFSET$maxBlockMatchRegion = LAYOUT.byteOffset(PATH$maxBlockMatchRegion);
    public static final long OFFSET$maxBoxFilterBlockSize = LAYOUT.byteOffset(PATH$maxBoxFilterBlockSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxWeightFilterPhases = LAYOUT$maxWeightFilterPhases.byteSize();
    public static final long SIZE$maxWeightFilterDimension = LAYOUT$maxWeightFilterDimension.byteSize();
    public static final long SIZE$maxBlockMatchRegion = LAYOUT$maxBlockMatchRegion.byteSize();
    public static final long SIZE$maxBoxFilterBlockSize = LAYOUT$maxBoxFilterBlockSize.byteSize();
}

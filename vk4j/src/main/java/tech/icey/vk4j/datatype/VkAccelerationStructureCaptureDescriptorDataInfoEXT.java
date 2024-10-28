package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureCaptureDescriptorDataInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureKHR accelerationStructure;
///     VkAccelerationStructureNV accelerationStructureNV;
/// } VkAccelerationStructureCaptureDescriptorDataInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureCaptureDescriptorDataInfoEXT.html">VkAccelerationStructureCaptureDescriptorDataInfoEXT</a>
public record VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @nullable VkAccelerationStructureKHR accelerationStructure() {
        MemorySegment s = segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void accelerationStructure(@nullable VkAccelerationStructureKHR value) {
        segment.set(
            LAYOUT$accelerationStructure,
            OFFSET$accelerationStructure,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @nullable VkAccelerationStructureNV accelerationStructureNV() {
        MemorySegment s = segment.get(LAYOUT$accelerationStructureNV, OFFSET$accelerationStructureNV);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureNV(s);
    }

    public void accelerationStructureNV(@nullable VkAccelerationStructureNV value) {
        segment.set(
            LAYOUT$accelerationStructureNV,
            OFFSET$accelerationStructureNV,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT allocate(Arena arena) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureCaptureDescriptorDataInfoEXT[] ret = new VkAccelerationStructureCaptureDescriptorDataInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT clone(Arena arena, VkAccelerationStructureCaptureDescriptorDataInfoEXT src) {
        VkAccelerationStructureCaptureDescriptorDataInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT[] clone(Arena arena, VkAccelerationStructureCaptureDescriptorDataInfoEXT[] src) {
        VkAccelerationStructureCaptureDescriptorDataInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("accelerationStructure"),
        ValueLayout.ADDRESS.withName("accelerationStructureNV")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("accelerationStructure");
    public static final PathElement PATH$accelerationStructureNV = PathElement.groupElement("accelerationStructureNV");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$accelerationStructure = (AddressLayout) LAYOUT.select(PATH$accelerationStructure);
    public static final AddressLayout LAYOUT$accelerationStructureNV = (AddressLayout) LAYOUT.select(PATH$accelerationStructureNV);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
    public static final long OFFSET$accelerationStructureNV = LAYOUT.byteOffset(PATH$accelerationStructureNV);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();
    public static final long SIZE$accelerationStructureNV = LAYOUT$accelerationStructureNV.byteSize();
}

package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.enumtype.VkAccelerationStructureMemoryRequirementsTypeNV;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkAccelerationStructureNV;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV;

/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureMemoryRequirementsInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureMemoryRequirementsTypeNV type;
///     VkAccelerationStructureNV accelerationStructure;
/// } VkAccelerationStructureMemoryRequirementsInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureMemoryRequirementsInfoNV.html">VkAccelerationStructureMemoryRequirementsInfoNV</a>
public record VkAccelerationStructureMemoryRequirementsInfoNV(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureMemoryRequirementsInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV);
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

    public @enumtype(VkAccelerationStructureMemoryRequirementsTypeNV.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkAccelerationStructureMemoryRequirementsTypeNV.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @nullable VkAccelerationStructureNV accelerationStructure() {
        MemorySegment s = segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureNV(s);
    }

    public void accelerationStructure(@nullable VkAccelerationStructureNV value) {
        segment.set(
            LAYOUT$accelerationStructure,
            OFFSET$accelerationStructure,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV allocate(Arena arena) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMemoryRequirementsInfoNV[] ret = new VkAccelerationStructureMemoryRequirementsInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureMemoryRequirementsInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV clone(Arena arena, VkAccelerationStructureMemoryRequirementsInfoNV src) {
        VkAccelerationStructureMemoryRequirementsInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV[] clone(Arena arena, VkAccelerationStructureMemoryRequirementsInfoNV[] src) {
        VkAccelerationStructureMemoryRequirementsInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("accelerationStructure")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("accelerationStructure");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$accelerationStructure = (AddressLayout) LAYOUT.select(PATH$accelerationStructure);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();
}

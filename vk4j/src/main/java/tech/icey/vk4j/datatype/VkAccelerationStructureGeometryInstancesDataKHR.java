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
/// typedef struct VkAccelerationStructureGeometryInstancesDataKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 arrayOfPointers;
///     VkDeviceOrHostAddressConstKHR data;
/// } VkAccelerationStructureGeometryInstancesDataKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureGeometryInstancesDataKHR.html">VkAccelerationStructureGeometryInstancesDataKHR</a>
public record VkAccelerationStructureGeometryInstancesDataKHR(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureGeometryInstancesDataKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR);
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

    public @unsigned int arrayOfPointers() {
        return segment.get(LAYOUT$arrayOfPointers, OFFSET$arrayOfPointers);
    }

    public void arrayOfPointers(@unsigned int value) {
        segment.set(LAYOUT$arrayOfPointers, OFFSET$arrayOfPointers, value);
    }

    public VkDeviceOrHostAddressConstKHR data() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, SIZE$data);
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR allocate(Arena arena) {
        return new VkAccelerationStructureGeometryInstancesDataKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryInstancesDataKHR[] ret = new VkAccelerationStructureGeometryInstancesDataKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureGeometryInstancesDataKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR clone(Arena arena, VkAccelerationStructureGeometryInstancesDataKHR src) {
        VkAccelerationStructureGeometryInstancesDataKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR[] clone(Arena arena, VkAccelerationStructureGeometryInstancesDataKHR[] src) {
        VkAccelerationStructureGeometryInstancesDataKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("arrayOfPointers"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$arrayOfPointers = PathElement.groupElement("arrayOfPointers");
    public static final PathElement PATH$data = PathElement.groupElement("data");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$arrayOfPointers = (OfInt) LAYOUT.select(PATH$arrayOfPointers);
    public static final UnionLayout LAYOUT$data = (UnionLayout) LAYOUT.select(PATH$data);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$arrayOfPointers = LAYOUT.byteOffset(PATH$arrayOfPointers);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$arrayOfPointers = LAYOUT$arrayOfPointers.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();
}

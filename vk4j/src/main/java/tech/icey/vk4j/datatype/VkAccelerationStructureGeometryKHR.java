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

public record VkAccelerationStructureGeometryKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("geometryType"),
        VkAccelerationStructureGeometryDataKHR.LAYOUT.withName("geometry"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$geometryType = PathElement.groupElement("geometryType");
    public static final PathElement PATH$geometry = PathElement.groupElement("geometry");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$geometryType = (OfInt) LAYOUT.select(PATH$geometryType);
    public static final UnionLayout LAYOUT$geometry = (UnionLayout) LAYOUT.select(PATH$geometry);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$geometryType = LAYOUT.byteOffset(PATH$geometryType);
    public static final long OFFSET$geometry = LAYOUT.byteOffset(PATH$geometry);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$geometryType = LAYOUT$geometryType.byteSize();
    public static final long SIZE$geometry = LAYOUT$geometry.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public VkAccelerationStructureGeometryKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR);
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

    public @enumtype(VkGeometryTypeKHR.class) int geometryType() {
        return segment.get(LAYOUT$geometryType, OFFSET$geometryType);
    }

    public void geometryType(@enumtype(VkGeometryTypeKHR.class) int value) {
        segment.set(LAYOUT$geometryType, OFFSET$geometryType, value);
    }

    public VkAccelerationStructureGeometryDataKHR geometry() {
        return new VkAccelerationStructureGeometryDataKHR(segment.asSlice(OFFSET$geometry, LAYOUT$geometry));
    }

    public void geometry(VkAccelerationStructureGeometryDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$geometry, SIZE$geometry);
    }

    public @enumtype(VkGeometryFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkGeometryFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public static VkAccelerationStructureGeometryKHR allocate(Arena arena) {
        return new VkAccelerationStructureGeometryKHR(arena.allocate(LAYOUT));
    }
    
    public static VkAccelerationStructureGeometryKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryKHR[] ret = new VkAccelerationStructureGeometryKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureGeometryKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

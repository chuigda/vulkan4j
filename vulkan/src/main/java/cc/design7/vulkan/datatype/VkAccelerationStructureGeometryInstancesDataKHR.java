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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryInstancesDataKHR.html">VkAccelerationStructureGeometryInstancesDataKHR</a>
@ValueBasedCandidate
public record VkAccelerationStructureGeometryInstancesDataKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$arrayOfPointers = ValueLayout.JAVA_INT.withName("arrayOfPointers");
    public static final StructLayout LAYOUT$data = VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$arrayOfPointers, LAYOUT$data);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureGeometryInstancesDataKHR allocate(Arena arena) {
        return new VkAccelerationStructureGeometryInstancesDataKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryInstancesDataKHR[] ret = new VkAccelerationStructureGeometryInstancesDataKHR[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$arrayOfPointers = PathElement.groupElement("PATH$arrayOfPointers");
    public static final PathElement PATH$data = PathElement.groupElement("PATH$data");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$arrayOfPointers = LAYOUT$arrayOfPointers.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$arrayOfPointers = LAYOUT.byteOffset(PATH$arrayOfPointers);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

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

}

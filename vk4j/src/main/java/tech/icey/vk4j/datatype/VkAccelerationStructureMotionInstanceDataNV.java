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
/// typedef union VkAccelerationStructureMotionInstanceDataNV {
///     VkAccelerationStructureInstanceKHR staticInstance;
///     VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance;
///     VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance;
/// } VkAccelerationStructureMotionInstanceDataNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureMotionInstanceDataNV.html">VkAccelerationStructureMotionInstanceDataNV</a>
public record VkAccelerationStructureMotionInstanceDataNV(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureMotionInstanceDataNV(MemorySegment segment) {
        this.segment = segment;
    }

    public VkAccelerationStructureInstanceKHR staticInstance() {
        return new VkAccelerationStructureInstanceKHR(segment.asSlice(OFFSET$staticInstance, LAYOUT$staticInstance));
    }

    public void staticInstance(VkAccelerationStructureInstanceKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$staticInstance, SIZE$staticInstance);
    }

    public VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {
        return new VkAccelerationStructureMatrixMotionInstanceNV(segment.asSlice(OFFSET$matrixMotionInstance, LAYOUT$matrixMotionInstance));
    }

    public void matrixMotionInstance(VkAccelerationStructureMatrixMotionInstanceNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$matrixMotionInstance, SIZE$matrixMotionInstance);
    }

    public VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {
        return new VkAccelerationStructureSRTMotionInstanceNV(segment.asSlice(OFFSET$srtMotionInstance, LAYOUT$srtMotionInstance));
    }

    public void srtMotionInstance(VkAccelerationStructureSRTMotionInstanceNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srtMotionInstance, SIZE$srtMotionInstance);
    }

    public static VkAccelerationStructureMotionInstanceDataNV allocate(Arena arena) {
        return new VkAccelerationStructureMotionInstanceDataNV(arena.allocate(LAYOUT));
    }
    
    public static VkAccelerationStructureMotionInstanceDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMotionInstanceDataNV[] ret = new VkAccelerationStructureMotionInstanceDataNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureMotionInstanceDataNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        VkAccelerationStructureInstanceKHR.LAYOUT.withName("staticInstance"),
        VkAccelerationStructureMatrixMotionInstanceNV.LAYOUT.withName("matrixMotionInstance"),
        VkAccelerationStructureSRTMotionInstanceNV.LAYOUT.withName("srtMotionInstance")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$staticInstance = PathElement.groupElement("staticInstance");
    public static final PathElement PATH$matrixMotionInstance = PathElement.groupElement("matrixMotionInstance");
    public static final PathElement PATH$srtMotionInstance = PathElement.groupElement("srtMotionInstance");

    public static final StructLayout LAYOUT$staticInstance = (StructLayout) LAYOUT.select(PATH$staticInstance);
    public static final StructLayout LAYOUT$matrixMotionInstance = (StructLayout) LAYOUT.select(PATH$matrixMotionInstance);
    public static final StructLayout LAYOUT$srtMotionInstance = (StructLayout) LAYOUT.select(PATH$srtMotionInstance);

    public static final long OFFSET$staticInstance = LAYOUT.byteOffset(PATH$staticInstance);
    public static final long OFFSET$matrixMotionInstance = LAYOUT.byteOffset(PATH$matrixMotionInstance);
    public static final long OFFSET$srtMotionInstance = LAYOUT.byteOffset(PATH$srtMotionInstance);

    public static final long SIZE$staticInstance = LAYOUT$staticInstance.byteSize();
    public static final long SIZE$matrixMotionInstance = LAYOUT$matrixMotionInstance.byteSize();
    public static final long SIZE$srtMotionInstance = LAYOUT$srtMotionInstance.byteSize();

}

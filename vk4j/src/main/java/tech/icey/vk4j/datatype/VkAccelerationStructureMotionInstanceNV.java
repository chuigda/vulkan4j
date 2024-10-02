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
/// typedef struct VkAccelerationStructureMotionInstanceNV {
///     VkAccelerationStructureMotionInstanceTypeNV type;
///     VkAccelerationStructureMotionInstanceFlagsNV flags;
///     VkAccelerationStructureMotionInstanceDataNV data;
/// } VkAccelerationStructureMotionInstanceNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureMotionInstanceNV.html">VkAccelerationStructureMotionInstanceNV</a>
public record VkAccelerationStructureMotionInstanceNV(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureMotionInstanceNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkAccelerationStructureMotionInstanceTypeNV.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkAccelerationStructureMotionInstanceTypeNV.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @enumtype(VkAccelerationStructureMotionInstanceFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkAccelerationStructureMotionInstanceFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public VkAccelerationStructureMotionInstanceDataNV data() {
        return new VkAccelerationStructureMotionInstanceDataNV(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkAccelerationStructureMotionInstanceDataNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, SIZE$data);
    }

    public static VkAccelerationStructureMotionInstanceNV allocate(Arena arena) {
        return new VkAccelerationStructureMotionInstanceNV(arena.allocate(LAYOUT));
    }
    
    public static VkAccelerationStructureMotionInstanceNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMotionInstanceNV[] ret = new VkAccelerationStructureMotionInstanceNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureMotionInstanceNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureMotionInstanceNV clone(Arena arena, VkAccelerationStructureMotionInstanceNV src) {
        VkAccelerationStructureMotionInstanceNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureMotionInstanceNV[] clone(Arena arena, VkAccelerationStructureMotionInstanceNV[] src) {
        VkAccelerationStructureMotionInstanceNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        VkAccelerationStructureMotionInstanceDataNV.LAYOUT.withName("data")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$data = PathElement.groupElement("data");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final UnionLayout LAYOUT$data = (UnionLayout) LAYOUT.select(PATH$data);

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();
}

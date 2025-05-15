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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPartitionedAccelerationStructureInstancesInputNV.html">VkPartitionedAccelerationStructureInstancesInputNV</a>
@ValueBasedCandidate
public record VkPartitionedAccelerationStructureInstancesInputNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$instanceCount = ValueLayout.JAVA_INT.withName("instanceCount");
    public static final OfInt LAYOUT$maxInstancePerPartitionCount = ValueLayout.JAVA_INT.withName("maxInstancePerPartitionCount");
    public static final OfInt LAYOUT$partitionCount = ValueLayout.JAVA_INT.withName("partitionCount");
    public static final OfInt LAYOUT$maxInstanceInGlobalPartitionCount = ValueLayout.JAVA_INT.withName("maxInstanceInGlobalPartitionCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$instanceCount, LAYOUT$maxInstancePerPartitionCount, LAYOUT$partitionCount, LAYOUT$maxInstanceInGlobalPartitionCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPartitionedAccelerationStructureInstancesInputNV allocate(Arena arena) {
        return new VkPartitionedAccelerationStructureInstancesInputNV(arena.allocate(LAYOUT));
    }

    public static VkPartitionedAccelerationStructureInstancesInputNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPartitionedAccelerationStructureInstancesInputNV[] ret = new VkPartitionedAccelerationStructureInstancesInputNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPartitionedAccelerationStructureInstancesInputNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPartitionedAccelerationStructureInstancesInputNV clone(Arena arena, VkPartitionedAccelerationStructureInstancesInputNV src) {
        VkPartitionedAccelerationStructureInstancesInputNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPartitionedAccelerationStructureInstancesInputNV[] clone(Arena arena, VkPartitionedAccelerationStructureInstancesInputNV[] src) {
        VkPartitionedAccelerationStructureInstancesInputNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$instanceCount = PathElement.groupElement("PATH$instanceCount");
    public static final PathElement PATH$maxInstancePerPartitionCount = PathElement.groupElement("PATH$maxInstancePerPartitionCount");
    public static final PathElement PATH$partitionCount = PathElement.groupElement("PATH$partitionCount");
    public static final PathElement PATH$maxInstanceInGlobalPartitionCount = PathElement.groupElement("PATH$maxInstanceInGlobalPartitionCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$instanceCount = LAYOUT$instanceCount.byteSize();
    public static final long SIZE$maxInstancePerPartitionCount = LAYOUT$maxInstancePerPartitionCount.byteSize();
    public static final long SIZE$partitionCount = LAYOUT$partitionCount.byteSize();
    public static final long SIZE$maxInstanceInGlobalPartitionCount = LAYOUT$maxInstanceInGlobalPartitionCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$instanceCount = LAYOUT.byteOffset(PATH$instanceCount);
    public static final long OFFSET$maxInstancePerPartitionCount = LAYOUT.byteOffset(PATH$maxInstancePerPartitionCount);
    public static final long OFFSET$partitionCount = LAYOUT.byteOffset(PATH$partitionCount);
    public static final long OFFSET$maxInstanceInGlobalPartitionCount = LAYOUT.byteOffset(PATH$maxInstanceInGlobalPartitionCount);

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

    public @enumtype(VkBuildAccelerationStructureFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkBuildAccelerationStructureFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int instanceCount() {
        return segment.get(LAYOUT$instanceCount, OFFSET$instanceCount);
    }

    public void instanceCount(@unsigned int value) {
        segment.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);
    }

    public @unsigned int maxInstancePerPartitionCount() {
        return segment.get(LAYOUT$maxInstancePerPartitionCount, OFFSET$maxInstancePerPartitionCount);
    }

    public void maxInstancePerPartitionCount(@unsigned int value) {
        segment.set(LAYOUT$maxInstancePerPartitionCount, OFFSET$maxInstancePerPartitionCount, value);
    }

    public @unsigned int partitionCount() {
        return segment.get(LAYOUT$partitionCount, OFFSET$partitionCount);
    }

    public void partitionCount(@unsigned int value) {
        segment.set(LAYOUT$partitionCount, OFFSET$partitionCount, value);
    }

    public @unsigned int maxInstanceInGlobalPartitionCount() {
        return segment.get(LAYOUT$maxInstanceInGlobalPartitionCount, OFFSET$maxInstanceInGlobalPartitionCount);
    }

    public void maxInstanceInGlobalPartitionCount(@unsigned int value) {
        segment.set(LAYOUT$maxInstanceInGlobalPartitionCount, OFFSET$maxInstanceInGlobalPartitionCount, value);
    }

}

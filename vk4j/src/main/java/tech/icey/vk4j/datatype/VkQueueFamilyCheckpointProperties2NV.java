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
/// typedef struct VkQueueFamilyCheckpointProperties2NV {
///     VkStructureType sType;
///     void* pNext;
///     VkPipelineStageFlags2 checkpointExecutionStageMask;
/// } VkQueueFamilyCheckpointProperties2NV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkQueueFamilyCheckpointProperties2NV.html">VkQueueFamilyCheckpointProperties2NV</a>
public record VkQueueFamilyCheckpointProperties2NV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("checkpointExecutionStageMask")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$checkpointExecutionStageMask = PathElement.groupElement("checkpointExecutionStageMask");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$checkpointExecutionStageMask = (OfLong) LAYOUT.select(PATH$checkpointExecutionStageMask);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$checkpointExecutionStageMask = LAYOUT.byteOffset(PATH$checkpointExecutionStageMask);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$checkpointExecutionStageMask = LAYOUT$checkpointExecutionStageMask.byteSize();

    public VkQueueFamilyCheckpointProperties2NV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV);
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

    public @enumtype(VkPipelineStageFlags2.class) long checkpointExecutionStageMask() {
        return segment.get(LAYOUT$checkpointExecutionStageMask, OFFSET$checkpointExecutionStageMask);
    }

    public void checkpointExecutionStageMask(@enumtype(VkPipelineStageFlags2.class) long value) {
        segment.set(LAYOUT$checkpointExecutionStageMask, OFFSET$checkpointExecutionStageMask, value);
    }

    public static VkQueueFamilyCheckpointProperties2NV allocate(Arena arena) {
        return new VkQueueFamilyCheckpointProperties2NV(arena.allocate(LAYOUT));
    }
    
    public static VkQueueFamilyCheckpointProperties2NV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueueFamilyCheckpointProperties2NV[] ret = new VkQueueFamilyCheckpointProperties2NV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkQueueFamilyCheckpointProperties2NV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

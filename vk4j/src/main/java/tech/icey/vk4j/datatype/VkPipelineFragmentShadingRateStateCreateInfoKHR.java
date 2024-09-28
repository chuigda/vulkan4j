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

public record VkPipelineFragmentShadingRateStateCreateInfoKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("fragmentSize"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("combinerOps")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentSize = PathElement.groupElement("fragmentSize");
    public static final PathElement PATH$combinerOps = PathElement.groupElement("combinerOps");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$fragmentSize = (StructLayout) LAYOUT.select(PATH$fragmentSize);
    public static final SequenceLayout LAYOUT$combinerOps = (SequenceLayout) LAYOUT.select(PATH$combinerOps);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentSize = LAYOUT.byteOffset(PATH$fragmentSize);
    public static final long OFFSET$combinerOps = LAYOUT.byteOffset(PATH$combinerOps);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentSize = LAYOUT$fragmentSize.byteSize();
    public static final long SIZE$combinerOps = LAYOUT$combinerOps.byteSize();

    public VkPipelineFragmentShadingRateStateCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
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

    public VkExtent2D fragmentSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$fragmentSize, LAYOUT$fragmentSize));
    }

    public void fragmentSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentSize, SIZE$fragmentSize);
    }

    public MemorySegment combinerOpsRaw() {
        return segment.asSlice(OFFSET$combinerOps, SIZE$combinerOps);
    }

    public IntBuffer combinerOps() {
        return new IntBuffer(combinerOpsRaw());
    }

    public void combinerOps(IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$combinerOps, SIZE$combinerOps);
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR allocate(Arena arena) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineFragmentShadingRateStateCreateInfoKHR[] ret = new VkPipelineFragmentShadingRateStateCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

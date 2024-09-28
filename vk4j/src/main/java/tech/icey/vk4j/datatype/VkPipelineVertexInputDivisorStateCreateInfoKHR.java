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
/// typedef struct VkPipelineVertexInputDivisorStateCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t vertexBindingDivisorCount;
///     const VkVertexInputBindingDivisorDescriptionKHR* pVertexBindingDivisors;
/// } VkPipelineVertexInputDivisorStateCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineVertexInputDivisorStateCreateInfoKHR.html">VkPipelineVertexInputDivisorStateCreateInfoKHR</a>
public record VkPipelineVertexInputDivisorStateCreateInfoKHR(MemorySegment segment) implements IPointer {
    public VkPipelineVertexInputDivisorStateCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR);
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

    public @unsigned int vertexBindingDivisorCount() {
        return segment.get(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount);
    }

    public void vertexBindingDivisorCount(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount, value);
    }

    public @pointer(comment="VkVertexInputBindingDivisorDescriptionKHR*") MemorySegment pVertexBindingDivisorsRaw() {
        return segment.get(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors);
    }

    public void pVertexBindingDivisorsRaw(@pointer(comment="VkVertexInputBindingDivisorDescriptionKHR*") MemorySegment value) {
        segment.set(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors, value);
    }
    
    public @nullable VkVertexInputBindingDivisorDescriptionKHR pVertexBindingDivisors() {
        MemorySegment s = pVertexBindingDivisorsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVertexInputBindingDivisorDescriptionKHR(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkVertexInputBindingDivisorDescriptionKHR[] pVertexBindingDivisors(int assumedCount) {
        MemorySegment s = pVertexBindingDivisorsRaw().reinterpret(assumedCount * VkVertexInputBindingDivisorDescriptionKHR.SIZE);
        VkVertexInputBindingDivisorDescriptionKHR[] arr = new VkVertexInputBindingDivisorDescriptionKHR[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkVertexInputBindingDivisorDescriptionKHR(s.asSlice(i * VkVertexInputBindingDivisorDescriptionKHR.SIZE, VkVertexInputBindingDivisorDescriptionKHR.SIZE));
        }
        return arr;
    }

    public void pVertexBindingDivisors(@nullable VkVertexInputBindingDivisorDescriptionKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexBindingDivisorsRaw(s);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfoKHR allocate(Arena arena) {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineVertexInputDivisorStateCreateInfoKHR[] ret = new VkPipelineVertexInputDivisorStateCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineVertexInputDivisorStateCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexBindingDivisorCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDivisorDescriptionKHR.LAYOUT).withName("pVertexBindingDivisors")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vertexBindingDivisorCount = PathElement.groupElement("vertexBindingDivisorCount");
    public static final PathElement PATH$pVertexBindingDivisors = PathElement.groupElement("pVertexBindingDivisors");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexBindingDivisorCount = (OfInt) LAYOUT.select(PATH$vertexBindingDivisorCount);
    public static final AddressLayout LAYOUT$pVertexBindingDivisors = (AddressLayout) LAYOUT.select(PATH$pVertexBindingDivisors);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexBindingDivisorCount = LAYOUT.byteOffset(PATH$vertexBindingDivisorCount);
    public static final long OFFSET$pVertexBindingDivisors = LAYOUT.byteOffset(PATH$pVertexBindingDivisors);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexBindingDivisorCount = LAYOUT$vertexBindingDivisorCount.byteSize();
    public static final long SIZE$pVertexBindingDivisors = LAYOUT$pVertexBindingDivisors.byteSize();

}

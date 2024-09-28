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
/// typedef struct VkDescriptorSetVariableDescriptorCountAllocateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t descriptorSetCount;
///     const uint32_t* pDescriptorCounts;
/// } VkDescriptorSetVariableDescriptorCountAllocateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorSetVariableDescriptorCountAllocateInfo.html">VkDescriptorSetVariableDescriptorCountAllocateInfo</a>
public record VkDescriptorSetVariableDescriptorCountAllocateInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDescriptorCounts")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorSetCount = PathElement.groupElement("descriptorSetCount");
    public static final PathElement PATH$pDescriptorCounts = PathElement.groupElement("pDescriptorCounts");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorSetCount = (OfInt) LAYOUT.select(PATH$descriptorSetCount);
    public static final AddressLayout LAYOUT$pDescriptorCounts = (AddressLayout) LAYOUT.select(PATH$pDescriptorCounts);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorSetCount = LAYOUT.byteOffset(PATH$descriptorSetCount);
    public static final long OFFSET$pDescriptorCounts = LAYOUT.byteOffset(PATH$pDescriptorCounts);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorSetCount = LAYOUT$descriptorSetCount.byteSize();
    public static final long SIZE$pDescriptorCounts = LAYOUT$pDescriptorCounts.byteSize();

    public VkDescriptorSetVariableDescriptorCountAllocateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO);
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

    public @unsigned int descriptorSetCount() {
        return segment.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);
    }

    public void descriptorSetCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pDescriptorCountsRaw() {
        return segment.get(LAYOUT$pDescriptorCounts, OFFSET$pDescriptorCounts);
    }

    public void pDescriptorCountsRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pDescriptorCounts, OFFSET$pDescriptorCounts, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pDescriptorCounts() {
        MemorySegment s = pDescriptorCountsRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pDescriptorCounts(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorCountsRaw(s);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo allocate(Arena arena) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetVariableDescriptorCountAllocateInfo[] ret = new VkDescriptorSetVariableDescriptorCountAllocateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorSetVariableDescriptorCountAllocateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
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
/// typedef struct VkDescriptorSetAllocateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorPool descriptorPool;
///     uint32_t descriptorSetCount;
///     const VkDescriptorSetLayout* pSetLayouts;
/// } VkDescriptorSetAllocateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorSetAllocateInfo.html">VkDescriptorSetAllocateInfo</a>
public record VkDescriptorSetAllocateInfo(MemorySegment segment) implements IPointer {
    public VkDescriptorSetAllocateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkDescriptorPool descriptorPool() {
        MemorySegment s = segment.get(LAYOUT$descriptorPool, OFFSET$descriptorPool);
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorPool(s);
    }

    public void descriptorPool(@Nullable VkDescriptorPool value) {
        segment.set(
            LAYOUT$descriptorPool,
            OFFSET$descriptorPool,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int descriptorSetCount() {
        return segment.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);
    }

    public void descriptorSetCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);
    }

    public @pointer(comment="VkDescriptorSetLayout") MemorySegment pSetLayoutsRaw() {
        return segment.get(LAYOUT$pSetLayouts, OFFSET$pSetLayouts);
    }

    public void pSetLayoutsRaw(@pointer(comment="VkDescriptorSetLayout") MemorySegment value) {
        segment.set(LAYOUT$pSetLayouts, OFFSET$pSetLayouts, value);
    }

    /// Note: the returned {@link VkDescriptorSetLayout.Buffer} does not have correct
    /// {@link VkDescriptorSetLayout.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkDescriptorSetLayout.Buffer#reinterpret} to set the size before actually
    /// {@link VkDescriptorSetLayout.Buffer#read}ing or {@link VkDescriptorSetLayout.Buffer#write}ing
    /// the buffer.
    public @Nullable VkDescriptorSetLayout.Buffer pSetLayouts() {
        MemorySegment s = pSetLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSetLayout.Buffer(s);
    }

    public void pSetLayouts(@Nullable VkDescriptorSetLayout.Buffer value) {
        pSetLayoutsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkDescriptorSetAllocateInfo allocate(Arena arena) {
        return new VkDescriptorSetAllocateInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorSetAllocateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetAllocateInfo[] ret = new VkDescriptorSetAllocateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorSetAllocateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorSetAllocateInfo clone(Arena arena, VkDescriptorSetAllocateInfo src) {
        VkDescriptorSetAllocateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetAllocateInfo[] clone(Arena arena, VkDescriptorSetAllocateInfo[] src) {
        VkDescriptorSetAllocateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorPool"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSetLayouts")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorPool = PathElement.groupElement("descriptorPool");
    public static final PathElement PATH$descriptorSetCount = PathElement.groupElement("descriptorSetCount");
    public static final PathElement PATH$pSetLayouts = PathElement.groupElement("pSetLayouts");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$descriptorPool = (AddressLayout) LAYOUT.select(PATH$descriptorPool);
    public static final OfInt LAYOUT$descriptorSetCount = (OfInt) LAYOUT.select(PATH$descriptorSetCount);
    public static final AddressLayout LAYOUT$pSetLayouts = (AddressLayout) LAYOUT.select(PATH$pSetLayouts);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorPool = LAYOUT.byteOffset(PATH$descriptorPool);
    public static final long OFFSET$descriptorSetCount = LAYOUT.byteOffset(PATH$descriptorSetCount);
    public static final long OFFSET$pSetLayouts = LAYOUT.byteOffset(PATH$pSetLayouts);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorPool = LAYOUT$descriptorPool.byteSize();
    public static final long SIZE$descriptorSetCount = LAYOUT$descriptorSetCount.byteSize();
    public static final long SIZE$pSetLayouts = LAYOUT$pSetLayouts.byteSize();
}

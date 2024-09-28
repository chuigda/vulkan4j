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

public record VkDescriptorPoolCreateInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxSets"),
        ValueLayout.JAVA_INT.withName("poolSizeCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorPoolSize.LAYOUT).withName("pPoolSizes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$maxSets = PathElement.groupElement("maxSets");
    public static final PathElement PATH$poolSizeCount = PathElement.groupElement("poolSizeCount");
    public static final PathElement PATH$pPoolSizes = PathElement.groupElement("pPoolSizes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$maxSets = (OfInt) LAYOUT.select(PATH$maxSets);
    public static final OfInt LAYOUT$poolSizeCount = (OfInt) LAYOUT.select(PATH$poolSizeCount);
    public static final AddressLayout LAYOUT$pPoolSizes = (AddressLayout) LAYOUT.select(PATH$pPoolSizes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$maxSets = LAYOUT.byteOffset(PATH$maxSets);
    public static final long OFFSET$poolSizeCount = LAYOUT.byteOffset(PATH$poolSizeCount);
    public static final long OFFSET$pPoolSizes = LAYOUT.byteOffset(PATH$pPoolSizes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$maxSets = LAYOUT$maxSets.byteSize();
    public static final long SIZE$poolSizeCount = LAYOUT$poolSizeCount.byteSize();
    public static final long SIZE$pPoolSizes = LAYOUT$pPoolSizes.byteSize();

    public VkDescriptorPoolCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO);
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

    public @enumtype(VkDescriptorPoolCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorPoolCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int maxSets() {
        return segment.get(LAYOUT$maxSets, OFFSET$maxSets);
    }

    public void maxSets(@unsigned int value) {
        segment.set(LAYOUT$maxSets, OFFSET$maxSets, value);
    }

    public @unsigned int poolSizeCount() {
        return segment.get(LAYOUT$poolSizeCount, OFFSET$poolSizeCount);
    }

    public void poolSizeCount(@unsigned int value) {
        segment.set(LAYOUT$poolSizeCount, OFFSET$poolSizeCount, value);
    }

    public @pointer(comment="VkDescriptorPoolSize*") MemorySegment pPoolSizesRaw() {
        return segment.get(LAYOUT$pPoolSizes, OFFSET$pPoolSizes);
    }

    public void pPoolSizesRaw(@pointer(comment="VkDescriptorPoolSize*") MemorySegment value) {
        segment.set(LAYOUT$pPoolSizes, OFFSET$pPoolSizes, value);
    }
    
    public @nullable VkDescriptorPoolSize pPoolSizes() {
        MemorySegment s = pPoolSizesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorPoolSize(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkDescriptorPoolSize[] pPoolSizes(int assumedCount) {
        MemorySegment s = pPoolSizesRaw().reinterpret(assumedCount * VkDescriptorPoolSize.SIZE);
        VkDescriptorPoolSize[] arr = new VkDescriptorPoolSize[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorPoolSize(s.asSlice(i * VkDescriptorPoolSize.SIZE, VkDescriptorPoolSize.SIZE));
        }
        return arr;
    }

    public void pPoolSizes(@nullable VkDescriptorPoolSize value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPoolSizesRaw(s);
    }

    public static VkDescriptorPoolCreateInfo allocate(Arena arena) {
        return new VkDescriptorPoolCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkDescriptorPoolCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorPoolCreateInfo[] ret = new VkDescriptorPoolCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorPoolCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

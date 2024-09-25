package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSparseImageFormatProperties2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkSparseImageFormatProperties.LAYOUT.withName("properties")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$properties = PathElement.groupElement("properties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$properties = (StructLayout) LAYOUT.select(PATH$properties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$properties = LAYOUT.byteOffset(PATH$properties);

    public VkSparseImageFormatProperties2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2);
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

    public VkSparseImageFormatProperties properties() {
        return new VkSparseImageFormatProperties(segment.asSlice(OFFSET$properties, LAYOUT$properties));
    }

    public void properties(VkSparseImageFormatProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$properties, LAYOUT$properties.byteSize());
    }

    public static VkSparseImageFormatProperties2 allocate(Arena arena) {
        return new VkSparseImageFormatProperties2(arena.allocate(LAYOUT));
    }
    
    public static VkSparseImageFormatProperties2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageFormatProperties2[] ret = new VkSparseImageFormatProperties2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSparseImageFormatProperties2(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSparseImageMemoryBind(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkImageSubresource.LAYOUT.withName("subresource"),
        VkOffset3D.LAYOUT.withName("offset"),
        VkExtent3D.LAYOUT.withName("extent"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$subresource = PathElement.groupElement("subresource");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$extent = PathElement.groupElement("extent");
    public static final PathElement PATH$memory = PathElement.groupElement("memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("memoryOffset");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final StructLayout LAYOUT$subresource = (StructLayout) LAYOUT.select(PATH$subresource);
    public static final StructLayout LAYOUT$offset = (StructLayout) LAYOUT.select(PATH$offset);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);
    public static final AddressLayout LAYOUT$memory = (AddressLayout) LAYOUT.select(PATH$memory);
    public static final OfLong LAYOUT$memoryOffset = (OfLong) LAYOUT.select(PATH$memoryOffset);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$subresource = LAYOUT.byteOffset(PATH$subresource);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkSparseImageMemoryBind(MemorySegment segment) {
        this.segment = segment;
    }

    public VkImageSubresource subresource() {
        return new VkImageSubresource(segment.asSlice(OFFSET$subresource, LAYOUT$subresource));
    }

    public void subresource(VkImageSubresource value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subresource, LAYOUT$subresource.byteSize());
    }

    public VkOffset3D offset() {
        return new VkOffset3D(segment.asSlice(OFFSET$offset, LAYOUT$offset));
    }

    public void offset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$offset, LAYOUT$offset.byteSize());
    }

    public VkExtent3D extent() {
        return new VkExtent3D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, LAYOUT$extent.byteSize());
    }

    public VkDeviceMemory memory() {
        return new VkDeviceMemory(segment.asSlice(OFFSET$memory, LAYOUT$memory));
    }

    public void memory(VkDeviceMemory value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memory, LAYOUT$memory.byteSize());
    }

    public @unsigned long memoryOffset() {
        return segment.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);
    }

    public void memoryOffset(@unsigned long value) {
        segment.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);
    }

    public @enumtype(VkSparseMemoryBindFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSparseMemoryBindFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }


    public static final class VkSparseImageMemoryBindFactory implements IDataTypeFactory<VkSparseImageMemoryBind> {
        @Override
        public Class<VkSparseImageMemoryBind> clazz() {
            return VkSparseImageMemoryBind.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSparseImageMemoryBind.LAYOUT;
        }

        @Override
        public VkSparseImageMemoryBind create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSparseImageMemoryBind createUninit(MemorySegment segment) {
            return new VkSparseImageMemoryBind(segment);
        }
    }

    public static final VkSparseImageMemoryBindFactory FACTORY = new VkSparseImageMemoryBindFactory();
}

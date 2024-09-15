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

public record VkPipelineCacheCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        NativeLayout.C_SIZE_T.withName("initialDataSize"),
        ValueLayout.ADDRESS.withName("pInitialData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$initialDataSize = PathElement.groupElement(3);
    public static final PathElement PATH$pInitialData = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pInitialData = (AddressLayout) LAYOUT.select(PATH$pInitialData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$initialDataSize = LAYOUT.byteOffset(PATH$initialDataSize);
    public static final long OFFSET$pInitialData = LAYOUT.byteOffset(PATH$pInitialData);

    public VkPipelineCacheCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO);
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

    public @enumtype(VkPipelineCacheCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCacheCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public long initialDataSize() {
        return NativeLayout.readCLong(segment, OFFSET$initialDataSize);
    }

    public void initialDataSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$initialDataSize, value);
    }

    public @pointer(comment="void*") MemorySegment pInitialData() {
        return segment.get(LAYOUT$pInitialData, OFFSET$pInitialData);
    }

    public void pInitialData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pInitialData, OFFSET$pInitialData, value);
    }


    public static final class VkPipelineCacheCreateInfoFactory implements IDataTypeFactory<VkPipelineCacheCreateInfo> {
        @Override
        public Class<VkPipelineCacheCreateInfo> clazz() {
            return VkPipelineCacheCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineCacheCreateInfo.LAYOUT;
        }

        @Override
        public VkPipelineCacheCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineCacheCreateInfo createUninit(MemorySegment segment) {
            return new VkPipelineCacheCreateInfo(segment);
        }
    }

    public static final VkPipelineCacheCreateInfoFactory FACTORY = new VkPipelineCacheCreateInfoFactory();
}

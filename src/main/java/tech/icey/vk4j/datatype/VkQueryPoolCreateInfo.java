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

public record VkQueryPoolCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queryType"),
        ValueLayout.JAVA_INT.withName("queryCount"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$queryType = PathElement.groupElement(3);
    public static final PathElement PATH$queryCount = PathElement.groupElement(4);
    public static final PathElement PATH$pipelineStatistics = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$queryType = (OfInt) LAYOUT.select(PATH$queryType);
    public static final OfInt LAYOUT$queryCount = (OfInt) LAYOUT.select(PATH$queryCount);
    public static final OfInt LAYOUT$pipelineStatistics = (OfInt) LAYOUT.select(PATH$pipelineStatistics);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$queryType = LAYOUT.byteOffset(PATH$queryType);
    public static final long OFFSET$queryCount = LAYOUT.byteOffset(PATH$queryCount);
    public static final long OFFSET$pipelineStatistics = LAYOUT.byteOffset(PATH$pipelineStatistics);

    public VkQueryPoolCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO);
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

    public @enumtype(VkQueryPoolCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkQueryPoolCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkQueryType.class) int queryType() {
        return segment.get(LAYOUT$queryType, OFFSET$queryType);
    }

    public void queryType(@enumtype(VkQueryType.class) int value) {
        segment.set(LAYOUT$queryType, OFFSET$queryType, value);
    }

    public @unsigned int queryCount() {
        return segment.get(LAYOUT$queryCount, OFFSET$queryCount);
    }

    public void queryCount(@unsigned int value) {
        segment.set(LAYOUT$queryCount, OFFSET$queryCount, value);
    }

    public @enumtype(VkQueryPipelineStatisticFlags.class) int pipelineStatistics() {
        return segment.get(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics);
    }

    public void pipelineStatistics(@enumtype(VkQueryPipelineStatisticFlags.class) int value) {
        segment.set(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics, value);
    }


    public static final class VkQueryPoolCreateInfoFactory implements IDataTypeFactory<VkQueryPoolCreateInfo> {
        @Override
        public Class<VkQueryPoolCreateInfo> clazz() {
            return VkQueryPoolCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkQueryPoolCreateInfo.LAYOUT;
        }

        @Override
        public VkQueryPoolCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkQueryPoolCreateInfo createUninit(MemorySegment segment) {
            return new VkQueryPoolCreateInfo(segment);
        }
    }

    public static final VkQueryPoolCreateInfoFactory FACTORY = new VkQueryPoolCreateInfoFactory();
}
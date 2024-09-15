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

public record VkExportMetalCommandQueueInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("queue"),
        ValueLayout.ADDRESS.withName("mtlCommandQueue")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$queue = PathElement.groupElement(2);
    public static final PathElement PATH$mtlCommandQueue = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$queue = (AddressLayout) LAYOUT.select(PATH$queue);
    public static final AddressLayout LAYOUT$mtlCommandQueue = (AddressLayout) LAYOUT.select(PATH$mtlCommandQueue);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queue = LAYOUT.byteOffset(PATH$queue);
    public static final long OFFSET$mtlCommandQueue = LAYOUT.byteOffset(PATH$mtlCommandQueue);

    public VkExportMetalCommandQueueInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT);
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

    public VkQueue queue() {
        return new VkQueue(segment.asSlice(OFFSET$queue, LAYOUT$queue));
    }

    public void queue(VkQueue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$queue, LAYOUT$queue.byteSize());
    }

    public @pointer(comment="void*") MemorySegment mtlCommandQueue() {
        return segment.get(LAYOUT$mtlCommandQueue, OFFSET$mtlCommandQueue);
    }

    public void mtlCommandQueue(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlCommandQueue, OFFSET$mtlCommandQueue, value);
    }


    public static final class VkExportMetalCommandQueueInfoEXTFactory implements IDataTypeFactory<VkExportMetalCommandQueueInfoEXT> {
        @Override
        public Class<VkExportMetalCommandQueueInfoEXT> clazz() {
            return VkExportMetalCommandQueueInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExportMetalCommandQueueInfoEXT.LAYOUT;
        }

        @Override
        public VkExportMetalCommandQueueInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkExportMetalCommandQueueInfoEXT createUninit(MemorySegment segment) {
            return new VkExportMetalCommandQueueInfoEXT(segment);
        }
    }

    public static final VkExportMetalCommandQueueInfoEXTFactory FACTORY = new VkExportMetalCommandQueueInfoEXTFactory();
}

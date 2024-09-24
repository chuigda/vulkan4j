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
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkImportScreenBufferInfoQNX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("buffer")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);

    public VkImportScreenBufferInfoQNX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_SCREEN_BUFFER_INFO_QNX);
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

    public @pointer(comment="void*") MemorySegment buffer() {
        return segment.get(LAYOUT$buffer, OFFSET$buffer);
    }

    public void buffer(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value);
    }


    public static final class VkImportScreenBufferInfoQNXFactory implements IFactory<VkImportScreenBufferInfoQNX> {
        @Override
        public Class<VkImportScreenBufferInfoQNX> clazz() {
            return VkImportScreenBufferInfoQNX.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImportScreenBufferInfoQNX.LAYOUT;
        }

        @Override
        public VkImportScreenBufferInfoQNX create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImportScreenBufferInfoQNX createUninit(MemorySegment segment) {
            return new VkImportScreenBufferInfoQNX(segment);
        }
    }

    public static final VkImportScreenBufferInfoQNXFactory FACTORY = new VkImportScreenBufferInfoQNXFactory();
}

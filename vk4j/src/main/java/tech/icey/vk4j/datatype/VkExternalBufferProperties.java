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

public record VkExternalBufferProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExternalMemoryProperties.LAYOUT.withName("externalMemoryProperties")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$externalMemoryProperties = PathElement.groupElement("externalMemoryProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$externalMemoryProperties = (StructLayout) LAYOUT.select(PATH$externalMemoryProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$externalMemoryProperties = LAYOUT.byteOffset(PATH$externalMemoryProperties);

    public VkExternalBufferProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES);
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

    public VkExternalMemoryProperties externalMemoryProperties() {
        return new VkExternalMemoryProperties(segment.asSlice(OFFSET$externalMemoryProperties, LAYOUT$externalMemoryProperties));
    }

    public void externalMemoryProperties(VkExternalMemoryProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$externalMemoryProperties, LAYOUT$externalMemoryProperties.byteSize());
    }


    public static final class Factory implements IFactory<VkExternalBufferProperties> {
        @Override
        public Class<VkExternalBufferProperties> clazz() {
            return VkExternalBufferProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExternalBufferProperties.LAYOUT;
        }

        @Override
        public VkExternalBufferProperties create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkExternalBufferProperties createUninit(MemorySegment segment) {
            return new VkExternalBufferProperties(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

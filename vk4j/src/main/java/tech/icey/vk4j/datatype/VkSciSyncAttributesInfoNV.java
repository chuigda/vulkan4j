package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.enumtype.VkSciSyncClientTypeNV;
import tech.icey.vk4j.enumtype.VkSciSyncPrimitiveTypeNV;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_SCI_SYNC_ATTRIBUTES_INFO_NV;

public record VkSciSyncAttributesInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clientType"),
        ValueLayout.JAVA_INT.withName("primitiveType")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$clientType = PathElement.groupElement("clientType");
    public static final PathElement PATH$primitiveType = PathElement.groupElement("primitiveType");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$clientType = (OfInt) LAYOUT.select(PATH$clientType);
    public static final OfInt LAYOUT$primitiveType = (OfInt) LAYOUT.select(PATH$primitiveType);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$clientType = LAYOUT.byteOffset(PATH$clientType);
    public static final long OFFSET$primitiveType = LAYOUT.byteOffset(PATH$primitiveType);

    public VkSciSyncAttributesInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SCI_SYNC_ATTRIBUTES_INFO_NV);
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

    public @enumtype(VkSciSyncClientTypeNV.class) int clientType() {
        return segment.get(LAYOUT$clientType, OFFSET$clientType);
    }

    public void clientType(@enumtype(VkSciSyncClientTypeNV.class) int value) {
        segment.set(LAYOUT$clientType, OFFSET$clientType, value);
    }

    public @enumtype(VkSciSyncPrimitiveTypeNV.class) int primitiveType() {
        return segment.get(LAYOUT$primitiveType, OFFSET$primitiveType);
    }

    public void primitiveType(@enumtype(VkSciSyncPrimitiveTypeNV.class) int value) {
        segment.set(LAYOUT$primitiveType, OFFSET$primitiveType, value);
    }


    public static final class Factory implements IFactory<VkSciSyncAttributesInfoNV> {
        @Override
        public Class<VkSciSyncAttributesInfoNV> clazz() {
            return VkSciSyncAttributesInfoNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSciSyncAttributesInfoNV.LAYOUT;
        }

        @Override
        public VkSciSyncAttributesInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSciSyncAttributesInfoNV createUninit(MemorySegment segment) {
            return new VkSciSyncAttributesInfoNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

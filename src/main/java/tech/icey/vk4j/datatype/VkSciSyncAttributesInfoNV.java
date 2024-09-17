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


    public static final class VkSciSyncAttributesInfoNVFactory implements IFactory<VkSciSyncAttributesInfoNV> {
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

    public static final VkSciSyncAttributesInfoNVFactory FACTORY = new VkSciSyncAttributesInfoNVFactory();
}

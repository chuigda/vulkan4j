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

public record VkBaseInStructure(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withTargetLayout(VkBaseInStructure.LAYOUT).withName("pNext")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);

    public VkBaseInStructure(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="VkBaseInStructure*") MemorySegment pNextRaw() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNextRaw(@pointer(comment="VkBaseInStructure*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }
    
    public VkBaseInStructure pNext() {
        MemorySegment s = pNextRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBaseInStructure(s);
    }

    public void pNext(VkBaseInStructure value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNextRaw(s);
    }


    public static final class VkBaseInStructureFactory implements IDataTypeFactory<VkBaseInStructure> {
        @Override
        public Class<VkBaseInStructure> clazz() {
            return VkBaseInStructure.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBaseInStructure.LAYOUT;
        }

        @Override
        public VkBaseInStructure create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBaseInStructure createUninit(MemorySegment segment) {
            return new VkBaseInStructure(segment);
        }
    }

    public static final VkBaseInStructureFactory FACTORY = new VkBaseInStructureFactory();
}
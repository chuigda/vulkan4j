package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkBaseOutStructure(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);

    public VkBaseOutStructure(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="VkBaseOutStructure*") MemorySegment pNextRaw() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext).reinterpret(LAYOUT.byteSize());
    }

    public void pNextRaw(@pointer(comment="VkBaseOutStructure*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public @nullable VkBaseOutStructure pNext() {
        MemorySegment s = pNextRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBaseOutStructure(s);
    }

    public void pNext(@nullable VkBaseOutStructure value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNextRaw(s);
    }


    public static final class VkBaseOutStructureFactory implements IFactory<VkBaseOutStructure> {
        @Override
        public Class<VkBaseOutStructure> clazz() {
            return VkBaseOutStructure.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkBaseOutStructure.LAYOUT;
        }

        @Override
        public VkBaseOutStructure create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkBaseOutStructure createUninit(MemorySegment segment) {
            return new VkBaseOutStructure(segment);
        }
    }

    public static final VkBaseOutStructureFactory FACTORY = new VkBaseOutStructureFactory();
}

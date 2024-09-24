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

public record VkImageConstraintsInfoFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatConstraintsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageFormatConstraintsInfoFUCHSIA.LAYOUT).withName("pFormatConstraints"),
        VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$formatConstraintsCount = PathElement.groupElement("formatConstraintsCount");
    public static final PathElement PATH$pFormatConstraints = PathElement.groupElement("pFormatConstraints");
    public static final PathElement PATH$bufferCollectionConstraints = PathElement.groupElement("bufferCollectionConstraints");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$formatConstraintsCount = (OfInt) LAYOUT.select(PATH$formatConstraintsCount);
    public static final AddressLayout LAYOUT$pFormatConstraints = (AddressLayout) LAYOUT.select(PATH$pFormatConstraints);
    public static final StructLayout LAYOUT$bufferCollectionConstraints = (StructLayout) LAYOUT.select(PATH$bufferCollectionConstraints);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$formatConstraintsCount = LAYOUT.byteOffset(PATH$formatConstraintsCount);
    public static final long OFFSET$pFormatConstraints = LAYOUT.byteOffset(PATH$pFormatConstraints);
    public static final long OFFSET$bufferCollectionConstraints = LAYOUT.byteOffset(PATH$bufferCollectionConstraints);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkImageConstraintsInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_CONSTRAINTS_INFO_FUCHSIA);
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

    public @unsigned int formatConstraintsCount() {
        return segment.get(LAYOUT$formatConstraintsCount, OFFSET$formatConstraintsCount);
    }

    public void formatConstraintsCount(@unsigned int value) {
        segment.set(LAYOUT$formatConstraintsCount, OFFSET$formatConstraintsCount, value);
    }

    public @pointer(comment="VkImageFormatConstraintsInfoFUCHSIA*") MemorySegment pFormatConstraintsRaw() {
        return segment.get(LAYOUT$pFormatConstraints, OFFSET$pFormatConstraints);
    }

    public void pFormatConstraintsRaw(@pointer(comment="VkImageFormatConstraintsInfoFUCHSIA*") MemorySegment value) {
        segment.set(LAYOUT$pFormatConstraints, OFFSET$pFormatConstraints, value);
    }
    
    public @nullable VkImageFormatConstraintsInfoFUCHSIA pFormatConstraints() {
        MemorySegment s = pFormatConstraintsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageFormatConstraintsInfoFUCHSIA(s);
    }

    public void pFormatConstraints(@nullable VkImageFormatConstraintsInfoFUCHSIA value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFormatConstraintsRaw(s);
    }

    public VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints() {
        return new VkBufferCollectionConstraintsInfoFUCHSIA(segment.asSlice(OFFSET$bufferCollectionConstraints, LAYOUT$bufferCollectionConstraints));
    }

    public void bufferCollectionConstraints(VkBufferCollectionConstraintsInfoFUCHSIA value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$bufferCollectionConstraints, LAYOUT$bufferCollectionConstraints.byteSize());
    }

    public @enumtype(VkImageConstraintsInfoFlagsFUCHSIA.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageConstraintsInfoFlagsFUCHSIA.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }


    public static final class Factory implements IFactory<VkImageConstraintsInfoFUCHSIA> {
        @Override
        public Class<VkImageConstraintsInfoFUCHSIA> clazz() {
            return VkImageConstraintsInfoFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageConstraintsInfoFUCHSIA.LAYOUT;
        }

        @Override
        public VkImageConstraintsInfoFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImageConstraintsInfoFUCHSIA createUninit(MemorySegment segment) {
            return new VkImageConstraintsInfoFUCHSIA(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

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

public record VkBufferConstraintsInfoFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkBufferCreateInfo.LAYOUT.withName("createInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$createInfo = PathElement.groupElement(2);
    public static final PathElement PATH$requiredFormatFeatures = PathElement.groupElement(3);
    public static final PathElement PATH$bufferCollectionConstraints = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$createInfo = (StructLayout) LAYOUT.select(PATH$createInfo);
    public static final OfInt LAYOUT$requiredFormatFeatures = (OfInt) LAYOUT.select(PATH$requiredFormatFeatures);
    public static final StructLayout LAYOUT$bufferCollectionConstraints = (StructLayout) LAYOUT.select(PATH$bufferCollectionConstraints);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$createInfo = LAYOUT.byteOffset(PATH$createInfo);
    public static final long OFFSET$requiredFormatFeatures = LAYOUT.byteOffset(PATH$requiredFormatFeatures);
    public static final long OFFSET$bufferCollectionConstraints = LAYOUT.byteOffset(PATH$bufferCollectionConstraints);

    public VkBufferConstraintsInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BUFFER_CONSTRAINTS_INFO_FUCHSIA);
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

    public VkBufferCreateInfo createInfo() {
        return new VkBufferCreateInfo(segment.asSlice(OFFSET$createInfo, LAYOUT$createInfo));
    }

    public void createInfo(VkBufferCreateInfo value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$createInfo, LAYOUT$createInfo.byteSize());
    }

    public @enumtype(VkFormatFeatureFlags.class) int requiredFormatFeatures() {
        return segment.get(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures);
    }

    public void requiredFormatFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures, value);
    }

    public VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints() {
        return new VkBufferCollectionConstraintsInfoFUCHSIA(segment.asSlice(OFFSET$bufferCollectionConstraints, LAYOUT$bufferCollectionConstraints));
    }

    public void bufferCollectionConstraints(VkBufferCollectionConstraintsInfoFUCHSIA value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$bufferCollectionConstraints, LAYOUT$bufferCollectionConstraints.byteSize());
    }


    public static final class VkBufferConstraintsInfoFUCHSIAFactory implements IDataTypeFactory<VkBufferConstraintsInfoFUCHSIA> {
        @Override
        public Class<VkBufferConstraintsInfoFUCHSIA> clazz() {
            return VkBufferConstraintsInfoFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBufferConstraintsInfoFUCHSIA.LAYOUT;
        }

        @Override
        public VkBufferConstraintsInfoFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBufferConstraintsInfoFUCHSIA createUninit(MemorySegment segment) {
            return new VkBufferConstraintsInfoFUCHSIA(segment);
        }
    }

    public static final VkBufferConstraintsInfoFUCHSIAFactory FACTORY = new VkBufferConstraintsInfoFUCHSIAFactory();
}
package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkOpticalFlowSessionCreatePrivateDataInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pPrivateData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$id = PathElement.groupElement("id");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$pPrivateData = PathElement.groupElement("pPrivateData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$id = (OfInt) LAYOUT.select(PATH$id);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);
    public static final AddressLayout LAYOUT$pPrivateData = (AddressLayout) LAYOUT.select(PATH$pPrivateData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$id = LAYOUT.byteOffset(PATH$id);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pPrivateData = LAYOUT.byteOffset(PATH$pPrivateData);

    public VkOpticalFlowSessionCreatePrivateDataInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV);
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

    public @unsigned int id() {
        return segment.get(LAYOUT$id, OFFSET$id);
    }

    public void id(@unsigned int value) {
        segment.set(LAYOUT$id, OFFSET$id, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @pointer(comment="void*") MemorySegment pPrivateData() {
        return segment.get(LAYOUT$pPrivateData, OFFSET$pPrivateData);
    }

    public void pPrivateData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pPrivateData, OFFSET$pPrivateData, value);
    }


    public static final class Factory implements IFactory<VkOpticalFlowSessionCreatePrivateDataInfoNV> {
        @Override
        public Class<VkOpticalFlowSessionCreatePrivateDataInfoNV> clazz() {
            return VkOpticalFlowSessionCreatePrivateDataInfoNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkOpticalFlowSessionCreatePrivateDataInfoNV.LAYOUT;
        }

        @Override
        public VkOpticalFlowSessionCreatePrivateDataInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkOpticalFlowSessionCreatePrivateDataInfoNV createUninit(MemorySegment segment) {
            return new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

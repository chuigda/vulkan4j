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

public record VkImageBlit2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        MemoryLayout.sequenceLayout(2, VkOffset3D.LAYOUT).withName("srcOffsets"),
        VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        MemoryLayout.sequenceLayout(2, VkOffset3D.LAYOUT).withName("dstOffsets")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$srcSubresource = PathElement.groupElement("srcSubresource");
    public static final PathElement PATH$srcOffsets = PathElement.groupElement("srcOffsets");
    public static final PathElement PATH$dstSubresource = PathElement.groupElement("dstSubresource");
    public static final PathElement PATH$dstOffsets = PathElement.groupElement("dstOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$srcSubresource = (StructLayout) LAYOUT.select(PATH$srcSubresource);
    public static final SequenceLayout LAYOUT$srcOffsets = (SequenceLayout) LAYOUT.select(PATH$srcOffsets);
    public static final StructLayout LAYOUT$dstSubresource = (StructLayout) LAYOUT.select(PATH$dstSubresource);
    public static final SequenceLayout LAYOUT$dstOffsets = (SequenceLayout) LAYOUT.select(PATH$dstOffsets);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSubresource = LAYOUT.byteOffset(PATH$srcSubresource);
    public static final long OFFSET$srcOffsets = LAYOUT.byteOffset(PATH$srcOffsets);
    public static final long OFFSET$dstSubresource = LAYOUT.byteOffset(PATH$dstSubresource);
    public static final long OFFSET$dstOffsets = LAYOUT.byteOffset(PATH$dstOffsets);

    public VkImageBlit2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_BLIT_2);
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

    public VkImageSubresourceLayers srcSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));
    }

    public void srcSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcSubresource, LAYOUT$srcSubresource.byteSize());
    }

    public MemorySegment srcOffsetsRaw() {
        return segment.asSlice(OFFSET$srcOffsets, LAYOUT$srcOffsets.byteSize());
    }

    public VkOffset3D[] srcOffsets() {
        MemorySegment s = srcOffsetsRaw();
        VkOffset3D[] arr = new VkOffset3D[(int)LAYOUT$srcOffsets.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new VkOffset3D(s.asSlice(i * LAYOUT$srcOffsets.byteSize(), LAYOUT$srcOffsets.byteSize()));
        }
        return arr;
    }

    public void srcOffsets(VkOffset3D[] value) {
        MemorySegment s = srcOffsetsRaw();
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * LAYOUT$srcOffsets.byteSize(), LAYOUT$srcOffsets.byteSize());
        }
    }

    public VkOffset3D srcOffsetsAt(long index) {
        MemorySegment s = srcOffsetsRaw();
        return new VkOffset3D(s.asSlice(index * LAYOUT$srcOffsets.byteSize(), LAYOUT$srcOffsets.byteSize()));
    }

    public void srcOffsetsAt(long index, VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, srcOffsetsRaw(), index * LAYOUT$srcOffsets.byteSize(), LAYOUT$srcOffsets.byteSize());
    }

    public VkImageSubresourceLayers dstSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));
    }

    public void dstSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstSubresource, LAYOUT$dstSubresource.byteSize());
    }

    public MemorySegment dstOffsetsRaw() {
        return segment.asSlice(OFFSET$dstOffsets, LAYOUT$dstOffsets.byteSize());
    }

    public VkOffset3D[] dstOffsets() {
        MemorySegment s = dstOffsetsRaw();
        VkOffset3D[] arr = new VkOffset3D[(int)LAYOUT$dstOffsets.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new VkOffset3D(s.asSlice(i * LAYOUT$dstOffsets.byteSize(), LAYOUT$dstOffsets.byteSize()));
        }
        return arr;
    }

    public void dstOffsets(VkOffset3D[] value) {
        MemorySegment s = dstOffsetsRaw();
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * LAYOUT$dstOffsets.byteSize(), LAYOUT$dstOffsets.byteSize());
        }
    }

    public VkOffset3D dstOffsetsAt(long index) {
        MemorySegment s = dstOffsetsRaw();
        return new VkOffset3D(s.asSlice(index * LAYOUT$dstOffsets.byteSize(), LAYOUT$dstOffsets.byteSize()));
    }

    public void dstOffsetsAt(long index, VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, dstOffsetsRaw(), index * LAYOUT$dstOffsets.byteSize(), LAYOUT$dstOffsets.byteSize());
    }


    public static final class VkImageBlit2Factory implements IFactory<VkImageBlit2> {
        @Override
        public Class<VkImageBlit2> clazz() {
            return VkImageBlit2.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageBlit2.LAYOUT;
        }

        @Override
        public VkImageBlit2 create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImageBlit2 createUninit(MemorySegment segment) {
            return new VkImageBlit2(segment);
        }
    }

    public static final VkImageBlit2Factory FACTORY = new VkImageBlit2Factory();
}

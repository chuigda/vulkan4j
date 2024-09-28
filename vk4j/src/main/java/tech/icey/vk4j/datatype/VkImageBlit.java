package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageBlit.html">VkImageBlit</a>
public record VkImageBlit(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        MemoryLayout.sequenceLayout(2, VkOffset3D.LAYOUT).withName("srcOffsets"),
        VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        MemoryLayout.sequenceLayout(2, VkOffset3D.LAYOUT).withName("dstOffsets")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$srcSubresource = PathElement.groupElement("srcSubresource");
    public static final PathElement PATH$srcOffsets = PathElement.groupElement("srcOffsets");
    public static final PathElement PATH$dstSubresource = PathElement.groupElement("dstSubresource");
    public static final PathElement PATH$dstOffsets = PathElement.groupElement("dstOffsets");

    public static final StructLayout LAYOUT$srcSubresource = (StructLayout) LAYOUT.select(PATH$srcSubresource);
    public static final SequenceLayout LAYOUT$srcOffsets = (SequenceLayout) LAYOUT.select(PATH$srcOffsets);
    public static final StructLayout LAYOUT$dstSubresource = (StructLayout) LAYOUT.select(PATH$dstSubresource);
    public static final SequenceLayout LAYOUT$dstOffsets = (SequenceLayout) LAYOUT.select(PATH$dstOffsets);

    public static final long OFFSET$srcSubresource = LAYOUT.byteOffset(PATH$srcSubresource);
    public static final long OFFSET$srcOffsets = LAYOUT.byteOffset(PATH$srcOffsets);
    public static final long OFFSET$dstSubresource = LAYOUT.byteOffset(PATH$dstSubresource);
    public static final long OFFSET$dstOffsets = LAYOUT.byteOffset(PATH$dstOffsets);

    public static final long SIZE$srcSubresource = LAYOUT$srcSubresource.byteSize();
    public static final long SIZE$srcOffsets = LAYOUT$srcOffsets.byteSize();
    public static final long SIZE$dstSubresource = LAYOUT$dstSubresource.byteSize();
    public static final long SIZE$dstOffsets = LAYOUT$dstOffsets.byteSize();

    public VkImageBlit(MemorySegment segment) {
        this.segment = segment;
    }

    public VkImageSubresourceLayers srcSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));
    }

    public void srcSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcSubresource, SIZE$srcSubresource);
    }

    public MemorySegment srcOffsetsRaw() {
        return segment.asSlice(OFFSET$srcOffsets, SIZE$srcOffsets);
    }

    public VkOffset3D[] srcOffsets() {
        MemorySegment s = srcOffsetsRaw();
        VkOffset3D[] arr = new VkOffset3D[(int)LAYOUT$srcOffsets.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new VkOffset3D(s.asSlice(i * VkOffset3D.SIZE, VkOffset3D.SIZE));
        }
        return arr;
    }

    public void srcOffsets(VkOffset3D[] value) {
        MemorySegment s = srcOffsetsRaw();
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * VkOffset3D.SIZE, VkOffset3D.SIZE);
        }
    }

    public VkOffset3D srcOffsetsAt(long index) {
        MemorySegment s = srcOffsetsRaw();
        return new VkOffset3D(s.asSlice(index * VkOffset3D.SIZE, VkOffset3D.SIZE));
    }

    public void srcOffsetsAt(long index, VkOffset3D value) {
        MemorySegment s = srcOffsetsRaw();
        MemorySegment.copy(value.segment(), 0, s, index * VkOffset3D.SIZE, VkOffset3D.SIZE);
    }

    public VkImageSubresourceLayers dstSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));
    }

    public void dstSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstSubresource, SIZE$dstSubresource);
    }

    public MemorySegment dstOffsetsRaw() {
        return segment.asSlice(OFFSET$dstOffsets, SIZE$dstOffsets);
    }

    public VkOffset3D[] dstOffsets() {
        MemorySegment s = dstOffsetsRaw();
        VkOffset3D[] arr = new VkOffset3D[(int)LAYOUT$dstOffsets.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new VkOffset3D(s.asSlice(i * VkOffset3D.SIZE, VkOffset3D.SIZE));
        }
        return arr;
    }

    public void dstOffsets(VkOffset3D[] value) {
        MemorySegment s = dstOffsetsRaw();
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * VkOffset3D.SIZE, VkOffset3D.SIZE);
        }
    }

    public VkOffset3D dstOffsetsAt(long index) {
        MemorySegment s = dstOffsetsRaw();
        return new VkOffset3D(s.asSlice(index * VkOffset3D.SIZE, VkOffset3D.SIZE));
    }

    public void dstOffsetsAt(long index, VkOffset3D value) {
        MemorySegment s = dstOffsetsRaw();
        MemorySegment.copy(value.segment(), 0, s, index * VkOffset3D.SIZE, VkOffset3D.SIZE);
    }

    public static VkImageBlit allocate(Arena arena) {
        return new VkImageBlit(arena.allocate(LAYOUT));
    }
    
    public static VkImageBlit[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageBlit[] ret = new VkImageBlit[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageBlit(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

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

/// {@snippet lang=c :
/// typedef struct VkComputePipelineIndirectBufferInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceAddress deviceAddress;
///     VkDeviceSize size;
///     VkDeviceAddress pipelineDeviceAddressCaptureReplay;
/// } VkComputePipelineIndirectBufferInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkComputePipelineIndirectBufferInfoNV.html">VkComputePipelineIndirectBufferInfoNV</a>
public record VkComputePipelineIndirectBufferInfoNV(MemorySegment segment) implements IPointer {
    public VkComputePipelineIndirectBufferInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned long deviceAddress() {
        return segment.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);
    }

    public void deviceAddress(@unsigned long value) {
        segment.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @unsigned long pipelineDeviceAddressCaptureReplay() {
        return segment.get(LAYOUT$pipelineDeviceAddressCaptureReplay, OFFSET$pipelineDeviceAddressCaptureReplay);
    }

    public void pipelineDeviceAddressCaptureReplay(@unsigned long value) {
        segment.set(LAYOUT$pipelineDeviceAddressCaptureReplay, OFFSET$pipelineDeviceAddressCaptureReplay, value);
    }

    public static VkComputePipelineIndirectBufferInfoNV allocate(Arena arena) {
        return new VkComputePipelineIndirectBufferInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkComputePipelineIndirectBufferInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkComputePipelineIndirectBufferInfoNV[] ret = new VkComputePipelineIndirectBufferInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkComputePipelineIndirectBufferInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("pipelineDeviceAddressCaptureReplay")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceAddress = PathElement.groupElement("deviceAddress");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$pipelineDeviceAddressCaptureReplay = PathElement.groupElement("pipelineDeviceAddressCaptureReplay");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$pipelineDeviceAddressCaptureReplay = (OfLong) LAYOUT.select(PATH$pipelineDeviceAddressCaptureReplay);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pipelineDeviceAddressCaptureReplay = LAYOUT.byteOffset(PATH$pipelineDeviceAddressCaptureReplay);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceAddress = LAYOUT$deviceAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$pipelineDeviceAddressCaptureReplay = LAYOUT$pipelineDeviceAddressCaptureReplay.byteSize();
}

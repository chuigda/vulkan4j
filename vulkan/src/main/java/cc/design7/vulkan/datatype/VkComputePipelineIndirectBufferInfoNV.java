package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code VkComputePipelineIndirectBufferInfoNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkComputePipelineIndirectBufferInfoNV.html">VkComputePipelineIndirectBufferInfoNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkComputePipelineIndirectBufferInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public VkComputePipelineIndirectBufferInfoNV {
        sType(VkStructureType.COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV);
    }

    public static VkComputePipelineIndirectBufferInfoNV allocate(Arena arena) {
        return new VkComputePipelineIndirectBufferInfoNV(arena.allocate(LAYOUT));
    }

    public static VkComputePipelineIndirectBufferInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkComputePipelineIndirectBufferInfoNV[] ret = new VkComputePipelineIndirectBufferInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkComputePipelineIndirectBufferInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkComputePipelineIndirectBufferInfoNV clone(Arena arena, VkComputePipelineIndirectBufferInfoNV src) {
        VkComputePipelineIndirectBufferInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkComputePipelineIndirectBufferInfoNV[] clone(Arena arena, VkComputePipelineIndirectBufferInfoNV[] src) {
        VkComputePipelineIndirectBufferInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("pipelineDeviceAddressCaptureReplay")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$deviceAddress = PathElement.groupElement("PATH$deviceAddress");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$pipelineDeviceAddressCaptureReplay = PathElement.groupElement("PATH$pipelineDeviceAddressCaptureReplay");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$pipelineDeviceAddressCaptureReplay = (OfLong) LAYOUT.select(PATH$pipelineDeviceAddressCaptureReplay);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceAddress = LAYOUT$deviceAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$pipelineDeviceAddressCaptureReplay = LAYOUT$pipelineDeviceAddressCaptureReplay.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pipelineDeviceAddressCaptureReplay = LAYOUT.byteOffset(PATH$pipelineDeviceAddressCaptureReplay);

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

}

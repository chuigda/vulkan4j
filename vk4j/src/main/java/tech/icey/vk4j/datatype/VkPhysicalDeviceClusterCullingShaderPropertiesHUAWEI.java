package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxWorkGroupCount[3];
///     uint32_t maxWorkGroupSize[3];
///     uint32_t maxOutputClusterCount;
///     VkDeviceSize indirectBufferOffsetAlignment;
/// } VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.html">VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI</a>
public record VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI);
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

    public MemorySegment maxWorkGroupCountRaw() {
        return segment.asSlice(OFFSET$maxWorkGroupCount, SIZE$maxWorkGroupCount);
    }

    public @unsigned IntBuffer maxWorkGroupCount() {
        return new IntBuffer(maxWorkGroupCountRaw());
    }

    public void maxWorkGroupCount(@unsigned IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxWorkGroupCount, SIZE$maxWorkGroupCount);
    }

    public MemorySegment maxWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxWorkGroupSize, SIZE$maxWorkGroupSize);
    }

    public @unsigned IntBuffer maxWorkGroupSize() {
        return new IntBuffer(maxWorkGroupSizeRaw());
    }

    public void maxWorkGroupSize(@unsigned IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxWorkGroupSize, SIZE$maxWorkGroupSize);
    }

    public @unsigned int maxOutputClusterCount() {
        return segment.get(LAYOUT$maxOutputClusterCount, OFFSET$maxOutputClusterCount);
    }

    public void maxOutputClusterCount(@unsigned int value) {
        segment.set(LAYOUT$maxOutputClusterCount, OFFSET$maxOutputClusterCount, value);
    }

    public @unsigned long indirectBufferOffsetAlignment() {
        return segment.get(LAYOUT$indirectBufferOffsetAlignment, OFFSET$indirectBufferOffsetAlignment);
    }

    public void indirectBufferOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$indirectBufferOffsetAlignment, OFFSET$indirectBufferOffsetAlignment, value);
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI allocate(Arena arena) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] ret = new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI clone(Arena arena, VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI src) {
        VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] clone(Arena arena, VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] src) {
        VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxWorkGroupCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxOutputClusterCount"),
        ValueLayout.JAVA_LONG.withName("indirectBufferOffsetAlignment")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxWorkGroupCount = PathElement.groupElement("maxWorkGroupCount");
    public static final PathElement PATH$maxWorkGroupSize = PathElement.groupElement("maxWorkGroupSize");
    public static final PathElement PATH$maxOutputClusterCount = PathElement.groupElement("maxOutputClusterCount");
    public static final PathElement PATH$indirectBufferOffsetAlignment = PathElement.groupElement("indirectBufferOffsetAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$maxWorkGroupCount = (SequenceLayout) LAYOUT.select(PATH$maxWorkGroupCount);
    public static final SequenceLayout LAYOUT$maxWorkGroupSize = (SequenceLayout) LAYOUT.select(PATH$maxWorkGroupSize);
    public static final OfInt LAYOUT$maxOutputClusterCount = (OfInt) LAYOUT.select(PATH$maxOutputClusterCount);
    public static final OfLong LAYOUT$indirectBufferOffsetAlignment = (OfLong) LAYOUT.select(PATH$indirectBufferOffsetAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxWorkGroupCount = LAYOUT.byteOffset(PATH$maxWorkGroupCount);
    public static final long OFFSET$maxWorkGroupSize = LAYOUT.byteOffset(PATH$maxWorkGroupSize);
    public static final long OFFSET$maxOutputClusterCount = LAYOUT.byteOffset(PATH$maxOutputClusterCount);
    public static final long OFFSET$indirectBufferOffsetAlignment = LAYOUT.byteOffset(PATH$indirectBufferOffsetAlignment);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxWorkGroupCount = LAYOUT$maxWorkGroupCount.byteSize();
    public static final long SIZE$maxWorkGroupSize = LAYOUT$maxWorkGroupSize.byteSize();
    public static final long SIZE$maxOutputClusterCount = LAYOUT$maxOutputClusterCount.byteSize();
    public static final long SIZE$indirectBufferOffsetAlignment = LAYOUT$indirectBufferOffsetAlignment.byteSize();
}

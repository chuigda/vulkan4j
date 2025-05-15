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

public record VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxWorkGroupCount = ValueLayout.JAVA_INT.withName("maxWorkGroupCount");
    public static final OfInt LAYOUT$maxWorkGroupSize = ValueLayout.JAVA_INT.withName("maxWorkGroupSize");
    public static final OfInt LAYOUT$maxOutputClusterCount = ValueLayout.JAVA_INT.withName("maxOutputClusterCount");
    public static final OfLong LAYOUT$indirectBufferOffsetAlignment = ValueLayout.JAVA_LONG.withName("indirectBufferOffsetAlignment");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxWorkGroupCount, LAYOUT$maxWorkGroupSize, LAYOUT$maxOutputClusterCount, LAYOUT$indirectBufferOffsetAlignment);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI allocate(Arena arena) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] ret = new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxWorkGroupCount = PathElement.groupElement("PATH$maxWorkGroupCount");
    public static final PathElement PATH$maxWorkGroupSize = PathElement.groupElement("PATH$maxWorkGroupSize");
    public static final PathElement PATH$maxOutputClusterCount = PathElement.groupElement("PATH$maxOutputClusterCount");
    public static final PathElement PATH$indirectBufferOffsetAlignment = PathElement.groupElement("PATH$indirectBufferOffsetAlignment");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxWorkGroupCount = LAYOUT$maxWorkGroupCount.byteSize();
    public static final long SIZE$maxWorkGroupSize = LAYOUT$maxWorkGroupSize.byteSize();
    public static final long SIZE$maxOutputClusterCount = LAYOUT$maxOutputClusterCount.byteSize();
    public static final long SIZE$indirectBufferOffsetAlignment = LAYOUT$indirectBufferOffsetAlignment.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxWorkGroupCount = LAYOUT.byteOffset(PATH$maxWorkGroupCount);
    public static final long OFFSET$maxWorkGroupSize = LAYOUT.byteOffset(PATH$maxWorkGroupSize);
    public static final long OFFSET$maxOutputClusterCount = LAYOUT.byteOffset(PATH$maxOutputClusterCount);
    public static final long OFFSET$indirectBufferOffsetAlignment = LAYOUT.byteOffset(PATH$indirectBufferOffsetAlignment);

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

    public @unsigned int maxWorkGroupCount() {
        return segment.get(LAYOUT$maxWorkGroupCount, OFFSET$maxWorkGroupCount);
    }

    public void maxWorkGroupCount(@unsigned int value) {
        segment.set(LAYOUT$maxWorkGroupCount, OFFSET$maxWorkGroupCount, value);
    }

    public @unsigned int maxWorkGroupSize() {
        return segment.get(LAYOUT$maxWorkGroupSize, OFFSET$maxWorkGroupSize);
    }

    public void maxWorkGroupSize(@unsigned int value) {
        segment.set(LAYOUT$maxWorkGroupSize, OFFSET$maxWorkGroupSize, value);
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

}
/// dummy, not implemented yet

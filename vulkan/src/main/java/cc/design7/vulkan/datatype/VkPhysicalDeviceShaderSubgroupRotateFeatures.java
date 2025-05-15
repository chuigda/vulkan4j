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

public record VkPhysicalDeviceShaderSubgroupRotateFeatures(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$shaderSubgroupRotate = ValueLayout.JAVA_INT.withName("shaderSubgroupRotate");
    public static final OfInt LAYOUT$shaderSubgroupRotateClustered = ValueLayout.JAVA_INT.withName("shaderSubgroupRotateClustered");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$shaderSubgroupRotate, LAYOUT$shaderSubgroupRotateClustered);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderSubgroupRotateFeatures[] ret = new VkPhysicalDeviceShaderSubgroupRotateFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderSubgroupRotateFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures clone(Arena arena, VkPhysicalDeviceShaderSubgroupRotateFeatures src) {
        VkPhysicalDeviceShaderSubgroupRotateFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures[] clone(Arena arena, VkPhysicalDeviceShaderSubgroupRotateFeatures[] src) {
        VkPhysicalDeviceShaderSubgroupRotateFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderSubgroupRotate = PathElement.groupElement("PATH$shaderSubgroupRotate");
    public static final PathElement PATH$shaderSubgroupRotateClustered = PathElement.groupElement("PATH$shaderSubgroupRotateClustered");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderSubgroupRotate = LAYOUT$shaderSubgroupRotate.byteSize();
    public static final long SIZE$shaderSubgroupRotateClustered = LAYOUT$shaderSubgroupRotateClustered.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderSubgroupRotate = LAYOUT.byteOffset(PATH$shaderSubgroupRotate);
    public static final long OFFSET$shaderSubgroupRotateClustered = LAYOUT.byteOffset(PATH$shaderSubgroupRotateClustered);

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

    public @unsigned int shaderSubgroupRotate() {
        return segment.get(LAYOUT$shaderSubgroupRotate, OFFSET$shaderSubgroupRotate);
    }

    public void shaderSubgroupRotate(@unsigned int value) {
        segment.set(LAYOUT$shaderSubgroupRotate, OFFSET$shaderSubgroupRotate, value);
    }

    public @unsigned int shaderSubgroupRotateClustered() {
        return segment.get(LAYOUT$shaderSubgroupRotateClustered, OFFSET$shaderSubgroupRotateClustered);
    }

    public void shaderSubgroupRotateClustered(@unsigned int value) {
        segment.set(LAYOUT$shaderSubgroupRotateClustered, OFFSET$shaderSubgroupRotateClustered, value);
    }

}
/// dummy, not implemented yet

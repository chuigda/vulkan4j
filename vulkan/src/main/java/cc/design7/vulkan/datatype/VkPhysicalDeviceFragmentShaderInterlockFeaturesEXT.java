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

public record VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$fragmentShaderSampleInterlock = ValueLayout.JAVA_INT.withName("fragmentShaderSampleInterlock");
    public static final OfInt LAYOUT$fragmentShaderPixelInterlock = ValueLayout.JAVA_INT.withName("fragmentShaderPixelInterlock");
    public static final OfInt LAYOUT$fragmentShaderShadingRateInterlock = ValueLayout.JAVA_INT.withName("fragmentShaderShadingRateInterlock");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$fragmentShaderSampleInterlock, LAYOUT$fragmentShaderPixelInterlock, LAYOUT$fragmentShaderShadingRateInterlock);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] ret = new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT clone(Arena arena, VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT src) {
        VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] src) {
        VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fragmentShaderSampleInterlock = PathElement.groupElement("PATH$fragmentShaderSampleInterlock");
    public static final PathElement PATH$fragmentShaderPixelInterlock = PathElement.groupElement("PATH$fragmentShaderPixelInterlock");
    public static final PathElement PATH$fragmentShaderShadingRateInterlock = PathElement.groupElement("PATH$fragmentShaderShadingRateInterlock");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentShaderSampleInterlock = LAYOUT$fragmentShaderSampleInterlock.byteSize();
    public static final long SIZE$fragmentShaderPixelInterlock = LAYOUT$fragmentShaderPixelInterlock.byteSize();
    public static final long SIZE$fragmentShaderShadingRateInterlock = LAYOUT$fragmentShaderShadingRateInterlock.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentShaderSampleInterlock = LAYOUT.byteOffset(PATH$fragmentShaderSampleInterlock);
    public static final long OFFSET$fragmentShaderPixelInterlock = LAYOUT.byteOffset(PATH$fragmentShaderPixelInterlock);
    public static final long OFFSET$fragmentShaderShadingRateInterlock = LAYOUT.byteOffset(PATH$fragmentShaderShadingRateInterlock);

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

    public @unsigned int fragmentShaderSampleInterlock() {
        return segment.get(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock);
    }

    public void fragmentShaderSampleInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock, value);
    }

    public @unsigned int fragmentShaderPixelInterlock() {
        return segment.get(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock);
    }

    public void fragmentShaderPixelInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock, value);
    }

    public @unsigned int fragmentShaderShadingRateInterlock() {
        return segment.get(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock);
    }

    public void fragmentShaderShadingRateInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock, value);
    }

}
/// dummy, not implemented yet

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

public record VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$videoEncodeQuantizationMap = ValueLayout.JAVA_INT.withName("videoEncodeQuantizationMap");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$videoEncodeQuantizationMap);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR[] ret = new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR clone(Arena arena, VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR src) {
        VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR[] src) {
        VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$videoEncodeQuantizationMap = PathElement.groupElement("PATH$videoEncodeQuantizationMap");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$videoEncodeQuantizationMap = LAYOUT$videoEncodeQuantizationMap.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$videoEncodeQuantizationMap = LAYOUT.byteOffset(PATH$videoEncodeQuantizationMap);

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

    public @unsigned int videoEncodeQuantizationMap() {
        return segment.get(LAYOUT$videoEncodeQuantizationMap, OFFSET$videoEncodeQuantizationMap);
    }

    public void videoEncodeQuantizationMap(@unsigned int value) {
        segment.set(LAYOUT$videoEncodeQuantizationMap, OFFSET$videoEncodeQuantizationMap, value);
    }

}
/// dummy, not implemented yet

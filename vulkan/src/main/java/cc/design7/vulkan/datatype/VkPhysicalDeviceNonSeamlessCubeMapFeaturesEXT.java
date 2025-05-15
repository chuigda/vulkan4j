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

public record VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$nonSeamlessCubeMap = ValueLayout.JAVA_INT.withName("nonSeamlessCubeMap");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$nonSeamlessCubeMap);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT[] ret = new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT clone(Arena arena, VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT src) {
        VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT[] src) {
        VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$nonSeamlessCubeMap = PathElement.groupElement("PATH$nonSeamlessCubeMap");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$nonSeamlessCubeMap = LAYOUT$nonSeamlessCubeMap.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$nonSeamlessCubeMap = LAYOUT.byteOffset(PATH$nonSeamlessCubeMap);

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

    public @unsigned int nonSeamlessCubeMap() {
        return segment.get(LAYOUT$nonSeamlessCubeMap, OFFSET$nonSeamlessCubeMap);
    }

    public void nonSeamlessCubeMap(@unsigned int value) {
        segment.set(LAYOUT$nonSeamlessCubeMap, OFFSET$nonSeamlessCubeMap, value);
    }

}
/// dummy, not implemented yet

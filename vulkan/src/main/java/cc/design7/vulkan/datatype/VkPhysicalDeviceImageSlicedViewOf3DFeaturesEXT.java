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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.html">VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$imageSlicedViewOf3D = ValueLayout.JAVA_INT.withName("imageSlicedViewOf3D");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$imageSlicedViewOf3D);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] ret = new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT clone(Arena arena, VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT src) {
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] src) {
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$imageSlicedViewOf3D = PathElement.groupElement("PATH$imageSlicedViewOf3D");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageSlicedViewOf3D = LAYOUT$imageSlicedViewOf3D.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageSlicedViewOf3D = LAYOUT.byteOffset(PATH$imageSlicedViewOf3D);

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

    public @unsigned int imageSlicedViewOf3D() {
        return segment.get(LAYOUT$imageSlicedViewOf3D, OFFSET$imageSlicedViewOf3D);
    }

    public void imageSlicedViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$imageSlicedViewOf3D, OFFSET$imageSlicedViewOf3D, value);
    }

}

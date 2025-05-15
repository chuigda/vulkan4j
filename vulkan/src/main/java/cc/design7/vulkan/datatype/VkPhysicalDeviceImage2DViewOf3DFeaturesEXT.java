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

public record VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$image2DViewOf3D = ValueLayout.JAVA_INT.withName("image2DViewOf3D");
    public static final OfInt LAYOUT$sampler2DViewOf3D = ValueLayout.JAVA_INT.withName("sampler2DViewOf3D");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$image2DViewOf3D, LAYOUT$sampler2DViewOf3D);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] ret = new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT clone(Arena arena, VkPhysicalDeviceImage2DViewOf3DFeaturesEXT src) {
        VkPhysicalDeviceImage2DViewOf3DFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] src) {
        VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$image2DViewOf3D = PathElement.groupElement("PATH$image2DViewOf3D");
    public static final PathElement PATH$sampler2DViewOf3D = PathElement.groupElement("PATH$sampler2DViewOf3D");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image2DViewOf3D = LAYOUT$image2DViewOf3D.byteSize();
    public static final long SIZE$sampler2DViewOf3D = LAYOUT$sampler2DViewOf3D.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image2DViewOf3D = LAYOUT.byteOffset(PATH$image2DViewOf3D);
    public static final long OFFSET$sampler2DViewOf3D = LAYOUT.byteOffset(PATH$sampler2DViewOf3D);

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

    public @unsigned int image2DViewOf3D() {
        return segment.get(LAYOUT$image2DViewOf3D, OFFSET$image2DViewOf3D);
    }

    public void image2DViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$image2DViewOf3D, OFFSET$image2DViewOf3D, value);
    }

    public @unsigned int sampler2DViewOf3D() {
        return segment.get(LAYOUT$sampler2DViewOf3D, OFFSET$sampler2DViewOf3D);
    }

    public void sampler2DViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$sampler2DViewOf3D, OFFSET$sampler2DViewOf3D, value);
    }

}
/// dummy, not implemented yet

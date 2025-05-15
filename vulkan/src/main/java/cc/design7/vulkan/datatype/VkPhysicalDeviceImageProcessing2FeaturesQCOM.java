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

public record VkPhysicalDeviceImageProcessing2FeaturesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$textureBlockMatch2 = ValueLayout.JAVA_INT.withName("textureBlockMatch2");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$textureBlockMatch2);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageProcessing2FeaturesQCOM[] ret = new VkPhysicalDeviceImageProcessing2FeaturesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageProcessing2FeaturesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM clone(Arena arena, VkPhysicalDeviceImageProcessing2FeaturesQCOM src) {
        VkPhysicalDeviceImageProcessing2FeaturesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM[] clone(Arena arena, VkPhysicalDeviceImageProcessing2FeaturesQCOM[] src) {
        VkPhysicalDeviceImageProcessing2FeaturesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$textureBlockMatch2 = PathElement.groupElement("PATH$textureBlockMatch2");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$textureBlockMatch2 = LAYOUT$textureBlockMatch2.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$textureBlockMatch2 = LAYOUT.byteOffset(PATH$textureBlockMatch2);

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

    public @unsigned int textureBlockMatch2() {
        return segment.get(LAYOUT$textureBlockMatch2, OFFSET$textureBlockMatch2);
    }

    public void textureBlockMatch2(@unsigned int value) {
        segment.set(LAYOUT$textureBlockMatch2, OFFSET$textureBlockMatch2, value);
    }

}
/// dummy, not implemented yet

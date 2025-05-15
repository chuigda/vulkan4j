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

public record VkPhysicalDeviceImageProcessingFeaturesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$textureSampleWeighted = ValueLayout.JAVA_INT.withName("textureSampleWeighted");
    public static final OfInt LAYOUT$textureBoxFilter = ValueLayout.JAVA_INT.withName("textureBoxFilter");
    public static final OfInt LAYOUT$textureBlockMatch = ValueLayout.JAVA_INT.withName("textureBlockMatch");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$textureSampleWeighted, LAYOUT$textureBoxFilter, LAYOUT$textureBlockMatch);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageProcessingFeaturesQCOM[] ret = new VkPhysicalDeviceImageProcessingFeaturesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM clone(Arena arena, VkPhysicalDeviceImageProcessingFeaturesQCOM src) {
        VkPhysicalDeviceImageProcessingFeaturesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM[] clone(Arena arena, VkPhysicalDeviceImageProcessingFeaturesQCOM[] src) {
        VkPhysicalDeviceImageProcessingFeaturesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$textureSampleWeighted = PathElement.groupElement("PATH$textureSampleWeighted");
    public static final PathElement PATH$textureBoxFilter = PathElement.groupElement("PATH$textureBoxFilter");
    public static final PathElement PATH$textureBlockMatch = PathElement.groupElement("PATH$textureBlockMatch");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$textureSampleWeighted = LAYOUT$textureSampleWeighted.byteSize();
    public static final long SIZE$textureBoxFilter = LAYOUT$textureBoxFilter.byteSize();
    public static final long SIZE$textureBlockMatch = LAYOUT$textureBlockMatch.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$textureSampleWeighted = LAYOUT.byteOffset(PATH$textureSampleWeighted);
    public static final long OFFSET$textureBoxFilter = LAYOUT.byteOffset(PATH$textureBoxFilter);
    public static final long OFFSET$textureBlockMatch = LAYOUT.byteOffset(PATH$textureBlockMatch);

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

    public @unsigned int textureSampleWeighted() {
        return segment.get(LAYOUT$textureSampleWeighted, OFFSET$textureSampleWeighted);
    }

    public void textureSampleWeighted(@unsigned int value) {
        segment.set(LAYOUT$textureSampleWeighted, OFFSET$textureSampleWeighted, value);
    }

    public @unsigned int textureBoxFilter() {
        return segment.get(LAYOUT$textureBoxFilter, OFFSET$textureBoxFilter);
    }

    public void textureBoxFilter(@unsigned int value) {
        segment.set(LAYOUT$textureBoxFilter, OFFSET$textureBoxFilter, value);
    }

    public @unsigned int textureBlockMatch() {
        return segment.get(LAYOUT$textureBlockMatch, OFFSET$textureBlockMatch);
    }

    public void textureBlockMatch(@unsigned int value) {
        segment.set(LAYOUT$textureBlockMatch, OFFSET$textureBlockMatch, value);
    }

}
/// dummy, not implemented yet

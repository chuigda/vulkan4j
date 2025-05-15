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

public record VkMicromapBuildSizesInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$micromapSize = ValueLayout.JAVA_LONG.withName("micromapSize");
    public static final OfLong LAYOUT$buildScratchSize = ValueLayout.JAVA_LONG.withName("buildScratchSize");
    public static final OfInt LAYOUT$discardable = ValueLayout.JAVA_INT.withName("discardable");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$micromapSize, LAYOUT$buildScratchSize, LAYOUT$discardable);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMicromapBuildSizesInfoEXT allocate(Arena arena) {
        return new VkMicromapBuildSizesInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkMicromapBuildSizesInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMicromapBuildSizesInfoEXT[] ret = new VkMicromapBuildSizesInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMicromapBuildSizesInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMicromapBuildSizesInfoEXT clone(Arena arena, VkMicromapBuildSizesInfoEXT src) {
        VkMicromapBuildSizesInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMicromapBuildSizesInfoEXT[] clone(Arena arena, VkMicromapBuildSizesInfoEXT[] src) {
        VkMicromapBuildSizesInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$micromapSize = PathElement.groupElement("PATH$micromapSize");
    public static final PathElement PATH$buildScratchSize = PathElement.groupElement("PATH$buildScratchSize");
    public static final PathElement PATH$discardable = PathElement.groupElement("PATH$discardable");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$micromapSize = LAYOUT$micromapSize.byteSize();
    public static final long SIZE$buildScratchSize = LAYOUT$buildScratchSize.byteSize();
    public static final long SIZE$discardable = LAYOUT$discardable.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$micromapSize = LAYOUT.byteOffset(PATH$micromapSize);
    public static final long OFFSET$buildScratchSize = LAYOUT.byteOffset(PATH$buildScratchSize);
    public static final long OFFSET$discardable = LAYOUT.byteOffset(PATH$discardable);

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

    public @unsigned long micromapSize() {
        return segment.get(LAYOUT$micromapSize, OFFSET$micromapSize);
    }

    public void micromapSize(@unsigned long value) {
        segment.set(LAYOUT$micromapSize, OFFSET$micromapSize, value);
    }

    public @unsigned long buildScratchSize() {
        return segment.get(LAYOUT$buildScratchSize, OFFSET$buildScratchSize);
    }

    public void buildScratchSize(@unsigned long value) {
        segment.set(LAYOUT$buildScratchSize, OFFSET$buildScratchSize, value);
    }

    public @unsigned int discardable() {
        return segment.get(LAYOUT$discardable, OFFSET$discardable);
    }

    public void discardable(@unsigned int value) {
        segment.set(LAYOUT$discardable, OFFSET$discardable, value);
    }

}
/// dummy, not implemented yet

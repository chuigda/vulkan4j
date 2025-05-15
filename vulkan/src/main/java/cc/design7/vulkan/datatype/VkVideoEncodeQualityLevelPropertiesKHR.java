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

public record VkVideoEncodeQualityLevelPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$preferredRateControlMode = ValueLayout.JAVA_INT.withName("preferredRateControlMode");
    public static final OfInt LAYOUT$preferredRateControlLayerCount = ValueLayout.JAVA_INT.withName("preferredRateControlLayerCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$preferredRateControlMode, LAYOUT$preferredRateControlLayerCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeQualityLevelPropertiesKHR allocate(Arena arena) {
        return new VkVideoEncodeQualityLevelPropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeQualityLevelPropertiesKHR[] ret = new VkVideoEncodeQualityLevelPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeQualityLevelPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR clone(Arena arena, VkVideoEncodeQualityLevelPropertiesKHR src) {
        VkVideoEncodeQualityLevelPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR[] clone(Arena arena, VkVideoEncodeQualityLevelPropertiesKHR[] src) {
        VkVideoEncodeQualityLevelPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$preferredRateControlMode = PathElement.groupElement("PATH$preferredRateControlMode");
    public static final PathElement PATH$preferredRateControlLayerCount = PathElement.groupElement("PATH$preferredRateControlLayerCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$preferredRateControlMode = LAYOUT$preferredRateControlMode.byteSize();
    public static final long SIZE$preferredRateControlLayerCount = LAYOUT$preferredRateControlLayerCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$preferredRateControlMode = LAYOUT.byteOffset(PATH$preferredRateControlMode);
    public static final long OFFSET$preferredRateControlLayerCount = LAYOUT.byteOffset(PATH$preferredRateControlLayerCount);

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

    public @enumtype(VkVideoEncodeRateControlModeFlagsKHR.class) int preferredRateControlMode() {
        return segment.get(LAYOUT$preferredRateControlMode, OFFSET$preferredRateControlMode);
    }

    public void preferredRateControlMode(@enumtype(VkVideoEncodeRateControlModeFlagsKHR.class) int value) {
        segment.set(LAYOUT$preferredRateControlMode, OFFSET$preferredRateControlMode, value);
    }

    public @unsigned int preferredRateControlLayerCount() {
        return segment.get(LAYOUT$preferredRateControlLayerCount, OFFSET$preferredRateControlLayerCount);
    }

    public void preferredRateControlLayerCount(@unsigned int value) {
        segment.set(LAYOUT$preferredRateControlLayerCount, OFFSET$preferredRateControlLayerCount, value);
    }

}
/// dummy, not implemented yet

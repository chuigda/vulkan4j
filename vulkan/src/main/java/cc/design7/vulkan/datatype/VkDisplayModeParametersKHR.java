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

public record VkDisplayModeParametersKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$visibleRegion = VkExtent2D.LAYOUT.withName("visibleRegion");
    public static final OfInt LAYOUT$refreshRate = ValueLayout.JAVA_INT.withName("refreshRate");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$visibleRegion, LAYOUT$refreshRate);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDisplayModeParametersKHR allocate(Arena arena) {
        return new VkDisplayModeParametersKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayModeParametersKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayModeParametersKHR[] ret = new VkDisplayModeParametersKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayModeParametersKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplayModeParametersKHR clone(Arena arena, VkDisplayModeParametersKHR src) {
        VkDisplayModeParametersKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayModeParametersKHR[] clone(Arena arena, VkDisplayModeParametersKHR[] src) {
        VkDisplayModeParametersKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$visibleRegion = PathElement.groupElement("PATH$visibleRegion");
    public static final PathElement PATH$refreshRate = PathElement.groupElement("PATH$refreshRate");

    public static final long SIZE$visibleRegion = LAYOUT$visibleRegion.byteSize();
    public static final long SIZE$refreshRate = LAYOUT$refreshRate.byteSize();

    public static final long OFFSET$visibleRegion = LAYOUT.byteOffset(PATH$visibleRegion);
    public static final long OFFSET$refreshRate = LAYOUT.byteOffset(PATH$refreshRate);

    public VkExtent2D visibleRegion() {
        return new VkExtent2D(segment.asSlice(OFFSET$visibleRegion, LAYOUT$visibleRegion));
    }

    public void visibleRegion(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$visibleRegion, SIZE$visibleRegion);
    }

    public @unsigned int refreshRate() {
        return segment.get(LAYOUT$refreshRate, OFFSET$refreshRate);
    }

    public void refreshRate(@unsigned int value) {
        segment.set(LAYOUT$refreshRate, OFFSET$refreshRate, value);
    }

}
/// dummy, not implemented yet

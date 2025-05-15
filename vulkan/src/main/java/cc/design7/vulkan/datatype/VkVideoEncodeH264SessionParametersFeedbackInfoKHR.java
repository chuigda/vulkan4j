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

public record VkVideoEncodeH264SessionParametersFeedbackInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$hasStdSPSOverrides = ValueLayout.JAVA_INT.withName("hasStdSPSOverrides");
    public static final OfInt LAYOUT$hasStdPPSOverrides = ValueLayout.JAVA_INT.withName("hasStdPPSOverrides");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$hasStdSPSOverrides, LAYOUT$hasStdPPSOverrides);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264SessionParametersFeedbackInfoKHR[] ret = new VkVideoEncodeH264SessionParametersFeedbackInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR clone(Arena arena, VkVideoEncodeH264SessionParametersFeedbackInfoKHR src) {
        VkVideoEncodeH264SessionParametersFeedbackInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR[] clone(Arena arena, VkVideoEncodeH264SessionParametersFeedbackInfoKHR[] src) {
        VkVideoEncodeH264SessionParametersFeedbackInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$hasStdSPSOverrides = PathElement.groupElement("PATH$hasStdSPSOverrides");
    public static final PathElement PATH$hasStdPPSOverrides = PathElement.groupElement("PATH$hasStdPPSOverrides");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$hasStdSPSOverrides = LAYOUT$hasStdSPSOverrides.byteSize();
    public static final long SIZE$hasStdPPSOverrides = LAYOUT$hasStdPPSOverrides.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$hasStdSPSOverrides = LAYOUT.byteOffset(PATH$hasStdSPSOverrides);
    public static final long OFFSET$hasStdPPSOverrides = LAYOUT.byteOffset(PATH$hasStdPPSOverrides);

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

    public @unsigned int hasStdSPSOverrides() {
        return segment.get(LAYOUT$hasStdSPSOverrides, OFFSET$hasStdSPSOverrides);
    }

    public void hasStdSPSOverrides(@unsigned int value) {
        segment.set(LAYOUT$hasStdSPSOverrides, OFFSET$hasStdSPSOverrides, value);
    }

    public @unsigned int hasStdPPSOverrides() {
        return segment.get(LAYOUT$hasStdPPSOverrides, OFFSET$hasStdPPSOverrides);
    }

    public void hasStdPPSOverrides(@unsigned int value) {
        segment.set(LAYOUT$hasStdPPSOverrides, OFFSET$hasStdPPSOverrides, value);
    }

}
/// dummy, not implemented yet

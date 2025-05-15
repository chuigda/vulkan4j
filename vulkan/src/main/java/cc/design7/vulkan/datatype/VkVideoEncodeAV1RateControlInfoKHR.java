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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1RateControlInfoKHR.html">VkVideoEncodeAV1RateControlInfoKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeAV1RateControlInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$gopFrameCount = ValueLayout.JAVA_INT.withName("gopFrameCount");
    public static final OfInt LAYOUT$keyFramePeriod = ValueLayout.JAVA_INT.withName("keyFramePeriod");
    public static final OfInt LAYOUT$consecutiveBipredictiveFrameCount = ValueLayout.JAVA_INT.withName("consecutiveBipredictiveFrameCount");
    public static final OfInt LAYOUT$temporalLayerCount = ValueLayout.JAVA_INT.withName("temporalLayerCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$gopFrameCount, LAYOUT$keyFramePeriod, LAYOUT$consecutiveBipredictiveFrameCount, LAYOUT$temporalLayerCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeAV1RateControlInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1RateControlInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1RateControlInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1RateControlInfoKHR[] ret = new VkVideoEncodeAV1RateControlInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1RateControlInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1RateControlInfoKHR clone(Arena arena, VkVideoEncodeAV1RateControlInfoKHR src) {
        VkVideoEncodeAV1RateControlInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1RateControlInfoKHR[] clone(Arena arena, VkVideoEncodeAV1RateControlInfoKHR[] src) {
        VkVideoEncodeAV1RateControlInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$gopFrameCount = PathElement.groupElement("PATH$gopFrameCount");
    public static final PathElement PATH$keyFramePeriod = PathElement.groupElement("PATH$keyFramePeriod");
    public static final PathElement PATH$consecutiveBipredictiveFrameCount = PathElement.groupElement("PATH$consecutiveBipredictiveFrameCount");
    public static final PathElement PATH$temporalLayerCount = PathElement.groupElement("PATH$temporalLayerCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$gopFrameCount = LAYOUT$gopFrameCount.byteSize();
    public static final long SIZE$keyFramePeriod = LAYOUT$keyFramePeriod.byteSize();
    public static final long SIZE$consecutiveBipredictiveFrameCount = LAYOUT$consecutiveBipredictiveFrameCount.byteSize();
    public static final long SIZE$temporalLayerCount = LAYOUT$temporalLayerCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$gopFrameCount = LAYOUT.byteOffset(PATH$gopFrameCount);
    public static final long OFFSET$keyFramePeriod = LAYOUT.byteOffset(PATH$keyFramePeriod);
    public static final long OFFSET$consecutiveBipredictiveFrameCount = LAYOUT.byteOffset(PATH$consecutiveBipredictiveFrameCount);
    public static final long OFFSET$temporalLayerCount = LAYOUT.byteOffset(PATH$temporalLayerCount);

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

    public @enumtype(VkVideoEncodeAV1RateControlFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoEncodeAV1RateControlFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int gopFrameCount() {
        return segment.get(LAYOUT$gopFrameCount, OFFSET$gopFrameCount);
    }

    public void gopFrameCount(@unsigned int value) {
        segment.set(LAYOUT$gopFrameCount, OFFSET$gopFrameCount, value);
    }

    public @unsigned int keyFramePeriod() {
        return segment.get(LAYOUT$keyFramePeriod, OFFSET$keyFramePeriod);
    }

    public void keyFramePeriod(@unsigned int value) {
        segment.set(LAYOUT$keyFramePeriod, OFFSET$keyFramePeriod, value);
    }

    public @unsigned int consecutiveBipredictiveFrameCount() {
        return segment.get(LAYOUT$consecutiveBipredictiveFrameCount, OFFSET$consecutiveBipredictiveFrameCount);
    }

    public void consecutiveBipredictiveFrameCount(@unsigned int value) {
        segment.set(LAYOUT$consecutiveBipredictiveFrameCount, OFFSET$consecutiveBipredictiveFrameCount, value);
    }

    public @unsigned int temporalLayerCount() {
        return segment.get(LAYOUT$temporalLayerCount, OFFSET$temporalLayerCount);
    }

    public void temporalLayerCount(@unsigned int value) {
        segment.set(LAYOUT$temporalLayerCount, OFFSET$temporalLayerCount, value);
    }

}

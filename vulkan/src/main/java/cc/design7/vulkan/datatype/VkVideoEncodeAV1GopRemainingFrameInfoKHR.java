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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1GopRemainingFrameInfoKHR.html">VkVideoEncodeAV1GopRemainingFrameInfoKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeAV1GopRemainingFrameInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$useGopRemainingFrames = ValueLayout.JAVA_INT.withName("useGopRemainingFrames");
    public static final OfInt LAYOUT$gopRemainingIntra = ValueLayout.JAVA_INT.withName("gopRemainingIntra");
    public static final OfInt LAYOUT$gopRemainingPredictive = ValueLayout.JAVA_INT.withName("gopRemainingPredictive");
    public static final OfInt LAYOUT$gopRemainingBipredictive = ValueLayout.JAVA_INT.withName("gopRemainingBipredictive");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$useGopRemainingFrames, LAYOUT$gopRemainingIntra, LAYOUT$gopRemainingPredictive, LAYOUT$gopRemainingBipredictive);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1GopRemainingFrameInfoKHR[] ret = new VkVideoEncodeAV1GopRemainingFrameInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR clone(Arena arena, VkVideoEncodeAV1GopRemainingFrameInfoKHR src) {
        VkVideoEncodeAV1GopRemainingFrameInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR[] clone(Arena arena, VkVideoEncodeAV1GopRemainingFrameInfoKHR[] src) {
        VkVideoEncodeAV1GopRemainingFrameInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useGopRemainingFrames = PathElement.groupElement("PATH$useGopRemainingFrames");
    public static final PathElement PATH$gopRemainingIntra = PathElement.groupElement("PATH$gopRemainingIntra");
    public static final PathElement PATH$gopRemainingPredictive = PathElement.groupElement("PATH$gopRemainingPredictive");
    public static final PathElement PATH$gopRemainingBipredictive = PathElement.groupElement("PATH$gopRemainingBipredictive");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useGopRemainingFrames = LAYOUT$useGopRemainingFrames.byteSize();
    public static final long SIZE$gopRemainingIntra = LAYOUT$gopRemainingIntra.byteSize();
    public static final long SIZE$gopRemainingPredictive = LAYOUT$gopRemainingPredictive.byteSize();
    public static final long SIZE$gopRemainingBipredictive = LAYOUT$gopRemainingBipredictive.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useGopRemainingFrames = LAYOUT.byteOffset(PATH$useGopRemainingFrames);
    public static final long OFFSET$gopRemainingIntra = LAYOUT.byteOffset(PATH$gopRemainingIntra);
    public static final long OFFSET$gopRemainingPredictive = LAYOUT.byteOffset(PATH$gopRemainingPredictive);
    public static final long OFFSET$gopRemainingBipredictive = LAYOUT.byteOffset(PATH$gopRemainingBipredictive);

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

    public @unsigned int useGopRemainingFrames() {
        return segment.get(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames);
    }

    public void useGopRemainingFrames(@unsigned int value) {
        segment.set(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames, value);
    }

    public @unsigned int gopRemainingIntra() {
        return segment.get(LAYOUT$gopRemainingIntra, OFFSET$gopRemainingIntra);
    }

    public void gopRemainingIntra(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingIntra, OFFSET$gopRemainingIntra, value);
    }

    public @unsigned int gopRemainingPredictive() {
        return segment.get(LAYOUT$gopRemainingPredictive, OFFSET$gopRemainingPredictive);
    }

    public void gopRemainingPredictive(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingPredictive, OFFSET$gopRemainingPredictive, value);
    }

    public @unsigned int gopRemainingBipredictive() {
        return segment.get(LAYOUT$gopRemainingBipredictive, OFFSET$gopRemainingBipredictive);
    }

    public void gopRemainingBipredictive(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingBipredictive, OFFSET$gopRemainingBipredictive, value);
    }

}

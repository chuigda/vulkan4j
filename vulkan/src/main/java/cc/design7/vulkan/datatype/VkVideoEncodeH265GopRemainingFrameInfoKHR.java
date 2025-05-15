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

public record VkVideoEncodeH265GopRemainingFrameInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$useGopRemainingFrames = ValueLayout.JAVA_INT.withName("useGopRemainingFrames");
    public static final OfInt LAYOUT$gopRemainingI = ValueLayout.JAVA_INT.withName("gopRemainingI");
    public static final OfInt LAYOUT$gopRemainingP = ValueLayout.JAVA_INT.withName("gopRemainingP");
    public static final OfInt LAYOUT$gopRemainingB = ValueLayout.JAVA_INT.withName("gopRemainingB");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$useGopRemainingFrames, LAYOUT$gopRemainingI, LAYOUT$gopRemainingP, LAYOUT$gopRemainingB);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265GopRemainingFrameInfoKHR[] ret = new VkVideoEncodeH265GopRemainingFrameInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265GopRemainingFrameInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR clone(Arena arena, VkVideoEncodeH265GopRemainingFrameInfoKHR src) {
        VkVideoEncodeH265GopRemainingFrameInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR[] clone(Arena arena, VkVideoEncodeH265GopRemainingFrameInfoKHR[] src) {
        VkVideoEncodeH265GopRemainingFrameInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useGopRemainingFrames = PathElement.groupElement("PATH$useGopRemainingFrames");
    public static final PathElement PATH$gopRemainingI = PathElement.groupElement("PATH$gopRemainingI");
    public static final PathElement PATH$gopRemainingP = PathElement.groupElement("PATH$gopRemainingP");
    public static final PathElement PATH$gopRemainingB = PathElement.groupElement("PATH$gopRemainingB");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useGopRemainingFrames = LAYOUT$useGopRemainingFrames.byteSize();
    public static final long SIZE$gopRemainingI = LAYOUT$gopRemainingI.byteSize();
    public static final long SIZE$gopRemainingP = LAYOUT$gopRemainingP.byteSize();
    public static final long SIZE$gopRemainingB = LAYOUT$gopRemainingB.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useGopRemainingFrames = LAYOUT.byteOffset(PATH$useGopRemainingFrames);
    public static final long OFFSET$gopRemainingI = LAYOUT.byteOffset(PATH$gopRemainingI);
    public static final long OFFSET$gopRemainingP = LAYOUT.byteOffset(PATH$gopRemainingP);
    public static final long OFFSET$gopRemainingB = LAYOUT.byteOffset(PATH$gopRemainingB);

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

    public @unsigned int gopRemainingI() {
        return segment.get(LAYOUT$gopRemainingI, OFFSET$gopRemainingI);
    }

    public void gopRemainingI(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingI, OFFSET$gopRemainingI, value);
    }

    public @unsigned int gopRemainingP() {
        return segment.get(LAYOUT$gopRemainingP, OFFSET$gopRemainingP);
    }

    public void gopRemainingP(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingP, OFFSET$gopRemainingP, value);
    }

    public @unsigned int gopRemainingB() {
        return segment.get(LAYOUT$gopRemainingB, OFFSET$gopRemainingB);
    }

    public void gopRemainingB(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingB, OFFSET$gopRemainingB, value);
    }

}
/// dummy, not implemented yet

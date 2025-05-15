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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1SessionCreateInfoKHR.html">VkVideoEncodeAV1SessionCreateInfoKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeAV1SessionCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$useMaxLevel = ValueLayout.JAVA_INT.withName("useMaxLevel");
    public static final OfInt LAYOUT$maxLevel = ValueLayout.JAVA_INT.withName("maxLevel");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$useMaxLevel, LAYOUT$maxLevel);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeAV1SessionCreateInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1SessionCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1SessionCreateInfoKHR[] ret = new VkVideoEncodeAV1SessionCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1SessionCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR clone(Arena arena, VkVideoEncodeAV1SessionCreateInfoKHR src) {
        VkVideoEncodeAV1SessionCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR[] clone(Arena arena, VkVideoEncodeAV1SessionCreateInfoKHR[] src) {
        VkVideoEncodeAV1SessionCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useMaxLevel = PathElement.groupElement("PATH$useMaxLevel");
    public static final PathElement PATH$maxLevel = PathElement.groupElement("PATH$maxLevel");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useMaxLevel = LAYOUT$useMaxLevel.byteSize();
    public static final long SIZE$maxLevel = LAYOUT$maxLevel.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useMaxLevel = LAYOUT.byteOffset(PATH$useMaxLevel);
    public static final long OFFSET$maxLevel = LAYOUT.byteOffset(PATH$maxLevel);

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

    public @unsigned int useMaxLevel() {
        return segment.get(LAYOUT$useMaxLevel, OFFSET$useMaxLevel);
    }

    public void useMaxLevel(@unsigned int value) {
        segment.set(LAYOUT$useMaxLevel, OFFSET$useMaxLevel, value);
    }

    public @enumtype(StdVideoAV1Level.class) int maxLevel() {
        return segment.get(LAYOUT$maxLevel, OFFSET$maxLevel);
    }

    public void maxLevel(@enumtype(StdVideoAV1Level.class) int value) {
        segment.set(LAYOUT$maxLevel, OFFSET$maxLevel, value);
    }

}

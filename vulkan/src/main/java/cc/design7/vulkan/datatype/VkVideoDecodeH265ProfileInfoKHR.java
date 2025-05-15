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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265ProfileInfoKHR.html">VkVideoDecodeH265ProfileInfoKHR</a>
@ValueBasedCandidate
public record VkVideoDecodeH265ProfileInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$stdProfileIdc = ValueLayout.JAVA_INT.withName("stdProfileIdc");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$stdProfileIdc);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeH265ProfileInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeH265ProfileInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeH265ProfileInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH265ProfileInfoKHR[] ret = new VkVideoDecodeH265ProfileInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH265ProfileInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoDecodeH265ProfileInfoKHR clone(Arena arena, VkVideoDecodeH265ProfileInfoKHR src) {
        VkVideoDecodeH265ProfileInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH265ProfileInfoKHR[] clone(Arena arena, VkVideoDecodeH265ProfileInfoKHR[] src) {
        VkVideoDecodeH265ProfileInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stdProfileIdc = PathElement.groupElement("PATH$stdProfileIdc");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stdProfileIdc = LAYOUT$stdProfileIdc.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stdProfileIdc = LAYOUT.byteOffset(PATH$stdProfileIdc);

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

    public @enumtype(StdVideoH265ProfileIdc.class) int stdProfileIdc() {
        return segment.get(LAYOUT$stdProfileIdc, OFFSET$stdProfileIdc);
    }

    public void stdProfileIdc(@enumtype(StdVideoH265ProfileIdc.class) int value) {
        segment.set(LAYOUT$stdProfileIdc, OFFSET$stdProfileIdc, value);
    }

}

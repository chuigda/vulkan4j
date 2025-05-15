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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoInlineQueryInfoKHR.html">VkVideoInlineQueryInfoKHR</a>
@ValueBasedCandidate
public record VkVideoInlineQueryInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$queryPool = ValueLayout.ADDRESS.withName("queryPool");
    public static final OfInt LAYOUT$firstQuery = ValueLayout.JAVA_INT.withName("firstQuery");
    public static final OfInt LAYOUT$queryCount = ValueLayout.JAVA_INT.withName("queryCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$queryPool, LAYOUT$firstQuery, LAYOUT$queryCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoInlineQueryInfoKHR allocate(Arena arena) {
        return new VkVideoInlineQueryInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoInlineQueryInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoInlineQueryInfoKHR[] ret = new VkVideoInlineQueryInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoInlineQueryInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoInlineQueryInfoKHR clone(Arena arena, VkVideoInlineQueryInfoKHR src) {
        VkVideoInlineQueryInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoInlineQueryInfoKHR[] clone(Arena arena, VkVideoInlineQueryInfoKHR[] src) {
        VkVideoInlineQueryInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$queryPool = PathElement.groupElement("PATH$queryPool");
    public static final PathElement PATH$firstQuery = PathElement.groupElement("PATH$firstQuery");
    public static final PathElement PATH$queryCount = PathElement.groupElement("PATH$queryCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queryPool = LAYOUT$queryPool.byteSize();
    public static final long SIZE$firstQuery = LAYOUT$firstQuery.byteSize();
    public static final long SIZE$queryCount = LAYOUT$queryCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queryPool = LAYOUT.byteOffset(PATH$queryPool);
    public static final long OFFSET$firstQuery = LAYOUT.byteOffset(PATH$firstQuery);
    public static final long OFFSET$queryCount = LAYOUT.byteOffset(PATH$queryCount);

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

    public @Nullable VkQueryPool queryPool() {
        MemorySegment s = segment.asSlice(OFFSET$queryPool, SIZE$queryPool);
        if (s.address() == 0) {
            return null;
        }
        return new VkQueryPool(s);
    }

    public void queryPool(@Nullable VkQueryPool value) {
        segment.set(LAYOUT$queryPool, OFFSET$queryPool, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int firstQuery() {
        return segment.get(LAYOUT$firstQuery, OFFSET$firstQuery);
    }

    public void firstQuery(@unsigned int value) {
        segment.set(LAYOUT$firstQuery, OFFSET$firstQuery, value);
    }

    public @unsigned int queryCount() {
        return segment.get(LAYOUT$queryCount, OFFSET$queryCount);
    }

    public void queryCount(@unsigned int value) {
        segment.set(LAYOUT$queryCount, OFFSET$queryCount, value);
    }

}

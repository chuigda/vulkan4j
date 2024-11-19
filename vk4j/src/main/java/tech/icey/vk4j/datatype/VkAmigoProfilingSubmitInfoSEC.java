package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkAmigoProfilingSubmitInfoSEC {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t firstDrawTimestamp;
///     uint64_t swapBufferTimestamp;
/// } VkAmigoProfilingSubmitInfoSEC;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAmigoProfilingSubmitInfoSEC.html">VkAmigoProfilingSubmitInfoSEC</a>
public record VkAmigoProfilingSubmitInfoSEC(MemorySegment segment) implements IPointer {
    public VkAmigoProfilingSubmitInfoSEC(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC);
    }

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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned long firstDrawTimestamp() {
        return segment.get(LAYOUT$firstDrawTimestamp, OFFSET$firstDrawTimestamp);
    }

    public void firstDrawTimestamp(@unsigned long value) {
        segment.set(LAYOUT$firstDrawTimestamp, OFFSET$firstDrawTimestamp, value);
    }

    public @unsigned long swapBufferTimestamp() {
        return segment.get(LAYOUT$swapBufferTimestamp, OFFSET$swapBufferTimestamp);
    }

    public void swapBufferTimestamp(@unsigned long value) {
        segment.set(LAYOUT$swapBufferTimestamp, OFFSET$swapBufferTimestamp, value);
    }

    public static VkAmigoProfilingSubmitInfoSEC allocate(Arena arena) {
        return new VkAmigoProfilingSubmitInfoSEC(arena.allocate(LAYOUT));
    }

    public static VkAmigoProfilingSubmitInfoSEC[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAmigoProfilingSubmitInfoSEC[] ret = new VkAmigoProfilingSubmitInfoSEC[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAmigoProfilingSubmitInfoSEC(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAmigoProfilingSubmitInfoSEC clone(Arena arena, VkAmigoProfilingSubmitInfoSEC src) {
        VkAmigoProfilingSubmitInfoSEC ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAmigoProfilingSubmitInfoSEC[] clone(Arena arena, VkAmigoProfilingSubmitInfoSEC[] src) {
        VkAmigoProfilingSubmitInfoSEC[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("firstDrawTimestamp"),
        ValueLayout.JAVA_LONG.withName("swapBufferTimestamp")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$firstDrawTimestamp = PathElement.groupElement("firstDrawTimestamp");
    public static final PathElement PATH$swapBufferTimestamp = PathElement.groupElement("swapBufferTimestamp");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$firstDrawTimestamp = (OfLong) LAYOUT.select(PATH$firstDrawTimestamp);
    public static final OfLong LAYOUT$swapBufferTimestamp = (OfLong) LAYOUT.select(PATH$swapBufferTimestamp);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$firstDrawTimestamp = LAYOUT.byteOffset(PATH$firstDrawTimestamp);
    public static final long OFFSET$swapBufferTimestamp = LAYOUT.byteOffset(PATH$swapBufferTimestamp);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$firstDrawTimestamp = LAYOUT$firstDrawTimestamp.byteSize();
    public static final long SIZE$swapBufferTimestamp = LAYOUT$swapBufferTimestamp.byteSize();
}

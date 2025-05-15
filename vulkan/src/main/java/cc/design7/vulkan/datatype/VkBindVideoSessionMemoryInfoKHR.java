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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindVideoSessionMemoryInfoKHR.html">VkBindVideoSessionMemoryInfoKHR</a>
@ValueBasedCandidate
public record VkBindVideoSessionMemoryInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$memoryBindIndex = ValueLayout.JAVA_INT.withName("memoryBindIndex");
    public static final AddressLayout LAYOUT$memory = ValueLayout.ADDRESS.withName("memory");
    public static final OfLong LAYOUT$memoryOffset = ValueLayout.JAVA_LONG.withName("memoryOffset");
    public static final OfLong LAYOUT$memorySize = ValueLayout.JAVA_LONG.withName("memorySize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$memoryBindIndex, LAYOUT$memory, LAYOUT$memoryOffset, LAYOUT$memorySize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBindVideoSessionMemoryInfoKHR allocate(Arena arena) {
        return new VkBindVideoSessionMemoryInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkBindVideoSessionMemoryInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindVideoSessionMemoryInfoKHR[] ret = new VkBindVideoSessionMemoryInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindVideoSessionMemoryInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindVideoSessionMemoryInfoKHR clone(Arena arena, VkBindVideoSessionMemoryInfoKHR src) {
        VkBindVideoSessionMemoryInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindVideoSessionMemoryInfoKHR[] clone(Arena arena, VkBindVideoSessionMemoryInfoKHR[] src) {
        VkBindVideoSessionMemoryInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$memoryBindIndex = PathElement.groupElement("PATH$memoryBindIndex");
    public static final PathElement PATH$memory = PathElement.groupElement("PATH$memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("PATH$memoryOffset");
    public static final PathElement PATH$memorySize = PathElement.groupElement("PATH$memorySize");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$memoryBindIndex = LAYOUT$memoryBindIndex.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
    public static final long SIZE$memoryOffset = LAYOUT$memoryOffset.byteSize();
    public static final long SIZE$memorySize = LAYOUT$memorySize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memoryBindIndex = LAYOUT.byteOffset(PATH$memoryBindIndex);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);
    public static final long OFFSET$memorySize = LAYOUT.byteOffset(PATH$memorySize);

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

    public @unsigned int memoryBindIndex() {
        return segment.get(LAYOUT$memoryBindIndex, OFFSET$memoryBindIndex);
    }

    public void memoryBindIndex(@unsigned int value) {
        segment.set(LAYOUT$memoryBindIndex, OFFSET$memoryBindIndex, value);
    }

    public @Nullable VkDeviceMemory memory() {
        MemorySegment s = segment.asSlice(OFFSET$memory, SIZE$memory);
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void memory(@Nullable VkDeviceMemory value) {
        segment.set(LAYOUT$memory, OFFSET$memory, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long memoryOffset() {
        return segment.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);
    }

    public void memoryOffset(@unsigned long value) {
        segment.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);
    }

    public @unsigned long memorySize() {
        return segment.get(LAYOUT$memorySize, OFFSET$memorySize);
    }

    public void memorySize(@unsigned long value) {
        segment.set(LAYOUT$memorySize, OFFSET$memorySize, value);
    }

}

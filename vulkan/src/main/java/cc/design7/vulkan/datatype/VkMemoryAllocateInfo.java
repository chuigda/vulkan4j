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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryAllocateInfo.html">VkMemoryAllocateInfo</a>
@ValueBasedCandidate
public record VkMemoryAllocateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$allocationSize = ValueLayout.JAVA_LONG.withName("allocationSize");
    public static final OfInt LAYOUT$memoryTypeIndex = ValueLayout.JAVA_INT.withName("memoryTypeIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$allocationSize, LAYOUT$memoryTypeIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMemoryAllocateInfo allocate(Arena arena) {
        return new VkMemoryAllocateInfo(arena.allocate(LAYOUT));
    }

    public static VkMemoryAllocateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryAllocateInfo[] ret = new VkMemoryAllocateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryAllocateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMemoryAllocateInfo clone(Arena arena, VkMemoryAllocateInfo src) {
        VkMemoryAllocateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryAllocateInfo[] clone(Arena arena, VkMemoryAllocateInfo[] src) {
        VkMemoryAllocateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$allocationSize = PathElement.groupElement("PATH$allocationSize");
    public static final PathElement PATH$memoryTypeIndex = PathElement.groupElement("PATH$memoryTypeIndex");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$allocationSize = LAYOUT$allocationSize.byteSize();
    public static final long SIZE$memoryTypeIndex = LAYOUT$memoryTypeIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$allocationSize = LAYOUT.byteOffset(PATH$allocationSize);
    public static final long OFFSET$memoryTypeIndex = LAYOUT.byteOffset(PATH$memoryTypeIndex);

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

    public @unsigned long allocationSize() {
        return segment.get(LAYOUT$allocationSize, OFFSET$allocationSize);
    }

    public void allocationSize(@unsigned long value) {
        segment.set(LAYOUT$allocationSize, OFFSET$allocationSize, value);
    }

    public @unsigned int memoryTypeIndex() {
        return segment.get(LAYOUT$memoryTypeIndex, OFFSET$memoryTypeIndex);
    }

    public void memoryTypeIndex(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeIndex, OFFSET$memoryTypeIndex, value);
    }

}

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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkScreenBufferPropertiesQNX.html">VkScreenBufferPropertiesQNX</a>
@ValueBasedCandidate
public record VkScreenBufferPropertiesQNX(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$allocationSize = ValueLayout.JAVA_LONG.withName("allocationSize");
    public static final OfInt LAYOUT$memoryTypeBits = ValueLayout.JAVA_INT.withName("memoryTypeBits");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$allocationSize, LAYOUT$memoryTypeBits);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkScreenBufferPropertiesQNX allocate(Arena arena) {
        return new VkScreenBufferPropertiesQNX(arena.allocate(LAYOUT));
    }

    public static VkScreenBufferPropertiesQNX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkScreenBufferPropertiesQNX[] ret = new VkScreenBufferPropertiesQNX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkScreenBufferPropertiesQNX(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkScreenBufferPropertiesQNX clone(Arena arena, VkScreenBufferPropertiesQNX src) {
        VkScreenBufferPropertiesQNX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkScreenBufferPropertiesQNX[] clone(Arena arena, VkScreenBufferPropertiesQNX[] src) {
        VkScreenBufferPropertiesQNX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$allocationSize = PathElement.groupElement("PATH$allocationSize");
    public static final PathElement PATH$memoryTypeBits = PathElement.groupElement("PATH$memoryTypeBits");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$allocationSize = LAYOUT$allocationSize.byteSize();
    public static final long SIZE$memoryTypeBits = LAYOUT$memoryTypeBits.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$allocationSize = LAYOUT.byteOffset(PATH$allocationSize);
    public static final long OFFSET$memoryTypeBits = LAYOUT.byteOffset(PATH$memoryTypeBits);

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

    public @unsigned int memoryTypeBits() {
        return segment.get(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits);
    }

    public void memoryTypeBits(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits, value);
    }

}

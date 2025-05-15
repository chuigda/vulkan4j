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

public record VkDeviceGroupBindSparseInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$resourceDeviceIndex = ValueLayout.JAVA_INT.withName("resourceDeviceIndex");
    public static final OfInt LAYOUT$memoryDeviceIndex = ValueLayout.JAVA_INT.withName("memoryDeviceIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$resourceDeviceIndex, LAYOUT$memoryDeviceIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceGroupBindSparseInfo allocate(Arena arena) {
        return new VkDeviceGroupBindSparseInfo(arena.allocate(LAYOUT));
    }

    public static VkDeviceGroupBindSparseInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupBindSparseInfo[] ret = new VkDeviceGroupBindSparseInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceGroupBindSparseInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceGroupBindSparseInfo clone(Arena arena, VkDeviceGroupBindSparseInfo src) {
        VkDeviceGroupBindSparseInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupBindSparseInfo[] clone(Arena arena, VkDeviceGroupBindSparseInfo[] src) {
        VkDeviceGroupBindSparseInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$resourceDeviceIndex = PathElement.groupElement("PATH$resourceDeviceIndex");
    public static final PathElement PATH$memoryDeviceIndex = PathElement.groupElement("PATH$memoryDeviceIndex");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$resourceDeviceIndex = LAYOUT$resourceDeviceIndex.byteSize();
    public static final long SIZE$memoryDeviceIndex = LAYOUT$memoryDeviceIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$resourceDeviceIndex = LAYOUT.byteOffset(PATH$resourceDeviceIndex);
    public static final long OFFSET$memoryDeviceIndex = LAYOUT.byteOffset(PATH$memoryDeviceIndex);

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

    public @unsigned int resourceDeviceIndex() {
        return segment.get(LAYOUT$resourceDeviceIndex, OFFSET$resourceDeviceIndex);
    }

    public void resourceDeviceIndex(@unsigned int value) {
        segment.set(LAYOUT$resourceDeviceIndex, OFFSET$resourceDeviceIndex, value);
    }

    public @unsigned int memoryDeviceIndex() {
        return segment.get(LAYOUT$memoryDeviceIndex, OFFSET$memoryDeviceIndex);
    }

    public void memoryDeviceIndex(@unsigned int value) {
        segment.set(LAYOUT$memoryDeviceIndex, OFFSET$memoryDeviceIndex, value);
    }

}
/// dummy, not implemented yet

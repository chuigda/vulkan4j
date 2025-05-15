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

public record VkMemoryDedicatedRequirements(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$prefersDedicatedAllocation = ValueLayout.JAVA_INT.withName("prefersDedicatedAllocation");
    public static final OfInt LAYOUT$requiresDedicatedAllocation = ValueLayout.JAVA_INT.withName("requiresDedicatedAllocation");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$prefersDedicatedAllocation, LAYOUT$requiresDedicatedAllocation);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMemoryDedicatedRequirements allocate(Arena arena) {
        return new VkMemoryDedicatedRequirements(arena.allocate(LAYOUT));
    }

    public static VkMemoryDedicatedRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryDedicatedRequirements[] ret = new VkMemoryDedicatedRequirements[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryDedicatedRequirements(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMemoryDedicatedRequirements clone(Arena arena, VkMemoryDedicatedRequirements src) {
        VkMemoryDedicatedRequirements ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryDedicatedRequirements[] clone(Arena arena, VkMemoryDedicatedRequirements[] src) {
        VkMemoryDedicatedRequirements[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$prefersDedicatedAllocation = PathElement.groupElement("PATH$prefersDedicatedAllocation");
    public static final PathElement PATH$requiresDedicatedAllocation = PathElement.groupElement("PATH$requiresDedicatedAllocation");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$prefersDedicatedAllocation = LAYOUT$prefersDedicatedAllocation.byteSize();
    public static final long SIZE$requiresDedicatedAllocation = LAYOUT$requiresDedicatedAllocation.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$prefersDedicatedAllocation = LAYOUT.byteOffset(PATH$prefersDedicatedAllocation);
    public static final long OFFSET$requiresDedicatedAllocation = LAYOUT.byteOffset(PATH$requiresDedicatedAllocation);

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

    public @unsigned int prefersDedicatedAllocation() {
        return segment.get(LAYOUT$prefersDedicatedAllocation, OFFSET$prefersDedicatedAllocation);
    }

    public void prefersDedicatedAllocation(@unsigned int value) {
        segment.set(LAYOUT$prefersDedicatedAllocation, OFFSET$prefersDedicatedAllocation, value);
    }

    public @unsigned int requiresDedicatedAllocation() {
        return segment.get(LAYOUT$requiresDedicatedAllocation, OFFSET$requiresDedicatedAllocation);
    }

    public void requiresDedicatedAllocation(@unsigned int value) {
        segment.set(LAYOUT$requiresDedicatedAllocation, OFFSET$requiresDedicatedAllocation, value);
    }

}
/// dummy, not implemented yet

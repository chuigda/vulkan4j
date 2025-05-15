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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceQueueGlobalPriorityCreateInfo.html">VkDeviceQueueGlobalPriorityCreateInfo</a>
@ValueBasedCandidate
public record VkDeviceQueueGlobalPriorityCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$globalPriority = ValueLayout.JAVA_INT.withName("globalPriority");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$globalPriority);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceQueueGlobalPriorityCreateInfo allocate(Arena arena) {
        return new VkDeviceQueueGlobalPriorityCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkDeviceQueueGlobalPriorityCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceQueueGlobalPriorityCreateInfo[] ret = new VkDeviceQueueGlobalPriorityCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceQueueGlobalPriorityCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceQueueGlobalPriorityCreateInfo clone(Arena arena, VkDeviceQueueGlobalPriorityCreateInfo src) {
        VkDeviceQueueGlobalPriorityCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceQueueGlobalPriorityCreateInfo[] clone(Arena arena, VkDeviceQueueGlobalPriorityCreateInfo[] src) {
        VkDeviceQueueGlobalPriorityCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$globalPriority = PathElement.groupElement("PATH$globalPriority");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$globalPriority = LAYOUT$globalPriority.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$globalPriority = LAYOUT.byteOffset(PATH$globalPriority);

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

    public @enumtype(VkQueueGlobalPriority.class) int globalPriority() {
        return segment.get(LAYOUT$globalPriority, OFFSET$globalPriority);
    }

    public void globalPriority(@enumtype(VkQueueGlobalPriority.class) int value) {
        segment.set(LAYOUT$globalPriority, OFFSET$globalPriority, value);
    }

}

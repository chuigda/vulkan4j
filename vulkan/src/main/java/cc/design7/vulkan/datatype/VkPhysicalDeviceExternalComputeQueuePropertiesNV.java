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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceExternalComputeQueuePropertiesNV.html">VkPhysicalDeviceExternalComputeQueuePropertiesNV</a>
@ValueBasedCandidate
public record VkPhysicalDeviceExternalComputeQueuePropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$externalDataSize = ValueLayout.JAVA_INT.withName("externalDataSize");
    public static final OfInt LAYOUT$maxExternalQueues = ValueLayout.JAVA_INT.withName("maxExternalQueues");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$externalDataSize, LAYOUT$maxExternalQueues);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalComputeQueuePropertiesNV[] ret = new VkPhysicalDeviceExternalComputeQueuePropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV clone(Arena arena, VkPhysicalDeviceExternalComputeQueuePropertiesNV src) {
        VkPhysicalDeviceExternalComputeQueuePropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV[] clone(Arena arena, VkPhysicalDeviceExternalComputeQueuePropertiesNV[] src) {
        VkPhysicalDeviceExternalComputeQueuePropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$externalDataSize = PathElement.groupElement("PATH$externalDataSize");
    public static final PathElement PATH$maxExternalQueues = PathElement.groupElement("PATH$maxExternalQueues");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$externalDataSize = LAYOUT$externalDataSize.byteSize();
    public static final long SIZE$maxExternalQueues = LAYOUT$maxExternalQueues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$externalDataSize = LAYOUT.byteOffset(PATH$externalDataSize);
    public static final long OFFSET$maxExternalQueues = LAYOUT.byteOffset(PATH$maxExternalQueues);

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

    public @unsigned int externalDataSize() {
        return segment.get(LAYOUT$externalDataSize, OFFSET$externalDataSize);
    }

    public void externalDataSize(@unsigned int value) {
        segment.set(LAYOUT$externalDataSize, OFFSET$externalDataSize, value);
    }

    public @unsigned int maxExternalQueues() {
        return segment.get(LAYOUT$maxExternalQueues, OFFSET$maxExternalQueues);
    }

    public void maxExternalQueues(@unsigned int value) {
        segment.set(LAYOUT$maxExternalQueues, OFFSET$maxExternalQueues, value);
    }

}

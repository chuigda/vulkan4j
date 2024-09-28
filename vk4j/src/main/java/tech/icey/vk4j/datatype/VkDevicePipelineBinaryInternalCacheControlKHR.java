package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDevicePipelineBinaryInternalCacheControlKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disableInternalCache")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$disableInternalCache = PathElement.groupElement("disableInternalCache");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$disableInternalCache = (OfInt) LAYOUT.select(PATH$disableInternalCache);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$disableInternalCache = LAYOUT.byteOffset(PATH$disableInternalCache);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$disableInternalCache = LAYOUT$disableInternalCache.byteSize();

    public VkDevicePipelineBinaryInternalCacheControlKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR);
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

    public @unsigned int disableInternalCache() {
        return segment.get(LAYOUT$disableInternalCache, OFFSET$disableInternalCache);
    }

    public void disableInternalCache(@unsigned int value) {
        segment.set(LAYOUT$disableInternalCache, OFFSET$disableInternalCache, value);
    }

    public static VkDevicePipelineBinaryInternalCacheControlKHR allocate(Arena arena) {
        return new VkDevicePipelineBinaryInternalCacheControlKHR(arena.allocate(LAYOUT));
    }
    
    public static VkDevicePipelineBinaryInternalCacheControlKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDevicePipelineBinaryInternalCacheControlKHR[] ret = new VkDevicePipelineBinaryInternalCacheControlKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDevicePipelineBinaryInternalCacheControlKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

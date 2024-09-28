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

public record VkPhysicalDevicePipelineBinaryPropertiesKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCacheControl"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrefersInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrecompiledInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryCompressedData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineBinaryInternalCache = PathElement.groupElement("pipelineBinaryInternalCache");
    public static final PathElement PATH$pipelineBinaryInternalCacheControl = PathElement.groupElement("pipelineBinaryInternalCacheControl");
    public static final PathElement PATH$pipelineBinaryPrefersInternalCache = PathElement.groupElement("pipelineBinaryPrefersInternalCache");
    public static final PathElement PATH$pipelineBinaryPrecompiledInternalCache = PathElement.groupElement("pipelineBinaryPrecompiledInternalCache");
    public static final PathElement PATH$pipelineBinaryCompressedData = PathElement.groupElement("pipelineBinaryCompressedData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineBinaryInternalCache = (OfInt) LAYOUT.select(PATH$pipelineBinaryInternalCache);
    public static final OfInt LAYOUT$pipelineBinaryInternalCacheControl = (OfInt) LAYOUT.select(PATH$pipelineBinaryInternalCacheControl);
    public static final OfInt LAYOUT$pipelineBinaryPrefersInternalCache = (OfInt) LAYOUT.select(PATH$pipelineBinaryPrefersInternalCache);
    public static final OfInt LAYOUT$pipelineBinaryPrecompiledInternalCache = (OfInt) LAYOUT.select(PATH$pipelineBinaryPrecompiledInternalCache);
    public static final OfInt LAYOUT$pipelineBinaryCompressedData = (OfInt) LAYOUT.select(PATH$pipelineBinaryCompressedData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBinaryInternalCache = LAYOUT.byteOffset(PATH$pipelineBinaryInternalCache);
    public static final long OFFSET$pipelineBinaryInternalCacheControl = LAYOUT.byteOffset(PATH$pipelineBinaryInternalCacheControl);
    public static final long OFFSET$pipelineBinaryPrefersInternalCache = LAYOUT.byteOffset(PATH$pipelineBinaryPrefersInternalCache);
    public static final long OFFSET$pipelineBinaryPrecompiledInternalCache = LAYOUT.byteOffset(PATH$pipelineBinaryPrecompiledInternalCache);
    public static final long OFFSET$pipelineBinaryCompressedData = LAYOUT.byteOffset(PATH$pipelineBinaryCompressedData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineBinaryInternalCache = LAYOUT$pipelineBinaryInternalCache.byteSize();
    public static final long SIZE$pipelineBinaryInternalCacheControl = LAYOUT$pipelineBinaryInternalCacheControl.byteSize();
    public static final long SIZE$pipelineBinaryPrefersInternalCache = LAYOUT$pipelineBinaryPrefersInternalCache.byteSize();
    public static final long SIZE$pipelineBinaryPrecompiledInternalCache = LAYOUT$pipelineBinaryPrecompiledInternalCache.byteSize();
    public static final long SIZE$pipelineBinaryCompressedData = LAYOUT$pipelineBinaryCompressedData.byteSize();

    public VkPhysicalDevicePipelineBinaryPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR);
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

    public @unsigned int pipelineBinaryInternalCache() {
        return segment.get(LAYOUT$pipelineBinaryInternalCache, OFFSET$pipelineBinaryInternalCache);
    }

    public void pipelineBinaryInternalCache(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryInternalCache, OFFSET$pipelineBinaryInternalCache, value);
    }

    public @unsigned int pipelineBinaryInternalCacheControl() {
        return segment.get(LAYOUT$pipelineBinaryInternalCacheControl, OFFSET$pipelineBinaryInternalCacheControl);
    }

    public void pipelineBinaryInternalCacheControl(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryInternalCacheControl, OFFSET$pipelineBinaryInternalCacheControl, value);
    }

    public @unsigned int pipelineBinaryPrefersInternalCache() {
        return segment.get(LAYOUT$pipelineBinaryPrefersInternalCache, OFFSET$pipelineBinaryPrefersInternalCache);
    }

    public void pipelineBinaryPrefersInternalCache(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryPrefersInternalCache, OFFSET$pipelineBinaryPrefersInternalCache, value);
    }

    public @unsigned int pipelineBinaryPrecompiledInternalCache() {
        return segment.get(LAYOUT$pipelineBinaryPrecompiledInternalCache, OFFSET$pipelineBinaryPrecompiledInternalCache);
    }

    public void pipelineBinaryPrecompiledInternalCache(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryPrecompiledInternalCache, OFFSET$pipelineBinaryPrecompiledInternalCache, value);
    }

    public @unsigned int pipelineBinaryCompressedData() {
        return segment.get(LAYOUT$pipelineBinaryCompressedData, OFFSET$pipelineBinaryCompressedData);
    }

    public void pipelineBinaryCompressedData(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryCompressedData, OFFSET$pipelineBinaryCompressedData, value);
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePipelineBinaryPropertiesKHR[] ret = new VkPhysicalDevicePipelineBinaryPropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

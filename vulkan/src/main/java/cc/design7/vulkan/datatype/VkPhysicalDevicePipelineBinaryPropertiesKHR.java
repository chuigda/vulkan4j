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

public record VkPhysicalDevicePipelineBinaryPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$pipelineBinaryInternalCache = ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCache");
    public static final OfInt LAYOUT$pipelineBinaryInternalCacheControl = ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCacheControl");
    public static final OfInt LAYOUT$pipelineBinaryPrefersInternalCache = ValueLayout.JAVA_INT.withName("pipelineBinaryPrefersInternalCache");
    public static final OfInt LAYOUT$pipelineBinaryPrecompiledInternalCache = ValueLayout.JAVA_INT.withName("pipelineBinaryPrecompiledInternalCache");
    public static final OfInt LAYOUT$pipelineBinaryCompressedData = ValueLayout.JAVA_INT.withName("pipelineBinaryCompressedData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pipelineBinaryInternalCache, LAYOUT$pipelineBinaryInternalCacheControl, LAYOUT$pipelineBinaryPrefersInternalCache, LAYOUT$pipelineBinaryPrecompiledInternalCache, LAYOUT$pipelineBinaryCompressedData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePipelineBinaryPropertiesKHR[] ret = new VkPhysicalDevicePipelineBinaryPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR clone(Arena arena, VkPhysicalDevicePipelineBinaryPropertiesKHR src) {
        VkPhysicalDevicePipelineBinaryPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR[] clone(Arena arena, VkPhysicalDevicePipelineBinaryPropertiesKHR[] src) {
        VkPhysicalDevicePipelineBinaryPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pipelineBinaryInternalCache = PathElement.groupElement("PATH$pipelineBinaryInternalCache");
    public static final PathElement PATH$pipelineBinaryInternalCacheControl = PathElement.groupElement("PATH$pipelineBinaryInternalCacheControl");
    public static final PathElement PATH$pipelineBinaryPrefersInternalCache = PathElement.groupElement("PATH$pipelineBinaryPrefersInternalCache");
    public static final PathElement PATH$pipelineBinaryPrecompiledInternalCache = PathElement.groupElement("PATH$pipelineBinaryPrecompiledInternalCache");
    public static final PathElement PATH$pipelineBinaryCompressedData = PathElement.groupElement("PATH$pipelineBinaryCompressedData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineBinaryInternalCache = LAYOUT$pipelineBinaryInternalCache.byteSize();
    public static final long SIZE$pipelineBinaryInternalCacheControl = LAYOUT$pipelineBinaryInternalCacheControl.byteSize();
    public static final long SIZE$pipelineBinaryPrefersInternalCache = LAYOUT$pipelineBinaryPrefersInternalCache.byteSize();
    public static final long SIZE$pipelineBinaryPrecompiledInternalCache = LAYOUT$pipelineBinaryPrecompiledInternalCache.byteSize();
    public static final long SIZE$pipelineBinaryCompressedData = LAYOUT$pipelineBinaryCompressedData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBinaryInternalCache = LAYOUT.byteOffset(PATH$pipelineBinaryInternalCache);
    public static final long OFFSET$pipelineBinaryInternalCacheControl = LAYOUT.byteOffset(PATH$pipelineBinaryInternalCacheControl);
    public static final long OFFSET$pipelineBinaryPrefersInternalCache = LAYOUT.byteOffset(PATH$pipelineBinaryPrefersInternalCache);
    public static final long OFFSET$pipelineBinaryPrecompiledInternalCache = LAYOUT.byteOffset(PATH$pipelineBinaryPrecompiledInternalCache);
    public static final long OFFSET$pipelineBinaryCompressedData = LAYOUT.byteOffset(PATH$pipelineBinaryCompressedData);

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

}
/// dummy, not implemented yet

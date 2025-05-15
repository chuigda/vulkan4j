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

public record VkPhysicalDeviceExternalSciSyncFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$sciSyncFence = ValueLayout.JAVA_INT.withName("sciSyncFence");
    public static final OfInt LAYOUT$sciSyncSemaphore = ValueLayout.JAVA_INT.withName("sciSyncSemaphore");
    public static final OfInt LAYOUT$sciSyncImport = ValueLayout.JAVA_INT.withName("sciSyncImport");
    public static final OfInt LAYOUT$sciSyncExport = ValueLayout.JAVA_INT.withName("sciSyncExport");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$sciSyncFence, LAYOUT$sciSyncSemaphore, LAYOUT$sciSyncImport, LAYOUT$sciSyncExport);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceExternalSciSyncFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceExternalSciSyncFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceExternalSciSyncFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalSciSyncFeaturesNV[] ret = new VkPhysicalDeviceExternalSciSyncFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceExternalSciSyncFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceExternalSciSyncFeaturesNV clone(Arena arena, VkPhysicalDeviceExternalSciSyncFeaturesNV src) {
        VkPhysicalDeviceExternalSciSyncFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExternalSciSyncFeaturesNV[] clone(Arena arena, VkPhysicalDeviceExternalSciSyncFeaturesNV[] src) {
        VkPhysicalDeviceExternalSciSyncFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$sciSyncFence = PathElement.groupElement("PATH$sciSyncFence");
    public static final PathElement PATH$sciSyncSemaphore = PathElement.groupElement("PATH$sciSyncSemaphore");
    public static final PathElement PATH$sciSyncImport = PathElement.groupElement("PATH$sciSyncImport");
    public static final PathElement PATH$sciSyncExport = PathElement.groupElement("PATH$sciSyncExport");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sciSyncFence = LAYOUT$sciSyncFence.byteSize();
    public static final long SIZE$sciSyncSemaphore = LAYOUT$sciSyncSemaphore.byteSize();
    public static final long SIZE$sciSyncImport = LAYOUT$sciSyncImport.byteSize();
    public static final long SIZE$sciSyncExport = LAYOUT$sciSyncExport.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sciSyncFence = LAYOUT.byteOffset(PATH$sciSyncFence);
    public static final long OFFSET$sciSyncSemaphore = LAYOUT.byteOffset(PATH$sciSyncSemaphore);
    public static final long OFFSET$sciSyncImport = LAYOUT.byteOffset(PATH$sciSyncImport);
    public static final long OFFSET$sciSyncExport = LAYOUT.byteOffset(PATH$sciSyncExport);

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

    public @unsigned int sciSyncFence() {
        return segment.get(LAYOUT$sciSyncFence, OFFSET$sciSyncFence);
    }

    public void sciSyncFence(@unsigned int value) {
        segment.set(LAYOUT$sciSyncFence, OFFSET$sciSyncFence, value);
    }

    public @unsigned int sciSyncSemaphore() {
        return segment.get(LAYOUT$sciSyncSemaphore, OFFSET$sciSyncSemaphore);
    }

    public void sciSyncSemaphore(@unsigned int value) {
        segment.set(LAYOUT$sciSyncSemaphore, OFFSET$sciSyncSemaphore, value);
    }

    public @unsigned int sciSyncImport() {
        return segment.get(LAYOUT$sciSyncImport, OFFSET$sciSyncImport);
    }

    public void sciSyncImport(@unsigned int value) {
        segment.set(LAYOUT$sciSyncImport, OFFSET$sciSyncImport, value);
    }

    public @unsigned int sciSyncExport() {
        return segment.get(LAYOUT$sciSyncExport, OFFSET$sciSyncExport);
    }

    public void sciSyncExport(@unsigned int value) {
        segment.set(LAYOUT$sciSyncExport, OFFSET$sciSyncExport, value);
    }

}
/// dummy, not implemented yet

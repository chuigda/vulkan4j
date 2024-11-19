package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceExternalSciSyncFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 sciSyncFence;
///     VkBool32 sciSyncSemaphore;
///     VkBool32 sciSyncImport;
///     VkBool32 sciSyncExport;
/// } VkPhysicalDeviceExternalSciSyncFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceExternalSciSyncFeaturesNV.html">VkPhysicalDeviceExternalSciSyncFeaturesNV</a>
public record VkPhysicalDeviceExternalSciSyncFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceExternalSciSyncFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SCI_SYNC_FEATURES_NV);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public static VkPhysicalDeviceExternalSciSyncFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceExternalSciSyncFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceExternalSciSyncFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalSciSyncFeaturesNV[] ret = new VkPhysicalDeviceExternalSciSyncFeaturesNV[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciSyncFence"),
        ValueLayout.JAVA_INT.withName("sciSyncSemaphore"),
        ValueLayout.JAVA_INT.withName("sciSyncImport"),
        ValueLayout.JAVA_INT.withName("sciSyncExport")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sciSyncFence = PathElement.groupElement("sciSyncFence");
    public static final PathElement PATH$sciSyncSemaphore = PathElement.groupElement("sciSyncSemaphore");
    public static final PathElement PATH$sciSyncImport = PathElement.groupElement("sciSyncImport");
    public static final PathElement PATH$sciSyncExport = PathElement.groupElement("sciSyncExport");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sciSyncFence = (OfInt) LAYOUT.select(PATH$sciSyncFence);
    public static final OfInt LAYOUT$sciSyncSemaphore = (OfInt) LAYOUT.select(PATH$sciSyncSemaphore);
    public static final OfInt LAYOUT$sciSyncImport = (OfInt) LAYOUT.select(PATH$sciSyncImport);
    public static final OfInt LAYOUT$sciSyncExport = (OfInt) LAYOUT.select(PATH$sciSyncExport);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sciSyncFence = LAYOUT.byteOffset(PATH$sciSyncFence);
    public static final long OFFSET$sciSyncSemaphore = LAYOUT.byteOffset(PATH$sciSyncSemaphore);
    public static final long OFFSET$sciSyncImport = LAYOUT.byteOffset(PATH$sciSyncImport);
    public static final long OFFSET$sciSyncExport = LAYOUT.byteOffset(PATH$sciSyncExport);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sciSyncFence = LAYOUT$sciSyncFence.byteSize();
    public static final long SIZE$sciSyncSemaphore = LAYOUT$sciSyncSemaphore.byteSize();
    public static final long SIZE$sciSyncImport = LAYOUT$sciSyncImport.byteSize();
    public static final long SIZE$sciSyncExport = LAYOUT$sciSyncExport.byteSize();
}

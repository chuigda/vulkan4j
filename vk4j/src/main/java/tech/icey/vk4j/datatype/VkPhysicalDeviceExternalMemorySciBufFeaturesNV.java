package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCI_BUF_FEATURES_NV;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceExternalMemorySciBufFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 sciBufImport;
///     VkBool32 sciBufExport;
/// } VkPhysicalDeviceExternalMemorySciBufFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceExternalMemorySciBufFeaturesNV.html">VkPhysicalDeviceExternalMemorySciBufFeaturesNV</a>
public record VkPhysicalDeviceExternalMemorySciBufFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCI_BUF_FEATURES_NV);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int sciBufImport() {
        return segment.get(LAYOUT$sciBufImport, OFFSET$sciBufImport);
    }

    public void sciBufImport(@unsigned int value) {
        segment.set(LAYOUT$sciBufImport, OFFSET$sciBufImport, value);
    }

    public @unsigned int sciBufExport() {
        return segment.get(LAYOUT$sciBufExport, OFFSET$sciBufExport);
    }

    public void sciBufExport(@unsigned int value) {
        segment.set(LAYOUT$sciBufExport, OFFSET$sciBufExport, value);
    }

    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] ret = new VkPhysicalDeviceExternalMemorySciBufFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV clone(Arena arena, VkPhysicalDeviceExternalMemorySciBufFeaturesNV src) {
        VkPhysicalDeviceExternalMemorySciBufFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] clone(Arena arena, VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] src) {
        VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciBufImport"),
        ValueLayout.JAVA_INT.withName("sciBufExport")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sciBufImport = PathElement.groupElement("sciBufImport");
    public static final PathElement PATH$sciBufExport = PathElement.groupElement("sciBufExport");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sciBufImport = (OfInt) LAYOUT.select(PATH$sciBufImport);
    public static final OfInt LAYOUT$sciBufExport = (OfInt) LAYOUT.select(PATH$sciBufExport);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sciBufImport = LAYOUT.byteOffset(PATH$sciBufImport);
    public static final long OFFSET$sciBufExport = LAYOUT.byteOffset(PATH$sciBufExport);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sciBufImport = LAYOUT$sciBufImport.byteSize();
    public static final long SIZE$sciBufExport = LAYOUT$sciBufExport.byteSize();
}

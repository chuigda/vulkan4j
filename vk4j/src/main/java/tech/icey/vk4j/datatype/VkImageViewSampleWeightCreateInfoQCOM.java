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

/// {@snippet lang=c :
/// typedef struct VkImageViewSampleWeightCreateInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     VkOffset2D filterCenter;
///     VkExtent2D filterSize;
///     uint32_t numPhases;
/// } VkImageViewSampleWeightCreateInfoQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageViewSampleWeightCreateInfoQCOM.html">VkImageViewSampleWeightCreateInfoQCOM</a>
public record VkImageViewSampleWeightCreateInfoQCOM(MemorySegment segment) implements IPointer {
    public VkImageViewSampleWeightCreateInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM);
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

    public VkOffset2D filterCenter() {
        return new VkOffset2D(segment.asSlice(OFFSET$filterCenter, LAYOUT$filterCenter));
    }

    public void filterCenter(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$filterCenter, SIZE$filterCenter);
    }

    public VkExtent2D filterSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$filterSize, LAYOUT$filterSize));
    }

    public void filterSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$filterSize, SIZE$filterSize);
    }

    public @unsigned int numPhases() {
        return segment.get(LAYOUT$numPhases, OFFSET$numPhases);
    }

    public void numPhases(@unsigned int value) {
        segment.set(LAYOUT$numPhases, OFFSET$numPhases, value);
    }

    public static VkImageViewSampleWeightCreateInfoQCOM allocate(Arena arena) {
        return new VkImageViewSampleWeightCreateInfoQCOM(arena.allocate(LAYOUT));
    }
    
    public static VkImageViewSampleWeightCreateInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageViewSampleWeightCreateInfoQCOM[] ret = new VkImageViewSampleWeightCreateInfoQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageViewSampleWeightCreateInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkOffset2D.LAYOUT.withName("filterCenter"),
        VkExtent2D.LAYOUT.withName("filterSize"),
        ValueLayout.JAVA_INT.withName("numPhases")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$filterCenter = PathElement.groupElement("filterCenter");
    public static final PathElement PATH$filterSize = PathElement.groupElement("filterSize");
    public static final PathElement PATH$numPhases = PathElement.groupElement("numPhases");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$filterCenter = (StructLayout) LAYOUT.select(PATH$filterCenter);
    public static final StructLayout LAYOUT$filterSize = (StructLayout) LAYOUT.select(PATH$filterSize);
    public static final OfInt LAYOUT$numPhases = (OfInt) LAYOUT.select(PATH$numPhases);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$filterCenter = LAYOUT.byteOffset(PATH$filterCenter);
    public static final long OFFSET$filterSize = LAYOUT.byteOffset(PATH$filterSize);
    public static final long OFFSET$numPhases = LAYOUT.byteOffset(PATH$numPhases);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$filterCenter = LAYOUT$filterCenter.byteSize();
    public static final long SIZE$filterSize = LAYOUT$filterSize.byteSize();
    public static final long SIZE$numPhases = LAYOUT$numPhases.byteSize();
}

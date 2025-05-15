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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageViewSampleWeightCreateInfoQCOM.html">VkImageViewSampleWeightCreateInfoQCOM</a>
@ValueBasedCandidate
public record VkImageViewSampleWeightCreateInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$filterCenter = VkOffset2D.LAYOUT.withName("filterCenter");
    public static final StructLayout LAYOUT$filterSize = VkExtent2D.LAYOUT.withName("filterSize");
    public static final OfInt LAYOUT$numPhases = ValueLayout.JAVA_INT.withName("numPhases");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$filterCenter, LAYOUT$filterSize, LAYOUT$numPhases);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageViewSampleWeightCreateInfoQCOM allocate(Arena arena) {
        return new VkImageViewSampleWeightCreateInfoQCOM(arena.allocate(LAYOUT));
    }

    public static VkImageViewSampleWeightCreateInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageViewSampleWeightCreateInfoQCOM[] ret = new VkImageViewSampleWeightCreateInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageViewSampleWeightCreateInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageViewSampleWeightCreateInfoQCOM clone(Arena arena, VkImageViewSampleWeightCreateInfoQCOM src) {
        VkImageViewSampleWeightCreateInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageViewSampleWeightCreateInfoQCOM[] clone(Arena arena, VkImageViewSampleWeightCreateInfoQCOM[] src) {
        VkImageViewSampleWeightCreateInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$filterCenter = PathElement.groupElement("PATH$filterCenter");
    public static final PathElement PATH$filterSize = PathElement.groupElement("PATH$filterSize");
    public static final PathElement PATH$numPhases = PathElement.groupElement("PATH$numPhases");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$filterCenter = LAYOUT$filterCenter.byteSize();
    public static final long SIZE$filterSize = LAYOUT$filterSize.byteSize();
    public static final long SIZE$numPhases = LAYOUT$numPhases.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$filterCenter = LAYOUT.byteOffset(PATH$filterCenter);
    public static final long OFFSET$filterSize = LAYOUT.byteOffset(PATH$filterSize);
    public static final long OFFSET$numPhases = LAYOUT.byteOffset(PATH$numPhases);

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

}

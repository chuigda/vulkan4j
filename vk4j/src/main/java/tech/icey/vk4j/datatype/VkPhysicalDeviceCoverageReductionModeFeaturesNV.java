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
/// typedef struct VkPhysicalDeviceCoverageReductionModeFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 coverageReductionMode;
/// } VkPhysicalDeviceCoverageReductionModeFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceCoverageReductionModeFeaturesNV.html">VkPhysicalDeviceCoverageReductionModeFeaturesNV</a>
public record VkPhysicalDeviceCoverageReductionModeFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV);
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

    public @unsigned int coverageReductionMode() {
        return segment.get(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode);
    }

    public void coverageReductionMode(@unsigned int value) {
        segment.set(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode, value);
    }

    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceCoverageReductionModeFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCoverageReductionModeFeaturesNV[] ret = new VkPhysicalDeviceCoverageReductionModeFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceCoverageReductionModeFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV clone(Arena arena, VkPhysicalDeviceCoverageReductionModeFeaturesNV src) {
        VkPhysicalDeviceCoverageReductionModeFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV[] clone(Arena arena, VkPhysicalDeviceCoverageReductionModeFeaturesNV[] src) {
        VkPhysicalDeviceCoverageReductionModeFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$coverageReductionMode = PathElement.groupElement("coverageReductionMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$coverageReductionMode = (OfInt) LAYOUT.select(PATH$coverageReductionMode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$coverageReductionMode = LAYOUT.byteOffset(PATH$coverageReductionMode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$coverageReductionMode = LAYOUT$coverageReductionMode.byteSize();
}

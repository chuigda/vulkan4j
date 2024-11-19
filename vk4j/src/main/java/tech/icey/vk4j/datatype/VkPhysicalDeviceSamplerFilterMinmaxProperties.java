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
/// typedef struct VkPhysicalDeviceSamplerFilterMinmaxProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 filterMinmaxSingleComponentFormats;
///     VkBool32 filterMinmaxImageComponentMapping;
/// } VkPhysicalDeviceSamplerFilterMinmaxProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceSamplerFilterMinmaxProperties.html">VkPhysicalDeviceSamplerFilterMinmaxProperties</a>
public record VkPhysicalDeviceSamplerFilterMinmaxProperties(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceSamplerFilterMinmaxProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES);
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

    public @unsigned int filterMinmaxSingleComponentFormats() {
        return segment.get(LAYOUT$filterMinmaxSingleComponentFormats, OFFSET$filterMinmaxSingleComponentFormats);
    }

    public void filterMinmaxSingleComponentFormats(@unsigned int value) {
        segment.set(LAYOUT$filterMinmaxSingleComponentFormats, OFFSET$filterMinmaxSingleComponentFormats, value);
    }

    public @unsigned int filterMinmaxImageComponentMapping() {
        return segment.get(LAYOUT$filterMinmaxImageComponentMapping, OFFSET$filterMinmaxImageComponentMapping);
    }

    public void filterMinmaxImageComponentMapping(@unsigned int value) {
        segment.set(LAYOUT$filterMinmaxImageComponentMapping, OFFSET$filterMinmaxImageComponentMapping, value);
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties allocate(Arena arena) {
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSamplerFilterMinmaxProperties[] ret = new VkPhysicalDeviceSamplerFilterMinmaxProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties clone(Arena arena, VkPhysicalDeviceSamplerFilterMinmaxProperties src) {
        VkPhysicalDeviceSamplerFilterMinmaxProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties[] clone(Arena arena, VkPhysicalDeviceSamplerFilterMinmaxProperties[] src) {
        VkPhysicalDeviceSamplerFilterMinmaxProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("filterMinmaxSingleComponentFormats"),
        ValueLayout.JAVA_INT.withName("filterMinmaxImageComponentMapping")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$filterMinmaxSingleComponentFormats = PathElement.groupElement("filterMinmaxSingleComponentFormats");
    public static final PathElement PATH$filterMinmaxImageComponentMapping = PathElement.groupElement("filterMinmaxImageComponentMapping");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$filterMinmaxSingleComponentFormats = (OfInt) LAYOUT.select(PATH$filterMinmaxSingleComponentFormats);
    public static final OfInt LAYOUT$filterMinmaxImageComponentMapping = (OfInt) LAYOUT.select(PATH$filterMinmaxImageComponentMapping);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$filterMinmaxSingleComponentFormats = LAYOUT.byteOffset(PATH$filterMinmaxSingleComponentFormats);
    public static final long OFFSET$filterMinmaxImageComponentMapping = LAYOUT.byteOffset(PATH$filterMinmaxImageComponentMapping);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$filterMinmaxSingleComponentFormats = LAYOUT$filterMinmaxSingleComponentFormats.byteSize();
    public static final long SIZE$filterMinmaxImageComponentMapping = LAYOUT$filterMinmaxImageComponentMapping.byteSize();
}

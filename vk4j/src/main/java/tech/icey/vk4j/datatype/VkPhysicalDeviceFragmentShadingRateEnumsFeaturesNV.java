package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentShadingRateEnums;
///     VkBool32 supersampleFragmentShadingRates;
///     VkBool32 noInvocationFragmentShadingRates;
/// } VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.html">VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV</a>
public record VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int fragmentShadingRateEnums() {
        return segment.get(LAYOUT$fragmentShadingRateEnums, OFFSET$fragmentShadingRateEnums);
    }

    public void fragmentShadingRateEnums(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateEnums, OFFSET$fragmentShadingRateEnums, value);
    }

    public @unsigned int supersampleFragmentShadingRates() {
        return segment.get(LAYOUT$supersampleFragmentShadingRates, OFFSET$supersampleFragmentShadingRates);
    }

    public void supersampleFragmentShadingRates(@unsigned int value) {
        segment.set(LAYOUT$supersampleFragmentShadingRates, OFFSET$supersampleFragmentShadingRates, value);
    }

    public @unsigned int noInvocationFragmentShadingRates() {
        return segment.get(LAYOUT$noInvocationFragmentShadingRates, OFFSET$noInvocationFragmentShadingRates);
    }

    public void noInvocationFragmentShadingRates(@unsigned int value) {
        segment.set(LAYOUT$noInvocationFragmentShadingRates, OFFSET$noInvocationFragmentShadingRates, value);
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[] ret = new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV clone(Arena arena, VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV src) {
        VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[] clone(Arena arena, VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[] src) {
        VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateEnums"),
        ValueLayout.JAVA_INT.withName("supersampleFragmentShadingRates"),
        ValueLayout.JAVA_INT.withName("noInvocationFragmentShadingRates")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentShadingRateEnums = PathElement.groupElement("fragmentShadingRateEnums");
    public static final PathElement PATH$supersampleFragmentShadingRates = PathElement.groupElement("supersampleFragmentShadingRates");
    public static final PathElement PATH$noInvocationFragmentShadingRates = PathElement.groupElement("noInvocationFragmentShadingRates");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentShadingRateEnums = (OfInt) LAYOUT.select(PATH$fragmentShadingRateEnums);
    public static final OfInt LAYOUT$supersampleFragmentShadingRates = (OfInt) LAYOUT.select(PATH$supersampleFragmentShadingRates);
    public static final OfInt LAYOUT$noInvocationFragmentShadingRates = (OfInt) LAYOUT.select(PATH$noInvocationFragmentShadingRates);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentShadingRateEnums = LAYOUT.byteOffset(PATH$fragmentShadingRateEnums);
    public static final long OFFSET$supersampleFragmentShadingRates = LAYOUT.byteOffset(PATH$supersampleFragmentShadingRates);
    public static final long OFFSET$noInvocationFragmentShadingRates = LAYOUT.byteOffset(PATH$noInvocationFragmentShadingRates);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentShadingRateEnums = LAYOUT$fragmentShadingRateEnums.byteSize();
    public static final long SIZE$supersampleFragmentShadingRates = LAYOUT$supersampleFragmentShadingRates.byteSize();
    public static final long SIZE$noInvocationFragmentShadingRates = LAYOUT$noInvocationFragmentShadingRates.byteSize();
}

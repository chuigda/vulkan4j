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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.html">VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV</a>
@ValueBasedCandidate
public record VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$fragmentShadingRateEnums = ValueLayout.JAVA_INT.withName("fragmentShadingRateEnums");
    public static final OfInt LAYOUT$supersampleFragmentShadingRates = ValueLayout.JAVA_INT.withName("supersampleFragmentShadingRates");
    public static final OfInt LAYOUT$noInvocationFragmentShadingRates = ValueLayout.JAVA_INT.withName("noInvocationFragmentShadingRates");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$fragmentShadingRateEnums, LAYOUT$supersampleFragmentShadingRates, LAYOUT$noInvocationFragmentShadingRates);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[] ret = new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fragmentShadingRateEnums = PathElement.groupElement("PATH$fragmentShadingRateEnums");
    public static final PathElement PATH$supersampleFragmentShadingRates = PathElement.groupElement("PATH$supersampleFragmentShadingRates");
    public static final PathElement PATH$noInvocationFragmentShadingRates = PathElement.groupElement("PATH$noInvocationFragmentShadingRates");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentShadingRateEnums = LAYOUT$fragmentShadingRateEnums.byteSize();
    public static final long SIZE$supersampleFragmentShadingRates = LAYOUT$supersampleFragmentShadingRates.byteSize();
    public static final long SIZE$noInvocationFragmentShadingRates = LAYOUT$noInvocationFragmentShadingRates.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentShadingRateEnums = LAYOUT.byteOffset(PATH$fragmentShadingRateEnums);
    public static final long OFFSET$supersampleFragmentShadingRates = LAYOUT.byteOffset(PATH$supersampleFragmentShadingRates);
    public static final long OFFSET$noInvocationFragmentShadingRates = LAYOUT.byteOffset(PATH$noInvocationFragmentShadingRates);

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

}

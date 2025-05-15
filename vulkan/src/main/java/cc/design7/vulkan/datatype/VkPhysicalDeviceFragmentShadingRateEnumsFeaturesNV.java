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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.html"><code>VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 fragmentShadingRateEnums;
///     VkBool32 supersampleFragmentShadingRates;
///     VkBool32 noInvocationFragmentShadingRates;
/// } VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV`
///
/// The {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.html"><code>VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV allocate(Arena arena) {
        VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ret = new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV);
        return ret;
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[] ret = new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV);
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

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV);
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateEnums"),
        ValueLayout.JAVA_INT.withName("supersampleFragmentShadingRates"),
        ValueLayout.JAVA_INT.withName("noInvocationFragmentShadingRates")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fragmentShadingRateEnums = PathElement.groupElement("PATH$fragmentShadingRateEnums");
    public static final PathElement PATH$supersampleFragmentShadingRates = PathElement.groupElement("PATH$supersampleFragmentShadingRates");
    public static final PathElement PATH$noInvocationFragmentShadingRates = PathElement.groupElement("PATH$noInvocationFragmentShadingRates");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentShadingRateEnums = (OfInt) LAYOUT.select(PATH$fragmentShadingRateEnums);
    public static final OfInt LAYOUT$supersampleFragmentShadingRates = (OfInt) LAYOUT.select(PATH$supersampleFragmentShadingRates);
    public static final OfInt LAYOUT$noInvocationFragmentShadingRates = (OfInt) LAYOUT.select(PATH$noInvocationFragmentShadingRates);

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
}

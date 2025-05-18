package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFaultFeaturesEXT.html"><code>VkPhysicalDeviceFaultFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceFaultFeaturesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 deviceFault; // @link substring="deviceFault" target="#deviceFault"
///     VkBool32 deviceFaultVendorBinary; // @link substring="deviceFaultVendorBinary" target="#deviceFaultVendorBinary"
/// } VkPhysicalDeviceFaultFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceFaultFeaturesEXT#allocate(Arena)}, {@link VkPhysicalDeviceFaultFeaturesEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceFaultFeaturesEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFaultFeaturesEXT.html"><code>VkPhysicalDeviceFaultFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceFaultFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceFaultFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceFaultFeaturesEXT ret = new VkPhysicalDeviceFaultFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_FAULT_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceFaultFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFaultFeaturesEXT[] ret = new VkPhysicalDeviceFaultFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFaultFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_FAULT_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceFaultFeaturesEXT clone(Arena arena, VkPhysicalDeviceFaultFeaturesEXT src) {
        VkPhysicalDeviceFaultFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFaultFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceFaultFeaturesEXT[] src) {
        VkPhysicalDeviceFaultFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_FAULT_FEATURES_EXT);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int deviceFault() {
        return segment.get(LAYOUT$deviceFault, OFFSET$deviceFault);
    }

    public void deviceFault(@unsigned int value) {
        segment.set(LAYOUT$deviceFault, OFFSET$deviceFault, value);
    }

    public @unsigned int deviceFaultVendorBinary() {
        return segment.get(LAYOUT$deviceFaultVendorBinary, OFFSET$deviceFaultVendorBinary);
    }

    public void deviceFaultVendorBinary(@unsigned int value) {
        segment.set(LAYOUT$deviceFaultVendorBinary, OFFSET$deviceFaultVendorBinary, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceFault"),
        ValueLayout.JAVA_INT.withName("deviceFaultVendorBinary")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$deviceFault = PathElement.groupElement("PATH$deviceFault");
    public static final PathElement PATH$deviceFaultVendorBinary = PathElement.groupElement("PATH$deviceFaultVendorBinary");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceFault = (OfInt) LAYOUT.select(PATH$deviceFault);
    public static final OfInt LAYOUT$deviceFaultVendorBinary = (OfInt) LAYOUT.select(PATH$deviceFaultVendorBinary);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceFault = LAYOUT$deviceFault.byteSize();
    public static final long SIZE$deviceFaultVendorBinary = LAYOUT$deviceFaultVendorBinary.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceFault = LAYOUT.byteOffset(PATH$deviceFault);
    public static final long OFFSET$deviceFaultVendorBinary = LAYOUT.byteOffset(PATH$deviceFaultVendorBinary);
}

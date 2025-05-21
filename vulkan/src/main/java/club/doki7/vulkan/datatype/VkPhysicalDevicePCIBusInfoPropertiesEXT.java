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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePCIBusInfoPropertiesEXT.html"><code>VkPhysicalDevicePCIBusInfoPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDevicePCIBusInfoPropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t pciDomain; // @link substring="pciDomain" target="#pciDomain"
///     uint32_t pciBus; // @link substring="pciBus" target="#pciBus"
///     uint32_t pciDevice; // @link substring="pciDevice" target="#pciDevice"
///     uint32_t pciFunction; // @link substring="pciFunction" target="#pciFunction"
/// } VkPhysicalDevicePCIBusInfoPropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDevicePCIBusInfoPropertiesEXT#allocate(Arena)}, {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePCIBusInfoPropertiesEXT.html"><code>VkPhysicalDevicePCIBusInfoPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDevicePCIBusInfoPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocate(Arena arena) {
        VkPhysicalDevicePCIBusInfoPropertiesEXT ret = new VkPhysicalDevicePCIBusInfoPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePCIBusInfoPropertiesEXT[] ret = new VkPhysicalDevicePCIBusInfoPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT clone(Arena arena, VkPhysicalDevicePCIBusInfoPropertiesEXT src) {
        VkPhysicalDevicePCIBusInfoPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT[] clone(Arena arena, VkPhysicalDevicePCIBusInfoPropertiesEXT[] src) {
        VkPhysicalDevicePCIBusInfoPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT);
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

    public @unsigned int pciDomain() {
        return segment.get(LAYOUT$pciDomain, OFFSET$pciDomain);
    }

    public void pciDomain(@unsigned int value) {
        segment.set(LAYOUT$pciDomain, OFFSET$pciDomain, value);
    }

    public @unsigned int pciBus() {
        return segment.get(LAYOUT$pciBus, OFFSET$pciBus);
    }

    public void pciBus(@unsigned int value) {
        segment.set(LAYOUT$pciBus, OFFSET$pciBus, value);
    }

    public @unsigned int pciDevice() {
        return segment.get(LAYOUT$pciDevice, OFFSET$pciDevice);
    }

    public void pciDevice(@unsigned int value) {
        segment.set(LAYOUT$pciDevice, OFFSET$pciDevice, value);
    }

    public @unsigned int pciFunction() {
        return segment.get(LAYOUT$pciFunction, OFFSET$pciFunction);
    }

    public void pciFunction(@unsigned int value) {
        segment.set(LAYOUT$pciFunction, OFFSET$pciFunction, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pciDomain"),
        ValueLayout.JAVA_INT.withName("pciBus"),
        ValueLayout.JAVA_INT.withName("pciDevice"),
        ValueLayout.JAVA_INT.withName("pciFunction")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pciDomain = PathElement.groupElement("pciDomain");
    public static final PathElement PATH$pciBus = PathElement.groupElement("pciBus");
    public static final PathElement PATH$pciDevice = PathElement.groupElement("pciDevice");
    public static final PathElement PATH$pciFunction = PathElement.groupElement("pciFunction");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pciDomain = (OfInt) LAYOUT.select(PATH$pciDomain);
    public static final OfInt LAYOUT$pciBus = (OfInt) LAYOUT.select(PATH$pciBus);
    public static final OfInt LAYOUT$pciDevice = (OfInt) LAYOUT.select(PATH$pciDevice);
    public static final OfInt LAYOUT$pciFunction = (OfInt) LAYOUT.select(PATH$pciFunction);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pciDomain = LAYOUT$pciDomain.byteSize();
    public static final long SIZE$pciBus = LAYOUT$pciBus.byteSize();
    public static final long SIZE$pciDevice = LAYOUT$pciDevice.byteSize();
    public static final long SIZE$pciFunction = LAYOUT$pciFunction.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pciDomain = LAYOUT.byteOffset(PATH$pciDomain);
    public static final long OFFSET$pciBus = LAYOUT.byteOffset(PATH$pciBus);
    public static final long OFFSET$pciDevice = LAYOUT.byteOffset(PATH$pciDevice);
    public static final long OFFSET$pciFunction = LAYOUT.byteOffset(PATH$pciFunction);
}

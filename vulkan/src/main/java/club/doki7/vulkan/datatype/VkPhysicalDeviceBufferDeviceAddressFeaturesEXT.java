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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.html"><code>VkPhysicalDeviceBufferDeviceAddressFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceBufferDeviceAddressFeaturesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 bufferDeviceAddress; // @link substring="bufferDeviceAddress" target="#bufferDeviceAddress"
///     VkBool32 bufferDeviceAddressCaptureReplay; // @link substring="bufferDeviceAddressCaptureReplay" target="#bufferDeviceAddressCaptureReplay"
///     VkBool32 bufferDeviceAddressMultiDevice; // @link substring="bufferDeviceAddressMultiDevice" target="#bufferDeviceAddressMultiDevice"
/// } VkPhysicalDeviceBufferDeviceAddressFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT#allocate(Arena)}, {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.html"><code>VkPhysicalDeviceBufferDeviceAddressFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceBufferDeviceAddressFeaturesEXT ret = new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceBufferDeviceAddressFeaturesEXT[] ret = new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT clone(Arena arena, VkPhysicalDeviceBufferDeviceAddressFeaturesEXT src) {
        VkPhysicalDeviceBufferDeviceAddressFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceBufferDeviceAddressFeaturesEXT[] src) {
        VkPhysicalDeviceBufferDeviceAddressFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT);
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

    public @unsigned int bufferDeviceAddress() {
        return segment.get(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress);
    }

    public void bufferDeviceAddress(@unsigned int value) {
        segment.set(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress, value);
    }

    public @unsigned int bufferDeviceAddressCaptureReplay() {
        return segment.get(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay);
    }

    public void bufferDeviceAddressCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay, value);
    }

    public @unsigned int bufferDeviceAddressMultiDevice() {
        return segment.get(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice);
    }

    public void bufferDeviceAddressMultiDevice(@unsigned int value) {
        segment.set(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddress"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressMultiDevice")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$bufferDeviceAddress = PathElement.groupElement("PATH$bufferDeviceAddress");
    public static final PathElement PATH$bufferDeviceAddressCaptureReplay = PathElement.groupElement("PATH$bufferDeviceAddressCaptureReplay");
    public static final PathElement PATH$bufferDeviceAddressMultiDevice = PathElement.groupElement("PATH$bufferDeviceAddressMultiDevice");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$bufferDeviceAddress = (OfInt) LAYOUT.select(PATH$bufferDeviceAddress);
    public static final OfInt LAYOUT$bufferDeviceAddressCaptureReplay = (OfInt) LAYOUT.select(PATH$bufferDeviceAddressCaptureReplay);
    public static final OfInt LAYOUT$bufferDeviceAddressMultiDevice = (OfInt) LAYOUT.select(PATH$bufferDeviceAddressMultiDevice);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$bufferDeviceAddress = LAYOUT$bufferDeviceAddress.byteSize();
    public static final long SIZE$bufferDeviceAddressCaptureReplay = LAYOUT$bufferDeviceAddressCaptureReplay.byteSize();
    public static final long SIZE$bufferDeviceAddressMultiDevice = LAYOUT$bufferDeviceAddressMultiDevice.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$bufferDeviceAddress = LAYOUT.byteOffset(PATH$bufferDeviceAddress);
    public static final long OFFSET$bufferDeviceAddressCaptureReplay = LAYOUT.byteOffset(PATH$bufferDeviceAddressCaptureReplay);
    public static final long OFFSET$bufferDeviceAddressMultiDevice = LAYOUT.byteOffset(PATH$bufferDeviceAddressMultiDevice);
}

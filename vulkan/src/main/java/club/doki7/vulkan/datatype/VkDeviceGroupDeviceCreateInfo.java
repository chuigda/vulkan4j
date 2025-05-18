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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceGroupDeviceCreateInfo.html"><code>VkDeviceGroupDeviceCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceGroupDeviceCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t physicalDeviceCount; // optional // @link substring="physicalDeviceCount" target="#physicalDeviceCount"
///     VkPhysicalDevice const* pPhysicalDevices; // @link substring="VkPhysicalDevice" target="VkPhysicalDevice" @link substring="pPhysicalDevices" target="#pPhysicalDevices"
/// } VkDeviceGroupDeviceCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO`
///
/// The {@code allocate} ({@link VkDeviceGroupDeviceCreateInfo#allocate(Arena)}, {@link VkDeviceGroupDeviceCreateInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDeviceGroupDeviceCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceGroupDeviceCreateInfo.html"><code>VkDeviceGroupDeviceCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceGroupDeviceCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceGroupDeviceCreateInfo allocate(Arena arena) {
        VkDeviceGroupDeviceCreateInfo ret = new VkDeviceGroupDeviceCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_GROUP_DEVICE_CREATE_INFO);
        return ret;
    }

    public static VkDeviceGroupDeviceCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupDeviceCreateInfo[] ret = new VkDeviceGroupDeviceCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceGroupDeviceCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEVICE_GROUP_DEVICE_CREATE_INFO);
        }
        return ret;
    }

    public static VkDeviceGroupDeviceCreateInfo clone(Arena arena, VkDeviceGroupDeviceCreateInfo src) {
        VkDeviceGroupDeviceCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupDeviceCreateInfo[] clone(Arena arena, VkDeviceGroupDeviceCreateInfo[] src) {
        VkDeviceGroupDeviceCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_GROUP_DEVICE_CREATE_INFO);
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

    public @unsigned int physicalDeviceCount() {
        return segment.get(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount);
    }

    public void physicalDeviceCount(@unsigned int value) {
        segment.set(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount, value);
    }

    /// Note: the returned {@link VkPhysicalDevice.Ptr} does not have correct {@link VkPhysicalDevice.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkPhysicalDevice.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkPhysicalDevice.Ptr pPhysicalDevices() {
        MemorySegment s = pPhysicalDevicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPhysicalDevice.Ptr(s);
    }

    public void pPhysicalDevices(@Nullable VkPhysicalDevice.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPhysicalDevicesRaw(s);
    }

    public @pointer(target=VkPhysicalDevice.class) MemorySegment pPhysicalDevicesRaw() {
        return segment.get(LAYOUT$pPhysicalDevices, OFFSET$pPhysicalDevices);
    }

    public void pPhysicalDevicesRaw(@pointer(target=VkPhysicalDevice.class) MemorySegment value) {
        segment.set(LAYOUT$pPhysicalDevices, OFFSET$pPhysicalDevices, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPhysicalDevices")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$physicalDeviceCount = PathElement.groupElement("PATH$physicalDeviceCount");
    public static final PathElement PATH$pPhysicalDevices = PathElement.groupElement("PATH$pPhysicalDevices");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$physicalDeviceCount = (OfInt) LAYOUT.select(PATH$physicalDeviceCount);
    public static final AddressLayout LAYOUT$pPhysicalDevices = (AddressLayout) LAYOUT.select(PATH$pPhysicalDevices);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$physicalDeviceCount = LAYOUT$physicalDeviceCount.byteSize();
    public static final long SIZE$pPhysicalDevices = LAYOUT$pPhysicalDevices.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$physicalDeviceCount = LAYOUT.byteOffset(PATH$physicalDeviceCount);
    public static final long OFFSET$pPhysicalDevices = LAYOUT.byteOffset(PATH$pPhysicalDevices);
}

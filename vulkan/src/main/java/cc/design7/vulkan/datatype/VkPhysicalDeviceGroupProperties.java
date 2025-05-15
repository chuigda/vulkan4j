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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceGroupProperties.html"><code>VkPhysicalDeviceGroupProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceGroupProperties {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t physicalDeviceCount;
///     VkPhysicalDevice physicalDevices;
///     VkBool32 subsetAllocation;
/// } VkPhysicalDeviceGroupProperties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES`
///
/// The {@link VkPhysicalDeviceGroupProperties#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceGroupProperties#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceGroupProperties.html"><code>VkPhysicalDeviceGroupProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceGroupProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceGroupProperties allocate(Arena arena) {
        VkPhysicalDeviceGroupProperties ret = new VkPhysicalDeviceGroupProperties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_GROUP_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDeviceGroupProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceGroupProperties[] ret = new VkPhysicalDeviceGroupProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceGroupProperties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_GROUP_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDeviceGroupProperties clone(Arena arena, VkPhysicalDeviceGroupProperties src) {
        VkPhysicalDeviceGroupProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceGroupProperties[] clone(Arena arena, VkPhysicalDeviceGroupProperties[] src) {
        VkPhysicalDeviceGroupProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_GROUP_PROPERTIES);
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

    public @Nullable VkPhysicalDevice physicalDevices() {
        MemorySegment s = segment.asSlice(OFFSET$physicalDevices, SIZE$physicalDevices);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPhysicalDevice(s);
    }

    public void physicalDevices(@Nullable VkPhysicalDevice value) {
        segment.set(LAYOUT$physicalDevices, OFFSET$physicalDevices, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int subsetAllocation() {
        return segment.get(LAYOUT$subsetAllocation, OFFSET$subsetAllocation);
    }

    public void subsetAllocation(@unsigned int value) {
        segment.set(LAYOUT$subsetAllocation, OFFSET$subsetAllocation, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        ValueLayout.ADDRESS.withName("physicalDevices"),
        ValueLayout.JAVA_INT.withName("subsetAllocation")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$physicalDeviceCount = PathElement.groupElement("PATH$physicalDeviceCount");
    public static final PathElement PATH$physicalDevices = PathElement.groupElement("PATH$physicalDevices");
    public static final PathElement PATH$subsetAllocation = PathElement.groupElement("PATH$subsetAllocation");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$physicalDeviceCount = (OfInt) LAYOUT.select(PATH$physicalDeviceCount);
    public static final AddressLayout LAYOUT$physicalDevices = (AddressLayout) LAYOUT.select(PATH$physicalDevices);
    public static final OfInt LAYOUT$subsetAllocation = (OfInt) LAYOUT.select(PATH$subsetAllocation);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$physicalDeviceCount = LAYOUT$physicalDeviceCount.byteSize();
    public static final long SIZE$physicalDevices = LAYOUT$physicalDevices.byteSize();
    public static final long SIZE$subsetAllocation = LAYOUT$subsetAllocation.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$physicalDeviceCount = LAYOUT.byteOffset(PATH$physicalDeviceCount);
    public static final long OFFSET$physicalDevices = LAYOUT.byteOffset(PATH$physicalDevices);
    public static final long OFFSET$subsetAllocation = LAYOUT.byteOffset(PATH$subsetAllocation);
}

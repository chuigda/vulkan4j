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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMaintenance3Properties.html"><code>VkPhysicalDeviceMaintenance3Properties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMaintenance3Properties {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t maxPerSetDescriptors;
///     VkDeviceSize maxMemoryAllocationSize;
/// } VkPhysicalDeviceMaintenance3Properties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES`
///
/// The {@link VkPhysicalDeviceMaintenance3Properties#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceMaintenance3Properties#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMaintenance3Properties.html"><code>VkPhysicalDeviceMaintenance3Properties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMaintenance3Properties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceMaintenance3Properties allocate(Arena arena) {
        VkPhysicalDeviceMaintenance3Properties ret = new VkPhysicalDeviceMaintenance3Properties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDeviceMaintenance3Properties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMaintenance3Properties[] ret = new VkPhysicalDeviceMaintenance3Properties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMaintenance3Properties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDeviceMaintenance3Properties clone(Arena arena, VkPhysicalDeviceMaintenance3Properties src) {
        VkPhysicalDeviceMaintenance3Properties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMaintenance3Properties[] clone(Arena arena, VkPhysicalDeviceMaintenance3Properties[] src) {
        VkPhysicalDeviceMaintenance3Properties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES);
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

    public @unsigned int maxPerSetDescriptors() {
        return segment.get(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors);
    }

    public void maxPerSetDescriptors(@unsigned int value) {
        segment.set(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors, value);
    }

    public @unsigned long maxMemoryAllocationSize() {
        return segment.get(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize);
    }

    public void maxMemoryAllocationSize(@unsigned long value) {
        segment.set(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPerSetDescriptors"),
        ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxPerSetDescriptors = PathElement.groupElement("PATH$maxPerSetDescriptors");
    public static final PathElement PATH$maxMemoryAllocationSize = PathElement.groupElement("PATH$maxMemoryAllocationSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxPerSetDescriptors = (OfInt) LAYOUT.select(PATH$maxPerSetDescriptors);
    public static final OfLong LAYOUT$maxMemoryAllocationSize = (OfLong) LAYOUT.select(PATH$maxMemoryAllocationSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxPerSetDescriptors = LAYOUT$maxPerSetDescriptors.byteSize();
    public static final long SIZE$maxMemoryAllocationSize = LAYOUT$maxMemoryAllocationSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxPerSetDescriptors = LAYOUT.byteOffset(PATH$maxPerSetDescriptors);
    public static final long OFFSET$maxMemoryAllocationSize = LAYOUT.byteOffset(PATH$maxMemoryAllocationSize);
}

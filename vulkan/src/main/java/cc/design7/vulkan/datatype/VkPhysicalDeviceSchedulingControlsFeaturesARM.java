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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSchedulingControlsFeaturesARM.html"><code>VkPhysicalDeviceSchedulingControlsFeaturesARM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceSchedulingControlsFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 schedulingControls;
/// } VkPhysicalDeviceSchedulingControlsFeaturesARM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM`
///
/// The {@link VkPhysicalDeviceSchedulingControlsFeaturesARM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceSchedulingControlsFeaturesARM#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSchedulingControlsFeaturesARM.html"><code>VkPhysicalDeviceSchedulingControlsFeaturesARM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceSchedulingControlsFeaturesARM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM allocate(Arena arena) {
        VkPhysicalDeviceSchedulingControlsFeaturesARM ret = new VkPhysicalDeviceSchedulingControlsFeaturesARM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM);
        return ret;
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSchedulingControlsFeaturesARM[] ret = new VkPhysicalDeviceSchedulingControlsFeaturesARM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM);
        }
        return ret;
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM clone(Arena arena, VkPhysicalDeviceSchedulingControlsFeaturesARM src) {
        VkPhysicalDeviceSchedulingControlsFeaturesARM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM[] clone(Arena arena, VkPhysicalDeviceSchedulingControlsFeaturesARM[] src) {
        VkPhysicalDeviceSchedulingControlsFeaturesARM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM);
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

    public @unsigned int schedulingControls() {
        return segment.get(LAYOUT$schedulingControls, OFFSET$schedulingControls);
    }

    public void schedulingControls(@unsigned int value) {
        segment.set(LAYOUT$schedulingControls, OFFSET$schedulingControls, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("schedulingControls")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$schedulingControls = PathElement.groupElement("PATH$schedulingControls");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$schedulingControls = (OfInt) LAYOUT.select(PATH$schedulingControls);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$schedulingControls = LAYOUT$schedulingControls.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$schedulingControls = LAYOUT.byteOffset(PATH$schedulingControls);
}

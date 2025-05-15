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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.html"><code>VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 perViewPositionAllComponents;
/// } VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX`
///
/// The {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.html"><code>VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX allocate(Arena arena) {
        VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX ret = new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX);
        return ret;
    }

    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX[] ret = new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX);
        }
        return ret;
    }

    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX clone(Arena arena, VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX src) {
        VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX[] clone(Arena arena, VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX[] src) {
        VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX);
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

    public @unsigned int perViewPositionAllComponents() {
        return segment.get(LAYOUT$perViewPositionAllComponents, OFFSET$perViewPositionAllComponents);
    }

    public void perViewPositionAllComponents(@unsigned int value) {
        segment.set(LAYOUT$perViewPositionAllComponents, OFFSET$perViewPositionAllComponents, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewPositionAllComponents")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$perViewPositionAllComponents = PathElement.groupElement("PATH$perViewPositionAllComponents");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$perViewPositionAllComponents = (OfInt) LAYOUT.select(PATH$perViewPositionAllComponents);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$perViewPositionAllComponents = LAYOUT$perViewPositionAllComponents.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perViewPositionAllComponents = LAYOUT.byteOffset(PATH$perViewPositionAllComponents);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.html"><code>VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 workgroupMemoryExplicitLayout;
///     VkBool32 workgroupMemoryExplicitLayoutScalarBlockLayout;
///     VkBool32 workgroupMemoryExplicitLayout8BitAccess;
///     VkBool32 workgroupMemoryExplicitLayout16BitAccess;
/// } VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR`
///
/// The {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.html"><code>VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR allocate(Arena arena) {
        VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR ret = new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR);
        return ret;
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] ret = new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR);
        }
        return ret;
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR clone(Arena arena, VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR src) {
        VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] src) {
        VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR);
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

    public @unsigned int workgroupMemoryExplicitLayout() {
        return segment.get(LAYOUT$workgroupMemoryExplicitLayout, OFFSET$workgroupMemoryExplicitLayout);
    }

    public void workgroupMemoryExplicitLayout(@unsigned int value) {
        segment.set(LAYOUT$workgroupMemoryExplicitLayout, OFFSET$workgroupMemoryExplicitLayout, value);
    }

    public @unsigned int workgroupMemoryExplicitLayoutScalarBlockLayout() {
        return segment.get(LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout, OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout);
    }

    public void workgroupMemoryExplicitLayoutScalarBlockLayout(@unsigned int value) {
        segment.set(LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout, OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout, value);
    }

    public @unsigned int workgroupMemoryExplicitLayout8BitAccess() {
        return segment.get(LAYOUT$workgroupMemoryExplicitLayout8BitAccess, OFFSET$workgroupMemoryExplicitLayout8BitAccess);
    }

    public void workgroupMemoryExplicitLayout8BitAccess(@unsigned int value) {
        segment.set(LAYOUT$workgroupMemoryExplicitLayout8BitAccess, OFFSET$workgroupMemoryExplicitLayout8BitAccess, value);
    }

    public @unsigned int workgroupMemoryExplicitLayout16BitAccess() {
        return segment.get(LAYOUT$workgroupMemoryExplicitLayout16BitAccess, OFFSET$workgroupMemoryExplicitLayout16BitAccess);
    }

    public void workgroupMemoryExplicitLayout16BitAccess(@unsigned int value) {
        segment.set(LAYOUT$workgroupMemoryExplicitLayout16BitAccess, OFFSET$workgroupMemoryExplicitLayout16BitAccess, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayoutScalarBlockLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout8BitAccess"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout16BitAccess")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$workgroupMemoryExplicitLayout = PathElement.groupElement("PATH$workgroupMemoryExplicitLayout");
    public static final PathElement PATH$workgroupMemoryExplicitLayoutScalarBlockLayout = PathElement.groupElement("PATH$workgroupMemoryExplicitLayoutScalarBlockLayout");
    public static final PathElement PATH$workgroupMemoryExplicitLayout8BitAccess = PathElement.groupElement("PATH$workgroupMemoryExplicitLayout8BitAccess");
    public static final PathElement PATH$workgroupMemoryExplicitLayout16BitAccess = PathElement.groupElement("PATH$workgroupMemoryExplicitLayout16BitAccess");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayout = (OfInt) LAYOUT.select(PATH$workgroupMemoryExplicitLayout);
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout = (OfInt) LAYOUT.select(PATH$workgroupMemoryExplicitLayoutScalarBlockLayout);
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayout8BitAccess = (OfInt) LAYOUT.select(PATH$workgroupMemoryExplicitLayout8BitAccess);
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayout16BitAccess = (OfInt) LAYOUT.select(PATH$workgroupMemoryExplicitLayout16BitAccess);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$workgroupMemoryExplicitLayout = LAYOUT$workgroupMemoryExplicitLayout.byteSize();
    public static final long SIZE$workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout.byteSize();
    public static final long SIZE$workgroupMemoryExplicitLayout8BitAccess = LAYOUT$workgroupMemoryExplicitLayout8BitAccess.byteSize();
    public static final long SIZE$workgroupMemoryExplicitLayout16BitAccess = LAYOUT$workgroupMemoryExplicitLayout16BitAccess.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$workgroupMemoryExplicitLayout = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayout);
    public static final long OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayoutScalarBlockLayout);
    public static final long OFFSET$workgroupMemoryExplicitLayout8BitAccess = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayout8BitAccess);
    public static final long OFFSET$workgroupMemoryExplicitLayout16BitAccess = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayout16BitAccess);
}

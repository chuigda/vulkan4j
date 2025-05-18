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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.html"><code>VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 multiviewPerViewViewports; // @link substring="multiviewPerViewViewports" target="#multiviewPerViewViewports"
/// } VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM`
///
/// The {@code allocate} ({@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM#allocate(Arena)}, {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.html"><code>VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM allocate(Arena arena) {
        VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ret = new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM);
        return ret;
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] ret = new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM);
        }
        return ret;
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM clone(Arena arena, VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM src) {
        VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] clone(Arena arena, VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] src) {
        VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM);
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

    public @unsigned int multiviewPerViewViewports() {
        return segment.get(LAYOUT$multiviewPerViewViewports, OFFSET$multiviewPerViewViewports);
    }

    public void multiviewPerViewViewports(@unsigned int value) {
        segment.set(LAYOUT$multiviewPerViewViewports, OFFSET$multiviewPerViewViewports, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiviewPerViewViewports")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$multiviewPerViewViewports = PathElement.groupElement("PATH$multiviewPerViewViewports");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$multiviewPerViewViewports = (OfInt) LAYOUT.select(PATH$multiviewPerViewViewports);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$multiviewPerViewViewports = LAYOUT$multiviewPerViewViewports.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$multiviewPerViewViewports = LAYOUT.byteOffset(PATH$multiviewPerViewViewports);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.html"><code>VkPhysicalDeviceExternalFormatResolvePropertiesANDROID</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceExternalFormatResolvePropertiesANDROID {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 nullColorAttachmentWithExternalFormatResolve; // @link substring="nullColorAttachmentWithExternalFormatResolve" target="#nullColorAttachmentWithExternalFormatResolve"
///     VkChromaLocation externalFormatResolveChromaOffsetX; // @link substring="VkChromaLocation" target="VkChromaLocation" @link substring="externalFormatResolveChromaOffsetX" target="#externalFormatResolveChromaOffsetX"
///     VkChromaLocation externalFormatResolveChromaOffsetY; // @link substring="VkChromaLocation" target="VkChromaLocation" @link substring="externalFormatResolveChromaOffsetY" target="#externalFormatResolveChromaOffsetY"
/// } VkPhysicalDeviceExternalFormatResolvePropertiesANDROID;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID`
///
/// The {@link VkPhysicalDeviceExternalFormatResolvePropertiesANDROID#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceExternalFormatResolvePropertiesANDROID#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.html"><code>VkPhysicalDeviceExternalFormatResolvePropertiesANDROID</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID allocate(Arena arena) {
        VkPhysicalDeviceExternalFormatResolvePropertiesANDROID ret = new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID);
        return ret;
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] ret = new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID);
        }
        return ret;
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID clone(Arena arena, VkPhysicalDeviceExternalFormatResolvePropertiesANDROID src) {
        VkPhysicalDeviceExternalFormatResolvePropertiesANDROID ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] clone(Arena arena, VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] src) {
        VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID);
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

    public @unsigned int nullColorAttachmentWithExternalFormatResolve() {
        return segment.get(LAYOUT$nullColorAttachmentWithExternalFormatResolve, OFFSET$nullColorAttachmentWithExternalFormatResolve);
    }

    public void nullColorAttachmentWithExternalFormatResolve(@unsigned int value) {
        segment.set(LAYOUT$nullColorAttachmentWithExternalFormatResolve, OFFSET$nullColorAttachmentWithExternalFormatResolve, value);
    }

    public @enumtype(VkChromaLocation.class) int externalFormatResolveChromaOffsetX() {
        return segment.get(LAYOUT$externalFormatResolveChromaOffsetX, OFFSET$externalFormatResolveChromaOffsetX);
    }

    public void externalFormatResolveChromaOffsetX(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$externalFormatResolveChromaOffsetX, OFFSET$externalFormatResolveChromaOffsetX, value);
    }

    public @enumtype(VkChromaLocation.class) int externalFormatResolveChromaOffsetY() {
        return segment.get(LAYOUT$externalFormatResolveChromaOffsetY, OFFSET$externalFormatResolveChromaOffsetY);
    }

    public void externalFormatResolveChromaOffsetY(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$externalFormatResolveChromaOffsetY, OFFSET$externalFormatResolveChromaOffsetY, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nullColorAttachmentWithExternalFormatResolve"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetX"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetY")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$nullColorAttachmentWithExternalFormatResolve = PathElement.groupElement("PATH$nullColorAttachmentWithExternalFormatResolve");
    public static final PathElement PATH$externalFormatResolveChromaOffsetX = PathElement.groupElement("PATH$externalFormatResolveChromaOffsetX");
    public static final PathElement PATH$externalFormatResolveChromaOffsetY = PathElement.groupElement("PATH$externalFormatResolveChromaOffsetY");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$nullColorAttachmentWithExternalFormatResolve = (OfInt) LAYOUT.select(PATH$nullColorAttachmentWithExternalFormatResolve);
    public static final OfInt LAYOUT$externalFormatResolveChromaOffsetX = (OfInt) LAYOUT.select(PATH$externalFormatResolveChromaOffsetX);
    public static final OfInt LAYOUT$externalFormatResolveChromaOffsetY = (OfInt) LAYOUT.select(PATH$externalFormatResolveChromaOffsetY);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$nullColorAttachmentWithExternalFormatResolve = LAYOUT$nullColorAttachmentWithExternalFormatResolve.byteSize();
    public static final long SIZE$externalFormatResolveChromaOffsetX = LAYOUT$externalFormatResolveChromaOffsetX.byteSize();
    public static final long SIZE$externalFormatResolveChromaOffsetY = LAYOUT$externalFormatResolveChromaOffsetY.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$nullColorAttachmentWithExternalFormatResolve = LAYOUT.byteOffset(PATH$nullColorAttachmentWithExternalFormatResolve);
    public static final long OFFSET$externalFormatResolveChromaOffsetX = LAYOUT.byteOffset(PATH$externalFormatResolveChromaOffsetX);
    public static final long OFFSET$externalFormatResolveChromaOffsetY = LAYOUT.byteOffset(PATH$externalFormatResolveChromaOffsetY);
}

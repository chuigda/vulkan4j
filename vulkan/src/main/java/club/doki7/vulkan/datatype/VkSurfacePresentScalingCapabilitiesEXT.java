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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfacePresentScalingCapabilitiesEXT.html"><code>VkSurfacePresentScalingCapabilitiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSurfacePresentScalingCapabilitiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPresentScalingFlagsEXT supportedPresentScaling; // optional // @link substring="VkPresentScalingFlagsEXT" target="VkPresentScalingFlagsEXT" @link substring="supportedPresentScaling" target="#supportedPresentScaling"
///     VkPresentGravityFlagsEXT supportedPresentGravityX; // optional // @link substring="VkPresentGravityFlagsEXT" target="VkPresentGravityFlagsEXT" @link substring="supportedPresentGravityX" target="#supportedPresentGravityX"
///     VkPresentGravityFlagsEXT supportedPresentGravityY; // optional // @link substring="VkPresentGravityFlagsEXT" target="VkPresentGravityFlagsEXT" @link substring="supportedPresentGravityY" target="#supportedPresentGravityY"
///     VkExtent2D minScaledImageExtent; // optional // @link substring="VkExtent2D" target="VkExtent2D" @link substring="minScaledImageExtent" target="#minScaledImageExtent"
///     VkExtent2D maxScaledImageExtent; // optional // @link substring="VkExtent2D" target="VkExtent2D" @link substring="maxScaledImageExtent" target="#maxScaledImageExtent"
/// } VkSurfacePresentScalingCapabilitiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT`
///
/// The {@code allocate} ({@link VkSurfacePresentScalingCapabilitiesEXT#allocate(Arena)}, {@link VkSurfacePresentScalingCapabilitiesEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkSurfacePresentScalingCapabilitiesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfacePresentScalingCapabilitiesEXT.html"><code>VkSurfacePresentScalingCapabilitiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSurfacePresentScalingCapabilitiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkSurfacePresentScalingCapabilitiesEXT allocate(Arena arena) {
        VkSurfacePresentScalingCapabilitiesEXT ret = new VkSurfacePresentScalingCapabilitiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SURFACE_PRESENT_SCALING_CAPABILITIES_EXT);
        return ret;
    }

    public static VkSurfacePresentScalingCapabilitiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfacePresentScalingCapabilitiesEXT[] ret = new VkSurfacePresentScalingCapabilitiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSurfacePresentScalingCapabilitiesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SURFACE_PRESENT_SCALING_CAPABILITIES_EXT);
        }
        return ret;
    }

    public static VkSurfacePresentScalingCapabilitiesEXT clone(Arena arena, VkSurfacePresentScalingCapabilitiesEXT src) {
        VkSurfacePresentScalingCapabilitiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSurfacePresentScalingCapabilitiesEXT[] clone(Arena arena, VkSurfacePresentScalingCapabilitiesEXT[] src) {
        VkSurfacePresentScalingCapabilitiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SURFACE_PRESENT_SCALING_CAPABILITIES_EXT);
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

    public @enumtype(VkPresentScalingFlagsEXT.class) int supportedPresentScaling() {
        return segment.get(LAYOUT$supportedPresentScaling, OFFSET$supportedPresentScaling);
    }

    public void supportedPresentScaling(@enumtype(VkPresentScalingFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedPresentScaling, OFFSET$supportedPresentScaling, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int supportedPresentGravityX() {
        return segment.get(LAYOUT$supportedPresentGravityX, OFFSET$supportedPresentGravityX);
    }

    public void supportedPresentGravityX(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedPresentGravityX, OFFSET$supportedPresentGravityX, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int supportedPresentGravityY() {
        return segment.get(LAYOUT$supportedPresentGravityY, OFFSET$supportedPresentGravityY);
    }

    public void supportedPresentGravityY(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedPresentGravityY, OFFSET$supportedPresentGravityY, value);
    }

    public @NotNull VkExtent2D minScaledImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minScaledImageExtent, LAYOUT$minScaledImageExtent));
    }

    public void minScaledImageExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minScaledImageExtent, SIZE$minScaledImageExtent);
    }

    public @NotNull VkExtent2D maxScaledImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxScaledImageExtent, LAYOUT$maxScaledImageExtent));
    }

    public void maxScaledImageExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxScaledImageExtent, SIZE$maxScaledImageExtent);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedPresentScaling"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityX"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityY"),
        VkExtent2D.LAYOUT.withName("minScaledImageExtent"),
        VkExtent2D.LAYOUT.withName("maxScaledImageExtent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$supportedPresentScaling = PathElement.groupElement("PATH$supportedPresentScaling");
    public static final PathElement PATH$supportedPresentGravityX = PathElement.groupElement("PATH$supportedPresentGravityX");
    public static final PathElement PATH$supportedPresentGravityY = PathElement.groupElement("PATH$supportedPresentGravityY");
    public static final PathElement PATH$minScaledImageExtent = PathElement.groupElement("PATH$minScaledImageExtent");
    public static final PathElement PATH$maxScaledImageExtent = PathElement.groupElement("PATH$maxScaledImageExtent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$supportedPresentScaling = (OfInt) LAYOUT.select(PATH$supportedPresentScaling);
    public static final OfInt LAYOUT$supportedPresentGravityX = (OfInt) LAYOUT.select(PATH$supportedPresentGravityX);
    public static final OfInt LAYOUT$supportedPresentGravityY = (OfInt) LAYOUT.select(PATH$supportedPresentGravityY);
    public static final StructLayout LAYOUT$minScaledImageExtent = (StructLayout) LAYOUT.select(PATH$minScaledImageExtent);
    public static final StructLayout LAYOUT$maxScaledImageExtent = (StructLayout) LAYOUT.select(PATH$maxScaledImageExtent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$supportedPresentScaling = LAYOUT$supportedPresentScaling.byteSize();
    public static final long SIZE$supportedPresentGravityX = LAYOUT$supportedPresentGravityX.byteSize();
    public static final long SIZE$supportedPresentGravityY = LAYOUT$supportedPresentGravityY.byteSize();
    public static final long SIZE$minScaledImageExtent = LAYOUT$minScaledImageExtent.byteSize();
    public static final long SIZE$maxScaledImageExtent = LAYOUT$maxScaledImageExtent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportedPresentScaling = LAYOUT.byteOffset(PATH$supportedPresentScaling);
    public static final long OFFSET$supportedPresentGravityX = LAYOUT.byteOffset(PATH$supportedPresentGravityX);
    public static final long OFFSET$supportedPresentGravityY = LAYOUT.byteOffset(PATH$supportedPresentGravityY);
    public static final long OFFSET$minScaledImageExtent = LAYOUT.byteOffset(PATH$minScaledImageExtent);
    public static final long OFFSET$maxScaledImageExtent = LAYOUT.byteOffset(PATH$maxScaledImageExtent);
}

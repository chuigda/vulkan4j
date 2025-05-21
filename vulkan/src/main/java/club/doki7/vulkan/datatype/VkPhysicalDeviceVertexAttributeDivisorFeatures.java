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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVertexAttributeDivisorFeatures.html"><code>VkPhysicalDeviceVertexAttributeDivisorFeatures</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVertexAttributeDivisorFeatures {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 vertexAttributeInstanceRateDivisor; // @link substring="vertexAttributeInstanceRateDivisor" target="#vertexAttributeInstanceRateDivisor"
///     VkBool32 vertexAttributeInstanceRateZeroDivisor; // @link substring="vertexAttributeInstanceRateZeroDivisor" target="#vertexAttributeInstanceRateZeroDivisor"
/// } VkPhysicalDeviceVertexAttributeDivisorFeatures;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES`
///
/// The {@code allocate} ({@link VkPhysicalDeviceVertexAttributeDivisorFeatures#allocate(Arena)}, {@link VkPhysicalDeviceVertexAttributeDivisorFeatures#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceVertexAttributeDivisorFeatures#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVertexAttributeDivisorFeatures.html"><code>VkPhysicalDeviceVertexAttributeDivisorFeatures</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceVertexAttributeDivisorFeatures(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures allocate(Arena arena) {
        VkPhysicalDeviceVertexAttributeDivisorFeatures ret = new VkPhysicalDeviceVertexAttributeDivisorFeatures(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES);
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVertexAttributeDivisorFeatures[] ret = new VkPhysicalDeviceVertexAttributeDivisorFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES);
        }
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorFeatures src) {
        VkPhysicalDeviceVertexAttributeDivisorFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures[] clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorFeatures[] src) {
        VkPhysicalDeviceVertexAttributeDivisorFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES);
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

    public @unsigned int vertexAttributeInstanceRateDivisor() {
        return segment.get(LAYOUT$vertexAttributeInstanceRateDivisor, OFFSET$vertexAttributeInstanceRateDivisor);
    }

    public void vertexAttributeInstanceRateDivisor(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeInstanceRateDivisor, OFFSET$vertexAttributeInstanceRateDivisor, value);
    }

    public @unsigned int vertexAttributeInstanceRateZeroDivisor() {
        return segment.get(LAYOUT$vertexAttributeInstanceRateZeroDivisor, OFFSET$vertexAttributeInstanceRateZeroDivisor);
    }

    public void vertexAttributeInstanceRateZeroDivisor(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeInstanceRateZeroDivisor, OFFSET$vertexAttributeInstanceRateZeroDivisor, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vertexAttributeInstanceRateDivisor = PathElement.groupElement("vertexAttributeInstanceRateDivisor");
    public static final PathElement PATH$vertexAttributeInstanceRateZeroDivisor = PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexAttributeInstanceRateDivisor = (OfInt) LAYOUT.select(PATH$vertexAttributeInstanceRateDivisor);
    public static final OfInt LAYOUT$vertexAttributeInstanceRateZeroDivisor = (OfInt) LAYOUT.select(PATH$vertexAttributeInstanceRateZeroDivisor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexAttributeInstanceRateDivisor = LAYOUT$vertexAttributeInstanceRateDivisor.byteSize();
    public static final long SIZE$vertexAttributeInstanceRateZeroDivisor = LAYOUT$vertexAttributeInstanceRateZeroDivisor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexAttributeInstanceRateDivisor = LAYOUT.byteOffset(PATH$vertexAttributeInstanceRateDivisor);
    public static final long OFFSET$vertexAttributeInstanceRateZeroDivisor = LAYOUT.byteOffset(PATH$vertexAttributeInstanceRateZeroDivisor);
}

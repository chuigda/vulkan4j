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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.html"><code>VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 shaderImageInt64Atomics; // @link substring="shaderImageInt64Atomics" target="#shaderImageInt64Atomics"
///     VkBool32 sparseImageInt64Atomics; // @link substring="sparseImageInt64Atomics" target="#sparseImageInt64Atomics"
/// } VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#allocate(Arena)}, {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.html"><code>VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ret = new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] ret = new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT clone(Arena arena, VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT src) {
        VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] clone(Arena arena, VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] src) {
        VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT);
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

    public @unsigned int shaderImageInt64Atomics() {
        return segment.get(LAYOUT$shaderImageInt64Atomics, OFFSET$shaderImageInt64Atomics);
    }

    public void shaderImageInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderImageInt64Atomics, OFFSET$shaderImageInt64Atomics, value);
    }

    public @unsigned int sparseImageInt64Atomics() {
        return segment.get(LAYOUT$sparseImageInt64Atomics, OFFSET$sparseImageInt64Atomics);
    }

    public void sparseImageInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$sparseImageInt64Atomics, OFFSET$sparseImageInt64Atomics, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderImageInt64Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageInt64Atomics")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderImageInt64Atomics = PathElement.groupElement("PATH$shaderImageInt64Atomics");
    public static final PathElement PATH$sparseImageInt64Atomics = PathElement.groupElement("PATH$sparseImageInt64Atomics");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderImageInt64Atomics = (OfInt) LAYOUT.select(PATH$shaderImageInt64Atomics);
    public static final OfInt LAYOUT$sparseImageInt64Atomics = (OfInt) LAYOUT.select(PATH$sparseImageInt64Atomics);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderImageInt64Atomics = LAYOUT$shaderImageInt64Atomics.byteSize();
    public static final long SIZE$sparseImageInt64Atomics = LAYOUT$sparseImageInt64Atomics.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderImageInt64Atomics = LAYOUT.byteOffset(PATH$shaderImageInt64Atomics);
    public static final long OFFSET$sparseImageInt64Atomics = LAYOUT.byteOffset(PATH$sparseImageInt64Atomics);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.html"><code>VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 shaderBufferFloat16Atomics;
///     VkBool32 shaderBufferFloat16AtomicAdd;
///     VkBool32 shaderBufferFloat16AtomicMinMax;
///     VkBool32 shaderBufferFloat32AtomicMinMax;
///     VkBool32 shaderBufferFloat64AtomicMinMax;
///     VkBool32 shaderSharedFloat16Atomics;
///     VkBool32 shaderSharedFloat16AtomicAdd;
///     VkBool32 shaderSharedFloat16AtomicMinMax;
///     VkBool32 shaderSharedFloat32AtomicMinMax;
///     VkBool32 shaderSharedFloat64AtomicMinMax;
///     VkBool32 shaderImageFloat32AtomicMinMax;
///     VkBool32 sparseImageFloat32AtomicMinMax;
/// } VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT`
///
/// The {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.html"><code>VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ret = new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT[] ret = new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT clone(Arena arena, VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT src) {
        VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT[] clone(Arena arena, VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT[] src) {
        VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT);
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

    public @unsigned int shaderBufferFloat16Atomics() {
        return segment.get(LAYOUT$shaderBufferFloat16Atomics, OFFSET$shaderBufferFloat16Atomics);
    }

    public void shaderBufferFloat16Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat16Atomics, OFFSET$shaderBufferFloat16Atomics, value);
    }

    public @unsigned int shaderBufferFloat16AtomicAdd() {
        return segment.get(LAYOUT$shaderBufferFloat16AtomicAdd, OFFSET$shaderBufferFloat16AtomicAdd);
    }

    public void shaderBufferFloat16AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat16AtomicAdd, OFFSET$shaderBufferFloat16AtomicAdd, value);
    }

    public @unsigned int shaderBufferFloat16AtomicMinMax() {
        return segment.get(LAYOUT$shaderBufferFloat16AtomicMinMax, OFFSET$shaderBufferFloat16AtomicMinMax);
    }

    public void shaderBufferFloat16AtomicMinMax(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat16AtomicMinMax, OFFSET$shaderBufferFloat16AtomicMinMax, value);
    }

    public @unsigned int shaderBufferFloat32AtomicMinMax() {
        return segment.get(LAYOUT$shaderBufferFloat32AtomicMinMax, OFFSET$shaderBufferFloat32AtomicMinMax);
    }

    public void shaderBufferFloat32AtomicMinMax(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat32AtomicMinMax, OFFSET$shaderBufferFloat32AtomicMinMax, value);
    }

    public @unsigned int shaderBufferFloat64AtomicMinMax() {
        return segment.get(LAYOUT$shaderBufferFloat64AtomicMinMax, OFFSET$shaderBufferFloat64AtomicMinMax);
    }

    public void shaderBufferFloat64AtomicMinMax(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat64AtomicMinMax, OFFSET$shaderBufferFloat64AtomicMinMax, value);
    }

    public @unsigned int shaderSharedFloat16Atomics() {
        return segment.get(LAYOUT$shaderSharedFloat16Atomics, OFFSET$shaderSharedFloat16Atomics);
    }

    public void shaderSharedFloat16Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat16Atomics, OFFSET$shaderSharedFloat16Atomics, value);
    }

    public @unsigned int shaderSharedFloat16AtomicAdd() {
        return segment.get(LAYOUT$shaderSharedFloat16AtomicAdd, OFFSET$shaderSharedFloat16AtomicAdd);
    }

    public void shaderSharedFloat16AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat16AtomicAdd, OFFSET$shaderSharedFloat16AtomicAdd, value);
    }

    public @unsigned int shaderSharedFloat16AtomicMinMax() {
        return segment.get(LAYOUT$shaderSharedFloat16AtomicMinMax, OFFSET$shaderSharedFloat16AtomicMinMax);
    }

    public void shaderSharedFloat16AtomicMinMax(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat16AtomicMinMax, OFFSET$shaderSharedFloat16AtomicMinMax, value);
    }

    public @unsigned int shaderSharedFloat32AtomicMinMax() {
        return segment.get(LAYOUT$shaderSharedFloat32AtomicMinMax, OFFSET$shaderSharedFloat32AtomicMinMax);
    }

    public void shaderSharedFloat32AtomicMinMax(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat32AtomicMinMax, OFFSET$shaderSharedFloat32AtomicMinMax, value);
    }

    public @unsigned int shaderSharedFloat64AtomicMinMax() {
        return segment.get(LAYOUT$shaderSharedFloat64AtomicMinMax, OFFSET$shaderSharedFloat64AtomicMinMax);
    }

    public void shaderSharedFloat64AtomicMinMax(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat64AtomicMinMax, OFFSET$shaderSharedFloat64AtomicMinMax, value);
    }

    public @unsigned int shaderImageFloat32AtomicMinMax() {
        return segment.get(LAYOUT$shaderImageFloat32AtomicMinMax, OFFSET$shaderImageFloat32AtomicMinMax);
    }

    public void shaderImageFloat32AtomicMinMax(@unsigned int value) {
        segment.set(LAYOUT$shaderImageFloat32AtomicMinMax, OFFSET$shaderImageFloat32AtomicMinMax, value);
    }

    public @unsigned int sparseImageFloat32AtomicMinMax() {
        return segment.get(LAYOUT$sparseImageFloat32AtomicMinMax, OFFSET$sparseImageFloat32AtomicMinMax);
    }

    public void sparseImageFloat32AtomicMinMax(@unsigned int value) {
        segment.set(LAYOUT$sparseImageFloat32AtomicMinMax, OFFSET$sparseImageFloat32AtomicMinMax, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicMinMax")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderBufferFloat16Atomics = PathElement.groupElement("PATH$shaderBufferFloat16Atomics");
    public static final PathElement PATH$shaderBufferFloat16AtomicAdd = PathElement.groupElement("PATH$shaderBufferFloat16AtomicAdd");
    public static final PathElement PATH$shaderBufferFloat16AtomicMinMax = PathElement.groupElement("PATH$shaderBufferFloat16AtomicMinMax");
    public static final PathElement PATH$shaderBufferFloat32AtomicMinMax = PathElement.groupElement("PATH$shaderBufferFloat32AtomicMinMax");
    public static final PathElement PATH$shaderBufferFloat64AtomicMinMax = PathElement.groupElement("PATH$shaderBufferFloat64AtomicMinMax");
    public static final PathElement PATH$shaderSharedFloat16Atomics = PathElement.groupElement("PATH$shaderSharedFloat16Atomics");
    public static final PathElement PATH$shaderSharedFloat16AtomicAdd = PathElement.groupElement("PATH$shaderSharedFloat16AtomicAdd");
    public static final PathElement PATH$shaderSharedFloat16AtomicMinMax = PathElement.groupElement("PATH$shaderSharedFloat16AtomicMinMax");
    public static final PathElement PATH$shaderSharedFloat32AtomicMinMax = PathElement.groupElement("PATH$shaderSharedFloat32AtomicMinMax");
    public static final PathElement PATH$shaderSharedFloat64AtomicMinMax = PathElement.groupElement("PATH$shaderSharedFloat64AtomicMinMax");
    public static final PathElement PATH$shaderImageFloat32AtomicMinMax = PathElement.groupElement("PATH$shaderImageFloat32AtomicMinMax");
    public static final PathElement PATH$sparseImageFloat32AtomicMinMax = PathElement.groupElement("PATH$sparseImageFloat32AtomicMinMax");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderBufferFloat16Atomics = (OfInt) LAYOUT.select(PATH$shaderBufferFloat16Atomics);
    public static final OfInt LAYOUT$shaderBufferFloat16AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderBufferFloat16AtomicAdd);
    public static final OfInt LAYOUT$shaderBufferFloat16AtomicMinMax = (OfInt) LAYOUT.select(PATH$shaderBufferFloat16AtomicMinMax);
    public static final OfInt LAYOUT$shaderBufferFloat32AtomicMinMax = (OfInt) LAYOUT.select(PATH$shaderBufferFloat32AtomicMinMax);
    public static final OfInt LAYOUT$shaderBufferFloat64AtomicMinMax = (OfInt) LAYOUT.select(PATH$shaderBufferFloat64AtomicMinMax);
    public static final OfInt LAYOUT$shaderSharedFloat16Atomics = (OfInt) LAYOUT.select(PATH$shaderSharedFloat16Atomics);
    public static final OfInt LAYOUT$shaderSharedFloat16AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderSharedFloat16AtomicAdd);
    public static final OfInt LAYOUT$shaderSharedFloat16AtomicMinMax = (OfInt) LAYOUT.select(PATH$shaderSharedFloat16AtomicMinMax);
    public static final OfInt LAYOUT$shaderSharedFloat32AtomicMinMax = (OfInt) LAYOUT.select(PATH$shaderSharedFloat32AtomicMinMax);
    public static final OfInt LAYOUT$shaderSharedFloat64AtomicMinMax = (OfInt) LAYOUT.select(PATH$shaderSharedFloat64AtomicMinMax);
    public static final OfInt LAYOUT$shaderImageFloat32AtomicMinMax = (OfInt) LAYOUT.select(PATH$shaderImageFloat32AtomicMinMax);
    public static final OfInt LAYOUT$sparseImageFloat32AtomicMinMax = (OfInt) LAYOUT.select(PATH$sparseImageFloat32AtomicMinMax);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderBufferFloat16Atomics = LAYOUT$shaderBufferFloat16Atomics.byteSize();
    public static final long SIZE$shaderBufferFloat16AtomicAdd = LAYOUT$shaderBufferFloat16AtomicAdd.byteSize();
    public static final long SIZE$shaderBufferFloat16AtomicMinMax = LAYOUT$shaderBufferFloat16AtomicMinMax.byteSize();
    public static final long SIZE$shaderBufferFloat32AtomicMinMax = LAYOUT$shaderBufferFloat32AtomicMinMax.byteSize();
    public static final long SIZE$shaderBufferFloat64AtomicMinMax = LAYOUT$shaderBufferFloat64AtomicMinMax.byteSize();
    public static final long SIZE$shaderSharedFloat16Atomics = LAYOUT$shaderSharedFloat16Atomics.byteSize();
    public static final long SIZE$shaderSharedFloat16AtomicAdd = LAYOUT$shaderSharedFloat16AtomicAdd.byteSize();
    public static final long SIZE$shaderSharedFloat16AtomicMinMax = LAYOUT$shaderSharedFloat16AtomicMinMax.byteSize();
    public static final long SIZE$shaderSharedFloat32AtomicMinMax = LAYOUT$shaderSharedFloat32AtomicMinMax.byteSize();
    public static final long SIZE$shaderSharedFloat64AtomicMinMax = LAYOUT$shaderSharedFloat64AtomicMinMax.byteSize();
    public static final long SIZE$shaderImageFloat32AtomicMinMax = LAYOUT$shaderImageFloat32AtomicMinMax.byteSize();
    public static final long SIZE$sparseImageFloat32AtomicMinMax = LAYOUT$sparseImageFloat32AtomicMinMax.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderBufferFloat16Atomics = LAYOUT.byteOffset(PATH$shaderBufferFloat16Atomics);
    public static final long OFFSET$shaderBufferFloat16AtomicAdd = LAYOUT.byteOffset(PATH$shaderBufferFloat16AtomicAdd);
    public static final long OFFSET$shaderBufferFloat16AtomicMinMax = LAYOUT.byteOffset(PATH$shaderBufferFloat16AtomicMinMax);
    public static final long OFFSET$shaderBufferFloat32AtomicMinMax = LAYOUT.byteOffset(PATH$shaderBufferFloat32AtomicMinMax);
    public static final long OFFSET$shaderBufferFloat64AtomicMinMax = LAYOUT.byteOffset(PATH$shaderBufferFloat64AtomicMinMax);
    public static final long OFFSET$shaderSharedFloat16Atomics = LAYOUT.byteOffset(PATH$shaderSharedFloat16Atomics);
    public static final long OFFSET$shaderSharedFloat16AtomicAdd = LAYOUT.byteOffset(PATH$shaderSharedFloat16AtomicAdd);
    public static final long OFFSET$shaderSharedFloat16AtomicMinMax = LAYOUT.byteOffset(PATH$shaderSharedFloat16AtomicMinMax);
    public static final long OFFSET$shaderSharedFloat32AtomicMinMax = LAYOUT.byteOffset(PATH$shaderSharedFloat32AtomicMinMax);
    public static final long OFFSET$shaderSharedFloat64AtomicMinMax = LAYOUT.byteOffset(PATH$shaderSharedFloat64AtomicMinMax);
    public static final long OFFSET$shaderImageFloat32AtomicMinMax = LAYOUT.byteOffset(PATH$shaderImageFloat32AtomicMinMax);
    public static final long OFFSET$sparseImageFloat32AtomicMinMax = LAYOUT.byteOffset(PATH$sparseImageFloat32AtomicMinMax);
}

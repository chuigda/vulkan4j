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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.html"><code>VkPhysicalDeviceShaderAtomicFloatFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 shaderBufferFloat32Atomics;
///     VkBool32 shaderBufferFloat32AtomicAdd;
///     VkBool32 shaderBufferFloat64Atomics;
///     VkBool32 shaderBufferFloat64AtomicAdd;
///     VkBool32 shaderSharedFloat32Atomics;
///     VkBool32 shaderSharedFloat32AtomicAdd;
///     VkBool32 shaderSharedFloat64Atomics;
///     VkBool32 shaderSharedFloat64AtomicAdd;
///     VkBool32 shaderImageFloat32Atomics;
///     VkBool32 shaderImageFloat32AtomicAdd;
///     VkBool32 sparseImageFloat32Atomics;
///     VkBool32 sparseImageFloat32AtomicAdd;
/// } VkPhysicalDeviceShaderAtomicFloatFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT`
///
/// The {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.html"><code>VkPhysicalDeviceShaderAtomicFloatFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceShaderAtomicFloatFeaturesEXT ret = new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderAtomicFloatFeaturesEXT[] ret = new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT clone(Arena arena, VkPhysicalDeviceShaderAtomicFloatFeaturesEXT src) {
        VkPhysicalDeviceShaderAtomicFloatFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceShaderAtomicFloatFeaturesEXT[] src) {
        VkPhysicalDeviceShaderAtomicFloatFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT);
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

    public @unsigned int shaderBufferFloat32Atomics() {
        return segment.get(LAYOUT$shaderBufferFloat32Atomics, OFFSET$shaderBufferFloat32Atomics);
    }

    public void shaderBufferFloat32Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat32Atomics, OFFSET$shaderBufferFloat32Atomics, value);
    }

    public @unsigned int shaderBufferFloat32AtomicAdd() {
        return segment.get(LAYOUT$shaderBufferFloat32AtomicAdd, OFFSET$shaderBufferFloat32AtomicAdd);
    }

    public void shaderBufferFloat32AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat32AtomicAdd, OFFSET$shaderBufferFloat32AtomicAdd, value);
    }

    public @unsigned int shaderBufferFloat64Atomics() {
        return segment.get(LAYOUT$shaderBufferFloat64Atomics, OFFSET$shaderBufferFloat64Atomics);
    }

    public void shaderBufferFloat64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat64Atomics, OFFSET$shaderBufferFloat64Atomics, value);
    }

    public @unsigned int shaderBufferFloat64AtomicAdd() {
        return segment.get(LAYOUT$shaderBufferFloat64AtomicAdd, OFFSET$shaderBufferFloat64AtomicAdd);
    }

    public void shaderBufferFloat64AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferFloat64AtomicAdd, OFFSET$shaderBufferFloat64AtomicAdd, value);
    }

    public @unsigned int shaderSharedFloat32Atomics() {
        return segment.get(LAYOUT$shaderSharedFloat32Atomics, OFFSET$shaderSharedFloat32Atomics);
    }

    public void shaderSharedFloat32Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat32Atomics, OFFSET$shaderSharedFloat32Atomics, value);
    }

    public @unsigned int shaderSharedFloat32AtomicAdd() {
        return segment.get(LAYOUT$shaderSharedFloat32AtomicAdd, OFFSET$shaderSharedFloat32AtomicAdd);
    }

    public void shaderSharedFloat32AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat32AtomicAdd, OFFSET$shaderSharedFloat32AtomicAdd, value);
    }

    public @unsigned int shaderSharedFloat64Atomics() {
        return segment.get(LAYOUT$shaderSharedFloat64Atomics, OFFSET$shaderSharedFloat64Atomics);
    }

    public void shaderSharedFloat64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat64Atomics, OFFSET$shaderSharedFloat64Atomics, value);
    }

    public @unsigned int shaderSharedFloat64AtomicAdd() {
        return segment.get(LAYOUT$shaderSharedFloat64AtomicAdd, OFFSET$shaderSharedFloat64AtomicAdd);
    }

    public void shaderSharedFloat64AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedFloat64AtomicAdd, OFFSET$shaderSharedFloat64AtomicAdd, value);
    }

    public @unsigned int shaderImageFloat32Atomics() {
        return segment.get(LAYOUT$shaderImageFloat32Atomics, OFFSET$shaderImageFloat32Atomics);
    }

    public void shaderImageFloat32Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderImageFloat32Atomics, OFFSET$shaderImageFloat32Atomics, value);
    }

    public @unsigned int shaderImageFloat32AtomicAdd() {
        return segment.get(LAYOUT$shaderImageFloat32AtomicAdd, OFFSET$shaderImageFloat32AtomicAdd);
    }

    public void shaderImageFloat32AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$shaderImageFloat32AtomicAdd, OFFSET$shaderImageFloat32AtomicAdd, value);
    }

    public @unsigned int sparseImageFloat32Atomics() {
        return segment.get(LAYOUT$sparseImageFloat32Atomics, OFFSET$sparseImageFloat32Atomics);
    }

    public void sparseImageFloat32Atomics(@unsigned int value) {
        segment.set(LAYOUT$sparseImageFloat32Atomics, OFFSET$sparseImageFloat32Atomics, value);
    }

    public @unsigned int sparseImageFloat32AtomicAdd() {
        return segment.get(LAYOUT$sparseImageFloat32AtomicAdd, OFFSET$sparseImageFloat32AtomicAdd);
    }

    public void sparseImageFloat32AtomicAdd(@unsigned int value) {
        segment.set(LAYOUT$sparseImageFloat32AtomicAdd, OFFSET$sparseImageFloat32AtomicAdd, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicAdd")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderBufferFloat32Atomics = PathElement.groupElement("PATH$shaderBufferFloat32Atomics");
    public static final PathElement PATH$shaderBufferFloat32AtomicAdd = PathElement.groupElement("PATH$shaderBufferFloat32AtomicAdd");
    public static final PathElement PATH$shaderBufferFloat64Atomics = PathElement.groupElement("PATH$shaderBufferFloat64Atomics");
    public static final PathElement PATH$shaderBufferFloat64AtomicAdd = PathElement.groupElement("PATH$shaderBufferFloat64AtomicAdd");
    public static final PathElement PATH$shaderSharedFloat32Atomics = PathElement.groupElement("PATH$shaderSharedFloat32Atomics");
    public static final PathElement PATH$shaderSharedFloat32AtomicAdd = PathElement.groupElement("PATH$shaderSharedFloat32AtomicAdd");
    public static final PathElement PATH$shaderSharedFloat64Atomics = PathElement.groupElement("PATH$shaderSharedFloat64Atomics");
    public static final PathElement PATH$shaderSharedFloat64AtomicAdd = PathElement.groupElement("PATH$shaderSharedFloat64AtomicAdd");
    public static final PathElement PATH$shaderImageFloat32Atomics = PathElement.groupElement("PATH$shaderImageFloat32Atomics");
    public static final PathElement PATH$shaderImageFloat32AtomicAdd = PathElement.groupElement("PATH$shaderImageFloat32AtomicAdd");
    public static final PathElement PATH$sparseImageFloat32Atomics = PathElement.groupElement("PATH$sparseImageFloat32Atomics");
    public static final PathElement PATH$sparseImageFloat32AtomicAdd = PathElement.groupElement("PATH$sparseImageFloat32AtomicAdd");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderBufferFloat32Atomics = (OfInt) LAYOUT.select(PATH$shaderBufferFloat32Atomics);
    public static final OfInt LAYOUT$shaderBufferFloat32AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderBufferFloat32AtomicAdd);
    public static final OfInt LAYOUT$shaderBufferFloat64Atomics = (OfInt) LAYOUT.select(PATH$shaderBufferFloat64Atomics);
    public static final OfInt LAYOUT$shaderBufferFloat64AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderBufferFloat64AtomicAdd);
    public static final OfInt LAYOUT$shaderSharedFloat32Atomics = (OfInt) LAYOUT.select(PATH$shaderSharedFloat32Atomics);
    public static final OfInt LAYOUT$shaderSharedFloat32AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderSharedFloat32AtomicAdd);
    public static final OfInt LAYOUT$shaderSharedFloat64Atomics = (OfInt) LAYOUT.select(PATH$shaderSharedFloat64Atomics);
    public static final OfInt LAYOUT$shaderSharedFloat64AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderSharedFloat64AtomicAdd);
    public static final OfInt LAYOUT$shaderImageFloat32Atomics = (OfInt) LAYOUT.select(PATH$shaderImageFloat32Atomics);
    public static final OfInt LAYOUT$shaderImageFloat32AtomicAdd = (OfInt) LAYOUT.select(PATH$shaderImageFloat32AtomicAdd);
    public static final OfInt LAYOUT$sparseImageFloat32Atomics = (OfInt) LAYOUT.select(PATH$sparseImageFloat32Atomics);
    public static final OfInt LAYOUT$sparseImageFloat32AtomicAdd = (OfInt) LAYOUT.select(PATH$sparseImageFloat32AtomicAdd);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderBufferFloat32Atomics = LAYOUT$shaderBufferFloat32Atomics.byteSize();
    public static final long SIZE$shaderBufferFloat32AtomicAdd = LAYOUT$shaderBufferFloat32AtomicAdd.byteSize();
    public static final long SIZE$shaderBufferFloat64Atomics = LAYOUT$shaderBufferFloat64Atomics.byteSize();
    public static final long SIZE$shaderBufferFloat64AtomicAdd = LAYOUT$shaderBufferFloat64AtomicAdd.byteSize();
    public static final long SIZE$shaderSharedFloat32Atomics = LAYOUT$shaderSharedFloat32Atomics.byteSize();
    public static final long SIZE$shaderSharedFloat32AtomicAdd = LAYOUT$shaderSharedFloat32AtomicAdd.byteSize();
    public static final long SIZE$shaderSharedFloat64Atomics = LAYOUT$shaderSharedFloat64Atomics.byteSize();
    public static final long SIZE$shaderSharedFloat64AtomicAdd = LAYOUT$shaderSharedFloat64AtomicAdd.byteSize();
    public static final long SIZE$shaderImageFloat32Atomics = LAYOUT$shaderImageFloat32Atomics.byteSize();
    public static final long SIZE$shaderImageFloat32AtomicAdd = LAYOUT$shaderImageFloat32AtomicAdd.byteSize();
    public static final long SIZE$sparseImageFloat32Atomics = LAYOUT$sparseImageFloat32Atomics.byteSize();
    public static final long SIZE$sparseImageFloat32AtomicAdd = LAYOUT$sparseImageFloat32AtomicAdd.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderBufferFloat32Atomics = LAYOUT.byteOffset(PATH$shaderBufferFloat32Atomics);
    public static final long OFFSET$shaderBufferFloat32AtomicAdd = LAYOUT.byteOffset(PATH$shaderBufferFloat32AtomicAdd);
    public static final long OFFSET$shaderBufferFloat64Atomics = LAYOUT.byteOffset(PATH$shaderBufferFloat64Atomics);
    public static final long OFFSET$shaderBufferFloat64AtomicAdd = LAYOUT.byteOffset(PATH$shaderBufferFloat64AtomicAdd);
    public static final long OFFSET$shaderSharedFloat32Atomics = LAYOUT.byteOffset(PATH$shaderSharedFloat32Atomics);
    public static final long OFFSET$shaderSharedFloat32AtomicAdd = LAYOUT.byteOffset(PATH$shaderSharedFloat32AtomicAdd);
    public static final long OFFSET$shaderSharedFloat64Atomics = LAYOUT.byteOffset(PATH$shaderSharedFloat64Atomics);
    public static final long OFFSET$shaderSharedFloat64AtomicAdd = LAYOUT.byteOffset(PATH$shaderSharedFloat64AtomicAdd);
    public static final long OFFSET$shaderImageFloat32Atomics = LAYOUT.byteOffset(PATH$shaderImageFloat32Atomics);
    public static final long OFFSET$shaderImageFloat32AtomicAdd = LAYOUT.byteOffset(PATH$shaderImageFloat32AtomicAdd);
    public static final long OFFSET$sparseImageFloat32Atomics = LAYOUT.byteOffset(PATH$sparseImageFloat32Atomics);
    public static final long OFFSET$sparseImageFloat32AtomicAdd = LAYOUT.byteOffset(PATH$sparseImageFloat32AtomicAdd);
}

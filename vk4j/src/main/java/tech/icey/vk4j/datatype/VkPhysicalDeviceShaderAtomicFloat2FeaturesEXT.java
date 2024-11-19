package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
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
/// } VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.html">VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT</a>
public record VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT[] ret = new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderBufferFloat16Atomics = PathElement.groupElement("shaderBufferFloat16Atomics");
    public static final PathElement PATH$shaderBufferFloat16AtomicAdd = PathElement.groupElement("shaderBufferFloat16AtomicAdd");
    public static final PathElement PATH$shaderBufferFloat16AtomicMinMax = PathElement.groupElement("shaderBufferFloat16AtomicMinMax");
    public static final PathElement PATH$shaderBufferFloat32AtomicMinMax = PathElement.groupElement("shaderBufferFloat32AtomicMinMax");
    public static final PathElement PATH$shaderBufferFloat64AtomicMinMax = PathElement.groupElement("shaderBufferFloat64AtomicMinMax");
    public static final PathElement PATH$shaderSharedFloat16Atomics = PathElement.groupElement("shaderSharedFloat16Atomics");
    public static final PathElement PATH$shaderSharedFloat16AtomicAdd = PathElement.groupElement("shaderSharedFloat16AtomicAdd");
    public static final PathElement PATH$shaderSharedFloat16AtomicMinMax = PathElement.groupElement("shaderSharedFloat16AtomicMinMax");
    public static final PathElement PATH$shaderSharedFloat32AtomicMinMax = PathElement.groupElement("shaderSharedFloat32AtomicMinMax");
    public static final PathElement PATH$shaderSharedFloat64AtomicMinMax = PathElement.groupElement("shaderSharedFloat64AtomicMinMax");
    public static final PathElement PATH$shaderImageFloat32AtomicMinMax = PathElement.groupElement("shaderImageFloat32AtomicMinMax");
    public static final PathElement PATH$sparseImageFloat32AtomicMinMax = PathElement.groupElement("sparseImageFloat32AtomicMinMax");

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
}

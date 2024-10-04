package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderFloat16VectorAtomics;
/// } VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.html">VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV</a>
public record VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT16_VECTOR_FEATURES_NV);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int shaderFloat16VectorAtomics() {
        return segment.get(LAYOUT$shaderFloat16VectorAtomics, OFFSET$shaderFloat16VectorAtomics);
    }

    public void shaderFloat16VectorAtomics(@unsigned int value) {
        segment.set(LAYOUT$shaderFloat16VectorAtomics, OFFSET$shaderFloat16VectorAtomics, value);
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV[] ret = new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV clone(Arena arena, VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV src) {
        VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV[] clone(Arena arena, VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV[] src) {
        VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16VectorAtomics")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderFloat16VectorAtomics = PathElement.groupElement("shaderFloat16VectorAtomics");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderFloat16VectorAtomics = (OfInt) LAYOUT.select(PATH$shaderFloat16VectorAtomics);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderFloat16VectorAtomics = LAYOUT.byteOffset(PATH$shaderFloat16VectorAtomics);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderFloat16VectorAtomics = LAYOUT$shaderFloat16VectorAtomics.byteSize();
}

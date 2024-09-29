package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 vertexAttributeInstanceRateDivisor;
///     VkBool32 vertexAttributeInstanceRateZeroDivisor;
/// } VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.html">VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR</a>
public record VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_KHR);
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

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR[] ret = new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR src) {
        VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR[] src) {
        VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vertexAttributeInstanceRateDivisor = PathElement.groupElement("vertexAttributeInstanceRateDivisor");
    public static final PathElement PATH$vertexAttributeInstanceRateZeroDivisor = PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexAttributeInstanceRateDivisor = (OfInt) LAYOUT.select(PATH$vertexAttributeInstanceRateDivisor);
    public static final OfInt LAYOUT$vertexAttributeInstanceRateZeroDivisor = (OfInt) LAYOUT.select(PATH$vertexAttributeInstanceRateZeroDivisor);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexAttributeInstanceRateDivisor = LAYOUT.byteOffset(PATH$vertexAttributeInstanceRateDivisor);
    public static final long OFFSET$vertexAttributeInstanceRateZeroDivisor = LAYOUT.byteOffset(PATH$vertexAttributeInstanceRateZeroDivisor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexAttributeInstanceRateDivisor = LAYOUT$vertexAttributeInstanceRateDivisor.byteSize();
    public static final long SIZE$vertexAttributeInstanceRateZeroDivisor = LAYOUT$vertexAttributeInstanceRateZeroDivisor.byteSize();
}

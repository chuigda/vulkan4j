package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderSubgroupExtendedTypes;
/// } VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.html">VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures</a>
public record VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES);
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

    public @unsigned int shaderSubgroupExtendedTypes() {
        return segment.get(LAYOUT$shaderSubgroupExtendedTypes, OFFSET$shaderSubgroupExtendedTypes);
    }

    public void shaderSubgroupExtendedTypes(@unsigned int value) {
        segment.set(LAYOUT$shaderSubgroupExtendedTypes, OFFSET$shaderSubgroupExtendedTypes, value);
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures[] ret = new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures clone(Arena arena, VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures src) {
        VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures[] clone(Arena arena, VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures[] src) {
        VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupExtendedTypes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderSubgroupExtendedTypes = PathElement.groupElement("shaderSubgroupExtendedTypes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderSubgroupExtendedTypes = (OfInt) LAYOUT.select(PATH$shaderSubgroupExtendedTypes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderSubgroupExtendedTypes = LAYOUT.byteOffset(PATH$shaderSubgroupExtendedTypes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderSubgroupExtendedTypes = LAYOUT$shaderSubgroupExtendedTypes.byteSize();
}

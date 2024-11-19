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
/// typedef struct VkPhysicalDevicePerStageDescriptorSetFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 perStageDescriptorSet;
///     VkBool32 dynamicPipelineLayout;
/// } VkPhysicalDevicePerStageDescriptorSetFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDevicePerStageDescriptorSetFeaturesNV.html">VkPhysicalDevicePerStageDescriptorSetFeaturesNV</a>
public record VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV);
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

    public @unsigned int perStageDescriptorSet() {
        return segment.get(LAYOUT$perStageDescriptorSet, OFFSET$perStageDescriptorSet);
    }

    public void perStageDescriptorSet(@unsigned int value) {
        segment.set(LAYOUT$perStageDescriptorSet, OFFSET$perStageDescriptorSet, value);
    }

    public @unsigned int dynamicPipelineLayout() {
        return segment.get(LAYOUT$dynamicPipelineLayout, OFFSET$dynamicPipelineLayout);
    }

    public void dynamicPipelineLayout(@unsigned int value) {
        segment.set(LAYOUT$dynamicPipelineLayout, OFFSET$dynamicPipelineLayout, value);
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] ret = new VkPhysicalDevicePerStageDescriptorSetFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV clone(Arena arena, VkPhysicalDevicePerStageDescriptorSetFeaturesNV src) {
        VkPhysicalDevicePerStageDescriptorSetFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] clone(Arena arena, VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] src) {
        VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perStageDescriptorSet"),
        ValueLayout.JAVA_INT.withName("dynamicPipelineLayout")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$perStageDescriptorSet = PathElement.groupElement("perStageDescriptorSet");
    public static final PathElement PATH$dynamicPipelineLayout = PathElement.groupElement("dynamicPipelineLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$perStageDescriptorSet = (OfInt) LAYOUT.select(PATH$perStageDescriptorSet);
    public static final OfInt LAYOUT$dynamicPipelineLayout = (OfInt) LAYOUT.select(PATH$dynamicPipelineLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perStageDescriptorSet = LAYOUT.byteOffset(PATH$perStageDescriptorSet);
    public static final long OFFSET$dynamicPipelineLayout = LAYOUT.byteOffset(PATH$dynamicPipelineLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$perStageDescriptorSet = LAYOUT$perStageDescriptorSet.byteSize();
    public static final long SIZE$dynamicPipelineLayout = LAYOUT$dynamicPipelineLayout.byteSize();
}

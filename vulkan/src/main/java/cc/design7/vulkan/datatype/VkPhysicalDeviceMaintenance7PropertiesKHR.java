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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMaintenance7PropertiesKHR.html">VkPhysicalDeviceMaintenance7PropertiesKHR</a>
@ValueBasedCandidate
public record VkPhysicalDeviceMaintenance7PropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$robustFragmentShadingRateAttachmentAccess = ValueLayout.JAVA_INT.withName("robustFragmentShadingRateAttachmentAccess");
    public static final OfInt LAYOUT$separateDepthStencilAttachmentAccess = ValueLayout.JAVA_INT.withName("separateDepthStencilAttachmentAccess");
    public static final OfInt LAYOUT$maxDescriptorSetTotalUniformBuffersDynamic = ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalUniformBuffersDynamic");
    public static final OfInt LAYOUT$maxDescriptorSetTotalStorageBuffersDynamic = ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalStorageBuffersDynamic");
    public static final OfInt LAYOUT$maxDescriptorSetTotalBuffersDynamic = ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalBuffersDynamic");
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic");
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic");
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$robustFragmentShadingRateAttachmentAccess, LAYOUT$separateDepthStencilAttachmentAccess, LAYOUT$maxDescriptorSetTotalUniformBuffersDynamic, LAYOUT$maxDescriptorSetTotalStorageBuffersDynamic, LAYOUT$maxDescriptorSetTotalBuffersDynamic, LAYOUT$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic, LAYOUT$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic, LAYOUT$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceMaintenance7PropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMaintenance7PropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMaintenance7PropertiesKHR[] ret = new VkPhysicalDeviceMaintenance7PropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMaintenance7PropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMaintenance7PropertiesKHR clone(Arena arena, VkPhysicalDeviceMaintenance7PropertiesKHR src) {
        VkPhysicalDeviceMaintenance7PropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMaintenance7PropertiesKHR[] clone(Arena arena, VkPhysicalDeviceMaintenance7PropertiesKHR[] src) {
        VkPhysicalDeviceMaintenance7PropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$robustFragmentShadingRateAttachmentAccess = PathElement.groupElement("PATH$robustFragmentShadingRateAttachmentAccess");
    public static final PathElement PATH$separateDepthStencilAttachmentAccess = PathElement.groupElement("PATH$separateDepthStencilAttachmentAccess");
    public static final PathElement PATH$maxDescriptorSetTotalUniformBuffersDynamic = PathElement.groupElement("PATH$maxDescriptorSetTotalUniformBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetTotalStorageBuffersDynamic = PathElement.groupElement("PATH$maxDescriptorSetTotalStorageBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetTotalBuffersDynamic = PathElement.groupElement("PATH$maxDescriptorSetTotalBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = PathElement.groupElement("PATH$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = PathElement.groupElement("PATH$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = PathElement.groupElement("PATH$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$robustFragmentShadingRateAttachmentAccess = LAYOUT$robustFragmentShadingRateAttachmentAccess.byteSize();
    public static final long SIZE$separateDepthStencilAttachmentAccess = LAYOUT$separateDepthStencilAttachmentAccess.byteSize();
    public static final long SIZE$maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT$maxDescriptorSetTotalUniformBuffersDynamic.byteSize();
    public static final long SIZE$maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT$maxDescriptorSetTotalStorageBuffersDynamic.byteSize();
    public static final long SIZE$maxDescriptorSetTotalBuffersDynamic = LAYOUT$maxDescriptorSetTotalBuffersDynamic.byteSize();
    public static final long SIZE$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic.byteSize();
    public static final long SIZE$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic.byteSize();
    public static final long SIZE$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustFragmentShadingRateAttachmentAccess = LAYOUT.byteOffset(PATH$robustFragmentShadingRateAttachmentAccess);
    public static final long OFFSET$separateDepthStencilAttachmentAccess = LAYOUT.byteOffset(PATH$separateDepthStencilAttachmentAccess);
    public static final long OFFSET$maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetTotalUniformBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetTotalStorageBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetTotalBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetTotalBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic);

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

    public @unsigned int robustFragmentShadingRateAttachmentAccess() {
        return segment.get(LAYOUT$robustFragmentShadingRateAttachmentAccess, OFFSET$robustFragmentShadingRateAttachmentAccess);
    }

    public void robustFragmentShadingRateAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$robustFragmentShadingRateAttachmentAccess, OFFSET$robustFragmentShadingRateAttachmentAccess, value);
    }

    public @unsigned int separateDepthStencilAttachmentAccess() {
        return segment.get(LAYOUT$separateDepthStencilAttachmentAccess, OFFSET$separateDepthStencilAttachmentAccess);
    }

    public void separateDepthStencilAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$separateDepthStencilAttachmentAccess, OFFSET$separateDepthStencilAttachmentAccess, value);
    }

    public @unsigned int maxDescriptorSetTotalUniformBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetTotalUniformBuffersDynamic, OFFSET$maxDescriptorSetTotalUniformBuffersDynamic);
    }

    public void maxDescriptorSetTotalUniformBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetTotalUniformBuffersDynamic, OFFSET$maxDescriptorSetTotalUniformBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetTotalStorageBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetTotalStorageBuffersDynamic, OFFSET$maxDescriptorSetTotalStorageBuffersDynamic);
    }

    public void maxDescriptorSetTotalStorageBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetTotalStorageBuffersDynamic, OFFSET$maxDescriptorSetTotalStorageBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetTotalBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetTotalBuffersDynamic, OFFSET$maxDescriptorSetTotalBuffersDynamic);
    }

    public void maxDescriptorSetTotalBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetTotalBuffersDynamic, OFFSET$maxDescriptorSetTotalBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic);
    }

    public void maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic);
    }

    public void maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic);
    }

    public void maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic, value);
    }

}

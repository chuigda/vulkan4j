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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.html">VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$advancedBlendMaxColorAttachments = ValueLayout.JAVA_INT.withName("advancedBlendMaxColorAttachments");
    public static final OfInt LAYOUT$advancedBlendIndependentBlend = ValueLayout.JAVA_INT.withName("advancedBlendIndependentBlend");
    public static final OfInt LAYOUT$advancedBlendNonPremultipliedSrcColor = ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedSrcColor");
    public static final OfInt LAYOUT$advancedBlendNonPremultipliedDstColor = ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedDstColor");
    public static final OfInt LAYOUT$advancedBlendCorrelatedOverlap = ValueLayout.JAVA_INT.withName("advancedBlendCorrelatedOverlap");
    public static final OfInt LAYOUT$advancedBlendAllOperations = ValueLayout.JAVA_INT.withName("advancedBlendAllOperations");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$advancedBlendMaxColorAttachments, LAYOUT$advancedBlendIndependentBlend, LAYOUT$advancedBlendNonPremultipliedSrcColor, LAYOUT$advancedBlendNonPremultipliedDstColor, LAYOUT$advancedBlendCorrelatedOverlap, LAYOUT$advancedBlendAllOperations);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT[] ret = new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT clone(Arena arena, VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT src) {
        VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT[] src) {
        VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$advancedBlendMaxColorAttachments = PathElement.groupElement("PATH$advancedBlendMaxColorAttachments");
    public static final PathElement PATH$advancedBlendIndependentBlend = PathElement.groupElement("PATH$advancedBlendIndependentBlend");
    public static final PathElement PATH$advancedBlendNonPremultipliedSrcColor = PathElement.groupElement("PATH$advancedBlendNonPremultipliedSrcColor");
    public static final PathElement PATH$advancedBlendNonPremultipliedDstColor = PathElement.groupElement("PATH$advancedBlendNonPremultipliedDstColor");
    public static final PathElement PATH$advancedBlendCorrelatedOverlap = PathElement.groupElement("PATH$advancedBlendCorrelatedOverlap");
    public static final PathElement PATH$advancedBlendAllOperations = PathElement.groupElement("PATH$advancedBlendAllOperations");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$advancedBlendMaxColorAttachments = LAYOUT$advancedBlendMaxColorAttachments.byteSize();
    public static final long SIZE$advancedBlendIndependentBlend = LAYOUT$advancedBlendIndependentBlend.byteSize();
    public static final long SIZE$advancedBlendNonPremultipliedSrcColor = LAYOUT$advancedBlendNonPremultipliedSrcColor.byteSize();
    public static final long SIZE$advancedBlendNonPremultipliedDstColor = LAYOUT$advancedBlendNonPremultipliedDstColor.byteSize();
    public static final long SIZE$advancedBlendCorrelatedOverlap = LAYOUT$advancedBlendCorrelatedOverlap.byteSize();
    public static final long SIZE$advancedBlendAllOperations = LAYOUT$advancedBlendAllOperations.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$advancedBlendMaxColorAttachments = LAYOUT.byteOffset(PATH$advancedBlendMaxColorAttachments);
    public static final long OFFSET$advancedBlendIndependentBlend = LAYOUT.byteOffset(PATH$advancedBlendIndependentBlend);
    public static final long OFFSET$advancedBlendNonPremultipliedSrcColor = LAYOUT.byteOffset(PATH$advancedBlendNonPremultipliedSrcColor);
    public static final long OFFSET$advancedBlendNonPremultipliedDstColor = LAYOUT.byteOffset(PATH$advancedBlendNonPremultipliedDstColor);
    public static final long OFFSET$advancedBlendCorrelatedOverlap = LAYOUT.byteOffset(PATH$advancedBlendCorrelatedOverlap);
    public static final long OFFSET$advancedBlendAllOperations = LAYOUT.byteOffset(PATH$advancedBlendAllOperations);

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

    public @unsigned int advancedBlendMaxColorAttachments() {
        return segment.get(LAYOUT$advancedBlendMaxColorAttachments, OFFSET$advancedBlendMaxColorAttachments);
    }

    public void advancedBlendMaxColorAttachments(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendMaxColorAttachments, OFFSET$advancedBlendMaxColorAttachments, value);
    }

    public @unsigned int advancedBlendIndependentBlend() {
        return segment.get(LAYOUT$advancedBlendIndependentBlend, OFFSET$advancedBlendIndependentBlend);
    }

    public void advancedBlendIndependentBlend(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendIndependentBlend, OFFSET$advancedBlendIndependentBlend, value);
    }

    public @unsigned int advancedBlendNonPremultipliedSrcColor() {
        return segment.get(LAYOUT$advancedBlendNonPremultipliedSrcColor, OFFSET$advancedBlendNonPremultipliedSrcColor);
    }

    public void advancedBlendNonPremultipliedSrcColor(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendNonPremultipliedSrcColor, OFFSET$advancedBlendNonPremultipliedSrcColor, value);
    }

    public @unsigned int advancedBlendNonPremultipliedDstColor() {
        return segment.get(LAYOUT$advancedBlendNonPremultipliedDstColor, OFFSET$advancedBlendNonPremultipliedDstColor);
    }

    public void advancedBlendNonPremultipliedDstColor(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendNonPremultipliedDstColor, OFFSET$advancedBlendNonPremultipliedDstColor, value);
    }

    public @unsigned int advancedBlendCorrelatedOverlap() {
        return segment.get(LAYOUT$advancedBlendCorrelatedOverlap, OFFSET$advancedBlendCorrelatedOverlap);
    }

    public void advancedBlendCorrelatedOverlap(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendCorrelatedOverlap, OFFSET$advancedBlendCorrelatedOverlap, value);
    }

    public @unsigned int advancedBlendAllOperations() {
        return segment.get(LAYOUT$advancedBlendAllOperations, OFFSET$advancedBlendAllOperations);
    }

    public void advancedBlendAllOperations(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendAllOperations, OFFSET$advancedBlendAllOperations, value);
    }

}

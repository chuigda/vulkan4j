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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfaceCapabilities2EXT.html">VkSurfaceCapabilities2EXT</a>
@ValueBasedCandidate
public record VkSurfaceCapabilities2EXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$minImageCount = ValueLayout.JAVA_INT.withName("minImageCount");
    public static final OfInt LAYOUT$maxImageCount = ValueLayout.JAVA_INT.withName("maxImageCount");
    public static final StructLayout LAYOUT$currentExtent = VkExtent2D.LAYOUT.withName("currentExtent");
    public static final StructLayout LAYOUT$minImageExtent = VkExtent2D.LAYOUT.withName("minImageExtent");
    public static final StructLayout LAYOUT$maxImageExtent = VkExtent2D.LAYOUT.withName("maxImageExtent");
    public static final OfInt LAYOUT$maxImageArrayLayers = ValueLayout.JAVA_INT.withName("maxImageArrayLayers");
    public static final OfInt LAYOUT$supportedTransforms = ValueLayout.JAVA_INT.withName("supportedTransforms");
    public static final OfInt LAYOUT$currentTransform = ValueLayout.JAVA_INT.withName("currentTransform");
    public static final OfInt LAYOUT$supportedCompositeAlpha = ValueLayout.JAVA_INT.withName("supportedCompositeAlpha");
    public static final OfInt LAYOUT$supportedUsageFlags = ValueLayout.JAVA_INT.withName("supportedUsageFlags");
    public static final OfInt LAYOUT$supportedSurfaceCounters = ValueLayout.JAVA_INT.withName("supportedSurfaceCounters");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$minImageCount, LAYOUT$maxImageCount, LAYOUT$currentExtent, LAYOUT$minImageExtent, LAYOUT$maxImageExtent, LAYOUT$maxImageArrayLayers, LAYOUT$supportedTransforms, LAYOUT$currentTransform, LAYOUT$supportedCompositeAlpha, LAYOUT$supportedUsageFlags, LAYOUT$supportedSurfaceCounters);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSurfaceCapabilities2EXT allocate(Arena arena) {
        return new VkSurfaceCapabilities2EXT(arena.allocate(LAYOUT));
    }

    public static VkSurfaceCapabilities2EXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfaceCapabilities2EXT[] ret = new VkSurfaceCapabilities2EXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSurfaceCapabilities2EXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSurfaceCapabilities2EXT clone(Arena arena, VkSurfaceCapabilities2EXT src) {
        VkSurfaceCapabilities2EXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSurfaceCapabilities2EXT[] clone(Arena arena, VkSurfaceCapabilities2EXT[] src) {
        VkSurfaceCapabilities2EXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$minImageCount = PathElement.groupElement("PATH$minImageCount");
    public static final PathElement PATH$maxImageCount = PathElement.groupElement("PATH$maxImageCount");
    public static final PathElement PATH$currentExtent = PathElement.groupElement("PATH$currentExtent");
    public static final PathElement PATH$minImageExtent = PathElement.groupElement("PATH$minImageExtent");
    public static final PathElement PATH$maxImageExtent = PathElement.groupElement("PATH$maxImageExtent");
    public static final PathElement PATH$maxImageArrayLayers = PathElement.groupElement("PATH$maxImageArrayLayers");
    public static final PathElement PATH$supportedTransforms = PathElement.groupElement("PATH$supportedTransforms");
    public static final PathElement PATH$currentTransform = PathElement.groupElement("PATH$currentTransform");
    public static final PathElement PATH$supportedCompositeAlpha = PathElement.groupElement("PATH$supportedCompositeAlpha");
    public static final PathElement PATH$supportedUsageFlags = PathElement.groupElement("PATH$supportedUsageFlags");
    public static final PathElement PATH$supportedSurfaceCounters = PathElement.groupElement("PATH$supportedSurfaceCounters");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minImageCount = LAYOUT$minImageCount.byteSize();
    public static final long SIZE$maxImageCount = LAYOUT$maxImageCount.byteSize();
    public static final long SIZE$currentExtent = LAYOUT$currentExtent.byteSize();
    public static final long SIZE$minImageExtent = LAYOUT$minImageExtent.byteSize();
    public static final long SIZE$maxImageExtent = LAYOUT$maxImageExtent.byteSize();
    public static final long SIZE$maxImageArrayLayers = LAYOUT$maxImageArrayLayers.byteSize();
    public static final long SIZE$supportedTransforms = LAYOUT$supportedTransforms.byteSize();
    public static final long SIZE$currentTransform = LAYOUT$currentTransform.byteSize();
    public static final long SIZE$supportedCompositeAlpha = LAYOUT$supportedCompositeAlpha.byteSize();
    public static final long SIZE$supportedUsageFlags = LAYOUT$supportedUsageFlags.byteSize();
    public static final long SIZE$supportedSurfaceCounters = LAYOUT$supportedSurfaceCounters.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minImageCount = LAYOUT.byteOffset(PATH$minImageCount);
    public static final long OFFSET$maxImageCount = LAYOUT.byteOffset(PATH$maxImageCount);
    public static final long OFFSET$currentExtent = LAYOUT.byteOffset(PATH$currentExtent);
    public static final long OFFSET$minImageExtent = LAYOUT.byteOffset(PATH$minImageExtent);
    public static final long OFFSET$maxImageExtent = LAYOUT.byteOffset(PATH$maxImageExtent);
    public static final long OFFSET$maxImageArrayLayers = LAYOUT.byteOffset(PATH$maxImageArrayLayers);
    public static final long OFFSET$supportedTransforms = LAYOUT.byteOffset(PATH$supportedTransforms);
    public static final long OFFSET$currentTransform = LAYOUT.byteOffset(PATH$currentTransform);
    public static final long OFFSET$supportedCompositeAlpha = LAYOUT.byteOffset(PATH$supportedCompositeAlpha);
    public static final long OFFSET$supportedUsageFlags = LAYOUT.byteOffset(PATH$supportedUsageFlags);
    public static final long OFFSET$supportedSurfaceCounters = LAYOUT.byteOffset(PATH$supportedSurfaceCounters);

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

    public @unsigned int minImageCount() {
        return segment.get(LAYOUT$minImageCount, OFFSET$minImageCount);
    }

    public void minImageCount(@unsigned int value) {
        segment.set(LAYOUT$minImageCount, OFFSET$minImageCount, value);
    }

    public @unsigned int maxImageCount() {
        return segment.get(LAYOUT$maxImageCount, OFFSET$maxImageCount);
    }

    public void maxImageCount(@unsigned int value) {
        segment.set(LAYOUT$maxImageCount, OFFSET$maxImageCount, value);
    }

    public VkExtent2D currentExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$currentExtent, LAYOUT$currentExtent));
    }

    public void currentExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$currentExtent, SIZE$currentExtent);
    }

    public VkExtent2D minImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minImageExtent, LAYOUT$minImageExtent));
    }

    public void minImageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minImageExtent, SIZE$minImageExtent);
    }

    public VkExtent2D maxImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxImageExtent, LAYOUT$maxImageExtent));
    }

    public void maxImageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxImageExtent, SIZE$maxImageExtent);
    }

    public @unsigned int maxImageArrayLayers() {
        return segment.get(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers);
    }

    public void maxImageArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers, value);
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int supportedTransforms() {
        return segment.get(LAYOUT$supportedTransforms, OFFSET$supportedTransforms);
    }

    public void supportedTransforms(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedTransforms, OFFSET$supportedTransforms, value);
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int currentTransform() {
        return segment.get(LAYOUT$currentTransform, OFFSET$currentTransform);
    }

    public void currentTransform(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$currentTransform, OFFSET$currentTransform, value);
    }

    public @enumtype(VkCompositeAlphaFlagsKHR.class) int supportedCompositeAlpha() {
        return segment.get(LAYOUT$supportedCompositeAlpha, OFFSET$supportedCompositeAlpha);
    }

    public void supportedCompositeAlpha(@enumtype(VkCompositeAlphaFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedCompositeAlpha, OFFSET$supportedCompositeAlpha, value);
    }

    public @enumtype(VkImageUsageFlags.class) int supportedUsageFlags() {
        return segment.get(LAYOUT$supportedUsageFlags, OFFSET$supportedUsageFlags);
    }

    public void supportedUsageFlags(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$supportedUsageFlags, OFFSET$supportedUsageFlags, value);
    }

    public @enumtype(VkSurfaceCounterFlagsEXT.class) int supportedSurfaceCounters() {
        return segment.get(LAYOUT$supportedSurfaceCounters, OFFSET$supportedSurfaceCounters);
    }

    public void supportedSurfaceCounters(@enumtype(VkSurfaceCounterFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedSurfaceCounters, OFFSET$supportedSurfaceCounters, value);
    }

}

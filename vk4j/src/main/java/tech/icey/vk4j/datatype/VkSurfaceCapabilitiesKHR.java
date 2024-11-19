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
/// typedef struct VkSurfaceCapabilitiesKHR {
///     uint32_t minImageCount;
///     uint32_t maxImageCount;
///     VkExtent2D currentExtent;
///     VkExtent2D minImageExtent;
///     VkExtent2D maxImageExtent;
///     uint32_t maxImageArrayLayers;
///     VkSurfaceTransformFlagsKHR supportedTransforms;
///     VkSurfaceTransformFlagBitsKHR currentTransform;
///     VkCompositeAlphaFlagsKHR supportedCompositeAlpha;
///     VkImageUsageFlags supportedUsageFlags;
/// } VkSurfaceCapabilitiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSurfaceCapabilitiesKHR.html">VkSurfaceCapabilitiesKHR</a>
public record VkSurfaceCapabilitiesKHR(MemorySegment segment) implements IPointer {
    public VkSurfaceCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
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

    public static VkSurfaceCapabilitiesKHR allocate(Arena arena) {
        return new VkSurfaceCapabilitiesKHR(arena.allocate(LAYOUT));
    }

    public static VkSurfaceCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfaceCapabilitiesKHR[] ret = new VkSurfaceCapabilitiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSurfaceCapabilitiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSurfaceCapabilitiesKHR clone(Arena arena, VkSurfaceCapabilitiesKHR src) {
        VkSurfaceCapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSurfaceCapabilitiesKHR[] clone(Arena arena, VkSurfaceCapabilitiesKHR[] src) {
        VkSurfaceCapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("maxImageCount"),
        VkExtent2D.LAYOUT.withName("currentExtent"),
        VkExtent2D.LAYOUT.withName("minImageExtent"),
        VkExtent2D.LAYOUT.withName("maxImageExtent"),
        ValueLayout.JAVA_INT.withName("maxImageArrayLayers"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("currentTransform"),
        ValueLayout.JAVA_INT.withName("supportedCompositeAlpha"),
        ValueLayout.JAVA_INT.withName("supportedUsageFlags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$minImageCount = PathElement.groupElement("minImageCount");
    public static final PathElement PATH$maxImageCount = PathElement.groupElement("maxImageCount");
    public static final PathElement PATH$currentExtent = PathElement.groupElement("currentExtent");
    public static final PathElement PATH$minImageExtent = PathElement.groupElement("minImageExtent");
    public static final PathElement PATH$maxImageExtent = PathElement.groupElement("maxImageExtent");
    public static final PathElement PATH$maxImageArrayLayers = PathElement.groupElement("maxImageArrayLayers");
    public static final PathElement PATH$supportedTransforms = PathElement.groupElement("supportedTransforms");
    public static final PathElement PATH$currentTransform = PathElement.groupElement("currentTransform");
    public static final PathElement PATH$supportedCompositeAlpha = PathElement.groupElement("supportedCompositeAlpha");
    public static final PathElement PATH$supportedUsageFlags = PathElement.groupElement("supportedUsageFlags");

    public static final OfInt LAYOUT$minImageCount = (OfInt) LAYOUT.select(PATH$minImageCount);
    public static final OfInt LAYOUT$maxImageCount = (OfInt) LAYOUT.select(PATH$maxImageCount);
    public static final StructLayout LAYOUT$currentExtent = (StructLayout) LAYOUT.select(PATH$currentExtent);
    public static final StructLayout LAYOUT$minImageExtent = (StructLayout) LAYOUT.select(PATH$minImageExtent);
    public static final StructLayout LAYOUT$maxImageExtent = (StructLayout) LAYOUT.select(PATH$maxImageExtent);
    public static final OfInt LAYOUT$maxImageArrayLayers = (OfInt) LAYOUT.select(PATH$maxImageArrayLayers);
    public static final OfInt LAYOUT$supportedTransforms = (OfInt) LAYOUT.select(PATH$supportedTransforms);
    public static final OfInt LAYOUT$currentTransform = (OfInt) LAYOUT.select(PATH$currentTransform);
    public static final OfInt LAYOUT$supportedCompositeAlpha = (OfInt) LAYOUT.select(PATH$supportedCompositeAlpha);
    public static final OfInt LAYOUT$supportedUsageFlags = (OfInt) LAYOUT.select(PATH$supportedUsageFlags);

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
}

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

/// Represents a pointer to a {@code VkSwapchainCreateInfoKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainCreateInfoKHR.html">VkSwapchainCreateInfoKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSwapchainCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkSwapchainCreateInfoKHR {
        sType(VkStructureType.SWAPCHAIN_CREATE_INFO_KHR);
    }

    public static VkSwapchainCreateInfoKHR allocate(Arena arena) {
        return new VkSwapchainCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkSwapchainCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainCreateInfoKHR[] ret = new VkSwapchainCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSwapchainCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSwapchainCreateInfoKHR clone(Arena arena, VkSwapchainCreateInfoKHR src) {
        VkSwapchainCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSwapchainCreateInfoKHR[] clone(Arena arena, VkSwapchainCreateInfoKHR[] src) {
        VkSwapchainCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("surface"),
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("imageFormat"),
        ValueLayout.JAVA_INT.withName("imageColorSpace"),
        VkExtent2D.LAYOUT.withName("imageExtent"),
        ValueLayout.JAVA_INT.withName("imageArrayLayers"),
        ValueLayout.JAVA_INT.withName("imageUsage"),
        ValueLayout.JAVA_INT.withName("imageSharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pQueueFamilyIndices"),
        ValueLayout.JAVA_INT.withName("preTransform"),
        ValueLayout.JAVA_INT.withName("compositeAlpha"),
        ValueLayout.JAVA_INT.withName("presentMode"),
        ValueLayout.JAVA_INT.withName("clipped"),
        ValueLayout.ADDRESS.withName("oldSwapchain")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$surface = PathElement.groupElement("PATH$surface");
    public static final PathElement PATH$minImageCount = PathElement.groupElement("PATH$minImageCount");
    public static final PathElement PATH$imageFormat = PathElement.groupElement("PATH$imageFormat");
    public static final PathElement PATH$imageColorSpace = PathElement.groupElement("PATH$imageColorSpace");
    public static final PathElement PATH$imageExtent = PathElement.groupElement("PATH$imageExtent");
    public static final PathElement PATH$imageArrayLayers = PathElement.groupElement("PATH$imageArrayLayers");
    public static final PathElement PATH$imageUsage = PathElement.groupElement("PATH$imageUsage");
    public static final PathElement PATH$imageSharingMode = PathElement.groupElement("PATH$imageSharingMode");
    public static final PathElement PATH$queueFamilyIndexCount = PathElement.groupElement("PATH$queueFamilyIndexCount");
    public static final PathElement PATH$pQueueFamilyIndices = PathElement.groupElement("PATH$pQueueFamilyIndices");
    public static final PathElement PATH$preTransform = PathElement.groupElement("PATH$preTransform");
    public static final PathElement PATH$compositeAlpha = PathElement.groupElement("PATH$compositeAlpha");
    public static final PathElement PATH$presentMode = PathElement.groupElement("PATH$presentMode");
    public static final PathElement PATH$clipped = PathElement.groupElement("PATH$clipped");
    public static final PathElement PATH$oldSwapchain = PathElement.groupElement("PATH$oldSwapchain");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$surface = (AddressLayout) LAYOUT.select(PATH$surface);
    public static final OfInt LAYOUT$minImageCount = (OfInt) LAYOUT.select(PATH$minImageCount);
    public static final OfInt LAYOUT$imageFormat = (OfInt) LAYOUT.select(PATH$imageFormat);
    public static final OfInt LAYOUT$imageColorSpace = (OfInt) LAYOUT.select(PATH$imageColorSpace);
    public static final StructLayout LAYOUT$imageExtent = (StructLayout) LAYOUT.select(PATH$imageExtent);
    public static final OfInt LAYOUT$imageArrayLayers = (OfInt) LAYOUT.select(PATH$imageArrayLayers);
    public static final OfInt LAYOUT$imageUsage = (OfInt) LAYOUT.select(PATH$imageUsage);
    public static final OfInt LAYOUT$imageSharingMode = (OfInt) LAYOUT.select(PATH$imageSharingMode);
    public static final OfInt LAYOUT$queueFamilyIndexCount = (OfInt) LAYOUT.select(PATH$queueFamilyIndexCount);
    public static final AddressLayout LAYOUT$pQueueFamilyIndices = (AddressLayout) LAYOUT.select(PATH$pQueueFamilyIndices);
    public static final OfInt LAYOUT$preTransform = (OfInt) LAYOUT.select(PATH$preTransform);
    public static final OfInt LAYOUT$compositeAlpha = (OfInt) LAYOUT.select(PATH$compositeAlpha);
    public static final OfInt LAYOUT$presentMode = (OfInt) LAYOUT.select(PATH$presentMode);
    public static final OfInt LAYOUT$clipped = (OfInt) LAYOUT.select(PATH$clipped);
    public static final AddressLayout LAYOUT$oldSwapchain = (AddressLayout) LAYOUT.select(PATH$oldSwapchain);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$surface = LAYOUT$surface.byteSize();
    public static final long SIZE$minImageCount = LAYOUT$minImageCount.byteSize();
    public static final long SIZE$imageFormat = LAYOUT$imageFormat.byteSize();
    public static final long SIZE$imageColorSpace = LAYOUT$imageColorSpace.byteSize();
    public static final long SIZE$imageExtent = LAYOUT$imageExtent.byteSize();
    public static final long SIZE$imageArrayLayers = LAYOUT$imageArrayLayers.byteSize();
    public static final long SIZE$imageUsage = LAYOUT$imageUsage.byteSize();
    public static final long SIZE$imageSharingMode = LAYOUT$imageSharingMode.byteSize();
    public static final long SIZE$queueFamilyIndexCount = LAYOUT$queueFamilyIndexCount.byteSize();
    public static final long SIZE$pQueueFamilyIndices = LAYOUT$pQueueFamilyIndices.byteSize();
    public static final long SIZE$preTransform = LAYOUT$preTransform.byteSize();
    public static final long SIZE$compositeAlpha = LAYOUT$compositeAlpha.byteSize();
    public static final long SIZE$presentMode = LAYOUT$presentMode.byteSize();
    public static final long SIZE$clipped = LAYOUT$clipped.byteSize();
    public static final long SIZE$oldSwapchain = LAYOUT$oldSwapchain.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$surface = LAYOUT.byteOffset(PATH$surface);
    public static final long OFFSET$minImageCount = LAYOUT.byteOffset(PATH$minImageCount);
    public static final long OFFSET$imageFormat = LAYOUT.byteOffset(PATH$imageFormat);
    public static final long OFFSET$imageColorSpace = LAYOUT.byteOffset(PATH$imageColorSpace);
    public static final long OFFSET$imageExtent = LAYOUT.byteOffset(PATH$imageExtent);
    public static final long OFFSET$imageArrayLayers = LAYOUT.byteOffset(PATH$imageArrayLayers);
    public static final long OFFSET$imageUsage = LAYOUT.byteOffset(PATH$imageUsage);
    public static final long OFFSET$imageSharingMode = LAYOUT.byteOffset(PATH$imageSharingMode);
    public static final long OFFSET$queueFamilyIndexCount = LAYOUT.byteOffset(PATH$queueFamilyIndexCount);
    public static final long OFFSET$pQueueFamilyIndices = LAYOUT.byteOffset(PATH$pQueueFamilyIndices);
    public static final long OFFSET$preTransform = LAYOUT.byteOffset(PATH$preTransform);
    public static final long OFFSET$compositeAlpha = LAYOUT.byteOffset(PATH$compositeAlpha);
    public static final long OFFSET$presentMode = LAYOUT.byteOffset(PATH$presentMode);
    public static final long OFFSET$clipped = LAYOUT.byteOffset(PATH$clipped);
    public static final long OFFSET$oldSwapchain = LAYOUT.byteOffset(PATH$oldSwapchain);

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

    public @enumtype(VkSwapchainCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSwapchainCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VkSurfaceKHR surface() {
        MemorySegment s = segment.asSlice(OFFSET$surface, SIZE$surface);
        if (s.address() == 0) {
            return null;
        }
        return new VkSurfaceKHR(s);
    }

    public void surface(@Nullable VkSurfaceKHR value) {
        segment.set(LAYOUT$surface, OFFSET$surface, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int minImageCount() {
        return segment.get(LAYOUT$minImageCount, OFFSET$minImageCount);
    }

    public void minImageCount(@unsigned int value) {
        segment.set(LAYOUT$minImageCount, OFFSET$minImageCount, value);
    }

    public @enumtype(VkFormat.class) int imageFormat() {
        return segment.get(LAYOUT$imageFormat, OFFSET$imageFormat);
    }

    public void imageFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$imageFormat, OFFSET$imageFormat, value);
    }

    public @enumtype(VkColorSpaceKHR.class) int imageColorSpace() {
        return segment.get(LAYOUT$imageColorSpace, OFFSET$imageColorSpace);
    }

    public void imageColorSpace(@enumtype(VkColorSpaceKHR.class) int value) {
        segment.set(LAYOUT$imageColorSpace, OFFSET$imageColorSpace, value);
    }

    public VkExtent2D imageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));
    }

    public void imageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageExtent, SIZE$imageExtent);
    }

    public @unsigned int imageArrayLayers() {
        return segment.get(LAYOUT$imageArrayLayers, OFFSET$imageArrayLayers);
    }

    public void imageArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$imageArrayLayers, OFFSET$imageArrayLayers, value);
    }

    public @enumtype(VkImageUsageFlags.class) int imageUsage() {
        return segment.get(LAYOUT$imageUsage, OFFSET$imageUsage);
    }

    public void imageUsage(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$imageUsage, OFFSET$imageUsage, value);
    }

    public @enumtype(VkSharingMode.class) int imageSharingMode() {
        return segment.get(LAYOUT$imageSharingMode, OFFSET$imageSharingMode);
    }

    public void imageSharingMode(@enumtype(VkSharingMode.class) int value) {
        segment.set(LAYOUT$imageSharingMode, OFFSET$imageSharingMode, value);
    }

    public @unsigned int queueFamilyIndexCount() {
        return segment.get(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount);
    }

    public void queueFamilyIndexCount(@unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount, value);
    }

    public @pointer(comment="int*") MemorySegment pQueueFamilyIndicesRaw() {
        return segment.get(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices);
    }

    public void pQueueFamilyIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pQueueFamilyIndices() {
        MemorySegment s = pQueueFamilyIndicesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pQueueFamilyIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQueueFamilyIndicesRaw(s);
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int preTransform() {
        return segment.get(LAYOUT$preTransform, OFFSET$preTransform);
    }

    public void preTransform(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$preTransform, OFFSET$preTransform, value);
    }

    public @enumtype(VkCompositeAlphaFlagsKHR.class) int compositeAlpha() {
        return segment.get(LAYOUT$compositeAlpha, OFFSET$compositeAlpha);
    }

    public void compositeAlpha(@enumtype(VkCompositeAlphaFlagsKHR.class) int value) {
        segment.set(LAYOUT$compositeAlpha, OFFSET$compositeAlpha, value);
    }

    public @enumtype(VkPresentModeKHR.class) int presentMode() {
        return segment.get(LAYOUT$presentMode, OFFSET$presentMode);
    }

    public void presentMode(@enumtype(VkPresentModeKHR.class) int value) {
        segment.set(LAYOUT$presentMode, OFFSET$presentMode, value);
    }

    public @unsigned int clipped() {
        return segment.get(LAYOUT$clipped, OFFSET$clipped);
    }

    public void clipped(@unsigned int value) {
        segment.set(LAYOUT$clipped, OFFSET$clipped, value);
    }

    public @Nullable VkSwapchainKHR oldSwapchain() {
        MemorySegment s = segment.asSlice(OFFSET$oldSwapchain, SIZE$oldSwapchain);
        if (s.address() == 0) {
            return null;
        }
        return new VkSwapchainKHR(s);
    }

    public void oldSwapchain(@Nullable VkSwapchainKHR value) {
        segment.set(LAYOUT$oldSwapchain, OFFSET$oldSwapchain, value != null ? value.segment() : MemorySegment.NULL);
    }

}

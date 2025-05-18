package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageSubresourceRange.html"><code>VkImageSubresourceRange</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageSubresourceRange {
///     VkImageAspectFlags aspectMask; // @link substring="VkImageAspectFlags" target="VkImageAspectFlags" @link substring="aspectMask" target="#aspectMask"
///     uint32_t baseMipLevel; // @link substring="baseMipLevel" target="#baseMipLevel"
///     uint32_t levelCount; // @link substring="levelCount" target="#levelCount"
///     uint32_t baseArrayLayer; // @link substring="baseArrayLayer" target="#baseArrayLayer"
///     uint32_t layerCount; // @link substring="layerCount" target="#layerCount"
/// } VkImageSubresourceRange;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageSubresourceRange.html"><code>VkImageSubresourceRange</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageSubresourceRange(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageSubresourceRange allocate(Arena arena) {
        return new VkImageSubresourceRange(arena.allocate(LAYOUT));
    }

    public static VkImageSubresourceRange[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageSubresourceRange[] ret = new VkImageSubresourceRange[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageSubresourceRange(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkImageSubresourceRange clone(Arena arena, VkImageSubresourceRange src) {
        VkImageSubresourceRange ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageSubresourceRange[] clone(Arena arena, VkImageSubresourceRange[] src) {
        VkImageSubresourceRange[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public @unsigned int baseMipLevel() {
        return segment.get(LAYOUT$baseMipLevel, OFFSET$baseMipLevel);
    }

    public void baseMipLevel(@unsigned int value) {
        segment.set(LAYOUT$baseMipLevel, OFFSET$baseMipLevel, value);
    }

    public @unsigned int levelCount() {
        return segment.get(LAYOUT$levelCount, OFFSET$levelCount);
    }

    public void levelCount(@unsigned int value) {
        segment.set(LAYOUT$levelCount, OFFSET$levelCount, value);
    }

    public @unsigned int baseArrayLayer() {
        return segment.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);
    }

    public void baseArrayLayer(@unsigned int value) {
        segment.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);
    }

    public @unsigned int layerCount() {
        return segment.get(LAYOUT$layerCount, OFFSET$layerCount);
    }

    public void layerCount(@unsigned int value) {
        segment.set(LAYOUT$layerCount, OFFSET$layerCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("baseMipLevel"),
        ValueLayout.JAVA_INT.withName("levelCount"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$aspectMask = PathElement.groupElement("PATH$aspectMask");
    public static final PathElement PATH$baseMipLevel = PathElement.groupElement("PATH$baseMipLevel");
    public static final PathElement PATH$levelCount = PathElement.groupElement("PATH$levelCount");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("PATH$baseArrayLayer");
    public static final PathElement PATH$layerCount = PathElement.groupElement("PATH$layerCount");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final OfInt LAYOUT$baseMipLevel = (OfInt) LAYOUT.select(PATH$baseMipLevel);
    public static final OfInt LAYOUT$levelCount = (OfInt) LAYOUT.select(PATH$levelCount);
    public static final OfInt LAYOUT$baseArrayLayer = (OfInt) LAYOUT.select(PATH$baseArrayLayer);
    public static final OfInt LAYOUT$layerCount = (OfInt) LAYOUT.select(PATH$layerCount);

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$baseMipLevel = LAYOUT$baseMipLevel.byteSize();
    public static final long SIZE$levelCount = LAYOUT$levelCount.byteSize();
    public static final long SIZE$baseArrayLayer = LAYOUT$baseArrayLayer.byteSize();
    public static final long SIZE$layerCount = LAYOUT$layerCount.byteSize();

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$baseMipLevel = LAYOUT.byteOffset(PATH$baseMipLevel);
    public static final long OFFSET$levelCount = LAYOUT.byteOffset(PATH$levelCount);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);
}

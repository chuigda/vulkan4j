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

/// Represents a pointer to a {@code VkImageSubresourceLayers} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageSubresourceLayers.html">VkImageSubresourceLayers</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageSubresourceLayers(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageSubresourceLayers allocate(Arena arena) {
        return new VkImageSubresourceLayers(arena.allocate(LAYOUT));
    }

    public static VkImageSubresourceLayers[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageSubresourceLayers[] ret = new VkImageSubresourceLayers[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageSubresourceLayers(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageSubresourceLayers clone(Arena arena, VkImageSubresourceLayers src) {
        VkImageSubresourceLayers ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageSubresourceLayers[] clone(Arena arena, VkImageSubresourceLayers[] src) {
        VkImageSubresourceLayers[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$aspectMask = PathElement.groupElement("PATH$aspectMask");
    public static final PathElement PATH$mipLevel = PathElement.groupElement("PATH$mipLevel");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("PATH$baseArrayLayer");
    public static final PathElement PATH$layerCount = PathElement.groupElement("PATH$layerCount");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final OfInt LAYOUT$mipLevel = (OfInt) LAYOUT.select(PATH$mipLevel);
    public static final OfInt LAYOUT$baseArrayLayer = (OfInt) LAYOUT.select(PATH$baseArrayLayer);
    public static final OfInt LAYOUT$layerCount = (OfInt) LAYOUT.select(PATH$layerCount);

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$mipLevel = LAYOUT$mipLevel.byteSize();
    public static final long SIZE$baseArrayLayer = LAYOUT$baseArrayLayer.byteSize();
    public static final long SIZE$layerCount = LAYOUT$layerCount.byteSize();

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$mipLevel = LAYOUT.byteOffset(PATH$mipLevel);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public @unsigned int mipLevel() {
        return segment.get(LAYOUT$mipLevel, OFFSET$mipLevel);
    }

    public void mipLevel(@unsigned int value) {
        segment.set(LAYOUT$mipLevel, OFFSET$mipLevel, value);
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

}

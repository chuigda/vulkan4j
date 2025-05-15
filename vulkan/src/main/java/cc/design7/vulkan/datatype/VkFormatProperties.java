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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFormatProperties.html">VkFormatProperties</a>
@ValueBasedCandidate
public record VkFormatProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$linearTilingFeatures = ValueLayout.JAVA_INT.withName("linearTilingFeatures");
    public static final OfInt LAYOUT$optimalTilingFeatures = ValueLayout.JAVA_INT.withName("optimalTilingFeatures");
    public static final OfInt LAYOUT$bufferFeatures = ValueLayout.JAVA_INT.withName("bufferFeatures");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$linearTilingFeatures, LAYOUT$optimalTilingFeatures, LAYOUT$bufferFeatures);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkFormatProperties allocate(Arena arena) {
        return new VkFormatProperties(arena.allocate(LAYOUT));
    }

    public static VkFormatProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFormatProperties[] ret = new VkFormatProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFormatProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkFormatProperties clone(Arena arena, VkFormatProperties src) {
        VkFormatProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFormatProperties[] clone(Arena arena, VkFormatProperties[] src) {
        VkFormatProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$linearTilingFeatures = PathElement.groupElement("PATH$linearTilingFeatures");
    public static final PathElement PATH$optimalTilingFeatures = PathElement.groupElement("PATH$optimalTilingFeatures");
    public static final PathElement PATH$bufferFeatures = PathElement.groupElement("PATH$bufferFeatures");

    public static final long SIZE$linearTilingFeatures = LAYOUT$linearTilingFeatures.byteSize();
    public static final long SIZE$optimalTilingFeatures = LAYOUT$optimalTilingFeatures.byteSize();
    public static final long SIZE$bufferFeatures = LAYOUT$bufferFeatures.byteSize();

    public static final long OFFSET$linearTilingFeatures = LAYOUT.byteOffset(PATH$linearTilingFeatures);
    public static final long OFFSET$optimalTilingFeatures = LAYOUT.byteOffset(PATH$optimalTilingFeatures);
    public static final long OFFSET$bufferFeatures = LAYOUT.byteOffset(PATH$bufferFeatures);

    public @enumtype(VkFormatFeatureFlags.class) int linearTilingFeatures() {
        return segment.get(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures);
    }

    public void linearTilingFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures, value);
    }

    public @enumtype(VkFormatFeatureFlags.class) int optimalTilingFeatures() {
        return segment.get(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures);
    }

    public void optimalTilingFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures, value);
    }

    public @enumtype(VkFormatFeatureFlags.class) int bufferFeatures() {
        return segment.get(LAYOUT$bufferFeatures, OFFSET$bufferFeatures);
    }

    public void bufferFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$bufferFeatures, OFFSET$bufferFeatures, value);
    }

}

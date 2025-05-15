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

public record VkDrmFormatModifierPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$drmFormatModifier = ValueLayout.JAVA_LONG.withName("drmFormatModifier");
    public static final OfInt LAYOUT$drmFormatModifierPlaneCount = ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount");
    public static final OfInt LAYOUT$drmFormatModifierTilingFeatures = ValueLayout.JAVA_INT.withName("drmFormatModifierTilingFeatures");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$drmFormatModifier, LAYOUT$drmFormatModifierPlaneCount, LAYOUT$drmFormatModifierTilingFeatures);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDrmFormatModifierPropertiesEXT allocate(Arena arena) {
        return new VkDrmFormatModifierPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkDrmFormatModifierPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrmFormatModifierPropertiesEXT[] ret = new VkDrmFormatModifierPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrmFormatModifierPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDrmFormatModifierPropertiesEXT clone(Arena arena, VkDrmFormatModifierPropertiesEXT src) {
        VkDrmFormatModifierPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrmFormatModifierPropertiesEXT[] clone(Arena arena, VkDrmFormatModifierPropertiesEXT[] src) {
        VkDrmFormatModifierPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$drmFormatModifier = PathElement.groupElement("PATH$drmFormatModifier");
    public static final PathElement PATH$drmFormatModifierPlaneCount = PathElement.groupElement("PATH$drmFormatModifierPlaneCount");
    public static final PathElement PATH$drmFormatModifierTilingFeatures = PathElement.groupElement("PATH$drmFormatModifierTilingFeatures");

    public static final long SIZE$drmFormatModifier = LAYOUT$drmFormatModifier.byteSize();
    public static final long SIZE$drmFormatModifierPlaneCount = LAYOUT$drmFormatModifierPlaneCount.byteSize();
    public static final long SIZE$drmFormatModifierTilingFeatures = LAYOUT$drmFormatModifierTilingFeatures.byteSize();

    public static final long OFFSET$drmFormatModifier = LAYOUT.byteOffset(PATH$drmFormatModifier);
    public static final long OFFSET$drmFormatModifierPlaneCount = LAYOUT.byteOffset(PATH$drmFormatModifierPlaneCount);
    public static final long OFFSET$drmFormatModifierTilingFeatures = LAYOUT.byteOffset(PATH$drmFormatModifierTilingFeatures);

    public @unsigned long drmFormatModifier() {
        return segment.get(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier);
    }

    public void drmFormatModifier(@unsigned long value) {
        segment.set(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier, value);
    }

    public @unsigned int drmFormatModifierPlaneCount() {
        return segment.get(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount);
    }

    public void drmFormatModifierPlaneCount(@unsigned int value) {
        segment.set(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount, value);
    }

    public @enumtype(VkFormatFeatureFlags.class) int drmFormatModifierTilingFeatures() {
        return segment.get(LAYOUT$drmFormatModifierTilingFeatures, OFFSET$drmFormatModifierTilingFeatures);
    }

    public void drmFormatModifierTilingFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$drmFormatModifierTilingFeatures, OFFSET$drmFormatModifierTilingFeatures, value);
    }

}
/// dummy, not implemented yet

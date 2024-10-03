package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.bitmask.VkFormatFeatureFlags;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.*;

/// {@snippet lang=c :
/// typedef struct VkDrmFormatModifierPropertiesEXT {
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     VkFormatFeatureFlags drmFormatModifierTilingFeatures;
/// } VkDrmFormatModifierPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDrmFormatModifierPropertiesEXT.html">VkDrmFormatModifierPropertiesEXT</a>
public record VkDrmFormatModifierPropertiesEXT(MemorySegment segment) implements IPointer {
    public VkDrmFormatModifierPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkDrmFormatModifierPropertiesEXT allocate(Arena arena) {
        return new VkDrmFormatModifierPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkDrmFormatModifierPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrmFormatModifierPropertiesEXT[] ret = new VkDrmFormatModifierPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierTilingFeatures")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$drmFormatModifier = PathElement.groupElement("drmFormatModifier");
    public static final PathElement PATH$drmFormatModifierPlaneCount = PathElement.groupElement("drmFormatModifierPlaneCount");
    public static final PathElement PATH$drmFormatModifierTilingFeatures = PathElement.groupElement("drmFormatModifierTilingFeatures");

    public static final OfLong LAYOUT$drmFormatModifier = (OfLong) LAYOUT.select(PATH$drmFormatModifier);
    public static final OfInt LAYOUT$drmFormatModifierPlaneCount = (OfInt) LAYOUT.select(PATH$drmFormatModifierPlaneCount);
    public static final OfInt LAYOUT$drmFormatModifierTilingFeatures = (OfInt) LAYOUT.select(PATH$drmFormatModifierTilingFeatures);

    public static final long OFFSET$drmFormatModifier = LAYOUT.byteOffset(PATH$drmFormatModifier);
    public static final long OFFSET$drmFormatModifierPlaneCount = LAYOUT.byteOffset(PATH$drmFormatModifierPlaneCount);
    public static final long OFFSET$drmFormatModifierTilingFeatures = LAYOUT.byteOffset(PATH$drmFormatModifierTilingFeatures);

    public static final long SIZE$drmFormatModifier = LAYOUT$drmFormatModifier.byteSize();
    public static final long SIZE$drmFormatModifierPlaneCount = LAYOUT$drmFormatModifierPlaneCount.byteSize();
    public static final long SIZE$drmFormatModifierTilingFeatures = LAYOUT$drmFormatModifierTilingFeatures.byteSize();
}

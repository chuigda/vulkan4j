package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkFormatProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("linearTilingFeatures"),
        ValueLayout.JAVA_INT.withName("optimalTilingFeatures"),
        ValueLayout.JAVA_INT.withName("bufferFeatures")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$linearTilingFeatures = PathElement.groupElement("linearTilingFeatures");
    public static final PathElement PATH$optimalTilingFeatures = PathElement.groupElement("optimalTilingFeatures");
    public static final PathElement PATH$bufferFeatures = PathElement.groupElement("bufferFeatures");

    public static final OfInt LAYOUT$linearTilingFeatures = (OfInt) LAYOUT.select(PATH$linearTilingFeatures);
    public static final OfInt LAYOUT$optimalTilingFeatures = (OfInt) LAYOUT.select(PATH$optimalTilingFeatures);
    public static final OfInt LAYOUT$bufferFeatures = (OfInt) LAYOUT.select(PATH$bufferFeatures);

    public static final long OFFSET$linearTilingFeatures = LAYOUT.byteOffset(PATH$linearTilingFeatures);
    public static final long OFFSET$optimalTilingFeatures = LAYOUT.byteOffset(PATH$optimalTilingFeatures);
    public static final long OFFSET$bufferFeatures = LAYOUT.byteOffset(PATH$bufferFeatures);

    public static final long SIZE$linearTilingFeatures = LAYOUT$linearTilingFeatures.byteSize();
    public static final long SIZE$optimalTilingFeatures = LAYOUT$optimalTilingFeatures.byteSize();
    public static final long SIZE$bufferFeatures = LAYOUT$bufferFeatures.byteSize();

    public VkFormatProperties(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkFormatProperties allocate(Arena arena) {
        return new VkFormatProperties(arena.allocate(LAYOUT));
    }
    
    public static VkFormatProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFormatProperties[] ret = new VkFormatProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkFormatProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

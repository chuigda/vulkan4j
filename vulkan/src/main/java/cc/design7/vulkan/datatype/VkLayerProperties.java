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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLayerProperties.html">VkLayerProperties</a>
@ValueBasedCandidate
public record VkLayerProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfByte LAYOUT$layerName = ValueLayout.JAVA_BYTE.withName("layerName");
    public static final OfInt LAYOUT$specVersion = ValueLayout.JAVA_INT.withName("specVersion");
    public static final OfInt LAYOUT$implementationVersion = ValueLayout.JAVA_INT.withName("implementationVersion");
    public static final OfByte LAYOUT$description = ValueLayout.JAVA_BYTE.withName("description");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$layerName, LAYOUT$specVersion, LAYOUT$implementationVersion, LAYOUT$description);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkLayerProperties allocate(Arena arena) {
        return new VkLayerProperties(arena.allocate(LAYOUT));
    }

    public static VkLayerProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLayerProperties[] ret = new VkLayerProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkLayerProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkLayerProperties clone(Arena arena, VkLayerProperties src) {
        VkLayerProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkLayerProperties[] clone(Arena arena, VkLayerProperties[] src) {
        VkLayerProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$layerName = PathElement.groupElement("PATH$layerName");
    public static final PathElement PATH$specVersion = PathElement.groupElement("PATH$specVersion");
    public static final PathElement PATH$implementationVersion = PathElement.groupElement("PATH$implementationVersion");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");

    public static final long SIZE$layerName = LAYOUT$layerName.byteSize();
    public static final long SIZE$specVersion = LAYOUT$specVersion.byteSize();
    public static final long SIZE$implementationVersion = LAYOUT$implementationVersion.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();

    public static final long OFFSET$layerName = LAYOUT.byteOffset(PATH$layerName);
    public static final long OFFSET$specVersion = LAYOUT.byteOffset(PATH$specVersion);
    public static final long OFFSET$implementationVersion = LAYOUT.byteOffset(PATH$implementationVersion);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);

    public byte layerName() {
        return segment.get(LAYOUT$layerName, OFFSET$layerName);
    }

    public void layerName(byte value) {
        segment.set(LAYOUT$layerName, OFFSET$layerName, value);
    }

    public @unsigned int specVersion() {
        return segment.get(LAYOUT$specVersion, OFFSET$specVersion);
    }

    public void specVersion(@unsigned int value) {
        segment.set(LAYOUT$specVersion, OFFSET$specVersion, value);
    }

    public @unsigned int implementationVersion() {
        return segment.get(LAYOUT$implementationVersion, OFFSET$implementationVersion);
    }

    public void implementationVersion(@unsigned int value) {
        segment.set(LAYOUT$implementationVersion, OFFSET$implementationVersion, value);
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

}

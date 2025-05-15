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

/// Represents a pointer to a {@code VkLayerProperties} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLayerProperties.html">VkLayerProperties</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkLayerProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkLayerProperties allocate(Arena arena) {
        return new VkLayerProperties(arena.allocate(LAYOUT));
    }

    public static VkLayerProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLayerProperties[] ret = new VkLayerProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkLayerProperties(segment.asSlice(i * BYTES, BYTES));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("layerName"),
        ValueLayout.JAVA_INT.withName("specVersion"),
        ValueLayout.JAVA_INT.withName("implementationVersion"),
        ValueLayout.JAVA_BYTE.withName("description")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$layerName = PathElement.groupElement("PATH$layerName");
    public static final PathElement PATH$specVersion = PathElement.groupElement("PATH$specVersion");
    public static final PathElement PATH$implementationVersion = PathElement.groupElement("PATH$implementationVersion");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");

    public static final OfByte LAYOUT$layerName = (OfByte) LAYOUT.select(PATH$layerName);
    public static final OfInt LAYOUT$specVersion = (OfInt) LAYOUT.select(PATH$specVersion);
    public static final OfInt LAYOUT$implementationVersion = (OfInt) LAYOUT.select(PATH$implementationVersion);
    public static final OfByte LAYOUT$description = (OfByte) LAYOUT.select(PATH$description);

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

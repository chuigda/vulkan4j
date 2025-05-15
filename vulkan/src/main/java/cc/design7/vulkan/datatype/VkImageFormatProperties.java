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

/// Represents a pointer to a {@code VkImageFormatProperties} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatProperties.html">VkImageFormatProperties</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageFormatProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageFormatProperties allocate(Arena arena) {
        return new VkImageFormatProperties(arena.allocate(LAYOUT));
    }

    public static VkImageFormatProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageFormatProperties[] ret = new VkImageFormatProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageFormatProperties(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkImageFormatProperties clone(Arena arena, VkImageFormatProperties src) {
        VkImageFormatProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageFormatProperties[] clone(Arena arena, VkImageFormatProperties[] src) {
        VkImageFormatProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkExtent3D.LAYOUT.withName("maxExtent"),
        ValueLayout.JAVA_INT.withName("maxMipLevels"),
        ValueLayout.JAVA_INT.withName("maxArrayLayers"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        ValueLayout.JAVA_LONG.withName("maxResourceSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$maxExtent = PathElement.groupElement("PATH$maxExtent");
    public static final PathElement PATH$maxMipLevels = PathElement.groupElement("PATH$maxMipLevels");
    public static final PathElement PATH$maxArrayLayers = PathElement.groupElement("PATH$maxArrayLayers");
    public static final PathElement PATH$sampleCounts = PathElement.groupElement("PATH$sampleCounts");
    public static final PathElement PATH$maxResourceSize = PathElement.groupElement("PATH$maxResourceSize");

    public static final StructLayout LAYOUT$maxExtent = (StructLayout) LAYOUT.select(PATH$maxExtent);
    public static final OfInt LAYOUT$maxMipLevels = (OfInt) LAYOUT.select(PATH$maxMipLevels);
    public static final OfInt LAYOUT$maxArrayLayers = (OfInt) LAYOUT.select(PATH$maxArrayLayers);
    public static final OfInt LAYOUT$sampleCounts = (OfInt) LAYOUT.select(PATH$sampleCounts);
    public static final OfLong LAYOUT$maxResourceSize = (OfLong) LAYOUT.select(PATH$maxResourceSize);

    public static final long SIZE$maxExtent = LAYOUT$maxExtent.byteSize();
    public static final long SIZE$maxMipLevels = LAYOUT$maxMipLevels.byteSize();
    public static final long SIZE$maxArrayLayers = LAYOUT$maxArrayLayers.byteSize();
    public static final long SIZE$sampleCounts = LAYOUT$sampleCounts.byteSize();
    public static final long SIZE$maxResourceSize = LAYOUT$maxResourceSize.byteSize();

    public static final long OFFSET$maxExtent = LAYOUT.byteOffset(PATH$maxExtent);
    public static final long OFFSET$maxMipLevels = LAYOUT.byteOffset(PATH$maxMipLevels);
    public static final long OFFSET$maxArrayLayers = LAYOUT.byteOffset(PATH$maxArrayLayers);
    public static final long OFFSET$sampleCounts = LAYOUT.byteOffset(PATH$sampleCounts);
    public static final long OFFSET$maxResourceSize = LAYOUT.byteOffset(PATH$maxResourceSize);

    public VkExtent3D maxExtent() {
        return new VkExtent3D(segment.asSlice(OFFSET$maxExtent, LAYOUT$maxExtent));
    }

    public void maxExtent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxExtent, SIZE$maxExtent);
    }

    public @unsigned int maxMipLevels() {
        return segment.get(LAYOUT$maxMipLevels, OFFSET$maxMipLevels);
    }

    public void maxMipLevels(@unsigned int value) {
        segment.set(LAYOUT$maxMipLevels, OFFSET$maxMipLevels, value);
    }

    public @unsigned int maxArrayLayers() {
        return segment.get(LAYOUT$maxArrayLayers, OFFSET$maxArrayLayers);
    }

    public void maxArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$maxArrayLayers, OFFSET$maxArrayLayers, value);
    }

    public @enumtype(VkSampleCountFlags.class) int sampleCounts() {
        return segment.get(LAYOUT$sampleCounts, OFFSET$sampleCounts);
    }

    public void sampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampleCounts, OFFSET$sampleCounts, value);
    }

    public @unsigned long maxResourceSize() {
        return segment.get(LAYOUT$maxResourceSize, OFFSET$maxResourceSize);
    }

    public void maxResourceSize(@unsigned long value) {
        segment.set(LAYOUT$maxResourceSize, OFFSET$maxResourceSize, value);
    }

}

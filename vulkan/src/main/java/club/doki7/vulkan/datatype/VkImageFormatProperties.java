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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatProperties.html"><code>VkImageFormatProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageFormatProperties {
///     VkExtent3D maxExtent; // @link substring="VkExtent3D" target="VkExtent3D" @link substring="maxExtent" target="#maxExtent"
///     uint32_t maxMipLevels; // @link substring="maxMipLevels" target="#maxMipLevels"
///     uint32_t maxArrayLayers; // @link substring="maxArrayLayers" target="#maxArrayLayers"
///     VkSampleCountFlags sampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="sampleCounts" target="#sampleCounts"
///     VkDeviceSize maxResourceSize; // @link substring="maxResourceSize" target="#maxResourceSize"
/// } VkImageFormatProperties;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatProperties.html"><code>VkImageFormatProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageFormatProperties(@NotNull MemorySegment segment) implements IVkImageFormatProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatProperties.html"><code>VkImageFormatProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkImageFormatProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkImageFormatProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkImageFormatProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkImageFormatProperties {
        public long size() {
            return segment.byteSize() / VkImageFormatProperties.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkImageFormatProperties at(long index) {
            return new VkImageFormatProperties(segment.asSlice(index * VkImageFormatProperties.BYTES, VkImageFormatProperties.BYTES));
        }
        public void write(long index, @NotNull VkImageFormatProperties value) {
            MemorySegment s = segment.asSlice(index * VkImageFormatProperties.BYTES, VkImageFormatProperties.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkImageFormatProperties allocate(Arena arena) {
        return new VkImageFormatProperties(arena.allocate(LAYOUT));
    }

    public static VkImageFormatProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageFormatProperties.Ptr ret = new VkImageFormatProperties.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkImageFormatProperties clone(Arena arena, VkImageFormatProperties src) {
        VkImageFormatProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull VkExtent3D maxExtent() {
        return new VkExtent3D(segment.asSlice(OFFSET$maxExtent, LAYOUT$maxExtent));
    }

    public void maxExtent(@NotNull VkExtent3D value) {
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkExtent3D.LAYOUT.withName("maxExtent"),
        ValueLayout.JAVA_INT.withName("maxMipLevels"),
        ValueLayout.JAVA_INT.withName("maxArrayLayers"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        ValueLayout.JAVA_LONG.withName("maxResourceSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$maxExtent = PathElement.groupElement("maxExtent");
    public static final PathElement PATH$maxMipLevels = PathElement.groupElement("maxMipLevels");
    public static final PathElement PATH$maxArrayLayers = PathElement.groupElement("maxArrayLayers");
    public static final PathElement PATH$sampleCounts = PathElement.groupElement("sampleCounts");
    public static final PathElement PATH$maxResourceSize = PathElement.groupElement("maxResourceSize");

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
}

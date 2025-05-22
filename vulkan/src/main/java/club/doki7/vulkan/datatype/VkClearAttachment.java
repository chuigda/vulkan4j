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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearAttachment.html"><code>VkClearAttachment</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClearAttachment {
///     VkImageAspectFlags aspectMask; // @link substring="VkImageAspectFlags" target="VkImageAspectFlags" @link substring="aspectMask" target="#aspectMask"
///     uint32_t colorAttachment; // @link substring="colorAttachment" target="#colorAttachment"
///     VkClearValue clearValue; // @link substring="VkClearValue" target="VkClearValue" @link substring="clearValue" target="#clearValue"
/// } VkClearAttachment;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearAttachment.html"><code>VkClearAttachment</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClearAttachment(@NotNull MemorySegment segment) implements IVkClearAttachment {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearAttachment.html"><code>VkClearAttachment</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkClearAttachment}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkClearAttachment to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkClearAttachment.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkClearAttachment {
        public long size() {
            return segment.byteSize() / VkClearAttachment.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkClearAttachment at(long index) {
            return new VkClearAttachment(segment.asSlice(index * VkClearAttachment.BYTES, VkClearAttachment.BYTES));
        }
        public void write(long index, @NotNull VkClearAttachment value) {
            MemorySegment s = segment.asSlice(index * VkClearAttachment.BYTES, VkClearAttachment.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkClearAttachment allocate(Arena arena) {
        return new VkClearAttachment(arena.allocate(LAYOUT));
    }

    public static VkClearAttachment.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearAttachment.Ptr ret = new VkClearAttachment.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkClearAttachment clone(Arena arena, VkClearAttachment src) {
        VkClearAttachment ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public @unsigned int colorAttachment() {
        return segment.get(LAYOUT$colorAttachment, OFFSET$colorAttachment);
    }

    public void colorAttachment(@unsigned int value) {
        segment.set(LAYOUT$colorAttachment, OFFSET$colorAttachment, value);
    }

    public @NotNull VkClearValue clearValue() {
        return new VkClearValue(segment.asSlice(OFFSET$clearValue, LAYOUT$clearValue));
    }

    public void clearValue(@NotNull VkClearValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clearValue, SIZE$clearValue);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("colorAttachment"),
        VkClearValue.LAYOUT.withName("clearValue")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");
    public static final PathElement PATH$colorAttachment = PathElement.groupElement("colorAttachment");
    public static final PathElement PATH$clearValue = PathElement.groupElement("clearValue");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final OfInt LAYOUT$colorAttachment = (OfInt) LAYOUT.select(PATH$colorAttachment);
    public static final StructLayout LAYOUT$clearValue = (StructLayout) LAYOUT.select(PATH$clearValue);

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$colorAttachment = LAYOUT$colorAttachment.byteSize();
    public static final long SIZE$clearValue = LAYOUT$clearValue.byteSize();

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$colorAttachment = LAYOUT.byteOffset(PATH$colorAttachment);
    public static final long OFFSET$clearValue = LAYOUT.byteOffset(PATH$clearValue);
}

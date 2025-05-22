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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearDepthStencilValue.html"><code>VkClearDepthStencilValue</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClearDepthStencilValue {
///     float depth; // @link substring="depth" target="#depth"
///     uint32_t stencil; // @link substring="stencil" target="#stencil"
/// } VkClearDepthStencilValue;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearDepthStencilValue.html"><code>VkClearDepthStencilValue</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClearDepthStencilValue(@NotNull MemorySegment segment) implements IVkClearDepthStencilValue {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearDepthStencilValue.html"><code>VkClearDepthStencilValue</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkClearDepthStencilValue}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkClearDepthStencilValue to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkClearDepthStencilValue.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkClearDepthStencilValue {
        public long size() {
            return segment.byteSize() / VkClearDepthStencilValue.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkClearDepthStencilValue at(long index) {
            return new VkClearDepthStencilValue(segment.asSlice(index * VkClearDepthStencilValue.BYTES, VkClearDepthStencilValue.BYTES));
        }
        public void write(long index, @NotNull VkClearDepthStencilValue value) {
            MemorySegment s = segment.asSlice(index * VkClearDepthStencilValue.BYTES, VkClearDepthStencilValue.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkClearDepthStencilValue allocate(Arena arena) {
        return new VkClearDepthStencilValue(arena.allocate(LAYOUT));
    }

    public static VkClearDepthStencilValue.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearDepthStencilValue.Ptr ret = new VkClearDepthStencilValue.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkClearDepthStencilValue clone(Arena arena, VkClearDepthStencilValue src) {
        VkClearDepthStencilValue ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float depth() {
        return segment.get(LAYOUT$depth, OFFSET$depth);
    }

    public void depth(float value) {
        segment.set(LAYOUT$depth, OFFSET$depth, value);
    }

    public @unsigned int stencil() {
        return segment.get(LAYOUT$stencil, OFFSET$stencil);
    }

    public void stencil(@unsigned int value) {
        segment.set(LAYOUT$stencil, OFFSET$stencil, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("depth"),
        ValueLayout.JAVA_INT.withName("stencil")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$depth = PathElement.groupElement("depth");
    public static final PathElement PATH$stencil = PathElement.groupElement("stencil");

    public static final OfFloat LAYOUT$depth = (OfFloat) LAYOUT.select(PATH$depth);
    public static final OfInt LAYOUT$stencil = (OfInt) LAYOUT.select(PATH$stencil);

    public static final long SIZE$depth = LAYOUT$depth.byteSize();
    public static final long SIZE$stencil = LAYOUT$stencil.byteSize();

    public static final long OFFSET$depth = LAYOUT.byteOffset(PATH$depth);
    public static final long OFFSET$stencil = LAYOUT.byteOffset(PATH$stencil);
}

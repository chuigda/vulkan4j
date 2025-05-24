package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearValue.html"><code>VkClearValue</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClearValue {
///     VkClearColorValue color; // @link substring="VkClearColorValue" target="VkClearColorValue" @link substring="color" target="#color"
///     VkClearDepthStencilValue depthStencil; // @link substring="VkClearDepthStencilValue" target="VkClearDepthStencilValue" @link substring="depthStencil" target="#depthStencil"
/// } VkClearValue;
/// }
///
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearValue.html"><code>VkClearValue</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClearValue(@NotNull MemorySegment segment) implements IVkClearValue {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearValue.html"><code>VkClearValue</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkClearValue}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkClearValue to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkClearValue.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkClearValue {
        public long size() {
            return segment.byteSize() / VkClearValue.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkClearValue at(long index) {
            return new VkClearValue(segment.asSlice(index * VkClearValue.BYTES, VkClearValue.BYTES));
        }

        public void write(long index, @NotNull VkClearValue value) {
            MemorySegment s = segment.asSlice(index * VkClearValue.BYTES, VkClearValue.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkClearValue.BYTES, VkClearValue.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkClearValue.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkClearValue.BYTES,
                (end - start) * VkClearValue.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkClearValue.BYTES));
        }

        public VkClearValue[] toArray() {
            VkClearValue[] ret = new VkClearValue[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkClearValue allocate(Arena arena) {
        return new VkClearValue(arena.allocate(LAYOUT));
    }

    public static VkClearValue.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkClearValue.Ptr(segment);
    }

    public static VkClearValue clone(Arena arena, VkClearValue src) {
        VkClearValue ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull VkClearColorValue color() {
        return new VkClearColorValue(segment.asSlice(OFFSET$color, LAYOUT$color));
    }

    public void color(@NotNull VkClearColorValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$color, SIZE$color);
    }

    public @NotNull VkClearDepthStencilValue depthStencil() {
        return new VkClearDepthStencilValue(segment.asSlice(OFFSET$depthStencil, LAYOUT$depthStencil));
    }

    public void depthStencil(@NotNull VkClearDepthStencilValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$depthStencil, SIZE$depthStencil);
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        VkClearColorValue.LAYOUT.withName("color"),
        VkClearDepthStencilValue.LAYOUT.withName("depthStencil")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$color = PathElement.groupElement("color");
    public static final PathElement PATH$depthStencil = PathElement.groupElement("depthStencil");

    public static final StructLayout LAYOUT$color = (StructLayout) LAYOUT.select(PATH$color);
    public static final StructLayout LAYOUT$depthStencil = (StructLayout) LAYOUT.select(PATH$depthStencil);

    public static final long SIZE$color = LAYOUT$color.byteSize();
    public static final long SIZE$depthStencil = LAYOUT$depthStencil.byteSize();

    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);
    public static final long OFFSET$depthStencil = LAYOUT.byteOffset(PATH$depthStencil);
}

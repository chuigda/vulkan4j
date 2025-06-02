package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsPushConstantTokenEXT.html"><code>VkIndirectCommandsPushConstantTokenEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectCommandsPushConstantTokenEXT {
///     VkPushConstantRange updateRange; // @link substring="VkPushConstantRange" target="VkPushConstantRange" @link substring="updateRange" target="#updateRange"
/// } VkIndirectCommandsPushConstantTokenEXT;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsPushConstantTokenEXT.html"><code>VkIndirectCommandsPushConstantTokenEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsPushConstantTokenEXT(@NotNull MemorySegment segment) implements IVkIndirectCommandsPushConstantTokenEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsPushConstantTokenEXT.html"><code>VkIndirectCommandsPushConstantTokenEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkIndirectCommandsPushConstantTokenEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkIndirectCommandsPushConstantTokenEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkIndirectCommandsPushConstantTokenEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkIndirectCommandsPushConstantTokenEXT, Iterable<VkIndirectCommandsPushConstantTokenEXT> {
        public long size() {
            return segment.byteSize() / VkIndirectCommandsPushConstantTokenEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkIndirectCommandsPushConstantTokenEXT at(long index) {
            return new VkIndirectCommandsPushConstantTokenEXT(segment.asSlice(index * VkIndirectCommandsPushConstantTokenEXT.BYTES, VkIndirectCommandsPushConstantTokenEXT.BYTES));
        }

        public void write(long index, @NotNull VkIndirectCommandsPushConstantTokenEXT value) {
            MemorySegment s = segment.asSlice(index * VkIndirectCommandsPushConstantTokenEXT.BYTES, VkIndirectCommandsPushConstantTokenEXT.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VkIndirectCommandsPushConstantTokenEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkIndirectCommandsPushConstantTokenEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkIndirectCommandsPushConstantTokenEXT.BYTES,
                (end - start) * VkIndirectCommandsPushConstantTokenEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkIndirectCommandsPushConstantTokenEXT.BYTES));
        }

        public VkIndirectCommandsPushConstantTokenEXT[] toArray() {
            VkIndirectCommandsPushConstantTokenEXT[] ret = new VkIndirectCommandsPushConstantTokenEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkIndirectCommandsPushConstantTokenEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkIndirectCommandsPushConstantTokenEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkIndirectCommandsPushConstantTokenEXT.BYTES;
            }

            @Override
            public VkIndirectCommandsPushConstantTokenEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkIndirectCommandsPushConstantTokenEXT ret = new VkIndirectCommandsPushConstantTokenEXT(segment.asSlice(0, VkIndirectCommandsPushConstantTokenEXT.BYTES));
                segment = segment.asSlice(VkIndirectCommandsPushConstantTokenEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkIndirectCommandsPushConstantTokenEXT allocate(Arena arena) {
        return new VkIndirectCommandsPushConstantTokenEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsPushConstantTokenEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkIndirectCommandsPushConstantTokenEXT.Ptr(segment);
    }

    public static VkIndirectCommandsPushConstantTokenEXT clone(Arena arena, VkIndirectCommandsPushConstantTokenEXT src) {
        VkIndirectCommandsPushConstantTokenEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull VkPushConstantRange updateRange() {
        return new VkPushConstantRange(segment.asSlice(OFFSET$updateRange, LAYOUT$updateRange));
    }

    public VkIndirectCommandsPushConstantTokenEXT updateRange(@NotNull VkPushConstantRange value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$updateRange, SIZE$updateRange);
        return this;
    }

    public VkIndirectCommandsPushConstantTokenEXT updateRange(Consumer<@NotNull VkPushConstantRange> consumer) {
        consumer.accept(updateRange());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkPushConstantRange.LAYOUT.withName("updateRange")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$updateRange = PathElement.groupElement("updateRange");

    public static final StructLayout LAYOUT$updateRange = (StructLayout) LAYOUT.select(PATH$updateRange);

    public static final long SIZE$updateRange = LAYOUT$updateRange.byteSize();

    public static final long OFFSET$updateRange = LAYOUT.byteOffset(PATH$updateRange);
}

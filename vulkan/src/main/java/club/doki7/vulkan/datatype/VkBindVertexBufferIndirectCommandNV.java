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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindVertexBufferIndirectCommandNV.html"><code>VkBindVertexBufferIndirectCommandNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBindVertexBufferIndirectCommandNV {
///     VkDeviceAddress bufferAddress; // @link substring="bufferAddress" target="#bufferAddress"
///     uint32_t size; // @link substring="size" target="#size"
///     uint32_t stride; // @link substring="stride" target="#stride"
/// } VkBindVertexBufferIndirectCommandNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindVertexBufferIndirectCommandNV.html"><code>VkBindVertexBufferIndirectCommandNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBindVertexBufferIndirectCommandNV(@NotNull MemorySegment segment) implements IVkBindVertexBufferIndirectCommandNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindVertexBufferIndirectCommandNV.html"><code>VkBindVertexBufferIndirectCommandNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkBindVertexBufferIndirectCommandNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkBindVertexBufferIndirectCommandNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkBindVertexBufferIndirectCommandNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkBindVertexBufferIndirectCommandNV, Iterable<VkBindVertexBufferIndirectCommandNV> {
        public long size() {
            return segment.byteSize() / VkBindVertexBufferIndirectCommandNV.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkBindVertexBufferIndirectCommandNV at(long index) {
            return new VkBindVertexBufferIndirectCommandNV(segment.asSlice(index * VkBindVertexBufferIndirectCommandNV.BYTES, VkBindVertexBufferIndirectCommandNV.BYTES));
        }

        public void write(long index, @NotNull VkBindVertexBufferIndirectCommandNV value) {
            MemorySegment s = segment.asSlice(index * VkBindVertexBufferIndirectCommandNV.BYTES, VkBindVertexBufferIndirectCommandNV.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkBindVertexBufferIndirectCommandNV.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkBindVertexBufferIndirectCommandNV.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkBindVertexBufferIndirectCommandNV.BYTES,
                (end - start) * VkBindVertexBufferIndirectCommandNV.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkBindVertexBufferIndirectCommandNV.BYTES));
        }

        public VkBindVertexBufferIndirectCommandNV[] toArray() {
            VkBindVertexBufferIndirectCommandNV[] ret = new VkBindVertexBufferIndirectCommandNV[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<VkBindVertexBufferIndirectCommandNV> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkBindVertexBufferIndirectCommandNV.BYTES;
            }

            @Override
            public VkBindVertexBufferIndirectCommandNV next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkBindVertexBufferIndirectCommandNV ret = new VkBindVertexBufferIndirectCommandNV(segment.asSlice(0, VkBindVertexBufferIndirectCommandNV.BYTES));
                segment = segment.asSlice(VkBindVertexBufferIndirectCommandNV.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkBindVertexBufferIndirectCommandNV allocate(Arena arena) {
        return new VkBindVertexBufferIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkBindVertexBufferIndirectCommandNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkBindVertexBufferIndirectCommandNV.Ptr(segment);
    }

    public static VkBindVertexBufferIndirectCommandNV clone(Arena arena, VkBindVertexBufferIndirectCommandNV src) {
        VkBindVertexBufferIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("VkDeviceAddress") @Unsigned long bufferAddress() {
        return segment.get(LAYOUT$bufferAddress, OFFSET$bufferAddress);
    }

    public VkBindVertexBufferIndirectCommandNV bufferAddress(@NativeType("VkDeviceAddress") @Unsigned long value) {
        segment.set(LAYOUT$bufferAddress, OFFSET$bufferAddress, value);
        return this;
    }

    public @Unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public VkBindVertexBufferIndirectCommandNV size(@Unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
        return this;
    }

    public @Unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public VkBindVertexBufferIndirectCommandNV stride(@Unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("stride")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bufferAddress = PathElement.groupElement("bufferAddress");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");

    public static final OfLong LAYOUT$bufferAddress = (OfLong) LAYOUT.select(PATH$bufferAddress);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);

    public static final long SIZE$bufferAddress = LAYOUT$bufferAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();

    public static final long OFFSET$bufferAddress = LAYOUT.byteOffset(PATH$bufferAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
}

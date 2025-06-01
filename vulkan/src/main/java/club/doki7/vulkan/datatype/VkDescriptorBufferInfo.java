package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorBufferInfo.html"><code>VkDescriptorBufferInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorBufferInfo {
///     VkBuffer buffer; // optional // @link substring="VkBuffer" target="VkBuffer" @link substring="buffer" target="#buffer"
///     VkDeviceSize offset; // @link substring="offset" target="#offset"
///     VkDeviceSize range; // @link substring="range" target="#range"
/// } VkDescriptorBufferInfo;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorBufferInfo.html"><code>VkDescriptorBufferInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorBufferInfo(@NotNull MemorySegment segment) implements IVkDescriptorBufferInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorBufferInfo.html"><code>VkDescriptorBufferInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDescriptorBufferInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDescriptorBufferInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDescriptorBufferInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDescriptorBufferInfo, Iterable<VkDescriptorBufferInfo> {
        public long size() {
            return segment.byteSize() / VkDescriptorBufferInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDescriptorBufferInfo at(long index) {
            return new VkDescriptorBufferInfo(segment.asSlice(index * VkDescriptorBufferInfo.BYTES, VkDescriptorBufferInfo.BYTES));
        }

        public void write(long index, @NotNull VkDescriptorBufferInfo value) {
            MemorySegment s = segment.asSlice(index * VkDescriptorBufferInfo.BYTES, VkDescriptorBufferInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkDescriptorBufferInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDescriptorBufferInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDescriptorBufferInfo.BYTES,
                (end - start) * VkDescriptorBufferInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDescriptorBufferInfo.BYTES));
        }

        public VkDescriptorBufferInfo[] toArray() {
            VkDescriptorBufferInfo[] ret = new VkDescriptorBufferInfo[(int) size()];
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
        public static final class Iter implements Iterator<VkDescriptorBufferInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkDescriptorBufferInfo.BYTES;
            }

            @Override
            public VkDescriptorBufferInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkDescriptorBufferInfo ret = new VkDescriptorBufferInfo(segment.asSlice(0, VkDescriptorBufferInfo.BYTES));
                segment = segment.asSlice(VkDescriptorBufferInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkDescriptorBufferInfo allocate(Arena arena) {
        return new VkDescriptorBufferInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorBufferInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkDescriptorBufferInfo.Ptr(segment);
    }

    public static VkDescriptorBufferInfo clone(Arena arena, VkDescriptorBufferInfo src) {
        VkDescriptorBufferInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable VkBuffer buffer() {
        MemorySegment s = segment.asSlice(OFFSET$buffer, SIZE$buffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public VkDescriptorBufferInfo buffer(@Nullable VkBuffer value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public VkDescriptorBufferInfo offset(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long range() {
        return segment.get(LAYOUT$range, OFFSET$range);
    }

    public VkDescriptorBufferInfo range(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$range, OFFSET$range, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("range")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$range = PathElement.groupElement("range");

    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$range = (OfLong) LAYOUT.select(PATH$range);

    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$range = LAYOUT$range.byteSize();

    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$range = LAYOUT.byteOffset(PATH$range);
}

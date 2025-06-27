package club.doki7.webgpu.datatype;

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
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.handle.*;
import club.doki7.webgpu.enumtype.*;
import static club.doki7.webgpu.WGPUConstants.*;

/// Represents a pointer to a {@code WGPUBindGroupEntry} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUBindGroupEntry {
///     uint32_t binding; // @link substring="binding" target="#binding"
///     WGPUBuffer buffer; // optional // @link substring="WGPUBuffer" target="WGPUBuffer" @link substring="buffer" target="#buffer"
///     uint64_t offset; // @link substring="offset" target="#offset"
///     uint64_t size; // @link substring="size" target="#size"
///     WGPUSampler sampler; // optional // @link substring="WGPUSampler" target="WGPUSampler" @link substring="sampler" target="#sampler"
///     WGPUTextureView textureView; // optional // @link substring="WGPUTextureView" target="WGPUTextureView" @link substring="textureView" target="#textureView"
/// } WGPUBindGroupEntry;
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
@ValueBasedCandidate
@UnsafeConstructor
public record WGPUBindGroupEntry(@NotNull MemorySegment segment) implements IWGPUBindGroupEntry {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUBindGroupEntry}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUBindGroupEntry to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUBindGroupEntry.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUBindGroupEntry, Iterable<WGPUBindGroupEntry> {
        public long size() {
            return segment.byteSize() / WGPUBindGroupEntry.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUBindGroupEntry at(long index) {
            return new WGPUBindGroupEntry(segment.asSlice(index * WGPUBindGroupEntry.BYTES, WGPUBindGroupEntry.BYTES));
        }

        public WGPUBindGroupEntry.Ptr at(long index, @NotNull Consumer<@NotNull WGPUBindGroupEntry> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUBindGroupEntry value) {
            MemorySegment s = segment.asSlice(index * WGPUBindGroupEntry.BYTES, WGPUBindGroupEntry.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUBindGroupEntry.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUBindGroupEntry.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUBindGroupEntry.BYTES,
                (end - start) * WGPUBindGroupEntry.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUBindGroupEntry.BYTES));
        }

        public WGPUBindGroupEntry[] toArray() {
            WGPUBindGroupEntry[] ret = new WGPUBindGroupEntry[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUBindGroupEntry> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUBindGroupEntry> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUBindGroupEntry.BYTES;
            }

            @Override
            public WGPUBindGroupEntry next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUBindGroupEntry ret = new WGPUBindGroupEntry(segment.asSlice(0, WGPUBindGroupEntry.BYTES));
                segment = segment.asSlice(WGPUBindGroupEntry.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUBindGroupEntry allocate(Arena arena) {
        return new WGPUBindGroupEntry(arena.allocate(LAYOUT));
    }

    public static WGPUBindGroupEntry.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUBindGroupEntry.Ptr(segment);
    }

    public static WGPUBindGroupEntry clone(Arena arena, WGPUBindGroupEntry src) {
        WGPUBindGroupEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public WGPUBindGroupEntry binding(@Unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
        return this;
    }

    public @Nullable WGPUBuffer buffer() {
        MemorySegment s = segment.asSlice(OFFSET$buffer, SIZE$buffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUBuffer(s);
    }

    public WGPUBindGroupEntry buffer(@Nullable WGPUBuffer value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public WGPUBindGroupEntry offset(@Unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public @Unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public WGPUBindGroupEntry size(@Unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
        return this;
    }

    public @Nullable WGPUSampler sampler() {
        MemorySegment s = segment.asSlice(OFFSET$sampler, SIZE$sampler);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUSampler(s);
    }

    public WGPUBindGroupEntry sampler(@Nullable WGPUSampler value) {
        segment.set(LAYOUT$sampler, OFFSET$sampler, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable WGPUTextureView textureView() {
        MemorySegment s = segment.asSlice(OFFSET$textureView, SIZE$textureView);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUTextureView(s);
    }

    public WGPUBindGroupEntry textureView(@Nullable WGPUTextureView value) {
        segment.set(LAYOUT$textureView, OFFSET$textureView, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.ADDRESS.withName("sampler"),
        ValueLayout.ADDRESS.withName("textureView")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$sampler = PathElement.groupElement("sampler");
    public static final PathElement PATH$textureView = PathElement.groupElement("textureView");

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final AddressLayout LAYOUT$sampler = (AddressLayout) LAYOUT.select(PATH$sampler);
    public static final AddressLayout LAYOUT$textureView = (AddressLayout) LAYOUT.select(PATH$textureView);

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$sampler = LAYOUT$sampler.byteSize();
    public static final long SIZE$textureView = LAYOUT$textureView.byteSize();

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);
    public static final long OFFSET$textureView = LAYOUT.byteOffset(PATH$textureView);
}

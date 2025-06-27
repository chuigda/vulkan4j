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

/// Represents a pointer to a {@code WGPUBindGroupLayoutEntry} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUBindGroupLayoutEntry {
///     uint32_t binding; // @link substring="binding" target="#binding"
///     WGPUShaderStage visibility; // @link substring="WGPUShaderStage" target="WGPUShaderStage" @link substring="visibility" target="#visibility"
///     WGPUBufferBindingLayout buffer; // @link substring="WGPUBufferBindingLayout" target="WGPUBufferBindingLayout" @link substring="buffer" target="#buffer"
///     WGPUSamplerBindingLayout sampler; // @link substring="WGPUSamplerBindingLayout" target="WGPUSamplerBindingLayout" @link substring="sampler" target="#sampler"
///     WGPUTextureBindingLayout texture; // @link substring="WGPUTextureBindingLayout" target="WGPUTextureBindingLayout" @link substring="texture" target="#texture"
///     WGPUStorageTextureBindingLayout storageTexture; // @link substring="WGPUStorageTextureBindingLayout" target="WGPUStorageTextureBindingLayout" @link substring="storageTexture" target="#storageTexture"
/// } WGPUBindGroupLayoutEntry;
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
public record WGPUBindGroupLayoutEntry(@NotNull MemorySegment segment) implements IWGPUBindGroupLayoutEntry {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUBindGroupLayoutEntry}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUBindGroupLayoutEntry to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUBindGroupLayoutEntry.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUBindGroupLayoutEntry, Iterable<WGPUBindGroupLayoutEntry> {
        public long size() {
            return segment.byteSize() / WGPUBindGroupLayoutEntry.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUBindGroupLayoutEntry at(long index) {
            return new WGPUBindGroupLayoutEntry(segment.asSlice(index * WGPUBindGroupLayoutEntry.BYTES, WGPUBindGroupLayoutEntry.BYTES));
        }

        public WGPUBindGroupLayoutEntry.Ptr at(long index, @NotNull Consumer<@NotNull WGPUBindGroupLayoutEntry> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUBindGroupLayoutEntry value) {
            MemorySegment s = segment.asSlice(index * WGPUBindGroupLayoutEntry.BYTES, WGPUBindGroupLayoutEntry.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUBindGroupLayoutEntry.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUBindGroupLayoutEntry.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUBindGroupLayoutEntry.BYTES,
                (end - start) * WGPUBindGroupLayoutEntry.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUBindGroupLayoutEntry.BYTES));
        }

        public WGPUBindGroupLayoutEntry[] toArray() {
            WGPUBindGroupLayoutEntry[] ret = new WGPUBindGroupLayoutEntry[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUBindGroupLayoutEntry> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUBindGroupLayoutEntry> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUBindGroupLayoutEntry.BYTES;
            }

            @Override
            public WGPUBindGroupLayoutEntry next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUBindGroupLayoutEntry ret = new WGPUBindGroupLayoutEntry(segment.asSlice(0, WGPUBindGroupLayoutEntry.BYTES));
                segment = segment.asSlice(WGPUBindGroupLayoutEntry.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUBindGroupLayoutEntry allocate(Arena arena) {
        return new WGPUBindGroupLayoutEntry(arena.allocate(LAYOUT));
    }

    public static WGPUBindGroupLayoutEntry.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUBindGroupLayoutEntry.Ptr(segment);
    }

    public static WGPUBindGroupLayoutEntry clone(Arena arena, WGPUBindGroupLayoutEntry src) {
        WGPUBindGroupLayoutEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public WGPUBindGroupLayoutEntry binding(@Unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
        return this;
    }

    public @Bitmask(WGPUShaderStage.class) long visibility() {
        return segment.get(LAYOUT$visibility, OFFSET$visibility);
    }

    public WGPUBindGroupLayoutEntry visibility(@Bitmask(WGPUShaderStage.class) long value) {
        segment.set(LAYOUT$visibility, OFFSET$visibility, value);
        return this;
    }

    public @NotNull WGPUBufferBindingLayout buffer() {
        return new WGPUBufferBindingLayout(segment.asSlice(OFFSET$buffer, LAYOUT$buffer));
    }

    public WGPUBindGroupLayoutEntry buffer(@NotNull WGPUBufferBindingLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$buffer, SIZE$buffer);
        return this;
    }

    public WGPUBindGroupLayoutEntry buffer(Consumer<@NotNull WGPUBufferBindingLayout> consumer) {
        consumer.accept(buffer());
        return this;
    }

    public @NotNull WGPUSamplerBindingLayout sampler() {
        return new WGPUSamplerBindingLayout(segment.asSlice(OFFSET$sampler, LAYOUT$sampler));
    }

    public WGPUBindGroupLayoutEntry sampler(@NotNull WGPUSamplerBindingLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampler, SIZE$sampler);
        return this;
    }

    public WGPUBindGroupLayoutEntry sampler(Consumer<@NotNull WGPUSamplerBindingLayout> consumer) {
        consumer.accept(sampler());
        return this;
    }

    public @NotNull WGPUTextureBindingLayout texture() {
        return new WGPUTextureBindingLayout(segment.asSlice(OFFSET$texture, LAYOUT$texture));
    }

    public WGPUBindGroupLayoutEntry texture(@NotNull WGPUTextureBindingLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$texture, SIZE$texture);
        return this;
    }

    public WGPUBindGroupLayoutEntry texture(Consumer<@NotNull WGPUTextureBindingLayout> consumer) {
        consumer.accept(texture());
        return this;
    }

    public @NotNull WGPUStorageTextureBindingLayout storageTexture() {
        return new WGPUStorageTextureBindingLayout(segment.asSlice(OFFSET$storageTexture, LAYOUT$storageTexture));
    }

    public WGPUBindGroupLayoutEntry storageTexture(@NotNull WGPUStorageTextureBindingLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$storageTexture, SIZE$storageTexture);
        return this;
    }

    public WGPUBindGroupLayoutEntry storageTexture(Consumer<@NotNull WGPUStorageTextureBindingLayout> consumer) {
        consumer.accept(storageTexture());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_LONG.withName("visibility"),
        WGPUBufferBindingLayout.LAYOUT.withName("buffer"),
        WGPUSamplerBindingLayout.LAYOUT.withName("sampler"),
        WGPUTextureBindingLayout.LAYOUT.withName("texture"),
        WGPUStorageTextureBindingLayout.LAYOUT.withName("storageTexture")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$visibility = PathElement.groupElement("visibility");
    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$sampler = PathElement.groupElement("sampler");
    public static final PathElement PATH$texture = PathElement.groupElement("texture");
    public static final PathElement PATH$storageTexture = PathElement.groupElement("storageTexture");

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfLong LAYOUT$visibility = (OfLong) LAYOUT.select(PATH$visibility);
    public static final StructLayout LAYOUT$buffer = (StructLayout) LAYOUT.select(PATH$buffer);
    public static final StructLayout LAYOUT$sampler = (StructLayout) LAYOUT.select(PATH$sampler);
    public static final StructLayout LAYOUT$texture = (StructLayout) LAYOUT.select(PATH$texture);
    public static final StructLayout LAYOUT$storageTexture = (StructLayout) LAYOUT.select(PATH$storageTexture);

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$visibility = LAYOUT$visibility.byteSize();
    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$sampler = LAYOUT$sampler.byteSize();
    public static final long SIZE$texture = LAYOUT$texture.byteSize();
    public static final long SIZE$storageTexture = LAYOUT$storageTexture.byteSize();

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$visibility = LAYOUT.byteOffset(PATH$visibility);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);
    public static final long OFFSET$texture = LAYOUT.byteOffset(PATH$texture);
    public static final long OFFSET$storageTexture = LAYOUT.byteOffset(PATH$storageTexture);
}

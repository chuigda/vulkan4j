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

/// Represents a pointer to a {@code WGPUBindGroupEntryExtras} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUBindGroupEntryExtras {
///     WGPUChainedStruct chain; // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="chain" target="#chain"
///     WGPUBuffer const* buffers; // @link substring="WGPUBuffer" target="WGPUBuffer" @link substring="buffers" target="#buffers"
///     size_t bufferCount; // @link substring="bufferCount" target="#bufferCount"
///     WGPUSampler const* samplers; // @link substring="WGPUSampler" target="WGPUSampler" @link substring="samplers" target="#samplers"
///     size_t samplerCount; // @link substring="samplerCount" target="#samplerCount"
///     WGPUTextureView const* textureViews; // @link substring="WGPUTextureView" target="WGPUTextureView" @link substring="textureViews" target="#textureViews"
///     size_t textureViewCount; // @link substring="textureViewCount" target="#textureViewCount"
/// } WGPUBindGroupEntryExtras;
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
public record WGPUBindGroupEntryExtras(@NotNull MemorySegment segment) implements IWGPUBindGroupEntryExtras {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUBindGroupEntryExtras}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUBindGroupEntryExtras to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUBindGroupEntryExtras.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUBindGroupEntryExtras, Iterable<WGPUBindGroupEntryExtras> {
        public long size() {
            return segment.byteSize() / WGPUBindGroupEntryExtras.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUBindGroupEntryExtras at(long index) {
            return new WGPUBindGroupEntryExtras(segment.asSlice(index * WGPUBindGroupEntryExtras.BYTES, WGPUBindGroupEntryExtras.BYTES));
        }

        public WGPUBindGroupEntryExtras.Ptr at(long index, @NotNull Consumer<@NotNull WGPUBindGroupEntryExtras> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUBindGroupEntryExtras value) {
            MemorySegment s = segment.asSlice(index * WGPUBindGroupEntryExtras.BYTES, WGPUBindGroupEntryExtras.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUBindGroupEntryExtras.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUBindGroupEntryExtras.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUBindGroupEntryExtras.BYTES,
                (end - start) * WGPUBindGroupEntryExtras.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUBindGroupEntryExtras.BYTES));
        }

        public WGPUBindGroupEntryExtras[] toArray() {
            WGPUBindGroupEntryExtras[] ret = new WGPUBindGroupEntryExtras[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUBindGroupEntryExtras> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUBindGroupEntryExtras> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUBindGroupEntryExtras.BYTES;
            }

            @Override
            public WGPUBindGroupEntryExtras next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUBindGroupEntryExtras ret = new WGPUBindGroupEntryExtras(segment.asSlice(0, WGPUBindGroupEntryExtras.BYTES));
                segment = segment.asSlice(WGPUBindGroupEntryExtras.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUBindGroupEntryExtras allocate(Arena arena) {
        return new WGPUBindGroupEntryExtras(arena.allocate(LAYOUT));
    }

    public static WGPUBindGroupEntryExtras.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUBindGroupEntryExtras.Ptr(segment);
    }

    public static WGPUBindGroupEntryExtras clone(Arena arena, WGPUBindGroupEntryExtras src) {
        WGPUBindGroupEntryExtras ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUChainedStruct chain() {
        return new WGPUChainedStruct(segment.asSlice(OFFSET$chain, LAYOUT$chain));
    }

    public WGPUBindGroupEntryExtras chain(@NotNull WGPUChainedStruct value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$chain, SIZE$chain);
        return this;
    }

    public WGPUBindGroupEntryExtras chain(Consumer<@NotNull WGPUChainedStruct> consumer) {
        consumer.accept(chain());
        return this;
    }

    /// Note: the returned {@link WGPUBuffer.Ptr} does not have correct {@link WGPUBuffer.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link WGPUBuffer.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable WGPUBuffer.Ptr buffers() {
        MemorySegment s = buffersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUBuffer.Ptr(s);
    }

    public WGPUBindGroupEntryExtras buffers(@Nullable WGPUBuffer.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        buffersRaw(s);
        return this;
    }

    public @Pointer(target=WGPUBuffer.class) @NotNull MemorySegment buffersRaw() {
        return segment.get(LAYOUT$buffers, OFFSET$buffers);
    }

    public void buffersRaw(@Pointer(target=WGPUBuffer.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$buffers, OFFSET$buffers, value);
    }

    public @Unsigned long bufferCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$bufferCount);
    }

    public WGPUBindGroupEntryExtras bufferCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$bufferCount, value);
        return this;
    }

    /// Note: the returned {@link WGPUSampler.Ptr} does not have correct {@link WGPUSampler.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link WGPUSampler.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable WGPUSampler.Ptr samplers() {
        MemorySegment s = samplersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUSampler.Ptr(s);
    }

    public WGPUBindGroupEntryExtras samplers(@Nullable WGPUSampler.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        samplersRaw(s);
        return this;
    }

    public @Pointer(target=WGPUSampler.class) @NotNull MemorySegment samplersRaw() {
        return segment.get(LAYOUT$samplers, OFFSET$samplers);
    }

    public void samplersRaw(@Pointer(target=WGPUSampler.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$samplers, OFFSET$samplers, value);
    }

    public @Unsigned long samplerCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$samplerCount);
    }

    public WGPUBindGroupEntryExtras samplerCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$samplerCount, value);
        return this;
    }

    /// Note: the returned {@link WGPUTextureView.Ptr} does not have correct {@link WGPUTextureView.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link WGPUTextureView.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable WGPUTextureView.Ptr textureViews() {
        MemorySegment s = textureViewsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUTextureView.Ptr(s);
    }

    public WGPUBindGroupEntryExtras textureViews(@Nullable WGPUTextureView.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        textureViewsRaw(s);
        return this;
    }

    public @Pointer(target=WGPUTextureView.class) @NotNull MemorySegment textureViewsRaw() {
        return segment.get(LAYOUT$textureViews, OFFSET$textureViews);
    }

    public void textureViewsRaw(@Pointer(target=WGPUTextureView.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$textureViews, OFFSET$textureViews, value);
    }

    public @Unsigned long textureViewCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$textureViewCount);
    }

    public WGPUBindGroupEntryExtras textureViewCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$textureViewCount, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUChainedStruct.LAYOUT.withName("chain"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("buffers"),
        NativeLayout.C_SIZE_T.withName("bufferCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("samplers"),
        NativeLayout.C_SIZE_T.withName("samplerCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("textureViews"),
        NativeLayout.C_SIZE_T.withName("textureViewCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$chain = PathElement.groupElement("chain");
    public static final PathElement PATH$buffers = PathElement.groupElement("buffers");
    public static final PathElement PATH$bufferCount = PathElement.groupElement("bufferCount");
    public static final PathElement PATH$samplers = PathElement.groupElement("samplers");
    public static final PathElement PATH$samplerCount = PathElement.groupElement("samplerCount");
    public static final PathElement PATH$textureViews = PathElement.groupElement("textureViews");
    public static final PathElement PATH$textureViewCount = PathElement.groupElement("textureViewCount");

    public static final StructLayout LAYOUT$chain = (StructLayout) LAYOUT.select(PATH$chain);
    public static final AddressLayout LAYOUT$buffers = (AddressLayout) LAYOUT.select(PATH$buffers);
    public static final AddressLayout LAYOUT$samplers = (AddressLayout) LAYOUT.select(PATH$samplers);
    public static final AddressLayout LAYOUT$textureViews = (AddressLayout) LAYOUT.select(PATH$textureViews);

    public static final long SIZE$chain = LAYOUT$chain.byteSize();
    public static final long SIZE$buffers = LAYOUT$buffers.byteSize();
    public static final long SIZE$bufferCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$samplers = LAYOUT$samplers.byteSize();
    public static final long SIZE$samplerCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$textureViews = LAYOUT$textureViews.byteSize();
    public static final long SIZE$textureViewCount = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$chain = LAYOUT.byteOffset(PATH$chain);
    public static final long OFFSET$buffers = LAYOUT.byteOffset(PATH$buffers);
    public static final long OFFSET$bufferCount = LAYOUT.byteOffset(PATH$bufferCount);
    public static final long OFFSET$samplers = LAYOUT.byteOffset(PATH$samplers);
    public static final long OFFSET$samplerCount = LAYOUT.byteOffset(PATH$samplerCount);
    public static final long OFFSET$textureViews = LAYOUT.byteOffset(PATH$textureViews);
    public static final long OFFSET$textureViewCount = LAYOUT.byteOffset(PATH$textureViewCount);
}

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
import static club.doki7.webgpu.WebGPUConstants.*;

/// Represents a pointer to a {@code ColorTargetState} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct ColorTargetState {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     TextureFormat format; // @link substring="TextureFormat" target="TextureFormat" @link substring="format" target="#format"
///     BlendState blend; // optional // @link substring="BlendState" target="BlendState" @link substring="blend" target="#blend"
///     ColorWriteMask writeMask; // @link substring="ColorWriteMask" target="ColorWriteMask" @link substring="writeMask" target="#writeMask"
/// } ColorTargetState;
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
public record ColorTargetState(@NotNull MemorySegment segment) implements IColorTargetState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link ColorTargetState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IColorTargetState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code ColorTargetState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IColorTargetState, Iterable<ColorTargetState> {
        public long size() {
            return segment.byteSize() / ColorTargetState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull ColorTargetState at(long index) {
            return new ColorTargetState(segment.asSlice(index * ColorTargetState.BYTES, ColorTargetState.BYTES));
        }

        public void write(long index, @NotNull ColorTargetState value) {
            MemorySegment s = segment.asSlice(index * ColorTargetState.BYTES, ColorTargetState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * ColorTargetState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * ColorTargetState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * ColorTargetState.BYTES,
                (end - start) * ColorTargetState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * ColorTargetState.BYTES));
        }

        public ColorTargetState[] toArray() {
            ColorTargetState[] ret = new ColorTargetState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<ColorTargetState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<ColorTargetState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= ColorTargetState.BYTES;
            }

            @Override
            public ColorTargetState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ColorTargetState ret = new ColorTargetState(segment.asSlice(0, ColorTargetState.BYTES));
                segment = segment.asSlice(ColorTargetState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static ColorTargetState allocate(Arena arena) {
        return new ColorTargetState(arena.allocate(LAYOUT));
    }

    public static ColorTargetState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new ColorTargetState.Ptr(segment);
    }

    public static ColorTargetState clone(Arena arena, ColorTargetState src) {
        ColorTargetState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public ColorTargetState nextInChain(@Nullable IChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable ChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * ChainedStruct.BYTES);
        return new ChainedStruct.Ptr(s);
    }

    public @Nullable ChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ChainedStruct(s);
    }

    public @Pointer(target=ChainedStruct.class) MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=ChainedStruct.class) MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @EnumType(TextureFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public ColorTargetState format(@EnumType(TextureFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @NotNull BlendState blend() {
        return new BlendState(segment.asSlice(OFFSET$blend, LAYOUT$blend));
    }

    public ColorTargetState blend(@NotNull BlendState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$blend, SIZE$blend);
        return this;
    }

    public ColorTargetState blend(Consumer<@NotNull BlendState> consumer) {
        consumer.accept(blend());
        return this;
    }

    public @EnumType(ColorWriteMask.class) long writeMask() {
        return segment.get(LAYOUT$writeMask, OFFSET$writeMask);
    }

    public ColorTargetState writeMask(@EnumType(ColorWriteMask.class) long value) {
        segment.set(LAYOUT$writeMask, OFFSET$writeMask, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("format"),
        BlendState.LAYOUT.withName("blend"),
        ValueLayout.JAVA_LONG.withName("writeMask")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$blend = PathElement.groupElement("blend");
    public static final PathElement PATH$writeMask = PathElement.groupElement("writeMask");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final StructLayout LAYOUT$blend = (StructLayout) LAYOUT.select(PATH$blend);
    public static final OfLong LAYOUT$writeMask = (OfLong) LAYOUT.select(PATH$writeMask);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$blend = LAYOUT$blend.byteSize();
    public static final long SIZE$writeMask = LAYOUT$writeMask.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$blend = LAYOUT.byteOffset(PATH$blend);
    public static final long OFFSET$writeMask = LAYOUT.byteOffset(PATH$writeMask);
}

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

/// Represents a pointer to a {@code WGPUColorTargetState} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUColorTargetState {
///     WGPUTextureFormat format; // @link substring="WGPUTextureFormat" target="WGPUTextureFormat" @link substring="format" target="#format"
///     WGPUBlendState const* blend; // optional // @link substring="WGPUBlendState" target="WGPUBlendState" @link substring="blend" target="#blend"
///     WGPUColorWriteMask writeMask; // @link substring="WGPUColorWriteMask" target="WGPUColorWriteMask" @link substring="writeMask" target="#writeMask"
/// } WGPUColorTargetState;
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
public record WGPUColorTargetState(@NotNull MemorySegment segment) implements IWGPUColorTargetState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUColorTargetState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUColorTargetState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUColorTargetState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUColorTargetState, Iterable<WGPUColorTargetState> {
        public long size() {
            return segment.byteSize() / WGPUColorTargetState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUColorTargetState at(long index) {
            return new WGPUColorTargetState(segment.asSlice(index * WGPUColorTargetState.BYTES, WGPUColorTargetState.BYTES));
        }

        public WGPUColorTargetState.Ptr at(long index, @NotNull Consumer<@NotNull WGPUColorTargetState> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUColorTargetState value) {
            MemorySegment s = segment.asSlice(index * WGPUColorTargetState.BYTES, WGPUColorTargetState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUColorTargetState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUColorTargetState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUColorTargetState.BYTES,
                (end - start) * WGPUColorTargetState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUColorTargetState.BYTES));
        }

        public WGPUColorTargetState[] toArray() {
            WGPUColorTargetState[] ret = new WGPUColorTargetState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUColorTargetState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUColorTargetState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUColorTargetState.BYTES;
            }

            @Override
            public WGPUColorTargetState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUColorTargetState ret = new WGPUColorTargetState(segment.asSlice(0, WGPUColorTargetState.BYTES));
                segment = segment.asSlice(WGPUColorTargetState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUColorTargetState allocate(Arena arena) {
        return new WGPUColorTargetState(arena.allocate(LAYOUT));
    }

    public static WGPUColorTargetState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUColorTargetState.Ptr(segment);
    }

    public static WGPUColorTargetState clone(Arena arena, WGPUColorTargetState src) {
        WGPUColorTargetState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(WGPUTextureFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public WGPUColorTargetState format(@EnumType(WGPUTextureFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public WGPUColorTargetState blend(@Nullable IWGPUBlendState value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        blendRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUBlendState.Ptr blend(int assumedCount) {
        MemorySegment s = blendRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUBlendState.BYTES);
        return new WGPUBlendState.Ptr(s);
    }

    public @Nullable WGPUBlendState blend() {
        MemorySegment s = blendRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUBlendState(s);
    }

    public @Pointer(target=WGPUBlendState.class) @NotNull MemorySegment blendRaw() {
        return segment.get(LAYOUT$blend, OFFSET$blend);
    }

    public void blendRaw(@Pointer(target=WGPUBlendState.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$blend, OFFSET$blend, value);
    }

    public @Bitmask(WGPUColorWriteMask.class) long writeMask() {
        return segment.get(LAYOUT$writeMask, OFFSET$writeMask);
    }

    public WGPUColorTargetState writeMask(@Bitmask(WGPUColorWriteMask.class) long value) {
        segment.set(LAYOUT$writeMask, OFFSET$writeMask, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.ADDRESS.withTargetLayout(WGPUBlendState.LAYOUT).withName("blend"),
        ValueLayout.JAVA_LONG.withName("writeMask")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$blend = PathElement.groupElement("blend");
    public static final PathElement PATH$writeMask = PathElement.groupElement("writeMask");

    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final AddressLayout LAYOUT$blend = (AddressLayout) LAYOUT.select(PATH$blend);
    public static final OfLong LAYOUT$writeMask = (OfLong) LAYOUT.select(PATH$writeMask);

    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$blend = LAYOUT$blend.byteSize();
    public static final long SIZE$writeMask = LAYOUT$writeMask.byteSize();

    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$blend = LAYOUT.byteOffset(PATH$blend);
    public static final long OFFSET$writeMask = LAYOUT.byteOffset(PATH$writeMask);
}

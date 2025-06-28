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

/// Represents a pointer to a {@code WGPUMultisampleState} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUMultisampleState {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     uint32_t count; // @link substring="count" target="#count"
///     uint32_t mask; // @link substring="mask" target="#mask"
///     WGPUBool alphaToCoverageEnabled; // @link substring="alphaToCoverageEnabled" target="#alphaToCoverageEnabled"
/// } WGPUMultisampleState;
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
public record WGPUMultisampleState(@NotNull MemorySegment segment) implements IWGPUMultisampleState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUMultisampleState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUMultisampleState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUMultisampleState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUMultisampleState, Iterable<WGPUMultisampleState> {
        public long size() {
            return segment.byteSize() / WGPUMultisampleState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUMultisampleState at(long index) {
            return new WGPUMultisampleState(segment.asSlice(index * WGPUMultisampleState.BYTES, WGPUMultisampleState.BYTES));
        }

        public WGPUMultisampleState.Ptr at(long index, @NotNull Consumer<@NotNull WGPUMultisampleState> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUMultisampleState value) {
            MemorySegment s = segment.asSlice(index * WGPUMultisampleState.BYTES, WGPUMultisampleState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUMultisampleState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUMultisampleState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUMultisampleState.BYTES,
                (end - start) * WGPUMultisampleState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUMultisampleState.BYTES));
        }

        public WGPUMultisampleState[] toArray() {
            WGPUMultisampleState[] ret = new WGPUMultisampleState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUMultisampleState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUMultisampleState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUMultisampleState.BYTES;
            }

            @Override
            public WGPUMultisampleState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUMultisampleState ret = new WGPUMultisampleState(segment.asSlice(0, WGPUMultisampleState.BYTES));
                segment = segment.asSlice(WGPUMultisampleState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUMultisampleState allocate(Arena arena) {
        return new WGPUMultisampleState(arena.allocate(LAYOUT));
    }

    public static WGPUMultisampleState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUMultisampleState.Ptr(segment);
    }

    public static WGPUMultisampleState clone(Arena arena, WGPUMultisampleState src) {
        WGPUMultisampleState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUMultisampleState nextInChain(@Nullable IWGPUChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUChainedStruct.BYTES);
        return new WGPUChainedStruct.Ptr(s);
    }

    public @Nullable WGPUChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUChainedStruct(s);
    }

    public @Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @Unsigned int count() {
        return segment.get(LAYOUT$count, OFFSET$count);
    }

    public WGPUMultisampleState count(@Unsigned int value) {
        segment.set(LAYOUT$count, OFFSET$count, value);
        return this;
    }

    public @Unsigned int mask() {
        return segment.get(LAYOUT$mask, OFFSET$mask);
    }

    public WGPUMultisampleState mask(@Unsigned int value) {
        segment.set(LAYOUT$mask, OFFSET$mask, value);
        return this;
    }

    public @NativeType("WGPUBool") @Unsigned int alphaToCoverageEnabled() {
        return segment.get(LAYOUT$alphaToCoverageEnabled, OFFSET$alphaToCoverageEnabled);
    }

    public WGPUMultisampleState alphaToCoverageEnabled(@NativeType("WGPUBool") @Unsigned int value) {
        segment.set(LAYOUT$alphaToCoverageEnabled, OFFSET$alphaToCoverageEnabled, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("mask"),
        ValueLayout.JAVA_INT.withName("alphaToCoverageEnabled")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$count = PathElement.groupElement("count");
    public static final PathElement PATH$mask = PathElement.groupElement("mask");
    public static final PathElement PATH$alphaToCoverageEnabled = PathElement.groupElement("alphaToCoverageEnabled");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$count = (OfInt) LAYOUT.select(PATH$count);
    public static final OfInt LAYOUT$mask = (OfInt) LAYOUT.select(PATH$mask);
    public static final OfInt LAYOUT$alphaToCoverageEnabled = (OfInt) LAYOUT.select(PATH$alphaToCoverageEnabled);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$count = LAYOUT$count.byteSize();
    public static final long SIZE$mask = LAYOUT$mask.byteSize();
    public static final long SIZE$alphaToCoverageEnabled = LAYOUT$alphaToCoverageEnabled.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$count = LAYOUT.byteOffset(PATH$count);
    public static final long OFFSET$mask = LAYOUT.byteOffset(PATH$mask);
    public static final long OFFSET$alphaToCoverageEnabled = LAYOUT.byteOffset(PATH$alphaToCoverageEnabled);
}

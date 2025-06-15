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

/// Represents a pointer to a {@code PrimitiveState} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct PrimitiveState {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     PrimitiveTopology topology; // @link substring="PrimitiveTopology" target="PrimitiveTopology" @link substring="topology" target="#topology"
///     IndexFormat stripIndexFormat; // @link substring="IndexFormat" target="IndexFormat" @link substring="stripIndexFormat" target="#stripIndexFormat"
///     FrontFace frontFace; // @link substring="FrontFace" target="FrontFace" @link substring="frontFace" target="#frontFace"
///     CullMode cullMode; // @link substring="CullMode" target="CullMode" @link substring="cullMode" target="#cullMode"
///     bool unclippedDepth; // @link substring="unclippedDepth" target="#unclippedDepth"
/// } PrimitiveState;
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
public record PrimitiveState(@NotNull MemorySegment segment) implements IPrimitiveState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link PrimitiveState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IPrimitiveState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code PrimitiveState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IPrimitiveState, Iterable<PrimitiveState> {
        public long size() {
            return segment.byteSize() / PrimitiveState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull PrimitiveState at(long index) {
            return new PrimitiveState(segment.asSlice(index * PrimitiveState.BYTES, PrimitiveState.BYTES));
        }

        public void write(long index, @NotNull PrimitiveState value) {
            MemorySegment s = segment.asSlice(index * PrimitiveState.BYTES, PrimitiveState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * PrimitiveState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * PrimitiveState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * PrimitiveState.BYTES,
                (end - start) * PrimitiveState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * PrimitiveState.BYTES));
        }

        public PrimitiveState[] toArray() {
            PrimitiveState[] ret = new PrimitiveState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<PrimitiveState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<PrimitiveState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= PrimitiveState.BYTES;
            }

            @Override
            public PrimitiveState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                PrimitiveState ret = new PrimitiveState(segment.asSlice(0, PrimitiveState.BYTES));
                segment = segment.asSlice(PrimitiveState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static PrimitiveState allocate(Arena arena) {
        return new PrimitiveState(arena.allocate(LAYOUT));
    }

    public static PrimitiveState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new PrimitiveState.Ptr(segment);
    }

    public static PrimitiveState clone(Arena arena, PrimitiveState src) {
        PrimitiveState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public PrimitiveState nextInChain(@Nullable IChainedStruct value) {
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

    public @EnumType(PrimitiveTopology.class) int topology() {
        return segment.get(LAYOUT$topology, OFFSET$topology);
    }

    public PrimitiveState topology(@EnumType(PrimitiveTopology.class) int value) {
        segment.set(LAYOUT$topology, OFFSET$topology, value);
        return this;
    }

    public @EnumType(IndexFormat.class) int stripIndexFormat() {
        return segment.get(LAYOUT$stripIndexFormat, OFFSET$stripIndexFormat);
    }

    public PrimitiveState stripIndexFormat(@EnumType(IndexFormat.class) int value) {
        segment.set(LAYOUT$stripIndexFormat, OFFSET$stripIndexFormat, value);
        return this;
    }

    public @EnumType(FrontFace.class) int frontFace() {
        return segment.get(LAYOUT$frontFace, OFFSET$frontFace);
    }

    public PrimitiveState frontFace(@EnumType(FrontFace.class) int value) {
        segment.set(LAYOUT$frontFace, OFFSET$frontFace, value);
        return this;
    }

    public @EnumType(CullMode.class) int cullMode() {
        return segment.get(LAYOUT$cullMode, OFFSET$cullMode);
    }

    public PrimitiveState cullMode(@EnumType(CullMode.class) int value) {
        segment.set(LAYOUT$cullMode, OFFSET$cullMode, value);
        return this;
    }

    public @NativeType("boolean") boolean unclippedDepth() {
        return segment.get(LAYOUT$unclippedDepth, OFFSET$unclippedDepth);
    }

    public PrimitiveState unclippedDepth(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$unclippedDepth, OFFSET$unclippedDepth, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("topology"),
        ValueLayout.JAVA_INT.withName("stripIndexFormat"),
        ValueLayout.JAVA_INT.withName("frontFace"),
        ValueLayout.JAVA_INT.withName("cullMode"),
        ValueLayout.JAVA_BOOLEAN.withName("unclippedDepth")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$topology = PathElement.groupElement("topology");
    public static final PathElement PATH$stripIndexFormat = PathElement.groupElement("stripIndexFormat");
    public static final PathElement PATH$frontFace = PathElement.groupElement("frontFace");
    public static final PathElement PATH$cullMode = PathElement.groupElement("cullMode");
    public static final PathElement PATH$unclippedDepth = PathElement.groupElement("unclippedDepth");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$topology = (OfInt) LAYOUT.select(PATH$topology);
    public static final OfInt LAYOUT$stripIndexFormat = (OfInt) LAYOUT.select(PATH$stripIndexFormat);
    public static final OfInt LAYOUT$frontFace = (OfInt) LAYOUT.select(PATH$frontFace);
    public static final OfInt LAYOUT$cullMode = (OfInt) LAYOUT.select(PATH$cullMode);
    public static final OfBoolean LAYOUT$unclippedDepth = (OfBoolean) LAYOUT.select(PATH$unclippedDepth);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$topology = LAYOUT$topology.byteSize();
    public static final long SIZE$stripIndexFormat = LAYOUT$stripIndexFormat.byteSize();
    public static final long SIZE$frontFace = LAYOUT$frontFace.byteSize();
    public static final long SIZE$cullMode = LAYOUT$cullMode.byteSize();
    public static final long SIZE$unclippedDepth = LAYOUT$unclippedDepth.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$topology = LAYOUT.byteOffset(PATH$topology);
    public static final long OFFSET$stripIndexFormat = LAYOUT.byteOffset(PATH$stripIndexFormat);
    public static final long OFFSET$frontFace = LAYOUT.byteOffset(PATH$frontFace);
    public static final long OFFSET$cullMode = LAYOUT.byteOffset(PATH$cullMode);
    public static final long OFFSET$unclippedDepth = LAYOUT.byteOffset(PATH$unclippedDepth);
}

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

/// Represents a pointer to a {@code WGPUChainedStructOut} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUChainedStructOut {
///     WGPUChainedStructOut* next; // optional // @link substring="WGPUChainedStructOut" target="WGPUChainedStructOut" @link substring="next" target="#next"
///     WGPUSType sType; // @link substring="WGPUSType" target="WGPUSType" @link substring="sType" target="#sType"
/// } WGPUChainedStructOut;
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
public record WGPUChainedStructOut(@NotNull MemorySegment segment) implements IWGPUChainedStructOut {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUChainedStructOut}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUChainedStructOut to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUChainedStructOut.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUChainedStructOut, Iterable<WGPUChainedStructOut> {
        public long size() {
            return segment.byteSize() / WGPUChainedStructOut.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUChainedStructOut at(long index) {
            return new WGPUChainedStructOut(segment.asSlice(index * WGPUChainedStructOut.BYTES, WGPUChainedStructOut.BYTES));
        }

        public WGPUChainedStructOut.Ptr at(long index, @NotNull Consumer<@NotNull WGPUChainedStructOut> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUChainedStructOut value) {
            MemorySegment s = segment.asSlice(index * WGPUChainedStructOut.BYTES, WGPUChainedStructOut.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUChainedStructOut.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUChainedStructOut.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUChainedStructOut.BYTES,
                (end - start) * WGPUChainedStructOut.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUChainedStructOut.BYTES));
        }

        public WGPUChainedStructOut[] toArray() {
            WGPUChainedStructOut[] ret = new WGPUChainedStructOut[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUChainedStructOut> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUChainedStructOut> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUChainedStructOut.BYTES;
            }

            @Override
            public WGPUChainedStructOut next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUChainedStructOut ret = new WGPUChainedStructOut(segment.asSlice(0, WGPUChainedStructOut.BYTES));
                segment = segment.asSlice(WGPUChainedStructOut.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUChainedStructOut allocate(Arena arena) {
        return new WGPUChainedStructOut(arena.allocate(LAYOUT));
    }

    public static WGPUChainedStructOut.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUChainedStructOut.Ptr(segment);
    }

    public static WGPUChainedStructOut clone(Arena arena, WGPUChainedStructOut src) {
        WGPUChainedStructOut ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUChainedStructOut next(@Nullable IWGPUChainedStructOut value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUChainedStructOut.Ptr next(int assumedCount) {
        MemorySegment s = nextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUChainedStructOut.BYTES);
        return new WGPUChainedStructOut.Ptr(s);
    }

    public @Nullable WGPUChainedStructOut next() {
        MemorySegment s = nextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUChainedStructOut(s);
    }

    public @Pointer(target=WGPUChainedStructOut.class) @NotNull MemorySegment nextRaw() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public void nextRaw(@Pointer(target=WGPUChainedStructOut.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
    }

    public @EnumType(WGPUSType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public WGPUChainedStructOut sType(@EnumType(WGPUSType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("sType")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$sType = PathElement.groupElement("sType");

    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);

    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$sType = LAYOUT$sType.byteSize();

    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
}

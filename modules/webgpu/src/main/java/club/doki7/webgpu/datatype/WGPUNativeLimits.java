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
import club.doki7.webgpu.WGPUFunctionTypes.*;

/// Represents a pointer to a {@code WGPUNativeLimits} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUNativeLimits {
///     WGPUChainedStructOut chain; // @link substring="WGPUChainedStructOut" target="WGPUChainedStructOut" @link substring="chain" target="#chain"
///     uint32_t maxPushConstantSize; // @link substring="maxPushConstantSize" target="#maxPushConstantSize"
///     uint32_t maxNonSamplerBindings; // @link substring="maxNonSamplerBindings" target="#maxNonSamplerBindings"
/// } WGPUNativeLimits;
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
public record WGPUNativeLimits(@NotNull MemorySegment segment) implements IWGPUNativeLimits {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUNativeLimits}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUNativeLimits to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUNativeLimits.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUNativeLimits, Iterable<WGPUNativeLimits> {
        public long size() {
            return segment.byteSize() / WGPUNativeLimits.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUNativeLimits at(long index) {
            return new WGPUNativeLimits(segment.asSlice(index * WGPUNativeLimits.BYTES, WGPUNativeLimits.BYTES));
        }

        public WGPUNativeLimits.Ptr at(long index, @NotNull Consumer<@NotNull WGPUNativeLimits> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUNativeLimits value) {
            MemorySegment s = segment.asSlice(index * WGPUNativeLimits.BYTES, WGPUNativeLimits.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUNativeLimits.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUNativeLimits.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUNativeLimits.BYTES,
                (end - start) * WGPUNativeLimits.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUNativeLimits.BYTES));
        }

        public WGPUNativeLimits[] toArray() {
            WGPUNativeLimits[] ret = new WGPUNativeLimits[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUNativeLimits> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUNativeLimits> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUNativeLimits.BYTES;
            }

            @Override
            public WGPUNativeLimits next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUNativeLimits ret = new WGPUNativeLimits(segment.asSlice(0, WGPUNativeLimits.BYTES));
                segment = segment.asSlice(WGPUNativeLimits.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUNativeLimits allocate(Arena arena) {
        return new WGPUNativeLimits(arena.allocate(LAYOUT));
    }

    public static WGPUNativeLimits.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUNativeLimits.Ptr(segment);
    }

    public static WGPUNativeLimits clone(Arena arena, WGPUNativeLimits src) {
        WGPUNativeLimits ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUChainedStructOut chain() {
        return new WGPUChainedStructOut(segment.asSlice(OFFSET$chain, LAYOUT$chain));
    }

    public WGPUNativeLimits chain(@NotNull WGPUChainedStructOut value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$chain, SIZE$chain);
        return this;
    }

    public WGPUNativeLimits chain(Consumer<@NotNull WGPUChainedStructOut> consumer) {
        consumer.accept(chain());
        return this;
    }

    public @Unsigned int maxPushConstantSize() {
        return segment.get(LAYOUT$maxPushConstantSize, OFFSET$maxPushConstantSize);
    }

    public WGPUNativeLimits maxPushConstantSize(@Unsigned int value) {
        segment.set(LAYOUT$maxPushConstantSize, OFFSET$maxPushConstantSize, value);
        return this;
    }

    public @Unsigned int maxNonSamplerBindings() {
        return segment.get(LAYOUT$maxNonSamplerBindings, OFFSET$maxNonSamplerBindings);
    }

    public WGPUNativeLimits maxNonSamplerBindings(@Unsigned int value) {
        segment.set(LAYOUT$maxNonSamplerBindings, OFFSET$maxNonSamplerBindings, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUChainedStructOut.LAYOUT.withName("chain"),
        ValueLayout.JAVA_INT.withName("maxPushConstantSize"),
        ValueLayout.JAVA_INT.withName("maxNonSamplerBindings")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$chain = PathElement.groupElement("chain");
    public static final PathElement PATH$maxPushConstantSize = PathElement.groupElement("maxPushConstantSize");
    public static final PathElement PATH$maxNonSamplerBindings = PathElement.groupElement("maxNonSamplerBindings");

    public static final StructLayout LAYOUT$chain = (StructLayout) LAYOUT.select(PATH$chain);
    public static final OfInt LAYOUT$maxPushConstantSize = (OfInt) LAYOUT.select(PATH$maxPushConstantSize);
    public static final OfInt LAYOUT$maxNonSamplerBindings = (OfInt) LAYOUT.select(PATH$maxNonSamplerBindings);

    public static final long SIZE$chain = LAYOUT$chain.byteSize();
    public static final long SIZE$maxPushConstantSize = LAYOUT$maxPushConstantSize.byteSize();
    public static final long SIZE$maxNonSamplerBindings = LAYOUT$maxNonSamplerBindings.byteSize();

    public static final long OFFSET$chain = LAYOUT.byteOffset(PATH$chain);
    public static final long OFFSET$maxPushConstantSize = LAYOUT.byteOffset(PATH$maxPushConstantSize);
    public static final long OFFSET$maxNonSamplerBindings = LAYOUT.byteOffset(PATH$maxNonSamplerBindings);
}

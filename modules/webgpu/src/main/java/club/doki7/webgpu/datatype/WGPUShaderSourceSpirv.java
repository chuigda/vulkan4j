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

/// Represents a pointer to a {@code WGPUShaderSourceSpirv} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUShaderSourceSpirv {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     uint32_t codeSize; // @link substring="codeSize" target="#codeSize"
///     uint32_t const* code; // @link substring="code" target="#code"
/// } WGPUShaderSourceSpirv;
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
public record WGPUShaderSourceSpirv(@NotNull MemorySegment segment) implements IWGPUShaderSourceSpirv {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUShaderSourceSpirv}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUShaderSourceSpirv to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUShaderSourceSpirv.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUShaderSourceSpirv, Iterable<WGPUShaderSourceSpirv> {
        public long size() {
            return segment.byteSize() / WGPUShaderSourceSpirv.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUShaderSourceSpirv at(long index) {
            return new WGPUShaderSourceSpirv(segment.asSlice(index * WGPUShaderSourceSpirv.BYTES, WGPUShaderSourceSpirv.BYTES));
        }

        public WGPUShaderSourceSpirv.Ptr at(long index, @NotNull Consumer<@NotNull WGPUShaderSourceSpirv> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUShaderSourceSpirv value) {
            MemorySegment s = segment.asSlice(index * WGPUShaderSourceSpirv.BYTES, WGPUShaderSourceSpirv.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUShaderSourceSpirv.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUShaderSourceSpirv.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUShaderSourceSpirv.BYTES,
                (end - start) * WGPUShaderSourceSpirv.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUShaderSourceSpirv.BYTES));
        }

        public WGPUShaderSourceSpirv[] toArray() {
            WGPUShaderSourceSpirv[] ret = new WGPUShaderSourceSpirv[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUShaderSourceSpirv> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUShaderSourceSpirv> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUShaderSourceSpirv.BYTES;
            }

            @Override
            public WGPUShaderSourceSpirv next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUShaderSourceSpirv ret = new WGPUShaderSourceSpirv(segment.asSlice(0, WGPUShaderSourceSpirv.BYTES));
                segment = segment.asSlice(WGPUShaderSourceSpirv.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUShaderSourceSpirv allocate(Arena arena) {
        return new WGPUShaderSourceSpirv(arena.allocate(LAYOUT));
    }

    public static WGPUShaderSourceSpirv.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUShaderSourceSpirv.Ptr(segment);
    }

    public static WGPUShaderSourceSpirv clone(Arena arena, WGPUShaderSourceSpirv src) {
        WGPUShaderSourceSpirv ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUShaderSourceSpirv nextInChain(@Nullable IWGPUChainedStruct value) {
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

    public @Unsigned int codeSize() {
        return segment.get(LAYOUT$codeSize, OFFSET$codeSize);
    }

    public WGPUShaderSourceSpirv codeSize(@Unsigned int value) {
        segment.set(LAYOUT$codeSize, OFFSET$codeSize, value);
        return this;
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned IntPtr code() {
        MemorySegment s = codeRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUShaderSourceSpirv code(@Nullable @Unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        codeRaw(s);
        return this;
    }

    public @Pointer(comment="uint32_t*") @NotNull MemorySegment codeRaw() {
        return segment.get(LAYOUT$code, OFFSET$code);
    }

    public void codeRaw(@Pointer(comment="uint32_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$code, OFFSET$code, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("codeSize"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("code")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$codeSize = PathElement.groupElement("codeSize");
    public static final PathElement PATH$code = PathElement.groupElement("code");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$codeSize = (OfInt) LAYOUT.select(PATH$codeSize);
    public static final AddressLayout LAYOUT$code = (AddressLayout) LAYOUT.select(PATH$code);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$codeSize = LAYOUT$codeSize.byteSize();
    public static final long SIZE$code = LAYOUT$code.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$codeSize = LAYOUT.byteOffset(PATH$codeSize);
    public static final long OFFSET$code = LAYOUT.byteOffset(PATH$code);
}

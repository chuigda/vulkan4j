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

/// Represents a pointer to a {@code WGPUStringView} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUStringView {
///     char const* data; // optional // @link substring="data" target="#data"
///     size_t length; // @link substring="length" target="#length"
/// } WGPUStringView;
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
public record WGPUStringView(@NotNull MemorySegment segment) implements IWGPUStringView {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUStringView}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUStringView to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUStringView.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUStringView, Iterable<WGPUStringView> {
        public long size() {
            return segment.byteSize() / WGPUStringView.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUStringView at(long index) {
            return new WGPUStringView(segment.asSlice(index * WGPUStringView.BYTES, WGPUStringView.BYTES));
        }

        public WGPUStringView.Ptr at(long index, @NotNull Consumer<@NotNull WGPUStringView> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUStringView value) {
            MemorySegment s = segment.asSlice(index * WGPUStringView.BYTES, WGPUStringView.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUStringView.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUStringView.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUStringView.BYTES,
                (end - start) * WGPUStringView.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUStringView.BYTES));
        }

        public WGPUStringView[] toArray() {
            WGPUStringView[] ret = new WGPUStringView[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUStringView> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUStringView> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUStringView.BYTES;
            }

            @Override
            public WGPUStringView next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUStringView ret = new WGPUStringView(segment.asSlice(0, WGPUStringView.BYTES));
                segment = segment.asSlice(WGPUStringView.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUStringView allocate(Arena arena) {
        return new WGPUStringView(arena.allocate(LAYOUT));
    }

    public static WGPUStringView.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUStringView.Ptr(segment);
    }

    public static WGPUStringView clone(Arena arena, WGPUStringView src) {
        WGPUStringView ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr data() {
        MemorySegment s = dataRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public WGPUStringView data(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        dataRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") @NotNull MemorySegment dataRaw() {
        return segment.get(LAYOUT$data, OFFSET$data);
    }

    public void dataRaw(@Pointer(comment="int8_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$data, OFFSET$data, value);
    }

    public @Unsigned long length() {
        return NativeLayout.readCSizeT(segment, OFFSET$length);
    }

    public WGPUStringView length(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$length, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("data"),
        NativeLayout.C_SIZE_T.withName("length")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$data = PathElement.groupElement("data");
    public static final PathElement PATH$length = PathElement.groupElement("length");

    public static final AddressLayout LAYOUT$data = (AddressLayout) LAYOUT.select(PATH$data);

    public static final long SIZE$data = LAYOUT$data.byteSize();
    public static final long SIZE$length = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
    public static final long OFFSET$length = LAYOUT.byteOffset(PATH$length);
}

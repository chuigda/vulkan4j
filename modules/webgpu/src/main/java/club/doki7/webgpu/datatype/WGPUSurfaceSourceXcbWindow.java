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

/// Represents a pointer to a {@code WGPUSurfaceSourceXcbWindow} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUSurfaceSourceXcbWindow {
///     WGPUChainedStruct chain; // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="chain" target="#chain"
///     void* connection; // @link substring="connection" target="#connection"
///     uint32_t window; // @link substring="window" target="#window"
/// } WGPUSurfaceSourceXcbWindow;
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
public record WGPUSurfaceSourceXcbWindow(@NotNull MemorySegment segment) implements IWGPUSurfaceSourceXcbWindow {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUSurfaceSourceXcbWindow}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUSurfaceSourceXcbWindow to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUSurfaceSourceXcbWindow.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUSurfaceSourceXcbWindow, Iterable<WGPUSurfaceSourceXcbWindow> {
        public long size() {
            return segment.byteSize() / WGPUSurfaceSourceXcbWindow.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUSurfaceSourceXcbWindow at(long index) {
            return new WGPUSurfaceSourceXcbWindow(segment.asSlice(index * WGPUSurfaceSourceXcbWindow.BYTES, WGPUSurfaceSourceXcbWindow.BYTES));
        }

        public WGPUSurfaceSourceXcbWindow.Ptr at(long index, @NotNull Consumer<@NotNull WGPUSurfaceSourceXcbWindow> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUSurfaceSourceXcbWindow value) {
            MemorySegment s = segment.asSlice(index * WGPUSurfaceSourceXcbWindow.BYTES, WGPUSurfaceSourceXcbWindow.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUSurfaceSourceXcbWindow.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUSurfaceSourceXcbWindow.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUSurfaceSourceXcbWindow.BYTES,
                (end - start) * WGPUSurfaceSourceXcbWindow.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUSurfaceSourceXcbWindow.BYTES));
        }

        public WGPUSurfaceSourceXcbWindow[] toArray() {
            WGPUSurfaceSourceXcbWindow[] ret = new WGPUSurfaceSourceXcbWindow[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUSurfaceSourceXcbWindow> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUSurfaceSourceXcbWindow> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUSurfaceSourceXcbWindow.BYTES;
            }

            @Override
            public WGPUSurfaceSourceXcbWindow next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUSurfaceSourceXcbWindow ret = new WGPUSurfaceSourceXcbWindow(segment.asSlice(0, WGPUSurfaceSourceXcbWindow.BYTES));
                segment = segment.asSlice(WGPUSurfaceSourceXcbWindow.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUSurfaceSourceXcbWindow allocate(Arena arena) {
        return new WGPUSurfaceSourceXcbWindow(arena.allocate(LAYOUT));
    }

    public static WGPUSurfaceSourceXcbWindow.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUSurfaceSourceXcbWindow.Ptr(segment);
    }

    public static WGPUSurfaceSourceXcbWindow clone(Arena arena, WGPUSurfaceSourceXcbWindow src) {
        WGPUSurfaceSourceXcbWindow ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUChainedStruct chain() {
        return new WGPUChainedStruct(segment.asSlice(OFFSET$chain, LAYOUT$chain));
    }

    public WGPUSurfaceSourceXcbWindow chain(@NotNull WGPUChainedStruct value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$chain, SIZE$chain);
        return this;
    }

    public WGPUSurfaceSourceXcbWindow chain(Consumer<@NotNull WGPUChainedStruct> consumer) {
        consumer.accept(chain());
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment connection() {
        return segment.get(LAYOUT$connection, OFFSET$connection);
    }

    public WGPUSurfaceSourceXcbWindow connection(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$connection, OFFSET$connection, value);
        return this;
    }

    public WGPUSurfaceSourceXcbWindow connection(@Nullable IPointer pointer) {
        connection(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int window() {
        return segment.get(LAYOUT$window, OFFSET$window);
    }

    public WGPUSurfaceSourceXcbWindow window(@Unsigned int value) {
        segment.set(LAYOUT$window, OFFSET$window, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUChainedStruct.LAYOUT.withName("chain"),
        ValueLayout.ADDRESS.withName("connection"),
        ValueLayout.JAVA_INT.withName("window")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$chain = PathElement.groupElement("chain");
    public static final PathElement PATH$connection = PathElement.groupElement("connection");
    public static final PathElement PATH$window = PathElement.groupElement("window");

    public static final StructLayout LAYOUT$chain = (StructLayout) LAYOUT.select(PATH$chain);
    public static final AddressLayout LAYOUT$connection = (AddressLayout) LAYOUT.select(PATH$connection);
    public static final OfInt LAYOUT$window = (OfInt) LAYOUT.select(PATH$window);

    public static final long SIZE$chain = LAYOUT$chain.byteSize();
    public static final long SIZE$connection = LAYOUT$connection.byteSize();
    public static final long SIZE$window = LAYOUT$window.byteSize();

    public static final long OFFSET$chain = LAYOUT.byteOffset(PATH$chain);
    public static final long OFFSET$connection = LAYOUT.byteOffset(PATH$connection);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);
}

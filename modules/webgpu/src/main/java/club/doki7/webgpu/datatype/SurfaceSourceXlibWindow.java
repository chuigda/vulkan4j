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

/// Represents a pointer to a {@code SurfaceSourceXlibWindow} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SurfaceSourceXlibWindow {
///     void* display; // @link substring="display" target="#display"
///     uint64_t window; // @link substring="window" target="#window"
/// } SurfaceSourceXlibWindow;
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
public record SurfaceSourceXlibWindow(@NotNull MemorySegment segment) implements ISurfaceSourceXlibWindow {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SurfaceSourceXlibWindow}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISurfaceSourceXlibWindow to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SurfaceSourceXlibWindow.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISurfaceSourceXlibWindow, Iterable<SurfaceSourceXlibWindow> {
        public long size() {
            return segment.byteSize() / SurfaceSourceXlibWindow.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SurfaceSourceXlibWindow at(long index) {
            return new SurfaceSourceXlibWindow(segment.asSlice(index * SurfaceSourceXlibWindow.BYTES, SurfaceSourceXlibWindow.BYTES));
        }

        public void write(long index, @NotNull SurfaceSourceXlibWindow value) {
            MemorySegment s = segment.asSlice(index * SurfaceSourceXlibWindow.BYTES, SurfaceSourceXlibWindow.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SurfaceSourceXlibWindow.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SurfaceSourceXlibWindow.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SurfaceSourceXlibWindow.BYTES,
                (end - start) * SurfaceSourceXlibWindow.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SurfaceSourceXlibWindow.BYTES));
        }

        public SurfaceSourceXlibWindow[] toArray() {
            SurfaceSourceXlibWindow[] ret = new SurfaceSourceXlibWindow[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SurfaceSourceXlibWindow> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SurfaceSourceXlibWindow> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SurfaceSourceXlibWindow.BYTES;
            }

            @Override
            public SurfaceSourceXlibWindow next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SurfaceSourceXlibWindow ret = new SurfaceSourceXlibWindow(segment.asSlice(0, SurfaceSourceXlibWindow.BYTES));
                segment = segment.asSlice(SurfaceSourceXlibWindow.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SurfaceSourceXlibWindow allocate(Arena arena) {
        return new SurfaceSourceXlibWindow(arena.allocate(LAYOUT));
    }

    public static SurfaceSourceXlibWindow.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SurfaceSourceXlibWindow.Ptr(segment);
    }

    public static SurfaceSourceXlibWindow clone(Arena arena, SurfaceSourceXlibWindow src) {
        SurfaceSourceXlibWindow ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Pointer(comment="void*") MemorySegment display() {
        return segment.get(LAYOUT$display, OFFSET$display);
    }

    public void display(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$display, OFFSET$display, value);
    }

    public SurfaceSourceXlibWindow display(@Nullable IPointer pointer) {
        display(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned long window() {
        return segment.get(LAYOUT$window, OFFSET$window);
    }

    public SurfaceSourceXlibWindow window(@Unsigned long value) {
        segment.set(LAYOUT$window, OFFSET$window, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.JAVA_LONG.withName("window")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$display = PathElement.groupElement("display");
    public static final PathElement PATH$window = PathElement.groupElement("window");

    public static final AddressLayout LAYOUT$display = (AddressLayout) LAYOUT.select(PATH$display);
    public static final OfLong LAYOUT$window = (OfLong) LAYOUT.select(PATH$window);

    public static final long SIZE$display = LAYOUT$display.byteSize();
    public static final long SIZE$window = LAYOUT$window.byteSize();

    public static final long OFFSET$display = LAYOUT.byteOffset(PATH$display);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);
}

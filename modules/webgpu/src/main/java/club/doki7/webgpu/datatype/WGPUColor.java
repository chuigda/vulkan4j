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

/// Represents a pointer to a {@code WGPUColor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUColor {
///     double r; // @link substring="r" target="#r"
///     double g; // @link substring="g" target="#g"
///     double b; // @link substring="b" target="#b"
///     double a; // @link substring="a" target="#a"
/// } WGPUColor;
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
public record WGPUColor(@NotNull MemorySegment segment) implements IWGPUColor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUColor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUColor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUColor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUColor, Iterable<WGPUColor> {
        public long size() {
            return segment.byteSize() / WGPUColor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUColor at(long index) {
            return new WGPUColor(segment.asSlice(index * WGPUColor.BYTES, WGPUColor.BYTES));
        }

        public WGPUColor.Ptr at(long index, @NotNull Consumer<@NotNull WGPUColor> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUColor value) {
            MemorySegment s = segment.asSlice(index * WGPUColor.BYTES, WGPUColor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUColor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUColor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUColor.BYTES,
                (end - start) * WGPUColor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUColor.BYTES));
        }

        public WGPUColor[] toArray() {
            WGPUColor[] ret = new WGPUColor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUColor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUColor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUColor.BYTES;
            }

            @Override
            public WGPUColor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUColor ret = new WGPUColor(segment.asSlice(0, WGPUColor.BYTES));
                segment = segment.asSlice(WGPUColor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUColor allocate(Arena arena) {
        return new WGPUColor(arena.allocate(LAYOUT));
    }

    public static WGPUColor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUColor.Ptr(segment);
    }

    public static WGPUColor clone(Arena arena, WGPUColor src) {
        WGPUColor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public double r() {
        return segment.get(LAYOUT$r, OFFSET$r);
    }

    public WGPUColor r(double value) {
        segment.set(LAYOUT$r, OFFSET$r, value);
        return this;
    }

    public double g() {
        return segment.get(LAYOUT$g, OFFSET$g);
    }

    public WGPUColor g(double value) {
        segment.set(LAYOUT$g, OFFSET$g, value);
        return this;
    }

    public double b() {
        return segment.get(LAYOUT$b, OFFSET$b);
    }

    public WGPUColor b(double value) {
        segment.set(LAYOUT$b, OFFSET$b, value);
        return this;
    }

    public double a() {
        return segment.get(LAYOUT$a, OFFSET$a);
    }

    public WGPUColor a(double value) {
        segment.set(LAYOUT$a, OFFSET$a, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_DOUBLE.withName("r"),
        ValueLayout.JAVA_DOUBLE.withName("g"),
        ValueLayout.JAVA_DOUBLE.withName("b"),
        ValueLayout.JAVA_DOUBLE.withName("a")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$r = PathElement.groupElement("r");
    public static final PathElement PATH$g = PathElement.groupElement("g");
    public static final PathElement PATH$b = PathElement.groupElement("b");
    public static final PathElement PATH$a = PathElement.groupElement("a");

    public static final OfDouble LAYOUT$r = (OfDouble) LAYOUT.select(PATH$r);
    public static final OfDouble LAYOUT$g = (OfDouble) LAYOUT.select(PATH$g);
    public static final OfDouble LAYOUT$b = (OfDouble) LAYOUT.select(PATH$b);
    public static final OfDouble LAYOUT$a = (OfDouble) LAYOUT.select(PATH$a);

    public static final long SIZE$r = LAYOUT$r.byteSize();
    public static final long SIZE$g = LAYOUT$g.byteSize();
    public static final long SIZE$b = LAYOUT$b.byteSize();
    public static final long SIZE$a = LAYOUT$a.byteSize();

    public static final long OFFSET$r = LAYOUT.byteOffset(PATH$r);
    public static final long OFFSET$g = LAYOUT.byteOffset(PATH$g);
    public static final long OFFSET$b = LAYOUT.byteOffset(PATH$b);
    public static final long OFFSET$a = LAYOUT.byteOffset(PATH$a);
}

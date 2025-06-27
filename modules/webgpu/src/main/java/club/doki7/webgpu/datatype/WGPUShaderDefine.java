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

/// Represents a pointer to a {@code WGPUShaderDefine} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUShaderDefine {
///     WGPUStringView name; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="name" target="#name"
///     WGPUStringView value; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="value" target="#value"
/// } WGPUShaderDefine;
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
public record WGPUShaderDefine(@NotNull MemorySegment segment) implements IWGPUShaderDefine {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUShaderDefine}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUShaderDefine to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUShaderDefine.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUShaderDefine, Iterable<WGPUShaderDefine> {
        public long size() {
            return segment.byteSize() / WGPUShaderDefine.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUShaderDefine at(long index) {
            return new WGPUShaderDefine(segment.asSlice(index * WGPUShaderDefine.BYTES, WGPUShaderDefine.BYTES));
        }

        public WGPUShaderDefine.Ptr at(long index, @NotNull Consumer<@NotNull WGPUShaderDefine> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUShaderDefine value) {
            MemorySegment s = segment.asSlice(index * WGPUShaderDefine.BYTES, WGPUShaderDefine.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUShaderDefine.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUShaderDefine.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUShaderDefine.BYTES,
                (end - start) * WGPUShaderDefine.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUShaderDefine.BYTES));
        }

        public WGPUShaderDefine[] toArray() {
            WGPUShaderDefine[] ret = new WGPUShaderDefine[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUShaderDefine> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUShaderDefine> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUShaderDefine.BYTES;
            }

            @Override
            public WGPUShaderDefine next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUShaderDefine ret = new WGPUShaderDefine(segment.asSlice(0, WGPUShaderDefine.BYTES));
                segment = segment.asSlice(WGPUShaderDefine.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUShaderDefine allocate(Arena arena) {
        return new WGPUShaderDefine(arena.allocate(LAYOUT));
    }

    public static WGPUShaderDefine.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUShaderDefine.Ptr(segment);
    }

    public static WGPUShaderDefine clone(Arena arena, WGPUShaderDefine src) {
        WGPUShaderDefine ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUStringView name() {
        return new WGPUStringView(segment.asSlice(OFFSET$name, LAYOUT$name));
    }

    public WGPUShaderDefine name(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$name, SIZE$name);
        return this;
    }

    public WGPUShaderDefine name(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(name());
        return this;
    }

    public @NotNull WGPUStringView value() {
        return new WGPUStringView(segment.asSlice(OFFSET$value, LAYOUT$value));
    }

    public WGPUShaderDefine value(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$value, SIZE$value);
        return this;
    }

    public WGPUShaderDefine value(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(value());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUStringView.LAYOUT.withName("name"),
        WGPUStringView.LAYOUT.withName("value")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$value = PathElement.groupElement("value");

    public static final StructLayout LAYOUT$name = (StructLayout) LAYOUT.select(PATH$name);
    public static final StructLayout LAYOUT$value = (StructLayout) LAYOUT.select(PATH$value);

    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$value = LAYOUT$value.byteSize();

    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);
}

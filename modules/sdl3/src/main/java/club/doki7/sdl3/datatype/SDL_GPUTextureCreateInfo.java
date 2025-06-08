package club.doki7.sdl3.datatype;

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
import club.doki7.sdl3.bitmask.*;
import club.doki7.sdl3.handle.*;
import club.doki7.sdl3.enumtype.*;
import static club.doki7.sdl3.SDL3Constants.*;

/// A structure specifying the parameters of a texture.
///
/// Usage flags can be bitwise OR'd together for combinations of usages. Note
/// that certain usage combinations are invalid, for example SAMPLER and
/// GRAPHICS_STORAGE.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_CreateGPUTexture`
/// - `SDL_GPUTextureType`
/// - `SDL_GPUTextureFormat`
/// - `SDL_GPUTextureUsageFlags`
/// - `SDL_GPUSampleCount`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUTextureCreateInfo {
///     SDL_GPUTextureType type; // @link substring="SDL_GPUTextureType" target="SDL_GPUTextureType" @link substring="type" target="#type"
///     SDL_GPUTextureFormat format; // @link substring="SDL_GPUTextureFormat" target="SDL_GPUTextureFormat" @link substring="format" target="#format"
///     SDL_GPUTextureUsageFlags usage; // @link substring="SDL_GPUTextureUsageFlags" target="SDL_GPUTextureUsageFlags" @link substring="usage" target="#usage"
///     Uint32 width; // @link substring="width" target="#width"
///     Uint32 height; // @link substring="height" target="#height"
///     Uint32 layer_count_or_depth; // @link substring="layer_count_or_depth" target="#layer_count_or_depth"
///     Uint32 num_levels; // @link substring="num_levels" target="#num_levels"
///     SDL_GPUSampleCount sample_count; // @link substring="SDL_GPUSampleCount" target="SDL_GPUSampleCount" @link substring="sample_count" target="#sample_count"
///     SDL_PropertiesID props; // @link substring="props" target="#props"
/// } SDL_GPUTextureCreateInfo;
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
public record SDL_GPUTextureCreateInfo(@NotNull MemorySegment segment) implements ISDL_GPUTextureCreateInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUTextureCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUTextureCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUTextureCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUTextureCreateInfo, Iterable<SDL_GPUTextureCreateInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUTextureCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUTextureCreateInfo at(long index) {
            return new SDL_GPUTextureCreateInfo(segment.asSlice(index * SDL_GPUTextureCreateInfo.BYTES, SDL_GPUTextureCreateInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUTextureCreateInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUTextureCreateInfo.BYTES, SDL_GPUTextureCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUTextureCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUTextureCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUTextureCreateInfo.BYTES,
                (end - start) * SDL_GPUTextureCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUTextureCreateInfo.BYTES));
        }

        public SDL_GPUTextureCreateInfo[] toArray() {
            SDL_GPUTextureCreateInfo[] ret = new SDL_GPUTextureCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUTextureCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUTextureCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUTextureCreateInfo.BYTES;
            }

            @Override
            public SDL_GPUTextureCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUTextureCreateInfo ret = new SDL_GPUTextureCreateInfo(segment.asSlice(0, SDL_GPUTextureCreateInfo.BYTES));
                segment = segment.asSlice(SDL_GPUTextureCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUTextureCreateInfo allocate(Arena arena) {
        return new SDL_GPUTextureCreateInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUTextureCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUTextureCreateInfo.Ptr(segment);
    }

    public static SDL_GPUTextureCreateInfo clone(Arena arena, SDL_GPUTextureCreateInfo src) {
        SDL_GPUTextureCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GPUTextureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_GPUTextureCreateInfo type(@EnumType(SDL_GPUTextureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @EnumType(SDL_GPUTextureFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public SDL_GPUTextureCreateInfo format(@EnumType(SDL_GPUTextureFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @EnumType(SDL_GPUTextureUsageFlags.class) int usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public SDL_GPUTextureCreateInfo usage(@EnumType(SDL_GPUTextureUsageFlags.class) int value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public SDL_GPUTextureCreateInfo width(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public SDL_GPUTextureCreateInfo height(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int layer_count_or_depth() {
        return segment.get(LAYOUT$layer_count_or_depth, OFFSET$layer_count_or_depth);
    }

    public SDL_GPUTextureCreateInfo layer_count_or_depth(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$layer_count_or_depth, OFFSET$layer_count_or_depth, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int num_levels() {
        return segment.get(LAYOUT$num_levels, OFFSET$num_levels);
    }

    public SDL_GPUTextureCreateInfo num_levels(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_levels, OFFSET$num_levels, value);
        return this;
    }

    public @EnumType(SDL_GPUSampleCount.class) int sample_count() {
        return segment.get(LAYOUT$sample_count, OFFSET$sample_count);
    }

    public SDL_GPUTextureCreateInfo sample_count(@EnumType(SDL_GPUSampleCount.class) int value) {
        segment.set(LAYOUT$sample_count, OFFSET$sample_count, value);
        return this;
    }

    public @NativeType("SDL_PropertiesID") @Unsigned int props() {
        return segment.get(LAYOUT$props, OFFSET$props);
    }

    public SDL_GPUTextureCreateInfo props(@NativeType("SDL_PropertiesID") @Unsigned int value) {
        segment.set(LAYOUT$props, OFFSET$props, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("layer_count_or_depth"),
        ValueLayout.JAVA_INT.withName("num_levels"),
        ValueLayout.JAVA_INT.withName("sample_count"),
        ValueLayout.JAVA_INT.withName("props")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$layer_count_or_depth = PathElement.groupElement("layer_count_or_depth");
    public static final PathElement PATH$num_levels = PathElement.groupElement("num_levels");
    public static final PathElement PATH$sample_count = PathElement.groupElement("sample_count");
    public static final PathElement PATH$props = PathElement.groupElement("props");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$usage = (OfInt) LAYOUT.select(PATH$usage);
    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$layer_count_or_depth = (OfInt) LAYOUT.select(PATH$layer_count_or_depth);
    public static final OfInt LAYOUT$num_levels = (OfInt) LAYOUT.select(PATH$num_levels);
    public static final OfInt LAYOUT$sample_count = (OfInt) LAYOUT.select(PATH$sample_count);
    public static final OfInt LAYOUT$props = (OfInt) LAYOUT.select(PATH$props);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$layer_count_or_depth = LAYOUT$layer_count_or_depth.byteSize();
    public static final long SIZE$num_levels = LAYOUT$num_levels.byteSize();
    public static final long SIZE$sample_count = LAYOUT$sample_count.byteSize();
    public static final long SIZE$props = LAYOUT$props.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$layer_count_or_depth = LAYOUT.byteOffset(PATH$layer_count_or_depth);
    public static final long OFFSET$num_levels = LAYOUT.byteOffset(PATH$num_levels);
    public static final long OFFSET$sample_count = LAYOUT.byteOffset(PATH$sample_count);
    public static final long OFFSET$props = LAYOUT.byteOffset(PATH$props);
}

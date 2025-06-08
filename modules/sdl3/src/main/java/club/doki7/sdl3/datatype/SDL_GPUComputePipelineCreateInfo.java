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

/// A structure specifying the parameters of a compute pipeline state.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUComputePipeline
/// \sa SDL_GPUShaderFormat
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUComputePipelineCreateInfo {
///     size_t code_size; // @link substring="code_size" target="#code_size"
///     Uint8 const* code; // @link substring="code" target="#code"
///     char const* entrypoint; // @link substring="entrypoint" target="#entrypoint"
///     SDL_GPUShaderFormat format; // @link substring="SDL_GPUShaderFormat" target="SDL_GPUShaderFormat" @link substring="format" target="#format"
///     Uint32 num_samplers; // @link substring="num_samplers" target="#num_samplers"
///     Uint32 num_readonly_storage_textures; // @link substring="num_readonly_storage_textures" target="#num_readonly_storage_textures"
///     Uint32 num_readonly_storage_buffers; // @link substring="num_readonly_storage_buffers" target="#num_readonly_storage_buffers"
///     Uint32 num_readwrite_storage_textures; // @link substring="num_readwrite_storage_textures" target="#num_readwrite_storage_textures"
///     Uint32 num_readwrite_storage_buffers; // @link substring="num_readwrite_storage_buffers" target="#num_readwrite_storage_buffers"
///     Uint32 num_uniform_buffers; // @link substring="num_uniform_buffers" target="#num_uniform_buffers"
///     Uint32 threadcount_x; // @link substring="threadcount_x" target="#threadcount_x"
///     Uint32 threadcount_y; // @link substring="threadcount_y" target="#threadcount_y"
///     Uint32 threadcount_z; // @link substring="threadcount_z" target="#threadcount_z"
///     SDL_PropertiesID props; // @link substring="props" target="#props"
/// } SDL_GPUComputePipelineCreateInfo;
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
public record SDL_GPUComputePipelineCreateInfo(@NotNull MemorySegment segment) implements ISDL_GPUComputePipelineCreateInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUComputePipelineCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUComputePipelineCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUComputePipelineCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUComputePipelineCreateInfo, Iterable<SDL_GPUComputePipelineCreateInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUComputePipelineCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUComputePipelineCreateInfo at(long index) {
            return new SDL_GPUComputePipelineCreateInfo(segment.asSlice(index * SDL_GPUComputePipelineCreateInfo.BYTES, SDL_GPUComputePipelineCreateInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUComputePipelineCreateInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUComputePipelineCreateInfo.BYTES, SDL_GPUComputePipelineCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUComputePipelineCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUComputePipelineCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUComputePipelineCreateInfo.BYTES,
                (end - start) * SDL_GPUComputePipelineCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUComputePipelineCreateInfo.BYTES));
        }

        public SDL_GPUComputePipelineCreateInfo[] toArray() {
            SDL_GPUComputePipelineCreateInfo[] ret = new SDL_GPUComputePipelineCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUComputePipelineCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUComputePipelineCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUComputePipelineCreateInfo.BYTES;
            }

            @Override
            public SDL_GPUComputePipelineCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUComputePipelineCreateInfo ret = new SDL_GPUComputePipelineCreateInfo(segment.asSlice(0, SDL_GPUComputePipelineCreateInfo.BYTES));
                segment = segment.asSlice(SDL_GPUComputePipelineCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUComputePipelineCreateInfo allocate(Arena arena) {
        return new SDL_GPUComputePipelineCreateInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUComputePipelineCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUComputePipelineCreateInfo.Ptr(segment);
    }

    public static SDL_GPUComputePipelineCreateInfo clone(Arena arena, SDL_GPUComputePipelineCreateInfo src) {
        SDL_GPUComputePipelineCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned long code_size() {
        return NativeLayout.readCSizeT(segment, OFFSET$code_size);
    }

    public SDL_GPUComputePipelineCreateInfo code_size(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$code_size, value);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Pointer(comment="Uint8") @Unsigned BytePtr code() {
        MemorySegment s = codeRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_GPUComputePipelineCreateInfo code(@Nullable @Pointer(comment="Uint8") @Unsigned BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        codeRaw(s);
        return this;
    }

    public @Pointer(comment="uint8_t*") MemorySegment codeRaw() {
        return segment.get(LAYOUT$code, OFFSET$code);
    }

    public void codeRaw(@Pointer(comment="uint8_t*") MemorySegment value) {
        segment.set(LAYOUT$code, OFFSET$code, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr entrypoint() {
        MemorySegment s = entrypointRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_GPUComputePipelineCreateInfo entrypoint(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        entrypointRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment entrypointRaw() {
        return segment.get(LAYOUT$entrypoint, OFFSET$entrypoint);
    }

    public void entrypointRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$entrypoint, OFFSET$entrypoint, value);
    }

    public @EnumType(SDL_GPUShaderFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public SDL_GPUComputePipelineCreateInfo format(@EnumType(SDL_GPUShaderFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int num_samplers() {
        return segment.get(LAYOUT$num_samplers, OFFSET$num_samplers);
    }

    public SDL_GPUComputePipelineCreateInfo num_samplers(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_samplers, OFFSET$num_samplers, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int num_readonly_storage_textures() {
        return segment.get(LAYOUT$num_readonly_storage_textures, OFFSET$num_readonly_storage_textures);
    }

    public SDL_GPUComputePipelineCreateInfo num_readonly_storage_textures(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_readonly_storage_textures, OFFSET$num_readonly_storage_textures, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int num_readonly_storage_buffers() {
        return segment.get(LAYOUT$num_readonly_storage_buffers, OFFSET$num_readonly_storage_buffers);
    }

    public SDL_GPUComputePipelineCreateInfo num_readonly_storage_buffers(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_readonly_storage_buffers, OFFSET$num_readonly_storage_buffers, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int num_readwrite_storage_textures() {
        return segment.get(LAYOUT$num_readwrite_storage_textures, OFFSET$num_readwrite_storage_textures);
    }

    public SDL_GPUComputePipelineCreateInfo num_readwrite_storage_textures(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_readwrite_storage_textures, OFFSET$num_readwrite_storage_textures, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int num_readwrite_storage_buffers() {
        return segment.get(LAYOUT$num_readwrite_storage_buffers, OFFSET$num_readwrite_storage_buffers);
    }

    public SDL_GPUComputePipelineCreateInfo num_readwrite_storage_buffers(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_readwrite_storage_buffers, OFFSET$num_readwrite_storage_buffers, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int num_uniform_buffers() {
        return segment.get(LAYOUT$num_uniform_buffers, OFFSET$num_uniform_buffers);
    }

    public SDL_GPUComputePipelineCreateInfo num_uniform_buffers(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_uniform_buffers, OFFSET$num_uniform_buffers, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int threadcount_x() {
        return segment.get(LAYOUT$threadcount_x, OFFSET$threadcount_x);
    }

    public SDL_GPUComputePipelineCreateInfo threadcount_x(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$threadcount_x, OFFSET$threadcount_x, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int threadcount_y() {
        return segment.get(LAYOUT$threadcount_y, OFFSET$threadcount_y);
    }

    public SDL_GPUComputePipelineCreateInfo threadcount_y(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$threadcount_y, OFFSET$threadcount_y, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int threadcount_z() {
        return segment.get(LAYOUT$threadcount_z, OFFSET$threadcount_z);
    }

    public SDL_GPUComputePipelineCreateInfo threadcount_z(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$threadcount_z, OFFSET$threadcount_z, value);
        return this;
    }

    public @NativeType("SDL_PropertiesID") @Unsigned int props() {
        return segment.get(LAYOUT$props, OFFSET$props);
    }

    public SDL_GPUComputePipelineCreateInfo props(@NativeType("SDL_PropertiesID") @Unsigned int value) {
        segment.set(LAYOUT$props, OFFSET$props, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        NativeLayout.C_SIZE_T.withName("code_size"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("code"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("entrypoint"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("num_samplers"),
        ValueLayout.JAVA_INT.withName("num_readonly_storage_textures"),
        ValueLayout.JAVA_INT.withName("num_readonly_storage_buffers"),
        ValueLayout.JAVA_INT.withName("num_readwrite_storage_textures"),
        ValueLayout.JAVA_INT.withName("num_readwrite_storage_buffers"),
        ValueLayout.JAVA_INT.withName("num_uniform_buffers"),
        ValueLayout.JAVA_INT.withName("threadcount_x"),
        ValueLayout.JAVA_INT.withName("threadcount_y"),
        ValueLayout.JAVA_INT.withName("threadcount_z"),
        ValueLayout.JAVA_INT.withName("props")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$code_size = PathElement.groupElement("code_size");
    public static final PathElement PATH$code = PathElement.groupElement("code");
    public static final PathElement PATH$entrypoint = PathElement.groupElement("entrypoint");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$num_samplers = PathElement.groupElement("num_samplers");
    public static final PathElement PATH$num_readonly_storage_textures = PathElement.groupElement("num_readonly_storage_textures");
    public static final PathElement PATH$num_readonly_storage_buffers = PathElement.groupElement("num_readonly_storage_buffers");
    public static final PathElement PATH$num_readwrite_storage_textures = PathElement.groupElement("num_readwrite_storage_textures");
    public static final PathElement PATH$num_readwrite_storage_buffers = PathElement.groupElement("num_readwrite_storage_buffers");
    public static final PathElement PATH$num_uniform_buffers = PathElement.groupElement("num_uniform_buffers");
    public static final PathElement PATH$threadcount_x = PathElement.groupElement("threadcount_x");
    public static final PathElement PATH$threadcount_y = PathElement.groupElement("threadcount_y");
    public static final PathElement PATH$threadcount_z = PathElement.groupElement("threadcount_z");
    public static final PathElement PATH$props = PathElement.groupElement("props");

    public static final AddressLayout LAYOUT$code = (AddressLayout) LAYOUT.select(PATH$code);
    public static final AddressLayout LAYOUT$entrypoint = (AddressLayout) LAYOUT.select(PATH$entrypoint);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$num_samplers = (OfInt) LAYOUT.select(PATH$num_samplers);
    public static final OfInt LAYOUT$num_readonly_storage_textures = (OfInt) LAYOUT.select(PATH$num_readonly_storage_textures);
    public static final OfInt LAYOUT$num_readonly_storage_buffers = (OfInt) LAYOUT.select(PATH$num_readonly_storage_buffers);
    public static final OfInt LAYOUT$num_readwrite_storage_textures = (OfInt) LAYOUT.select(PATH$num_readwrite_storage_textures);
    public static final OfInt LAYOUT$num_readwrite_storage_buffers = (OfInt) LAYOUT.select(PATH$num_readwrite_storage_buffers);
    public static final OfInt LAYOUT$num_uniform_buffers = (OfInt) LAYOUT.select(PATH$num_uniform_buffers);
    public static final OfInt LAYOUT$threadcount_x = (OfInt) LAYOUT.select(PATH$threadcount_x);
    public static final OfInt LAYOUT$threadcount_y = (OfInt) LAYOUT.select(PATH$threadcount_y);
    public static final OfInt LAYOUT$threadcount_z = (OfInt) LAYOUT.select(PATH$threadcount_z);
    public static final OfInt LAYOUT$props = (OfInt) LAYOUT.select(PATH$props);

    public static final long SIZE$code_size = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$code = LAYOUT$code.byteSize();
    public static final long SIZE$entrypoint = LAYOUT$entrypoint.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$num_samplers = LAYOUT$num_samplers.byteSize();
    public static final long SIZE$num_readonly_storage_textures = LAYOUT$num_readonly_storage_textures.byteSize();
    public static final long SIZE$num_readonly_storage_buffers = LAYOUT$num_readonly_storage_buffers.byteSize();
    public static final long SIZE$num_readwrite_storage_textures = LAYOUT$num_readwrite_storage_textures.byteSize();
    public static final long SIZE$num_readwrite_storage_buffers = LAYOUT$num_readwrite_storage_buffers.byteSize();
    public static final long SIZE$num_uniform_buffers = LAYOUT$num_uniform_buffers.byteSize();
    public static final long SIZE$threadcount_x = LAYOUT$threadcount_x.byteSize();
    public static final long SIZE$threadcount_y = LAYOUT$threadcount_y.byteSize();
    public static final long SIZE$threadcount_z = LAYOUT$threadcount_z.byteSize();
    public static final long SIZE$props = LAYOUT$props.byteSize();

    public static final long OFFSET$code_size = LAYOUT.byteOffset(PATH$code_size);
    public static final long OFFSET$code = LAYOUT.byteOffset(PATH$code);
    public static final long OFFSET$entrypoint = LAYOUT.byteOffset(PATH$entrypoint);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$num_samplers = LAYOUT.byteOffset(PATH$num_samplers);
    public static final long OFFSET$num_readonly_storage_textures = LAYOUT.byteOffset(PATH$num_readonly_storage_textures);
    public static final long OFFSET$num_readonly_storage_buffers = LAYOUT.byteOffset(PATH$num_readonly_storage_buffers);
    public static final long OFFSET$num_readwrite_storage_textures = LAYOUT.byteOffset(PATH$num_readwrite_storage_textures);
    public static final long OFFSET$num_readwrite_storage_buffers = LAYOUT.byteOffset(PATH$num_readwrite_storage_buffers);
    public static final long OFFSET$num_uniform_buffers = LAYOUT.byteOffset(PATH$num_uniform_buffers);
    public static final long OFFSET$threadcount_x = LAYOUT.byteOffset(PATH$threadcount_x);
    public static final long OFFSET$threadcount_y = LAYOUT.byteOffset(PATH$threadcount_y);
    public static final long OFFSET$threadcount_z = LAYOUT.byteOffset(PATH$threadcount_z);
    public static final long OFFSET$props = LAYOUT.byteOffset(PATH$props);
}

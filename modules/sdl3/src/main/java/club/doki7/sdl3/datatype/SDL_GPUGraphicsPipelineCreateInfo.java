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

/// A structure specifying the parameters of a graphics pipeline state.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
/// \sa SDL_GPUShader
/// \sa SDL_GPUVertexInputState
/// \sa SDL_GPUPrimitiveType
/// \sa SDL_GPURasterizerState
/// \sa SDL_GPUMultisampleState
/// \sa SDL_GPUDepthStencilState
/// \sa SDL_GPUGraphicsPipelineTargetInfo
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUGraphicsPipelineCreateInfo {
///     SDL_GPUShader* vertex_shader; // optional // @link substring="SDL_GPUShader" target="SDL_GPUShader" @link substring="vertex_shader" target="#vertex_shader"
///     SDL_GPUShader* fragment_shader; // optional // @link substring="SDL_GPUShader" target="SDL_GPUShader" @link substring="fragment_shader" target="#fragment_shader"
///     SDL_GPUVertexInputState vertex_input_state; // optional // @link substring="SDL_GPUVertexInputState" target="SDL_GPUVertexInputState" @link substring="vertex_input_state" target="#vertex_input_state"
///     SDL_GPUPrimitiveType primitive_type; // optional // @link substring="SDL_GPUPrimitiveType" target="SDL_GPUPrimitiveType" @link substring="primitive_type" target="#primitive_type"
///     SDL_GPURasterizerState rasterizer_state; // optional // @link substring="SDL_GPURasterizerState" target="SDL_GPURasterizerState" @link substring="rasterizer_state" target="#rasterizer_state"
///     SDL_GPUMultisampleState multisample_state; // optional // @link substring="SDL_GPUMultisampleState" target="SDL_GPUMultisampleState" @link substring="multisample_state" target="#multisample_state"
///     SDL_GPUDepthStencilState depth_stencil_state; // optional // @link substring="SDL_GPUDepthStencilState" target="SDL_GPUDepthStencilState" @link substring="depth_stencil_state" target="#depth_stencil_state"
///     SDL_GPUGraphicsPipelineTargetInfo target_info; // optional // @link substring="SDL_GPUGraphicsPipelineTargetInfo" target="SDL_GPUGraphicsPipelineTargetInfo" @link substring="target_info" target="#target_info"
///     SDL_PropertiesID props; // optional // @link substring="props" target="#props"
/// } SDL_GPUGraphicsPipelineCreateInfo;
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
public record SDL_GPUGraphicsPipelineCreateInfo(@NotNull MemorySegment segment) implements ISDL_GPUGraphicsPipelineCreateInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUGraphicsPipelineCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUGraphicsPipelineCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUGraphicsPipelineCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUGraphicsPipelineCreateInfo, Iterable<SDL_GPUGraphicsPipelineCreateInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUGraphicsPipelineCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUGraphicsPipelineCreateInfo at(long index) {
            return new SDL_GPUGraphicsPipelineCreateInfo(segment.asSlice(index * SDL_GPUGraphicsPipelineCreateInfo.BYTES, SDL_GPUGraphicsPipelineCreateInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUGraphicsPipelineCreateInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUGraphicsPipelineCreateInfo.BYTES, SDL_GPUGraphicsPipelineCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUGraphicsPipelineCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUGraphicsPipelineCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUGraphicsPipelineCreateInfo.BYTES,
                (end - start) * SDL_GPUGraphicsPipelineCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUGraphicsPipelineCreateInfo.BYTES));
        }

        public SDL_GPUGraphicsPipelineCreateInfo[] toArray() {
            SDL_GPUGraphicsPipelineCreateInfo[] ret = new SDL_GPUGraphicsPipelineCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUGraphicsPipelineCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUGraphicsPipelineCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUGraphicsPipelineCreateInfo.BYTES;
            }

            @Override
            public SDL_GPUGraphicsPipelineCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUGraphicsPipelineCreateInfo ret = new SDL_GPUGraphicsPipelineCreateInfo(segment.asSlice(0, SDL_GPUGraphicsPipelineCreateInfo.BYTES));
                segment = segment.asSlice(SDL_GPUGraphicsPipelineCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUGraphicsPipelineCreateInfo allocate(Arena arena) {
        return new SDL_GPUGraphicsPipelineCreateInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUGraphicsPipelineCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUGraphicsPipelineCreateInfo.Ptr(segment);
    }

    public static SDL_GPUGraphicsPipelineCreateInfo clone(Arena arena, SDL_GPUGraphicsPipelineCreateInfo src) {
        SDL_GPUGraphicsPipelineCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable SDL_GPUShader vertex_shader() {
        MemorySegment s = segment.asSlice(OFFSET$vertex_shader, SIZE$vertex_shader);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_GPUShader(s);
    }

    public SDL_GPUGraphicsPipelineCreateInfo vertex_shader(@Nullable SDL_GPUShader value) {
        segment.set(LAYOUT$vertex_shader, OFFSET$vertex_shader, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable SDL_GPUShader fragment_shader() {
        MemorySegment s = segment.asSlice(OFFSET$fragment_shader, SIZE$fragment_shader);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_GPUShader(s);
    }

    public SDL_GPUGraphicsPipelineCreateInfo fragment_shader(@Nullable SDL_GPUShader value) {
        segment.set(LAYOUT$fragment_shader, OFFSET$fragment_shader, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull SDL_GPUVertexInputState vertex_input_state() {
        return new SDL_GPUVertexInputState(segment.asSlice(OFFSET$vertex_input_state, LAYOUT$vertex_input_state));
    }

    public SDL_GPUGraphicsPipelineCreateInfo vertex_input_state(@NotNull SDL_GPUVertexInputState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertex_input_state, SIZE$vertex_input_state);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo vertex_input_state(Consumer<@NotNull SDL_GPUVertexInputState> consumer) {
        consumer.accept(vertex_input_state());
        return this;
    }

    public @EnumType(SDL_GPUPrimitiveType.class) int primitive_type() {
        return segment.get(LAYOUT$primitive_type, OFFSET$primitive_type);
    }

    public SDL_GPUGraphicsPipelineCreateInfo primitive_type(@EnumType(SDL_GPUPrimitiveType.class) int value) {
        segment.set(LAYOUT$primitive_type, OFFSET$primitive_type, value);
        return this;
    }

    public @NotNull SDL_GPURasterizerState rasterizer_state() {
        return new SDL_GPURasterizerState(segment.asSlice(OFFSET$rasterizer_state, LAYOUT$rasterizer_state));
    }

    public SDL_GPUGraphicsPipelineCreateInfo rasterizer_state(@NotNull SDL_GPURasterizerState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$rasterizer_state, SIZE$rasterizer_state);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo rasterizer_state(Consumer<@NotNull SDL_GPURasterizerState> consumer) {
        consumer.accept(rasterizer_state());
        return this;
    }

    public @NotNull SDL_GPUMultisampleState multisample_state() {
        return new SDL_GPUMultisampleState(segment.asSlice(OFFSET$multisample_state, LAYOUT$multisample_state));
    }

    public SDL_GPUGraphicsPipelineCreateInfo multisample_state(@NotNull SDL_GPUMultisampleState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$multisample_state, SIZE$multisample_state);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo multisample_state(Consumer<@NotNull SDL_GPUMultisampleState> consumer) {
        consumer.accept(multisample_state());
        return this;
    }

    public @NotNull SDL_GPUDepthStencilState depth_stencil_state() {
        return new SDL_GPUDepthStencilState(segment.asSlice(OFFSET$depth_stencil_state, LAYOUT$depth_stencil_state));
    }

    public SDL_GPUGraphicsPipelineCreateInfo depth_stencil_state(@NotNull SDL_GPUDepthStencilState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$depth_stencil_state, SIZE$depth_stencil_state);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo depth_stencil_state(Consumer<@NotNull SDL_GPUDepthStencilState> consumer) {
        consumer.accept(depth_stencil_state());
        return this;
    }

    public @NotNull SDL_GPUGraphicsPipelineTargetInfo target_info() {
        return new SDL_GPUGraphicsPipelineTargetInfo(segment.asSlice(OFFSET$target_info, LAYOUT$target_info));
    }

    public SDL_GPUGraphicsPipelineCreateInfo target_info(@NotNull SDL_GPUGraphicsPipelineTargetInfo value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$target_info, SIZE$target_info);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo target_info(Consumer<@NotNull SDL_GPUGraphicsPipelineTargetInfo> consumer) {
        consumer.accept(target_info());
        return this;
    }

    public @NativeType("SDL_PropertiesID") @Unsigned int props() {
        return segment.get(LAYOUT$props, OFFSET$props);
    }

    public SDL_GPUGraphicsPipelineCreateInfo props(@NativeType("SDL_PropertiesID") @Unsigned int value) {
        segment.set(LAYOUT$props, OFFSET$props, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("vertex_shader"),
        ValueLayout.ADDRESS.withName("fragment_shader"),
        SDL_GPUVertexInputState.LAYOUT.withName("vertex_input_state"),
        ValueLayout.JAVA_INT.withName("primitive_type"),
        SDL_GPURasterizerState.LAYOUT.withName("rasterizer_state"),
        SDL_GPUMultisampleState.LAYOUT.withName("multisample_state"),
        SDL_GPUDepthStencilState.LAYOUT.withName("depth_stencil_state"),
        SDL_GPUGraphicsPipelineTargetInfo.LAYOUT.withName("target_info"),
        ValueLayout.JAVA_INT.withName("props")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$vertex_shader = PathElement.groupElement("vertex_shader");
    public static final PathElement PATH$fragment_shader = PathElement.groupElement("fragment_shader");
    public static final PathElement PATH$vertex_input_state = PathElement.groupElement("vertex_input_state");
    public static final PathElement PATH$primitive_type = PathElement.groupElement("primitive_type");
    public static final PathElement PATH$rasterizer_state = PathElement.groupElement("rasterizer_state");
    public static final PathElement PATH$multisample_state = PathElement.groupElement("multisample_state");
    public static final PathElement PATH$depth_stencil_state = PathElement.groupElement("depth_stencil_state");
    public static final PathElement PATH$target_info = PathElement.groupElement("target_info");
    public static final PathElement PATH$props = PathElement.groupElement("props");

    public static final AddressLayout LAYOUT$vertex_shader = (AddressLayout) LAYOUT.select(PATH$vertex_shader);
    public static final AddressLayout LAYOUT$fragment_shader = (AddressLayout) LAYOUT.select(PATH$fragment_shader);
    public static final StructLayout LAYOUT$vertex_input_state = (StructLayout) LAYOUT.select(PATH$vertex_input_state);
    public static final OfInt LAYOUT$primitive_type = (OfInt) LAYOUT.select(PATH$primitive_type);
    public static final StructLayout LAYOUT$rasterizer_state = (StructLayout) LAYOUT.select(PATH$rasterizer_state);
    public static final StructLayout LAYOUT$multisample_state = (StructLayout) LAYOUT.select(PATH$multisample_state);
    public static final StructLayout LAYOUT$depth_stencil_state = (StructLayout) LAYOUT.select(PATH$depth_stencil_state);
    public static final StructLayout LAYOUT$target_info = (StructLayout) LAYOUT.select(PATH$target_info);
    public static final OfInt LAYOUT$props = (OfInt) LAYOUT.select(PATH$props);

    public static final long SIZE$vertex_shader = LAYOUT$vertex_shader.byteSize();
    public static final long SIZE$fragment_shader = LAYOUT$fragment_shader.byteSize();
    public static final long SIZE$vertex_input_state = LAYOUT$vertex_input_state.byteSize();
    public static final long SIZE$primitive_type = LAYOUT$primitive_type.byteSize();
    public static final long SIZE$rasterizer_state = LAYOUT$rasterizer_state.byteSize();
    public static final long SIZE$multisample_state = LAYOUT$multisample_state.byteSize();
    public static final long SIZE$depth_stencil_state = LAYOUT$depth_stencil_state.byteSize();
    public static final long SIZE$target_info = LAYOUT$target_info.byteSize();
    public static final long SIZE$props = LAYOUT$props.byteSize();

    public static final long OFFSET$vertex_shader = LAYOUT.byteOffset(PATH$vertex_shader);
    public static final long OFFSET$fragment_shader = LAYOUT.byteOffset(PATH$fragment_shader);
    public static final long OFFSET$vertex_input_state = LAYOUT.byteOffset(PATH$vertex_input_state);
    public static final long OFFSET$primitive_type = LAYOUT.byteOffset(PATH$primitive_type);
    public static final long OFFSET$rasterizer_state = LAYOUT.byteOffset(PATH$rasterizer_state);
    public static final long OFFSET$multisample_state = LAYOUT.byteOffset(PATH$multisample_state);
    public static final long OFFSET$depth_stencil_state = LAYOUT.byteOffset(PATH$depth_stencil_state);
    public static final long OFFSET$target_info = LAYOUT.byteOffset(PATH$target_info);
    public static final long OFFSET$props = LAYOUT.byteOffset(PATH$props);
}

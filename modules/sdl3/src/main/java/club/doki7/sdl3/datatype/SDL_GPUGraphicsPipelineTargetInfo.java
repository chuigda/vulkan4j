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

/// A structure specifying the descriptions of render targets used in a
/// graphics pipeline.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_GPUGraphicsPipelineCreateInfo`
/// - `SDL_GPUColorTargetDescription`
/// - `SDL_GPUTextureFormat`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUGraphicsPipelineTargetInfo {
///     SDL_GPUColorTargetDescription const* color_target_descriptions; // @link substring="SDL_GPUColorTargetDescription" target="SDL_GPUColorTargetDescription" @link substring="color_target_descriptions" target="#color_target_descriptions"
///     Uint32 num_color_targets; // @link substring="num_color_targets" target="#num_color_targets"
///     SDL_GPUTextureFormat depth_stencil_format; // @link substring="SDL_GPUTextureFormat" target="SDL_GPUTextureFormat" @link substring="depth_stencil_format" target="#depth_stencil_format"
///     bool has_depth_stencil_target; // @link substring="has_depth_stencil_target" target="#has_depth_stencil_target"
///     Uint8 padding1; // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // @link substring="padding2" target="#padding2"
///     Uint8 padding3; // @link substring="padding3" target="#padding3"
/// } SDL_GPUGraphicsPipelineTargetInfo;
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
public record SDL_GPUGraphicsPipelineTargetInfo(@NotNull MemorySegment segment) implements ISDL_GPUGraphicsPipelineTargetInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUGraphicsPipelineTargetInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUGraphicsPipelineTargetInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUGraphicsPipelineTargetInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUGraphicsPipelineTargetInfo, Iterable<SDL_GPUGraphicsPipelineTargetInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUGraphicsPipelineTargetInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUGraphicsPipelineTargetInfo at(long index) {
            return new SDL_GPUGraphicsPipelineTargetInfo(segment.asSlice(index * SDL_GPUGraphicsPipelineTargetInfo.BYTES, SDL_GPUGraphicsPipelineTargetInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUGraphicsPipelineTargetInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUGraphicsPipelineTargetInfo.BYTES, SDL_GPUGraphicsPipelineTargetInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUGraphicsPipelineTargetInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUGraphicsPipelineTargetInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUGraphicsPipelineTargetInfo.BYTES,
                (end - start) * SDL_GPUGraphicsPipelineTargetInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUGraphicsPipelineTargetInfo.BYTES));
        }

        public SDL_GPUGraphicsPipelineTargetInfo[] toArray() {
            SDL_GPUGraphicsPipelineTargetInfo[] ret = new SDL_GPUGraphicsPipelineTargetInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUGraphicsPipelineTargetInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUGraphicsPipelineTargetInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUGraphicsPipelineTargetInfo.BYTES;
            }

            @Override
            public SDL_GPUGraphicsPipelineTargetInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUGraphicsPipelineTargetInfo ret = new SDL_GPUGraphicsPipelineTargetInfo(segment.asSlice(0, SDL_GPUGraphicsPipelineTargetInfo.BYTES));
                segment = segment.asSlice(SDL_GPUGraphicsPipelineTargetInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUGraphicsPipelineTargetInfo allocate(Arena arena) {
        return new SDL_GPUGraphicsPipelineTargetInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUGraphicsPipelineTargetInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUGraphicsPipelineTargetInfo.Ptr(segment);
    }

    public static SDL_GPUGraphicsPipelineTargetInfo clone(Arena arena, SDL_GPUGraphicsPipelineTargetInfo src) {
        SDL_GPUGraphicsPipelineTargetInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public SDL_GPUGraphicsPipelineTargetInfo color_target_descriptions(@Nullable ISDL_GPUColorTargetDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        color_target_descriptionsRaw(s);
        return this;
    }

    @Unsafe public @Nullable SDL_GPUColorTargetDescription.Ptr color_target_descriptions(int assumedCount) {
        MemorySegment s = color_target_descriptionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * SDL_GPUColorTargetDescription.BYTES);
        return new SDL_GPUColorTargetDescription.Ptr(s);
    }

    public @Nullable SDL_GPUColorTargetDescription color_target_descriptions() {
        MemorySegment s = color_target_descriptionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_GPUColorTargetDescription(s);
    }

    public @Pointer(target=SDL_GPUColorTargetDescription.class) MemorySegment color_target_descriptionsRaw() {
        return segment.get(LAYOUT$color_target_descriptions, OFFSET$color_target_descriptions);
    }

    public void color_target_descriptionsRaw(@Pointer(target=SDL_GPUColorTargetDescription.class) MemorySegment value) {
        segment.set(LAYOUT$color_target_descriptions, OFFSET$color_target_descriptions, value);
    }

    public @NativeType("Uint32") @Unsigned int num_color_targets() {
        return segment.get(LAYOUT$num_color_targets, OFFSET$num_color_targets);
    }

    public SDL_GPUGraphicsPipelineTargetInfo num_color_targets(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_color_targets, OFFSET$num_color_targets, value);
        return this;
    }

    public @EnumType(SDL_GPUTextureFormat.class) int depth_stencil_format() {
        return segment.get(LAYOUT$depth_stencil_format, OFFSET$depth_stencil_format);
    }

    public SDL_GPUGraphicsPipelineTargetInfo depth_stencil_format(@EnumType(SDL_GPUTextureFormat.class) int value) {
        segment.set(LAYOUT$depth_stencil_format, OFFSET$depth_stencil_format, value);
        return this;
    }

    public @NativeType("boolean") boolean has_depth_stencil_target() {
        return segment.get(LAYOUT$has_depth_stencil_target, OFFSET$has_depth_stencil_target);
    }

    public SDL_GPUGraphicsPipelineTargetInfo has_depth_stencil_target(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$has_depth_stencil_target, OFFSET$has_depth_stencil_target, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPUGraphicsPipelineTargetInfo padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPUGraphicsPipelineTargetInfo padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding3() {
        return segment.get(LAYOUT$padding3, OFFSET$padding3);
    }

    public SDL_GPUGraphicsPipelineTargetInfo padding3(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding3, OFFSET$padding3, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(SDL_GPUColorTargetDescription.LAYOUT).withName("color_target_descriptions"),
        ValueLayout.JAVA_INT.withName("num_color_targets"),
        ValueLayout.JAVA_INT.withName("depth_stencil_format"),
        ValueLayout.JAVA_BOOLEAN.withName("has_depth_stencil_target"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2"),
        ValueLayout.JAVA_BYTE.withName("padding3")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$color_target_descriptions = PathElement.groupElement("color_target_descriptions");
    public static final PathElement PATH$num_color_targets = PathElement.groupElement("num_color_targets");
    public static final PathElement PATH$depth_stencil_format = PathElement.groupElement("depth_stencil_format");
    public static final PathElement PATH$has_depth_stencil_target = PathElement.groupElement("has_depth_stencil_target");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");
    public static final PathElement PATH$padding3 = PathElement.groupElement("padding3");

    public static final AddressLayout LAYOUT$color_target_descriptions = (AddressLayout) LAYOUT.select(PATH$color_target_descriptions);
    public static final OfInt LAYOUT$num_color_targets = (OfInt) LAYOUT.select(PATH$num_color_targets);
    public static final OfInt LAYOUT$depth_stencil_format = (OfInt) LAYOUT.select(PATH$depth_stencil_format);
    public static final OfBoolean LAYOUT$has_depth_stencil_target = (OfBoolean) LAYOUT.select(PATH$has_depth_stencil_target);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);
    public static final OfByte LAYOUT$padding3 = (OfByte) LAYOUT.select(PATH$padding3);

    public static final long SIZE$color_target_descriptions = LAYOUT$color_target_descriptions.byteSize();
    public static final long SIZE$num_color_targets = LAYOUT$num_color_targets.byteSize();
    public static final long SIZE$depth_stencil_format = LAYOUT$depth_stencil_format.byteSize();
    public static final long SIZE$has_depth_stencil_target = LAYOUT$has_depth_stencil_target.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();
    public static final long SIZE$padding3 = LAYOUT$padding3.byteSize();

    public static final long OFFSET$color_target_descriptions = LAYOUT.byteOffset(PATH$color_target_descriptions);
    public static final long OFFSET$num_color_targets = LAYOUT.byteOffset(PATH$num_color_targets);
    public static final long OFFSET$depth_stencil_format = LAYOUT.byteOffset(PATH$depth_stencil_format);
    public static final long OFFSET$has_depth_stencil_target = LAYOUT.byteOffset(PATH$has_depth_stencil_target);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
    public static final long OFFSET$padding3 = LAYOUT.byteOffset(PATH$padding3);
}

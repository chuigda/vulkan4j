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

/// Represents a pointer to a {@code WGPUInstanceExtras} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUInstanceExtras {
///     WGPUChainedStruct chain; // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="chain" target="#chain"
///     WGPUInstanceBackend backends; // @link substring="WGPUInstanceBackend" target="WGPUInstanceBackend" @link substring="backends" target="#backends"
///     WGPUInstanceFlag flags; // @link substring="WGPUInstanceFlag" target="WGPUInstanceFlag" @link substring="flags" target="#flags"
///     WGPUDx12Compiler dx12ShaderCompiler; // @link substring="WGPUDx12Compiler" target="WGPUDx12Compiler" @link substring="dx12ShaderCompiler" target="#dx12ShaderCompiler"
///     WGPUGles3MinorVersion gles3MinorVersion; // @link substring="WGPUGles3MinorVersion" target="WGPUGles3MinorVersion" @link substring="gles3MinorVersion" target="#gles3MinorVersion"
///     WGPUGLFenceBehaviour glFenceBehaviour; // @link substring="WGPUGLFenceBehaviour" target="WGPUGLFenceBehaviour" @link substring="glFenceBehaviour" target="#glFenceBehaviour"
///     WGPUStringView dxilPath; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="dxilPath" target="#dxilPath"
///     WGPUStringView dxcPath; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="dxcPath" target="#dxcPath"
///     WGPUDxcMaxShaderModel dxcMaxShaderModel; // @link substring="WGPUDxcMaxShaderModel" target="WGPUDxcMaxShaderModel" @link substring="dxcMaxShaderModel" target="#dxcMaxShaderModel"
/// } WGPUInstanceExtras;
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
public record WGPUInstanceExtras(@NotNull MemorySegment segment) implements IWGPUInstanceExtras {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUInstanceExtras}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUInstanceExtras to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUInstanceExtras.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUInstanceExtras, Iterable<WGPUInstanceExtras> {
        public long size() {
            return segment.byteSize() / WGPUInstanceExtras.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUInstanceExtras at(long index) {
            return new WGPUInstanceExtras(segment.asSlice(index * WGPUInstanceExtras.BYTES, WGPUInstanceExtras.BYTES));
        }

        public WGPUInstanceExtras.Ptr at(long index, @NotNull Consumer<@NotNull WGPUInstanceExtras> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUInstanceExtras value) {
            MemorySegment s = segment.asSlice(index * WGPUInstanceExtras.BYTES, WGPUInstanceExtras.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUInstanceExtras.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUInstanceExtras.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUInstanceExtras.BYTES,
                (end - start) * WGPUInstanceExtras.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUInstanceExtras.BYTES));
        }

        public WGPUInstanceExtras[] toArray() {
            WGPUInstanceExtras[] ret = new WGPUInstanceExtras[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUInstanceExtras> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUInstanceExtras> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUInstanceExtras.BYTES;
            }

            @Override
            public WGPUInstanceExtras next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUInstanceExtras ret = new WGPUInstanceExtras(segment.asSlice(0, WGPUInstanceExtras.BYTES));
                segment = segment.asSlice(WGPUInstanceExtras.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUInstanceExtras allocate(Arena arena) {
        return new WGPUInstanceExtras(arena.allocate(LAYOUT));
    }

    public static WGPUInstanceExtras.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUInstanceExtras.Ptr(segment);
    }

    public static WGPUInstanceExtras clone(Arena arena, WGPUInstanceExtras src) {
        WGPUInstanceExtras ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUChainedStruct chain() {
        return new WGPUChainedStruct(segment.asSlice(OFFSET$chain, LAYOUT$chain));
    }

    public WGPUInstanceExtras chain(@NotNull WGPUChainedStruct value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$chain, SIZE$chain);
        return this;
    }

    public WGPUInstanceExtras chain(Consumer<@NotNull WGPUChainedStruct> consumer) {
        consumer.accept(chain());
        return this;
    }

    public @Bitmask(WGPUInstanceBackend.class) long backends() {
        return segment.get(LAYOUT$backends, OFFSET$backends);
    }

    public WGPUInstanceExtras backends(@Bitmask(WGPUInstanceBackend.class) long value) {
        segment.set(LAYOUT$backends, OFFSET$backends, value);
        return this;
    }

    public @Bitmask(WGPUInstanceFlag.class) long flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public WGPUInstanceExtras flags(@Bitmask(WGPUInstanceFlag.class) long value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @EnumType(WGPUDx12Compiler.class) int dx12ShaderCompiler() {
        return segment.get(LAYOUT$dx12ShaderCompiler, OFFSET$dx12ShaderCompiler);
    }

    public WGPUInstanceExtras dx12ShaderCompiler(@EnumType(WGPUDx12Compiler.class) int value) {
        segment.set(LAYOUT$dx12ShaderCompiler, OFFSET$dx12ShaderCompiler, value);
        return this;
    }

    public @EnumType(WGPUGles3MinorVersion.class) int gles3MinorVersion() {
        return segment.get(LAYOUT$gles3MinorVersion, OFFSET$gles3MinorVersion);
    }

    public WGPUInstanceExtras gles3MinorVersion(@EnumType(WGPUGles3MinorVersion.class) int value) {
        segment.set(LAYOUT$gles3MinorVersion, OFFSET$gles3MinorVersion, value);
        return this;
    }

    public @EnumType(WGPUGLFenceBehaviour.class) int glFenceBehaviour() {
        return segment.get(LAYOUT$glFenceBehaviour, OFFSET$glFenceBehaviour);
    }

    public WGPUInstanceExtras glFenceBehaviour(@EnumType(WGPUGLFenceBehaviour.class) int value) {
        segment.set(LAYOUT$glFenceBehaviour, OFFSET$glFenceBehaviour, value);
        return this;
    }

    public @NotNull WGPUStringView dxilPath() {
        return new WGPUStringView(segment.asSlice(OFFSET$dxilPath, LAYOUT$dxilPath));
    }

    public WGPUInstanceExtras dxilPath(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dxilPath, SIZE$dxilPath);
        return this;
    }

    public WGPUInstanceExtras dxilPath(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(dxilPath());
        return this;
    }

    public @NotNull WGPUStringView dxcPath() {
        return new WGPUStringView(segment.asSlice(OFFSET$dxcPath, LAYOUT$dxcPath));
    }

    public WGPUInstanceExtras dxcPath(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dxcPath, SIZE$dxcPath);
        return this;
    }

    public WGPUInstanceExtras dxcPath(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(dxcPath());
        return this;
    }

    public @EnumType(WGPUDxcMaxShaderModel.class) int dxcMaxShaderModel() {
        return segment.get(LAYOUT$dxcMaxShaderModel, OFFSET$dxcMaxShaderModel);
    }

    public WGPUInstanceExtras dxcMaxShaderModel(@EnumType(WGPUDxcMaxShaderModel.class) int value) {
        segment.set(LAYOUT$dxcMaxShaderModel, OFFSET$dxcMaxShaderModel, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUChainedStruct.LAYOUT.withName("chain"),
        ValueLayout.JAVA_LONG.withName("backends"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.JAVA_INT.withName("dx12ShaderCompiler"),
        ValueLayout.JAVA_INT.withName("gles3MinorVersion"),
        ValueLayout.JAVA_INT.withName("glFenceBehaviour"),
        WGPUStringView.LAYOUT.withName("dxilPath"),
        WGPUStringView.LAYOUT.withName("dxcPath"),
        ValueLayout.JAVA_INT.withName("dxcMaxShaderModel")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$chain = PathElement.groupElement("chain");
    public static final PathElement PATH$backends = PathElement.groupElement("backends");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$dx12ShaderCompiler = PathElement.groupElement("dx12ShaderCompiler");
    public static final PathElement PATH$gles3MinorVersion = PathElement.groupElement("gles3MinorVersion");
    public static final PathElement PATH$glFenceBehaviour = PathElement.groupElement("glFenceBehaviour");
    public static final PathElement PATH$dxilPath = PathElement.groupElement("dxilPath");
    public static final PathElement PATH$dxcPath = PathElement.groupElement("dxcPath");
    public static final PathElement PATH$dxcMaxShaderModel = PathElement.groupElement("dxcMaxShaderModel");

    public static final StructLayout LAYOUT$chain = (StructLayout) LAYOUT.select(PATH$chain);
    public static final OfLong LAYOUT$backends = (OfLong) LAYOUT.select(PATH$backends);
    public static final OfLong LAYOUT$flags = (OfLong) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$dx12ShaderCompiler = (OfInt) LAYOUT.select(PATH$dx12ShaderCompiler);
    public static final OfInt LAYOUT$gles3MinorVersion = (OfInt) LAYOUT.select(PATH$gles3MinorVersion);
    public static final OfInt LAYOUT$glFenceBehaviour = (OfInt) LAYOUT.select(PATH$glFenceBehaviour);
    public static final StructLayout LAYOUT$dxilPath = (StructLayout) LAYOUT.select(PATH$dxilPath);
    public static final StructLayout LAYOUT$dxcPath = (StructLayout) LAYOUT.select(PATH$dxcPath);
    public static final OfInt LAYOUT$dxcMaxShaderModel = (OfInt) LAYOUT.select(PATH$dxcMaxShaderModel);

    public static final long SIZE$chain = LAYOUT$chain.byteSize();
    public static final long SIZE$backends = LAYOUT$backends.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$dx12ShaderCompiler = LAYOUT$dx12ShaderCompiler.byteSize();
    public static final long SIZE$gles3MinorVersion = LAYOUT$gles3MinorVersion.byteSize();
    public static final long SIZE$glFenceBehaviour = LAYOUT$glFenceBehaviour.byteSize();
    public static final long SIZE$dxilPath = LAYOUT$dxilPath.byteSize();
    public static final long SIZE$dxcPath = LAYOUT$dxcPath.byteSize();
    public static final long SIZE$dxcMaxShaderModel = LAYOUT$dxcMaxShaderModel.byteSize();

    public static final long OFFSET$chain = LAYOUT.byteOffset(PATH$chain);
    public static final long OFFSET$backends = LAYOUT.byteOffset(PATH$backends);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dx12ShaderCompiler = LAYOUT.byteOffset(PATH$dx12ShaderCompiler);
    public static final long OFFSET$gles3MinorVersion = LAYOUT.byteOffset(PATH$gles3MinorVersion);
    public static final long OFFSET$glFenceBehaviour = LAYOUT.byteOffset(PATH$glFenceBehaviour);
    public static final long OFFSET$dxilPath = LAYOUT.byteOffset(PATH$dxilPath);
    public static final long OFFSET$dxcPath = LAYOUT.byteOffset(PATH$dxcPath);
    public static final long OFFSET$dxcMaxShaderModel = LAYOUT.byteOffset(PATH$dxcMaxShaderModel);
}

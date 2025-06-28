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

/// Represents a pointer to a {@code WGPURenderPipelineDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPURenderPipelineDescriptor {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     WGPUStringView label; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="label" target="#label"
///     WGPUPipelineLayout layout; // optional // @link substring="WGPUPipelineLayout" target="WGPUPipelineLayout" @link substring="layout" target="#layout"
///     WGPUVertexState vertex; // @link substring="WGPUVertexState" target="WGPUVertexState" @link substring="vertex" target="#vertex"
///     WGPUPrimitiveState primitive; // @link substring="WGPUPrimitiveState" target="WGPUPrimitiveState" @link substring="primitive" target="#primitive"
///     WGPUDepthStencilState const* depthStencil; // optional // @link substring="WGPUDepthStencilState" target="WGPUDepthStencilState" @link substring="depthStencil" target="#depthStencil"
///     WGPUMultisampleState multisample; // @link substring="WGPUMultisampleState" target="WGPUMultisampleState" @link substring="multisample" target="#multisample"
///     WGPUFragmentState const* fragment; // optional // @link substring="WGPUFragmentState" target="WGPUFragmentState" @link substring="fragment" target="#fragment"
/// } WGPURenderPipelineDescriptor;
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
public record WGPURenderPipelineDescriptor(@NotNull MemorySegment segment) implements IWGPURenderPipelineDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPURenderPipelineDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPURenderPipelineDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPURenderPipelineDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPURenderPipelineDescriptor, Iterable<WGPURenderPipelineDescriptor> {
        public long size() {
            return segment.byteSize() / WGPURenderPipelineDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPURenderPipelineDescriptor at(long index) {
            return new WGPURenderPipelineDescriptor(segment.asSlice(index * WGPURenderPipelineDescriptor.BYTES, WGPURenderPipelineDescriptor.BYTES));
        }

        public WGPURenderPipelineDescriptor.Ptr at(long index, @NotNull Consumer<@NotNull WGPURenderPipelineDescriptor> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPURenderPipelineDescriptor value) {
            MemorySegment s = segment.asSlice(index * WGPURenderPipelineDescriptor.BYTES, WGPURenderPipelineDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPURenderPipelineDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPURenderPipelineDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPURenderPipelineDescriptor.BYTES,
                (end - start) * WGPURenderPipelineDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPURenderPipelineDescriptor.BYTES));
        }

        public WGPURenderPipelineDescriptor[] toArray() {
            WGPURenderPipelineDescriptor[] ret = new WGPURenderPipelineDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPURenderPipelineDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPURenderPipelineDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPURenderPipelineDescriptor.BYTES;
            }

            @Override
            public WGPURenderPipelineDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPURenderPipelineDescriptor ret = new WGPURenderPipelineDescriptor(segment.asSlice(0, WGPURenderPipelineDescriptor.BYTES));
                segment = segment.asSlice(WGPURenderPipelineDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPURenderPipelineDescriptor allocate(Arena arena) {
        return new WGPURenderPipelineDescriptor(arena.allocate(LAYOUT));
    }

    public static WGPURenderPipelineDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPURenderPipelineDescriptor.Ptr(segment);
    }

    public static WGPURenderPipelineDescriptor clone(Arena arena, WGPURenderPipelineDescriptor src) {
        WGPURenderPipelineDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPURenderPipelineDescriptor nextInChain(@Nullable IWGPUChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUChainedStruct.BYTES);
        return new WGPUChainedStruct.Ptr(s);
    }

    public @Nullable WGPUChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUChainedStruct(s);
    }

    public @Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @NotNull WGPUStringView label() {
        return new WGPUStringView(segment.asSlice(OFFSET$label, LAYOUT$label));
    }

    public WGPURenderPipelineDescriptor label(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public WGPURenderPipelineDescriptor label(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(label());
        return this;
    }

    public @Nullable WGPUPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUPipelineLayout(s);
    }

    public WGPURenderPipelineDescriptor layout(@Nullable WGPUPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull WGPUVertexState vertex() {
        return new WGPUVertexState(segment.asSlice(OFFSET$vertex, LAYOUT$vertex));
    }

    public WGPURenderPipelineDescriptor vertex(@NotNull WGPUVertexState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertex, SIZE$vertex);
        return this;
    }

    public WGPURenderPipelineDescriptor vertex(Consumer<@NotNull WGPUVertexState> consumer) {
        consumer.accept(vertex());
        return this;
    }

    public @NotNull WGPUPrimitiveState primitive() {
        return new WGPUPrimitiveState(segment.asSlice(OFFSET$primitive, LAYOUT$primitive));
    }

    public WGPURenderPipelineDescriptor primitive(@NotNull WGPUPrimitiveState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$primitive, SIZE$primitive);
        return this;
    }

    public WGPURenderPipelineDescriptor primitive(Consumer<@NotNull WGPUPrimitiveState> consumer) {
        consumer.accept(primitive());
        return this;
    }

    public WGPURenderPipelineDescriptor depthStencil(@Nullable IWGPUDepthStencilState value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        depthStencilRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUDepthStencilState.Ptr depthStencil(int assumedCount) {
        MemorySegment s = depthStencilRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUDepthStencilState.BYTES);
        return new WGPUDepthStencilState.Ptr(s);
    }

    public @Nullable WGPUDepthStencilState depthStencil() {
        MemorySegment s = depthStencilRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUDepthStencilState(s);
    }

    public @Pointer(target=WGPUDepthStencilState.class) @NotNull MemorySegment depthStencilRaw() {
        return segment.get(LAYOUT$depthStencil, OFFSET$depthStencil);
    }

    public void depthStencilRaw(@Pointer(target=WGPUDepthStencilState.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$depthStencil, OFFSET$depthStencil, value);
    }

    public @NotNull WGPUMultisampleState multisample() {
        return new WGPUMultisampleState(segment.asSlice(OFFSET$multisample, LAYOUT$multisample));
    }

    public WGPURenderPipelineDescriptor multisample(@NotNull WGPUMultisampleState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$multisample, SIZE$multisample);
        return this;
    }

    public WGPURenderPipelineDescriptor multisample(Consumer<@NotNull WGPUMultisampleState> consumer) {
        consumer.accept(multisample());
        return this;
    }

    public WGPURenderPipelineDescriptor fragment(@Nullable IWGPUFragmentState value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        fragmentRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUFragmentState.Ptr fragment(int assumedCount) {
        MemorySegment s = fragmentRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUFragmentState.BYTES);
        return new WGPUFragmentState.Ptr(s);
    }

    public @Nullable WGPUFragmentState fragment() {
        MemorySegment s = fragmentRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUFragmentState(s);
    }

    public @Pointer(target=WGPUFragmentState.class) @NotNull MemorySegment fragmentRaw() {
        return segment.get(LAYOUT$fragment, OFFSET$fragment);
    }

    public void fragmentRaw(@Pointer(target=WGPUFragmentState.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$fragment, OFFSET$fragment, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        WGPUStringView.LAYOUT.withName("label"),
        ValueLayout.ADDRESS.withName("layout"),
        WGPUVertexState.LAYOUT.withName("vertex"),
        WGPUPrimitiveState.LAYOUT.withName("primitive"),
        ValueLayout.ADDRESS.withTargetLayout(WGPUDepthStencilState.LAYOUT).withName("depthStencil"),
        WGPUMultisampleState.LAYOUT.withName("multisample"),
        ValueLayout.ADDRESS.withTargetLayout(WGPUFragmentState.LAYOUT).withName("fragment")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$vertex = PathElement.groupElement("vertex");
    public static final PathElement PATH$primitive = PathElement.groupElement("primitive");
    public static final PathElement PATH$depthStencil = PathElement.groupElement("depthStencil");
    public static final PathElement PATH$multisample = PathElement.groupElement("multisample");
    public static final PathElement PATH$fragment = PathElement.groupElement("fragment");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final StructLayout LAYOUT$vertex = (StructLayout) LAYOUT.select(PATH$vertex);
    public static final StructLayout LAYOUT$primitive = (StructLayout) LAYOUT.select(PATH$primitive);
    public static final AddressLayout LAYOUT$depthStencil = (AddressLayout) LAYOUT.select(PATH$depthStencil);
    public static final StructLayout LAYOUT$multisample = (StructLayout) LAYOUT.select(PATH$multisample);
    public static final AddressLayout LAYOUT$fragment = (AddressLayout) LAYOUT.select(PATH$fragment);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$vertex = LAYOUT$vertex.byteSize();
    public static final long SIZE$primitive = LAYOUT$primitive.byteSize();
    public static final long SIZE$depthStencil = LAYOUT$depthStencil.byteSize();
    public static final long SIZE$multisample = LAYOUT$multisample.byteSize();
    public static final long SIZE$fragment = LAYOUT$fragment.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$vertex = LAYOUT.byteOffset(PATH$vertex);
    public static final long OFFSET$primitive = LAYOUT.byteOffset(PATH$primitive);
    public static final long OFFSET$depthStencil = LAYOUT.byteOffset(PATH$depthStencil);
    public static final long OFFSET$multisample = LAYOUT.byteOffset(PATH$multisample);
    public static final long OFFSET$fragment = LAYOUT.byteOffset(PATH$fragment);
}

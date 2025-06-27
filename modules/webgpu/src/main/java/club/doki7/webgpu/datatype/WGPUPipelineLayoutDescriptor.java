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

/// Represents a pointer to a {@code WGPUPipelineLayoutDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUPipelineLayoutDescriptor {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     WGPUStringView label; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="label" target="#label"
///     WGPUBindGroupLayout const* bindGroupLayouts; // @link substring="WGPUBindGroupLayout" target="WGPUBindGroupLayout" @link substring="bindGroupLayouts" target="#bindGroupLayouts"
/// } WGPUPipelineLayoutDescriptor;
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
public record WGPUPipelineLayoutDescriptor(@NotNull MemorySegment segment) implements IWGPUPipelineLayoutDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUPipelineLayoutDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUPipelineLayoutDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUPipelineLayoutDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUPipelineLayoutDescriptor, Iterable<WGPUPipelineLayoutDescriptor> {
        public long size() {
            return segment.byteSize() / WGPUPipelineLayoutDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUPipelineLayoutDescriptor at(long index) {
            return new WGPUPipelineLayoutDescriptor(segment.asSlice(index * WGPUPipelineLayoutDescriptor.BYTES, WGPUPipelineLayoutDescriptor.BYTES));
        }

        public WGPUPipelineLayoutDescriptor.Ptr at(long index, @NotNull Consumer<@NotNull WGPUPipelineLayoutDescriptor> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUPipelineLayoutDescriptor value) {
            MemorySegment s = segment.asSlice(index * WGPUPipelineLayoutDescriptor.BYTES, WGPUPipelineLayoutDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUPipelineLayoutDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUPipelineLayoutDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUPipelineLayoutDescriptor.BYTES,
                (end - start) * WGPUPipelineLayoutDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUPipelineLayoutDescriptor.BYTES));
        }

        public WGPUPipelineLayoutDescriptor[] toArray() {
            WGPUPipelineLayoutDescriptor[] ret = new WGPUPipelineLayoutDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUPipelineLayoutDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUPipelineLayoutDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUPipelineLayoutDescriptor.BYTES;
            }

            @Override
            public WGPUPipelineLayoutDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUPipelineLayoutDescriptor ret = new WGPUPipelineLayoutDescriptor(segment.asSlice(0, WGPUPipelineLayoutDescriptor.BYTES));
                segment = segment.asSlice(WGPUPipelineLayoutDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUPipelineLayoutDescriptor allocate(Arena arena) {
        return new WGPUPipelineLayoutDescriptor(arena.allocate(LAYOUT));
    }

    public static WGPUPipelineLayoutDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUPipelineLayoutDescriptor.Ptr(segment);
    }

    public static WGPUPipelineLayoutDescriptor clone(Arena arena, WGPUPipelineLayoutDescriptor src) {
        WGPUPipelineLayoutDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUPipelineLayoutDescriptor nextInChain(@Nullable IWGPUChainedStruct value) {
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

    public WGPUPipelineLayoutDescriptor label(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public WGPUPipelineLayoutDescriptor label(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(label());
        return this;
    }

    /// Note: the returned {@link WGPUBindGroupLayout.Ptr} does not have correct {@link WGPUBindGroupLayout.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link WGPUBindGroupLayout.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable WGPUBindGroupLayout.Ptr bindGroupLayouts() {
        MemorySegment s = bindGroupLayoutsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUBindGroupLayout.Ptr(s);
    }

    public WGPUPipelineLayoutDescriptor bindGroupLayouts(@Nullable WGPUBindGroupLayout.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        bindGroupLayoutsRaw(s);
        return this;
    }

    public @Pointer(target=WGPUBindGroupLayout.class) @NotNull MemorySegment bindGroupLayoutsRaw() {
        return segment.get(LAYOUT$bindGroupLayouts, OFFSET$bindGroupLayouts);
    }

    public void bindGroupLayoutsRaw(@Pointer(target=WGPUBindGroupLayout.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$bindGroupLayouts, OFFSET$bindGroupLayouts, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        WGPUStringView.LAYOUT.withName("label"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("bindGroupLayouts")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$bindGroupLayouts = PathElement.groupElement("bindGroupLayouts");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final AddressLayout LAYOUT$bindGroupLayouts = (AddressLayout) LAYOUT.select(PATH$bindGroupLayouts);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$bindGroupLayouts = LAYOUT$bindGroupLayouts.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$bindGroupLayouts = LAYOUT.byteOffset(PATH$bindGroupLayouts);
}

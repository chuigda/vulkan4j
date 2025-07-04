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
import club.doki7.webgpu.WGPUFunctionTypes.*;

/// Represents a pointer to a {@code WGPUBindGroupLayoutDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUBindGroupLayoutDescriptor {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     WGPUStringView label; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="label" target="#label"
///     size_t entryCount; // @link substring="entryCount" target="#entryCount"
///     WGPUBindGroupLayoutEntry const* entries; // @link substring="WGPUBindGroupLayoutEntry" target="WGPUBindGroupLayoutEntry" @link substring="entries" target="#entries"
/// } WGPUBindGroupLayoutDescriptor;
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
public record WGPUBindGroupLayoutDescriptor(@NotNull MemorySegment segment) implements IWGPUBindGroupLayoutDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUBindGroupLayoutDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUBindGroupLayoutDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUBindGroupLayoutDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUBindGroupLayoutDescriptor, Iterable<WGPUBindGroupLayoutDescriptor> {
        public long size() {
            return segment.byteSize() / WGPUBindGroupLayoutDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUBindGroupLayoutDescriptor at(long index) {
            return new WGPUBindGroupLayoutDescriptor(segment.asSlice(index * WGPUBindGroupLayoutDescriptor.BYTES, WGPUBindGroupLayoutDescriptor.BYTES));
        }

        public WGPUBindGroupLayoutDescriptor.Ptr at(long index, @NotNull Consumer<@NotNull WGPUBindGroupLayoutDescriptor> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUBindGroupLayoutDescriptor value) {
            MemorySegment s = segment.asSlice(index * WGPUBindGroupLayoutDescriptor.BYTES, WGPUBindGroupLayoutDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUBindGroupLayoutDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUBindGroupLayoutDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUBindGroupLayoutDescriptor.BYTES,
                (end - start) * WGPUBindGroupLayoutDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUBindGroupLayoutDescriptor.BYTES));
        }

        public WGPUBindGroupLayoutDescriptor[] toArray() {
            WGPUBindGroupLayoutDescriptor[] ret = new WGPUBindGroupLayoutDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUBindGroupLayoutDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUBindGroupLayoutDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUBindGroupLayoutDescriptor.BYTES;
            }

            @Override
            public WGPUBindGroupLayoutDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUBindGroupLayoutDescriptor ret = new WGPUBindGroupLayoutDescriptor(segment.asSlice(0, WGPUBindGroupLayoutDescriptor.BYTES));
                segment = segment.asSlice(WGPUBindGroupLayoutDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUBindGroupLayoutDescriptor allocate(Arena arena) {
        return new WGPUBindGroupLayoutDescriptor(arena.allocate(LAYOUT));
    }

    public static WGPUBindGroupLayoutDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUBindGroupLayoutDescriptor.Ptr(segment);
    }

    public static WGPUBindGroupLayoutDescriptor clone(Arena arena, WGPUBindGroupLayoutDescriptor src) {
        WGPUBindGroupLayoutDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUBindGroupLayoutDescriptor nextInChain(@Nullable IWGPUChainedStruct value) {
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

    public WGPUBindGroupLayoutDescriptor label(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public WGPUBindGroupLayoutDescriptor label(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(label());
        return this;
    }

    public @Unsigned long entryCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$entryCount);
    }

    public WGPUBindGroupLayoutDescriptor entryCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$entryCount, value);
        return this;
    }

    public WGPUBindGroupLayoutDescriptor entries(@Nullable IWGPUBindGroupLayoutEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        entriesRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUBindGroupLayoutEntry.Ptr entries(int assumedCount) {
        MemorySegment s = entriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUBindGroupLayoutEntry.BYTES);
        return new WGPUBindGroupLayoutEntry.Ptr(s);
    }

    public @Nullable WGPUBindGroupLayoutEntry entries() {
        MemorySegment s = entriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUBindGroupLayoutEntry(s);
    }

    public @Pointer(target=WGPUBindGroupLayoutEntry.class) @NotNull MemorySegment entriesRaw() {
        return segment.get(LAYOUT$entries, OFFSET$entries);
    }

    public void entriesRaw(@Pointer(target=WGPUBindGroupLayoutEntry.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$entries, OFFSET$entries, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        WGPUStringView.LAYOUT.withName("label"),
        NativeLayout.C_SIZE_T.withName("entryCount"),
        ValueLayout.ADDRESS.withTargetLayout(WGPUBindGroupLayoutEntry.LAYOUT).withName("entries")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$entryCount = PathElement.groupElement("entryCount");
    public static final PathElement PATH$entries = PathElement.groupElement("entries");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final AddressLayout LAYOUT$entries = (AddressLayout) LAYOUT.select(PATH$entries);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$entryCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$entries = LAYOUT$entries.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$entryCount = LAYOUT.byteOffset(PATH$entryCount);
    public static final long OFFSET$entries = LAYOUT.byteOffset(PATH$entries);
}

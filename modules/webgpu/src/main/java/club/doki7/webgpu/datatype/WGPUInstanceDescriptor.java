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

/// Represents a pointer to a {@code InstanceDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct InstanceDescriptor {
///     InstanceCapabilities features; // @link substring="WGPUInstanceCapabilities" target="WGPUInstanceCapabilities" @link substring="features" target="#features"
/// } InstanceDescriptor;
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
public record WGPUInstanceDescriptor(@NotNull MemorySegment segment) implements IWGPUInstanceDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUInstanceDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUInstanceDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUInstanceDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUInstanceDescriptor, Iterable<WGPUInstanceDescriptor> {
        public long size() {
            return segment.byteSize() / WGPUInstanceDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUInstanceDescriptor at(long index) {
            return new WGPUInstanceDescriptor(segment.asSlice(index * WGPUInstanceDescriptor.BYTES, WGPUInstanceDescriptor.BYTES));
        }

        public WGPUInstanceDescriptor.Ptr at(long index, @NotNull Consumer<@NotNull WGPUInstanceDescriptor> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUInstanceDescriptor value) {
            MemorySegment s = segment.asSlice(index * WGPUInstanceDescriptor.BYTES, WGPUInstanceDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUInstanceDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUInstanceDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUInstanceDescriptor.BYTES,
                (end - start) * WGPUInstanceDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUInstanceDescriptor.BYTES));
        }

        public WGPUInstanceDescriptor[] toArray() {
            WGPUInstanceDescriptor[] ret = new WGPUInstanceDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUInstanceDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUInstanceDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUInstanceDescriptor.BYTES;
            }

            @Override
            public WGPUInstanceDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUInstanceDescriptor ret = new WGPUInstanceDescriptor(segment.asSlice(0, WGPUInstanceDescriptor.BYTES));
                segment = segment.asSlice(WGPUInstanceDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUInstanceDescriptor allocate(Arena arena) {
        return new WGPUInstanceDescriptor(arena.allocate(LAYOUT));
    }

    public static WGPUInstanceDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUInstanceDescriptor.Ptr(segment);
    }

    public static WGPUInstanceDescriptor clone(Arena arena, WGPUInstanceDescriptor src) {
        WGPUInstanceDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUInstanceCapabilities features() {
        return new WGPUInstanceCapabilities(segment.asSlice(OFFSET$features, LAYOUT$features));
    }

    public WGPUInstanceDescriptor features(@NotNull WGPUInstanceCapabilities value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$features, SIZE$features);
        return this;
    }

    public WGPUInstanceDescriptor features(Consumer<@NotNull WGPUInstanceCapabilities> consumer) {
        consumer.accept(features());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUInstanceCapabilities.LAYOUT.withName("features")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$features = PathElement.groupElement("features");

    public static final StructLayout LAYOUT$features = (StructLayout) LAYOUT.select(PATH$features);

    public static final long SIZE$features = LAYOUT$features.byteSize();

    public static final long OFFSET$features = LAYOUT.byteOffset(PATH$features);
}

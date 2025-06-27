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

/// Represents a pointer to a {@code WGPUSurfaceSourceWindowsHwnd} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUSurfaceSourceWindowsHwnd {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     void* hinstance; // @link substring="hinstance" target="#hinstance"
///     void* hwnd; // @link substring="hwnd" target="#hwnd"
/// } WGPUSurfaceSourceWindowsHwnd;
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
public record WGPUSurfaceSourceWindowsHwnd(@NotNull MemorySegment segment) implements IWGPUSurfaceSourceWindowsHwnd {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUSurfaceSourceWindowsHwnd}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUSurfaceSourceWindowsHwnd to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUSurfaceSourceWindowsHwnd.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUSurfaceSourceWindowsHwnd, Iterable<WGPUSurfaceSourceWindowsHwnd> {
        public long size() {
            return segment.byteSize() / WGPUSurfaceSourceWindowsHwnd.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUSurfaceSourceWindowsHwnd at(long index) {
            return new WGPUSurfaceSourceWindowsHwnd(segment.asSlice(index * WGPUSurfaceSourceWindowsHwnd.BYTES, WGPUSurfaceSourceWindowsHwnd.BYTES));
        }

        public WGPUSurfaceSourceWindowsHwnd.Ptr at(long index, @NotNull Consumer<@NotNull WGPUSurfaceSourceWindowsHwnd> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUSurfaceSourceWindowsHwnd value) {
            MemorySegment s = segment.asSlice(index * WGPUSurfaceSourceWindowsHwnd.BYTES, WGPUSurfaceSourceWindowsHwnd.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUSurfaceSourceWindowsHwnd.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUSurfaceSourceWindowsHwnd.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUSurfaceSourceWindowsHwnd.BYTES,
                (end - start) * WGPUSurfaceSourceWindowsHwnd.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUSurfaceSourceWindowsHwnd.BYTES));
        }

        public WGPUSurfaceSourceWindowsHwnd[] toArray() {
            WGPUSurfaceSourceWindowsHwnd[] ret = new WGPUSurfaceSourceWindowsHwnd[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUSurfaceSourceWindowsHwnd> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUSurfaceSourceWindowsHwnd> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUSurfaceSourceWindowsHwnd.BYTES;
            }

            @Override
            public WGPUSurfaceSourceWindowsHwnd next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUSurfaceSourceWindowsHwnd ret = new WGPUSurfaceSourceWindowsHwnd(segment.asSlice(0, WGPUSurfaceSourceWindowsHwnd.BYTES));
                segment = segment.asSlice(WGPUSurfaceSourceWindowsHwnd.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUSurfaceSourceWindowsHwnd allocate(Arena arena) {
        return new WGPUSurfaceSourceWindowsHwnd(arena.allocate(LAYOUT));
    }

    public static WGPUSurfaceSourceWindowsHwnd.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUSurfaceSourceWindowsHwnd.Ptr(segment);
    }

    public static WGPUSurfaceSourceWindowsHwnd clone(Arena arena, WGPUSurfaceSourceWindowsHwnd src) {
        WGPUSurfaceSourceWindowsHwnd ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUSurfaceSourceWindowsHwnd nextInChain(@Nullable IWGPUChainedStruct value) {
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

    public @Pointer(comment="void*") @NotNull MemorySegment hinstance() {
        return segment.get(LAYOUT$hinstance, OFFSET$hinstance);
    }

    public WGPUSurfaceSourceWindowsHwnd hinstance(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$hinstance, OFFSET$hinstance, value);
        return this;
    }

    public WGPUSurfaceSourceWindowsHwnd hinstance(@Nullable IPointer pointer) {
        hinstance(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment hwnd() {
        return segment.get(LAYOUT$hwnd, OFFSET$hwnd);
    }

    public WGPUSurfaceSourceWindowsHwnd hwnd(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$hwnd, OFFSET$hwnd, value);
        return this;
    }

    public WGPUSurfaceSourceWindowsHwnd hwnd(@Nullable IPointer pointer) {
        hwnd(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.ADDRESS.withName("hinstance"),
        ValueLayout.ADDRESS.withName("hwnd")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$hinstance = PathElement.groupElement("hinstance");
    public static final PathElement PATH$hwnd = PathElement.groupElement("hwnd");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final AddressLayout LAYOUT$hinstance = (AddressLayout) LAYOUT.select(PATH$hinstance);
    public static final AddressLayout LAYOUT$hwnd = (AddressLayout) LAYOUT.select(PATH$hwnd);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$hinstance = LAYOUT$hinstance.byteSize();
    public static final long SIZE$hwnd = LAYOUT$hwnd.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$hinstance = LAYOUT.byteOffset(PATH$hinstance);
    public static final long OFFSET$hwnd = LAYOUT.byteOffset(PATH$hwnd);
}

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
import static club.doki7.webgpu.WebGPUConstants.*;

/// Represents a pointer to a {@code SurfaceColorManagement} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SurfaceColorManagement {
///     PredefinedColorSpace colorSpace; // @link substring="PredefinedColorSpace" target="PredefinedColorSpace" @link substring="colorSpace" target="#colorSpace"
///     ToneMappingMode toneMappingMode; // @link substring="ToneMappingMode" target="ToneMappingMode" @link substring="toneMappingMode" target="#toneMappingMode"
/// } SurfaceColorManagement;
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
public record SurfaceColorManagement(@NotNull MemorySegment segment) implements ISurfaceColorManagement {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SurfaceColorManagement}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISurfaceColorManagement to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SurfaceColorManagement.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISurfaceColorManagement, Iterable<SurfaceColorManagement> {
        public long size() {
            return segment.byteSize() / SurfaceColorManagement.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SurfaceColorManagement at(long index) {
            return new SurfaceColorManagement(segment.asSlice(index * SurfaceColorManagement.BYTES, SurfaceColorManagement.BYTES));
        }

        public void write(long index, @NotNull SurfaceColorManagement value) {
            MemorySegment s = segment.asSlice(index * SurfaceColorManagement.BYTES, SurfaceColorManagement.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SurfaceColorManagement.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SurfaceColorManagement.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SurfaceColorManagement.BYTES,
                (end - start) * SurfaceColorManagement.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SurfaceColorManagement.BYTES));
        }

        public SurfaceColorManagement[] toArray() {
            SurfaceColorManagement[] ret = new SurfaceColorManagement[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SurfaceColorManagement> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SurfaceColorManagement> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SurfaceColorManagement.BYTES;
            }

            @Override
            public SurfaceColorManagement next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SurfaceColorManagement ret = new SurfaceColorManagement(segment.asSlice(0, SurfaceColorManagement.BYTES));
                segment = segment.asSlice(SurfaceColorManagement.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SurfaceColorManagement allocate(Arena arena) {
        return new SurfaceColorManagement(arena.allocate(LAYOUT));
    }

    public static SurfaceColorManagement.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SurfaceColorManagement.Ptr(segment);
    }

    public static SurfaceColorManagement clone(Arena arena, SurfaceColorManagement src) {
        SurfaceColorManagement ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(PredefinedColorSpace.class) int colorSpace() {
        return segment.get(LAYOUT$colorSpace, OFFSET$colorSpace);
    }

    public SurfaceColorManagement colorSpace(@EnumType(PredefinedColorSpace.class) int value) {
        segment.set(LAYOUT$colorSpace, OFFSET$colorSpace, value);
        return this;
    }

    public @EnumType(ToneMappingMode.class) int toneMappingMode() {
        return segment.get(LAYOUT$toneMappingMode, OFFSET$toneMappingMode);
    }

    public SurfaceColorManagement toneMappingMode(@EnumType(ToneMappingMode.class) int value) {
        segment.set(LAYOUT$toneMappingMode, OFFSET$toneMappingMode, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("colorSpace"),
        ValueLayout.JAVA_INT.withName("toneMappingMode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$colorSpace = PathElement.groupElement("colorSpace");
    public static final PathElement PATH$toneMappingMode = PathElement.groupElement("toneMappingMode");

    public static final OfInt LAYOUT$colorSpace = (OfInt) LAYOUT.select(PATH$colorSpace);
    public static final OfInt LAYOUT$toneMappingMode = (OfInt) LAYOUT.select(PATH$toneMappingMode);

    public static final long SIZE$colorSpace = LAYOUT$colorSpace.byteSize();
    public static final long SIZE$toneMappingMode = LAYOUT$toneMappingMode.byteSize();

    public static final long OFFSET$colorSpace = LAYOUT.byteOffset(PATH$colorSpace);
    public static final long OFFSET$toneMappingMode = LAYOUT.byteOffset(PATH$toneMappingMode);
}

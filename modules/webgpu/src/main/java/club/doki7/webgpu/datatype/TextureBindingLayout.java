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

/// Represents a pointer to a {@code TextureBindingLayout} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct TextureBindingLayout {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     TextureSampleType sampleType; // @link substring="TextureSampleType" target="TextureSampleType" @link substring="sampleType" target="#sampleType"
///     TextureViewDimension viewDimension; // @link substring="TextureViewDimension" target="TextureViewDimension" @link substring="viewDimension" target="#viewDimension"
///     bool multisampled; // @link substring="multisampled" target="#multisampled"
/// } TextureBindingLayout;
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
public record TextureBindingLayout(@NotNull MemorySegment segment) implements ITextureBindingLayout {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link TextureBindingLayout}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ITextureBindingLayout to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code TextureBindingLayout.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ITextureBindingLayout, Iterable<TextureBindingLayout> {
        public long size() {
            return segment.byteSize() / TextureBindingLayout.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull TextureBindingLayout at(long index) {
            return new TextureBindingLayout(segment.asSlice(index * TextureBindingLayout.BYTES, TextureBindingLayout.BYTES));
        }

        public void write(long index, @NotNull TextureBindingLayout value) {
            MemorySegment s = segment.asSlice(index * TextureBindingLayout.BYTES, TextureBindingLayout.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * TextureBindingLayout.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * TextureBindingLayout.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * TextureBindingLayout.BYTES,
                (end - start) * TextureBindingLayout.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * TextureBindingLayout.BYTES));
        }

        public TextureBindingLayout[] toArray() {
            TextureBindingLayout[] ret = new TextureBindingLayout[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<TextureBindingLayout> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<TextureBindingLayout> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= TextureBindingLayout.BYTES;
            }

            @Override
            public TextureBindingLayout next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                TextureBindingLayout ret = new TextureBindingLayout(segment.asSlice(0, TextureBindingLayout.BYTES));
                segment = segment.asSlice(TextureBindingLayout.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static TextureBindingLayout allocate(Arena arena) {
        return new TextureBindingLayout(arena.allocate(LAYOUT));
    }

    public static TextureBindingLayout.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new TextureBindingLayout.Ptr(segment);
    }

    public static TextureBindingLayout clone(Arena arena, TextureBindingLayout src) {
        TextureBindingLayout ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public TextureBindingLayout nextInChain(@Nullable IChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable ChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * ChainedStruct.BYTES);
        return new ChainedStruct.Ptr(s);
    }

    public @Nullable ChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ChainedStruct(s);
    }

    public @Pointer(target=ChainedStruct.class) MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=ChainedStruct.class) MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @EnumType(TextureSampleType.class) int sampleType() {
        return segment.get(LAYOUT$sampleType, OFFSET$sampleType);
    }

    public TextureBindingLayout sampleType(@EnumType(TextureSampleType.class) int value) {
        segment.set(LAYOUT$sampleType, OFFSET$sampleType, value);
        return this;
    }

    public @EnumType(TextureViewDimension.class) int viewDimension() {
        return segment.get(LAYOUT$viewDimension, OFFSET$viewDimension);
    }

    public TextureBindingLayout viewDimension(@EnumType(TextureViewDimension.class) int value) {
        segment.set(LAYOUT$viewDimension, OFFSET$viewDimension, value);
        return this;
    }

    public @NativeType("boolean") boolean multisampled() {
        return segment.get(LAYOUT$multisampled, OFFSET$multisampled);
    }

    public TextureBindingLayout multisampled(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$multisampled, OFFSET$multisampled, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("sampleType"),
        ValueLayout.JAVA_INT.withName("viewDimension"),
        ValueLayout.JAVA_BOOLEAN.withName("multisampled")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$sampleType = PathElement.groupElement("sampleType");
    public static final PathElement PATH$viewDimension = PathElement.groupElement("viewDimension");
    public static final PathElement PATH$multisampled = PathElement.groupElement("multisampled");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$sampleType = (OfInt) LAYOUT.select(PATH$sampleType);
    public static final OfInt LAYOUT$viewDimension = (OfInt) LAYOUT.select(PATH$viewDimension);
    public static final OfBoolean LAYOUT$multisampled = (OfBoolean) LAYOUT.select(PATH$multisampled);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$sampleType = LAYOUT$sampleType.byteSize();
    public static final long SIZE$viewDimension = LAYOUT$viewDimension.byteSize();
    public static final long SIZE$multisampled = LAYOUT$multisampled.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$sampleType = LAYOUT.byteOffset(PATH$sampleType);
    public static final long OFFSET$viewDimension = LAYOUT.byteOffset(PATH$viewDimension);
    public static final long OFFSET$multisampled = LAYOUT.byteOffset(PATH$multisampled);
}

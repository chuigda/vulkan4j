package club.doki7.shaderc.datatype;

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
import club.doki7.shaderc.handle.*;
import club.doki7.shaderc.enumtype.*;

/// Represents a pointer to a {@code shaderc_include_result} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct shaderc_include_result {
///     char const* sourceName; // @link substring="sourceName" target="#sourceName"
///     size_t sourceNameLength; // @link substring="sourceNameLength" target="#sourceNameLength"
///     char const* content; // @link substring="content" target="#content"
///     size_t contentLength; // @link substring="contentLength" target="#contentLength"
///     void* userData; // @link substring="userData" target="#userData"
/// } shaderc_include_result;
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
public record ShadercIncludeResult(@NotNull MemorySegment segment) implements IShadercIncludeResult {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link ShadercIncludeResult}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IShadercIncludeResult to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code ShadercIncludeResult.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IShadercIncludeResult, Iterable<ShadercIncludeResult> {
        public long size() {
            return segment.byteSize() / ShadercIncludeResult.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull ShadercIncludeResult at(long index) {
            return new ShadercIncludeResult(segment.asSlice(index * ShadercIncludeResult.BYTES, ShadercIncludeResult.BYTES));
        }

        public ShadercIncludeResult.Ptr at(long index, @NotNull Consumer<@NotNull ShadercIncludeResult> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull ShadercIncludeResult value) {
            MemorySegment s = segment.asSlice(index * ShadercIncludeResult.BYTES, ShadercIncludeResult.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * ShadercIncludeResult.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * ShadercIncludeResult.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * ShadercIncludeResult.BYTES,
                (end - start) * ShadercIncludeResult.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * ShadercIncludeResult.BYTES));
        }

        public ShadercIncludeResult[] toArray() {
            ShadercIncludeResult[] ret = new ShadercIncludeResult[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<ShadercIncludeResult> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<ShadercIncludeResult> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= ShadercIncludeResult.BYTES;
            }

            @Override
            public ShadercIncludeResult next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ShadercIncludeResult ret = new ShadercIncludeResult(segment.asSlice(0, ShadercIncludeResult.BYTES));
                segment = segment.asSlice(ShadercIncludeResult.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static ShadercIncludeResult allocate(Arena arena) {
        return new ShadercIncludeResult(arena.allocate(LAYOUT));
    }

    public static ShadercIncludeResult.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new ShadercIncludeResult.Ptr(segment);
    }

    public static ShadercIncludeResult clone(Arena arena, ShadercIncludeResult src) {
        ShadercIncludeResult ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr sourceName() {
        MemorySegment s = sourceNameRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public ShadercIncludeResult sourceName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        sourceNameRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") @NotNull MemorySegment sourceNameRaw() {
        return segment.get(LAYOUT$sourceName, OFFSET$sourceName);
    }

    public void sourceNameRaw(@Pointer(comment="int8_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$sourceName, OFFSET$sourceName, value);
    }

    public @Unsigned long sourceNameLength() {
        return NativeLayout.readCSizeT(segment, OFFSET$sourceNameLength);
    }

    public ShadercIncludeResult sourceNameLength(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$sourceNameLength, value);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr content() {
        MemorySegment s = contentRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public ShadercIncludeResult content(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        contentRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") @NotNull MemorySegment contentRaw() {
        return segment.get(LAYOUT$content, OFFSET$content);
    }

    public void contentRaw(@Pointer(comment="int8_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$content, OFFSET$content, value);
    }

    public @Unsigned long contentLength() {
        return NativeLayout.readCSizeT(segment, OFFSET$contentLength);
    }

    public ShadercIncludeResult contentLength(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$contentLength, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment userData() {
        return segment.get(LAYOUT$userData, OFFSET$userData);
    }

    public ShadercIncludeResult userData(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$userData, OFFSET$userData, value);
        return this;
    }

    public ShadercIncludeResult userData(@Nullable IPointer pointer) {
        userData(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("sourceName"),
        NativeLayout.C_SIZE_T.withName("sourceNameLength"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("content"),
        NativeLayout.C_SIZE_T.withName("contentLength"),
        ValueLayout.ADDRESS.withName("userData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sourceName = PathElement.groupElement("sourceName");
    public static final PathElement PATH$sourceNameLength = PathElement.groupElement("sourceNameLength");
    public static final PathElement PATH$content = PathElement.groupElement("content");
    public static final PathElement PATH$contentLength = PathElement.groupElement("contentLength");
    public static final PathElement PATH$userData = PathElement.groupElement("userData");

    public static final AddressLayout LAYOUT$sourceName = (AddressLayout) LAYOUT.select(PATH$sourceName);
    public static final AddressLayout LAYOUT$content = (AddressLayout) LAYOUT.select(PATH$content);
    public static final AddressLayout LAYOUT$userData = (AddressLayout) LAYOUT.select(PATH$userData);

    public static final long SIZE$sourceName = LAYOUT$sourceName.byteSize();
    public static final long SIZE$sourceNameLength = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$content = LAYOUT$content.byteSize();
    public static final long SIZE$contentLength = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$userData = LAYOUT$userData.byteSize();

    public static final long OFFSET$sourceName = LAYOUT.byteOffset(PATH$sourceName);
    public static final long OFFSET$sourceNameLength = LAYOUT.byteOffset(PATH$sourceNameLength);
    public static final long OFFSET$content = LAYOUT.byteOffset(PATH$content);
    public static final long OFFSET$contentLength = LAYOUT.byteOffset(PATH$contentLength);
    public static final long OFFSET$userData = LAYOUT.byteOffset(PATH$userData);
}

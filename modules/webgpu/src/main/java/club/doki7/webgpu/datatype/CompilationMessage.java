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

/// Represents a pointer to a {@code CompilationMessage} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct CompilationMessage {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     StringView message; // @link substring="StringView" target="StringView" @link substring="message" target="#message"
///     CompilationMessageType type; // @link substring="CompilationMessageType" target="CompilationMessageType" @link substring="type" target="#type"
///     uint64_t lineNum; // @link substring="lineNum" target="#lineNum"
///     uint64_t linePos; // @link substring="linePos" target="#linePos"
///     uint64_t offset; // @link substring="offset" target="#offset"
///     uint64_t length; // @link substring="length" target="#length"
/// } CompilationMessage;
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
public record CompilationMessage(@NotNull MemorySegment segment) implements ICompilationMessage {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link CompilationMessage}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ICompilationMessage to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code CompilationMessage.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ICompilationMessage, Iterable<CompilationMessage> {
        public long size() {
            return segment.byteSize() / CompilationMessage.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull CompilationMessage at(long index) {
            return new CompilationMessage(segment.asSlice(index * CompilationMessage.BYTES, CompilationMessage.BYTES));
        }

        public void write(long index, @NotNull CompilationMessage value) {
            MemorySegment s = segment.asSlice(index * CompilationMessage.BYTES, CompilationMessage.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * CompilationMessage.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * CompilationMessage.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * CompilationMessage.BYTES,
                (end - start) * CompilationMessage.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * CompilationMessage.BYTES));
        }

        public CompilationMessage[] toArray() {
            CompilationMessage[] ret = new CompilationMessage[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<CompilationMessage> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<CompilationMessage> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= CompilationMessage.BYTES;
            }

            @Override
            public CompilationMessage next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                CompilationMessage ret = new CompilationMessage(segment.asSlice(0, CompilationMessage.BYTES));
                segment = segment.asSlice(CompilationMessage.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static CompilationMessage allocate(Arena arena) {
        return new CompilationMessage(arena.allocate(LAYOUT));
    }

    public static CompilationMessage.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new CompilationMessage.Ptr(segment);
    }

    public static CompilationMessage clone(Arena arena, CompilationMessage src) {
        CompilationMessage ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public CompilationMessage nextInChain(@Nullable IChainedStruct value) {
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

    public @NotNull StringView message() {
        return new StringView(segment.asSlice(OFFSET$message, LAYOUT$message));
    }

    public CompilationMessage message(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$message, SIZE$message);
        return this;
    }

    public CompilationMessage message(Consumer<@NotNull StringView> consumer) {
        consumer.accept(message());
        return this;
    }

    public @EnumType(CompilationMessageType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public CompilationMessage type(@EnumType(CompilationMessageType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Unsigned long lineNum() {
        return segment.get(LAYOUT$lineNum, OFFSET$lineNum);
    }

    public CompilationMessage lineNum(@Unsigned long value) {
        segment.set(LAYOUT$lineNum, OFFSET$lineNum, value);
        return this;
    }

    public @Unsigned long linePos() {
        return segment.get(LAYOUT$linePos, OFFSET$linePos);
    }

    public CompilationMessage linePos(@Unsigned long value) {
        segment.set(LAYOUT$linePos, OFFSET$linePos, value);
        return this;
    }

    public @Unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public CompilationMessage offset(@Unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public @Unsigned long length() {
        return segment.get(LAYOUT$length, OFFSET$length);
    }

    public CompilationMessage length(@Unsigned long value) {
        segment.set(LAYOUT$length, OFFSET$length, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        StringView.LAYOUT.withName("message"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("lineNum"),
        ValueLayout.JAVA_LONG.withName("linePos"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("length")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$message = PathElement.groupElement("message");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$lineNum = PathElement.groupElement("lineNum");
    public static final PathElement PATH$linePos = PathElement.groupElement("linePos");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$length = PathElement.groupElement("length");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$message = (StructLayout) LAYOUT.select(PATH$message);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$lineNum = (OfLong) LAYOUT.select(PATH$lineNum);
    public static final OfLong LAYOUT$linePos = (OfLong) LAYOUT.select(PATH$linePos);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$length = (OfLong) LAYOUT.select(PATH$length);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$message = LAYOUT$message.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$lineNum = LAYOUT$lineNum.byteSize();
    public static final long SIZE$linePos = LAYOUT$linePos.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$length = LAYOUT$length.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$message = LAYOUT.byteOffset(PATH$message);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$lineNum = LAYOUT.byteOffset(PATH$lineNum);
    public static final long OFFSET$linePos = LAYOUT.byteOffset(PATH$linePos);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$length = LAYOUT.byteOffset(PATH$length);
}

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

/// Represents a pointer to a {@code CompilationInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct CompilationInfo {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     size_t messageCount; // @link substring="messageCount" target="#messageCount"
///     CompilationMessage const* messages; // @link substring="CompilationMessage" target="CompilationMessage" @link substring="messages" target="#messages"
/// } CompilationInfo;
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
public record CompilationInfo(@NotNull MemorySegment segment) implements ICompilationInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link CompilationInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ICompilationInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code CompilationInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ICompilationInfo, Iterable<CompilationInfo> {
        public long size() {
            return segment.byteSize() / CompilationInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull CompilationInfo at(long index) {
            return new CompilationInfo(segment.asSlice(index * CompilationInfo.BYTES, CompilationInfo.BYTES));
        }

        public void write(long index, @NotNull CompilationInfo value) {
            MemorySegment s = segment.asSlice(index * CompilationInfo.BYTES, CompilationInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * CompilationInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * CompilationInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * CompilationInfo.BYTES,
                (end - start) * CompilationInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * CompilationInfo.BYTES));
        }

        public CompilationInfo[] toArray() {
            CompilationInfo[] ret = new CompilationInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<CompilationInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<CompilationInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= CompilationInfo.BYTES;
            }

            @Override
            public CompilationInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                CompilationInfo ret = new CompilationInfo(segment.asSlice(0, CompilationInfo.BYTES));
                segment = segment.asSlice(CompilationInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static CompilationInfo allocate(Arena arena) {
        return new CompilationInfo(arena.allocate(LAYOUT));
    }

    public static CompilationInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new CompilationInfo.Ptr(segment);
    }

    public static CompilationInfo clone(Arena arena, CompilationInfo src) {
        CompilationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public CompilationInfo nextInChain(@Nullable IChainedStruct value) {
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

    public @Unsigned long messageCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$messageCount);
    }

    public CompilationInfo messageCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$messageCount, value);
        return this;
    }

    public CompilationInfo messages(@Nullable ICompilationMessage value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        messagesRaw(s);
        return this;
    }

    @Unsafe public @Nullable CompilationMessage.Ptr messages(int assumedCount) {
        MemorySegment s = messagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * CompilationMessage.BYTES);
        return new CompilationMessage.Ptr(s);
    }

    public @Nullable CompilationMessage messages() {
        MemorySegment s = messagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new CompilationMessage(s);
    }

    public @Pointer(target=CompilationMessage.class) MemorySegment messagesRaw() {
        return segment.get(LAYOUT$messages, OFFSET$messages);
    }

    public void messagesRaw(@Pointer(target=CompilationMessage.class) MemorySegment value) {
        segment.set(LAYOUT$messages, OFFSET$messages, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        NativeLayout.C_SIZE_T.withName("messageCount"),
        ValueLayout.ADDRESS.withTargetLayout(CompilationMessage.LAYOUT).withName("messages")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$messageCount = PathElement.groupElement("messageCount");
    public static final PathElement PATH$messages = PathElement.groupElement("messages");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final AddressLayout LAYOUT$messages = (AddressLayout) LAYOUT.select(PATH$messages);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$messageCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$messages = LAYOUT$messages.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$messageCount = LAYOUT.byteOffset(PATH$messageCount);
    public static final long OFFSET$messages = LAYOUT.byteOffset(PATH$messages);
}

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

/// Represents a pointer to a {@code WGPUCompilationMessage} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUCompilationMessage {
///     WGPUStringView message; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="message" target="#message"
///     WGPUCompilationMessageType type; // @link substring="WGPUCompilationMessageType" target="WGPUCompilationMessageType" @link substring="type" target="#type"
///     uint64_t lineNum; // @link substring="lineNum" target="#lineNum"
///     uint64_t linePos; // @link substring="linePos" target="#linePos"
///     uint64_t offset; // @link substring="offset" target="#offset"
///     uint64_t length; // @link substring="length" target="#length"
/// } WGPUCompilationMessage;
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
public record WGPUCompilationMessage(@NotNull MemorySegment segment) implements IWGPUCompilationMessage {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUCompilationMessage}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUCompilationMessage to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUCompilationMessage.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUCompilationMessage, Iterable<WGPUCompilationMessage> {
        public long size() {
            return segment.byteSize() / WGPUCompilationMessage.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUCompilationMessage at(long index) {
            return new WGPUCompilationMessage(segment.asSlice(index * WGPUCompilationMessage.BYTES, WGPUCompilationMessage.BYTES));
        }

        public WGPUCompilationMessage.Ptr at(long index, @NotNull Consumer<@NotNull WGPUCompilationMessage> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUCompilationMessage value) {
            MemorySegment s = segment.asSlice(index * WGPUCompilationMessage.BYTES, WGPUCompilationMessage.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUCompilationMessage.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUCompilationMessage.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUCompilationMessage.BYTES,
                (end - start) * WGPUCompilationMessage.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUCompilationMessage.BYTES));
        }

        public WGPUCompilationMessage[] toArray() {
            WGPUCompilationMessage[] ret = new WGPUCompilationMessage[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUCompilationMessage> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUCompilationMessage> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUCompilationMessage.BYTES;
            }

            @Override
            public WGPUCompilationMessage next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUCompilationMessage ret = new WGPUCompilationMessage(segment.asSlice(0, WGPUCompilationMessage.BYTES));
                segment = segment.asSlice(WGPUCompilationMessage.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUCompilationMessage allocate(Arena arena) {
        return new WGPUCompilationMessage(arena.allocate(LAYOUT));
    }

    public static WGPUCompilationMessage.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUCompilationMessage.Ptr(segment);
    }

    public static WGPUCompilationMessage clone(Arena arena, WGPUCompilationMessage src) {
        WGPUCompilationMessage ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUStringView message() {
        return new WGPUStringView(segment.asSlice(OFFSET$message, LAYOUT$message));
    }

    public WGPUCompilationMessage message(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$message, SIZE$message);
        return this;
    }

    public WGPUCompilationMessage message(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(message());
        return this;
    }

    public @EnumType(WGPUCompilationMessageType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public WGPUCompilationMessage type(@EnumType(WGPUCompilationMessageType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Unsigned long lineNum() {
        return segment.get(LAYOUT$lineNum, OFFSET$lineNum);
    }

    public WGPUCompilationMessage lineNum(@Unsigned long value) {
        segment.set(LAYOUT$lineNum, OFFSET$lineNum, value);
        return this;
    }

    public @Unsigned long linePos() {
        return segment.get(LAYOUT$linePos, OFFSET$linePos);
    }

    public WGPUCompilationMessage linePos(@Unsigned long value) {
        segment.set(LAYOUT$linePos, OFFSET$linePos, value);
        return this;
    }

    public @Unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public WGPUCompilationMessage offset(@Unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public @Unsigned long length() {
        return segment.get(LAYOUT$length, OFFSET$length);
    }

    public WGPUCompilationMessage length(@Unsigned long value) {
        segment.set(LAYOUT$length, OFFSET$length, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUStringView.LAYOUT.withName("message"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("lineNum"),
        ValueLayout.JAVA_LONG.withName("linePos"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("length")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$message = PathElement.groupElement("message");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$lineNum = PathElement.groupElement("lineNum");
    public static final PathElement PATH$linePos = PathElement.groupElement("linePos");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$length = PathElement.groupElement("length");

    public static final StructLayout LAYOUT$message = (StructLayout) LAYOUT.select(PATH$message);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$lineNum = (OfLong) LAYOUT.select(PATH$lineNum);
    public static final OfLong LAYOUT$linePos = (OfLong) LAYOUT.select(PATH$linePos);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$length = (OfLong) LAYOUT.select(PATH$length);

    public static final long SIZE$message = LAYOUT$message.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$lineNum = LAYOUT$lineNum.byteSize();
    public static final long SIZE$linePos = LAYOUT$linePos.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$length = LAYOUT$length.byteSize();

    public static final long OFFSET$message = LAYOUT.byteOffset(PATH$message);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$lineNum = LAYOUT.byteOffset(PATH$lineNum);
    public static final long OFFSET$linePos = LAYOUT.byteOffset(PATH$linePos);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$length = LAYOUT.byteOffset(PATH$length);
}

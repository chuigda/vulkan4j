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

/// Represents a pointer to a {@code WGPUCompilationInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUCompilationInfo {
///     WGPUCompilationMessage const* messages; // @link substring="WGPUCompilationMessage" target="WGPUCompilationMessage" @link substring="messages" target="#messages"
/// } WGPUCompilationInfo;
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
public record WGPUCompilationInfo(@NotNull MemorySegment segment) implements IWGPUCompilationInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUCompilationInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUCompilationInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUCompilationInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUCompilationInfo, Iterable<WGPUCompilationInfo> {
        public long size() {
            return segment.byteSize() / WGPUCompilationInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUCompilationInfo at(long index) {
            return new WGPUCompilationInfo(segment.asSlice(index * WGPUCompilationInfo.BYTES, WGPUCompilationInfo.BYTES));
        }

        public WGPUCompilationInfo.Ptr at(long index, @NotNull Consumer<@NotNull WGPUCompilationInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUCompilationInfo value) {
            MemorySegment s = segment.asSlice(index * WGPUCompilationInfo.BYTES, WGPUCompilationInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUCompilationInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUCompilationInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUCompilationInfo.BYTES,
                (end - start) * WGPUCompilationInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUCompilationInfo.BYTES));
        }

        public WGPUCompilationInfo[] toArray() {
            WGPUCompilationInfo[] ret = new WGPUCompilationInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUCompilationInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUCompilationInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUCompilationInfo.BYTES;
            }

            @Override
            public WGPUCompilationInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUCompilationInfo ret = new WGPUCompilationInfo(segment.asSlice(0, WGPUCompilationInfo.BYTES));
                segment = segment.asSlice(WGPUCompilationInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUCompilationInfo allocate(Arena arena) {
        return new WGPUCompilationInfo(arena.allocate(LAYOUT));
    }

    public static WGPUCompilationInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUCompilationInfo.Ptr(segment);
    }

    public static WGPUCompilationInfo clone(Arena arena, WGPUCompilationInfo src) {
        WGPUCompilationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUCompilationInfo messages(@Nullable IWGPUCompilationMessage value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        messagesRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUCompilationMessage.Ptr messages(int assumedCount) {
        MemorySegment s = messagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUCompilationMessage.BYTES);
        return new WGPUCompilationMessage.Ptr(s);
    }

    public @Nullable WGPUCompilationMessage messages() {
        MemorySegment s = messagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUCompilationMessage(s);
    }

    public @Pointer(target=WGPUCompilationMessage.class) @NotNull MemorySegment messagesRaw() {
        return segment.get(LAYOUT$messages, OFFSET$messages);
    }

    public void messagesRaw(@Pointer(target=WGPUCompilationMessage.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$messages, OFFSET$messages, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUCompilationMessage.LAYOUT).withName("messages")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$messages = PathElement.groupElement("messages");

    public static final AddressLayout LAYOUT$messages = (AddressLayout) LAYOUT.select(PATH$messages);

    public static final long SIZE$messages = LAYOUT$messages.byteSize();

    public static final long OFFSET$messages = LAYOUT.byteOffset(PATH$messages);
}

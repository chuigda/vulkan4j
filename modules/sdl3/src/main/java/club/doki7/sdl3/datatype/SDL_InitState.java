package club.doki7.sdl3.datatype;

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
import club.doki7.sdl3.bitmask.*;
import club.doki7.sdl3.handle.*;
import club.doki7.sdl3.enumtype.*;
import static club.doki7.sdl3.SDL3Constants.*;

/// A structure used for thread-safe initialization and shutdown.
///
/// Here is an example of using this:
///
/// ```c
/// static SDL_AtomicInitState init;
///
/// bool InitSystem(void)
/// {
/// if (!SDL_ShouldInit(&amp;init)) {
/// // The system is initialized
/// return true;
/// }
///
/// // At this point, you should not leave this function without calling SDL_SetInitialized()
///
/// bool initialized = DoInitTasks();
/// SDL_SetInitialized(&amp;init, initialized);
/// return initialized;
/// }
///
/// bool UseSubsystem(void)
/// {
/// if (SDL_ShouldInit(&amp;init)) {
/// // Error, the subsystem isn't initialized
/// SDL_SetInitialized(&amp;init, false);
/// return false;
/// }
///
/// // Do work using the initialized subsystem
///
/// return true;
/// }
///
/// void QuitSystem(void)
/// {
/// if (!SDL_ShouldQuit(&amp;init)) {
/// // The system is not initialized
/// return;
/// }
///
/// // At this point, you should not leave this function without calling SDL_SetInitialized()
///
/// DoQuitTasks();
/// SDL_SetInitialized(&amp;init, false);
/// }
/// ```
///
/// Note that this doesn't protect any resources created during initialization,
/// or guarantee that nobody is using those resources during cleanup. You
/// should use other mechanisms to protect those, if that's a concern for your
/// code.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_InitState {
///     SDL_AtomicInt status; // @link substring="SDL_AtomicInt" target="SDL_AtomicInt" @link substring="status" target="#status"
///     SDL_ThreadID thread; // @link substring="thread" target="#thread"
///     void* reserved;
/// } SDL_InitState;
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
public record SDL_InitState(@NotNull MemorySegment segment) implements ISDL_InitState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_InitState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_InitState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_InitState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_InitState, Iterable<SDL_InitState> {
        public long size() {
            return segment.byteSize() / SDL_InitState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_InitState at(long index) {
            return new SDL_InitState(segment.asSlice(index * SDL_InitState.BYTES, SDL_InitState.BYTES));
        }

        public void write(long index, @NotNull SDL_InitState value) {
            MemorySegment s = segment.asSlice(index * SDL_InitState.BYTES, SDL_InitState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_InitState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_InitState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_InitState.BYTES,
                (end - start) * SDL_InitState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_InitState.BYTES));
        }

        public SDL_InitState[] toArray() {
            SDL_InitState[] ret = new SDL_InitState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_InitState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_InitState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_InitState.BYTES;
            }

            @Override
            public SDL_InitState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_InitState ret = new SDL_InitState(segment.asSlice(0, SDL_InitState.BYTES));
                segment = segment.asSlice(SDL_InitState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_InitState allocate(Arena arena) {
        return new SDL_InitState(arena.allocate(LAYOUT));
    }

    public static SDL_InitState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_InitState.Ptr(segment);
    }

    public static SDL_InitState clone(Arena arena, SDL_InitState src) {
        SDL_InitState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull SDL_AtomicInt status() {
        return new SDL_AtomicInt(segment.asSlice(OFFSET$status, LAYOUT$status));
    }

    public SDL_InitState status(@NotNull SDL_AtomicInt value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$status, SIZE$status);
        return this;
    }

    public SDL_InitState status(Consumer<@NotNull SDL_AtomicInt> consumer) {
        consumer.accept(status());
        return this;
    }

    public @NativeType("SDL_ThreadID") @Unsigned long thread() {
        return segment.get(LAYOUT$thread, OFFSET$thread);
    }

    public SDL_InitState thread(@NativeType("SDL_ThreadID") @Unsigned long value) {
        segment.set(LAYOUT$thread, OFFSET$thread, value);
        return this;
    }


    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        SDL_AtomicInt.LAYOUT.withName("status"),
        ValueLayout.JAVA_LONG.withName("thread"),
        ValueLayout.ADDRESS.withName("reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$status = PathElement.groupElement("status");
    public static final PathElement PATH$thread = PathElement.groupElement("thread");

    public static final StructLayout LAYOUT$status = (StructLayout) LAYOUT.select(PATH$status);
    public static final OfLong LAYOUT$thread = (OfLong) LAYOUT.select(PATH$thread);

    public static final long SIZE$status = LAYOUT$status.byteSize();
    public static final long SIZE$thread = LAYOUT$thread.byteSize();

    public static final long OFFSET$status = LAYOUT.byteOffset(PATH$status);
    public static final long OFFSET$thread = LAYOUT.byteOffset(PATH$thread);
}

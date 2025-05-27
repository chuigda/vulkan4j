package club.doki7.glfw.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.glfw.handle.*;
import static club.doki7.glfw.GLFWConstants.*;

///  @brief Gamepad input state
///
///  This describes the input state of a gamepad.
///
///  @sa @ref gamepad
///  @sa @ref glfwGetGamepadState
///
///  @since Added in version 3.3.
///
///  @ingroup input
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct GLFWgamepadstate {
///     char[15] buttons; // @link substring="buttons" target="#buttons"
///     float[6] axes; // @link substring="axes" target="#axes"
/// } GLFWgamepadstate;
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
///
/// ## Member documentation
///
/// <ul>
/// <li>{@link #buttons}  The states of each [gamepad button](@ref gamepad_buttons), `GLFW_PRESS`
///  or `GLFW_RELEASE`.
/// </li>
/// <li>{@link #axes}  The states of each [gamepad axis](@ref gamepad_axes), in the range -1.0
///  to 1.0 inclusive.
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record GLFWgamepadstate(@NotNull MemorySegment segment) implements IGLFWgamepadstate {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link GLFWgamepadstate}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IGLFWgamepadstate to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code GLFWgamepadstate.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IGLFWgamepadstate, Iterable<GLFWgamepadstate> {
        public long size() {
            return segment.byteSize() / GLFWgamepadstate.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull GLFWgamepadstate at(long index) {
            return new GLFWgamepadstate(segment.asSlice(index * GLFWgamepadstate.BYTES, GLFWgamepadstate.BYTES));
        }

        public void write(long index, @NotNull GLFWgamepadstate value) {
            MemorySegment s = segment.asSlice(index * GLFWgamepadstate.BYTES, GLFWgamepadstate.BYTES);
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
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * GLFWgamepadstate.BYTES, GLFWgamepadstate.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * GLFWgamepadstate.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * GLFWgamepadstate.BYTES,
                (end - start) * GLFWgamepadstate.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * GLFWgamepadstate.BYTES));
        }

        public GLFWgamepadstate[] toArray() {
            GLFWgamepadstate[] ret = new GLFWgamepadstate[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures in this pointer.
        public static final class Iter implements Iterator<GLFWgamepadstate> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return (segment.byteSize() / GLFWgamepadstate.BYTES) > 0;
            }

            @Override
            public GLFWgamepadstate next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                GLFWgamepadstate ret = new GLFWgamepadstate(segment.asSlice(0, GLFWgamepadstate.BYTES));
                segment = segment.asSlice(GLFWgamepadstate.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static GLFWgamepadstate allocate(Arena arena) {
        return new GLFWgamepadstate(arena.allocate(LAYOUT));
    }

    public static GLFWgamepadstate.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new GLFWgamepadstate.Ptr(segment);
    }

    public static GLFWgamepadstate clone(Arena arena, GLFWgamepadstate src) {
        GLFWgamepadstate ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public BytePtr buttons() {
        return new BytePtr(buttonsRaw());
    }

    public void buttons(BytePtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$buttons, SIZE$buttons);
    }

    public MemorySegment buttonsRaw() {
        return segment.asSlice(OFFSET$buttons, SIZE$buttons);
    }

    public FloatPtr axes() {
        return new FloatPtr(axesRaw());
    }

    public void axes(FloatPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$axes, SIZE$axes);
    }

    public MemorySegment axesRaw() {
        return segment.asSlice(OFFSET$axes, SIZE$axes);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("buttons"),
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_FLOAT).withName("axes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$buttons = PathElement.groupElement("buttons");
    public static final PathElement PATH$axes = PathElement.groupElement("axes");

    public static final SequenceLayout LAYOUT$buttons = (SequenceLayout) LAYOUT.select(PATH$buttons);
    public static final SequenceLayout LAYOUT$axes = (SequenceLayout) LAYOUT.select(PATH$axes);

    public static final long SIZE$buttons = LAYOUT$buttons.byteSize();
    public static final long SIZE$axes = LAYOUT$axes.byteSize();

    public static final long OFFSET$buttons = LAYOUT.byteOffset(PATH$buttons);
    public static final long OFFSET$axes = LAYOUT.byteOffset(PATH$axes);
}

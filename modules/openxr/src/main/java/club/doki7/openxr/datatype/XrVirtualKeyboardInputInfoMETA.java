package club.doki7.openxr.datatype;

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
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardInputInfoMETA.html"><code>XrVirtualKeyboardInputInfoMETA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrVirtualKeyboardInputInfoMETA {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrVirtualKeyboardInputSourceMETA inputSource; // @link substring="XrVirtualKeyboardInputSourceMETA" target="XrVirtualKeyboardInputSourceMETA" @link substring="inputSource" target="#inputSource"
///     XrSpace inputSpace; // optional // @link substring="XrSpace" target="XrSpace" @link substring="inputSpace" target="#inputSpace"
///     XrPosef inputPoseInSpace; // optional // @link substring="XrPosef" target="XrPosef" @link substring="inputPoseInSpace" target="#inputPoseInSpace"
///     XrVirtualKeyboardInputStateFlagsMETA inputState; // optional // @link substring="XrVirtualKeyboardInputStateFlagsMETA" target="XrVirtualKeyboardInputStateFlagsMETA" @link substring="inputState" target="#inputState"
/// } XrVirtualKeyboardInputInfoMETA;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META`
///
/// The {@code allocate} ({@link XrVirtualKeyboardInputInfoMETA#allocate(Arena)}, {@link XrVirtualKeyboardInputInfoMETA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrVirtualKeyboardInputInfoMETA#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardInputInfoMETA.html"><code>XrVirtualKeyboardInputInfoMETA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrVirtualKeyboardInputInfoMETA(@NotNull MemorySegment segment) implements IXrVirtualKeyboardInputInfoMETA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardInputInfoMETA.html"><code>XrVirtualKeyboardInputInfoMETA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrVirtualKeyboardInputInfoMETA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrVirtualKeyboardInputInfoMETA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrVirtualKeyboardInputInfoMETA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrVirtualKeyboardInputInfoMETA, Iterable<XrVirtualKeyboardInputInfoMETA> {
        public long size() {
            return segment.byteSize() / XrVirtualKeyboardInputInfoMETA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrVirtualKeyboardInputInfoMETA at(long index) {
            return new XrVirtualKeyboardInputInfoMETA(segment.asSlice(index * XrVirtualKeyboardInputInfoMETA.BYTES, XrVirtualKeyboardInputInfoMETA.BYTES));
        }

        public void write(long index, @NotNull XrVirtualKeyboardInputInfoMETA value) {
            MemorySegment s = segment.asSlice(index * XrVirtualKeyboardInputInfoMETA.BYTES, XrVirtualKeyboardInputInfoMETA.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrVirtualKeyboardInputInfoMETA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrVirtualKeyboardInputInfoMETA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrVirtualKeyboardInputInfoMETA.BYTES,
                (end - start) * XrVirtualKeyboardInputInfoMETA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrVirtualKeyboardInputInfoMETA.BYTES));
        }

        public XrVirtualKeyboardInputInfoMETA[] toArray() {
            XrVirtualKeyboardInputInfoMETA[] ret = new XrVirtualKeyboardInputInfoMETA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrVirtualKeyboardInputInfoMETA> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrVirtualKeyboardInputInfoMETA> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrVirtualKeyboardInputInfoMETA.BYTES;
            }

            @Override
            public XrVirtualKeyboardInputInfoMETA next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrVirtualKeyboardInputInfoMETA ret = new XrVirtualKeyboardInputInfoMETA(segment.asSlice(0, XrVirtualKeyboardInputInfoMETA.BYTES));
                segment = segment.asSlice(XrVirtualKeyboardInputInfoMETA.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrVirtualKeyboardInputInfoMETA allocate(Arena arena) {
        XrVirtualKeyboardInputInfoMETA ret = new XrVirtualKeyboardInputInfoMETA(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META);
        return ret;
    }

    public static XrVirtualKeyboardInputInfoMETA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrVirtualKeyboardInputInfoMETA.Ptr ret = new XrVirtualKeyboardInputInfoMETA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META);
        }
        return ret;
    }

    public static XrVirtualKeyboardInputInfoMETA clone(Arena arena, XrVirtualKeyboardInputInfoMETA src) {
        XrVirtualKeyboardInputInfoMETA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrVirtualKeyboardInputInfoMETA type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrVirtualKeyboardInputInfoMETA next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrVirtualKeyboardInputInfoMETA next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrVirtualKeyboardInputSourceMETA.class) int inputSource() {
        return segment.get(LAYOUT$inputSource, OFFSET$inputSource);
    }

    public XrVirtualKeyboardInputInfoMETA inputSource(@EnumType(XrVirtualKeyboardInputSourceMETA.class) int value) {
        segment.set(LAYOUT$inputSource, OFFSET$inputSource, value);
        return this;
    }

    public @Nullable XrSpace inputSpace() {
        MemorySegment s = segment.asSlice(OFFSET$inputSpace, SIZE$inputSpace);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrVirtualKeyboardInputInfoMETA inputSpace(@Nullable XrSpace value) {
        segment.set(LAYOUT$inputSpace, OFFSET$inputSpace, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrPosef inputPoseInSpace() {
        return new XrPosef(segment.asSlice(OFFSET$inputPoseInSpace, LAYOUT$inputPoseInSpace));
    }

    public XrVirtualKeyboardInputInfoMETA inputPoseInSpace(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$inputPoseInSpace, SIZE$inputPoseInSpace);
        return this;
    }

    public XrVirtualKeyboardInputInfoMETA inputPoseInSpace(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(inputPoseInSpace());
        return this;
    }

    public @Bitmask(XrVirtualKeyboardInputStateFlagsMETA.class) int inputState() {
        return segment.get(LAYOUT$inputState, OFFSET$inputState);
    }

    public XrVirtualKeyboardInputInfoMETA inputState(@Bitmask(XrVirtualKeyboardInputStateFlagsMETA.class) int value) {
        segment.set(LAYOUT$inputState, OFFSET$inputState, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("inputSource"),
        ValueLayout.ADDRESS.withName("inputSpace"),
        XrPosef.LAYOUT.withName("inputPoseInSpace"),
        ValueLayout.JAVA_INT.withName("inputState")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$inputSource = PathElement.groupElement("inputSource");
    public static final PathElement PATH$inputSpace = PathElement.groupElement("inputSpace");
    public static final PathElement PATH$inputPoseInSpace = PathElement.groupElement("inputPoseInSpace");
    public static final PathElement PATH$inputState = PathElement.groupElement("inputState");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$inputSource = (OfInt) LAYOUT.select(PATH$inputSource);
    public static final AddressLayout LAYOUT$inputSpace = (AddressLayout) LAYOUT.select(PATH$inputSpace);
    public static final StructLayout LAYOUT$inputPoseInSpace = (StructLayout) LAYOUT.select(PATH$inputPoseInSpace);
    public static final OfInt LAYOUT$inputState = (OfInt) LAYOUT.select(PATH$inputState);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$inputSource = LAYOUT$inputSource.byteSize();
    public static final long SIZE$inputSpace = LAYOUT$inputSpace.byteSize();
    public static final long SIZE$inputPoseInSpace = LAYOUT$inputPoseInSpace.byteSize();
    public static final long SIZE$inputState = LAYOUT$inputState.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$inputSource = LAYOUT.byteOffset(PATH$inputSource);
    public static final long OFFSET$inputSpace = LAYOUT.byteOffset(PATH$inputSpace);
    public static final long OFFSET$inputPoseInSpace = LAYOUT.byteOffset(PATH$inputPoseInSpace);
    public static final long OFFSET$inputState = LAYOUT.byteOffset(PATH$inputState);
}

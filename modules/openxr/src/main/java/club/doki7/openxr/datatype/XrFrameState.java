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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameState.html"><code>XrFrameState</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFrameState {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrTime predictedDisplayTime; // @link substring="predictedDisplayTime" target="#predictedDisplayTime"
///     XrDuration predictedDisplayPeriod; // @link substring="predictedDisplayPeriod" target="#predictedDisplayPeriod"
///     XrBool32 shouldRender; // @link substring="shouldRender" target="#shouldRender"
/// } XrFrameState;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FRAME_STATE`
///
/// The {@code allocate} ({@link XrFrameState#allocate(Arena)}, {@link XrFrameState#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFrameState#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameState.html"><code>XrFrameState</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFrameState(@NotNull MemorySegment segment) implements IXrFrameState {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameState.html"><code>XrFrameState</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFrameState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFrameState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFrameState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFrameState, Iterable<XrFrameState> {
        public long size() {
            return segment.byteSize() / XrFrameState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFrameState at(long index) {
            return new XrFrameState(segment.asSlice(index * XrFrameState.BYTES, XrFrameState.BYTES));
        }

        public void write(long index, @NotNull XrFrameState value) {
            MemorySegment s = segment.asSlice(index * XrFrameState.BYTES, XrFrameState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFrameState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFrameState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFrameState.BYTES,
                (end - start) * XrFrameState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFrameState.BYTES));
        }

        public XrFrameState[] toArray() {
            XrFrameState[] ret = new XrFrameState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFrameState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFrameState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFrameState.BYTES;
            }

            @Override
            public XrFrameState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFrameState ret = new XrFrameState(segment.asSlice(0, XrFrameState.BYTES));
                segment = segment.asSlice(XrFrameState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFrameState allocate(Arena arena) {
        XrFrameState ret = new XrFrameState(arena.allocate(LAYOUT));
        ret.type(XrStructureType.FRAME_STATE);
        return ret;
    }

    public static XrFrameState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFrameState.Ptr ret = new XrFrameState.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.FRAME_STATE);
        }
        return ret;
    }

    public static XrFrameState clone(Arena arena, XrFrameState src) {
        XrFrameState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.FRAME_STATE);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFrameState type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFrameState next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFrameState next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrTime") long predictedDisplayTime() {
        return segment.get(LAYOUT$predictedDisplayTime, OFFSET$predictedDisplayTime);
    }

    public XrFrameState predictedDisplayTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$predictedDisplayTime, OFFSET$predictedDisplayTime, value);
        return this;
    }

    public @NativeType("XrDuration") long predictedDisplayPeriod() {
        return segment.get(LAYOUT$predictedDisplayPeriod, OFFSET$predictedDisplayPeriod);
    }

    public XrFrameState predictedDisplayPeriod(@NativeType("XrDuration") long value) {
        segment.set(LAYOUT$predictedDisplayPeriod, OFFSET$predictedDisplayPeriod, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int shouldRender() {
        return segment.get(LAYOUT$shouldRender, OFFSET$shouldRender);
    }

    public XrFrameState shouldRender(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$shouldRender, OFFSET$shouldRender, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("predictedDisplayTime"),
        ValueLayout.JAVA_LONG.withName("predictedDisplayPeriod"),
        ValueLayout.JAVA_INT.withName("shouldRender")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$predictedDisplayTime = PathElement.groupElement("predictedDisplayTime");
    public static final PathElement PATH$predictedDisplayPeriod = PathElement.groupElement("predictedDisplayPeriod");
    public static final PathElement PATH$shouldRender = PathElement.groupElement("shouldRender");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$predictedDisplayTime = (OfLong) LAYOUT.select(PATH$predictedDisplayTime);
    public static final OfLong LAYOUT$predictedDisplayPeriod = (OfLong) LAYOUT.select(PATH$predictedDisplayPeriod);
    public static final OfInt LAYOUT$shouldRender = (OfInt) LAYOUT.select(PATH$shouldRender);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$predictedDisplayTime = LAYOUT$predictedDisplayTime.byteSize();
    public static final long SIZE$predictedDisplayPeriod = LAYOUT$predictedDisplayPeriod.byteSize();
    public static final long SIZE$shouldRender = LAYOUT$shouldRender.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$predictedDisplayTime = LAYOUT.byteOffset(PATH$predictedDisplayTime);
    public static final long OFFSET$predictedDisplayPeriod = LAYOUT.byteOffset(PATH$predictedDisplayPeriod);
    public static final long OFFSET$shouldRender = LAYOUT.byteOffset(PATH$shouldRender);
}

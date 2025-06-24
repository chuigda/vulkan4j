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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataReferenceSpaceChangePending.html"><code>XrEventDataReferenceSpaceChangePending</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEventDataReferenceSpaceChangePending {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSession session; // @link substring="XrSession" target="XrSession" @link substring="session" target="#session"
///     XrReferenceSpaceType referenceSpaceType; // @link substring="XrReferenceSpaceType" target="XrReferenceSpaceType" @link substring="referenceSpaceType" target="#referenceSpaceType"
///     XrTime changeTime; // @link substring="changeTime" target="#changeTime"
///     XrBool32 poseValid; // @link substring="poseValid" target="#poseValid"
///     XrPosef poseInPreviousSpace; // @link substring="XrPosef" target="XrPosef" @link substring="poseInPreviousSpace" target="#poseInPreviousSpace"
/// } XrEventDataReferenceSpaceChangePending;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING`
///
/// The {@code allocate} ({@link XrEventDataReferenceSpaceChangePending#allocate(Arena)}, {@link XrEventDataReferenceSpaceChangePending#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEventDataReferenceSpaceChangePending#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataReferenceSpaceChangePending.html"><code>XrEventDataReferenceSpaceChangePending</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEventDataReferenceSpaceChangePending(@NotNull MemorySegment segment) implements IXrEventDataReferenceSpaceChangePending {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataReferenceSpaceChangePending.html"><code>XrEventDataReferenceSpaceChangePending</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEventDataReferenceSpaceChangePending}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEventDataReferenceSpaceChangePending to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEventDataReferenceSpaceChangePending.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEventDataReferenceSpaceChangePending, Iterable<XrEventDataReferenceSpaceChangePending> {
        public long size() {
            return segment.byteSize() / XrEventDataReferenceSpaceChangePending.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEventDataReferenceSpaceChangePending at(long index) {
            return new XrEventDataReferenceSpaceChangePending(segment.asSlice(index * XrEventDataReferenceSpaceChangePending.BYTES, XrEventDataReferenceSpaceChangePending.BYTES));
        }

        public void write(long index, @NotNull XrEventDataReferenceSpaceChangePending value) {
            MemorySegment s = segment.asSlice(index * XrEventDataReferenceSpaceChangePending.BYTES, XrEventDataReferenceSpaceChangePending.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEventDataReferenceSpaceChangePending.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEventDataReferenceSpaceChangePending.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEventDataReferenceSpaceChangePending.BYTES,
                (end - start) * XrEventDataReferenceSpaceChangePending.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEventDataReferenceSpaceChangePending.BYTES));
        }

        public XrEventDataReferenceSpaceChangePending[] toArray() {
            XrEventDataReferenceSpaceChangePending[] ret = new XrEventDataReferenceSpaceChangePending[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEventDataReferenceSpaceChangePending> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEventDataReferenceSpaceChangePending> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEventDataReferenceSpaceChangePending.BYTES;
            }

            @Override
            public XrEventDataReferenceSpaceChangePending next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEventDataReferenceSpaceChangePending ret = new XrEventDataReferenceSpaceChangePending(segment.asSlice(0, XrEventDataReferenceSpaceChangePending.BYTES));
                segment = segment.asSlice(XrEventDataReferenceSpaceChangePending.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEventDataReferenceSpaceChangePending allocate(Arena arena) {
        XrEventDataReferenceSpaceChangePending ret = new XrEventDataReferenceSpaceChangePending(arena.allocate(LAYOUT));
        ret.type(XrStructureType.EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING);
        return ret;
    }

    public static XrEventDataReferenceSpaceChangePending.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEventDataReferenceSpaceChangePending.Ptr ret = new XrEventDataReferenceSpaceChangePending.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING);
        }
        return ret;
    }

    public static XrEventDataReferenceSpaceChangePending clone(Arena arena, XrEventDataReferenceSpaceChangePending src) {
        XrEventDataReferenceSpaceChangePending ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEventDataReferenceSpaceChangePending type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEventDataReferenceSpaceChangePending next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEventDataReferenceSpaceChangePending next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrSession session() {
        MemorySegment s = segment.asSlice(OFFSET$session, SIZE$session);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSession(s);
    }

    public XrEventDataReferenceSpaceChangePending session(@Nullable XrSession value) {
        segment.set(LAYOUT$session, OFFSET$session, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrReferenceSpaceType.class) int referenceSpaceType() {
        return segment.get(LAYOUT$referenceSpaceType, OFFSET$referenceSpaceType);
    }

    public XrEventDataReferenceSpaceChangePending referenceSpaceType(@EnumType(XrReferenceSpaceType.class) int value) {
        segment.set(LAYOUT$referenceSpaceType, OFFSET$referenceSpaceType, value);
        return this;
    }

    public @NativeType("XrTime") long changeTime() {
        return segment.get(LAYOUT$changeTime, OFFSET$changeTime);
    }

    public XrEventDataReferenceSpaceChangePending changeTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$changeTime, OFFSET$changeTime, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int poseValid() {
        return segment.get(LAYOUT$poseValid, OFFSET$poseValid);
    }

    public XrEventDataReferenceSpaceChangePending poseValid(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$poseValid, OFFSET$poseValid, value);
        return this;
    }

    public @NotNull XrPosef poseInPreviousSpace() {
        return new XrPosef(segment.asSlice(OFFSET$poseInPreviousSpace, LAYOUT$poseInPreviousSpace));
    }

    public XrEventDataReferenceSpaceChangePending poseInPreviousSpace(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$poseInPreviousSpace, SIZE$poseInPreviousSpace);
        return this;
    }

    public XrEventDataReferenceSpaceChangePending poseInPreviousSpace(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(poseInPreviousSpace());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("session"),
        ValueLayout.JAVA_INT.withName("referenceSpaceType"),
        ValueLayout.JAVA_LONG.withName("changeTime"),
        ValueLayout.JAVA_INT.withName("poseValid"),
        XrPosef.LAYOUT.withName("poseInPreviousSpace")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$session = PathElement.groupElement("session");
    public static final PathElement PATH$referenceSpaceType = PathElement.groupElement("referenceSpaceType");
    public static final PathElement PATH$changeTime = PathElement.groupElement("changeTime");
    public static final PathElement PATH$poseValid = PathElement.groupElement("poseValid");
    public static final PathElement PATH$poseInPreviousSpace = PathElement.groupElement("poseInPreviousSpace");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$session = (AddressLayout) LAYOUT.select(PATH$session);
    public static final OfInt LAYOUT$referenceSpaceType = (OfInt) LAYOUT.select(PATH$referenceSpaceType);
    public static final OfLong LAYOUT$changeTime = (OfLong) LAYOUT.select(PATH$changeTime);
    public static final OfInt LAYOUT$poseValid = (OfInt) LAYOUT.select(PATH$poseValid);
    public static final StructLayout LAYOUT$poseInPreviousSpace = (StructLayout) LAYOUT.select(PATH$poseInPreviousSpace);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$session = LAYOUT$session.byteSize();
    public static final long SIZE$referenceSpaceType = LAYOUT$referenceSpaceType.byteSize();
    public static final long SIZE$changeTime = LAYOUT$changeTime.byteSize();
    public static final long SIZE$poseValid = LAYOUT$poseValid.byteSize();
    public static final long SIZE$poseInPreviousSpace = LAYOUT$poseInPreviousSpace.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$session = LAYOUT.byteOffset(PATH$session);
    public static final long OFFSET$referenceSpaceType = LAYOUT.byteOffset(PATH$referenceSpaceType);
    public static final long OFFSET$changeTime = LAYOUT.byteOffset(PATH$changeTime);
    public static final long OFFSET$poseValid = LAYOUT.byteOffset(PATH$poseValid);
    public static final long OFFSET$poseInPreviousSpace = LAYOUT.byteOffset(PATH$poseInPreviousSpace);
}

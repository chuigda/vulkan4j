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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataColocationAdvertisementCompleteMETA.html"><code>XrEventDataColocationAdvertisementCompleteMETA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEventDataColocationAdvertisementCompleteMETA {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrAsyncRequestIdFB advertisementRequestId; // @link substring="advertisementRequestId" target="#advertisementRequestId"
///     XrResult result; // @link substring="XrResult" target="XrResult" @link substring="result" target="#result"
/// } XrEventDataColocationAdvertisementCompleteMETA;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META`
///
/// The {@code allocate} ({@link XrEventDataColocationAdvertisementCompleteMETA#allocate(Arena)}, {@link XrEventDataColocationAdvertisementCompleteMETA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEventDataColocationAdvertisementCompleteMETA#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataColocationAdvertisementCompleteMETA.html"><code>XrEventDataColocationAdvertisementCompleteMETA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEventDataColocationAdvertisementCompleteMETA(@NotNull MemorySegment segment) implements IXrEventDataColocationAdvertisementCompleteMETA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataColocationAdvertisementCompleteMETA.html"><code>XrEventDataColocationAdvertisementCompleteMETA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEventDataColocationAdvertisementCompleteMETA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEventDataColocationAdvertisementCompleteMETA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEventDataColocationAdvertisementCompleteMETA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEventDataColocationAdvertisementCompleteMETA, Iterable<XrEventDataColocationAdvertisementCompleteMETA> {
        public long size() {
            return segment.byteSize() / XrEventDataColocationAdvertisementCompleteMETA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEventDataColocationAdvertisementCompleteMETA at(long index) {
            return new XrEventDataColocationAdvertisementCompleteMETA(segment.asSlice(index * XrEventDataColocationAdvertisementCompleteMETA.BYTES, XrEventDataColocationAdvertisementCompleteMETA.BYTES));
        }

        public void write(long index, @NotNull XrEventDataColocationAdvertisementCompleteMETA value) {
            MemorySegment s = segment.asSlice(index * XrEventDataColocationAdvertisementCompleteMETA.BYTES, XrEventDataColocationAdvertisementCompleteMETA.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEventDataColocationAdvertisementCompleteMETA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEventDataColocationAdvertisementCompleteMETA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEventDataColocationAdvertisementCompleteMETA.BYTES,
                (end - start) * XrEventDataColocationAdvertisementCompleteMETA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEventDataColocationAdvertisementCompleteMETA.BYTES));
        }

        public XrEventDataColocationAdvertisementCompleteMETA[] toArray() {
            XrEventDataColocationAdvertisementCompleteMETA[] ret = new XrEventDataColocationAdvertisementCompleteMETA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEventDataColocationAdvertisementCompleteMETA> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEventDataColocationAdvertisementCompleteMETA> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEventDataColocationAdvertisementCompleteMETA.BYTES;
            }

            @Override
            public XrEventDataColocationAdvertisementCompleteMETA next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEventDataColocationAdvertisementCompleteMETA ret = new XrEventDataColocationAdvertisementCompleteMETA(segment.asSlice(0, XrEventDataColocationAdvertisementCompleteMETA.BYTES));
                segment = segment.asSlice(XrEventDataColocationAdvertisementCompleteMETA.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEventDataColocationAdvertisementCompleteMETA allocate(Arena arena) {
        XrEventDataColocationAdvertisementCompleteMETA ret = new XrEventDataColocationAdvertisementCompleteMETA(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META);
        return ret;
    }

    public static XrEventDataColocationAdvertisementCompleteMETA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEventDataColocationAdvertisementCompleteMETA.Ptr ret = new XrEventDataColocationAdvertisementCompleteMETA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META);
        }
        return ret;
    }

    public static XrEventDataColocationAdvertisementCompleteMETA clone(Arena arena, XrEventDataColocationAdvertisementCompleteMETA src) {
        XrEventDataColocationAdvertisementCompleteMETA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEventDataColocationAdvertisementCompleteMETA type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEventDataColocationAdvertisementCompleteMETA next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEventDataColocationAdvertisementCompleteMETA next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrAsyncRequestIdFB") @Unsigned long advertisementRequestId() {
        return segment.get(LAYOUT$advertisementRequestId, OFFSET$advertisementRequestId);
    }

    public XrEventDataColocationAdvertisementCompleteMETA advertisementRequestId(@NativeType("XrAsyncRequestIdFB") @Unsigned long value) {
        segment.set(LAYOUT$advertisementRequestId, OFFSET$advertisementRequestId, value);
        return this;
    }

    public @EnumType(XrResult.class) int result() {
        return segment.get(LAYOUT$result, OFFSET$result);
    }

    public XrEventDataColocationAdvertisementCompleteMETA result(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$result, OFFSET$result, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("advertisementRequestId"),
        ValueLayout.JAVA_INT.withName("result")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$advertisementRequestId = PathElement.groupElement("advertisementRequestId");
    public static final PathElement PATH$result = PathElement.groupElement("result");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$advertisementRequestId = (OfLong) LAYOUT.select(PATH$advertisementRequestId);
    public static final OfInt LAYOUT$result = (OfInt) LAYOUT.select(PATH$result);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$advertisementRequestId = LAYOUT$advertisementRequestId.byteSize();
    public static final long SIZE$result = LAYOUT$result.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$advertisementRequestId = LAYOUT.byteOffset(PATH$advertisementRequestId);
    public static final long OFFSET$result = LAYOUT.byteOffset(PATH$result);
}

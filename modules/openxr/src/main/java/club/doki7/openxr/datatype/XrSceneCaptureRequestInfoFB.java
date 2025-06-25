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
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneCaptureRequestInfoFB.html"><code>XrSceneCaptureRequestInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneCaptureRequestInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t requestByteCount; // optional // @link substring="requestByteCount" target="#requestByteCount"
///     char const* request; // optional // @link substring="request" target="#request"
/// } XrSceneCaptureRequestInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SCENE_CAPTURE_REQUEST_INFO_FB`
///
/// The {@code allocate} ({@link XrSceneCaptureRequestInfoFB#allocate(Arena)}, {@link XrSceneCaptureRequestInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSceneCaptureRequestInfoFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneCaptureRequestInfoFB.html"><code>XrSceneCaptureRequestInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneCaptureRequestInfoFB(@NotNull MemorySegment segment) implements IXrSceneCaptureRequestInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneCaptureRequestInfoFB.html"><code>XrSceneCaptureRequestInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneCaptureRequestInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneCaptureRequestInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneCaptureRequestInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneCaptureRequestInfoFB, Iterable<XrSceneCaptureRequestInfoFB> {
        public long size() {
            return segment.byteSize() / XrSceneCaptureRequestInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneCaptureRequestInfoFB at(long index) {
            return new XrSceneCaptureRequestInfoFB(segment.asSlice(index * XrSceneCaptureRequestInfoFB.BYTES, XrSceneCaptureRequestInfoFB.BYTES));
        }

        public void write(long index, @NotNull XrSceneCaptureRequestInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrSceneCaptureRequestInfoFB.BYTES, XrSceneCaptureRequestInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneCaptureRequestInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneCaptureRequestInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneCaptureRequestInfoFB.BYTES,
                (end - start) * XrSceneCaptureRequestInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneCaptureRequestInfoFB.BYTES));
        }

        public XrSceneCaptureRequestInfoFB[] toArray() {
            XrSceneCaptureRequestInfoFB[] ret = new XrSceneCaptureRequestInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneCaptureRequestInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneCaptureRequestInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneCaptureRequestInfoFB.BYTES;
            }

            @Override
            public XrSceneCaptureRequestInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneCaptureRequestInfoFB ret = new XrSceneCaptureRequestInfoFB(segment.asSlice(0, XrSceneCaptureRequestInfoFB.BYTES));
                segment = segment.asSlice(XrSceneCaptureRequestInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneCaptureRequestInfoFB allocate(Arena arena) {
        XrSceneCaptureRequestInfoFB ret = new XrSceneCaptureRequestInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SCENE_CAPTURE_REQUEST_INFO_FB);
        return ret;
    }

    public static XrSceneCaptureRequestInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSceneCaptureRequestInfoFB.Ptr ret = new XrSceneCaptureRequestInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SCENE_CAPTURE_REQUEST_INFO_FB);
        }
        return ret;
    }

    public static XrSceneCaptureRequestInfoFB clone(Arena arena, XrSceneCaptureRequestInfoFB src) {
        XrSceneCaptureRequestInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SCENE_CAPTURE_REQUEST_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSceneCaptureRequestInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSceneCaptureRequestInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSceneCaptureRequestInfoFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int requestByteCount() {
        return segment.get(LAYOUT$requestByteCount, OFFSET$requestByteCount);
    }

    public XrSceneCaptureRequestInfoFB requestByteCount(@Unsigned int value) {
        segment.set(LAYOUT$requestByteCount, OFFSET$requestByteCount, value);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr request() {
        MemorySegment s = requestRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public XrSceneCaptureRequestInfoFB request(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        requestRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") @NotNull MemorySegment requestRaw() {
        return segment.get(LAYOUT$request, OFFSET$request);
    }

    public void requestRaw(@Pointer(comment="int8_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$request, OFFSET$request, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("requestByteCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("request")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$requestByteCount = PathElement.groupElement("requestByteCount");
    public static final PathElement PATH$request = PathElement.groupElement("request");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$requestByteCount = (OfInt) LAYOUT.select(PATH$requestByteCount);
    public static final AddressLayout LAYOUT$request = (AddressLayout) LAYOUT.select(PATH$request);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$requestByteCount = LAYOUT$requestByteCount.byteSize();
    public static final long SIZE$request = LAYOUT$request.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$requestByteCount = LAYOUT.byteOffset(PATH$requestByteCount);
    public static final long OFFSET$request = LAYOUT.byteOffset(PATH$request);
}

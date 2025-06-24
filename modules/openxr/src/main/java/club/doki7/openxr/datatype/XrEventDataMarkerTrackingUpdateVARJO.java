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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataMarkerTrackingUpdateVARJO.html"><code>XrEventDataMarkerTrackingUpdateVARJO</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEventDataMarkerTrackingUpdateVARJO {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint64_t markerId; // @link substring="markerId" target="#markerId"
///     XrBool32 isActive; // @link substring="isActive" target="#isActive"
///     XrBool32 isPredicted; // @link substring="isPredicted" target="#isPredicted"
///     XrTime time; // @link substring="time" target="#time"
/// } XrEventDataMarkerTrackingUpdateVARJO;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO`
///
/// The {@code allocate} ({@link XrEventDataMarkerTrackingUpdateVARJO#allocate(Arena)}, {@link XrEventDataMarkerTrackingUpdateVARJO#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEventDataMarkerTrackingUpdateVARJO#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataMarkerTrackingUpdateVARJO.html"><code>XrEventDataMarkerTrackingUpdateVARJO</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEventDataMarkerTrackingUpdateVARJO(@NotNull MemorySegment segment) implements IXrEventDataMarkerTrackingUpdateVARJO {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataMarkerTrackingUpdateVARJO.html"><code>XrEventDataMarkerTrackingUpdateVARJO</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEventDataMarkerTrackingUpdateVARJO}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEventDataMarkerTrackingUpdateVARJO to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEventDataMarkerTrackingUpdateVARJO.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEventDataMarkerTrackingUpdateVARJO, Iterable<XrEventDataMarkerTrackingUpdateVARJO> {
        public long size() {
            return segment.byteSize() / XrEventDataMarkerTrackingUpdateVARJO.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEventDataMarkerTrackingUpdateVARJO at(long index) {
            return new XrEventDataMarkerTrackingUpdateVARJO(segment.asSlice(index * XrEventDataMarkerTrackingUpdateVARJO.BYTES, XrEventDataMarkerTrackingUpdateVARJO.BYTES));
        }

        public void write(long index, @NotNull XrEventDataMarkerTrackingUpdateVARJO value) {
            MemorySegment s = segment.asSlice(index * XrEventDataMarkerTrackingUpdateVARJO.BYTES, XrEventDataMarkerTrackingUpdateVARJO.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEventDataMarkerTrackingUpdateVARJO.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEventDataMarkerTrackingUpdateVARJO.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEventDataMarkerTrackingUpdateVARJO.BYTES,
                (end - start) * XrEventDataMarkerTrackingUpdateVARJO.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEventDataMarkerTrackingUpdateVARJO.BYTES));
        }

        public XrEventDataMarkerTrackingUpdateVARJO[] toArray() {
            XrEventDataMarkerTrackingUpdateVARJO[] ret = new XrEventDataMarkerTrackingUpdateVARJO[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEventDataMarkerTrackingUpdateVARJO> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEventDataMarkerTrackingUpdateVARJO> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEventDataMarkerTrackingUpdateVARJO.BYTES;
            }

            @Override
            public XrEventDataMarkerTrackingUpdateVARJO next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEventDataMarkerTrackingUpdateVARJO ret = new XrEventDataMarkerTrackingUpdateVARJO(segment.asSlice(0, XrEventDataMarkerTrackingUpdateVARJO.BYTES));
                segment = segment.asSlice(XrEventDataMarkerTrackingUpdateVARJO.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEventDataMarkerTrackingUpdateVARJO allocate(Arena arena) {
        XrEventDataMarkerTrackingUpdateVARJO ret = new XrEventDataMarkerTrackingUpdateVARJO(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO);
        return ret;
    }

    public static XrEventDataMarkerTrackingUpdateVARJO.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEventDataMarkerTrackingUpdateVARJO.Ptr ret = new XrEventDataMarkerTrackingUpdateVARJO.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO);
        }
        return ret;
    }

    public static XrEventDataMarkerTrackingUpdateVARJO clone(Arena arena, XrEventDataMarkerTrackingUpdateVARJO src) {
        XrEventDataMarkerTrackingUpdateVARJO ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEventDataMarkerTrackingUpdateVARJO type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEventDataMarkerTrackingUpdateVARJO next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEventDataMarkerTrackingUpdateVARJO next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned long markerId() {
        return segment.get(LAYOUT$markerId, OFFSET$markerId);
    }

    public XrEventDataMarkerTrackingUpdateVARJO markerId(@Unsigned long value) {
        segment.set(LAYOUT$markerId, OFFSET$markerId, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isActive() {
        return segment.get(LAYOUT$isActive, OFFSET$isActive);
    }

    public XrEventDataMarkerTrackingUpdateVARJO isActive(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isActive, OFFSET$isActive, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isPredicted() {
        return segment.get(LAYOUT$isPredicted, OFFSET$isPredicted);
    }

    public XrEventDataMarkerTrackingUpdateVARJO isPredicted(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isPredicted, OFFSET$isPredicted, value);
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrEventDataMarkerTrackingUpdateVARJO time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("markerId"),
        ValueLayout.JAVA_INT.withName("isActive"),
        ValueLayout.JAVA_INT.withName("isPredicted"),
        ValueLayout.JAVA_LONG.withName("time")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$markerId = PathElement.groupElement("markerId");
    public static final PathElement PATH$isActive = PathElement.groupElement("isActive");
    public static final PathElement PATH$isPredicted = PathElement.groupElement("isPredicted");
    public static final PathElement PATH$time = PathElement.groupElement("time");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$markerId = (OfLong) LAYOUT.select(PATH$markerId);
    public static final OfInt LAYOUT$isActive = (OfInt) LAYOUT.select(PATH$isActive);
    public static final OfInt LAYOUT$isPredicted = (OfInt) LAYOUT.select(PATH$isPredicted);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$markerId = LAYOUT$markerId.byteSize();
    public static final long SIZE$isActive = LAYOUT$isActive.byteSize();
    public static final long SIZE$isPredicted = LAYOUT$isPredicted.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$markerId = LAYOUT.byteOffset(PATH$markerId);
    public static final long OFFSET$isActive = LAYOUT.byteOffset(PATH$isActive);
    public static final long OFFSET$isPredicted = LAYOUT.byteOffset(PATH$isPredicted);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
}

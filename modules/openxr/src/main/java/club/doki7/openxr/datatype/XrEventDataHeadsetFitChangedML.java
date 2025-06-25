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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataHeadsetFitChangedML.html"><code>XrEventDataHeadsetFitChangedML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEventDataHeadsetFitChangedML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrHeadsetFitStatusML status; // @link substring="XrHeadsetFitStatusML" target="XrHeadsetFitStatusML" @link substring="status" target="#status"
///     XrTime time; // @link substring="time" target="#time"
/// } XrEventDataHeadsetFitChangedML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML`
///
/// The {@code allocate} ({@link XrEventDataHeadsetFitChangedML#allocate(Arena)}, {@link XrEventDataHeadsetFitChangedML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEventDataHeadsetFitChangedML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataHeadsetFitChangedML.html"><code>XrEventDataHeadsetFitChangedML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEventDataHeadsetFitChangedML(@NotNull MemorySegment segment) implements IXrEventDataHeadsetFitChangedML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataHeadsetFitChangedML.html"><code>XrEventDataHeadsetFitChangedML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEventDataHeadsetFitChangedML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEventDataHeadsetFitChangedML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEventDataHeadsetFitChangedML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEventDataHeadsetFitChangedML, Iterable<XrEventDataHeadsetFitChangedML> {
        public long size() {
            return segment.byteSize() / XrEventDataHeadsetFitChangedML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEventDataHeadsetFitChangedML at(long index) {
            return new XrEventDataHeadsetFitChangedML(segment.asSlice(index * XrEventDataHeadsetFitChangedML.BYTES, XrEventDataHeadsetFitChangedML.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrEventDataHeadsetFitChangedML> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrEventDataHeadsetFitChangedML value) {
            MemorySegment s = segment.asSlice(index * XrEventDataHeadsetFitChangedML.BYTES, XrEventDataHeadsetFitChangedML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEventDataHeadsetFitChangedML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEventDataHeadsetFitChangedML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEventDataHeadsetFitChangedML.BYTES,
                (end - start) * XrEventDataHeadsetFitChangedML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEventDataHeadsetFitChangedML.BYTES));
        }

        public XrEventDataHeadsetFitChangedML[] toArray() {
            XrEventDataHeadsetFitChangedML[] ret = new XrEventDataHeadsetFitChangedML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEventDataHeadsetFitChangedML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEventDataHeadsetFitChangedML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEventDataHeadsetFitChangedML.BYTES;
            }

            @Override
            public XrEventDataHeadsetFitChangedML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEventDataHeadsetFitChangedML ret = new XrEventDataHeadsetFitChangedML(segment.asSlice(0, XrEventDataHeadsetFitChangedML.BYTES));
                segment = segment.asSlice(XrEventDataHeadsetFitChangedML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEventDataHeadsetFitChangedML allocate(Arena arena) {
        XrEventDataHeadsetFitChangedML ret = new XrEventDataHeadsetFitChangedML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.EVENT_DATA_HEADSET_FIT_CHANGED_ML);
        return ret;
    }

    public static XrEventDataHeadsetFitChangedML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEventDataHeadsetFitChangedML.Ptr ret = new XrEventDataHeadsetFitChangedML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.EVENT_DATA_HEADSET_FIT_CHANGED_ML);
        }
        return ret;
    }

    public static XrEventDataHeadsetFitChangedML clone(Arena arena, XrEventDataHeadsetFitChangedML src) {
        XrEventDataHeadsetFitChangedML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.EVENT_DATA_HEADSET_FIT_CHANGED_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEventDataHeadsetFitChangedML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEventDataHeadsetFitChangedML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEventDataHeadsetFitChangedML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrHeadsetFitStatusML.class) int status() {
        return segment.get(LAYOUT$status, OFFSET$status);
    }

    public XrEventDataHeadsetFitChangedML status(@EnumType(XrHeadsetFitStatusML.class) int value) {
        segment.set(LAYOUT$status, OFFSET$status, value);
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrEventDataHeadsetFitChangedML time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("status"),
        ValueLayout.JAVA_LONG.withName("time")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$status = PathElement.groupElement("status");
    public static final PathElement PATH$time = PathElement.groupElement("time");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$status = (OfInt) LAYOUT.select(PATH$status);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$status = LAYOUT$status.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$status = LAYOUT.byteOffset(PATH$status);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrKeyboardTrackingDescriptionFB.html"><code>XrKeyboardTrackingDescriptionFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrKeyboardTrackingDescriptionFB {
///     uint64_t trackedKeyboardId; // @link substring="trackedKeyboardId" target="#trackedKeyboardId"
///     XrVector3f size; // @link substring="XrVector3f" target="XrVector3f" @link substring="size" target="#size"
///     XrKeyboardTrackingFlagsFB flags; // @link substring="XrKeyboardTrackingFlagsFB" target="XrKeyboardTrackingFlagsFB" @link substring="flags" target="#flags"
///     char[XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB] name; // @link substring="name" target="#name"
/// } XrKeyboardTrackingDescriptionFB;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrKeyboardTrackingDescriptionFB.html"><code>XrKeyboardTrackingDescriptionFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrKeyboardTrackingDescriptionFB(@NotNull MemorySegment segment) implements IXrKeyboardTrackingDescriptionFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrKeyboardTrackingDescriptionFB.html"><code>XrKeyboardTrackingDescriptionFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrKeyboardTrackingDescriptionFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrKeyboardTrackingDescriptionFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrKeyboardTrackingDescriptionFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrKeyboardTrackingDescriptionFB, Iterable<XrKeyboardTrackingDescriptionFB> {
        public long size() {
            return segment.byteSize() / XrKeyboardTrackingDescriptionFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrKeyboardTrackingDescriptionFB at(long index) {
            return new XrKeyboardTrackingDescriptionFB(segment.asSlice(index * XrKeyboardTrackingDescriptionFB.BYTES, XrKeyboardTrackingDescriptionFB.BYTES));
        }

        public void write(long index, @NotNull XrKeyboardTrackingDescriptionFB value) {
            MemorySegment s = segment.asSlice(index * XrKeyboardTrackingDescriptionFB.BYTES, XrKeyboardTrackingDescriptionFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrKeyboardTrackingDescriptionFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrKeyboardTrackingDescriptionFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrKeyboardTrackingDescriptionFB.BYTES,
                (end - start) * XrKeyboardTrackingDescriptionFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrKeyboardTrackingDescriptionFB.BYTES));
        }

        public XrKeyboardTrackingDescriptionFB[] toArray() {
            XrKeyboardTrackingDescriptionFB[] ret = new XrKeyboardTrackingDescriptionFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrKeyboardTrackingDescriptionFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrKeyboardTrackingDescriptionFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrKeyboardTrackingDescriptionFB.BYTES;
            }

            @Override
            public XrKeyboardTrackingDescriptionFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrKeyboardTrackingDescriptionFB ret = new XrKeyboardTrackingDescriptionFB(segment.asSlice(0, XrKeyboardTrackingDescriptionFB.BYTES));
                segment = segment.asSlice(XrKeyboardTrackingDescriptionFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrKeyboardTrackingDescriptionFB allocate(Arena arena) {
        return new XrKeyboardTrackingDescriptionFB(arena.allocate(LAYOUT));
    }

    public static XrKeyboardTrackingDescriptionFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrKeyboardTrackingDescriptionFB.Ptr(segment);
    }

    public static XrKeyboardTrackingDescriptionFB clone(Arena arena, XrKeyboardTrackingDescriptionFB src) {
        XrKeyboardTrackingDescriptionFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned long trackedKeyboardId() {
        return segment.get(LAYOUT$trackedKeyboardId, OFFSET$trackedKeyboardId);
    }

    public XrKeyboardTrackingDescriptionFB trackedKeyboardId(@Unsigned long value) {
        segment.set(LAYOUT$trackedKeyboardId, OFFSET$trackedKeyboardId, value);
        return this;
    }

    public @NotNull XrVector3f size() {
        return new XrVector3f(segment.asSlice(OFFSET$size, LAYOUT$size));
    }

    public XrKeyboardTrackingDescriptionFB size(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$size, SIZE$size);
        return this;
    }

    public XrKeyboardTrackingDescriptionFB size(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(size());
        return this;
    }

    public @Bitmask(XrKeyboardTrackingFlagsFB.class) long flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public XrKeyboardTrackingDescriptionFB flags(@Bitmask(XrKeyboardTrackingFlagsFB.class) long value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public BytePtr name() {
        return new BytePtr(nameRaw());
    }

    public XrKeyboardTrackingDescriptionFB name(BytePtr value) {
        MemorySegment s = nameRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment nameRaw() {
        return segment.asSlice(OFFSET$name, SIZE$name);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("trackedKeyboardId"),
        XrVector3f.LAYOUT.withName("size"),
        ValueLayout.JAVA_LONG.withName("flags"),
        MemoryLayout.sequenceLayout(MAX_KEYBOARD_TRACKING_NAME_SIZE_FB, ValueLayout.JAVA_BYTE).withName("name")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$trackedKeyboardId = PathElement.groupElement("trackedKeyboardId");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$name = PathElement.groupElement("name");

    public static final OfLong LAYOUT$trackedKeyboardId = (OfLong) LAYOUT.select(PATH$trackedKeyboardId);
    public static final StructLayout LAYOUT$size = (StructLayout) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$flags = (OfLong) LAYOUT.select(PATH$flags);
    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);

    public static final long SIZE$trackedKeyboardId = LAYOUT$trackedKeyboardId.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();

    public static final long OFFSET$trackedKeyboardId = LAYOUT.byteOffset(PATH$trackedKeyboardId);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
}

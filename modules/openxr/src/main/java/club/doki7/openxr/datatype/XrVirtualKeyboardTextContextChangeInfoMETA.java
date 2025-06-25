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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardTextContextChangeInfoMETA.html"><code>XrVirtualKeyboardTextContextChangeInfoMETA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrVirtualKeyboardTextContextChangeInfoMETA {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     char const* textContext; // @link substring="textContext" target="#textContext"
/// } XrVirtualKeyboardTextContextChangeInfoMETA;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META`
///
/// The {@code allocate} ({@link XrVirtualKeyboardTextContextChangeInfoMETA#allocate(Arena)}, {@link XrVirtualKeyboardTextContextChangeInfoMETA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrVirtualKeyboardTextContextChangeInfoMETA#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardTextContextChangeInfoMETA.html"><code>XrVirtualKeyboardTextContextChangeInfoMETA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrVirtualKeyboardTextContextChangeInfoMETA(@NotNull MemorySegment segment) implements IXrVirtualKeyboardTextContextChangeInfoMETA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardTextContextChangeInfoMETA.html"><code>XrVirtualKeyboardTextContextChangeInfoMETA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrVirtualKeyboardTextContextChangeInfoMETA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrVirtualKeyboardTextContextChangeInfoMETA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrVirtualKeyboardTextContextChangeInfoMETA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrVirtualKeyboardTextContextChangeInfoMETA, Iterable<XrVirtualKeyboardTextContextChangeInfoMETA> {
        public long size() {
            return segment.byteSize() / XrVirtualKeyboardTextContextChangeInfoMETA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrVirtualKeyboardTextContextChangeInfoMETA at(long index) {
            return new XrVirtualKeyboardTextContextChangeInfoMETA(segment.asSlice(index * XrVirtualKeyboardTextContextChangeInfoMETA.BYTES, XrVirtualKeyboardTextContextChangeInfoMETA.BYTES));
        }

        public XrVirtualKeyboardTextContextChangeInfoMETA.Ptr at(long index, @NotNull Consumer<@NotNull XrVirtualKeyboardTextContextChangeInfoMETA> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrVirtualKeyboardTextContextChangeInfoMETA value) {
            MemorySegment s = segment.asSlice(index * XrVirtualKeyboardTextContextChangeInfoMETA.BYTES, XrVirtualKeyboardTextContextChangeInfoMETA.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrVirtualKeyboardTextContextChangeInfoMETA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrVirtualKeyboardTextContextChangeInfoMETA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrVirtualKeyboardTextContextChangeInfoMETA.BYTES,
                (end - start) * XrVirtualKeyboardTextContextChangeInfoMETA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrVirtualKeyboardTextContextChangeInfoMETA.BYTES));
        }

        public XrVirtualKeyboardTextContextChangeInfoMETA[] toArray() {
            XrVirtualKeyboardTextContextChangeInfoMETA[] ret = new XrVirtualKeyboardTextContextChangeInfoMETA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrVirtualKeyboardTextContextChangeInfoMETA> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrVirtualKeyboardTextContextChangeInfoMETA> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrVirtualKeyboardTextContextChangeInfoMETA.BYTES;
            }

            @Override
            public XrVirtualKeyboardTextContextChangeInfoMETA next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrVirtualKeyboardTextContextChangeInfoMETA ret = new XrVirtualKeyboardTextContextChangeInfoMETA(segment.asSlice(0, XrVirtualKeyboardTextContextChangeInfoMETA.BYTES));
                segment = segment.asSlice(XrVirtualKeyboardTextContextChangeInfoMETA.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrVirtualKeyboardTextContextChangeInfoMETA allocate(Arena arena) {
        XrVirtualKeyboardTextContextChangeInfoMETA ret = new XrVirtualKeyboardTextContextChangeInfoMETA(arena.allocate(LAYOUT));
        ret.type(XrStructureType.VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META);
        return ret;
    }

    public static XrVirtualKeyboardTextContextChangeInfoMETA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrVirtualKeyboardTextContextChangeInfoMETA.Ptr ret = new XrVirtualKeyboardTextContextChangeInfoMETA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META);
        }
        return ret;
    }

    public static XrVirtualKeyboardTextContextChangeInfoMETA clone(Arena arena, XrVirtualKeyboardTextContextChangeInfoMETA src) {
        XrVirtualKeyboardTextContextChangeInfoMETA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrVirtualKeyboardTextContextChangeInfoMETA type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrVirtualKeyboardTextContextChangeInfoMETA next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrVirtualKeyboardTextContextChangeInfoMETA next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr textContext() {
        MemorySegment s = textContextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public XrVirtualKeyboardTextContextChangeInfoMETA textContext(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        textContextRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") @NotNull MemorySegment textContextRaw() {
        return segment.get(LAYOUT$textContext, OFFSET$textContext);
    }

    public void textContextRaw(@Pointer(comment="int8_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$textContext, OFFSET$textContext, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("textContext")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$textContext = PathElement.groupElement("textContext");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$textContext = (AddressLayout) LAYOUT.select(PATH$textContext);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$textContext = LAYOUT$textContext.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$textContext = LAYOUT.byteOffset(PATH$textContext);
}

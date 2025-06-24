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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLWin32KHR.html"><code>XrGraphicsBindingOpenGLWin32KHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrGraphicsBindingOpenGLWin32KHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     HDC hDC; // @link substring="hDC" target="#hDC"
///     HGLRC hGLRC; // @link substring="hGLRC" target="#hGLRC"
/// } XrGraphicsBindingOpenGLWin32KHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR`
///
/// The {@code allocate} ({@link XrGraphicsBindingOpenGLWin32KHR#allocate(Arena)}, {@link XrGraphicsBindingOpenGLWin32KHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrGraphicsBindingOpenGLWin32KHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLWin32KHR.html"><code>XrGraphicsBindingOpenGLWin32KHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrGraphicsBindingOpenGLWin32KHR(@NotNull MemorySegment segment) implements IXrGraphicsBindingOpenGLWin32KHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLWin32KHR.html"><code>XrGraphicsBindingOpenGLWin32KHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrGraphicsBindingOpenGLWin32KHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrGraphicsBindingOpenGLWin32KHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrGraphicsBindingOpenGLWin32KHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrGraphicsBindingOpenGLWin32KHR, Iterable<XrGraphicsBindingOpenGLWin32KHR> {
        public long size() {
            return segment.byteSize() / XrGraphicsBindingOpenGLWin32KHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrGraphicsBindingOpenGLWin32KHR at(long index) {
            return new XrGraphicsBindingOpenGLWin32KHR(segment.asSlice(index * XrGraphicsBindingOpenGLWin32KHR.BYTES, XrGraphicsBindingOpenGLWin32KHR.BYTES));
        }

        public void write(long index, @NotNull XrGraphicsBindingOpenGLWin32KHR value) {
            MemorySegment s = segment.asSlice(index * XrGraphicsBindingOpenGLWin32KHR.BYTES, XrGraphicsBindingOpenGLWin32KHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrGraphicsBindingOpenGLWin32KHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrGraphicsBindingOpenGLWin32KHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrGraphicsBindingOpenGLWin32KHR.BYTES,
                (end - start) * XrGraphicsBindingOpenGLWin32KHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrGraphicsBindingOpenGLWin32KHR.BYTES));
        }

        public XrGraphicsBindingOpenGLWin32KHR[] toArray() {
            XrGraphicsBindingOpenGLWin32KHR[] ret = new XrGraphicsBindingOpenGLWin32KHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrGraphicsBindingOpenGLWin32KHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrGraphicsBindingOpenGLWin32KHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrGraphicsBindingOpenGLWin32KHR.BYTES;
            }

            @Override
            public XrGraphicsBindingOpenGLWin32KHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrGraphicsBindingOpenGLWin32KHR ret = new XrGraphicsBindingOpenGLWin32KHR(segment.asSlice(0, XrGraphicsBindingOpenGLWin32KHR.BYTES));
                segment = segment.asSlice(XrGraphicsBindingOpenGLWin32KHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrGraphicsBindingOpenGLWin32KHR allocate(Arena arena) {
        XrGraphicsBindingOpenGLWin32KHR ret = new XrGraphicsBindingOpenGLWin32KHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR);
        return ret;
    }

    public static XrGraphicsBindingOpenGLWin32KHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrGraphicsBindingOpenGLWin32KHR.Ptr ret = new XrGraphicsBindingOpenGLWin32KHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR);
        }
        return ret;
    }

    public static XrGraphicsBindingOpenGLWin32KHR clone(Arena arena, XrGraphicsBindingOpenGLWin32KHR src) {
        XrGraphicsBindingOpenGLWin32KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrGraphicsBindingOpenGLWin32KHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrGraphicsBindingOpenGLWin32KHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrGraphicsBindingOpenGLWin32KHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="HDC") @NotNull MemorySegment hDC() {
        return segment.get(LAYOUT$hDC, OFFSET$hDC);
    }

    public XrGraphicsBindingOpenGLWin32KHR hDC(@Pointer(comment="HDC") @NotNull MemorySegment value) {
        segment.set(LAYOUT$hDC, OFFSET$hDC, value);
        return this;
    }

    public XrGraphicsBindingOpenGLWin32KHR hDC(@Nullable IPointer pointer) {
        hDC(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="HGLRC") @NotNull MemorySegment hGLRC() {
        return segment.get(LAYOUT$hGLRC, OFFSET$hGLRC);
    }

    public XrGraphicsBindingOpenGLWin32KHR hGLRC(@Pointer(comment="HGLRC") @NotNull MemorySegment value) {
        segment.set(LAYOUT$hGLRC, OFFSET$hGLRC, value);
        return this;
    }

    public XrGraphicsBindingOpenGLWin32KHR hGLRC(@Nullable IPointer pointer) {
        hGLRC(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("hDC"),
        ValueLayout.ADDRESS.withName("hGLRC")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$hDC = PathElement.groupElement("hDC");
    public static final PathElement PATH$hGLRC = PathElement.groupElement("hGLRC");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$hDC = (AddressLayout) LAYOUT.select(PATH$hDC);
    public static final AddressLayout LAYOUT$hGLRC = (AddressLayout) LAYOUT.select(PATH$hGLRC);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$hDC = LAYOUT$hDC.byteSize();
    public static final long SIZE$hGLRC = LAYOUT$hGLRC.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$hDC = LAYOUT.byteOffset(PATH$hDC);
    public static final long OFFSET$hGLRC = LAYOUT.byteOffset(PATH$hGLRC);
}

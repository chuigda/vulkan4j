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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLXcbKHR.html"><code>XrGraphicsBindingOpenGLXcbKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrGraphicsBindingOpenGLXcbKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     xcb_connection_t* connection; // @link substring="connection" target="#connection"
///     uint32_t screenNumber; // @link substring="screenNumber" target="#screenNumber"
///     xcb_glx_fbconfig_t fbconfigid; // @link substring="fbconfigid" target="#fbconfigid"
///     xcb_visualid_t visualid; // @link substring="visualid" target="#visualid"
///     xcb_glx_drawable_t glxDrawable; // @link substring="glxDrawable" target="#glxDrawable"
///     xcb_glx_context_t glxContext; // @link substring="glxContext" target="#glxContext"
/// } XrGraphicsBindingOpenGLXcbKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR`
///
/// The {@code allocate} ({@link XrGraphicsBindingOpenGLXcbKHR#allocate(Arena)}, {@link XrGraphicsBindingOpenGLXcbKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrGraphicsBindingOpenGLXcbKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLXcbKHR.html"><code>XrGraphicsBindingOpenGLXcbKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrGraphicsBindingOpenGLXcbKHR(@NotNull MemorySegment segment) implements IXrGraphicsBindingOpenGLXcbKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLXcbKHR.html"><code>XrGraphicsBindingOpenGLXcbKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrGraphicsBindingOpenGLXcbKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrGraphicsBindingOpenGLXcbKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrGraphicsBindingOpenGLXcbKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrGraphicsBindingOpenGLXcbKHR, Iterable<XrGraphicsBindingOpenGLXcbKHR> {
        public long size() {
            return segment.byteSize() / XrGraphicsBindingOpenGLXcbKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrGraphicsBindingOpenGLXcbKHR at(long index) {
            return new XrGraphicsBindingOpenGLXcbKHR(segment.asSlice(index * XrGraphicsBindingOpenGLXcbKHR.BYTES, XrGraphicsBindingOpenGLXcbKHR.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrGraphicsBindingOpenGLXcbKHR> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrGraphicsBindingOpenGLXcbKHR value) {
            MemorySegment s = segment.asSlice(index * XrGraphicsBindingOpenGLXcbKHR.BYTES, XrGraphicsBindingOpenGLXcbKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrGraphicsBindingOpenGLXcbKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrGraphicsBindingOpenGLXcbKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrGraphicsBindingOpenGLXcbKHR.BYTES,
                (end - start) * XrGraphicsBindingOpenGLXcbKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrGraphicsBindingOpenGLXcbKHR.BYTES));
        }

        public XrGraphicsBindingOpenGLXcbKHR[] toArray() {
            XrGraphicsBindingOpenGLXcbKHR[] ret = new XrGraphicsBindingOpenGLXcbKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrGraphicsBindingOpenGLXcbKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrGraphicsBindingOpenGLXcbKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrGraphicsBindingOpenGLXcbKHR.BYTES;
            }

            @Override
            public XrGraphicsBindingOpenGLXcbKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrGraphicsBindingOpenGLXcbKHR ret = new XrGraphicsBindingOpenGLXcbKHR(segment.asSlice(0, XrGraphicsBindingOpenGLXcbKHR.BYTES));
                segment = segment.asSlice(XrGraphicsBindingOpenGLXcbKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrGraphicsBindingOpenGLXcbKHR allocate(Arena arena) {
        XrGraphicsBindingOpenGLXcbKHR ret = new XrGraphicsBindingOpenGLXcbKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.GRAPHICS_BINDING_OPENGL_XCB_KHR);
        return ret;
    }

    public static XrGraphicsBindingOpenGLXcbKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrGraphicsBindingOpenGLXcbKHR.Ptr ret = new XrGraphicsBindingOpenGLXcbKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.GRAPHICS_BINDING_OPENGL_XCB_KHR);
        }
        return ret;
    }

    public static XrGraphicsBindingOpenGLXcbKHR clone(Arena arena, XrGraphicsBindingOpenGLXcbKHR src) {
        XrGraphicsBindingOpenGLXcbKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.GRAPHICS_BINDING_OPENGL_XCB_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrGraphicsBindingOpenGLXcbKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrGraphicsBindingOpenGLXcbKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrGraphicsBindingOpenGLXcbKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment connection() {
        return segment.get(LAYOUT$connection, OFFSET$connection);
    }

    public XrGraphicsBindingOpenGLXcbKHR connection(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$connection, OFFSET$connection, value);
        return this;
    }

    public XrGraphicsBindingOpenGLXcbKHR connection(@Nullable IPointer pointer) {
        connection(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int screenNumber() {
        return segment.get(LAYOUT$screenNumber, OFFSET$screenNumber);
    }

    public XrGraphicsBindingOpenGLXcbKHR screenNumber(@Unsigned int value) {
        segment.set(LAYOUT$screenNumber, OFFSET$screenNumber, value);
        return this;
    }

    public @NativeType("xcb_glx_fbconfig_t") @Unsigned int fbconfigid() {
        return segment.get(LAYOUT$fbconfigid, OFFSET$fbconfigid);
    }

    public XrGraphicsBindingOpenGLXcbKHR fbconfigid(@NativeType("xcb_glx_fbconfig_t") @Unsigned int value) {
        segment.set(LAYOUT$fbconfigid, OFFSET$fbconfigid, value);
        return this;
    }

    public @NativeType("xcb_visualid_t") @Unsigned int visualid() {
        return segment.get(LAYOUT$visualid, OFFSET$visualid);
    }

    public XrGraphicsBindingOpenGLXcbKHR visualid(@NativeType("xcb_visualid_t") @Unsigned int value) {
        segment.set(LAYOUT$visualid, OFFSET$visualid, value);
        return this;
    }

    public @NativeType("xcb_glx_drawable_t") @Unsigned int glxDrawable() {
        return segment.get(LAYOUT$glxDrawable, OFFSET$glxDrawable);
    }

    public XrGraphicsBindingOpenGLXcbKHR glxDrawable(@NativeType("xcb_glx_drawable_t") @Unsigned int value) {
        segment.set(LAYOUT$glxDrawable, OFFSET$glxDrawable, value);
        return this;
    }

    public @NativeType("xcb_glx_context_t") @Unsigned int glxContext() {
        return segment.get(LAYOUT$glxContext, OFFSET$glxContext);
    }

    public XrGraphicsBindingOpenGLXcbKHR glxContext(@NativeType("xcb_glx_context_t") @Unsigned int value) {
        segment.set(LAYOUT$glxContext, OFFSET$glxContext, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("connection"),
        ValueLayout.JAVA_INT.withName("screenNumber"),
        ValueLayout.JAVA_INT.withName("fbconfigid"),
        ValueLayout.JAVA_INT.withName("visualid"),
        ValueLayout.JAVA_INT.withName("glxDrawable"),
        ValueLayout.JAVA_INT.withName("glxContext")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$connection = PathElement.groupElement("connection");
    public static final PathElement PATH$screenNumber = PathElement.groupElement("screenNumber");
    public static final PathElement PATH$fbconfigid = PathElement.groupElement("fbconfigid");
    public static final PathElement PATH$visualid = PathElement.groupElement("visualid");
    public static final PathElement PATH$glxDrawable = PathElement.groupElement("glxDrawable");
    public static final PathElement PATH$glxContext = PathElement.groupElement("glxContext");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$connection = (AddressLayout) LAYOUT.select(PATH$connection);
    public static final OfInt LAYOUT$screenNumber = (OfInt) LAYOUT.select(PATH$screenNumber);
    public static final OfInt LAYOUT$fbconfigid = (OfInt) LAYOUT.select(PATH$fbconfigid);
    public static final OfInt LAYOUT$visualid = (OfInt) LAYOUT.select(PATH$visualid);
    public static final OfInt LAYOUT$glxDrawable = (OfInt) LAYOUT.select(PATH$glxDrawable);
    public static final OfInt LAYOUT$glxContext = (OfInt) LAYOUT.select(PATH$glxContext);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$connection = LAYOUT$connection.byteSize();
    public static final long SIZE$screenNumber = LAYOUT$screenNumber.byteSize();
    public static final long SIZE$fbconfigid = LAYOUT$fbconfigid.byteSize();
    public static final long SIZE$visualid = LAYOUT$visualid.byteSize();
    public static final long SIZE$glxDrawable = LAYOUT$glxDrawable.byteSize();
    public static final long SIZE$glxContext = LAYOUT$glxContext.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$connection = LAYOUT.byteOffset(PATH$connection);
    public static final long OFFSET$screenNumber = LAYOUT.byteOffset(PATH$screenNumber);
    public static final long OFFSET$fbconfigid = LAYOUT.byteOffset(PATH$fbconfigid);
    public static final long OFFSET$visualid = LAYOUT.byteOffset(PATH$visualid);
    public static final long OFFSET$glxDrawable = LAYOUT.byteOffset(PATH$glxDrawable);
    public static final long OFFSET$glxContext = LAYOUT.byteOffset(PATH$glxContext);
}

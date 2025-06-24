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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLXlibKHR.html"><code>XrGraphicsBindingOpenGLXlibKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrGraphicsBindingOpenGLXlibKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     Display* xDisplay; // @link substring="xDisplay" target="#xDisplay"
///     uint32_t visualid; // @link substring="visualid" target="#visualid"
///     GLXFBConfig glxFBConfig; // @link substring="glxFBConfig" target="#glxFBConfig"
///     GLXDrawable glxDrawable; // @link substring="glxDrawable" target="#glxDrawable"
///     GLXContext glxContext; // @link substring="glxContext" target="#glxContext"
/// } XrGraphicsBindingOpenGLXlibKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR`
///
/// The {@code allocate} ({@link XrGraphicsBindingOpenGLXlibKHR#allocate(Arena)}, {@link XrGraphicsBindingOpenGLXlibKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrGraphicsBindingOpenGLXlibKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLXlibKHR.html"><code>XrGraphicsBindingOpenGLXlibKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrGraphicsBindingOpenGLXlibKHR(@NotNull MemorySegment segment) implements IXrGraphicsBindingOpenGLXlibKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLXlibKHR.html"><code>XrGraphicsBindingOpenGLXlibKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrGraphicsBindingOpenGLXlibKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrGraphicsBindingOpenGLXlibKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrGraphicsBindingOpenGLXlibKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrGraphicsBindingOpenGLXlibKHR, Iterable<XrGraphicsBindingOpenGLXlibKHR> {
        public long size() {
            return segment.byteSize() / XrGraphicsBindingOpenGLXlibKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrGraphicsBindingOpenGLXlibKHR at(long index) {
            return new XrGraphicsBindingOpenGLXlibKHR(segment.asSlice(index * XrGraphicsBindingOpenGLXlibKHR.BYTES, XrGraphicsBindingOpenGLXlibKHR.BYTES));
        }

        public void write(long index, @NotNull XrGraphicsBindingOpenGLXlibKHR value) {
            MemorySegment s = segment.asSlice(index * XrGraphicsBindingOpenGLXlibKHR.BYTES, XrGraphicsBindingOpenGLXlibKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrGraphicsBindingOpenGLXlibKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrGraphicsBindingOpenGLXlibKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrGraphicsBindingOpenGLXlibKHR.BYTES,
                (end - start) * XrGraphicsBindingOpenGLXlibKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrGraphicsBindingOpenGLXlibKHR.BYTES));
        }

        public XrGraphicsBindingOpenGLXlibKHR[] toArray() {
            XrGraphicsBindingOpenGLXlibKHR[] ret = new XrGraphicsBindingOpenGLXlibKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrGraphicsBindingOpenGLXlibKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrGraphicsBindingOpenGLXlibKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrGraphicsBindingOpenGLXlibKHR.BYTES;
            }

            @Override
            public XrGraphicsBindingOpenGLXlibKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrGraphicsBindingOpenGLXlibKHR ret = new XrGraphicsBindingOpenGLXlibKHR(segment.asSlice(0, XrGraphicsBindingOpenGLXlibKHR.BYTES));
                segment = segment.asSlice(XrGraphicsBindingOpenGLXlibKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrGraphicsBindingOpenGLXlibKHR allocate(Arena arena) {
        XrGraphicsBindingOpenGLXlibKHR ret = new XrGraphicsBindingOpenGLXlibKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR);
        return ret;
    }

    public static XrGraphicsBindingOpenGLXlibKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrGraphicsBindingOpenGLXlibKHR.Ptr ret = new XrGraphicsBindingOpenGLXlibKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR);
        }
        return ret;
    }

    public static XrGraphicsBindingOpenGLXlibKHR clone(Arena arena, XrGraphicsBindingOpenGLXlibKHR src) {
        XrGraphicsBindingOpenGLXlibKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrGraphicsBindingOpenGLXlibKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrGraphicsBindingOpenGLXlibKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrGraphicsBindingOpenGLXlibKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr xDisplay() {
        MemorySegment s = xDisplayRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public XrGraphicsBindingOpenGLXlibKHR xDisplay(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        xDisplayRaw(s);
        return this;
    }

    public @Pointer(comment="Display*") @NotNull MemorySegment xDisplayRaw() {
        return segment.get(LAYOUT$xDisplay, OFFSET$xDisplay);
    }

    public void xDisplayRaw(@Pointer(comment="Display*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$xDisplay, OFFSET$xDisplay, value);
    }

    public @Unsigned int visualid() {
        return segment.get(LAYOUT$visualid, OFFSET$visualid);
    }

    public XrGraphicsBindingOpenGLXlibKHR visualid(@Unsigned int value) {
        segment.set(LAYOUT$visualid, OFFSET$visualid, value);
        return this;
    }

    public @Pointer(comment="GLXFBConfig") @NotNull MemorySegment glxFBConfig() {
        return segment.get(LAYOUT$glxFBConfig, OFFSET$glxFBConfig);
    }

    public XrGraphicsBindingOpenGLXlibKHR glxFBConfig(@Pointer(comment="GLXFBConfig") @NotNull MemorySegment value) {
        segment.set(LAYOUT$glxFBConfig, OFFSET$glxFBConfig, value);
        return this;
    }

    public XrGraphicsBindingOpenGLXlibKHR glxFBConfig(@Nullable IPointer pointer) {
        glxFBConfig(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public long glxDrawable() {
        return NativeLayout.readCLong(segment, OFFSET$glxDrawable);
    }

    public XrGraphicsBindingOpenGLXlibKHR glxDrawable(long value) {
        NativeLayout.writeCLong(segment, OFFSET$glxDrawable, value);
        return this;
    }

    public @Pointer(comment="GLXContext") @NotNull MemorySegment glxContext() {
        return segment.get(LAYOUT$glxContext, OFFSET$glxContext);
    }

    public XrGraphicsBindingOpenGLXlibKHR glxContext(@Pointer(comment="GLXContext") @NotNull MemorySegment value) {
        segment.set(LAYOUT$glxContext, OFFSET$glxContext, value);
        return this;
    }

    public XrGraphicsBindingOpenGLXlibKHR glxContext(@Nullable IPointer pointer) {
        glxContext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("xDisplay"),
        ValueLayout.JAVA_INT.withName("visualid"),
        ValueLayout.ADDRESS.withName("glxFBConfig"),
        NativeLayout.C_LONG.withName("glxDrawable"),
        ValueLayout.ADDRESS.withName("glxContext")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$xDisplay = PathElement.groupElement("xDisplay");
    public static final PathElement PATH$visualid = PathElement.groupElement("visualid");
    public static final PathElement PATH$glxFBConfig = PathElement.groupElement("glxFBConfig");
    public static final PathElement PATH$glxDrawable = PathElement.groupElement("glxDrawable");
    public static final PathElement PATH$glxContext = PathElement.groupElement("glxContext");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$xDisplay = (AddressLayout) LAYOUT.select(PATH$xDisplay);
    public static final OfInt LAYOUT$visualid = (OfInt) LAYOUT.select(PATH$visualid);
    public static final AddressLayout LAYOUT$glxFBConfig = (AddressLayout) LAYOUT.select(PATH$glxFBConfig);
    public static final AddressLayout LAYOUT$glxContext = (AddressLayout) LAYOUT.select(PATH$glxContext);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$xDisplay = LAYOUT$xDisplay.byteSize();
    public static final long SIZE$visualid = LAYOUT$visualid.byteSize();
    public static final long SIZE$glxFBConfig = LAYOUT$glxFBConfig.byteSize();
    public static final long SIZE$glxDrawable = NativeLayout.C_LONG.byteSize();
    public static final long SIZE$glxContext = LAYOUT$glxContext.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$xDisplay = LAYOUT.byteOffset(PATH$xDisplay);
    public static final long OFFSET$visualid = LAYOUT.byteOffset(PATH$visualid);
    public static final long OFFSET$glxFBConfig = LAYOUT.byteOffset(PATH$glxFBConfig);
    public static final long OFFSET$glxDrawable = LAYOUT.byteOffset(PATH$glxDrawable);
    public static final long OFFSET$glxContext = LAYOUT.byteOffset(PATH$glxContext);
}

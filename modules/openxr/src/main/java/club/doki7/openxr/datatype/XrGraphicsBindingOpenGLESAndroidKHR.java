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
import club.doki7.openxr.XRFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLESAndroidKHR.html"><code>XrGraphicsBindingOpenGLESAndroidKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrGraphicsBindingOpenGLESAndroidKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     EGLDisplay display; // @link substring="display" target="#display"
///     EGLConfig config; // @link substring="config" target="#config"
///     EGLContext context; // @link substring="context" target="#context"
/// } XrGraphicsBindingOpenGLESAndroidKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR`
///
/// The {@code allocate} ({@link XrGraphicsBindingOpenGLESAndroidKHR#allocate(Arena)}, {@link XrGraphicsBindingOpenGLESAndroidKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrGraphicsBindingOpenGLESAndroidKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLESAndroidKHR.html"><code>XrGraphicsBindingOpenGLESAndroidKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrGraphicsBindingOpenGLESAndroidKHR(@NotNull MemorySegment segment) implements IXrGraphicsBindingOpenGLESAndroidKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingOpenGLESAndroidKHR.html"><code>XrGraphicsBindingOpenGLESAndroidKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrGraphicsBindingOpenGLESAndroidKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrGraphicsBindingOpenGLESAndroidKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrGraphicsBindingOpenGLESAndroidKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrGraphicsBindingOpenGLESAndroidKHR, Iterable<XrGraphicsBindingOpenGLESAndroidKHR> {
        public long size() {
            return segment.byteSize() / XrGraphicsBindingOpenGLESAndroidKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrGraphicsBindingOpenGLESAndroidKHR at(long index) {
            return new XrGraphicsBindingOpenGLESAndroidKHR(segment.asSlice(index * XrGraphicsBindingOpenGLESAndroidKHR.BYTES, XrGraphicsBindingOpenGLESAndroidKHR.BYTES));
        }

        public XrGraphicsBindingOpenGLESAndroidKHR.Ptr at(long index, @NotNull Consumer<@NotNull XrGraphicsBindingOpenGLESAndroidKHR> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrGraphicsBindingOpenGLESAndroidKHR value) {
            MemorySegment s = segment.asSlice(index * XrGraphicsBindingOpenGLESAndroidKHR.BYTES, XrGraphicsBindingOpenGLESAndroidKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrGraphicsBindingOpenGLESAndroidKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrGraphicsBindingOpenGLESAndroidKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrGraphicsBindingOpenGLESAndroidKHR.BYTES,
                (end - start) * XrGraphicsBindingOpenGLESAndroidKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrGraphicsBindingOpenGLESAndroidKHR.BYTES));
        }

        public XrGraphicsBindingOpenGLESAndroidKHR[] toArray() {
            XrGraphicsBindingOpenGLESAndroidKHR[] ret = new XrGraphicsBindingOpenGLESAndroidKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrGraphicsBindingOpenGLESAndroidKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrGraphicsBindingOpenGLESAndroidKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrGraphicsBindingOpenGLESAndroidKHR.BYTES;
            }

            @Override
            public XrGraphicsBindingOpenGLESAndroidKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrGraphicsBindingOpenGLESAndroidKHR ret = new XrGraphicsBindingOpenGLESAndroidKHR(segment.asSlice(0, XrGraphicsBindingOpenGLESAndroidKHR.BYTES));
                segment = segment.asSlice(XrGraphicsBindingOpenGLESAndroidKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrGraphicsBindingOpenGLESAndroidKHR allocate(Arena arena) {
        XrGraphicsBindingOpenGLESAndroidKHR ret = new XrGraphicsBindingOpenGLESAndroidKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR);
        return ret;
    }

    public static XrGraphicsBindingOpenGLESAndroidKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrGraphicsBindingOpenGLESAndroidKHR.Ptr ret = new XrGraphicsBindingOpenGLESAndroidKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR);
        }
        return ret;
    }

    public static XrGraphicsBindingOpenGLESAndroidKHR clone(Arena arena, XrGraphicsBindingOpenGLESAndroidKHR src) {
        XrGraphicsBindingOpenGLESAndroidKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrGraphicsBindingOpenGLESAndroidKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrGraphicsBindingOpenGLESAndroidKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrGraphicsBindingOpenGLESAndroidKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="EGLDisplay") @NotNull MemorySegment display() {
        return segment.get(LAYOUT$display, OFFSET$display);
    }

    public XrGraphicsBindingOpenGLESAndroidKHR display(@Pointer(comment="EGLDisplay") @NotNull MemorySegment value) {
        segment.set(LAYOUT$display, OFFSET$display, value);
        return this;
    }

    public XrGraphicsBindingOpenGLESAndroidKHR display(@Nullable IPointer pointer) {
        display(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="EGLConfig") @NotNull MemorySegment config() {
        return segment.get(LAYOUT$config, OFFSET$config);
    }

    public XrGraphicsBindingOpenGLESAndroidKHR config(@Pointer(comment="EGLConfig") @NotNull MemorySegment value) {
        segment.set(LAYOUT$config, OFFSET$config, value);
        return this;
    }

    public XrGraphicsBindingOpenGLESAndroidKHR config(@Nullable IPointer pointer) {
        config(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="EGLContext") @NotNull MemorySegment context() {
        return segment.get(LAYOUT$context, OFFSET$context);
    }

    public XrGraphicsBindingOpenGLESAndroidKHR context(@Pointer(comment="EGLContext") @NotNull MemorySegment value) {
        segment.set(LAYOUT$context, OFFSET$context, value);
        return this;
    }

    public XrGraphicsBindingOpenGLESAndroidKHR context(@Nullable IPointer pointer) {
        context(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.ADDRESS.withName("config"),
        ValueLayout.ADDRESS.withName("context")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$display = PathElement.groupElement("display");
    public static final PathElement PATH$config = PathElement.groupElement("config");
    public static final PathElement PATH$context = PathElement.groupElement("context");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$display = (AddressLayout) LAYOUT.select(PATH$display);
    public static final AddressLayout LAYOUT$config = (AddressLayout) LAYOUT.select(PATH$config);
    public static final AddressLayout LAYOUT$context = (AddressLayout) LAYOUT.select(PATH$context);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$display = LAYOUT$display.byteSize();
    public static final long SIZE$config = LAYOUT$config.byteSize();
    public static final long SIZE$context = LAYOUT$context.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$display = LAYOUT.byteOffset(PATH$display);
    public static final long OFFSET$config = LAYOUT.byteOffset(PATH$config);
    public static final long OFFSET$context = LAYOUT.byteOffset(PATH$context);
}

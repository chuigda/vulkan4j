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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInstanceCreateInfoAndroidKHR.html"><code>XrInstanceCreateInfoAndroidKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrInstanceCreateInfoAndroidKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     void* applicationVM; // @link substring="applicationVM" target="#applicationVM"
///     void* applicationActivity; // @link substring="applicationActivity" target="#applicationActivity"
/// } XrInstanceCreateInfoAndroidKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR`
///
/// The {@code allocate} ({@link XrInstanceCreateInfoAndroidKHR#allocate(Arena)}, {@link XrInstanceCreateInfoAndroidKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrInstanceCreateInfoAndroidKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInstanceCreateInfoAndroidKHR.html"><code>XrInstanceCreateInfoAndroidKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrInstanceCreateInfoAndroidKHR(@NotNull MemorySegment segment) implements IXrInstanceCreateInfoAndroidKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInstanceCreateInfoAndroidKHR.html"><code>XrInstanceCreateInfoAndroidKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrInstanceCreateInfoAndroidKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrInstanceCreateInfoAndroidKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrInstanceCreateInfoAndroidKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrInstanceCreateInfoAndroidKHR, Iterable<XrInstanceCreateInfoAndroidKHR> {
        public long size() {
            return segment.byteSize() / XrInstanceCreateInfoAndroidKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrInstanceCreateInfoAndroidKHR at(long index) {
            return new XrInstanceCreateInfoAndroidKHR(segment.asSlice(index * XrInstanceCreateInfoAndroidKHR.BYTES, XrInstanceCreateInfoAndroidKHR.BYTES));
        }

        public XrInstanceCreateInfoAndroidKHR.Ptr at(long index, @NotNull Consumer<@NotNull XrInstanceCreateInfoAndroidKHR> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrInstanceCreateInfoAndroidKHR value) {
            MemorySegment s = segment.asSlice(index * XrInstanceCreateInfoAndroidKHR.BYTES, XrInstanceCreateInfoAndroidKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrInstanceCreateInfoAndroidKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrInstanceCreateInfoAndroidKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrInstanceCreateInfoAndroidKHR.BYTES,
                (end - start) * XrInstanceCreateInfoAndroidKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrInstanceCreateInfoAndroidKHR.BYTES));
        }

        public XrInstanceCreateInfoAndroidKHR[] toArray() {
            XrInstanceCreateInfoAndroidKHR[] ret = new XrInstanceCreateInfoAndroidKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrInstanceCreateInfoAndroidKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrInstanceCreateInfoAndroidKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrInstanceCreateInfoAndroidKHR.BYTES;
            }

            @Override
            public XrInstanceCreateInfoAndroidKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrInstanceCreateInfoAndroidKHR ret = new XrInstanceCreateInfoAndroidKHR(segment.asSlice(0, XrInstanceCreateInfoAndroidKHR.BYTES));
                segment = segment.asSlice(XrInstanceCreateInfoAndroidKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrInstanceCreateInfoAndroidKHR allocate(Arena arena) {
        XrInstanceCreateInfoAndroidKHR ret = new XrInstanceCreateInfoAndroidKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.INSTANCE_CREATE_INFO_ANDROID_KHR);
        return ret;
    }

    public static XrInstanceCreateInfoAndroidKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrInstanceCreateInfoAndroidKHR.Ptr ret = new XrInstanceCreateInfoAndroidKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.INSTANCE_CREATE_INFO_ANDROID_KHR);
        }
        return ret;
    }

    public static XrInstanceCreateInfoAndroidKHR clone(Arena arena, XrInstanceCreateInfoAndroidKHR src) {
        XrInstanceCreateInfoAndroidKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.INSTANCE_CREATE_INFO_ANDROID_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrInstanceCreateInfoAndroidKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrInstanceCreateInfoAndroidKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrInstanceCreateInfoAndroidKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment applicationVM() {
        return segment.get(LAYOUT$applicationVM, OFFSET$applicationVM);
    }

    public XrInstanceCreateInfoAndroidKHR applicationVM(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$applicationVM, OFFSET$applicationVM, value);
        return this;
    }

    public XrInstanceCreateInfoAndroidKHR applicationVM(@Nullable IPointer pointer) {
        applicationVM(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment applicationActivity() {
        return segment.get(LAYOUT$applicationActivity, OFFSET$applicationActivity);
    }

    public XrInstanceCreateInfoAndroidKHR applicationActivity(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$applicationActivity, OFFSET$applicationActivity, value);
        return this;
    }

    public XrInstanceCreateInfoAndroidKHR applicationActivity(@Nullable IPointer pointer) {
        applicationActivity(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("applicationVM"),
        ValueLayout.ADDRESS.withName("applicationActivity")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$applicationVM = PathElement.groupElement("applicationVM");
    public static final PathElement PATH$applicationActivity = PathElement.groupElement("applicationActivity");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$applicationVM = (AddressLayout) LAYOUT.select(PATH$applicationVM);
    public static final AddressLayout LAYOUT$applicationActivity = (AddressLayout) LAYOUT.select(PATH$applicationActivity);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$applicationVM = LAYOUT$applicationVM.byteSize();
    public static final long SIZE$applicationActivity = LAYOUT$applicationActivity.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$applicationVM = LAYOUT.byteOffset(PATH$applicationVM);
    public static final long OFFSET$applicationActivity = LAYOUT.byteOffset(PATH$applicationActivity);
}

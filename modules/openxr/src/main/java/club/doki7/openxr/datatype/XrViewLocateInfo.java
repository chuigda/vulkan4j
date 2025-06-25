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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViewLocateInfo.html"><code>XrViewLocateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrViewLocateInfo {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrViewConfigurationType viewConfigurationType; // @link substring="XrViewConfigurationType" target="XrViewConfigurationType" @link substring="viewConfigurationType" target="#viewConfigurationType"
///     XrTime displayTime; // @link substring="displayTime" target="#displayTime"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
/// } XrViewLocateInfo;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_VIEW_LOCATE_INFO`
///
/// The {@code allocate} ({@link XrViewLocateInfo#allocate(Arena)}, {@link XrViewLocateInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrViewLocateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViewLocateInfo.html"><code>XrViewLocateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrViewLocateInfo(@NotNull MemorySegment segment) implements IXrViewLocateInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViewLocateInfo.html"><code>XrViewLocateInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrViewLocateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrViewLocateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrViewLocateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrViewLocateInfo, Iterable<XrViewLocateInfo> {
        public long size() {
            return segment.byteSize() / XrViewLocateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrViewLocateInfo at(long index) {
            return new XrViewLocateInfo(segment.asSlice(index * XrViewLocateInfo.BYTES, XrViewLocateInfo.BYTES));
        }

        public void write(long index, @NotNull XrViewLocateInfo value) {
            MemorySegment s = segment.asSlice(index * XrViewLocateInfo.BYTES, XrViewLocateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrViewLocateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrViewLocateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrViewLocateInfo.BYTES,
                (end - start) * XrViewLocateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrViewLocateInfo.BYTES));
        }

        public XrViewLocateInfo[] toArray() {
            XrViewLocateInfo[] ret = new XrViewLocateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrViewLocateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrViewLocateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrViewLocateInfo.BYTES;
            }

            @Override
            public XrViewLocateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrViewLocateInfo ret = new XrViewLocateInfo(segment.asSlice(0, XrViewLocateInfo.BYTES));
                segment = segment.asSlice(XrViewLocateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrViewLocateInfo allocate(Arena arena) {
        XrViewLocateInfo ret = new XrViewLocateInfo(arena.allocate(LAYOUT));
        ret.type(XrStructureType.VIEW_LOCATE_INFO);
        return ret;
    }

    public static XrViewLocateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrViewLocateInfo.Ptr ret = new XrViewLocateInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.VIEW_LOCATE_INFO);
        }
        return ret;
    }

    public static XrViewLocateInfo clone(Arena arena, XrViewLocateInfo src) {
        XrViewLocateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.VIEW_LOCATE_INFO);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrViewLocateInfo type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrViewLocateInfo next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrViewLocateInfo next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrViewConfigurationType.class) int viewConfigurationType() {
        return segment.get(LAYOUT$viewConfigurationType, OFFSET$viewConfigurationType);
    }

    public XrViewLocateInfo viewConfigurationType(@EnumType(XrViewConfigurationType.class) int value) {
        segment.set(LAYOUT$viewConfigurationType, OFFSET$viewConfigurationType, value);
        return this;
    }

    public @NativeType("XrTime") long displayTime() {
        return segment.get(LAYOUT$displayTime, OFFSET$displayTime);
    }

    public XrViewLocateInfo displayTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$displayTime, OFFSET$displayTime, value);
        return this;
    }

    public @Nullable XrSpace space() {
        MemorySegment s = segment.asSlice(OFFSET$space, SIZE$space);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrViewLocateInfo space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("viewConfigurationType"),
        ValueLayout.JAVA_LONG.withName("displayTime"),
        ValueLayout.ADDRESS.withName("space")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$viewConfigurationType = PathElement.groupElement("viewConfigurationType");
    public static final PathElement PATH$displayTime = PathElement.groupElement("displayTime");
    public static final PathElement PATH$space = PathElement.groupElement("space");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$viewConfigurationType = (OfInt) LAYOUT.select(PATH$viewConfigurationType);
    public static final OfLong LAYOUT$displayTime = (OfLong) LAYOUT.select(PATH$displayTime);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$viewConfigurationType = LAYOUT$viewConfigurationType.byteSize();
    public static final long SIZE$displayTime = LAYOUT$displayTime.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$viewConfigurationType = LAYOUT.byteOffset(PATH$viewConfigurationType);
    public static final long OFFSET$displayTime = LAYOUT.byteOffset(PATH$displayTime);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInputSourceLocalizedNameGetInfo.html"><code>XrInputSourceLocalizedNameGetInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrInputSourceLocalizedNameGetInfo {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrPath sourcePath; // @link substring="sourcePath" target="#sourcePath"
///     XrInputSourceLocalizedNameFlags whichComponents; // @link substring="XrInputSourceLocalizedNameFlags" target="XrInputSourceLocalizedNameFlags" @link substring="whichComponents" target="#whichComponents"
/// } XrInputSourceLocalizedNameGetInfo;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO`
///
/// The {@code allocate} ({@link XrInputSourceLocalizedNameGetInfo#allocate(Arena)}, {@link XrInputSourceLocalizedNameGetInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrInputSourceLocalizedNameGetInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInputSourceLocalizedNameGetInfo.html"><code>XrInputSourceLocalizedNameGetInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrInputSourceLocalizedNameGetInfo(@NotNull MemorySegment segment) implements IXrInputSourceLocalizedNameGetInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInputSourceLocalizedNameGetInfo.html"><code>XrInputSourceLocalizedNameGetInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrInputSourceLocalizedNameGetInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrInputSourceLocalizedNameGetInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrInputSourceLocalizedNameGetInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrInputSourceLocalizedNameGetInfo, Iterable<XrInputSourceLocalizedNameGetInfo> {
        public long size() {
            return segment.byteSize() / XrInputSourceLocalizedNameGetInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrInputSourceLocalizedNameGetInfo at(long index) {
            return new XrInputSourceLocalizedNameGetInfo(segment.asSlice(index * XrInputSourceLocalizedNameGetInfo.BYTES, XrInputSourceLocalizedNameGetInfo.BYTES));
        }

        public void write(long index, @NotNull XrInputSourceLocalizedNameGetInfo value) {
            MemorySegment s = segment.asSlice(index * XrInputSourceLocalizedNameGetInfo.BYTES, XrInputSourceLocalizedNameGetInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrInputSourceLocalizedNameGetInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrInputSourceLocalizedNameGetInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrInputSourceLocalizedNameGetInfo.BYTES,
                (end - start) * XrInputSourceLocalizedNameGetInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrInputSourceLocalizedNameGetInfo.BYTES));
        }

        public XrInputSourceLocalizedNameGetInfo[] toArray() {
            XrInputSourceLocalizedNameGetInfo[] ret = new XrInputSourceLocalizedNameGetInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrInputSourceLocalizedNameGetInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrInputSourceLocalizedNameGetInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrInputSourceLocalizedNameGetInfo.BYTES;
            }

            @Override
            public XrInputSourceLocalizedNameGetInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrInputSourceLocalizedNameGetInfo ret = new XrInputSourceLocalizedNameGetInfo(segment.asSlice(0, XrInputSourceLocalizedNameGetInfo.BYTES));
                segment = segment.asSlice(XrInputSourceLocalizedNameGetInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrInputSourceLocalizedNameGetInfo allocate(Arena arena) {
        XrInputSourceLocalizedNameGetInfo ret = new XrInputSourceLocalizedNameGetInfo(arena.allocate(LAYOUT));
        ret.type(XrStructureType.INPUT_SOURCE_LOCALIZED_NAME_GET_INFO);
        return ret;
    }

    public static XrInputSourceLocalizedNameGetInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrInputSourceLocalizedNameGetInfo.Ptr ret = new XrInputSourceLocalizedNameGetInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.INPUT_SOURCE_LOCALIZED_NAME_GET_INFO);
        }
        return ret;
    }

    public static XrInputSourceLocalizedNameGetInfo clone(Arena arena, XrInputSourceLocalizedNameGetInfo src) {
        XrInputSourceLocalizedNameGetInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.INPUT_SOURCE_LOCALIZED_NAME_GET_INFO);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrInputSourceLocalizedNameGetInfo type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrInputSourceLocalizedNameGetInfo next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrInputSourceLocalizedNameGetInfo next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrPath") @Unsigned long sourcePath() {
        return segment.get(LAYOUT$sourcePath, OFFSET$sourcePath);
    }

    public XrInputSourceLocalizedNameGetInfo sourcePath(@NativeType("XrPath") @Unsigned long value) {
        segment.set(LAYOUT$sourcePath, OFFSET$sourcePath, value);
        return this;
    }

    public @Bitmask(XrInputSourceLocalizedNameFlags.class) int whichComponents() {
        return segment.get(LAYOUT$whichComponents, OFFSET$whichComponents);
    }

    public XrInputSourceLocalizedNameGetInfo whichComponents(@Bitmask(XrInputSourceLocalizedNameFlags.class) int value) {
        segment.set(LAYOUT$whichComponents, OFFSET$whichComponents, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("sourcePath"),
        ValueLayout.JAVA_INT.withName("whichComponents")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$sourcePath = PathElement.groupElement("sourcePath");
    public static final PathElement PATH$whichComponents = PathElement.groupElement("whichComponents");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$sourcePath = (OfLong) LAYOUT.select(PATH$sourcePath);
    public static final OfInt LAYOUT$whichComponents = (OfInt) LAYOUT.select(PATH$whichComponents);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$sourcePath = LAYOUT$sourcePath.byteSize();
    public static final long SIZE$whichComponents = LAYOUT$whichComponents.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$sourcePath = LAYOUT.byteOffset(PATH$sourcePath);
    public static final long OFFSET$whichComponents = LAYOUT.byteOffset(PATH$whichComponents);
}

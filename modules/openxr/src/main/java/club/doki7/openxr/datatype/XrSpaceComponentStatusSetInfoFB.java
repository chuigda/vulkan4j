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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceComponentStatusSetInfoFB.html"><code>XrSpaceComponentStatusSetInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpaceComponentStatusSetInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpaceComponentTypeFB componentType; // @link substring="XrSpaceComponentTypeFB" target="XrSpaceComponentTypeFB" @link substring="componentType" target="#componentType"
///     XrBool32 enabled; // @link substring="enabled" target="#enabled"
///     XrDuration timeout; // @link substring="timeout" target="#timeout"
/// } XrSpaceComponentStatusSetInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB`
///
/// The {@code allocate} ({@link XrSpaceComponentStatusSetInfoFB#allocate(Arena)}, {@link XrSpaceComponentStatusSetInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpaceComponentStatusSetInfoFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceComponentStatusSetInfoFB.html"><code>XrSpaceComponentStatusSetInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpaceComponentStatusSetInfoFB(@NotNull MemorySegment segment) implements IXrSpaceComponentStatusSetInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceComponentStatusSetInfoFB.html"><code>XrSpaceComponentStatusSetInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpaceComponentStatusSetInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpaceComponentStatusSetInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpaceComponentStatusSetInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpaceComponentStatusSetInfoFB, Iterable<XrSpaceComponentStatusSetInfoFB> {
        public long size() {
            return segment.byteSize() / XrSpaceComponentStatusSetInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpaceComponentStatusSetInfoFB at(long index) {
            return new XrSpaceComponentStatusSetInfoFB(segment.asSlice(index * XrSpaceComponentStatusSetInfoFB.BYTES, XrSpaceComponentStatusSetInfoFB.BYTES));
        }

        public void write(long index, @NotNull XrSpaceComponentStatusSetInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrSpaceComponentStatusSetInfoFB.BYTES, XrSpaceComponentStatusSetInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpaceComponentStatusSetInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpaceComponentStatusSetInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpaceComponentStatusSetInfoFB.BYTES,
                (end - start) * XrSpaceComponentStatusSetInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpaceComponentStatusSetInfoFB.BYTES));
        }

        public XrSpaceComponentStatusSetInfoFB[] toArray() {
            XrSpaceComponentStatusSetInfoFB[] ret = new XrSpaceComponentStatusSetInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpaceComponentStatusSetInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpaceComponentStatusSetInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpaceComponentStatusSetInfoFB.BYTES;
            }

            @Override
            public XrSpaceComponentStatusSetInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpaceComponentStatusSetInfoFB ret = new XrSpaceComponentStatusSetInfoFB(segment.asSlice(0, XrSpaceComponentStatusSetInfoFB.BYTES));
                segment = segment.asSlice(XrSpaceComponentStatusSetInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpaceComponentStatusSetInfoFB allocate(Arena arena) {
        XrSpaceComponentStatusSetInfoFB ret = new XrSpaceComponentStatusSetInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB);
        return ret;
    }

    public static XrSpaceComponentStatusSetInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpaceComponentStatusSetInfoFB.Ptr ret = new XrSpaceComponentStatusSetInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB);
        }
        return ret;
    }

    public static XrSpaceComponentStatusSetInfoFB clone(Arena arena, XrSpaceComponentStatusSetInfoFB src) {
        XrSpaceComponentStatusSetInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpaceComponentStatusSetInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpaceComponentStatusSetInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpaceComponentStatusSetInfoFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrSpaceComponentTypeFB.class) int componentType() {
        return segment.get(LAYOUT$componentType, OFFSET$componentType);
    }

    public XrSpaceComponentStatusSetInfoFB componentType(@EnumType(XrSpaceComponentTypeFB.class) int value) {
        segment.set(LAYOUT$componentType, OFFSET$componentType, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int enabled() {
        return segment.get(LAYOUT$enabled, OFFSET$enabled);
    }

    public XrSpaceComponentStatusSetInfoFB enabled(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$enabled, OFFSET$enabled, value);
        return this;
    }

    public @NativeType("XrDuration") long timeout() {
        return segment.get(LAYOUT$timeout, OFFSET$timeout);
    }

    public XrSpaceComponentStatusSetInfoFB timeout(@NativeType("XrDuration") long value) {
        segment.set(LAYOUT$timeout, OFFSET$timeout, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("componentType"),
        ValueLayout.JAVA_INT.withName("enabled"),
        ValueLayout.JAVA_LONG.withName("timeout")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$componentType = PathElement.groupElement("componentType");
    public static final PathElement PATH$enabled = PathElement.groupElement("enabled");
    public static final PathElement PATH$timeout = PathElement.groupElement("timeout");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$componentType = (OfInt) LAYOUT.select(PATH$componentType);
    public static final OfInt LAYOUT$enabled = (OfInt) LAYOUT.select(PATH$enabled);
    public static final OfLong LAYOUT$timeout = (OfLong) LAYOUT.select(PATH$timeout);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$componentType = LAYOUT$componentType.byteSize();
    public static final long SIZE$enabled = LAYOUT$enabled.byteSize();
    public static final long SIZE$timeout = LAYOUT$timeout.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$componentType = LAYOUT.byteOffset(PATH$componentType);
    public static final long OFFSET$enabled = LAYOUT.byteOffset(PATH$enabled);
    public static final long OFFSET$timeout = LAYOUT.byteOffset(PATH$timeout);
}

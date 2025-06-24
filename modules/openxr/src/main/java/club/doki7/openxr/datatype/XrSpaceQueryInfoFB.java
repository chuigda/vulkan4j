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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceQueryInfoFB.html"><code>XrSpaceQueryInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpaceQueryInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpaceQueryActionFB queryAction; // @link substring="XrSpaceQueryActionFB" target="XrSpaceQueryActionFB" @link substring="queryAction" target="#queryAction"
///     uint32_t maxResultCount; // @link substring="maxResultCount" target="#maxResultCount"
///     XrDuration timeout; // @link substring="timeout" target="#timeout"
///     XrSpaceFilterInfoBaseHeaderFB const* filter; // optional // @link substring="XrSpaceFilterInfoBaseHeaderFB" target="XrSpaceFilterInfoBaseHeaderFB" @link substring="filter" target="#filter"
///     XrSpaceFilterInfoBaseHeaderFB const* excludeFilter; // optional // @link substring="XrSpaceFilterInfoBaseHeaderFB" target="XrSpaceFilterInfoBaseHeaderFB" @link substring="excludeFilter" target="#excludeFilter"
/// } XrSpaceQueryInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPACE_QUERY_INFO_FB`
///
/// The {@code allocate} ({@link XrSpaceQueryInfoFB#allocate(Arena)}, {@link XrSpaceQueryInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpaceQueryInfoFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceQueryInfoFB.html"><code>XrSpaceQueryInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpaceQueryInfoFB(@NotNull MemorySegment segment) implements IXrSpaceQueryInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceQueryInfoFB.html"><code>XrSpaceQueryInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpaceQueryInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpaceQueryInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpaceQueryInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpaceQueryInfoFB, Iterable<XrSpaceQueryInfoFB> {
        public long size() {
            return segment.byteSize() / XrSpaceQueryInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpaceQueryInfoFB at(long index) {
            return new XrSpaceQueryInfoFB(segment.asSlice(index * XrSpaceQueryInfoFB.BYTES, XrSpaceQueryInfoFB.BYTES));
        }

        public void write(long index, @NotNull XrSpaceQueryInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrSpaceQueryInfoFB.BYTES, XrSpaceQueryInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpaceQueryInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpaceQueryInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpaceQueryInfoFB.BYTES,
                (end - start) * XrSpaceQueryInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpaceQueryInfoFB.BYTES));
        }

        public XrSpaceQueryInfoFB[] toArray() {
            XrSpaceQueryInfoFB[] ret = new XrSpaceQueryInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpaceQueryInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpaceQueryInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpaceQueryInfoFB.BYTES;
            }

            @Override
            public XrSpaceQueryInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpaceQueryInfoFB ret = new XrSpaceQueryInfoFB(segment.asSlice(0, XrSpaceQueryInfoFB.BYTES));
                segment = segment.asSlice(XrSpaceQueryInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpaceQueryInfoFB allocate(Arena arena) {
        XrSpaceQueryInfoFB ret = new XrSpaceQueryInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SPACE_QUERY_INFO_FB);
        return ret;
    }

    public static XrSpaceQueryInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpaceQueryInfoFB.Ptr ret = new XrSpaceQueryInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SPACE_QUERY_INFO_FB);
        }
        return ret;
    }

    public static XrSpaceQueryInfoFB clone(Arena arena, XrSpaceQueryInfoFB src) {
        XrSpaceQueryInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SPACE_QUERY_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpaceQueryInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpaceQueryInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpaceQueryInfoFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrSpaceQueryActionFB.class) int queryAction() {
        return segment.get(LAYOUT$queryAction, OFFSET$queryAction);
    }

    public XrSpaceQueryInfoFB queryAction(@EnumType(XrSpaceQueryActionFB.class) int value) {
        segment.set(LAYOUT$queryAction, OFFSET$queryAction, value);
        return this;
    }

    public @Unsigned int maxResultCount() {
        return segment.get(LAYOUT$maxResultCount, OFFSET$maxResultCount);
    }

    public XrSpaceQueryInfoFB maxResultCount(@Unsigned int value) {
        segment.set(LAYOUT$maxResultCount, OFFSET$maxResultCount, value);
        return this;
    }

    public @NativeType("XrDuration") long timeout() {
        return segment.get(LAYOUT$timeout, OFFSET$timeout);
    }

    public XrSpaceQueryInfoFB timeout(@NativeType("XrDuration") long value) {
        segment.set(LAYOUT$timeout, OFFSET$timeout, value);
        return this;
    }

    public XrSpaceQueryInfoFB filter(@Nullable IXrSpaceFilterInfoBaseHeaderFB value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        filterRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSpaceFilterInfoBaseHeaderFB.Ptr filter(int assumedCount) {
        MemorySegment s = filterRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSpaceFilterInfoBaseHeaderFB.BYTES);
        return new XrSpaceFilterInfoBaseHeaderFB.Ptr(s);
    }

    public @Nullable XrSpaceFilterInfoBaseHeaderFB filter() {
        MemorySegment s = filterRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpaceFilterInfoBaseHeaderFB(s);
    }

    public @Pointer(target=XrSpaceFilterInfoBaseHeaderFB.class) @NotNull MemorySegment filterRaw() {
        return segment.get(LAYOUT$filter, OFFSET$filter);
    }

    public void filterRaw(@Pointer(target=XrSpaceFilterInfoBaseHeaderFB.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$filter, OFFSET$filter, value);
    }

    public XrSpaceQueryInfoFB excludeFilter(@Nullable IXrSpaceFilterInfoBaseHeaderFB value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        excludeFilterRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSpaceFilterInfoBaseHeaderFB.Ptr excludeFilter(int assumedCount) {
        MemorySegment s = excludeFilterRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSpaceFilterInfoBaseHeaderFB.BYTES);
        return new XrSpaceFilterInfoBaseHeaderFB.Ptr(s);
    }

    public @Nullable XrSpaceFilterInfoBaseHeaderFB excludeFilter() {
        MemorySegment s = excludeFilterRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpaceFilterInfoBaseHeaderFB(s);
    }

    public @Pointer(target=XrSpaceFilterInfoBaseHeaderFB.class) @NotNull MemorySegment excludeFilterRaw() {
        return segment.get(LAYOUT$excludeFilter, OFFSET$excludeFilter);
    }

    public void excludeFilterRaw(@Pointer(target=XrSpaceFilterInfoBaseHeaderFB.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$excludeFilter, OFFSET$excludeFilter, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("queryAction"),
        ValueLayout.JAVA_INT.withName("maxResultCount"),
        ValueLayout.JAVA_LONG.withName("timeout"),
        ValueLayout.ADDRESS.withTargetLayout(XrSpaceFilterInfoBaseHeaderFB.LAYOUT).withName("filter"),
        ValueLayout.ADDRESS.withTargetLayout(XrSpaceFilterInfoBaseHeaderFB.LAYOUT).withName("excludeFilter")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$queryAction = PathElement.groupElement("queryAction");
    public static final PathElement PATH$maxResultCount = PathElement.groupElement("maxResultCount");
    public static final PathElement PATH$timeout = PathElement.groupElement("timeout");
    public static final PathElement PATH$filter = PathElement.groupElement("filter");
    public static final PathElement PATH$excludeFilter = PathElement.groupElement("excludeFilter");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$queryAction = (OfInt) LAYOUT.select(PATH$queryAction);
    public static final OfInt LAYOUT$maxResultCount = (OfInt) LAYOUT.select(PATH$maxResultCount);
    public static final OfLong LAYOUT$timeout = (OfLong) LAYOUT.select(PATH$timeout);
    public static final AddressLayout LAYOUT$filter = (AddressLayout) LAYOUT.select(PATH$filter);
    public static final AddressLayout LAYOUT$excludeFilter = (AddressLayout) LAYOUT.select(PATH$excludeFilter);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$queryAction = LAYOUT$queryAction.byteSize();
    public static final long SIZE$maxResultCount = LAYOUT$maxResultCount.byteSize();
    public static final long SIZE$timeout = LAYOUT$timeout.byteSize();
    public static final long SIZE$filter = LAYOUT$filter.byteSize();
    public static final long SIZE$excludeFilter = LAYOUT$excludeFilter.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$queryAction = LAYOUT.byteOffset(PATH$queryAction);
    public static final long OFFSET$maxResultCount = LAYOUT.byteOffset(PATH$maxResultCount);
    public static final long OFFSET$timeout = LAYOUT.byteOffset(PATH$timeout);
    public static final long OFFSET$filter = LAYOUT.byteOffset(PATH$filter);
    public static final long OFFSET$excludeFilter = LAYOUT.byteOffset(PATH$excludeFilter);
}

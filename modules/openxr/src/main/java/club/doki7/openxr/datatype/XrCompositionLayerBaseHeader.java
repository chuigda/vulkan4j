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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerBaseHeader.html"><code>XrCompositionLayerBaseHeader</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCompositionLayerBaseHeader {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrCompositionLayerFlags layerFlags; // optional // @link substring="XrCompositionLayerFlags" target="XrCompositionLayerFlags" @link substring="layerFlags" target="#layerFlags"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
/// } XrCompositionLayerBaseHeader;
/// }
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerBaseHeader.html"><code>XrCompositionLayerBaseHeader</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCompositionLayerBaseHeader(@NotNull MemorySegment segment) implements IXrCompositionLayerBaseHeader {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerBaseHeader.html"><code>XrCompositionLayerBaseHeader</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCompositionLayerBaseHeader}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCompositionLayerBaseHeader to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCompositionLayerBaseHeader.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCompositionLayerBaseHeader, Iterable<XrCompositionLayerBaseHeader> {
        public long size() {
            return segment.byteSize() / XrCompositionLayerBaseHeader.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCompositionLayerBaseHeader at(long index) {
            return new XrCompositionLayerBaseHeader(segment.asSlice(index * XrCompositionLayerBaseHeader.BYTES, XrCompositionLayerBaseHeader.BYTES));
        }

        public void write(long index, @NotNull XrCompositionLayerBaseHeader value) {
            MemorySegment s = segment.asSlice(index * XrCompositionLayerBaseHeader.BYTES, XrCompositionLayerBaseHeader.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCompositionLayerBaseHeader.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCompositionLayerBaseHeader.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCompositionLayerBaseHeader.BYTES,
                (end - start) * XrCompositionLayerBaseHeader.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCompositionLayerBaseHeader.BYTES));
        }

        public XrCompositionLayerBaseHeader[] toArray() {
            XrCompositionLayerBaseHeader[] ret = new XrCompositionLayerBaseHeader[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCompositionLayerBaseHeader> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCompositionLayerBaseHeader> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCompositionLayerBaseHeader.BYTES;
            }

            @Override
            public XrCompositionLayerBaseHeader next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCompositionLayerBaseHeader ret = new XrCompositionLayerBaseHeader(segment.asSlice(0, XrCompositionLayerBaseHeader.BYTES));
                segment = segment.asSlice(XrCompositionLayerBaseHeader.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCompositionLayerBaseHeader allocate(Arena arena) {
        return new XrCompositionLayerBaseHeader(arena.allocate(LAYOUT));
    }

    public static XrCompositionLayerBaseHeader.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrCompositionLayerBaseHeader.Ptr(segment);
    }

    public static XrCompositionLayerBaseHeader clone(Arena arena, XrCompositionLayerBaseHeader src) {
        XrCompositionLayerBaseHeader ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCompositionLayerBaseHeader type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCompositionLayerBaseHeader next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCompositionLayerBaseHeader next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrCompositionLayerFlags.class) int layerFlags() {
        return segment.get(LAYOUT$layerFlags, OFFSET$layerFlags);
    }

    public XrCompositionLayerBaseHeader layerFlags(@Bitmask(XrCompositionLayerFlags.class) int value) {
        segment.set(LAYOUT$layerFlags, OFFSET$layerFlags, value);
        return this;
    }

    public @Nullable XrSpace space() {
        MemorySegment s = segment.asSlice(OFFSET$space, SIZE$space);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrCompositionLayerBaseHeader space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("layerFlags"),
        ValueLayout.ADDRESS.withName("space")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$layerFlags = PathElement.groupElement("layerFlags");
    public static final PathElement PATH$space = PathElement.groupElement("space");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$layerFlags = (OfInt) LAYOUT.select(PATH$layerFlags);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$layerFlags = LAYOUT$layerFlags.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$layerFlags = LAYOUT.byteOffset(PATH$layerFlags);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
}

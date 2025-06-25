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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceEraseInfoFB.html"><code>XrSpaceEraseInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpaceEraseInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrSpaceStorageLocationFB location; // @link substring="XrSpaceStorageLocationFB" target="XrSpaceStorageLocationFB" @link substring="location" target="#location"
/// } XrSpaceEraseInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPACE_ERASE_INFO_FB`
///
/// The {@code allocate} ({@link XrSpaceEraseInfoFB#allocate(Arena)}, {@link XrSpaceEraseInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpaceEraseInfoFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceEraseInfoFB.html"><code>XrSpaceEraseInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpaceEraseInfoFB(@NotNull MemorySegment segment) implements IXrSpaceEraseInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceEraseInfoFB.html"><code>XrSpaceEraseInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpaceEraseInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpaceEraseInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpaceEraseInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpaceEraseInfoFB, Iterable<XrSpaceEraseInfoFB> {
        public long size() {
            return segment.byteSize() / XrSpaceEraseInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpaceEraseInfoFB at(long index) {
            return new XrSpaceEraseInfoFB(segment.asSlice(index * XrSpaceEraseInfoFB.BYTES, XrSpaceEraseInfoFB.BYTES));
        }

        public XrSpaceEraseInfoFB.Ptr at(long index, @NotNull Consumer<@NotNull XrSpaceEraseInfoFB> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpaceEraseInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrSpaceEraseInfoFB.BYTES, XrSpaceEraseInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpaceEraseInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpaceEraseInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpaceEraseInfoFB.BYTES,
                (end - start) * XrSpaceEraseInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpaceEraseInfoFB.BYTES));
        }

        public XrSpaceEraseInfoFB[] toArray() {
            XrSpaceEraseInfoFB[] ret = new XrSpaceEraseInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpaceEraseInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpaceEraseInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpaceEraseInfoFB.BYTES;
            }

            @Override
            public XrSpaceEraseInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpaceEraseInfoFB ret = new XrSpaceEraseInfoFB(segment.asSlice(0, XrSpaceEraseInfoFB.BYTES));
                segment = segment.asSlice(XrSpaceEraseInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpaceEraseInfoFB allocate(Arena arena) {
        XrSpaceEraseInfoFB ret = new XrSpaceEraseInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPACE_ERASE_INFO_FB);
        return ret;
    }

    public static XrSpaceEraseInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpaceEraseInfoFB.Ptr ret = new XrSpaceEraseInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPACE_ERASE_INFO_FB);
        }
        return ret;
    }

    public static XrSpaceEraseInfoFB clone(Arena arena, XrSpaceEraseInfoFB src) {
        XrSpaceEraseInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPACE_ERASE_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpaceEraseInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpaceEraseInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpaceEraseInfoFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrSpace space() {
        MemorySegment s = segment.asSlice(OFFSET$space, SIZE$space);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrSpaceEraseInfoFB space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrSpaceStorageLocationFB.class) int location() {
        return segment.get(LAYOUT$location, OFFSET$location);
    }

    public XrSpaceEraseInfoFB location(@EnumType(XrSpaceStorageLocationFB.class) int value) {
        segment.set(LAYOUT$location, OFFSET$location, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("space"),
        ValueLayout.JAVA_INT.withName("location")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$location = PathElement.groupElement("location");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final OfInt LAYOUT$location = (OfInt) LAYOUT.select(PATH$location);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$location = LAYOUT$location.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$location = LAYOUT.byteOffset(PATH$location);
}

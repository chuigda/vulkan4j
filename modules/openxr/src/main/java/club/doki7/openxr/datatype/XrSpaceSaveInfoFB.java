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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceSaveInfoFB.html"><code>XrSpaceSaveInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpaceSaveInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrSpaceStorageLocationFB location; // @link substring="XrSpaceStorageLocationFB" target="XrSpaceStorageLocationFB" @link substring="location" target="#location"
///     XrSpacePersistenceModeFB persistenceMode; // @link substring="XrSpacePersistenceModeFB" target="XrSpacePersistenceModeFB" @link substring="persistenceMode" target="#persistenceMode"
/// } XrSpaceSaveInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPACE_SAVE_INFO_FB`
///
/// The {@code allocate} ({@link XrSpaceSaveInfoFB#allocate(Arena)}, {@link XrSpaceSaveInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpaceSaveInfoFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceSaveInfoFB.html"><code>XrSpaceSaveInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpaceSaveInfoFB(@NotNull MemorySegment segment) implements IXrSpaceSaveInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceSaveInfoFB.html"><code>XrSpaceSaveInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpaceSaveInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpaceSaveInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpaceSaveInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpaceSaveInfoFB, Iterable<XrSpaceSaveInfoFB> {
        public long size() {
            return segment.byteSize() / XrSpaceSaveInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpaceSaveInfoFB at(long index) {
            return new XrSpaceSaveInfoFB(segment.asSlice(index * XrSpaceSaveInfoFB.BYTES, XrSpaceSaveInfoFB.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSpaceSaveInfoFB> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSpaceSaveInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrSpaceSaveInfoFB.BYTES, XrSpaceSaveInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpaceSaveInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpaceSaveInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpaceSaveInfoFB.BYTES,
                (end - start) * XrSpaceSaveInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpaceSaveInfoFB.BYTES));
        }

        public XrSpaceSaveInfoFB[] toArray() {
            XrSpaceSaveInfoFB[] ret = new XrSpaceSaveInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpaceSaveInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpaceSaveInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpaceSaveInfoFB.BYTES;
            }

            @Override
            public XrSpaceSaveInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpaceSaveInfoFB ret = new XrSpaceSaveInfoFB(segment.asSlice(0, XrSpaceSaveInfoFB.BYTES));
                segment = segment.asSlice(XrSpaceSaveInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpaceSaveInfoFB allocate(Arena arena) {
        XrSpaceSaveInfoFB ret = new XrSpaceSaveInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPACE_SAVE_INFO_FB);
        return ret;
    }

    public static XrSpaceSaveInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpaceSaveInfoFB.Ptr ret = new XrSpaceSaveInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPACE_SAVE_INFO_FB);
        }
        return ret;
    }

    public static XrSpaceSaveInfoFB clone(Arena arena, XrSpaceSaveInfoFB src) {
        XrSpaceSaveInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPACE_SAVE_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpaceSaveInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpaceSaveInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpaceSaveInfoFB next(@Nullable IPointer pointer) {
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

    public XrSpaceSaveInfoFB space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrSpaceStorageLocationFB.class) int location() {
        return segment.get(LAYOUT$location, OFFSET$location);
    }

    public XrSpaceSaveInfoFB location(@EnumType(XrSpaceStorageLocationFB.class) int value) {
        segment.set(LAYOUT$location, OFFSET$location, value);
        return this;
    }

    public @EnumType(XrSpacePersistenceModeFB.class) int persistenceMode() {
        return segment.get(LAYOUT$persistenceMode, OFFSET$persistenceMode);
    }

    public XrSpaceSaveInfoFB persistenceMode(@EnumType(XrSpacePersistenceModeFB.class) int value) {
        segment.set(LAYOUT$persistenceMode, OFFSET$persistenceMode, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("space"),
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("persistenceMode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$location = PathElement.groupElement("location");
    public static final PathElement PATH$persistenceMode = PathElement.groupElement("persistenceMode");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final OfInt LAYOUT$location = (OfInt) LAYOUT.select(PATH$location);
    public static final OfInt LAYOUT$persistenceMode = (OfInt) LAYOUT.select(PATH$persistenceMode);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$location = LAYOUT$location.byteSize();
    public static final long SIZE$persistenceMode = LAYOUT$persistenceMode.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$location = LAYOUT.byteOffset(PATH$location);
    public static final long OFFSET$persistenceMode = LAYOUT.byteOffset(PATH$persistenceMode);
}

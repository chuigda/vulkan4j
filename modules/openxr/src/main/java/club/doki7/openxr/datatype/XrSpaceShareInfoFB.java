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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceShareInfoFB.html"><code>XrSpaceShareInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpaceShareInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t spaceCount; // @link substring="spaceCount" target="#spaceCount"
///     XrSpace* spaces; // @link substring="XrSpace" target="XrSpace" @link substring="spaces" target="#spaces"
///     uint32_t userCount; // @link substring="userCount" target="#userCount"
///     XrSpaceUserFB* users; // @link substring="XrSpaceUserFB" target="XrSpaceUserFB" @link substring="users" target="#users"
/// } XrSpaceShareInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPACE_SHARE_INFO_FB`
///
/// The {@code allocate} ({@link XrSpaceShareInfoFB#allocate(Arena)}, {@link XrSpaceShareInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpaceShareInfoFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceShareInfoFB.html"><code>XrSpaceShareInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpaceShareInfoFB(@NotNull MemorySegment segment) implements IXrSpaceShareInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceShareInfoFB.html"><code>XrSpaceShareInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpaceShareInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpaceShareInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpaceShareInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpaceShareInfoFB, Iterable<XrSpaceShareInfoFB> {
        public long size() {
            return segment.byteSize() / XrSpaceShareInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpaceShareInfoFB at(long index) {
            return new XrSpaceShareInfoFB(segment.asSlice(index * XrSpaceShareInfoFB.BYTES, XrSpaceShareInfoFB.BYTES));
        }

        public void write(long index, @NotNull XrSpaceShareInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrSpaceShareInfoFB.BYTES, XrSpaceShareInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpaceShareInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpaceShareInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpaceShareInfoFB.BYTES,
                (end - start) * XrSpaceShareInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpaceShareInfoFB.BYTES));
        }

        public XrSpaceShareInfoFB[] toArray() {
            XrSpaceShareInfoFB[] ret = new XrSpaceShareInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpaceShareInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpaceShareInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpaceShareInfoFB.BYTES;
            }

            @Override
            public XrSpaceShareInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpaceShareInfoFB ret = new XrSpaceShareInfoFB(segment.asSlice(0, XrSpaceShareInfoFB.BYTES));
                segment = segment.asSlice(XrSpaceShareInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpaceShareInfoFB allocate(Arena arena) {
        XrSpaceShareInfoFB ret = new XrSpaceShareInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPACE_SHARE_INFO_FB);
        return ret;
    }

    public static XrSpaceShareInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpaceShareInfoFB.Ptr ret = new XrSpaceShareInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPACE_SHARE_INFO_FB);
        }
        return ret;
    }

    public static XrSpaceShareInfoFB clone(Arena arena, XrSpaceShareInfoFB src) {
        XrSpaceShareInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPACE_SHARE_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpaceShareInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpaceShareInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpaceShareInfoFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int spaceCount() {
        return segment.get(LAYOUT$spaceCount, OFFSET$spaceCount);
    }

    public XrSpaceShareInfoFB spaceCount(@Unsigned int value) {
        segment.set(LAYOUT$spaceCount, OFFSET$spaceCount, value);
        return this;
    }

    /// Note: the returned {@link XrSpace.Ptr} does not have correct {@link XrSpace.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link XrSpace.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable XrSpace.Ptr spaces() {
        MemorySegment s = spacesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace.Ptr(s);
    }

    public XrSpaceShareInfoFB spaces(@Nullable XrSpace.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        spacesRaw(s);
        return this;
    }

    public @Pointer(target=XrSpace.class) @NotNull MemorySegment spacesRaw() {
        return segment.get(LAYOUT$spaces, OFFSET$spaces);
    }

    public void spacesRaw(@Pointer(target=XrSpace.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$spaces, OFFSET$spaces, value);
    }

    public @Unsigned int userCount() {
        return segment.get(LAYOUT$userCount, OFFSET$userCount);
    }

    public XrSpaceShareInfoFB userCount(@Unsigned int value) {
        segment.set(LAYOUT$userCount, OFFSET$userCount, value);
        return this;
    }

    /// Note: the returned {@link XrSpaceUserFB.Ptr} does not have correct {@link XrSpaceUserFB.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link XrSpaceUserFB.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable XrSpaceUserFB.Ptr users() {
        MemorySegment s = usersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpaceUserFB.Ptr(s);
    }

    public XrSpaceShareInfoFB users(@Nullable XrSpaceUserFB.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        usersRaw(s);
        return this;
    }

    public @Pointer(target=XrSpaceUserFB.class) @NotNull MemorySegment usersRaw() {
        return segment.get(LAYOUT$users, OFFSET$users);
    }

    public void usersRaw(@Pointer(target=XrSpaceUserFB.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$users, OFFSET$users, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("spaceCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("spaces"),
        ValueLayout.JAVA_INT.withName("userCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("users")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$spaceCount = PathElement.groupElement("spaceCount");
    public static final PathElement PATH$spaces = PathElement.groupElement("spaces");
    public static final PathElement PATH$userCount = PathElement.groupElement("userCount");
    public static final PathElement PATH$users = PathElement.groupElement("users");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$spaceCount = (OfInt) LAYOUT.select(PATH$spaceCount);
    public static final AddressLayout LAYOUT$spaces = (AddressLayout) LAYOUT.select(PATH$spaces);
    public static final OfInt LAYOUT$userCount = (OfInt) LAYOUT.select(PATH$userCount);
    public static final AddressLayout LAYOUT$users = (AddressLayout) LAYOUT.select(PATH$users);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$spaceCount = LAYOUT$spaceCount.byteSize();
    public static final long SIZE$spaces = LAYOUT$spaces.byteSize();
    public static final long SIZE$userCount = LAYOUT$userCount.byteSize();
    public static final long SIZE$users = LAYOUT$users.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$spaceCount = LAYOUT.byteOffset(PATH$spaceCount);
    public static final long OFFSET$spaces = LAYOUT.byteOffset(PATH$spaces);
    public static final long OFFSET$userCount = LAYOUT.byteOffset(PATH$userCount);
    public static final long OFFSET$users = LAYOUT.byteOffset(PATH$users);
}

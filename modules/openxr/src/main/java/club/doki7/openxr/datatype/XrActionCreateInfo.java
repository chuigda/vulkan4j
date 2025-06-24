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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionCreateInfo.html"><code>XrActionCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrActionCreateInfo {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     char actionName; // @link substring="actionName" target="#actionName"
///     XrActionType actionType; // @link substring="XrActionType" target="XrActionType" @link substring="actionType" target="#actionType"
///     uint32_t countSubactionPaths; // optional // @link substring="countSubactionPaths" target="#countSubactionPaths"
///     XrPath const* subactionPaths; // optional // @link substring="subactionPaths" target="#subactionPaths"
///     char localizedActionName; // @link substring="localizedActionName" target="#localizedActionName"
/// } XrActionCreateInfo;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_ACTION_CREATE_INFO`
///
/// The {@code allocate} ({@link XrActionCreateInfo#allocate(Arena)}, {@link XrActionCreateInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrActionCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionCreateInfo.html"><code>XrActionCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrActionCreateInfo(@NotNull MemorySegment segment) implements IXrActionCreateInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionCreateInfo.html"><code>XrActionCreateInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrActionCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrActionCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrActionCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrActionCreateInfo, Iterable<XrActionCreateInfo> {
        public long size() {
            return segment.byteSize() / XrActionCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrActionCreateInfo at(long index) {
            return new XrActionCreateInfo(segment.asSlice(index * XrActionCreateInfo.BYTES, XrActionCreateInfo.BYTES));
        }

        public void write(long index, @NotNull XrActionCreateInfo value) {
            MemorySegment s = segment.asSlice(index * XrActionCreateInfo.BYTES, XrActionCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrActionCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrActionCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrActionCreateInfo.BYTES,
                (end - start) * XrActionCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrActionCreateInfo.BYTES));
        }

        public XrActionCreateInfo[] toArray() {
            XrActionCreateInfo[] ret = new XrActionCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrActionCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrActionCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrActionCreateInfo.BYTES;
            }

            @Override
            public XrActionCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrActionCreateInfo ret = new XrActionCreateInfo(segment.asSlice(0, XrActionCreateInfo.BYTES));
                segment = segment.asSlice(XrActionCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrActionCreateInfo allocate(Arena arena) {
        XrActionCreateInfo ret = new XrActionCreateInfo(arena.allocate(LAYOUT));
        ret.type(XrStructureType.ACTION_CREATE_INFO);
        return ret;
    }

    public static XrActionCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrActionCreateInfo.Ptr ret = new XrActionCreateInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.ACTION_CREATE_INFO);
        }
        return ret;
    }

    public static XrActionCreateInfo clone(Arena arena, XrActionCreateInfo src) {
        XrActionCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.ACTION_CREATE_INFO);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrActionCreateInfo type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrActionCreateInfo next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrActionCreateInfo next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public byte actionName() {
        return segment.get(LAYOUT$actionName, OFFSET$actionName);
    }

    public XrActionCreateInfo actionName(byte value) {
        segment.set(LAYOUT$actionName, OFFSET$actionName, value);
        return this;
    }

    public @EnumType(XrActionType.class) int actionType() {
        return segment.get(LAYOUT$actionType, OFFSET$actionType);
    }

    public XrActionCreateInfo actionType(@EnumType(XrActionType.class) int value) {
        segment.set(LAYOUT$actionType, OFFSET$actionType, value);
        return this;
    }

    public @Unsigned int countSubactionPaths() {
        return segment.get(LAYOUT$countSubactionPaths, OFFSET$countSubactionPaths);
    }

    public XrActionCreateInfo countSubactionPaths(@Unsigned int value) {
        segment.set(LAYOUT$countSubactionPaths, OFFSET$countSubactionPaths, value);
        return this;
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Pointer(comment="XrPath") @Unsigned LongPtr subactionPaths() {
        MemorySegment s = subactionPathsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public XrActionCreateInfo subactionPaths(@Nullable @Pointer(comment="XrPath") @Unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        subactionPathsRaw(s);
        return this;
    }

    public @Pointer(comment="uint64_t*") @NotNull MemorySegment subactionPathsRaw() {
        return segment.get(LAYOUT$subactionPaths, OFFSET$subactionPaths);
    }

    public void subactionPathsRaw(@Pointer(comment="uint64_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$subactionPaths, OFFSET$subactionPaths, value);
    }

    public byte localizedActionName() {
        return segment.get(LAYOUT$localizedActionName, OFFSET$localizedActionName);
    }

    public XrActionCreateInfo localizedActionName(byte value) {
        segment.set(LAYOUT$localizedActionName, OFFSET$localizedActionName, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_BYTE.withName("actionName"),
        ValueLayout.JAVA_INT.withName("actionType"),
        ValueLayout.JAVA_INT.withName("countSubactionPaths"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("subactionPaths"),
        ValueLayout.JAVA_BYTE.withName("localizedActionName")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$actionName = PathElement.groupElement("actionName");
    public static final PathElement PATH$actionType = PathElement.groupElement("actionType");
    public static final PathElement PATH$countSubactionPaths = PathElement.groupElement("countSubactionPaths");
    public static final PathElement PATH$subactionPaths = PathElement.groupElement("subactionPaths");
    public static final PathElement PATH$localizedActionName = PathElement.groupElement("localizedActionName");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfByte LAYOUT$actionName = (OfByte) LAYOUT.select(PATH$actionName);
    public static final OfInt LAYOUT$actionType = (OfInt) LAYOUT.select(PATH$actionType);
    public static final OfInt LAYOUT$countSubactionPaths = (OfInt) LAYOUT.select(PATH$countSubactionPaths);
    public static final AddressLayout LAYOUT$subactionPaths = (AddressLayout) LAYOUT.select(PATH$subactionPaths);
    public static final OfByte LAYOUT$localizedActionName = (OfByte) LAYOUT.select(PATH$localizedActionName);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$actionName = LAYOUT$actionName.byteSize();
    public static final long SIZE$actionType = LAYOUT$actionType.byteSize();
    public static final long SIZE$countSubactionPaths = LAYOUT$countSubactionPaths.byteSize();
    public static final long SIZE$subactionPaths = LAYOUT$subactionPaths.byteSize();
    public static final long SIZE$localizedActionName = LAYOUT$localizedActionName.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$actionName = LAYOUT.byteOffset(PATH$actionName);
    public static final long OFFSET$actionType = LAYOUT.byteOffset(PATH$actionType);
    public static final long OFFSET$countSubactionPaths = LAYOUT.byteOffset(PATH$countSubactionPaths);
    public static final long OFFSET$subactionPaths = LAYOUT.byteOffset(PATH$subactionPaths);
    public static final long OFFSET$localizedActionName = LAYOUT.byteOffset(PATH$localizedActionName);
}

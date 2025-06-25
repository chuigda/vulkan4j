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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionStateVector2f.html"><code>XrActionStateVector2f</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrActionStateVector2f {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrVector2f currentState; // @link substring="XrVector2f" target="XrVector2f" @link substring="currentState" target="#currentState"
///     XrBool32 changedSinceLastSync; // @link substring="changedSinceLastSync" target="#changedSinceLastSync"
///     XrTime lastChangeTime; // @link substring="lastChangeTime" target="#lastChangeTime"
///     XrBool32 isActive; // @link substring="isActive" target="#isActive"
/// } XrActionStateVector2f;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_ACTION_STATE_VECTOR2F`
///
/// The {@code allocate} ({@link XrActionStateVector2f#allocate(Arena)}, {@link XrActionStateVector2f#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrActionStateVector2f#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionStateVector2f.html"><code>XrActionStateVector2f</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrActionStateVector2f(@NotNull MemorySegment segment) implements IXrActionStateVector2f {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionStateVector2f.html"><code>XrActionStateVector2f</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrActionStateVector2f}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrActionStateVector2f to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrActionStateVector2f.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrActionStateVector2f, Iterable<XrActionStateVector2f> {
        public long size() {
            return segment.byteSize() / XrActionStateVector2f.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrActionStateVector2f at(long index) {
            return new XrActionStateVector2f(segment.asSlice(index * XrActionStateVector2f.BYTES, XrActionStateVector2f.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrActionStateVector2f> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrActionStateVector2f value) {
            MemorySegment s = segment.asSlice(index * XrActionStateVector2f.BYTES, XrActionStateVector2f.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrActionStateVector2f.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrActionStateVector2f.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrActionStateVector2f.BYTES,
                (end - start) * XrActionStateVector2f.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrActionStateVector2f.BYTES));
        }

        public XrActionStateVector2f[] toArray() {
            XrActionStateVector2f[] ret = new XrActionStateVector2f[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrActionStateVector2f> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrActionStateVector2f> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrActionStateVector2f.BYTES;
            }

            @Override
            public XrActionStateVector2f next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrActionStateVector2f ret = new XrActionStateVector2f(segment.asSlice(0, XrActionStateVector2f.BYTES));
                segment = segment.asSlice(XrActionStateVector2f.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrActionStateVector2f allocate(Arena arena) {
        XrActionStateVector2f ret = new XrActionStateVector2f(arena.allocate(LAYOUT));
        ret.type(XrStructureType.ACTION_STATE_VECTOR2F);
        return ret;
    }

    public static XrActionStateVector2f.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrActionStateVector2f.Ptr ret = new XrActionStateVector2f.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.ACTION_STATE_VECTOR2F);
        }
        return ret;
    }

    public static XrActionStateVector2f clone(Arena arena, XrActionStateVector2f src) {
        XrActionStateVector2f ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.ACTION_STATE_VECTOR2F);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrActionStateVector2f type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrActionStateVector2f next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrActionStateVector2f next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrVector2f currentState() {
        return new XrVector2f(segment.asSlice(OFFSET$currentState, LAYOUT$currentState));
    }

    public XrActionStateVector2f currentState(@NotNull XrVector2f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$currentState, SIZE$currentState);
        return this;
    }

    public XrActionStateVector2f currentState(Consumer<@NotNull XrVector2f> consumer) {
        consumer.accept(currentState());
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int changedSinceLastSync() {
        return segment.get(LAYOUT$changedSinceLastSync, OFFSET$changedSinceLastSync);
    }

    public XrActionStateVector2f changedSinceLastSync(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$changedSinceLastSync, OFFSET$changedSinceLastSync, value);
        return this;
    }

    public @NativeType("XrTime") long lastChangeTime() {
        return segment.get(LAYOUT$lastChangeTime, OFFSET$lastChangeTime);
    }

    public XrActionStateVector2f lastChangeTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$lastChangeTime, OFFSET$lastChangeTime, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isActive() {
        return segment.get(LAYOUT$isActive, OFFSET$isActive);
    }

    public XrActionStateVector2f isActive(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isActive, OFFSET$isActive, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrVector2f.LAYOUT.withName("currentState"),
        ValueLayout.JAVA_INT.withName("changedSinceLastSync"),
        ValueLayout.JAVA_LONG.withName("lastChangeTime"),
        ValueLayout.JAVA_INT.withName("isActive")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$currentState = PathElement.groupElement("currentState");
    public static final PathElement PATH$changedSinceLastSync = PathElement.groupElement("changedSinceLastSync");
    public static final PathElement PATH$lastChangeTime = PathElement.groupElement("lastChangeTime");
    public static final PathElement PATH$isActive = PathElement.groupElement("isActive");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$currentState = (StructLayout) LAYOUT.select(PATH$currentState);
    public static final OfInt LAYOUT$changedSinceLastSync = (OfInt) LAYOUT.select(PATH$changedSinceLastSync);
    public static final OfLong LAYOUT$lastChangeTime = (OfLong) LAYOUT.select(PATH$lastChangeTime);
    public static final OfInt LAYOUT$isActive = (OfInt) LAYOUT.select(PATH$isActive);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$currentState = LAYOUT$currentState.byteSize();
    public static final long SIZE$changedSinceLastSync = LAYOUT$changedSinceLastSync.byteSize();
    public static final long SIZE$lastChangeTime = LAYOUT$lastChangeTime.byteSize();
    public static final long SIZE$isActive = LAYOUT$isActive.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$currentState = LAYOUT.byteOffset(PATH$currentState);
    public static final long OFFSET$changedSinceLastSync = LAYOUT.byteOffset(PATH$changedSinceLastSync);
    public static final long OFFSET$lastChangeTime = LAYOUT.byteOffset(PATH$lastChangeTime);
    public static final long OFFSET$isActive = LAYOUT.byteOffset(PATH$isActive);
}

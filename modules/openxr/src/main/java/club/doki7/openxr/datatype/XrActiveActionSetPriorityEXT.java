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
import club.doki7.openxr.XRFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActiveActionSetPriorityEXT.html"><code>XrActiveActionSetPriorityEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrActiveActionSetPriorityEXT {
///     XrActionSet actionSet; // @link substring="XrActionSet" target="XrActionSet" @link substring="actionSet" target="#actionSet"
///     uint32_t priorityOverride; // @link substring="priorityOverride" target="#priorityOverride"
/// } XrActiveActionSetPriorityEXT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActiveActionSetPriorityEXT.html"><code>XrActiveActionSetPriorityEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrActiveActionSetPriorityEXT(@NotNull MemorySegment segment) implements IXrActiveActionSetPriorityEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActiveActionSetPriorityEXT.html"><code>XrActiveActionSetPriorityEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrActiveActionSetPriorityEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrActiveActionSetPriorityEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrActiveActionSetPriorityEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrActiveActionSetPriorityEXT, Iterable<XrActiveActionSetPriorityEXT> {
        public long size() {
            return segment.byteSize() / XrActiveActionSetPriorityEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrActiveActionSetPriorityEXT at(long index) {
            return new XrActiveActionSetPriorityEXT(segment.asSlice(index * XrActiveActionSetPriorityEXT.BYTES, XrActiveActionSetPriorityEXT.BYTES));
        }

        public XrActiveActionSetPriorityEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrActiveActionSetPriorityEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrActiveActionSetPriorityEXT value) {
            MemorySegment s = segment.asSlice(index * XrActiveActionSetPriorityEXT.BYTES, XrActiveActionSetPriorityEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrActiveActionSetPriorityEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrActiveActionSetPriorityEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrActiveActionSetPriorityEXT.BYTES,
                (end - start) * XrActiveActionSetPriorityEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrActiveActionSetPriorityEXT.BYTES));
        }

        public XrActiveActionSetPriorityEXT[] toArray() {
            XrActiveActionSetPriorityEXT[] ret = new XrActiveActionSetPriorityEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrActiveActionSetPriorityEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrActiveActionSetPriorityEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrActiveActionSetPriorityEXT.BYTES;
            }

            @Override
            public XrActiveActionSetPriorityEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrActiveActionSetPriorityEXT ret = new XrActiveActionSetPriorityEXT(segment.asSlice(0, XrActiveActionSetPriorityEXT.BYTES));
                segment = segment.asSlice(XrActiveActionSetPriorityEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrActiveActionSetPriorityEXT allocate(Arena arena) {
        return new XrActiveActionSetPriorityEXT(arena.allocate(LAYOUT));
    }

    public static XrActiveActionSetPriorityEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrActiveActionSetPriorityEXT.Ptr(segment);
    }

    public static XrActiveActionSetPriorityEXT clone(Arena arena, XrActiveActionSetPriorityEXT src) {
        XrActiveActionSetPriorityEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable XrActionSet actionSet() {
        MemorySegment s = segment.asSlice(OFFSET$actionSet, SIZE$actionSet);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrActionSet(s);
    }

    public XrActiveActionSetPriorityEXT actionSet(@Nullable XrActionSet value) {
        segment.set(LAYOUT$actionSet, OFFSET$actionSet, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int priorityOverride() {
        return segment.get(LAYOUT$priorityOverride, OFFSET$priorityOverride);
    }

    public XrActiveActionSetPriorityEXT priorityOverride(@Unsigned int value) {
        segment.set(LAYOUT$priorityOverride, OFFSET$priorityOverride, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("actionSet"),
        ValueLayout.JAVA_INT.withName("priorityOverride")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$actionSet = PathElement.groupElement("actionSet");
    public static final PathElement PATH$priorityOverride = PathElement.groupElement("priorityOverride");

    public static final AddressLayout LAYOUT$actionSet = (AddressLayout) LAYOUT.select(PATH$actionSet);
    public static final OfInt LAYOUT$priorityOverride = (OfInt) LAYOUT.select(PATH$priorityOverride);

    public static final long SIZE$actionSet = LAYOUT$actionSet.byteSize();
    public static final long SIZE$priorityOverride = LAYOUT$priorityOverride.byteSize();

    public static final long OFFSET$actionSet = LAYOUT.byteOffset(PATH$actionSet);
    public static final long OFFSET$priorityOverride = LAYOUT.byteOffset(PATH$priorityOverride);
}

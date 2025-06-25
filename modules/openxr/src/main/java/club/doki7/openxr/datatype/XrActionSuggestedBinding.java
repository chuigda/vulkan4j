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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionSuggestedBinding.html"><code>XrActionSuggestedBinding</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrActionSuggestedBinding {
///     XrAction action; // @link substring="XrAction" target="XrAction" @link substring="action" target="#action"
///     XrPath binding; // @link substring="binding" target="#binding"
/// } XrActionSuggestedBinding;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionSuggestedBinding.html"><code>XrActionSuggestedBinding</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrActionSuggestedBinding(@NotNull MemorySegment segment) implements IXrActionSuggestedBinding {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionSuggestedBinding.html"><code>XrActionSuggestedBinding</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrActionSuggestedBinding}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrActionSuggestedBinding to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrActionSuggestedBinding.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrActionSuggestedBinding, Iterable<XrActionSuggestedBinding> {
        public long size() {
            return segment.byteSize() / XrActionSuggestedBinding.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrActionSuggestedBinding at(long index) {
            return new XrActionSuggestedBinding(segment.asSlice(index * XrActionSuggestedBinding.BYTES, XrActionSuggestedBinding.BYTES));
        }

        public XrActionSuggestedBinding.Ptr at(long index, @NotNull Consumer<@NotNull XrActionSuggestedBinding> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrActionSuggestedBinding value) {
            MemorySegment s = segment.asSlice(index * XrActionSuggestedBinding.BYTES, XrActionSuggestedBinding.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrActionSuggestedBinding.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrActionSuggestedBinding.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrActionSuggestedBinding.BYTES,
                (end - start) * XrActionSuggestedBinding.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrActionSuggestedBinding.BYTES));
        }

        public XrActionSuggestedBinding[] toArray() {
            XrActionSuggestedBinding[] ret = new XrActionSuggestedBinding[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrActionSuggestedBinding> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrActionSuggestedBinding> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrActionSuggestedBinding.BYTES;
            }

            @Override
            public XrActionSuggestedBinding next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrActionSuggestedBinding ret = new XrActionSuggestedBinding(segment.asSlice(0, XrActionSuggestedBinding.BYTES));
                segment = segment.asSlice(XrActionSuggestedBinding.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrActionSuggestedBinding allocate(Arena arena) {
        return new XrActionSuggestedBinding(arena.allocate(LAYOUT));
    }

    public static XrActionSuggestedBinding.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrActionSuggestedBinding.Ptr(segment);
    }

    public static XrActionSuggestedBinding clone(Arena arena, XrActionSuggestedBinding src) {
        XrActionSuggestedBinding ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable XrAction action() {
        MemorySegment s = segment.asSlice(OFFSET$action, SIZE$action);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrAction(s);
    }

    public XrActionSuggestedBinding action(@Nullable XrAction value) {
        segment.set(LAYOUT$action, OFFSET$action, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrPath") @Unsigned long binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public XrActionSuggestedBinding binding(@NativeType("XrPath") @Unsigned long value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("action"),
        ValueLayout.JAVA_LONG.withName("binding")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$action = PathElement.groupElement("action");
    public static final PathElement PATH$binding = PathElement.groupElement("binding");

    public static final AddressLayout LAYOUT$action = (AddressLayout) LAYOUT.select(PATH$action);
    public static final OfLong LAYOUT$binding = (OfLong) LAYOUT.select(PATH$binding);

    public static final long SIZE$action = LAYOUT$action.byteSize();
    public static final long SIZE$binding = LAYOUT$binding.byteSize();

    public static final long OFFSET$action = LAYOUT.byteOffset(PATH$action);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
}

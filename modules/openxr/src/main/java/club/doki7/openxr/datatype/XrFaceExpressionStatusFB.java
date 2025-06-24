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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceExpressionStatusFB.html"><code>XrFaceExpressionStatusFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFaceExpressionStatusFB {
///     XrBool32 isValid; // @link substring="isValid" target="#isValid"
///     XrBool32 isEyeFollowingBlendshapesValid; // @link substring="isEyeFollowingBlendshapesValid" target="#isEyeFollowingBlendshapesValid"
/// } XrFaceExpressionStatusFB;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceExpressionStatusFB.html"><code>XrFaceExpressionStatusFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFaceExpressionStatusFB(@NotNull MemorySegment segment) implements IXrFaceExpressionStatusFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceExpressionStatusFB.html"><code>XrFaceExpressionStatusFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFaceExpressionStatusFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFaceExpressionStatusFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFaceExpressionStatusFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFaceExpressionStatusFB, Iterable<XrFaceExpressionStatusFB> {
        public long size() {
            return segment.byteSize() / XrFaceExpressionStatusFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFaceExpressionStatusFB at(long index) {
            return new XrFaceExpressionStatusFB(segment.asSlice(index * XrFaceExpressionStatusFB.BYTES, XrFaceExpressionStatusFB.BYTES));
        }

        public void write(long index, @NotNull XrFaceExpressionStatusFB value) {
            MemorySegment s = segment.asSlice(index * XrFaceExpressionStatusFB.BYTES, XrFaceExpressionStatusFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFaceExpressionStatusFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFaceExpressionStatusFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFaceExpressionStatusFB.BYTES,
                (end - start) * XrFaceExpressionStatusFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFaceExpressionStatusFB.BYTES));
        }

        public XrFaceExpressionStatusFB[] toArray() {
            XrFaceExpressionStatusFB[] ret = new XrFaceExpressionStatusFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFaceExpressionStatusFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFaceExpressionStatusFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFaceExpressionStatusFB.BYTES;
            }

            @Override
            public XrFaceExpressionStatusFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFaceExpressionStatusFB ret = new XrFaceExpressionStatusFB(segment.asSlice(0, XrFaceExpressionStatusFB.BYTES));
                segment = segment.asSlice(XrFaceExpressionStatusFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFaceExpressionStatusFB allocate(Arena arena) {
        return new XrFaceExpressionStatusFB(arena.allocate(LAYOUT));
    }

    public static XrFaceExpressionStatusFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrFaceExpressionStatusFB.Ptr(segment);
    }

    public static XrFaceExpressionStatusFB clone(Arena arena, XrFaceExpressionStatusFB src) {
        XrFaceExpressionStatusFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("XrBool32") @Unsigned int isValid() {
        return segment.get(LAYOUT$isValid, OFFSET$isValid);
    }

    public XrFaceExpressionStatusFB isValid(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isValid, OFFSET$isValid, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isEyeFollowingBlendshapesValid() {
        return segment.get(LAYOUT$isEyeFollowingBlendshapesValid, OFFSET$isEyeFollowingBlendshapesValid);
    }

    public XrFaceExpressionStatusFB isEyeFollowingBlendshapesValid(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isEyeFollowingBlendshapesValid, OFFSET$isEyeFollowingBlendshapesValid, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("isValid"),
        ValueLayout.JAVA_INT.withName("isEyeFollowingBlendshapesValid")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$isValid = PathElement.groupElement("isValid");
    public static final PathElement PATH$isEyeFollowingBlendshapesValid = PathElement.groupElement("isEyeFollowingBlendshapesValid");

    public static final OfInt LAYOUT$isValid = (OfInt) LAYOUT.select(PATH$isValid);
    public static final OfInt LAYOUT$isEyeFollowingBlendshapesValid = (OfInt) LAYOUT.select(PATH$isEyeFollowingBlendshapesValid);

    public static final long SIZE$isValid = LAYOUT$isValid.byteSize();
    public static final long SIZE$isEyeFollowingBlendshapesValid = LAYOUT$isEyeFollowingBlendshapesValid.byteSize();

    public static final long OFFSET$isValid = LAYOUT.byteOffset(PATH$isValid);
    public static final long OFFSET$isEyeFollowingBlendshapesValid = LAYOUT.byteOffset(PATH$isEyeFollowingBlendshapesValid);
}

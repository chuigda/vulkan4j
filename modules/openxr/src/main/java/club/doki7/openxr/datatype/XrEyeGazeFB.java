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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEyeGazeFB.html"><code>XrEyeGazeFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEyeGazeFB {
///     XrBool32 isValid; // @link substring="isValid" target="#isValid"
///     XrPosef gazePose; // @link substring="XrPosef" target="XrPosef" @link substring="gazePose" target="#gazePose"
///     float gazeConfidence; // @link substring="gazeConfidence" target="#gazeConfidence"
/// } XrEyeGazeFB;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEyeGazeFB.html"><code>XrEyeGazeFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEyeGazeFB(@NotNull MemorySegment segment) implements IXrEyeGazeFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEyeGazeFB.html"><code>XrEyeGazeFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEyeGazeFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEyeGazeFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEyeGazeFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEyeGazeFB, Iterable<XrEyeGazeFB> {
        public long size() {
            return segment.byteSize() / XrEyeGazeFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEyeGazeFB at(long index) {
            return new XrEyeGazeFB(segment.asSlice(index * XrEyeGazeFB.BYTES, XrEyeGazeFB.BYTES));
        }

        public XrEyeGazeFB.Ptr at(long index, @NotNull Consumer<@NotNull XrEyeGazeFB> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrEyeGazeFB value) {
            MemorySegment s = segment.asSlice(index * XrEyeGazeFB.BYTES, XrEyeGazeFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEyeGazeFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEyeGazeFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEyeGazeFB.BYTES,
                (end - start) * XrEyeGazeFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEyeGazeFB.BYTES));
        }

        public XrEyeGazeFB[] toArray() {
            XrEyeGazeFB[] ret = new XrEyeGazeFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEyeGazeFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEyeGazeFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEyeGazeFB.BYTES;
            }

            @Override
            public XrEyeGazeFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEyeGazeFB ret = new XrEyeGazeFB(segment.asSlice(0, XrEyeGazeFB.BYTES));
                segment = segment.asSlice(XrEyeGazeFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEyeGazeFB allocate(Arena arena) {
        return new XrEyeGazeFB(arena.allocate(LAYOUT));
    }

    public static XrEyeGazeFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrEyeGazeFB.Ptr(segment);
    }

    public static XrEyeGazeFB clone(Arena arena, XrEyeGazeFB src) {
        XrEyeGazeFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("XrBool32") @Unsigned int isValid() {
        return segment.get(LAYOUT$isValid, OFFSET$isValid);
    }

    public XrEyeGazeFB isValid(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isValid, OFFSET$isValid, value);
        return this;
    }

    public @NotNull XrPosef gazePose() {
        return new XrPosef(segment.asSlice(OFFSET$gazePose, LAYOUT$gazePose));
    }

    public XrEyeGazeFB gazePose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$gazePose, SIZE$gazePose);
        return this;
    }

    public XrEyeGazeFB gazePose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(gazePose());
        return this;
    }

    public float gazeConfidence() {
        return segment.get(LAYOUT$gazeConfidence, OFFSET$gazeConfidence);
    }

    public XrEyeGazeFB gazeConfidence(float value) {
        segment.set(LAYOUT$gazeConfidence, OFFSET$gazeConfidence, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("isValid"),
        XrPosef.LAYOUT.withName("gazePose"),
        ValueLayout.JAVA_FLOAT.withName("gazeConfidence")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$isValid = PathElement.groupElement("isValid");
    public static final PathElement PATH$gazePose = PathElement.groupElement("gazePose");
    public static final PathElement PATH$gazeConfidence = PathElement.groupElement("gazeConfidence");

    public static final OfInt LAYOUT$isValid = (OfInt) LAYOUT.select(PATH$isValid);
    public static final StructLayout LAYOUT$gazePose = (StructLayout) LAYOUT.select(PATH$gazePose);
    public static final OfFloat LAYOUT$gazeConfidence = (OfFloat) LAYOUT.select(PATH$gazeConfidence);

    public static final long SIZE$isValid = LAYOUT$isValid.byteSize();
    public static final long SIZE$gazePose = LAYOUT$gazePose.byteSize();
    public static final long SIZE$gazeConfidence = LAYOUT$gazeConfidence.byteSize();

    public static final long OFFSET$isValid = LAYOUT.byteOffset(PATH$isValid);
    public static final long OFFSET$gazePose = LAYOUT.byteOffset(PATH$gazePose);
    public static final long OFFSET$gazeConfidence = LAYOUT.byteOffset(PATH$gazeConfidence);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemTrackingProperties.html"><code>XrSystemTrackingProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSystemTrackingProperties {
///     XrBool32 orientationTracking; // @link substring="orientationTracking" target="#orientationTracking"
///     XrBool32 positionTracking; // @link substring="positionTracking" target="#positionTracking"
/// } XrSystemTrackingProperties;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemTrackingProperties.html"><code>XrSystemTrackingProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSystemTrackingProperties(@NotNull MemorySegment segment) implements IXrSystemTrackingProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemTrackingProperties.html"><code>XrSystemTrackingProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSystemTrackingProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSystemTrackingProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSystemTrackingProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSystemTrackingProperties, Iterable<XrSystemTrackingProperties> {
        public long size() {
            return segment.byteSize() / XrSystemTrackingProperties.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSystemTrackingProperties at(long index) {
            return new XrSystemTrackingProperties(segment.asSlice(index * XrSystemTrackingProperties.BYTES, XrSystemTrackingProperties.BYTES));
        }

        public XrSystemTrackingProperties.Ptr at(long index, @NotNull Consumer<@NotNull XrSystemTrackingProperties> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSystemTrackingProperties value) {
            MemorySegment s = segment.asSlice(index * XrSystemTrackingProperties.BYTES, XrSystemTrackingProperties.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSystemTrackingProperties.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSystemTrackingProperties.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSystemTrackingProperties.BYTES,
                (end - start) * XrSystemTrackingProperties.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSystemTrackingProperties.BYTES));
        }

        public XrSystemTrackingProperties[] toArray() {
            XrSystemTrackingProperties[] ret = new XrSystemTrackingProperties[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSystemTrackingProperties> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSystemTrackingProperties> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSystemTrackingProperties.BYTES;
            }

            @Override
            public XrSystemTrackingProperties next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSystemTrackingProperties ret = new XrSystemTrackingProperties(segment.asSlice(0, XrSystemTrackingProperties.BYTES));
                segment = segment.asSlice(XrSystemTrackingProperties.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSystemTrackingProperties allocate(Arena arena) {
        return new XrSystemTrackingProperties(arena.allocate(LAYOUT));
    }

    public static XrSystemTrackingProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSystemTrackingProperties.Ptr(segment);
    }

    public static XrSystemTrackingProperties clone(Arena arena, XrSystemTrackingProperties src) {
        XrSystemTrackingProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("XrBool32") @Unsigned int orientationTracking() {
        return segment.get(LAYOUT$orientationTracking, OFFSET$orientationTracking);
    }

    public XrSystemTrackingProperties orientationTracking(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$orientationTracking, OFFSET$orientationTracking, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int positionTracking() {
        return segment.get(LAYOUT$positionTracking, OFFSET$positionTracking);
    }

    public XrSystemTrackingProperties positionTracking(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$positionTracking, OFFSET$positionTracking, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("orientationTracking"),
        ValueLayout.JAVA_INT.withName("positionTracking")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$orientationTracking = PathElement.groupElement("orientationTracking");
    public static final PathElement PATH$positionTracking = PathElement.groupElement("positionTracking");

    public static final OfInt LAYOUT$orientationTracking = (OfInt) LAYOUT.select(PATH$orientationTracking);
    public static final OfInt LAYOUT$positionTracking = (OfInt) LAYOUT.select(PATH$positionTracking);

    public static final long SIZE$orientationTracking = LAYOUT$orientationTracking.byteSize();
    public static final long SIZE$positionTracking = LAYOUT$positionTracking.byteSize();

    public static final long OFFSET$orientationTracking = LAYOUT.byteOffset(PATH$orientationTracking);
    public static final long OFFSET$positionTracking = LAYOUT.byteOffset(PATH$positionTracking);
}

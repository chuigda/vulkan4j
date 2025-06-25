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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationConfigurationHTC.html"><code>XrFoveationConfigurationHTC</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFoveationConfigurationHTC {
///     XrFoveationLevelHTC level; // @link substring="XrFoveationLevelHTC" target="XrFoveationLevelHTC" @link substring="level" target="#level"
///     float clearFovDegree; // @link substring="clearFovDegree" target="#clearFovDegree"
///     XrVector2f focalCenterOffset; // @link substring="XrVector2f" target="XrVector2f" @link substring="focalCenterOffset" target="#focalCenterOffset"
/// } XrFoveationConfigurationHTC;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationConfigurationHTC.html"><code>XrFoveationConfigurationHTC</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFoveationConfigurationHTC(@NotNull MemorySegment segment) implements IXrFoveationConfigurationHTC {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationConfigurationHTC.html"><code>XrFoveationConfigurationHTC</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFoveationConfigurationHTC}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFoveationConfigurationHTC to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFoveationConfigurationHTC.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFoveationConfigurationHTC, Iterable<XrFoveationConfigurationHTC> {
        public long size() {
            return segment.byteSize() / XrFoveationConfigurationHTC.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFoveationConfigurationHTC at(long index) {
            return new XrFoveationConfigurationHTC(segment.asSlice(index * XrFoveationConfigurationHTC.BYTES, XrFoveationConfigurationHTC.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrFoveationConfigurationHTC> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrFoveationConfigurationHTC value) {
            MemorySegment s = segment.asSlice(index * XrFoveationConfigurationHTC.BYTES, XrFoveationConfigurationHTC.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFoveationConfigurationHTC.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFoveationConfigurationHTC.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFoveationConfigurationHTC.BYTES,
                (end - start) * XrFoveationConfigurationHTC.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFoveationConfigurationHTC.BYTES));
        }

        public XrFoveationConfigurationHTC[] toArray() {
            XrFoveationConfigurationHTC[] ret = new XrFoveationConfigurationHTC[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFoveationConfigurationHTC> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFoveationConfigurationHTC> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFoveationConfigurationHTC.BYTES;
            }

            @Override
            public XrFoveationConfigurationHTC next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFoveationConfigurationHTC ret = new XrFoveationConfigurationHTC(segment.asSlice(0, XrFoveationConfigurationHTC.BYTES));
                segment = segment.asSlice(XrFoveationConfigurationHTC.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFoveationConfigurationHTC allocate(Arena arena) {
        return new XrFoveationConfigurationHTC(arena.allocate(LAYOUT));
    }

    public static XrFoveationConfigurationHTC.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrFoveationConfigurationHTC.Ptr(segment);
    }

    public static XrFoveationConfigurationHTC clone(Arena arena, XrFoveationConfigurationHTC src) {
        XrFoveationConfigurationHTC ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrFoveationLevelHTC.class) int level() {
        return segment.get(LAYOUT$level, OFFSET$level);
    }

    public XrFoveationConfigurationHTC level(@EnumType(XrFoveationLevelHTC.class) int value) {
        segment.set(LAYOUT$level, OFFSET$level, value);
        return this;
    }

    public float clearFovDegree() {
        return segment.get(LAYOUT$clearFovDegree, OFFSET$clearFovDegree);
    }

    public XrFoveationConfigurationHTC clearFovDegree(float value) {
        segment.set(LAYOUT$clearFovDegree, OFFSET$clearFovDegree, value);
        return this;
    }

    public @NotNull XrVector2f focalCenterOffset() {
        return new XrVector2f(segment.asSlice(OFFSET$focalCenterOffset, LAYOUT$focalCenterOffset));
    }

    public XrFoveationConfigurationHTC focalCenterOffset(@NotNull XrVector2f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$focalCenterOffset, SIZE$focalCenterOffset);
        return this;
    }

    public XrFoveationConfigurationHTC focalCenterOffset(Consumer<@NotNull XrVector2f> consumer) {
        consumer.accept(focalCenterOffset());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("level"),
        ValueLayout.JAVA_FLOAT.withName("clearFovDegree"),
        XrVector2f.LAYOUT.withName("focalCenterOffset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$level = PathElement.groupElement("level");
    public static final PathElement PATH$clearFovDegree = PathElement.groupElement("clearFovDegree");
    public static final PathElement PATH$focalCenterOffset = PathElement.groupElement("focalCenterOffset");

    public static final OfInt LAYOUT$level = (OfInt) LAYOUT.select(PATH$level);
    public static final OfFloat LAYOUT$clearFovDegree = (OfFloat) LAYOUT.select(PATH$clearFovDegree);
    public static final StructLayout LAYOUT$focalCenterOffset = (StructLayout) LAYOUT.select(PATH$focalCenterOffset);

    public static final long SIZE$level = LAYOUT$level.byteSize();
    public static final long SIZE$clearFovDegree = LAYOUT$clearFovDegree.byteSize();
    public static final long SIZE$focalCenterOffset = LAYOUT$focalCenterOffset.byteSize();

    public static final long OFFSET$level = LAYOUT.byteOffset(PATH$level);
    public static final long OFFSET$clearFovDegree = LAYOUT.byteOffset(PATH$clearFovDegree);
    public static final long OFFSET$focalCenterOffset = LAYOUT.byteOffset(PATH$focalCenterOffset);
}

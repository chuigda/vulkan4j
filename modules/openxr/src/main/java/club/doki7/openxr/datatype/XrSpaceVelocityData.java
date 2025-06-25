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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceVelocityData.html"><code>XrSpaceVelocityData</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpaceVelocityData {
///     XrSpaceVelocityFlags velocityFlags; // @link substring="XrSpaceVelocityFlags" target="XrSpaceVelocityFlags" @link substring="velocityFlags" target="#velocityFlags"
///     XrVector3f linearVelocity; // @link substring="XrVector3f" target="XrVector3f" @link substring="linearVelocity" target="#linearVelocity"
///     XrVector3f angularVelocity; // @link substring="XrVector3f" target="XrVector3f" @link substring="angularVelocity" target="#angularVelocity"
/// } XrSpaceVelocityData;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceVelocityData.html"><code>XrSpaceVelocityData</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpaceVelocityData(@NotNull MemorySegment segment) implements IXrSpaceVelocityData {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceVelocityData.html"><code>XrSpaceVelocityData</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpaceVelocityData}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpaceVelocityData to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpaceVelocityData.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpaceVelocityData, Iterable<XrSpaceVelocityData> {
        public long size() {
            return segment.byteSize() / XrSpaceVelocityData.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpaceVelocityData at(long index) {
            return new XrSpaceVelocityData(segment.asSlice(index * XrSpaceVelocityData.BYTES, XrSpaceVelocityData.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSpaceVelocityData> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSpaceVelocityData value) {
            MemorySegment s = segment.asSlice(index * XrSpaceVelocityData.BYTES, XrSpaceVelocityData.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpaceVelocityData.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpaceVelocityData.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpaceVelocityData.BYTES,
                (end - start) * XrSpaceVelocityData.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpaceVelocityData.BYTES));
        }

        public XrSpaceVelocityData[] toArray() {
            XrSpaceVelocityData[] ret = new XrSpaceVelocityData[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpaceVelocityData> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpaceVelocityData> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpaceVelocityData.BYTES;
            }

            @Override
            public XrSpaceVelocityData next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpaceVelocityData ret = new XrSpaceVelocityData(segment.asSlice(0, XrSpaceVelocityData.BYTES));
                segment = segment.asSlice(XrSpaceVelocityData.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpaceVelocityData allocate(Arena arena) {
        return new XrSpaceVelocityData(arena.allocate(LAYOUT));
    }

    public static XrSpaceVelocityData.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSpaceVelocityData.Ptr(segment);
    }

    public static XrSpaceVelocityData clone(Arena arena, XrSpaceVelocityData src) {
        XrSpaceVelocityData ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Bitmask(XrSpaceVelocityFlags.class) long velocityFlags() {
        return segment.get(LAYOUT$velocityFlags, OFFSET$velocityFlags);
    }

    public XrSpaceVelocityData velocityFlags(@Bitmask(XrSpaceVelocityFlags.class) long value) {
        segment.set(LAYOUT$velocityFlags, OFFSET$velocityFlags, value);
        return this;
    }

    public @NotNull XrVector3f linearVelocity() {
        return new XrVector3f(segment.asSlice(OFFSET$linearVelocity, LAYOUT$linearVelocity));
    }

    public XrSpaceVelocityData linearVelocity(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$linearVelocity, SIZE$linearVelocity);
        return this;
    }

    public XrSpaceVelocityData linearVelocity(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(linearVelocity());
        return this;
    }

    public @NotNull XrVector3f angularVelocity() {
        return new XrVector3f(segment.asSlice(OFFSET$angularVelocity, LAYOUT$angularVelocity));
    }

    public XrSpaceVelocityData angularVelocity(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$angularVelocity, SIZE$angularVelocity);
        return this;
    }

    public XrSpaceVelocityData angularVelocity(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(angularVelocity());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("velocityFlags"),
        XrVector3f.LAYOUT.withName("linearVelocity"),
        XrVector3f.LAYOUT.withName("angularVelocity")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$velocityFlags = PathElement.groupElement("velocityFlags");
    public static final PathElement PATH$linearVelocity = PathElement.groupElement("linearVelocity");
    public static final PathElement PATH$angularVelocity = PathElement.groupElement("angularVelocity");

    public static final OfLong LAYOUT$velocityFlags = (OfLong) LAYOUT.select(PATH$velocityFlags);
    public static final StructLayout LAYOUT$linearVelocity = (StructLayout) LAYOUT.select(PATH$linearVelocity);
    public static final StructLayout LAYOUT$angularVelocity = (StructLayout) LAYOUT.select(PATH$angularVelocity);

    public static final long SIZE$velocityFlags = LAYOUT$velocityFlags.byteSize();
    public static final long SIZE$linearVelocity = LAYOUT$linearVelocity.byteSize();
    public static final long SIZE$angularVelocity = LAYOUT$angularVelocity.byteSize();

    public static final long OFFSET$velocityFlags = LAYOUT.byteOffset(PATH$velocityFlags);
    public static final long OFFSET$linearVelocity = LAYOUT.byteOffset(PATH$linearVelocity);
    public static final long OFFSET$angularVelocity = LAYOUT.byteOffset(PATH$angularVelocity);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerMSFT.html"><code>XrSceneMarkerMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneMarkerMSFT {
///     XrSceneMarkerTypeMSFT markerType; // @link substring="XrSceneMarkerTypeMSFT" target="XrSceneMarkerTypeMSFT" @link substring="markerType" target="#markerType"
///     XrTime lastSeenTime; // @link substring="lastSeenTime" target="#lastSeenTime"
///     XrOffset2Df center; // @link substring="XrOffset2Df" target="XrOffset2Df" @link substring="center" target="#center"
///     XrExtent2Df size; // @link substring="XrExtent2Df" target="XrExtent2Df" @link substring="size" target="#size"
/// } XrSceneMarkerMSFT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerMSFT.html"><code>XrSceneMarkerMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneMarkerMSFT(@NotNull MemorySegment segment) implements IXrSceneMarkerMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerMSFT.html"><code>XrSceneMarkerMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneMarkerMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneMarkerMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneMarkerMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneMarkerMSFT, Iterable<XrSceneMarkerMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneMarkerMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneMarkerMSFT at(long index) {
            return new XrSceneMarkerMSFT(segment.asSlice(index * XrSceneMarkerMSFT.BYTES, XrSceneMarkerMSFT.BYTES));
        }

        public XrSceneMarkerMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSceneMarkerMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSceneMarkerMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneMarkerMSFT.BYTES, XrSceneMarkerMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneMarkerMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneMarkerMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneMarkerMSFT.BYTES,
                (end - start) * XrSceneMarkerMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneMarkerMSFT.BYTES));
        }

        public XrSceneMarkerMSFT[] toArray() {
            XrSceneMarkerMSFT[] ret = new XrSceneMarkerMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneMarkerMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneMarkerMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneMarkerMSFT.BYTES;
            }

            @Override
            public XrSceneMarkerMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneMarkerMSFT ret = new XrSceneMarkerMSFT(segment.asSlice(0, XrSceneMarkerMSFT.BYTES));
                segment = segment.asSlice(XrSceneMarkerMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneMarkerMSFT allocate(Arena arena) {
        return new XrSceneMarkerMSFT(arena.allocate(LAYOUT));
    }

    public static XrSceneMarkerMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSceneMarkerMSFT.Ptr(segment);
    }

    public static XrSceneMarkerMSFT clone(Arena arena, XrSceneMarkerMSFT src) {
        XrSceneMarkerMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrSceneMarkerTypeMSFT.class) int markerType() {
        return segment.get(LAYOUT$markerType, OFFSET$markerType);
    }

    public XrSceneMarkerMSFT markerType(@EnumType(XrSceneMarkerTypeMSFT.class) int value) {
        segment.set(LAYOUT$markerType, OFFSET$markerType, value);
        return this;
    }

    public @NativeType("XrTime") long lastSeenTime() {
        return segment.get(LAYOUT$lastSeenTime, OFFSET$lastSeenTime);
    }

    public XrSceneMarkerMSFT lastSeenTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$lastSeenTime, OFFSET$lastSeenTime, value);
        return this;
    }

    public @NotNull XrOffset2Df center() {
        return new XrOffset2Df(segment.asSlice(OFFSET$center, LAYOUT$center));
    }

    public XrSceneMarkerMSFT center(@NotNull XrOffset2Df value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$center, SIZE$center);
        return this;
    }

    public XrSceneMarkerMSFT center(Consumer<@NotNull XrOffset2Df> consumer) {
        consumer.accept(center());
        return this;
    }

    public @NotNull XrExtent2Df size() {
        return new XrExtent2Df(segment.asSlice(OFFSET$size, LAYOUT$size));
    }

    public XrSceneMarkerMSFT size(@NotNull XrExtent2Df value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$size, SIZE$size);
        return this;
    }

    public XrSceneMarkerMSFT size(Consumer<@NotNull XrExtent2Df> consumer) {
        consumer.accept(size());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("markerType"),
        ValueLayout.JAVA_LONG.withName("lastSeenTime"),
        XrOffset2Df.LAYOUT.withName("center"),
        XrExtent2Df.LAYOUT.withName("size")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$markerType = PathElement.groupElement("markerType");
    public static final PathElement PATH$lastSeenTime = PathElement.groupElement("lastSeenTime");
    public static final PathElement PATH$center = PathElement.groupElement("center");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final OfInt LAYOUT$markerType = (OfInt) LAYOUT.select(PATH$markerType);
    public static final OfLong LAYOUT$lastSeenTime = (OfLong) LAYOUT.select(PATH$lastSeenTime);
    public static final StructLayout LAYOUT$center = (StructLayout) LAYOUT.select(PATH$center);
    public static final StructLayout LAYOUT$size = (StructLayout) LAYOUT.select(PATH$size);

    public static final long SIZE$markerType = LAYOUT$markerType.byteSize();
    public static final long SIZE$lastSeenTime = LAYOUT$lastSeenTime.byteSize();
    public static final long SIZE$center = LAYOUT$center.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();

    public static final long OFFSET$markerType = LAYOUT.byteOffset(PATH$markerType);
    public static final long OFFSET$lastSeenTime = LAYOUT.byteOffset(PATH$lastSeenTime);
    public static final long OFFSET$center = LAYOUT.byteOffset(PATH$center);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneBoundsMSFT.html"><code>XrSceneBoundsMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneBoundsMSFT {
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrTime time; // @link substring="time" target="#time"
///     uint32_t sphereCount; // optional // @link substring="sphereCount" target="#sphereCount"
///     XrSceneSphereBoundMSFT const* spheres; // optional // @link substring="XrSceneSphereBoundMSFT" target="XrSceneSphereBoundMSFT" @link substring="spheres" target="#spheres"
///     uint32_t boxCount; // optional // @link substring="boxCount" target="#boxCount"
///     XrSceneOrientedBoxBoundMSFT const* boxes; // optional // @link substring="XrSceneOrientedBoxBoundMSFT" target="XrSceneOrientedBoxBoundMSFT" @link substring="boxes" target="#boxes"
///     uint32_t frustumCount; // optional // @link substring="frustumCount" target="#frustumCount"
///     XrSceneFrustumBoundMSFT const* frustums; // optional // @link substring="XrSceneFrustumBoundMSFT" target="XrSceneFrustumBoundMSFT" @link substring="frustums" target="#frustums"
/// } XrSceneBoundsMSFT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneBoundsMSFT.html"><code>XrSceneBoundsMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneBoundsMSFT(@NotNull MemorySegment segment) implements IXrSceneBoundsMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneBoundsMSFT.html"><code>XrSceneBoundsMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneBoundsMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneBoundsMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneBoundsMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneBoundsMSFT, Iterable<XrSceneBoundsMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneBoundsMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneBoundsMSFT at(long index) {
            return new XrSceneBoundsMSFT(segment.asSlice(index * XrSceneBoundsMSFT.BYTES, XrSceneBoundsMSFT.BYTES));
        }

        public void write(long index, @NotNull XrSceneBoundsMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneBoundsMSFT.BYTES, XrSceneBoundsMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneBoundsMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneBoundsMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneBoundsMSFT.BYTES,
                (end - start) * XrSceneBoundsMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneBoundsMSFT.BYTES));
        }

        public XrSceneBoundsMSFT[] toArray() {
            XrSceneBoundsMSFT[] ret = new XrSceneBoundsMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneBoundsMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneBoundsMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneBoundsMSFT.BYTES;
            }

            @Override
            public XrSceneBoundsMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneBoundsMSFT ret = new XrSceneBoundsMSFT(segment.asSlice(0, XrSceneBoundsMSFT.BYTES));
                segment = segment.asSlice(XrSceneBoundsMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneBoundsMSFT allocate(Arena arena) {
        return new XrSceneBoundsMSFT(arena.allocate(LAYOUT));
    }

    public static XrSceneBoundsMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSceneBoundsMSFT.Ptr(segment);
    }

    public static XrSceneBoundsMSFT clone(Arena arena, XrSceneBoundsMSFT src) {
        XrSceneBoundsMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable XrSpace space() {
        MemorySegment s = segment.asSlice(OFFSET$space, SIZE$space);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrSceneBoundsMSFT space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrSceneBoundsMSFT time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public @Unsigned int sphereCount() {
        return segment.get(LAYOUT$sphereCount, OFFSET$sphereCount);
    }

    public XrSceneBoundsMSFT sphereCount(@Unsigned int value) {
        segment.set(LAYOUT$sphereCount, OFFSET$sphereCount, value);
        return this;
    }

    public XrSceneBoundsMSFT spheres(@Nullable IXrSceneSphereBoundMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        spheresRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSceneSphereBoundMSFT.Ptr spheres(int assumedCount) {
        MemorySegment s = spheresRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSceneSphereBoundMSFT.BYTES);
        return new XrSceneSphereBoundMSFT.Ptr(s);
    }

    public @Nullable XrSceneSphereBoundMSFT spheres() {
        MemorySegment s = spheresRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSceneSphereBoundMSFT(s);
    }

    public @Pointer(target=XrSceneSphereBoundMSFT.class) @NotNull MemorySegment spheresRaw() {
        return segment.get(LAYOUT$spheres, OFFSET$spheres);
    }

    public void spheresRaw(@Pointer(target=XrSceneSphereBoundMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$spheres, OFFSET$spheres, value);
    }

    public @Unsigned int boxCount() {
        return segment.get(LAYOUT$boxCount, OFFSET$boxCount);
    }

    public XrSceneBoundsMSFT boxCount(@Unsigned int value) {
        segment.set(LAYOUT$boxCount, OFFSET$boxCount, value);
        return this;
    }

    public XrSceneBoundsMSFT boxes(@Nullable IXrSceneOrientedBoxBoundMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        boxesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSceneOrientedBoxBoundMSFT.Ptr boxes(int assumedCount) {
        MemorySegment s = boxesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSceneOrientedBoxBoundMSFT.BYTES);
        return new XrSceneOrientedBoxBoundMSFT.Ptr(s);
    }

    public @Nullable XrSceneOrientedBoxBoundMSFT boxes() {
        MemorySegment s = boxesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSceneOrientedBoxBoundMSFT(s);
    }

    public @Pointer(target=XrSceneOrientedBoxBoundMSFT.class) @NotNull MemorySegment boxesRaw() {
        return segment.get(LAYOUT$boxes, OFFSET$boxes);
    }

    public void boxesRaw(@Pointer(target=XrSceneOrientedBoxBoundMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$boxes, OFFSET$boxes, value);
    }

    public @Unsigned int frustumCount() {
        return segment.get(LAYOUT$frustumCount, OFFSET$frustumCount);
    }

    public XrSceneBoundsMSFT frustumCount(@Unsigned int value) {
        segment.set(LAYOUT$frustumCount, OFFSET$frustumCount, value);
        return this;
    }

    public XrSceneBoundsMSFT frustums(@Nullable IXrSceneFrustumBoundMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        frustumsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSceneFrustumBoundMSFT.Ptr frustums(int assumedCount) {
        MemorySegment s = frustumsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSceneFrustumBoundMSFT.BYTES);
        return new XrSceneFrustumBoundMSFT.Ptr(s);
    }

    public @Nullable XrSceneFrustumBoundMSFT frustums() {
        MemorySegment s = frustumsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSceneFrustumBoundMSFT(s);
    }

    public @Pointer(target=XrSceneFrustumBoundMSFT.class) @NotNull MemorySegment frustumsRaw() {
        return segment.get(LAYOUT$frustums, OFFSET$frustums);
    }

    public void frustumsRaw(@Pointer(target=XrSceneFrustumBoundMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$frustums, OFFSET$frustums, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("space"),
        ValueLayout.JAVA_LONG.withName("time"),
        ValueLayout.JAVA_INT.withName("sphereCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrSceneSphereBoundMSFT.LAYOUT).withName("spheres"),
        ValueLayout.JAVA_INT.withName("boxCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrSceneOrientedBoxBoundMSFT.LAYOUT).withName("boxes"),
        ValueLayout.JAVA_INT.withName("frustumCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrSceneFrustumBoundMSFT.LAYOUT).withName("frustums")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$time = PathElement.groupElement("time");
    public static final PathElement PATH$sphereCount = PathElement.groupElement("sphereCount");
    public static final PathElement PATH$spheres = PathElement.groupElement("spheres");
    public static final PathElement PATH$boxCount = PathElement.groupElement("boxCount");
    public static final PathElement PATH$boxes = PathElement.groupElement("boxes");
    public static final PathElement PATH$frustumCount = PathElement.groupElement("frustumCount");
    public static final PathElement PATH$frustums = PathElement.groupElement("frustums");

    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);
    public static final OfInt LAYOUT$sphereCount = (OfInt) LAYOUT.select(PATH$sphereCount);
    public static final AddressLayout LAYOUT$spheres = (AddressLayout) LAYOUT.select(PATH$spheres);
    public static final OfInt LAYOUT$boxCount = (OfInt) LAYOUT.select(PATH$boxCount);
    public static final AddressLayout LAYOUT$boxes = (AddressLayout) LAYOUT.select(PATH$boxes);
    public static final OfInt LAYOUT$frustumCount = (OfInt) LAYOUT.select(PATH$frustumCount);
    public static final AddressLayout LAYOUT$frustums = (AddressLayout) LAYOUT.select(PATH$frustums);

    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();
    public static final long SIZE$sphereCount = LAYOUT$sphereCount.byteSize();
    public static final long SIZE$spheres = LAYOUT$spheres.byteSize();
    public static final long SIZE$boxCount = LAYOUT$boxCount.byteSize();
    public static final long SIZE$boxes = LAYOUT$boxes.byteSize();
    public static final long SIZE$frustumCount = LAYOUT$frustumCount.byteSize();
    public static final long SIZE$frustums = LAYOUT$frustums.byteSize();

    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
    public static final long OFFSET$sphereCount = LAYOUT.byteOffset(PATH$sphereCount);
    public static final long OFFSET$spheres = LAYOUT.byteOffset(PATH$spheres);
    public static final long OFFSET$boxCount = LAYOUT.byteOffset(PATH$boxCount);
    public static final long OFFSET$boxes = LAYOUT.byteOffset(PATH$boxes);
    public static final long OFFSET$frustumCount = LAYOUT.byteOffset(PATH$frustumCount);
    public static final long OFFSET$frustums = LAYOUT.byteOffset(PATH$frustums);
}

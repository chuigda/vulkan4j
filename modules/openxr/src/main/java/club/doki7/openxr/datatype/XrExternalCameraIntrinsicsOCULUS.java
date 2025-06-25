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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraIntrinsicsOCULUS.html"><code>XrExternalCameraIntrinsicsOCULUS</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrExternalCameraIntrinsicsOCULUS {
///     XrTime lastChangeTime; // @link substring="lastChangeTime" target="#lastChangeTime"
///     XrFovf fov; // @link substring="XrFovf" target="XrFovf" @link substring="fov" target="#fov"
///     float virtualNearPlaneDistance; // @link substring="virtualNearPlaneDistance" target="#virtualNearPlaneDistance"
///     float virtualFarPlaneDistance; // @link substring="virtualFarPlaneDistance" target="#virtualFarPlaneDistance"
///     XrExtent2Di imageSensorPixelResolution; // @link substring="XrExtent2Di" target="XrExtent2Di" @link substring="imageSensorPixelResolution" target="#imageSensorPixelResolution"
/// } XrExternalCameraIntrinsicsOCULUS;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraIntrinsicsOCULUS.html"><code>XrExternalCameraIntrinsicsOCULUS</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrExternalCameraIntrinsicsOCULUS(@NotNull MemorySegment segment) implements IXrExternalCameraIntrinsicsOCULUS {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraIntrinsicsOCULUS.html"><code>XrExternalCameraIntrinsicsOCULUS</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrExternalCameraIntrinsicsOCULUS}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrExternalCameraIntrinsicsOCULUS to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrExternalCameraIntrinsicsOCULUS.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrExternalCameraIntrinsicsOCULUS, Iterable<XrExternalCameraIntrinsicsOCULUS> {
        public long size() {
            return segment.byteSize() / XrExternalCameraIntrinsicsOCULUS.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrExternalCameraIntrinsicsOCULUS at(long index) {
            return new XrExternalCameraIntrinsicsOCULUS(segment.asSlice(index * XrExternalCameraIntrinsicsOCULUS.BYTES, XrExternalCameraIntrinsicsOCULUS.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrExternalCameraIntrinsicsOCULUS> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrExternalCameraIntrinsicsOCULUS value) {
            MemorySegment s = segment.asSlice(index * XrExternalCameraIntrinsicsOCULUS.BYTES, XrExternalCameraIntrinsicsOCULUS.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrExternalCameraIntrinsicsOCULUS.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrExternalCameraIntrinsicsOCULUS.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrExternalCameraIntrinsicsOCULUS.BYTES,
                (end - start) * XrExternalCameraIntrinsicsOCULUS.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrExternalCameraIntrinsicsOCULUS.BYTES));
        }

        public XrExternalCameraIntrinsicsOCULUS[] toArray() {
            XrExternalCameraIntrinsicsOCULUS[] ret = new XrExternalCameraIntrinsicsOCULUS[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrExternalCameraIntrinsicsOCULUS> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrExternalCameraIntrinsicsOCULUS> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrExternalCameraIntrinsicsOCULUS.BYTES;
            }

            @Override
            public XrExternalCameraIntrinsicsOCULUS next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrExternalCameraIntrinsicsOCULUS ret = new XrExternalCameraIntrinsicsOCULUS(segment.asSlice(0, XrExternalCameraIntrinsicsOCULUS.BYTES));
                segment = segment.asSlice(XrExternalCameraIntrinsicsOCULUS.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrExternalCameraIntrinsicsOCULUS allocate(Arena arena) {
        return new XrExternalCameraIntrinsicsOCULUS(arena.allocate(LAYOUT));
    }

    public static XrExternalCameraIntrinsicsOCULUS.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrExternalCameraIntrinsicsOCULUS.Ptr(segment);
    }

    public static XrExternalCameraIntrinsicsOCULUS clone(Arena arena, XrExternalCameraIntrinsicsOCULUS src) {
        XrExternalCameraIntrinsicsOCULUS ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("XrTime") long lastChangeTime() {
        return segment.get(LAYOUT$lastChangeTime, OFFSET$lastChangeTime);
    }

    public XrExternalCameraIntrinsicsOCULUS lastChangeTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$lastChangeTime, OFFSET$lastChangeTime, value);
        return this;
    }

    public @NotNull XrFovf fov() {
        return new XrFovf(segment.asSlice(OFFSET$fov, LAYOUT$fov));
    }

    public XrExternalCameraIntrinsicsOCULUS fov(@NotNull XrFovf value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fov, SIZE$fov);
        return this;
    }

    public XrExternalCameraIntrinsicsOCULUS fov(Consumer<@NotNull XrFovf> consumer) {
        consumer.accept(fov());
        return this;
    }

    public float virtualNearPlaneDistance() {
        return segment.get(LAYOUT$virtualNearPlaneDistance, OFFSET$virtualNearPlaneDistance);
    }

    public XrExternalCameraIntrinsicsOCULUS virtualNearPlaneDistance(float value) {
        segment.set(LAYOUT$virtualNearPlaneDistance, OFFSET$virtualNearPlaneDistance, value);
        return this;
    }

    public float virtualFarPlaneDistance() {
        return segment.get(LAYOUT$virtualFarPlaneDistance, OFFSET$virtualFarPlaneDistance);
    }

    public XrExternalCameraIntrinsicsOCULUS virtualFarPlaneDistance(float value) {
        segment.set(LAYOUT$virtualFarPlaneDistance, OFFSET$virtualFarPlaneDistance, value);
        return this;
    }

    public @NotNull XrExtent2Di imageSensorPixelResolution() {
        return new XrExtent2Di(segment.asSlice(OFFSET$imageSensorPixelResolution, LAYOUT$imageSensorPixelResolution));
    }

    public XrExternalCameraIntrinsicsOCULUS imageSensorPixelResolution(@NotNull XrExtent2Di value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageSensorPixelResolution, SIZE$imageSensorPixelResolution);
        return this;
    }

    public XrExternalCameraIntrinsicsOCULUS imageSensorPixelResolution(Consumer<@NotNull XrExtent2Di> consumer) {
        consumer.accept(imageSensorPixelResolution());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("lastChangeTime"),
        XrFovf.LAYOUT.withName("fov"),
        ValueLayout.JAVA_FLOAT.withName("virtualNearPlaneDistance"),
        ValueLayout.JAVA_FLOAT.withName("virtualFarPlaneDistance"),
        XrExtent2Di.LAYOUT.withName("imageSensorPixelResolution")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$lastChangeTime = PathElement.groupElement("lastChangeTime");
    public static final PathElement PATH$fov = PathElement.groupElement("fov");
    public static final PathElement PATH$virtualNearPlaneDistance = PathElement.groupElement("virtualNearPlaneDistance");
    public static final PathElement PATH$virtualFarPlaneDistance = PathElement.groupElement("virtualFarPlaneDistance");
    public static final PathElement PATH$imageSensorPixelResolution = PathElement.groupElement("imageSensorPixelResolution");

    public static final OfLong LAYOUT$lastChangeTime = (OfLong) LAYOUT.select(PATH$lastChangeTime);
    public static final StructLayout LAYOUT$fov = (StructLayout) LAYOUT.select(PATH$fov);
    public static final OfFloat LAYOUT$virtualNearPlaneDistance = (OfFloat) LAYOUT.select(PATH$virtualNearPlaneDistance);
    public static final OfFloat LAYOUT$virtualFarPlaneDistance = (OfFloat) LAYOUT.select(PATH$virtualFarPlaneDistance);
    public static final StructLayout LAYOUT$imageSensorPixelResolution = (StructLayout) LAYOUT.select(PATH$imageSensorPixelResolution);

    public static final long SIZE$lastChangeTime = LAYOUT$lastChangeTime.byteSize();
    public static final long SIZE$fov = LAYOUT$fov.byteSize();
    public static final long SIZE$virtualNearPlaneDistance = LAYOUT$virtualNearPlaneDistance.byteSize();
    public static final long SIZE$virtualFarPlaneDistance = LAYOUT$virtualFarPlaneDistance.byteSize();
    public static final long SIZE$imageSensorPixelResolution = LAYOUT$imageSensorPixelResolution.byteSize();

    public static final long OFFSET$lastChangeTime = LAYOUT.byteOffset(PATH$lastChangeTime);
    public static final long OFFSET$fov = LAYOUT.byteOffset(PATH$fov);
    public static final long OFFSET$virtualNearPlaneDistance = LAYOUT.byteOffset(PATH$virtualNearPlaneDistance);
    public static final long OFFSET$virtualFarPlaneDistance = LAYOUT.byteOffset(PATH$virtualFarPlaneDistance);
    public static final long OFFSET$imageSensorPixelResolution = LAYOUT.byteOffset(PATH$imageSensorPixelResolution);
}

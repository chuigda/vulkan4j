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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraExtrinsicsOCULUS.html"><code>XrExternalCameraExtrinsicsOCULUS</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrExternalCameraExtrinsicsOCULUS {
///     XrTime lastChangeTime; // @link substring="lastChangeTime" target="#lastChangeTime"
///     XrExternalCameraStatusFlagsOCULUS cameraStatusFlags; // optional // @link substring="XrExternalCameraStatusFlagsOCULUS" target="XrExternalCameraStatusFlagsOCULUS" @link substring="cameraStatusFlags" target="#cameraStatusFlags"
///     XrExternalCameraAttachedToDeviceOCULUS attachedToDevice; // @link substring="XrExternalCameraAttachedToDeviceOCULUS" target="XrExternalCameraAttachedToDeviceOCULUS" @link substring="attachedToDevice" target="#attachedToDevice"
///     XrPosef relativePose; // @link substring="XrPosef" target="XrPosef" @link substring="relativePose" target="#relativePose"
/// } XrExternalCameraExtrinsicsOCULUS;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraExtrinsicsOCULUS.html"><code>XrExternalCameraExtrinsicsOCULUS</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrExternalCameraExtrinsicsOCULUS(@NotNull MemorySegment segment) implements IXrExternalCameraExtrinsicsOCULUS {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraExtrinsicsOCULUS.html"><code>XrExternalCameraExtrinsicsOCULUS</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrExternalCameraExtrinsicsOCULUS}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrExternalCameraExtrinsicsOCULUS to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrExternalCameraExtrinsicsOCULUS.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrExternalCameraExtrinsicsOCULUS, Iterable<XrExternalCameraExtrinsicsOCULUS> {
        public long size() {
            return segment.byteSize() / XrExternalCameraExtrinsicsOCULUS.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrExternalCameraExtrinsicsOCULUS at(long index) {
            return new XrExternalCameraExtrinsicsOCULUS(segment.asSlice(index * XrExternalCameraExtrinsicsOCULUS.BYTES, XrExternalCameraExtrinsicsOCULUS.BYTES));
        }

        public XrExternalCameraExtrinsicsOCULUS.Ptr at(long index, @NotNull Consumer<@NotNull XrExternalCameraExtrinsicsOCULUS> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrExternalCameraExtrinsicsOCULUS value) {
            MemorySegment s = segment.asSlice(index * XrExternalCameraExtrinsicsOCULUS.BYTES, XrExternalCameraExtrinsicsOCULUS.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrExternalCameraExtrinsicsOCULUS.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrExternalCameraExtrinsicsOCULUS.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrExternalCameraExtrinsicsOCULUS.BYTES,
                (end - start) * XrExternalCameraExtrinsicsOCULUS.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrExternalCameraExtrinsicsOCULUS.BYTES));
        }

        public XrExternalCameraExtrinsicsOCULUS[] toArray() {
            XrExternalCameraExtrinsicsOCULUS[] ret = new XrExternalCameraExtrinsicsOCULUS[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrExternalCameraExtrinsicsOCULUS> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrExternalCameraExtrinsicsOCULUS> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrExternalCameraExtrinsicsOCULUS.BYTES;
            }

            @Override
            public XrExternalCameraExtrinsicsOCULUS next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrExternalCameraExtrinsicsOCULUS ret = new XrExternalCameraExtrinsicsOCULUS(segment.asSlice(0, XrExternalCameraExtrinsicsOCULUS.BYTES));
                segment = segment.asSlice(XrExternalCameraExtrinsicsOCULUS.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrExternalCameraExtrinsicsOCULUS allocate(Arena arena) {
        return new XrExternalCameraExtrinsicsOCULUS(arena.allocate(LAYOUT));
    }

    public static XrExternalCameraExtrinsicsOCULUS.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrExternalCameraExtrinsicsOCULUS.Ptr(segment);
    }

    public static XrExternalCameraExtrinsicsOCULUS clone(Arena arena, XrExternalCameraExtrinsicsOCULUS src) {
        XrExternalCameraExtrinsicsOCULUS ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("XrTime") long lastChangeTime() {
        return segment.get(LAYOUT$lastChangeTime, OFFSET$lastChangeTime);
    }

    public XrExternalCameraExtrinsicsOCULUS lastChangeTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$lastChangeTime, OFFSET$lastChangeTime, value);
        return this;
    }

    public @Bitmask(XrExternalCameraStatusFlagsOCULUS.class) long cameraStatusFlags() {
        return segment.get(LAYOUT$cameraStatusFlags, OFFSET$cameraStatusFlags);
    }

    public XrExternalCameraExtrinsicsOCULUS cameraStatusFlags(@Bitmask(XrExternalCameraStatusFlagsOCULUS.class) long value) {
        segment.set(LAYOUT$cameraStatusFlags, OFFSET$cameraStatusFlags, value);
        return this;
    }

    public @EnumType(XrExternalCameraAttachedToDeviceOCULUS.class) int attachedToDevice() {
        return segment.get(LAYOUT$attachedToDevice, OFFSET$attachedToDevice);
    }

    public XrExternalCameraExtrinsicsOCULUS attachedToDevice(@EnumType(XrExternalCameraAttachedToDeviceOCULUS.class) int value) {
        segment.set(LAYOUT$attachedToDevice, OFFSET$attachedToDevice, value);
        return this;
    }

    public @NotNull XrPosef relativePose() {
        return new XrPosef(segment.asSlice(OFFSET$relativePose, LAYOUT$relativePose));
    }

    public XrExternalCameraExtrinsicsOCULUS relativePose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$relativePose, SIZE$relativePose);
        return this;
    }

    public XrExternalCameraExtrinsicsOCULUS relativePose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(relativePose());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("lastChangeTime"),
        ValueLayout.JAVA_LONG.withName("cameraStatusFlags"),
        ValueLayout.JAVA_INT.withName("attachedToDevice"),
        XrPosef.LAYOUT.withName("relativePose")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$lastChangeTime = PathElement.groupElement("lastChangeTime");
    public static final PathElement PATH$cameraStatusFlags = PathElement.groupElement("cameraStatusFlags");
    public static final PathElement PATH$attachedToDevice = PathElement.groupElement("attachedToDevice");
    public static final PathElement PATH$relativePose = PathElement.groupElement("relativePose");

    public static final OfLong LAYOUT$lastChangeTime = (OfLong) LAYOUT.select(PATH$lastChangeTime);
    public static final OfLong LAYOUT$cameraStatusFlags = (OfLong) LAYOUT.select(PATH$cameraStatusFlags);
    public static final OfInt LAYOUT$attachedToDevice = (OfInt) LAYOUT.select(PATH$attachedToDevice);
    public static final StructLayout LAYOUT$relativePose = (StructLayout) LAYOUT.select(PATH$relativePose);

    public static final long SIZE$lastChangeTime = LAYOUT$lastChangeTime.byteSize();
    public static final long SIZE$cameraStatusFlags = LAYOUT$cameraStatusFlags.byteSize();
    public static final long SIZE$attachedToDevice = LAYOUT$attachedToDevice.byteSize();
    public static final long SIZE$relativePose = LAYOUT$relativePose.byteSize();

    public static final long OFFSET$lastChangeTime = LAYOUT.byteOffset(PATH$lastChangeTime);
    public static final long OFFSET$cameraStatusFlags = LAYOUT.byteOffset(PATH$cameraStatusFlags);
    public static final long OFFSET$attachedToDevice = LAYOUT.byteOffset(PATH$attachedToDevice);
    public static final long OFFSET$relativePose = LAYOUT.byteOffset(PATH$relativePose);
}

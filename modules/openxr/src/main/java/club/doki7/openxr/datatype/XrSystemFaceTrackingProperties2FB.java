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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemFaceTrackingProperties2FB.html"><code>XrSystemFaceTrackingProperties2FB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSystemFaceTrackingProperties2FB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrBool32 supportsVisualFaceTracking; // @link substring="supportsVisualFaceTracking" target="#supportsVisualFaceTracking"
///     XrBool32 supportsAudioFaceTracking; // @link substring="supportsAudioFaceTracking" target="#supportsAudioFaceTracking"
/// } XrSystemFaceTrackingProperties2FB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB`
///
/// The {@code allocate} ({@link XrSystemFaceTrackingProperties2FB#allocate(Arena)}, {@link XrSystemFaceTrackingProperties2FB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSystemFaceTrackingProperties2FB#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemFaceTrackingProperties2FB.html"><code>XrSystemFaceTrackingProperties2FB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSystemFaceTrackingProperties2FB(@NotNull MemorySegment segment) implements IXrSystemFaceTrackingProperties2FB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemFaceTrackingProperties2FB.html"><code>XrSystemFaceTrackingProperties2FB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSystemFaceTrackingProperties2FB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSystemFaceTrackingProperties2FB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSystemFaceTrackingProperties2FB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSystemFaceTrackingProperties2FB, Iterable<XrSystemFaceTrackingProperties2FB> {
        public long size() {
            return segment.byteSize() / XrSystemFaceTrackingProperties2FB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSystemFaceTrackingProperties2FB at(long index) {
            return new XrSystemFaceTrackingProperties2FB(segment.asSlice(index * XrSystemFaceTrackingProperties2FB.BYTES, XrSystemFaceTrackingProperties2FB.BYTES));
        }

        public void write(long index, @NotNull XrSystemFaceTrackingProperties2FB value) {
            MemorySegment s = segment.asSlice(index * XrSystemFaceTrackingProperties2FB.BYTES, XrSystemFaceTrackingProperties2FB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSystemFaceTrackingProperties2FB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSystemFaceTrackingProperties2FB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSystemFaceTrackingProperties2FB.BYTES,
                (end - start) * XrSystemFaceTrackingProperties2FB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSystemFaceTrackingProperties2FB.BYTES));
        }

        public XrSystemFaceTrackingProperties2FB[] toArray() {
            XrSystemFaceTrackingProperties2FB[] ret = new XrSystemFaceTrackingProperties2FB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSystemFaceTrackingProperties2FB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSystemFaceTrackingProperties2FB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSystemFaceTrackingProperties2FB.BYTES;
            }

            @Override
            public XrSystemFaceTrackingProperties2FB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSystemFaceTrackingProperties2FB ret = new XrSystemFaceTrackingProperties2FB(segment.asSlice(0, XrSystemFaceTrackingProperties2FB.BYTES));
                segment = segment.asSlice(XrSystemFaceTrackingProperties2FB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSystemFaceTrackingProperties2FB allocate(Arena arena) {
        XrSystemFaceTrackingProperties2FB ret = new XrSystemFaceTrackingProperties2FB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB);
        return ret;
    }

    public static XrSystemFaceTrackingProperties2FB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSystemFaceTrackingProperties2FB.Ptr ret = new XrSystemFaceTrackingProperties2FB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB);
        }
        return ret;
    }

    public static XrSystemFaceTrackingProperties2FB clone(Arena arena, XrSystemFaceTrackingProperties2FB src) {
        XrSystemFaceTrackingProperties2FB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSystemFaceTrackingProperties2FB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSystemFaceTrackingProperties2FB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSystemFaceTrackingProperties2FB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int supportsVisualFaceTracking() {
        return segment.get(LAYOUT$supportsVisualFaceTracking, OFFSET$supportsVisualFaceTracking);
    }

    public XrSystemFaceTrackingProperties2FB supportsVisualFaceTracking(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$supportsVisualFaceTracking, OFFSET$supportsVisualFaceTracking, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int supportsAudioFaceTracking() {
        return segment.get(LAYOUT$supportsAudioFaceTracking, OFFSET$supportsAudioFaceTracking);
    }

    public XrSystemFaceTrackingProperties2FB supportsAudioFaceTracking(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$supportsAudioFaceTracking, OFFSET$supportsAudioFaceTracking, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("supportsVisualFaceTracking"),
        ValueLayout.JAVA_INT.withName("supportsAudioFaceTracking")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$supportsVisualFaceTracking = PathElement.groupElement("supportsVisualFaceTracking");
    public static final PathElement PATH$supportsAudioFaceTracking = PathElement.groupElement("supportsAudioFaceTracking");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$supportsVisualFaceTracking = (OfInt) LAYOUT.select(PATH$supportsVisualFaceTracking);
    public static final OfInt LAYOUT$supportsAudioFaceTracking = (OfInt) LAYOUT.select(PATH$supportsAudioFaceTracking);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$supportsVisualFaceTracking = LAYOUT$supportsVisualFaceTracking.byteSize();
    public static final long SIZE$supportsAudioFaceTracking = LAYOUT$supportsAudioFaceTracking.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$supportsVisualFaceTracking = LAYOUT.byteOffset(PATH$supportsVisualFaceTracking);
    public static final long OFFSET$supportsAudioFaceTracking = LAYOUT.byteOffset(PATH$supportsAudioFaceTracking);
}

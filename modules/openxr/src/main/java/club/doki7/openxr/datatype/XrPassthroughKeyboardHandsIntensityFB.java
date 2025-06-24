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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughKeyboardHandsIntensityFB.html"><code>XrPassthroughKeyboardHandsIntensityFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrPassthroughKeyboardHandsIntensityFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     float leftHandIntensity; // @link substring="leftHandIntensity" target="#leftHandIntensity"
///     float rightHandIntensity; // @link substring="rightHandIntensity" target="#rightHandIntensity"
/// } XrPassthroughKeyboardHandsIntensityFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB`
///
/// The {@code allocate} ({@link XrPassthroughKeyboardHandsIntensityFB#allocate(Arena)}, {@link XrPassthroughKeyboardHandsIntensityFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrPassthroughKeyboardHandsIntensityFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughKeyboardHandsIntensityFB.html"><code>XrPassthroughKeyboardHandsIntensityFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrPassthroughKeyboardHandsIntensityFB(@NotNull MemorySegment segment) implements IXrPassthroughKeyboardHandsIntensityFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughKeyboardHandsIntensityFB.html"><code>XrPassthroughKeyboardHandsIntensityFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrPassthroughKeyboardHandsIntensityFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrPassthroughKeyboardHandsIntensityFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrPassthroughKeyboardHandsIntensityFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrPassthroughKeyboardHandsIntensityFB, Iterable<XrPassthroughKeyboardHandsIntensityFB> {
        public long size() {
            return segment.byteSize() / XrPassthroughKeyboardHandsIntensityFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrPassthroughKeyboardHandsIntensityFB at(long index) {
            return new XrPassthroughKeyboardHandsIntensityFB(segment.asSlice(index * XrPassthroughKeyboardHandsIntensityFB.BYTES, XrPassthroughKeyboardHandsIntensityFB.BYTES));
        }

        public void write(long index, @NotNull XrPassthroughKeyboardHandsIntensityFB value) {
            MemorySegment s = segment.asSlice(index * XrPassthroughKeyboardHandsIntensityFB.BYTES, XrPassthroughKeyboardHandsIntensityFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrPassthroughKeyboardHandsIntensityFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrPassthroughKeyboardHandsIntensityFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrPassthroughKeyboardHandsIntensityFB.BYTES,
                (end - start) * XrPassthroughKeyboardHandsIntensityFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrPassthroughKeyboardHandsIntensityFB.BYTES));
        }

        public XrPassthroughKeyboardHandsIntensityFB[] toArray() {
            XrPassthroughKeyboardHandsIntensityFB[] ret = new XrPassthroughKeyboardHandsIntensityFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrPassthroughKeyboardHandsIntensityFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrPassthroughKeyboardHandsIntensityFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrPassthroughKeyboardHandsIntensityFB.BYTES;
            }

            @Override
            public XrPassthroughKeyboardHandsIntensityFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrPassthroughKeyboardHandsIntensityFB ret = new XrPassthroughKeyboardHandsIntensityFB(segment.asSlice(0, XrPassthroughKeyboardHandsIntensityFB.BYTES));
                segment = segment.asSlice(XrPassthroughKeyboardHandsIntensityFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrPassthroughKeyboardHandsIntensityFB allocate(Arena arena) {
        XrPassthroughKeyboardHandsIntensityFB ret = new XrPassthroughKeyboardHandsIntensityFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB);
        return ret;
    }

    public static XrPassthroughKeyboardHandsIntensityFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrPassthroughKeyboardHandsIntensityFB.Ptr ret = new XrPassthroughKeyboardHandsIntensityFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB);
        }
        return ret;
    }

    public static XrPassthroughKeyboardHandsIntensityFB clone(Arena arena, XrPassthroughKeyboardHandsIntensityFB src) {
        XrPassthroughKeyboardHandsIntensityFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrPassthroughKeyboardHandsIntensityFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrPassthroughKeyboardHandsIntensityFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrPassthroughKeyboardHandsIntensityFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public float leftHandIntensity() {
        return segment.get(LAYOUT$leftHandIntensity, OFFSET$leftHandIntensity);
    }

    public XrPassthroughKeyboardHandsIntensityFB leftHandIntensity(float value) {
        segment.set(LAYOUT$leftHandIntensity, OFFSET$leftHandIntensity, value);
        return this;
    }

    public float rightHandIntensity() {
        return segment.get(LAYOUT$rightHandIntensity, OFFSET$rightHandIntensity);
    }

    public XrPassthroughKeyboardHandsIntensityFB rightHandIntensity(float value) {
        segment.set(LAYOUT$rightHandIntensity, OFFSET$rightHandIntensity, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_FLOAT.withName("leftHandIntensity"),
        ValueLayout.JAVA_FLOAT.withName("rightHandIntensity")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$leftHandIntensity = PathElement.groupElement("leftHandIntensity");
    public static final PathElement PATH$rightHandIntensity = PathElement.groupElement("rightHandIntensity");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfFloat LAYOUT$leftHandIntensity = (OfFloat) LAYOUT.select(PATH$leftHandIntensity);
    public static final OfFloat LAYOUT$rightHandIntensity = (OfFloat) LAYOUT.select(PATH$rightHandIntensity);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$leftHandIntensity = LAYOUT$leftHandIntensity.byteSize();
    public static final long SIZE$rightHandIntensity = LAYOUT$rightHandIntensity.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$leftHandIntensity = LAYOUT.byteOffset(PATH$leftHandIntensity);
    public static final long OFFSET$rightHandIntensity = LAYOUT.byteOffset(PATH$rightHandIntensity);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingAimStateFB.html"><code>XrHandTrackingAimStateFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandTrackingAimStateFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrHandTrackingAimFlagsFB status; // @link substring="XrHandTrackingAimFlagsFB" target="XrHandTrackingAimFlagsFB" @link substring="status" target="#status"
///     XrPosef aimPose; // @link substring="XrPosef" target="XrPosef" @link substring="aimPose" target="#aimPose"
///     float pinchStrengthIndex; // @link substring="pinchStrengthIndex" target="#pinchStrengthIndex"
///     float pinchStrengthMiddle; // @link substring="pinchStrengthMiddle" target="#pinchStrengthMiddle"
///     float pinchStrengthRing; // @link substring="pinchStrengthRing" target="#pinchStrengthRing"
///     float pinchStrengthLittle; // @link substring="pinchStrengthLittle" target="#pinchStrengthLittle"
/// } XrHandTrackingAimStateFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_HAND_TRACKING_AIM_STATE_FB`
///
/// The {@code allocate} ({@link XrHandTrackingAimStateFB#allocate(Arena)}, {@link XrHandTrackingAimStateFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrHandTrackingAimStateFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingAimStateFB.html"><code>XrHandTrackingAimStateFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandTrackingAimStateFB(@NotNull MemorySegment segment) implements IXrHandTrackingAimStateFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingAimStateFB.html"><code>XrHandTrackingAimStateFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandTrackingAimStateFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandTrackingAimStateFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandTrackingAimStateFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandTrackingAimStateFB, Iterable<XrHandTrackingAimStateFB> {
        public long size() {
            return segment.byteSize() / XrHandTrackingAimStateFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandTrackingAimStateFB at(long index) {
            return new XrHandTrackingAimStateFB(segment.asSlice(index * XrHandTrackingAimStateFB.BYTES, XrHandTrackingAimStateFB.BYTES));
        }

        public void write(long index, @NotNull XrHandTrackingAimStateFB value) {
            MemorySegment s = segment.asSlice(index * XrHandTrackingAimStateFB.BYTES, XrHandTrackingAimStateFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandTrackingAimStateFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandTrackingAimStateFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandTrackingAimStateFB.BYTES,
                (end - start) * XrHandTrackingAimStateFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandTrackingAimStateFB.BYTES));
        }

        public XrHandTrackingAimStateFB[] toArray() {
            XrHandTrackingAimStateFB[] ret = new XrHandTrackingAimStateFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandTrackingAimStateFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandTrackingAimStateFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandTrackingAimStateFB.BYTES;
            }

            @Override
            public XrHandTrackingAimStateFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandTrackingAimStateFB ret = new XrHandTrackingAimStateFB(segment.asSlice(0, XrHandTrackingAimStateFB.BYTES));
                segment = segment.asSlice(XrHandTrackingAimStateFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandTrackingAimStateFB allocate(Arena arena) {
        XrHandTrackingAimStateFB ret = new XrHandTrackingAimStateFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_HAND_TRACKING_AIM_STATE_FB);
        return ret;
    }

    public static XrHandTrackingAimStateFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrHandTrackingAimStateFB.Ptr ret = new XrHandTrackingAimStateFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_HAND_TRACKING_AIM_STATE_FB);
        }
        return ret;
    }

    public static XrHandTrackingAimStateFB clone(Arena arena, XrHandTrackingAimStateFB src) {
        XrHandTrackingAimStateFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_HAND_TRACKING_AIM_STATE_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrHandTrackingAimStateFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrHandTrackingAimStateFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrHandTrackingAimStateFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrHandTrackingAimFlagsFB.class) long status() {
        return segment.get(LAYOUT$status, OFFSET$status);
    }

    public XrHandTrackingAimStateFB status(@Bitmask(XrHandTrackingAimFlagsFB.class) long value) {
        segment.set(LAYOUT$status, OFFSET$status, value);
        return this;
    }

    public @NotNull XrPosef aimPose() {
        return new XrPosef(segment.asSlice(OFFSET$aimPose, LAYOUT$aimPose));
    }

    public XrHandTrackingAimStateFB aimPose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$aimPose, SIZE$aimPose);
        return this;
    }

    public XrHandTrackingAimStateFB aimPose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(aimPose());
        return this;
    }

    public float pinchStrengthIndex() {
        return segment.get(LAYOUT$pinchStrengthIndex, OFFSET$pinchStrengthIndex);
    }

    public XrHandTrackingAimStateFB pinchStrengthIndex(float value) {
        segment.set(LAYOUT$pinchStrengthIndex, OFFSET$pinchStrengthIndex, value);
        return this;
    }

    public float pinchStrengthMiddle() {
        return segment.get(LAYOUT$pinchStrengthMiddle, OFFSET$pinchStrengthMiddle);
    }

    public XrHandTrackingAimStateFB pinchStrengthMiddle(float value) {
        segment.set(LAYOUT$pinchStrengthMiddle, OFFSET$pinchStrengthMiddle, value);
        return this;
    }

    public float pinchStrengthRing() {
        return segment.get(LAYOUT$pinchStrengthRing, OFFSET$pinchStrengthRing);
    }

    public XrHandTrackingAimStateFB pinchStrengthRing(float value) {
        segment.set(LAYOUT$pinchStrengthRing, OFFSET$pinchStrengthRing, value);
        return this;
    }

    public float pinchStrengthLittle() {
        return segment.get(LAYOUT$pinchStrengthLittle, OFFSET$pinchStrengthLittle);
    }

    public XrHandTrackingAimStateFB pinchStrengthLittle(float value) {
        segment.set(LAYOUT$pinchStrengthLittle, OFFSET$pinchStrengthLittle, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("status"),
        XrPosef.LAYOUT.withName("aimPose"),
        ValueLayout.JAVA_FLOAT.withName("pinchStrengthIndex"),
        ValueLayout.JAVA_FLOAT.withName("pinchStrengthMiddle"),
        ValueLayout.JAVA_FLOAT.withName("pinchStrengthRing"),
        ValueLayout.JAVA_FLOAT.withName("pinchStrengthLittle")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$status = PathElement.groupElement("status");
    public static final PathElement PATH$aimPose = PathElement.groupElement("aimPose");
    public static final PathElement PATH$pinchStrengthIndex = PathElement.groupElement("pinchStrengthIndex");
    public static final PathElement PATH$pinchStrengthMiddle = PathElement.groupElement("pinchStrengthMiddle");
    public static final PathElement PATH$pinchStrengthRing = PathElement.groupElement("pinchStrengthRing");
    public static final PathElement PATH$pinchStrengthLittle = PathElement.groupElement("pinchStrengthLittle");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$status = (OfLong) LAYOUT.select(PATH$status);
    public static final StructLayout LAYOUT$aimPose = (StructLayout) LAYOUT.select(PATH$aimPose);
    public static final OfFloat LAYOUT$pinchStrengthIndex = (OfFloat) LAYOUT.select(PATH$pinchStrengthIndex);
    public static final OfFloat LAYOUT$pinchStrengthMiddle = (OfFloat) LAYOUT.select(PATH$pinchStrengthMiddle);
    public static final OfFloat LAYOUT$pinchStrengthRing = (OfFloat) LAYOUT.select(PATH$pinchStrengthRing);
    public static final OfFloat LAYOUT$pinchStrengthLittle = (OfFloat) LAYOUT.select(PATH$pinchStrengthLittle);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$status = LAYOUT$status.byteSize();
    public static final long SIZE$aimPose = LAYOUT$aimPose.byteSize();
    public static final long SIZE$pinchStrengthIndex = LAYOUT$pinchStrengthIndex.byteSize();
    public static final long SIZE$pinchStrengthMiddle = LAYOUT$pinchStrengthMiddle.byteSize();
    public static final long SIZE$pinchStrengthRing = LAYOUT$pinchStrengthRing.byteSize();
    public static final long SIZE$pinchStrengthLittle = LAYOUT$pinchStrengthLittle.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$status = LAYOUT.byteOffset(PATH$status);
    public static final long OFFSET$aimPose = LAYOUT.byteOffset(PATH$aimPose);
    public static final long OFFSET$pinchStrengthIndex = LAYOUT.byteOffset(PATH$pinchStrengthIndex);
    public static final long OFFSET$pinchStrengthMiddle = LAYOUT.byteOffset(PATH$pinchStrengthMiddle);
    public static final long OFFSET$pinchStrengthRing = LAYOUT.byteOffset(PATH$pinchStrengthRing);
    public static final long OFFSET$pinchStrengthLittle = LAYOUT.byteOffset(PATH$pinchStrengthLittle);
}

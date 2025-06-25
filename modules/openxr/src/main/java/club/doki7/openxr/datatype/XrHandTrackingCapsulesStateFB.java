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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingCapsulesStateFB.html"><code>XrHandTrackingCapsulesStateFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandTrackingCapsulesStateFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrHandCapsuleFB capsules; // @link substring="XrHandCapsuleFB" target="XrHandCapsuleFB" @link substring="capsules" target="#capsules"
/// } XrHandTrackingCapsulesStateFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_HAND_TRACKING_CAPSULES_STATE_FB`
///
/// The {@code allocate} ({@link XrHandTrackingCapsulesStateFB#allocate(Arena)}, {@link XrHandTrackingCapsulesStateFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrHandTrackingCapsulesStateFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingCapsulesStateFB.html"><code>XrHandTrackingCapsulesStateFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandTrackingCapsulesStateFB(@NotNull MemorySegment segment) implements IXrHandTrackingCapsulesStateFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingCapsulesStateFB.html"><code>XrHandTrackingCapsulesStateFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandTrackingCapsulesStateFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandTrackingCapsulesStateFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandTrackingCapsulesStateFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandTrackingCapsulesStateFB, Iterable<XrHandTrackingCapsulesStateFB> {
        public long size() {
            return segment.byteSize() / XrHandTrackingCapsulesStateFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandTrackingCapsulesStateFB at(long index) {
            return new XrHandTrackingCapsulesStateFB(segment.asSlice(index * XrHandTrackingCapsulesStateFB.BYTES, XrHandTrackingCapsulesStateFB.BYTES));
        }

        public void write(long index, @NotNull XrHandTrackingCapsulesStateFB value) {
            MemorySegment s = segment.asSlice(index * XrHandTrackingCapsulesStateFB.BYTES, XrHandTrackingCapsulesStateFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandTrackingCapsulesStateFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandTrackingCapsulesStateFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandTrackingCapsulesStateFB.BYTES,
                (end - start) * XrHandTrackingCapsulesStateFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandTrackingCapsulesStateFB.BYTES));
        }

        public XrHandTrackingCapsulesStateFB[] toArray() {
            XrHandTrackingCapsulesStateFB[] ret = new XrHandTrackingCapsulesStateFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandTrackingCapsulesStateFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandTrackingCapsulesStateFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandTrackingCapsulesStateFB.BYTES;
            }

            @Override
            public XrHandTrackingCapsulesStateFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandTrackingCapsulesStateFB ret = new XrHandTrackingCapsulesStateFB(segment.asSlice(0, XrHandTrackingCapsulesStateFB.BYTES));
                segment = segment.asSlice(XrHandTrackingCapsulesStateFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandTrackingCapsulesStateFB allocate(Arena arena) {
        XrHandTrackingCapsulesStateFB ret = new XrHandTrackingCapsulesStateFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.HAND_TRACKING_CAPSULES_STATE_FB);
        return ret;
    }

    public static XrHandTrackingCapsulesStateFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrHandTrackingCapsulesStateFB.Ptr ret = new XrHandTrackingCapsulesStateFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.HAND_TRACKING_CAPSULES_STATE_FB);
        }
        return ret;
    }

    public static XrHandTrackingCapsulesStateFB clone(Arena arena, XrHandTrackingCapsulesStateFB src) {
        XrHandTrackingCapsulesStateFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.HAND_TRACKING_CAPSULES_STATE_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrHandTrackingCapsulesStateFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrHandTrackingCapsulesStateFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrHandTrackingCapsulesStateFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrHandCapsuleFB capsules() {
        return new XrHandCapsuleFB(segment.asSlice(OFFSET$capsules, LAYOUT$capsules));
    }

    public XrHandTrackingCapsulesStateFB capsules(@NotNull XrHandCapsuleFB value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$capsules, SIZE$capsules);
        return this;
    }

    public XrHandTrackingCapsulesStateFB capsules(Consumer<@NotNull XrHandCapsuleFB> consumer) {
        consumer.accept(capsules());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrHandCapsuleFB.LAYOUT.withName("capsules")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$capsules = PathElement.groupElement("capsules");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$capsules = (StructLayout) LAYOUT.select(PATH$capsules);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$capsules = LAYOUT$capsules.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$capsules = LAYOUT.byteOffset(PATH$capsules);
}

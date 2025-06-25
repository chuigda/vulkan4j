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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionProfileAnalogThresholdVALVE.html"><code>XrInteractionProfileAnalogThresholdVALVE</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrInteractionProfileAnalogThresholdVALVE {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrAction action; // @link substring="XrAction" target="XrAction" @link substring="action" target="#action"
///     XrPath binding; // @link substring="binding" target="#binding"
///     float onThreshold; // @link substring="onThreshold" target="#onThreshold"
///     float offThreshold; // @link substring="offThreshold" target="#offThreshold"
///     XrHapticBaseHeader const* onHaptic; // optional // @link substring="XrHapticBaseHeader" target="XrHapticBaseHeader" @link substring="onHaptic" target="#onHaptic"
///     XrHapticBaseHeader const* offHaptic; // optional // @link substring="XrHapticBaseHeader" target="XrHapticBaseHeader" @link substring="offHaptic" target="#offHaptic"
/// } XrInteractionProfileAnalogThresholdVALVE;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE`
///
/// The {@code allocate} ({@link XrInteractionProfileAnalogThresholdVALVE#allocate(Arena)}, {@link XrInteractionProfileAnalogThresholdVALVE#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrInteractionProfileAnalogThresholdVALVE#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionProfileAnalogThresholdVALVE.html"><code>XrInteractionProfileAnalogThresholdVALVE</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrInteractionProfileAnalogThresholdVALVE(@NotNull MemorySegment segment) implements IXrInteractionProfileAnalogThresholdVALVE {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionProfileAnalogThresholdVALVE.html"><code>XrInteractionProfileAnalogThresholdVALVE</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrInteractionProfileAnalogThresholdVALVE}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrInteractionProfileAnalogThresholdVALVE to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrInteractionProfileAnalogThresholdVALVE.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrInteractionProfileAnalogThresholdVALVE, Iterable<XrInteractionProfileAnalogThresholdVALVE> {
        public long size() {
            return segment.byteSize() / XrInteractionProfileAnalogThresholdVALVE.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrInteractionProfileAnalogThresholdVALVE at(long index) {
            return new XrInteractionProfileAnalogThresholdVALVE(segment.asSlice(index * XrInteractionProfileAnalogThresholdVALVE.BYTES, XrInteractionProfileAnalogThresholdVALVE.BYTES));
        }

        public XrInteractionProfileAnalogThresholdVALVE.Ptr at(long index, @NotNull Consumer<@NotNull XrInteractionProfileAnalogThresholdVALVE> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrInteractionProfileAnalogThresholdVALVE value) {
            MemorySegment s = segment.asSlice(index * XrInteractionProfileAnalogThresholdVALVE.BYTES, XrInteractionProfileAnalogThresholdVALVE.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrInteractionProfileAnalogThresholdVALVE.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrInteractionProfileAnalogThresholdVALVE.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrInteractionProfileAnalogThresholdVALVE.BYTES,
                (end - start) * XrInteractionProfileAnalogThresholdVALVE.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrInteractionProfileAnalogThresholdVALVE.BYTES));
        }

        public XrInteractionProfileAnalogThresholdVALVE[] toArray() {
            XrInteractionProfileAnalogThresholdVALVE[] ret = new XrInteractionProfileAnalogThresholdVALVE[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrInteractionProfileAnalogThresholdVALVE> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrInteractionProfileAnalogThresholdVALVE> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrInteractionProfileAnalogThresholdVALVE.BYTES;
            }

            @Override
            public XrInteractionProfileAnalogThresholdVALVE next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrInteractionProfileAnalogThresholdVALVE ret = new XrInteractionProfileAnalogThresholdVALVE(segment.asSlice(0, XrInteractionProfileAnalogThresholdVALVE.BYTES));
                segment = segment.asSlice(XrInteractionProfileAnalogThresholdVALVE.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrInteractionProfileAnalogThresholdVALVE allocate(Arena arena) {
        XrInteractionProfileAnalogThresholdVALVE ret = new XrInteractionProfileAnalogThresholdVALVE(arena.allocate(LAYOUT));
        ret.type(XrStructureType.INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE);
        return ret;
    }

    public static XrInteractionProfileAnalogThresholdVALVE.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrInteractionProfileAnalogThresholdVALVE.Ptr ret = new XrInteractionProfileAnalogThresholdVALVE.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE);
        }
        return ret;
    }

    public static XrInteractionProfileAnalogThresholdVALVE clone(Arena arena, XrInteractionProfileAnalogThresholdVALVE src) {
        XrInteractionProfileAnalogThresholdVALVE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrInteractionProfileAnalogThresholdVALVE type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrInteractionProfileAnalogThresholdVALVE next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrInteractionProfileAnalogThresholdVALVE next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrAction action() {
        MemorySegment s = segment.asSlice(OFFSET$action, SIZE$action);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrAction(s);
    }

    public XrInteractionProfileAnalogThresholdVALVE action(@Nullable XrAction value) {
        segment.set(LAYOUT$action, OFFSET$action, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrPath") @Unsigned long binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public XrInteractionProfileAnalogThresholdVALVE binding(@NativeType("XrPath") @Unsigned long value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
        return this;
    }

    public float onThreshold() {
        return segment.get(LAYOUT$onThreshold, OFFSET$onThreshold);
    }

    public XrInteractionProfileAnalogThresholdVALVE onThreshold(float value) {
        segment.set(LAYOUT$onThreshold, OFFSET$onThreshold, value);
        return this;
    }

    public float offThreshold() {
        return segment.get(LAYOUT$offThreshold, OFFSET$offThreshold);
    }

    public XrInteractionProfileAnalogThresholdVALVE offThreshold(float value) {
        segment.set(LAYOUT$offThreshold, OFFSET$offThreshold, value);
        return this;
    }

    public XrInteractionProfileAnalogThresholdVALVE onHaptic(@Nullable IXrHapticBaseHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        onHapticRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrHapticBaseHeader.Ptr onHaptic(int assumedCount) {
        MemorySegment s = onHapticRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrHapticBaseHeader.BYTES);
        return new XrHapticBaseHeader.Ptr(s);
    }

    public @Nullable XrHapticBaseHeader onHaptic() {
        MemorySegment s = onHapticRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrHapticBaseHeader(s);
    }

    public @Pointer(target=XrHapticBaseHeader.class) @NotNull MemorySegment onHapticRaw() {
        return segment.get(LAYOUT$onHaptic, OFFSET$onHaptic);
    }

    public void onHapticRaw(@Pointer(target=XrHapticBaseHeader.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$onHaptic, OFFSET$onHaptic, value);
    }

    public XrInteractionProfileAnalogThresholdVALVE offHaptic(@Nullable IXrHapticBaseHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        offHapticRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrHapticBaseHeader.Ptr offHaptic(int assumedCount) {
        MemorySegment s = offHapticRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrHapticBaseHeader.BYTES);
        return new XrHapticBaseHeader.Ptr(s);
    }

    public @Nullable XrHapticBaseHeader offHaptic() {
        MemorySegment s = offHapticRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrHapticBaseHeader(s);
    }

    public @Pointer(target=XrHapticBaseHeader.class) @NotNull MemorySegment offHapticRaw() {
        return segment.get(LAYOUT$offHaptic, OFFSET$offHaptic);
    }

    public void offHapticRaw(@Pointer(target=XrHapticBaseHeader.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$offHaptic, OFFSET$offHaptic, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("action"),
        ValueLayout.JAVA_LONG.withName("binding"),
        ValueLayout.JAVA_FLOAT.withName("onThreshold"),
        ValueLayout.JAVA_FLOAT.withName("offThreshold"),
        ValueLayout.ADDRESS.withTargetLayout(XrHapticBaseHeader.LAYOUT).withName("onHaptic"),
        ValueLayout.ADDRESS.withTargetLayout(XrHapticBaseHeader.LAYOUT).withName("offHaptic")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$action = PathElement.groupElement("action");
    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$onThreshold = PathElement.groupElement("onThreshold");
    public static final PathElement PATH$offThreshold = PathElement.groupElement("offThreshold");
    public static final PathElement PATH$onHaptic = PathElement.groupElement("onHaptic");
    public static final PathElement PATH$offHaptic = PathElement.groupElement("offHaptic");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$action = (AddressLayout) LAYOUT.select(PATH$action);
    public static final OfLong LAYOUT$binding = (OfLong) LAYOUT.select(PATH$binding);
    public static final OfFloat LAYOUT$onThreshold = (OfFloat) LAYOUT.select(PATH$onThreshold);
    public static final OfFloat LAYOUT$offThreshold = (OfFloat) LAYOUT.select(PATH$offThreshold);
    public static final AddressLayout LAYOUT$onHaptic = (AddressLayout) LAYOUT.select(PATH$onHaptic);
    public static final AddressLayout LAYOUT$offHaptic = (AddressLayout) LAYOUT.select(PATH$offHaptic);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$action = LAYOUT$action.byteSize();
    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$onThreshold = LAYOUT$onThreshold.byteSize();
    public static final long SIZE$offThreshold = LAYOUT$offThreshold.byteSize();
    public static final long SIZE$onHaptic = LAYOUT$onHaptic.byteSize();
    public static final long SIZE$offHaptic = LAYOUT$offHaptic.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$action = LAYOUT.byteOffset(PATH$action);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$onThreshold = LAYOUT.byteOffset(PATH$onThreshold);
    public static final long OFFSET$offThreshold = LAYOUT.byteOffset(PATH$offThreshold);
    public static final long OFFSET$onHaptic = LAYOUT.byteOffset(PATH$onHaptic);
    public static final long OFFSET$offHaptic = LAYOUT.byteOffset(PATH$offHaptic);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionProfileDpadBindingEXT.html"><code>XrInteractionProfileDpadBindingEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrInteractionProfileDpadBindingEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrPath binding; // @link substring="binding" target="#binding"
///     XrActionSet actionSet; // @link substring="XrActionSet" target="XrActionSet" @link substring="actionSet" target="#actionSet"
///     float forceThreshold; // @link substring="forceThreshold" target="#forceThreshold"
///     float forceThresholdReleased; // @link substring="forceThresholdReleased" target="#forceThresholdReleased"
///     float centerRegion; // @link substring="centerRegion" target="#centerRegion"
///     float wedgeAngle; // @link substring="wedgeAngle" target="#wedgeAngle"
///     XrBool32 isSticky; // @link substring="isSticky" target="#isSticky"
///     XrHapticBaseHeader const* onHaptic; // optional // @link substring="XrHapticBaseHeader" target="XrHapticBaseHeader" @link substring="onHaptic" target="#onHaptic"
///     XrHapticBaseHeader const* offHaptic; // optional // @link substring="XrHapticBaseHeader" target="XrHapticBaseHeader" @link substring="offHaptic" target="#offHaptic"
/// } XrInteractionProfileDpadBindingEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT`
///
/// The {@code allocate} ({@link XrInteractionProfileDpadBindingEXT#allocate(Arena)}, {@link XrInteractionProfileDpadBindingEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrInteractionProfileDpadBindingEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionProfileDpadBindingEXT.html"><code>XrInteractionProfileDpadBindingEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrInteractionProfileDpadBindingEXT(@NotNull MemorySegment segment) implements IXrInteractionProfileDpadBindingEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionProfileDpadBindingEXT.html"><code>XrInteractionProfileDpadBindingEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrInteractionProfileDpadBindingEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrInteractionProfileDpadBindingEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrInteractionProfileDpadBindingEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrInteractionProfileDpadBindingEXT, Iterable<XrInteractionProfileDpadBindingEXT> {
        public long size() {
            return segment.byteSize() / XrInteractionProfileDpadBindingEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrInteractionProfileDpadBindingEXT at(long index) {
            return new XrInteractionProfileDpadBindingEXT(segment.asSlice(index * XrInteractionProfileDpadBindingEXT.BYTES, XrInteractionProfileDpadBindingEXT.BYTES));
        }

        public XrInteractionProfileDpadBindingEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrInteractionProfileDpadBindingEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrInteractionProfileDpadBindingEXT value) {
            MemorySegment s = segment.asSlice(index * XrInteractionProfileDpadBindingEXT.BYTES, XrInteractionProfileDpadBindingEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrInteractionProfileDpadBindingEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrInteractionProfileDpadBindingEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrInteractionProfileDpadBindingEXT.BYTES,
                (end - start) * XrInteractionProfileDpadBindingEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrInteractionProfileDpadBindingEXT.BYTES));
        }

        public XrInteractionProfileDpadBindingEXT[] toArray() {
            XrInteractionProfileDpadBindingEXT[] ret = new XrInteractionProfileDpadBindingEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrInteractionProfileDpadBindingEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrInteractionProfileDpadBindingEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrInteractionProfileDpadBindingEXT.BYTES;
            }

            @Override
            public XrInteractionProfileDpadBindingEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrInteractionProfileDpadBindingEXT ret = new XrInteractionProfileDpadBindingEXT(segment.asSlice(0, XrInteractionProfileDpadBindingEXT.BYTES));
                segment = segment.asSlice(XrInteractionProfileDpadBindingEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrInteractionProfileDpadBindingEXT allocate(Arena arena) {
        XrInteractionProfileDpadBindingEXT ret = new XrInteractionProfileDpadBindingEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.INTERACTION_PROFILE_DPAD_BINDING_EXT);
        return ret;
    }

    public static XrInteractionProfileDpadBindingEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrInteractionProfileDpadBindingEXT.Ptr ret = new XrInteractionProfileDpadBindingEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.INTERACTION_PROFILE_DPAD_BINDING_EXT);
        }
        return ret;
    }

    public static XrInteractionProfileDpadBindingEXT clone(Arena arena, XrInteractionProfileDpadBindingEXT src) {
        XrInteractionProfileDpadBindingEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.INTERACTION_PROFILE_DPAD_BINDING_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrInteractionProfileDpadBindingEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrInteractionProfileDpadBindingEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrInteractionProfileDpadBindingEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrPath") @Unsigned long binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public XrInteractionProfileDpadBindingEXT binding(@NativeType("XrPath") @Unsigned long value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
        return this;
    }

    public @Nullable XrActionSet actionSet() {
        MemorySegment s = segment.asSlice(OFFSET$actionSet, SIZE$actionSet);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrActionSet(s);
    }

    public XrInteractionProfileDpadBindingEXT actionSet(@Nullable XrActionSet value) {
        segment.set(LAYOUT$actionSet, OFFSET$actionSet, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public float forceThreshold() {
        return segment.get(LAYOUT$forceThreshold, OFFSET$forceThreshold);
    }

    public XrInteractionProfileDpadBindingEXT forceThreshold(float value) {
        segment.set(LAYOUT$forceThreshold, OFFSET$forceThreshold, value);
        return this;
    }

    public float forceThresholdReleased() {
        return segment.get(LAYOUT$forceThresholdReleased, OFFSET$forceThresholdReleased);
    }

    public XrInteractionProfileDpadBindingEXT forceThresholdReleased(float value) {
        segment.set(LAYOUT$forceThresholdReleased, OFFSET$forceThresholdReleased, value);
        return this;
    }

    public float centerRegion() {
        return segment.get(LAYOUT$centerRegion, OFFSET$centerRegion);
    }

    public XrInteractionProfileDpadBindingEXT centerRegion(float value) {
        segment.set(LAYOUT$centerRegion, OFFSET$centerRegion, value);
        return this;
    }

    public float wedgeAngle() {
        return segment.get(LAYOUT$wedgeAngle, OFFSET$wedgeAngle);
    }

    public XrInteractionProfileDpadBindingEXT wedgeAngle(float value) {
        segment.set(LAYOUT$wedgeAngle, OFFSET$wedgeAngle, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isSticky() {
        return segment.get(LAYOUT$isSticky, OFFSET$isSticky);
    }

    public XrInteractionProfileDpadBindingEXT isSticky(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isSticky, OFFSET$isSticky, value);
        return this;
    }

    public XrInteractionProfileDpadBindingEXT onHaptic(@Nullable IXrHapticBaseHeader value) {
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

    public XrInteractionProfileDpadBindingEXT offHaptic(@Nullable IXrHapticBaseHeader value) {
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
        ValueLayout.JAVA_LONG.withName("binding"),
        ValueLayout.ADDRESS.withName("actionSet"),
        ValueLayout.JAVA_FLOAT.withName("forceThreshold"),
        ValueLayout.JAVA_FLOAT.withName("forceThresholdReleased"),
        ValueLayout.JAVA_FLOAT.withName("centerRegion"),
        ValueLayout.JAVA_FLOAT.withName("wedgeAngle"),
        ValueLayout.JAVA_INT.withName("isSticky"),
        ValueLayout.ADDRESS.withTargetLayout(XrHapticBaseHeader.LAYOUT).withName("onHaptic"),
        ValueLayout.ADDRESS.withTargetLayout(XrHapticBaseHeader.LAYOUT).withName("offHaptic")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$actionSet = PathElement.groupElement("actionSet");
    public static final PathElement PATH$forceThreshold = PathElement.groupElement("forceThreshold");
    public static final PathElement PATH$forceThresholdReleased = PathElement.groupElement("forceThresholdReleased");
    public static final PathElement PATH$centerRegion = PathElement.groupElement("centerRegion");
    public static final PathElement PATH$wedgeAngle = PathElement.groupElement("wedgeAngle");
    public static final PathElement PATH$isSticky = PathElement.groupElement("isSticky");
    public static final PathElement PATH$onHaptic = PathElement.groupElement("onHaptic");
    public static final PathElement PATH$offHaptic = PathElement.groupElement("offHaptic");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$binding = (OfLong) LAYOUT.select(PATH$binding);
    public static final AddressLayout LAYOUT$actionSet = (AddressLayout) LAYOUT.select(PATH$actionSet);
    public static final OfFloat LAYOUT$forceThreshold = (OfFloat) LAYOUT.select(PATH$forceThreshold);
    public static final OfFloat LAYOUT$forceThresholdReleased = (OfFloat) LAYOUT.select(PATH$forceThresholdReleased);
    public static final OfFloat LAYOUT$centerRegion = (OfFloat) LAYOUT.select(PATH$centerRegion);
    public static final OfFloat LAYOUT$wedgeAngle = (OfFloat) LAYOUT.select(PATH$wedgeAngle);
    public static final OfInt LAYOUT$isSticky = (OfInt) LAYOUT.select(PATH$isSticky);
    public static final AddressLayout LAYOUT$onHaptic = (AddressLayout) LAYOUT.select(PATH$onHaptic);
    public static final AddressLayout LAYOUT$offHaptic = (AddressLayout) LAYOUT.select(PATH$offHaptic);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$actionSet = LAYOUT$actionSet.byteSize();
    public static final long SIZE$forceThreshold = LAYOUT$forceThreshold.byteSize();
    public static final long SIZE$forceThresholdReleased = LAYOUT$forceThresholdReleased.byteSize();
    public static final long SIZE$centerRegion = LAYOUT$centerRegion.byteSize();
    public static final long SIZE$wedgeAngle = LAYOUT$wedgeAngle.byteSize();
    public static final long SIZE$isSticky = LAYOUT$isSticky.byteSize();
    public static final long SIZE$onHaptic = LAYOUT$onHaptic.byteSize();
    public static final long SIZE$offHaptic = LAYOUT$offHaptic.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$actionSet = LAYOUT.byteOffset(PATH$actionSet);
    public static final long OFFSET$forceThreshold = LAYOUT.byteOffset(PATH$forceThreshold);
    public static final long OFFSET$forceThresholdReleased = LAYOUT.byteOffset(PATH$forceThresholdReleased);
    public static final long OFFSET$centerRegion = LAYOUT.byteOffset(PATH$centerRegion);
    public static final long OFFSET$wedgeAngle = LAYOUT.byteOffset(PATH$wedgeAngle);
    public static final long OFFSET$isSticky = LAYOUT.byteOffset(PATH$isSticky);
    public static final long OFFSET$onHaptic = LAYOUT.byteOffset(PATH$onHaptic);
    public static final long OFFSET$offHaptic = LAYOUT.byteOffset(PATH$offHaptic);
}

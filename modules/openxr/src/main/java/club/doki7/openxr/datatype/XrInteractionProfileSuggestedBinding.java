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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionProfileSuggestedBinding.html"><code>XrInteractionProfileSuggestedBinding</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrInteractionProfileSuggestedBinding {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrPath interactionProfile; // @link substring="interactionProfile" target="#interactionProfile"
///     uint32_t countSuggestedBindings; // @link substring="countSuggestedBindings" target="#countSuggestedBindings"
///     XrActionSuggestedBinding const* suggestedBindings; // @link substring="XrActionSuggestedBinding" target="XrActionSuggestedBinding" @link substring="suggestedBindings" target="#suggestedBindings"
/// } XrInteractionProfileSuggestedBinding;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING`
///
/// The {@code allocate} ({@link XrInteractionProfileSuggestedBinding#allocate(Arena)}, {@link XrInteractionProfileSuggestedBinding#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrInteractionProfileSuggestedBinding#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionProfileSuggestedBinding.html"><code>XrInteractionProfileSuggestedBinding</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrInteractionProfileSuggestedBinding(@NotNull MemorySegment segment) implements IXrInteractionProfileSuggestedBinding {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionProfileSuggestedBinding.html"><code>XrInteractionProfileSuggestedBinding</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrInteractionProfileSuggestedBinding}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrInteractionProfileSuggestedBinding to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrInteractionProfileSuggestedBinding.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrInteractionProfileSuggestedBinding, Iterable<XrInteractionProfileSuggestedBinding> {
        public long size() {
            return segment.byteSize() / XrInteractionProfileSuggestedBinding.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrInteractionProfileSuggestedBinding at(long index) {
            return new XrInteractionProfileSuggestedBinding(segment.asSlice(index * XrInteractionProfileSuggestedBinding.BYTES, XrInteractionProfileSuggestedBinding.BYTES));
        }

        public XrInteractionProfileSuggestedBinding.Ptr at(long index, @NotNull Consumer<@NotNull XrInteractionProfileSuggestedBinding> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrInteractionProfileSuggestedBinding value) {
            MemorySegment s = segment.asSlice(index * XrInteractionProfileSuggestedBinding.BYTES, XrInteractionProfileSuggestedBinding.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrInteractionProfileSuggestedBinding.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrInteractionProfileSuggestedBinding.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrInteractionProfileSuggestedBinding.BYTES,
                (end - start) * XrInteractionProfileSuggestedBinding.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrInteractionProfileSuggestedBinding.BYTES));
        }

        public XrInteractionProfileSuggestedBinding[] toArray() {
            XrInteractionProfileSuggestedBinding[] ret = new XrInteractionProfileSuggestedBinding[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrInteractionProfileSuggestedBinding> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrInteractionProfileSuggestedBinding> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrInteractionProfileSuggestedBinding.BYTES;
            }

            @Override
            public XrInteractionProfileSuggestedBinding next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrInteractionProfileSuggestedBinding ret = new XrInteractionProfileSuggestedBinding(segment.asSlice(0, XrInteractionProfileSuggestedBinding.BYTES));
                segment = segment.asSlice(XrInteractionProfileSuggestedBinding.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrInteractionProfileSuggestedBinding allocate(Arena arena) {
        XrInteractionProfileSuggestedBinding ret = new XrInteractionProfileSuggestedBinding(arena.allocate(LAYOUT));
        ret.type(XrStructureType.INTERACTION_PROFILE_SUGGESTED_BINDING);
        return ret;
    }

    public static XrInteractionProfileSuggestedBinding.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrInteractionProfileSuggestedBinding.Ptr ret = new XrInteractionProfileSuggestedBinding.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.INTERACTION_PROFILE_SUGGESTED_BINDING);
        }
        return ret;
    }

    public static XrInteractionProfileSuggestedBinding clone(Arena arena, XrInteractionProfileSuggestedBinding src) {
        XrInteractionProfileSuggestedBinding ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.INTERACTION_PROFILE_SUGGESTED_BINDING);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrInteractionProfileSuggestedBinding type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrInteractionProfileSuggestedBinding next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrInteractionProfileSuggestedBinding next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrPath") @Unsigned long interactionProfile() {
        return segment.get(LAYOUT$interactionProfile, OFFSET$interactionProfile);
    }

    public XrInteractionProfileSuggestedBinding interactionProfile(@NativeType("XrPath") @Unsigned long value) {
        segment.set(LAYOUT$interactionProfile, OFFSET$interactionProfile, value);
        return this;
    }

    public @Unsigned int countSuggestedBindings() {
        return segment.get(LAYOUT$countSuggestedBindings, OFFSET$countSuggestedBindings);
    }

    public XrInteractionProfileSuggestedBinding countSuggestedBindings(@Unsigned int value) {
        segment.set(LAYOUT$countSuggestedBindings, OFFSET$countSuggestedBindings, value);
        return this;
    }

    public XrInteractionProfileSuggestedBinding suggestedBindings(@Nullable IXrActionSuggestedBinding value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        suggestedBindingsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrActionSuggestedBinding.Ptr suggestedBindings(int assumedCount) {
        MemorySegment s = suggestedBindingsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrActionSuggestedBinding.BYTES);
        return new XrActionSuggestedBinding.Ptr(s);
    }

    public @Nullable XrActionSuggestedBinding suggestedBindings() {
        MemorySegment s = suggestedBindingsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrActionSuggestedBinding(s);
    }

    public @Pointer(target=XrActionSuggestedBinding.class) @NotNull MemorySegment suggestedBindingsRaw() {
        return segment.get(LAYOUT$suggestedBindings, OFFSET$suggestedBindings);
    }

    public void suggestedBindingsRaw(@Pointer(target=XrActionSuggestedBinding.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$suggestedBindings, OFFSET$suggestedBindings, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("interactionProfile"),
        ValueLayout.JAVA_INT.withName("countSuggestedBindings"),
        ValueLayout.ADDRESS.withTargetLayout(XrActionSuggestedBinding.LAYOUT).withName("suggestedBindings")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$interactionProfile = PathElement.groupElement("interactionProfile");
    public static final PathElement PATH$countSuggestedBindings = PathElement.groupElement("countSuggestedBindings");
    public static final PathElement PATH$suggestedBindings = PathElement.groupElement("suggestedBindings");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$interactionProfile = (OfLong) LAYOUT.select(PATH$interactionProfile);
    public static final OfInt LAYOUT$countSuggestedBindings = (OfInt) LAYOUT.select(PATH$countSuggestedBindings);
    public static final AddressLayout LAYOUT$suggestedBindings = (AddressLayout) LAYOUT.select(PATH$suggestedBindings);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$interactionProfile = LAYOUT$interactionProfile.byteSize();
    public static final long SIZE$countSuggestedBindings = LAYOUT$countSuggestedBindings.byteSize();
    public static final long SIZE$suggestedBindings = LAYOUT$suggestedBindings.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$interactionProfile = LAYOUT.byteOffset(PATH$interactionProfile);
    public static final long OFFSET$countSuggestedBindings = LAYOUT.byteOffset(PATH$countSuggestedBindings);
    public static final long OFFSET$suggestedBindings = LAYOUT.byteOffset(PATH$suggestedBindings);
}

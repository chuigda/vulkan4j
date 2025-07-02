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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneDeserializeInfoMSFT.html"><code>XrSceneDeserializeInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneDeserializeInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t fragmentCount; // optional // @link substring="fragmentCount" target="#fragmentCount"
///     XrDeserializeSceneFragmentMSFT const* fragments; // optional // @link substring="XrDeserializeSceneFragmentMSFT" target="XrDeserializeSceneFragmentMSFT" @link substring="fragments" target="#fragments"
/// } XrSceneDeserializeInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SCENE_DESERIALIZE_INFO_MSFT`
///
/// The {@code allocate} ({@link XrSceneDeserializeInfoMSFT#allocate(Arena)}, {@link XrSceneDeserializeInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSceneDeserializeInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneDeserializeInfoMSFT.html"><code>XrSceneDeserializeInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneDeserializeInfoMSFT(@NotNull MemorySegment segment) implements IXrSceneDeserializeInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneDeserializeInfoMSFT.html"><code>XrSceneDeserializeInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneDeserializeInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneDeserializeInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneDeserializeInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneDeserializeInfoMSFT, Iterable<XrSceneDeserializeInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneDeserializeInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneDeserializeInfoMSFT at(long index) {
            return new XrSceneDeserializeInfoMSFT(segment.asSlice(index * XrSceneDeserializeInfoMSFT.BYTES, XrSceneDeserializeInfoMSFT.BYTES));
        }

        public XrSceneDeserializeInfoMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSceneDeserializeInfoMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSceneDeserializeInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneDeserializeInfoMSFT.BYTES, XrSceneDeserializeInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneDeserializeInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneDeserializeInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneDeserializeInfoMSFT.BYTES,
                (end - start) * XrSceneDeserializeInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneDeserializeInfoMSFT.BYTES));
        }

        public XrSceneDeserializeInfoMSFT[] toArray() {
            XrSceneDeserializeInfoMSFT[] ret = new XrSceneDeserializeInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneDeserializeInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneDeserializeInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneDeserializeInfoMSFT.BYTES;
            }

            @Override
            public XrSceneDeserializeInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneDeserializeInfoMSFT ret = new XrSceneDeserializeInfoMSFT(segment.asSlice(0, XrSceneDeserializeInfoMSFT.BYTES));
                segment = segment.asSlice(XrSceneDeserializeInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneDeserializeInfoMSFT allocate(Arena arena) {
        XrSceneDeserializeInfoMSFT ret = new XrSceneDeserializeInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SCENE_DESERIALIZE_INFO_MSFT);
        return ret;
    }

    public static XrSceneDeserializeInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSceneDeserializeInfoMSFT.Ptr ret = new XrSceneDeserializeInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SCENE_DESERIALIZE_INFO_MSFT);
        }
        return ret;
    }

    public static XrSceneDeserializeInfoMSFT clone(Arena arena, XrSceneDeserializeInfoMSFT src) {
        XrSceneDeserializeInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SCENE_DESERIALIZE_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSceneDeserializeInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSceneDeserializeInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSceneDeserializeInfoMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int fragmentCount() {
        return segment.get(LAYOUT$fragmentCount, OFFSET$fragmentCount);
    }

    public XrSceneDeserializeInfoMSFT fragmentCount(@Unsigned int value) {
        segment.set(LAYOUT$fragmentCount, OFFSET$fragmentCount, value);
        return this;
    }

    public XrSceneDeserializeInfoMSFT fragments(@Nullable IXrDeserializeSceneFragmentMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        fragmentsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrDeserializeSceneFragmentMSFT.Ptr fragments(int assumedCount) {
        MemorySegment s = fragmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrDeserializeSceneFragmentMSFT.BYTES);
        return new XrDeserializeSceneFragmentMSFT.Ptr(s);
    }

    public @Nullable XrDeserializeSceneFragmentMSFT fragments() {
        MemorySegment s = fragmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrDeserializeSceneFragmentMSFT(s);
    }

    public @Pointer(target=XrDeserializeSceneFragmentMSFT.class) @NotNull MemorySegment fragmentsRaw() {
        return segment.get(LAYOUT$fragments, OFFSET$fragments);
    }

    public void fragmentsRaw(@Pointer(target=XrDeserializeSceneFragmentMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$fragments, OFFSET$fragments, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("fragmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrDeserializeSceneFragmentMSFT.LAYOUT).withName("fragments")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$fragmentCount = PathElement.groupElement("fragmentCount");
    public static final PathElement PATH$fragments = PathElement.groupElement("fragments");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$fragmentCount = (OfInt) LAYOUT.select(PATH$fragmentCount);
    public static final AddressLayout LAYOUT$fragments = (AddressLayout) LAYOUT.select(PATH$fragments);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$fragmentCount = LAYOUT$fragmentCount.byteSize();
    public static final long SIZE$fragments = LAYOUT$fragments.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$fragmentCount = LAYOUT.byteOffset(PATH$fragmentCount);
    public static final long OFFSET$fragments = LAYOUT.byteOffset(PATH$fragments);
}

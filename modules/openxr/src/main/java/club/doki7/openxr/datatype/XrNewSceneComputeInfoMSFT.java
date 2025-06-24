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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNewSceneComputeInfoMSFT.html"><code>XrNewSceneComputeInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrNewSceneComputeInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t requestedFeatureCount; // @link substring="requestedFeatureCount" target="#requestedFeatureCount"
///     XrSceneComputeFeatureMSFT const* requestedFeatures; // @link substring="XrSceneComputeFeatureMSFT" target="XrSceneComputeFeatureMSFT" @link substring="requestedFeatures" target="#requestedFeatures"
///     XrSceneComputeConsistencyMSFT consistency; // @link substring="XrSceneComputeConsistencyMSFT" target="XrSceneComputeConsistencyMSFT" @link substring="consistency" target="#consistency"
///     XrSceneBoundsMSFT bounds; // @link substring="XrSceneBoundsMSFT" target="XrSceneBoundsMSFT" @link substring="bounds" target="#bounds"
/// } XrNewSceneComputeInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_NEW_SCENE_COMPUTE_INFO_MSFT`
///
/// The {@code allocate} ({@link XrNewSceneComputeInfoMSFT#allocate(Arena)}, {@link XrNewSceneComputeInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrNewSceneComputeInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNewSceneComputeInfoMSFT.html"><code>XrNewSceneComputeInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrNewSceneComputeInfoMSFT(@NotNull MemorySegment segment) implements IXrNewSceneComputeInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNewSceneComputeInfoMSFT.html"><code>XrNewSceneComputeInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrNewSceneComputeInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrNewSceneComputeInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrNewSceneComputeInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrNewSceneComputeInfoMSFT, Iterable<XrNewSceneComputeInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrNewSceneComputeInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrNewSceneComputeInfoMSFT at(long index) {
            return new XrNewSceneComputeInfoMSFT(segment.asSlice(index * XrNewSceneComputeInfoMSFT.BYTES, XrNewSceneComputeInfoMSFT.BYTES));
        }

        public void write(long index, @NotNull XrNewSceneComputeInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrNewSceneComputeInfoMSFT.BYTES, XrNewSceneComputeInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrNewSceneComputeInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrNewSceneComputeInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrNewSceneComputeInfoMSFT.BYTES,
                (end - start) * XrNewSceneComputeInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrNewSceneComputeInfoMSFT.BYTES));
        }

        public XrNewSceneComputeInfoMSFT[] toArray() {
            XrNewSceneComputeInfoMSFT[] ret = new XrNewSceneComputeInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrNewSceneComputeInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrNewSceneComputeInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrNewSceneComputeInfoMSFT.BYTES;
            }

            @Override
            public XrNewSceneComputeInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrNewSceneComputeInfoMSFT ret = new XrNewSceneComputeInfoMSFT(segment.asSlice(0, XrNewSceneComputeInfoMSFT.BYTES));
                segment = segment.asSlice(XrNewSceneComputeInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrNewSceneComputeInfoMSFT allocate(Arena arena) {
        XrNewSceneComputeInfoMSFT ret = new XrNewSceneComputeInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_NEW_SCENE_COMPUTE_INFO_MSFT);
        return ret;
    }

    public static XrNewSceneComputeInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrNewSceneComputeInfoMSFT.Ptr ret = new XrNewSceneComputeInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_NEW_SCENE_COMPUTE_INFO_MSFT);
        }
        return ret;
    }

    public static XrNewSceneComputeInfoMSFT clone(Arena arena, XrNewSceneComputeInfoMSFT src) {
        XrNewSceneComputeInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_NEW_SCENE_COMPUTE_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrNewSceneComputeInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrNewSceneComputeInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrNewSceneComputeInfoMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int requestedFeatureCount() {
        return segment.get(LAYOUT$requestedFeatureCount, OFFSET$requestedFeatureCount);
    }

    public XrNewSceneComputeInfoMSFT requestedFeatureCount(@Unsigned int value) {
        segment.set(LAYOUT$requestedFeatureCount, OFFSET$requestedFeatureCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrSceneComputeFeatureMSFT.class) IntPtr requestedFeatures() {
        MemorySegment s = requestedFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrNewSceneComputeInfoMSFT requestedFeatures(@Nullable @EnumType(XrSceneComputeFeatureMSFT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        requestedFeaturesRaw(s);
        return this;
    }

    public @Pointer(target=XrSceneComputeFeatureMSFT.class) @NotNull MemorySegment requestedFeaturesRaw() {
        return segment.get(LAYOUT$requestedFeatures, OFFSET$requestedFeatures);
    }

    public void requestedFeaturesRaw(@Pointer(target=XrSceneComputeFeatureMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$requestedFeatures, OFFSET$requestedFeatures, value);
    }

    public @EnumType(XrSceneComputeConsistencyMSFT.class) int consistency() {
        return segment.get(LAYOUT$consistency, OFFSET$consistency);
    }

    public XrNewSceneComputeInfoMSFT consistency(@EnumType(XrSceneComputeConsistencyMSFT.class) int value) {
        segment.set(LAYOUT$consistency, OFFSET$consistency, value);
        return this;
    }

    public @NotNull XrSceneBoundsMSFT bounds() {
        return new XrSceneBoundsMSFT(segment.asSlice(OFFSET$bounds, LAYOUT$bounds));
    }

    public XrNewSceneComputeInfoMSFT bounds(@NotNull XrSceneBoundsMSFT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$bounds, SIZE$bounds);
        return this;
    }

    public XrNewSceneComputeInfoMSFT bounds(Consumer<@NotNull XrSceneBoundsMSFT> consumer) {
        consumer.accept(bounds());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("requestedFeatureCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("requestedFeatures"),
        ValueLayout.JAVA_INT.withName("consistency"),
        XrSceneBoundsMSFT.LAYOUT.withName("bounds")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$requestedFeatureCount = PathElement.groupElement("requestedFeatureCount");
    public static final PathElement PATH$requestedFeatures = PathElement.groupElement("requestedFeatures");
    public static final PathElement PATH$consistency = PathElement.groupElement("consistency");
    public static final PathElement PATH$bounds = PathElement.groupElement("bounds");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$requestedFeatureCount = (OfInt) LAYOUT.select(PATH$requestedFeatureCount);
    public static final AddressLayout LAYOUT$requestedFeatures = (AddressLayout) LAYOUT.select(PATH$requestedFeatures);
    public static final OfInt LAYOUT$consistency = (OfInt) LAYOUT.select(PATH$consistency);
    public static final StructLayout LAYOUT$bounds = (StructLayout) LAYOUT.select(PATH$bounds);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$requestedFeatureCount = LAYOUT$requestedFeatureCount.byteSize();
    public static final long SIZE$requestedFeatures = LAYOUT$requestedFeatures.byteSize();
    public static final long SIZE$consistency = LAYOUT$consistency.byteSize();
    public static final long SIZE$bounds = LAYOUT$bounds.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$requestedFeatureCount = LAYOUT.byteOffset(PATH$requestedFeatureCount);
    public static final long OFFSET$requestedFeatures = LAYOUT.byteOffset(PATH$requestedFeatures);
    public static final long OFFSET$consistency = LAYOUT.byteOffset(PATH$consistency);
    public static final long OFFSET$bounds = LAYOUT.byteOffset(PATH$bounds);
}

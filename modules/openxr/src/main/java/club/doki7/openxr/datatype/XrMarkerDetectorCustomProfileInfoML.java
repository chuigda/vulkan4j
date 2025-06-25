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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorCustomProfileInfoML.html"><code>XrMarkerDetectorCustomProfileInfoML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrMarkerDetectorCustomProfileInfoML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrMarkerDetectorFpsML fpsHint; // @link substring="XrMarkerDetectorFpsML" target="XrMarkerDetectorFpsML" @link substring="fpsHint" target="#fpsHint"
///     XrMarkerDetectorResolutionML resolutionHint; // @link substring="XrMarkerDetectorResolutionML" target="XrMarkerDetectorResolutionML" @link substring="resolutionHint" target="#resolutionHint"
///     XrMarkerDetectorCameraML cameraHint; // @link substring="XrMarkerDetectorCameraML" target="XrMarkerDetectorCameraML" @link substring="cameraHint" target="#cameraHint"
///     XrMarkerDetectorCornerRefineMethodML cornerRefineMethod; // @link substring="XrMarkerDetectorCornerRefineMethodML" target="XrMarkerDetectorCornerRefineMethodML" @link substring="cornerRefineMethod" target="#cornerRefineMethod"
///     XrBool32 useEdgeRefinement; // @link substring="useEdgeRefinement" target="#useEdgeRefinement"
///     XrMarkerDetectorFullAnalysisIntervalML fullAnalysisIntervalHint; // @link substring="XrMarkerDetectorFullAnalysisIntervalML" target="XrMarkerDetectorFullAnalysisIntervalML" @link substring="fullAnalysisIntervalHint" target="#fullAnalysisIntervalHint"
/// } XrMarkerDetectorCustomProfileInfoML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML`
///
/// The {@code allocate} ({@link XrMarkerDetectorCustomProfileInfoML#allocate(Arena)}, {@link XrMarkerDetectorCustomProfileInfoML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrMarkerDetectorCustomProfileInfoML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorCustomProfileInfoML.html"><code>XrMarkerDetectorCustomProfileInfoML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrMarkerDetectorCustomProfileInfoML(@NotNull MemorySegment segment) implements IXrMarkerDetectorCustomProfileInfoML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorCustomProfileInfoML.html"><code>XrMarkerDetectorCustomProfileInfoML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrMarkerDetectorCustomProfileInfoML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrMarkerDetectorCustomProfileInfoML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrMarkerDetectorCustomProfileInfoML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrMarkerDetectorCustomProfileInfoML, Iterable<XrMarkerDetectorCustomProfileInfoML> {
        public long size() {
            return segment.byteSize() / XrMarkerDetectorCustomProfileInfoML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrMarkerDetectorCustomProfileInfoML at(long index) {
            return new XrMarkerDetectorCustomProfileInfoML(segment.asSlice(index * XrMarkerDetectorCustomProfileInfoML.BYTES, XrMarkerDetectorCustomProfileInfoML.BYTES));
        }

        public XrMarkerDetectorCustomProfileInfoML.Ptr at(long index, @NotNull Consumer<@NotNull XrMarkerDetectorCustomProfileInfoML> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrMarkerDetectorCustomProfileInfoML value) {
            MemorySegment s = segment.asSlice(index * XrMarkerDetectorCustomProfileInfoML.BYTES, XrMarkerDetectorCustomProfileInfoML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrMarkerDetectorCustomProfileInfoML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrMarkerDetectorCustomProfileInfoML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrMarkerDetectorCustomProfileInfoML.BYTES,
                (end - start) * XrMarkerDetectorCustomProfileInfoML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrMarkerDetectorCustomProfileInfoML.BYTES));
        }

        public XrMarkerDetectorCustomProfileInfoML[] toArray() {
            XrMarkerDetectorCustomProfileInfoML[] ret = new XrMarkerDetectorCustomProfileInfoML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrMarkerDetectorCustomProfileInfoML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrMarkerDetectorCustomProfileInfoML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrMarkerDetectorCustomProfileInfoML.BYTES;
            }

            @Override
            public XrMarkerDetectorCustomProfileInfoML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrMarkerDetectorCustomProfileInfoML ret = new XrMarkerDetectorCustomProfileInfoML(segment.asSlice(0, XrMarkerDetectorCustomProfileInfoML.BYTES));
                segment = segment.asSlice(XrMarkerDetectorCustomProfileInfoML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrMarkerDetectorCustomProfileInfoML allocate(Arena arena) {
        XrMarkerDetectorCustomProfileInfoML ret = new XrMarkerDetectorCustomProfileInfoML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML);
        return ret;
    }

    public static XrMarkerDetectorCustomProfileInfoML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrMarkerDetectorCustomProfileInfoML.Ptr ret = new XrMarkerDetectorCustomProfileInfoML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML);
        }
        return ret;
    }

    public static XrMarkerDetectorCustomProfileInfoML clone(Arena arena, XrMarkerDetectorCustomProfileInfoML src) {
        XrMarkerDetectorCustomProfileInfoML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrMarkerDetectorCustomProfileInfoML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrMarkerDetectorCustomProfileInfoML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrMarkerDetectorCustomProfileInfoML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrMarkerDetectorFpsML.class) int fpsHint() {
        return segment.get(LAYOUT$fpsHint, OFFSET$fpsHint);
    }

    public XrMarkerDetectorCustomProfileInfoML fpsHint(@EnumType(XrMarkerDetectorFpsML.class) int value) {
        segment.set(LAYOUT$fpsHint, OFFSET$fpsHint, value);
        return this;
    }

    public @EnumType(XrMarkerDetectorResolutionML.class) int resolutionHint() {
        return segment.get(LAYOUT$resolutionHint, OFFSET$resolutionHint);
    }

    public XrMarkerDetectorCustomProfileInfoML resolutionHint(@EnumType(XrMarkerDetectorResolutionML.class) int value) {
        segment.set(LAYOUT$resolutionHint, OFFSET$resolutionHint, value);
        return this;
    }

    public @EnumType(XrMarkerDetectorCameraML.class) int cameraHint() {
        return segment.get(LAYOUT$cameraHint, OFFSET$cameraHint);
    }

    public XrMarkerDetectorCustomProfileInfoML cameraHint(@EnumType(XrMarkerDetectorCameraML.class) int value) {
        segment.set(LAYOUT$cameraHint, OFFSET$cameraHint, value);
        return this;
    }

    public @EnumType(XrMarkerDetectorCornerRefineMethodML.class) int cornerRefineMethod() {
        return segment.get(LAYOUT$cornerRefineMethod, OFFSET$cornerRefineMethod);
    }

    public XrMarkerDetectorCustomProfileInfoML cornerRefineMethod(@EnumType(XrMarkerDetectorCornerRefineMethodML.class) int value) {
        segment.set(LAYOUT$cornerRefineMethod, OFFSET$cornerRefineMethod, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int useEdgeRefinement() {
        return segment.get(LAYOUT$useEdgeRefinement, OFFSET$useEdgeRefinement);
    }

    public XrMarkerDetectorCustomProfileInfoML useEdgeRefinement(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$useEdgeRefinement, OFFSET$useEdgeRefinement, value);
        return this;
    }

    public @EnumType(XrMarkerDetectorFullAnalysisIntervalML.class) int fullAnalysisIntervalHint() {
        return segment.get(LAYOUT$fullAnalysisIntervalHint, OFFSET$fullAnalysisIntervalHint);
    }

    public XrMarkerDetectorCustomProfileInfoML fullAnalysisIntervalHint(@EnumType(XrMarkerDetectorFullAnalysisIntervalML.class) int value) {
        segment.set(LAYOUT$fullAnalysisIntervalHint, OFFSET$fullAnalysisIntervalHint, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("fpsHint"),
        ValueLayout.JAVA_INT.withName("resolutionHint"),
        ValueLayout.JAVA_INT.withName("cameraHint"),
        ValueLayout.JAVA_INT.withName("cornerRefineMethod"),
        ValueLayout.JAVA_INT.withName("useEdgeRefinement"),
        ValueLayout.JAVA_INT.withName("fullAnalysisIntervalHint")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$fpsHint = PathElement.groupElement("fpsHint");
    public static final PathElement PATH$resolutionHint = PathElement.groupElement("resolutionHint");
    public static final PathElement PATH$cameraHint = PathElement.groupElement("cameraHint");
    public static final PathElement PATH$cornerRefineMethod = PathElement.groupElement("cornerRefineMethod");
    public static final PathElement PATH$useEdgeRefinement = PathElement.groupElement("useEdgeRefinement");
    public static final PathElement PATH$fullAnalysisIntervalHint = PathElement.groupElement("fullAnalysisIntervalHint");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$fpsHint = (OfInt) LAYOUT.select(PATH$fpsHint);
    public static final OfInt LAYOUT$resolutionHint = (OfInt) LAYOUT.select(PATH$resolutionHint);
    public static final OfInt LAYOUT$cameraHint = (OfInt) LAYOUT.select(PATH$cameraHint);
    public static final OfInt LAYOUT$cornerRefineMethod = (OfInt) LAYOUT.select(PATH$cornerRefineMethod);
    public static final OfInt LAYOUT$useEdgeRefinement = (OfInt) LAYOUT.select(PATH$useEdgeRefinement);
    public static final OfInt LAYOUT$fullAnalysisIntervalHint = (OfInt) LAYOUT.select(PATH$fullAnalysisIntervalHint);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$fpsHint = LAYOUT$fpsHint.byteSize();
    public static final long SIZE$resolutionHint = LAYOUT$resolutionHint.byteSize();
    public static final long SIZE$cameraHint = LAYOUT$cameraHint.byteSize();
    public static final long SIZE$cornerRefineMethod = LAYOUT$cornerRefineMethod.byteSize();
    public static final long SIZE$useEdgeRefinement = LAYOUT$useEdgeRefinement.byteSize();
    public static final long SIZE$fullAnalysisIntervalHint = LAYOUT$fullAnalysisIntervalHint.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$fpsHint = LAYOUT.byteOffset(PATH$fpsHint);
    public static final long OFFSET$resolutionHint = LAYOUT.byteOffset(PATH$resolutionHint);
    public static final long OFFSET$cameraHint = LAYOUT.byteOffset(PATH$cameraHint);
    public static final long OFFSET$cornerRefineMethod = LAYOUT.byteOffset(PATH$cornerRefineMethod);
    public static final long OFFSET$useEdgeRefinement = LAYOUT.byteOffset(PATH$useEdgeRefinement);
    public static final long OFFSET$fullAnalysisIntervalHint = LAYOUT.byteOffset(PATH$fullAnalysisIntervalHint);
}

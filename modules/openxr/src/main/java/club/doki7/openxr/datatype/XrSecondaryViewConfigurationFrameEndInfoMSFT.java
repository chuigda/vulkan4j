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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSecondaryViewConfigurationFrameEndInfoMSFT.html"><code>XrSecondaryViewConfigurationFrameEndInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSecondaryViewConfigurationFrameEndInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t viewConfigurationCount; // @link substring="viewConfigurationCount" target="#viewConfigurationCount"
///     XrSecondaryViewConfigurationLayerInfoMSFT const* viewConfigurationLayersInfo; // @link substring="XrSecondaryViewConfigurationLayerInfoMSFT" target="XrSecondaryViewConfigurationLayerInfoMSFT" @link substring="viewConfigurationLayersInfo" target="#viewConfigurationLayersInfo"
/// } XrSecondaryViewConfigurationFrameEndInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT`
///
/// The {@code allocate} ({@link XrSecondaryViewConfigurationFrameEndInfoMSFT#allocate(Arena)}, {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSecondaryViewConfigurationFrameEndInfoMSFT.html"><code>XrSecondaryViewConfigurationFrameEndInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSecondaryViewConfigurationFrameEndInfoMSFT(@NotNull MemorySegment segment) implements IXrSecondaryViewConfigurationFrameEndInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSecondaryViewConfigurationFrameEndInfoMSFT.html"><code>XrSecondaryViewConfigurationFrameEndInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSecondaryViewConfigurationFrameEndInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSecondaryViewConfigurationFrameEndInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSecondaryViewConfigurationFrameEndInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSecondaryViewConfigurationFrameEndInfoMSFT, Iterable<XrSecondaryViewConfigurationFrameEndInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSecondaryViewConfigurationFrameEndInfoMSFT at(long index) {
            return new XrSecondaryViewConfigurationFrameEndInfoMSFT(segment.asSlice(index * XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES, XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES));
        }

        public void write(long index, @NotNull XrSecondaryViewConfigurationFrameEndInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES, XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES,
                (end - start) * XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES));
        }

        public XrSecondaryViewConfigurationFrameEndInfoMSFT[] toArray() {
            XrSecondaryViewConfigurationFrameEndInfoMSFT[] ret = new XrSecondaryViewConfigurationFrameEndInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSecondaryViewConfigurationFrameEndInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSecondaryViewConfigurationFrameEndInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES;
            }

            @Override
            public XrSecondaryViewConfigurationFrameEndInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSecondaryViewConfigurationFrameEndInfoMSFT ret = new XrSecondaryViewConfigurationFrameEndInfoMSFT(segment.asSlice(0, XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES));
                segment = segment.asSlice(XrSecondaryViewConfigurationFrameEndInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSecondaryViewConfigurationFrameEndInfoMSFT allocate(Arena arena) {
        XrSecondaryViewConfigurationFrameEndInfoMSFT ret = new XrSecondaryViewConfigurationFrameEndInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT);
        return ret;
    }

    public static XrSecondaryViewConfigurationFrameEndInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSecondaryViewConfigurationFrameEndInfoMSFT.Ptr ret = new XrSecondaryViewConfigurationFrameEndInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT);
        }
        return ret;
    }

    public static XrSecondaryViewConfigurationFrameEndInfoMSFT clone(Arena arena, XrSecondaryViewConfigurationFrameEndInfoMSFT src) {
        XrSecondaryViewConfigurationFrameEndInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSecondaryViewConfigurationFrameEndInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSecondaryViewConfigurationFrameEndInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSecondaryViewConfigurationFrameEndInfoMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int viewConfigurationCount() {
        return segment.get(LAYOUT$viewConfigurationCount, OFFSET$viewConfigurationCount);
    }

    public XrSecondaryViewConfigurationFrameEndInfoMSFT viewConfigurationCount(@Unsigned int value) {
        segment.set(LAYOUT$viewConfigurationCount, OFFSET$viewConfigurationCount, value);
        return this;
    }

    public XrSecondaryViewConfigurationFrameEndInfoMSFT viewConfigurationLayersInfo(@Nullable IXrSecondaryViewConfigurationLayerInfoMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        viewConfigurationLayersInfoRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSecondaryViewConfigurationLayerInfoMSFT.Ptr viewConfigurationLayersInfo(int assumedCount) {
        MemorySegment s = viewConfigurationLayersInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSecondaryViewConfigurationLayerInfoMSFT.BYTES);
        return new XrSecondaryViewConfigurationLayerInfoMSFT.Ptr(s);
    }

    public @Nullable XrSecondaryViewConfigurationLayerInfoMSFT viewConfigurationLayersInfo() {
        MemorySegment s = viewConfigurationLayersInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSecondaryViewConfigurationLayerInfoMSFT(s);
    }

    public @Pointer(target=XrSecondaryViewConfigurationLayerInfoMSFT.class) @NotNull MemorySegment viewConfigurationLayersInfoRaw() {
        return segment.get(LAYOUT$viewConfigurationLayersInfo, OFFSET$viewConfigurationLayersInfo);
    }

    public void viewConfigurationLayersInfoRaw(@Pointer(target=XrSecondaryViewConfigurationLayerInfoMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$viewConfigurationLayersInfo, OFFSET$viewConfigurationLayersInfo, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("viewConfigurationCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrSecondaryViewConfigurationLayerInfoMSFT.LAYOUT).withName("viewConfigurationLayersInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$viewConfigurationCount = PathElement.groupElement("viewConfigurationCount");
    public static final PathElement PATH$viewConfigurationLayersInfo = PathElement.groupElement("viewConfigurationLayersInfo");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$viewConfigurationCount = (OfInt) LAYOUT.select(PATH$viewConfigurationCount);
    public static final AddressLayout LAYOUT$viewConfigurationLayersInfo = (AddressLayout) LAYOUT.select(PATH$viewConfigurationLayersInfo);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$viewConfigurationCount = LAYOUT$viewConfigurationCount.byteSize();
    public static final long SIZE$viewConfigurationLayersInfo = LAYOUT$viewConfigurationLayersInfo.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$viewConfigurationCount = LAYOUT.byteOffset(PATH$viewConfigurationCount);
    public static final long OFFSET$viewConfigurationLayersInfo = LAYOUT.byteOffset(PATH$viewConfigurationLayersInfo);
}

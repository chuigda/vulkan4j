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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialCapabilityConfigurationArucoMarkerEXT.html"><code>XrSpatialCapabilityConfigurationArucoMarkerEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialCapabilityConfigurationArucoMarkerEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpatialCapabilityEXT capability; // @link substring="XrSpatialCapabilityEXT" target="XrSpatialCapabilityEXT" @link substring="capability" target="#capability"
///     uint32_t enabledComponentCount; // @link substring="enabledComponentCount" target="#enabledComponentCount"
///     XrSpatialComponentTypeEXT const* enabledComponents; // @link substring="XrSpatialComponentTypeEXT" target="XrSpatialComponentTypeEXT" @link substring="enabledComponents" target="#enabledComponents"
///     XrSpatialMarkerArucoDictEXT arUcoDict; // @link substring="XrSpatialMarkerArucoDictEXT" target="XrSpatialMarkerArucoDictEXT" @link substring="arUcoDict" target="#arUcoDict"
/// } XrSpatialCapabilityConfigurationArucoMarkerEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT`
///
/// The {@code allocate} ({@link XrSpatialCapabilityConfigurationArucoMarkerEXT#allocate(Arena)}, {@link XrSpatialCapabilityConfigurationArucoMarkerEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialCapabilityConfigurationArucoMarkerEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialCapabilityConfigurationArucoMarkerEXT.html"><code>XrSpatialCapabilityConfigurationArucoMarkerEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialCapabilityConfigurationArucoMarkerEXT(@NotNull MemorySegment segment) implements IXrSpatialCapabilityConfigurationArucoMarkerEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialCapabilityConfigurationArucoMarkerEXT.html"><code>XrSpatialCapabilityConfigurationArucoMarkerEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialCapabilityConfigurationArucoMarkerEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialCapabilityConfigurationArucoMarkerEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialCapabilityConfigurationArucoMarkerEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialCapabilityConfigurationArucoMarkerEXT, Iterable<XrSpatialCapabilityConfigurationArucoMarkerEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialCapabilityConfigurationArucoMarkerEXT at(long index) {
            return new XrSpatialCapabilityConfigurationArucoMarkerEXT(segment.asSlice(index * XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES, XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSpatialCapabilityConfigurationArucoMarkerEXT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSpatialCapabilityConfigurationArucoMarkerEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES, XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES,
                (end - start) * XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES));
        }

        public XrSpatialCapabilityConfigurationArucoMarkerEXT[] toArray() {
            XrSpatialCapabilityConfigurationArucoMarkerEXT[] ret = new XrSpatialCapabilityConfigurationArucoMarkerEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialCapabilityConfigurationArucoMarkerEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialCapabilityConfigurationArucoMarkerEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES;
            }

            @Override
            public XrSpatialCapabilityConfigurationArucoMarkerEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialCapabilityConfigurationArucoMarkerEXT ret = new XrSpatialCapabilityConfigurationArucoMarkerEXT(segment.asSlice(0, XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES));
                segment = segment.asSlice(XrSpatialCapabilityConfigurationArucoMarkerEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialCapabilityConfigurationArucoMarkerEXT allocate(Arena arena) {
        XrSpatialCapabilityConfigurationArucoMarkerEXT ret = new XrSpatialCapabilityConfigurationArucoMarkerEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT);
        return ret;
    }

    public static XrSpatialCapabilityConfigurationArucoMarkerEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialCapabilityConfigurationArucoMarkerEXT.Ptr ret = new XrSpatialCapabilityConfigurationArucoMarkerEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT);
        }
        return ret;
    }

    public static XrSpatialCapabilityConfigurationArucoMarkerEXT clone(Arena arena, XrSpatialCapabilityConfigurationArucoMarkerEXT src) {
        XrSpatialCapabilityConfigurationArucoMarkerEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialCapabilityConfigurationArucoMarkerEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialCapabilityConfigurationArucoMarkerEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialCapabilityConfigurationArucoMarkerEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrSpatialCapabilityEXT.class) int capability() {
        return segment.get(LAYOUT$capability, OFFSET$capability);
    }

    public XrSpatialCapabilityConfigurationArucoMarkerEXT capability(@EnumType(XrSpatialCapabilityEXT.class) int value) {
        segment.set(LAYOUT$capability, OFFSET$capability, value);
        return this;
    }

    public @Unsigned int enabledComponentCount() {
        return segment.get(LAYOUT$enabledComponentCount, OFFSET$enabledComponentCount);
    }

    public XrSpatialCapabilityConfigurationArucoMarkerEXT enabledComponentCount(@Unsigned int value) {
        segment.set(LAYOUT$enabledComponentCount, OFFSET$enabledComponentCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrSpatialComponentTypeEXT.class) IntPtr enabledComponents() {
        MemorySegment s = enabledComponentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrSpatialCapabilityConfigurationArucoMarkerEXT enabledComponents(@Nullable @EnumType(XrSpatialComponentTypeEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        enabledComponentsRaw(s);
        return this;
    }

    public @Pointer(target=XrSpatialComponentTypeEXT.class) @NotNull MemorySegment enabledComponentsRaw() {
        return segment.get(LAYOUT$enabledComponents, OFFSET$enabledComponents);
    }

    public void enabledComponentsRaw(@Pointer(target=XrSpatialComponentTypeEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$enabledComponents, OFFSET$enabledComponents, value);
    }

    public @EnumType(XrSpatialMarkerArucoDictEXT.class) int arUcoDict() {
        return segment.get(LAYOUT$arUcoDict, OFFSET$arUcoDict);
    }

    public XrSpatialCapabilityConfigurationArucoMarkerEXT arUcoDict(@EnumType(XrSpatialMarkerArucoDictEXT.class) int value) {
        segment.set(LAYOUT$arUcoDict, OFFSET$arUcoDict, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("capability"),
        ValueLayout.JAVA_INT.withName("enabledComponentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("enabledComponents"),
        ValueLayout.JAVA_INT.withName("arUcoDict")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$capability = PathElement.groupElement("capability");
    public static final PathElement PATH$enabledComponentCount = PathElement.groupElement("enabledComponentCount");
    public static final PathElement PATH$enabledComponents = PathElement.groupElement("enabledComponents");
    public static final PathElement PATH$arUcoDict = PathElement.groupElement("arUcoDict");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$capability = (OfInt) LAYOUT.select(PATH$capability);
    public static final OfInt LAYOUT$enabledComponentCount = (OfInt) LAYOUT.select(PATH$enabledComponentCount);
    public static final AddressLayout LAYOUT$enabledComponents = (AddressLayout) LAYOUT.select(PATH$enabledComponents);
    public static final OfInt LAYOUT$arUcoDict = (OfInt) LAYOUT.select(PATH$arUcoDict);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$capability = LAYOUT$capability.byteSize();
    public static final long SIZE$enabledComponentCount = LAYOUT$enabledComponentCount.byteSize();
    public static final long SIZE$enabledComponents = LAYOUT$enabledComponents.byteSize();
    public static final long SIZE$arUcoDict = LAYOUT$arUcoDict.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$capability = LAYOUT.byteOffset(PATH$capability);
    public static final long OFFSET$enabledComponentCount = LAYOUT.byteOffset(PATH$enabledComponentCount);
    public static final long OFFSET$enabledComponents = LAYOUT.byteOffset(PATH$enabledComponents);
    public static final long OFFSET$arUcoDict = LAYOUT.byteOffset(PATH$arUcoDict);
}

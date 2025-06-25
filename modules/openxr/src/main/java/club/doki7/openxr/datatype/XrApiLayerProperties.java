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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApiLayerProperties.html"><code>XrApiLayerProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrApiLayerProperties {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     char[XR_MAX_API_LAYER_NAME_SIZE] layerName; // @link substring="layerName" target="#layerName"
///     XrVersion specVersion; // @link substring="specVersion" target="#specVersion"
///     uint32_t layerVersion; // @link substring="layerVersion" target="#layerVersion"
///     char[XR_MAX_API_LAYER_DESCRIPTION_SIZE] description; // @link substring="description" target="#description"
/// } XrApiLayerProperties;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_API_LAYER_PROPERTIES`
///
/// The {@code allocate} ({@link XrApiLayerProperties#allocate(Arena)}, {@link XrApiLayerProperties#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrApiLayerProperties#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApiLayerProperties.html"><code>XrApiLayerProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrApiLayerProperties(@NotNull MemorySegment segment) implements IXrApiLayerProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApiLayerProperties.html"><code>XrApiLayerProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrApiLayerProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrApiLayerProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrApiLayerProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrApiLayerProperties, Iterable<XrApiLayerProperties> {
        public long size() {
            return segment.byteSize() / XrApiLayerProperties.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrApiLayerProperties at(long index) {
            return new XrApiLayerProperties(segment.asSlice(index * XrApiLayerProperties.BYTES, XrApiLayerProperties.BYTES));
        }

        public void write(long index, @NotNull XrApiLayerProperties value) {
            MemorySegment s = segment.asSlice(index * XrApiLayerProperties.BYTES, XrApiLayerProperties.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrApiLayerProperties.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrApiLayerProperties.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrApiLayerProperties.BYTES,
                (end - start) * XrApiLayerProperties.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrApiLayerProperties.BYTES));
        }

        public XrApiLayerProperties[] toArray() {
            XrApiLayerProperties[] ret = new XrApiLayerProperties[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrApiLayerProperties> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrApiLayerProperties> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrApiLayerProperties.BYTES;
            }

            @Override
            public XrApiLayerProperties next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrApiLayerProperties ret = new XrApiLayerProperties(segment.asSlice(0, XrApiLayerProperties.BYTES));
                segment = segment.asSlice(XrApiLayerProperties.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrApiLayerProperties allocate(Arena arena) {
        XrApiLayerProperties ret = new XrApiLayerProperties(arena.allocate(LAYOUT));
        ret.type(XrStructureType.API_LAYER_PROPERTIES);
        return ret;
    }

    public static XrApiLayerProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrApiLayerProperties.Ptr ret = new XrApiLayerProperties.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.API_LAYER_PROPERTIES);
        }
        return ret;
    }

    public static XrApiLayerProperties clone(Arena arena, XrApiLayerProperties src) {
        XrApiLayerProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.API_LAYER_PROPERTIES);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrApiLayerProperties type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrApiLayerProperties next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrApiLayerProperties next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public BytePtr layerName() {
        return new BytePtr(layerNameRaw());
    }

    public XrApiLayerProperties layerName(BytePtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$layerName, SIZE$layerName);
        return this;
    }

    public @NotNull MemorySegment layerNameRaw() {
        return segment.asSlice(OFFSET$layerName, SIZE$layerName);
    }

    public @NativeType("XrVersion") @Unsigned long specVersion() {
        return segment.get(LAYOUT$specVersion, OFFSET$specVersion);
    }

    public XrApiLayerProperties specVersion(@NativeType("XrVersion") @Unsigned long value) {
        segment.set(LAYOUT$specVersion, OFFSET$specVersion, value);
        return this;
    }

    public @Unsigned int layerVersion() {
        return segment.get(LAYOUT$layerVersion, OFFSET$layerVersion);
    }

    public XrApiLayerProperties layerVersion(@Unsigned int value) {
        segment.set(LAYOUT$layerVersion, OFFSET$layerVersion, value);
        return this;
    }

    public BytePtr description() {
        return new BytePtr(descriptionRaw());
    }

    public XrApiLayerProperties description(BytePtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
        return this;
    }

    public @NotNull MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, SIZE$description);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        MemoryLayout.sequenceLayout(MAX_API_LAYER_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layerName"),
        ValueLayout.JAVA_LONG.withName("specVersion"),
        ValueLayout.JAVA_INT.withName("layerVersion"),
        MemoryLayout.sequenceLayout(MAX_API_LAYER_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$layerName = PathElement.groupElement("layerName");
    public static final PathElement PATH$specVersion = PathElement.groupElement("specVersion");
    public static final PathElement PATH$layerVersion = PathElement.groupElement("layerVersion");
    public static final PathElement PATH$description = PathElement.groupElement("description");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final SequenceLayout LAYOUT$layerName = (SequenceLayout) LAYOUT.select(PATH$layerName);
    public static final OfLong LAYOUT$specVersion = (OfLong) LAYOUT.select(PATH$specVersion);
    public static final OfInt LAYOUT$layerVersion = (OfInt) LAYOUT.select(PATH$layerVersion);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$layerName = LAYOUT$layerName.byteSize();
    public static final long SIZE$specVersion = LAYOUT$specVersion.byteSize();
    public static final long SIZE$layerVersion = LAYOUT$layerVersion.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$layerName = LAYOUT.byteOffset(PATH$layerName);
    public static final long OFFSET$specVersion = LAYOUT.byteOffset(PATH$specVersion);
    public static final long OFFSET$layerVersion = LAYOUT.byteOffset(PATH$layerVersion);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
}

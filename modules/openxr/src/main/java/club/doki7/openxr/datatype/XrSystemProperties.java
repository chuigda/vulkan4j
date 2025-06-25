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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemProperties.html"><code>XrSystemProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSystemProperties {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrSystemId systemId; // @link substring="systemId" target="#systemId"
///     uint32_t vendorId; // @link substring="vendorId" target="#vendorId"
///     char[XR_MAX_SYSTEM_NAME_SIZE] systemName; // @link substring="systemName" target="#systemName"
///     XrSystemGraphicsProperties graphicsProperties; // @link substring="XrSystemGraphicsProperties" target="XrSystemGraphicsProperties" @link substring="graphicsProperties" target="#graphicsProperties"
///     XrSystemTrackingProperties trackingProperties; // @link substring="XrSystemTrackingProperties" target="XrSystemTrackingProperties" @link substring="trackingProperties" target="#trackingProperties"
/// } XrSystemProperties;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SYSTEM_PROPERTIES`
///
/// The {@code allocate} ({@link XrSystemProperties#allocate(Arena)}, {@link XrSystemProperties#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSystemProperties#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemProperties.html"><code>XrSystemProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSystemProperties(@NotNull MemorySegment segment) implements IXrSystemProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemProperties.html"><code>XrSystemProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSystemProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSystemProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSystemProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSystemProperties, Iterable<XrSystemProperties> {
        public long size() {
            return segment.byteSize() / XrSystemProperties.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSystemProperties at(long index) {
            return new XrSystemProperties(segment.asSlice(index * XrSystemProperties.BYTES, XrSystemProperties.BYTES));
        }

        public XrSystemProperties.Ptr at(long index, @NotNull Consumer<@NotNull XrSystemProperties> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSystemProperties value) {
            MemorySegment s = segment.asSlice(index * XrSystemProperties.BYTES, XrSystemProperties.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSystemProperties.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSystemProperties.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSystemProperties.BYTES,
                (end - start) * XrSystemProperties.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSystemProperties.BYTES));
        }

        public XrSystemProperties[] toArray() {
            XrSystemProperties[] ret = new XrSystemProperties[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSystemProperties> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSystemProperties> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSystemProperties.BYTES;
            }

            @Override
            public XrSystemProperties next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSystemProperties ret = new XrSystemProperties(segment.asSlice(0, XrSystemProperties.BYTES));
                segment = segment.asSlice(XrSystemProperties.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSystemProperties allocate(Arena arena) {
        XrSystemProperties ret = new XrSystemProperties(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SYSTEM_PROPERTIES);
        return ret;
    }

    public static XrSystemProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSystemProperties.Ptr ret = new XrSystemProperties.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SYSTEM_PROPERTIES);
        }
        return ret;
    }

    public static XrSystemProperties clone(Arena arena, XrSystemProperties src) {
        XrSystemProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SYSTEM_PROPERTIES);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSystemProperties type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSystemProperties next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSystemProperties next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrSystemId") @Unsigned long systemId() {
        return segment.get(LAYOUT$systemId, OFFSET$systemId);
    }

    public XrSystemProperties systemId(@NativeType("XrSystemId") @Unsigned long value) {
        segment.set(LAYOUT$systemId, OFFSET$systemId, value);
        return this;
    }

    public @Unsigned int vendorId() {
        return segment.get(LAYOUT$vendorId, OFFSET$vendorId);
    }

    public XrSystemProperties vendorId(@Unsigned int value) {
        segment.set(LAYOUT$vendorId, OFFSET$vendorId, value);
        return this;
    }

    public BytePtr systemName() {
        return new BytePtr(systemNameRaw());
    }

    public XrSystemProperties systemName(@NotNull Consumer<BytePtr> consumer) {
        BytePtr ptr = systemName();
        consumer.accept(ptr);
        return this;
    }

    public XrSystemProperties systemName(BytePtr value) {
        MemorySegment s = systemNameRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment systemNameRaw() {
        return segment.asSlice(OFFSET$systemName, SIZE$systemName);
    }

    public @NotNull XrSystemGraphicsProperties graphicsProperties() {
        return new XrSystemGraphicsProperties(segment.asSlice(OFFSET$graphicsProperties, LAYOUT$graphicsProperties));
    }

    public XrSystemProperties graphicsProperties(@NotNull XrSystemGraphicsProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$graphicsProperties, SIZE$graphicsProperties);
        return this;
    }

    public XrSystemProperties graphicsProperties(Consumer<@NotNull XrSystemGraphicsProperties> consumer) {
        consumer.accept(graphicsProperties());
        return this;
    }

    public @NotNull XrSystemTrackingProperties trackingProperties() {
        return new XrSystemTrackingProperties(segment.asSlice(OFFSET$trackingProperties, LAYOUT$trackingProperties));
    }

    public XrSystemProperties trackingProperties(@NotNull XrSystemTrackingProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$trackingProperties, SIZE$trackingProperties);
        return this;
    }

    public XrSystemProperties trackingProperties(Consumer<@NotNull XrSystemTrackingProperties> consumer) {
        consumer.accept(trackingProperties());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("systemId"),
        ValueLayout.JAVA_INT.withName("vendorId"),
        MemoryLayout.sequenceLayout(MAX_SYSTEM_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("systemName"),
        XrSystemGraphicsProperties.LAYOUT.withName("graphicsProperties"),
        XrSystemTrackingProperties.LAYOUT.withName("trackingProperties")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$systemId = PathElement.groupElement("systemId");
    public static final PathElement PATH$vendorId = PathElement.groupElement("vendorId");
    public static final PathElement PATH$systemName = PathElement.groupElement("systemName");
    public static final PathElement PATH$graphicsProperties = PathElement.groupElement("graphicsProperties");
    public static final PathElement PATH$trackingProperties = PathElement.groupElement("trackingProperties");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$systemId = (OfLong) LAYOUT.select(PATH$systemId);
    public static final OfInt LAYOUT$vendorId = (OfInt) LAYOUT.select(PATH$vendorId);
    public static final SequenceLayout LAYOUT$systemName = (SequenceLayout) LAYOUT.select(PATH$systemName);
    public static final StructLayout LAYOUT$graphicsProperties = (StructLayout) LAYOUT.select(PATH$graphicsProperties);
    public static final StructLayout LAYOUT$trackingProperties = (StructLayout) LAYOUT.select(PATH$trackingProperties);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$systemId = LAYOUT$systemId.byteSize();
    public static final long SIZE$vendorId = LAYOUT$vendorId.byteSize();
    public static final long SIZE$systemName = LAYOUT$systemName.byteSize();
    public static final long SIZE$graphicsProperties = LAYOUT$graphicsProperties.byteSize();
    public static final long SIZE$trackingProperties = LAYOUT$trackingProperties.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$systemId = LAYOUT.byteOffset(PATH$systemId);
    public static final long OFFSET$vendorId = LAYOUT.byteOffset(PATH$vendorId);
    public static final long OFFSET$systemName = LAYOUT.byteOffset(PATH$systemName);
    public static final long OFFSET$graphicsProperties = LAYOUT.byteOffset(PATH$graphicsProperties);
    public static final long OFFSET$trackingProperties = LAYOUT.byteOffset(PATH$trackingProperties);
}

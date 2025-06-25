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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInstanceProperties.html"><code>XrInstanceProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrInstanceProperties {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrVersion runtimeVersion; // @link substring="runtimeVersion" target="#runtimeVersion"
///     char[XR_MAX_RUNTIME_NAME_SIZE] runtimeName; // @link substring="runtimeName" target="#runtimeName"
/// } XrInstanceProperties;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_INSTANCE_PROPERTIES`
///
/// The {@code allocate} ({@link XrInstanceProperties#allocate(Arena)}, {@link XrInstanceProperties#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrInstanceProperties#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInstanceProperties.html"><code>XrInstanceProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrInstanceProperties(@NotNull MemorySegment segment) implements IXrInstanceProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInstanceProperties.html"><code>XrInstanceProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrInstanceProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrInstanceProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrInstanceProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrInstanceProperties, Iterable<XrInstanceProperties> {
        public long size() {
            return segment.byteSize() / XrInstanceProperties.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrInstanceProperties at(long index) {
            return new XrInstanceProperties(segment.asSlice(index * XrInstanceProperties.BYTES, XrInstanceProperties.BYTES));
        }

        public XrInstanceProperties.Ptr at(long index, @NotNull Consumer<@NotNull XrInstanceProperties> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrInstanceProperties value) {
            MemorySegment s = segment.asSlice(index * XrInstanceProperties.BYTES, XrInstanceProperties.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrInstanceProperties.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrInstanceProperties.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrInstanceProperties.BYTES,
                (end - start) * XrInstanceProperties.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrInstanceProperties.BYTES));
        }

        public XrInstanceProperties[] toArray() {
            XrInstanceProperties[] ret = new XrInstanceProperties[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrInstanceProperties> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrInstanceProperties> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrInstanceProperties.BYTES;
            }

            @Override
            public XrInstanceProperties next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrInstanceProperties ret = new XrInstanceProperties(segment.asSlice(0, XrInstanceProperties.BYTES));
                segment = segment.asSlice(XrInstanceProperties.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrInstanceProperties allocate(Arena arena) {
        XrInstanceProperties ret = new XrInstanceProperties(arena.allocate(LAYOUT));
        ret.type(XrStructureType.INSTANCE_PROPERTIES);
        return ret;
    }

    public static XrInstanceProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrInstanceProperties.Ptr ret = new XrInstanceProperties.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.INSTANCE_PROPERTIES);
        }
        return ret;
    }

    public static XrInstanceProperties clone(Arena arena, XrInstanceProperties src) {
        XrInstanceProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.INSTANCE_PROPERTIES);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrInstanceProperties type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrInstanceProperties next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrInstanceProperties next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrVersion") @Unsigned long runtimeVersion() {
        return segment.get(LAYOUT$runtimeVersion, OFFSET$runtimeVersion);
    }

    public XrInstanceProperties runtimeVersion(@NativeType("XrVersion") @Unsigned long value) {
        segment.set(LAYOUT$runtimeVersion, OFFSET$runtimeVersion, value);
        return this;
    }

    public BytePtr runtimeName() {
        return new BytePtr(runtimeNameRaw());
    }

    public XrInstanceProperties runtimeName(@NotNull Consumer<BytePtr> consumer) {
        BytePtr ptr = runtimeName();
        consumer.accept(ptr);
        return this;
    }

    public XrInstanceProperties runtimeName(BytePtr value) {
        MemorySegment s = runtimeNameRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment runtimeNameRaw() {
        return segment.asSlice(OFFSET$runtimeName, SIZE$runtimeName);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("runtimeVersion"),
        MemoryLayout.sequenceLayout(MAX_RUNTIME_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("runtimeName")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$runtimeVersion = PathElement.groupElement("runtimeVersion");
    public static final PathElement PATH$runtimeName = PathElement.groupElement("runtimeName");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$runtimeVersion = (OfLong) LAYOUT.select(PATH$runtimeVersion);
    public static final SequenceLayout LAYOUT$runtimeName = (SequenceLayout) LAYOUT.select(PATH$runtimeName);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$runtimeVersion = LAYOUT$runtimeVersion.byteSize();
    public static final long SIZE$runtimeName = LAYOUT$runtimeName.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$runtimeVersion = LAYOUT.byteOffset(PATH$runtimeVersion);
    public static final long OFFSET$runtimeName = LAYOUT.byteOffset(PATH$runtimeName);
}

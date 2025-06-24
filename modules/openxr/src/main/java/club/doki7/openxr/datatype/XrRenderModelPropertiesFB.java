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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelPropertiesFB.html"><code>XrRenderModelPropertiesFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrRenderModelPropertiesFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t vendorId; // @link substring="vendorId" target="#vendorId"
///     char modelName; // @link substring="modelName" target="#modelName"
///     XrRenderModelKeyFB modelKey; // @link substring="modelKey" target="#modelKey"
///     uint32_t modelVersion; // @link substring="modelVersion" target="#modelVersion"
///     XrRenderModelFlagsFB flags; // @link substring="XrRenderModelFlagsFB" target="XrRenderModelFlagsFB" @link substring="flags" target="#flags"
/// } XrRenderModelPropertiesFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_RENDER_MODEL_PROPERTIES_FB`
///
/// The {@code allocate} ({@link XrRenderModelPropertiesFB#allocate(Arena)}, {@link XrRenderModelPropertiesFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrRenderModelPropertiesFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelPropertiesFB.html"><code>XrRenderModelPropertiesFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrRenderModelPropertiesFB(@NotNull MemorySegment segment) implements IXrRenderModelPropertiesFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelPropertiesFB.html"><code>XrRenderModelPropertiesFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrRenderModelPropertiesFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrRenderModelPropertiesFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrRenderModelPropertiesFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrRenderModelPropertiesFB, Iterable<XrRenderModelPropertiesFB> {
        public long size() {
            return segment.byteSize() / XrRenderModelPropertiesFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrRenderModelPropertiesFB at(long index) {
            return new XrRenderModelPropertiesFB(segment.asSlice(index * XrRenderModelPropertiesFB.BYTES, XrRenderModelPropertiesFB.BYTES));
        }

        public void write(long index, @NotNull XrRenderModelPropertiesFB value) {
            MemorySegment s = segment.asSlice(index * XrRenderModelPropertiesFB.BYTES, XrRenderModelPropertiesFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrRenderModelPropertiesFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrRenderModelPropertiesFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrRenderModelPropertiesFB.BYTES,
                (end - start) * XrRenderModelPropertiesFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrRenderModelPropertiesFB.BYTES));
        }

        public XrRenderModelPropertiesFB[] toArray() {
            XrRenderModelPropertiesFB[] ret = new XrRenderModelPropertiesFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrRenderModelPropertiesFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrRenderModelPropertiesFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrRenderModelPropertiesFB.BYTES;
            }

            @Override
            public XrRenderModelPropertiesFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrRenderModelPropertiesFB ret = new XrRenderModelPropertiesFB(segment.asSlice(0, XrRenderModelPropertiesFB.BYTES));
                segment = segment.asSlice(XrRenderModelPropertiesFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrRenderModelPropertiesFB allocate(Arena arena) {
        XrRenderModelPropertiesFB ret = new XrRenderModelPropertiesFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_RENDER_MODEL_PROPERTIES_FB);
        return ret;
    }

    public static XrRenderModelPropertiesFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrRenderModelPropertiesFB.Ptr ret = new XrRenderModelPropertiesFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_RENDER_MODEL_PROPERTIES_FB);
        }
        return ret;
    }

    public static XrRenderModelPropertiesFB clone(Arena arena, XrRenderModelPropertiesFB src) {
        XrRenderModelPropertiesFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_RENDER_MODEL_PROPERTIES_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrRenderModelPropertiesFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrRenderModelPropertiesFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrRenderModelPropertiesFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int vendorId() {
        return segment.get(LAYOUT$vendorId, OFFSET$vendorId);
    }

    public XrRenderModelPropertiesFB vendorId(@Unsigned int value) {
        segment.set(LAYOUT$vendorId, OFFSET$vendorId, value);
        return this;
    }

    public byte modelName() {
        return segment.get(LAYOUT$modelName, OFFSET$modelName);
    }

    public XrRenderModelPropertiesFB modelName(byte value) {
        segment.set(LAYOUT$modelName, OFFSET$modelName, value);
        return this;
    }

    public @NativeType("XrRenderModelKeyFB") @Unsigned long modelKey() {
        return segment.get(LAYOUT$modelKey, OFFSET$modelKey);
    }

    public XrRenderModelPropertiesFB modelKey(@NativeType("XrRenderModelKeyFB") @Unsigned long value) {
        segment.set(LAYOUT$modelKey, OFFSET$modelKey, value);
        return this;
    }

    public @Unsigned int modelVersion() {
        return segment.get(LAYOUT$modelVersion, OFFSET$modelVersion);
    }

    public XrRenderModelPropertiesFB modelVersion(@Unsigned int value) {
        segment.set(LAYOUT$modelVersion, OFFSET$modelVersion, value);
        return this;
    }

    public @Bitmask(XrRenderModelFlagsFB.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public XrRenderModelPropertiesFB flags(@Bitmask(XrRenderModelFlagsFB.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("vendorId"),
        ValueLayout.JAVA_BYTE.withName("modelName"),
        ValueLayout.JAVA_LONG.withName("modelKey"),
        ValueLayout.JAVA_INT.withName("modelVersion"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$vendorId = PathElement.groupElement("vendorId");
    public static final PathElement PATH$modelName = PathElement.groupElement("modelName");
    public static final PathElement PATH$modelKey = PathElement.groupElement("modelKey");
    public static final PathElement PATH$modelVersion = PathElement.groupElement("modelVersion");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$vendorId = (OfInt) LAYOUT.select(PATH$vendorId);
    public static final OfByte LAYOUT$modelName = (OfByte) LAYOUT.select(PATH$modelName);
    public static final OfLong LAYOUT$modelKey = (OfLong) LAYOUT.select(PATH$modelKey);
    public static final OfInt LAYOUT$modelVersion = (OfInt) LAYOUT.select(PATH$modelVersion);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$vendorId = LAYOUT$vendorId.byteSize();
    public static final long SIZE$modelName = LAYOUT$modelName.byteSize();
    public static final long SIZE$modelKey = LAYOUT$modelKey.byteSize();
    public static final long SIZE$modelVersion = LAYOUT$modelVersion.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$vendorId = LAYOUT.byteOffset(PATH$vendorId);
    public static final long OFFSET$modelName = LAYOUT.byteOffset(PATH$modelName);
    public static final long OFFSET$modelKey = LAYOUT.byteOffset(PATH$modelKey);
    public static final long OFFSET$modelVersion = LAYOUT.byteOffset(PATH$modelVersion);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
}

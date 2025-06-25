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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelCreateInfoEXT.html"><code>XrRenderModelCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrRenderModelCreateInfoEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrRenderModelIdEXT renderModelId; // @link substring="renderModelId" target="#renderModelId"
///     uint32_t gltfExtensionCount; // optional // @link substring="gltfExtensionCount" target="#gltfExtensionCount"
///     char const* const* gltfExtensions; // optional // @link substring="gltfExtensions" target="#gltfExtensions"
/// } XrRenderModelCreateInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_RENDER_MODEL_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link XrRenderModelCreateInfoEXT#allocate(Arena)}, {@link XrRenderModelCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrRenderModelCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelCreateInfoEXT.html"><code>XrRenderModelCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrRenderModelCreateInfoEXT(@NotNull MemorySegment segment) implements IXrRenderModelCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelCreateInfoEXT.html"><code>XrRenderModelCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrRenderModelCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrRenderModelCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrRenderModelCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrRenderModelCreateInfoEXT, Iterable<XrRenderModelCreateInfoEXT> {
        public long size() {
            return segment.byteSize() / XrRenderModelCreateInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrRenderModelCreateInfoEXT at(long index) {
            return new XrRenderModelCreateInfoEXT(segment.asSlice(index * XrRenderModelCreateInfoEXT.BYTES, XrRenderModelCreateInfoEXT.BYTES));
        }

        public void write(long index, @NotNull XrRenderModelCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * XrRenderModelCreateInfoEXT.BYTES, XrRenderModelCreateInfoEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrRenderModelCreateInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrRenderModelCreateInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrRenderModelCreateInfoEXT.BYTES,
                (end - start) * XrRenderModelCreateInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrRenderModelCreateInfoEXT.BYTES));
        }

        public XrRenderModelCreateInfoEXT[] toArray() {
            XrRenderModelCreateInfoEXT[] ret = new XrRenderModelCreateInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrRenderModelCreateInfoEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrRenderModelCreateInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrRenderModelCreateInfoEXT.BYTES;
            }

            @Override
            public XrRenderModelCreateInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrRenderModelCreateInfoEXT ret = new XrRenderModelCreateInfoEXT(segment.asSlice(0, XrRenderModelCreateInfoEXT.BYTES));
                segment = segment.asSlice(XrRenderModelCreateInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrRenderModelCreateInfoEXT allocate(Arena arena) {
        XrRenderModelCreateInfoEXT ret = new XrRenderModelCreateInfoEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.RENDER_MODEL_CREATE_INFO_EXT);
        return ret;
    }

    public static XrRenderModelCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrRenderModelCreateInfoEXT.Ptr ret = new XrRenderModelCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.RENDER_MODEL_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static XrRenderModelCreateInfoEXT clone(Arena arena, XrRenderModelCreateInfoEXT src) {
        XrRenderModelCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.RENDER_MODEL_CREATE_INFO_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrRenderModelCreateInfoEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrRenderModelCreateInfoEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrRenderModelCreateInfoEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrRenderModelIdEXT") @Unsigned long renderModelId() {
        return segment.get(LAYOUT$renderModelId, OFFSET$renderModelId);
    }

    public XrRenderModelCreateInfoEXT renderModelId(@NativeType("XrRenderModelIdEXT") @Unsigned long value) {
        segment.set(LAYOUT$renderModelId, OFFSET$renderModelId, value);
        return this;
    }

    public @Unsigned int gltfExtensionCount() {
        return segment.get(LAYOUT$gltfExtensionCount, OFFSET$gltfExtensionCount);
    }

    public XrRenderModelCreateInfoEXT gltfExtensionCount(@Unsigned int value) {
        segment.set(LAYOUT$gltfExtensionCount, OFFSET$gltfExtensionCount, value);
        return this;
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr gltfExtensions() {
        MemorySegment s = gltfExtensionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public XrRenderModelCreateInfoEXT gltfExtensions(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        gltfExtensionsRaw(s);
        return this;
    }

    public @Pointer(comment="void**") @NotNull MemorySegment gltfExtensionsRaw() {
        return segment.get(LAYOUT$gltfExtensions, OFFSET$gltfExtensions);
    }

    public void gltfExtensionsRaw(@Pointer(comment="void**") @NotNull MemorySegment value) {
        segment.set(LAYOUT$gltfExtensions, OFFSET$gltfExtensions, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("renderModelId"),
        ValueLayout.JAVA_INT.withName("gltfExtensionCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("gltfExtensions")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$renderModelId = PathElement.groupElement("renderModelId");
    public static final PathElement PATH$gltfExtensionCount = PathElement.groupElement("gltfExtensionCount");
    public static final PathElement PATH$gltfExtensions = PathElement.groupElement("gltfExtensions");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$renderModelId = (OfLong) LAYOUT.select(PATH$renderModelId);
    public static final OfInt LAYOUT$gltfExtensionCount = (OfInt) LAYOUT.select(PATH$gltfExtensionCount);
    public static final AddressLayout LAYOUT$gltfExtensions = (AddressLayout) LAYOUT.select(PATH$gltfExtensions);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$renderModelId = LAYOUT$renderModelId.byteSize();
    public static final long SIZE$gltfExtensionCount = LAYOUT$gltfExtensionCount.byteSize();
    public static final long SIZE$gltfExtensions = LAYOUT$gltfExtensions.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$renderModelId = LAYOUT.byteOffset(PATH$renderModelId);
    public static final long OFFSET$gltfExtensionCount = LAYOUT.byteOffset(PATH$gltfExtensionCount);
    public static final long OFFSET$gltfExtensions = LAYOUT.byteOffset(PATH$gltfExtensions);
}

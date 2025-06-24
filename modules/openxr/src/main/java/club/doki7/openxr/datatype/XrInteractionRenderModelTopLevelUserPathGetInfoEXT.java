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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionRenderModelTopLevelUserPathGetInfoEXT.html"><code>XrInteractionRenderModelTopLevelUserPathGetInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrInteractionRenderModelTopLevelUserPathGetInfoEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t topLevelUserPathCount; // @link substring="topLevelUserPathCount" target="#topLevelUserPathCount"
///     XrPath const* topLevelUserPaths; // @link substring="topLevelUserPaths" target="#topLevelUserPaths"
/// } XrInteractionRenderModelTopLevelUserPathGetInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT`
///
/// The {@code allocate} ({@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT#allocate(Arena)}, {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionRenderModelTopLevelUserPathGetInfoEXT.html"><code>XrInteractionRenderModelTopLevelUserPathGetInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrInteractionRenderModelTopLevelUserPathGetInfoEXT(@NotNull MemorySegment segment) implements IXrInteractionRenderModelTopLevelUserPathGetInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInteractionRenderModelTopLevelUserPathGetInfoEXT.html"><code>XrInteractionRenderModelTopLevelUserPathGetInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrInteractionRenderModelTopLevelUserPathGetInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrInteractionRenderModelTopLevelUserPathGetInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrInteractionRenderModelTopLevelUserPathGetInfoEXT, Iterable<XrInteractionRenderModelTopLevelUserPathGetInfoEXT> {
        public long size() {
            return segment.byteSize() / XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrInteractionRenderModelTopLevelUserPathGetInfoEXT at(long index) {
            return new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(segment.asSlice(index * XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES, XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES));
        }

        public void write(long index, @NotNull XrInteractionRenderModelTopLevelUserPathGetInfoEXT value) {
            MemorySegment s = segment.asSlice(index * XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES, XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES,
                (end - start) * XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES));
        }

        public XrInteractionRenderModelTopLevelUserPathGetInfoEXT[] toArray() {
            XrInteractionRenderModelTopLevelUserPathGetInfoEXT[] ret = new XrInteractionRenderModelTopLevelUserPathGetInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrInteractionRenderModelTopLevelUserPathGetInfoEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrInteractionRenderModelTopLevelUserPathGetInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES;
            }

            @Override
            public XrInteractionRenderModelTopLevelUserPathGetInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrInteractionRenderModelTopLevelUserPathGetInfoEXT ret = new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(segment.asSlice(0, XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES));
                segment = segment.asSlice(XrInteractionRenderModelTopLevelUserPathGetInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT allocate(Arena arena) {
        XrInteractionRenderModelTopLevelUserPathGetInfoEXT ret = new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT);
        return ret;
    }

    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Ptr ret = new XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT);
        }
        return ret;
    }

    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT clone(Arena arena, XrInteractionRenderModelTopLevelUserPathGetInfoEXT src) {
        XrInteractionRenderModelTopLevelUserPathGetInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int topLevelUserPathCount() {
        return segment.get(LAYOUT$topLevelUserPathCount, OFFSET$topLevelUserPathCount);
    }

    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT topLevelUserPathCount(@Unsigned int value) {
        segment.set(LAYOUT$topLevelUserPathCount, OFFSET$topLevelUserPathCount, value);
        return this;
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Pointer(comment="XrPath") @Unsigned LongPtr topLevelUserPaths() {
        MemorySegment s = topLevelUserPathsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT topLevelUserPaths(@Nullable @Pointer(comment="XrPath") @Unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        topLevelUserPathsRaw(s);
        return this;
    }

    public @Pointer(comment="uint64_t*") @NotNull MemorySegment topLevelUserPathsRaw() {
        return segment.get(LAYOUT$topLevelUserPaths, OFFSET$topLevelUserPaths);
    }

    public void topLevelUserPathsRaw(@Pointer(comment="uint64_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$topLevelUserPaths, OFFSET$topLevelUserPaths, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("topLevelUserPathCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("topLevelUserPaths")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$topLevelUserPathCount = PathElement.groupElement("topLevelUserPathCount");
    public static final PathElement PATH$topLevelUserPaths = PathElement.groupElement("topLevelUserPaths");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$topLevelUserPathCount = (OfInt) LAYOUT.select(PATH$topLevelUserPathCount);
    public static final AddressLayout LAYOUT$topLevelUserPaths = (AddressLayout) LAYOUT.select(PATH$topLevelUserPaths);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$topLevelUserPathCount = LAYOUT$topLevelUserPathCount.byteSize();
    public static final long SIZE$topLevelUserPaths = LAYOUT$topLevelUserPaths.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$topLevelUserPathCount = LAYOUT.byteOffset(PATH$topLevelUserPathCount);
    public static final long OFFSET$topLevelUserPaths = LAYOUT.byteOffset(PATH$topLevelUserPaths);
}

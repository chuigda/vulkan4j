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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneObjectsMSFT.html"><code>XrSceneObjectsMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneObjectsMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t sceneObjectCount; // optional // @link substring="sceneObjectCount" target="#sceneObjectCount"
///     XrSceneObjectMSFT* sceneObjects; // optional // @link substring="XrSceneObjectMSFT" target="XrSceneObjectMSFT" @link substring="sceneObjects" target="#sceneObjects"
/// } XrSceneObjectsMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SCENE_OBJECTS_MSFT`
///
/// The {@code allocate} ({@link XrSceneObjectsMSFT#allocate(Arena)}, {@link XrSceneObjectsMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSceneObjectsMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneObjectsMSFT.html"><code>XrSceneObjectsMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneObjectsMSFT(@NotNull MemorySegment segment) implements IXrSceneObjectsMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneObjectsMSFT.html"><code>XrSceneObjectsMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneObjectsMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneObjectsMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneObjectsMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneObjectsMSFT, Iterable<XrSceneObjectsMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneObjectsMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneObjectsMSFT at(long index) {
            return new XrSceneObjectsMSFT(segment.asSlice(index * XrSceneObjectsMSFT.BYTES, XrSceneObjectsMSFT.BYTES));
        }

        public XrSceneObjectsMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSceneObjectsMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSceneObjectsMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneObjectsMSFT.BYTES, XrSceneObjectsMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneObjectsMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneObjectsMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneObjectsMSFT.BYTES,
                (end - start) * XrSceneObjectsMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneObjectsMSFT.BYTES));
        }

        public XrSceneObjectsMSFT[] toArray() {
            XrSceneObjectsMSFT[] ret = new XrSceneObjectsMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneObjectsMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneObjectsMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneObjectsMSFT.BYTES;
            }

            @Override
            public XrSceneObjectsMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneObjectsMSFT ret = new XrSceneObjectsMSFT(segment.asSlice(0, XrSceneObjectsMSFT.BYTES));
                segment = segment.asSlice(XrSceneObjectsMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneObjectsMSFT allocate(Arena arena) {
        XrSceneObjectsMSFT ret = new XrSceneObjectsMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SCENE_OBJECTS_MSFT);
        return ret;
    }

    public static XrSceneObjectsMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSceneObjectsMSFT.Ptr ret = new XrSceneObjectsMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SCENE_OBJECTS_MSFT);
        }
        return ret;
    }

    public static XrSceneObjectsMSFT clone(Arena arena, XrSceneObjectsMSFT src) {
        XrSceneObjectsMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SCENE_OBJECTS_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSceneObjectsMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSceneObjectsMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSceneObjectsMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int sceneObjectCount() {
        return segment.get(LAYOUT$sceneObjectCount, OFFSET$sceneObjectCount);
    }

    public XrSceneObjectsMSFT sceneObjectCount(@Unsigned int value) {
        segment.set(LAYOUT$sceneObjectCount, OFFSET$sceneObjectCount, value);
        return this;
    }

    public XrSceneObjectsMSFT sceneObjects(@Nullable IXrSceneObjectMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        sceneObjectsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSceneObjectMSFT.Ptr sceneObjects(int assumedCount) {
        MemorySegment s = sceneObjectsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSceneObjectMSFT.BYTES);
        return new XrSceneObjectMSFT.Ptr(s);
    }

    public @Nullable XrSceneObjectMSFT sceneObjects() {
        MemorySegment s = sceneObjectsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSceneObjectMSFT(s);
    }

    public @Pointer(target=XrSceneObjectMSFT.class) @NotNull MemorySegment sceneObjectsRaw() {
        return segment.get(LAYOUT$sceneObjects, OFFSET$sceneObjects);
    }

    public void sceneObjectsRaw(@Pointer(target=XrSceneObjectMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$sceneObjects, OFFSET$sceneObjects, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("sceneObjectCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrSceneObjectMSFT.LAYOUT).withName("sceneObjects")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$sceneObjectCount = PathElement.groupElement("sceneObjectCount");
    public static final PathElement PATH$sceneObjects = PathElement.groupElement("sceneObjects");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$sceneObjectCount = (OfInt) LAYOUT.select(PATH$sceneObjectCount);
    public static final AddressLayout LAYOUT$sceneObjects = (AddressLayout) LAYOUT.select(PATH$sceneObjects);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$sceneObjectCount = LAYOUT$sceneObjectCount.byteSize();
    public static final long SIZE$sceneObjects = LAYOUT$sceneObjects.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$sceneObjectCount = LAYOUT.byteOffset(PATH$sceneObjectCount);
    public static final long OFFSET$sceneObjects = LAYOUT.byteOffset(PATH$sceneObjects);
}

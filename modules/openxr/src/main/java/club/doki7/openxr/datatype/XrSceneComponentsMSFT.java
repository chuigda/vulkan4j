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
import club.doki7.openxr.XRFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComponentsMSFT.html"><code>XrSceneComponentsMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneComponentsMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t componentCapacityInput; // optional // @link substring="componentCapacityInput" target="#componentCapacityInput"
///     uint32_t componentCountOutput; // optional // @link substring="componentCountOutput" target="#componentCountOutput"
///     XrSceneComponentMSFT* components; // optional // @link substring="XrSceneComponentMSFT" target="XrSceneComponentMSFT" @link substring="components" target="#components"
/// } XrSceneComponentsMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SCENE_COMPONENTS_MSFT`
///
/// The {@code allocate} ({@link XrSceneComponentsMSFT#allocate(Arena)}, {@link XrSceneComponentsMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSceneComponentsMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComponentsMSFT.html"><code>XrSceneComponentsMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneComponentsMSFT(@NotNull MemorySegment segment) implements IXrSceneComponentsMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComponentsMSFT.html"><code>XrSceneComponentsMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneComponentsMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneComponentsMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneComponentsMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneComponentsMSFT, Iterable<XrSceneComponentsMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneComponentsMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneComponentsMSFT at(long index) {
            return new XrSceneComponentsMSFT(segment.asSlice(index * XrSceneComponentsMSFT.BYTES, XrSceneComponentsMSFT.BYTES));
        }

        public XrSceneComponentsMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSceneComponentsMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSceneComponentsMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneComponentsMSFT.BYTES, XrSceneComponentsMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneComponentsMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneComponentsMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneComponentsMSFT.BYTES,
                (end - start) * XrSceneComponentsMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneComponentsMSFT.BYTES));
        }

        public XrSceneComponentsMSFT[] toArray() {
            XrSceneComponentsMSFT[] ret = new XrSceneComponentsMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneComponentsMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneComponentsMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneComponentsMSFT.BYTES;
            }

            @Override
            public XrSceneComponentsMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneComponentsMSFT ret = new XrSceneComponentsMSFT(segment.asSlice(0, XrSceneComponentsMSFT.BYTES));
                segment = segment.asSlice(XrSceneComponentsMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneComponentsMSFT allocate(Arena arena) {
        XrSceneComponentsMSFT ret = new XrSceneComponentsMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SCENE_COMPONENTS_MSFT);
        return ret;
    }

    public static XrSceneComponentsMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSceneComponentsMSFT.Ptr ret = new XrSceneComponentsMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SCENE_COMPONENTS_MSFT);
        }
        return ret;
    }

    public static XrSceneComponentsMSFT clone(Arena arena, XrSceneComponentsMSFT src) {
        XrSceneComponentsMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SCENE_COMPONENTS_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSceneComponentsMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSceneComponentsMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSceneComponentsMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int componentCapacityInput() {
        return segment.get(LAYOUT$componentCapacityInput, OFFSET$componentCapacityInput);
    }

    public XrSceneComponentsMSFT componentCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$componentCapacityInput, OFFSET$componentCapacityInput, value);
        return this;
    }

    public @Unsigned int componentCountOutput() {
        return segment.get(LAYOUT$componentCountOutput, OFFSET$componentCountOutput);
    }

    public XrSceneComponentsMSFT componentCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$componentCountOutput, OFFSET$componentCountOutput, value);
        return this;
    }

    public XrSceneComponentsMSFT components(@Nullable IXrSceneComponentMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        componentsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSceneComponentMSFT.Ptr components(int assumedCount) {
        MemorySegment s = componentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSceneComponentMSFT.BYTES);
        return new XrSceneComponentMSFT.Ptr(s);
    }

    public @Nullable XrSceneComponentMSFT components() {
        MemorySegment s = componentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSceneComponentMSFT(s);
    }

    public @Pointer(target=XrSceneComponentMSFT.class) @NotNull MemorySegment componentsRaw() {
        return segment.get(LAYOUT$components, OFFSET$components);
    }

    public void componentsRaw(@Pointer(target=XrSceneComponentMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$components, OFFSET$components, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("componentCapacityInput"),
        ValueLayout.JAVA_INT.withName("componentCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrSceneComponentMSFT.LAYOUT).withName("components")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$componentCapacityInput = PathElement.groupElement("componentCapacityInput");
    public static final PathElement PATH$componentCountOutput = PathElement.groupElement("componentCountOutput");
    public static final PathElement PATH$components = PathElement.groupElement("components");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$componentCapacityInput = (OfInt) LAYOUT.select(PATH$componentCapacityInput);
    public static final OfInt LAYOUT$componentCountOutput = (OfInt) LAYOUT.select(PATH$componentCountOutput);
    public static final AddressLayout LAYOUT$components = (AddressLayout) LAYOUT.select(PATH$components);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$componentCapacityInput = LAYOUT$componentCapacityInput.byteSize();
    public static final long SIZE$componentCountOutput = LAYOUT$componentCountOutput.byteSize();
    public static final long SIZE$components = LAYOUT$components.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$componentCapacityInput = LAYOUT.byteOffset(PATH$componentCapacityInput);
    public static final long OFFSET$componentCountOutput = LAYOUT.byteOffset(PATH$componentCountOutput);
    public static final long OFFSET$components = LAYOUT.byteOffset(PATH$components);
}

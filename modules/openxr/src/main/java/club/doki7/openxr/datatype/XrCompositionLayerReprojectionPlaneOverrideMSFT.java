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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerReprojectionPlaneOverrideMSFT.html"><code>XrCompositionLayerReprojectionPlaneOverrideMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCompositionLayerReprojectionPlaneOverrideMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrVector3f position; // @link substring="XrVector3f" target="XrVector3f" @link substring="position" target="#position"
///     XrVector3f normal; // @link substring="XrVector3f" target="XrVector3f" @link substring="normal" target="#normal"
///     XrVector3f velocity; // @link substring="XrVector3f" target="XrVector3f" @link substring="velocity" target="#velocity"
/// } XrCompositionLayerReprojectionPlaneOverrideMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT`
///
/// The {@code allocate} ({@link XrCompositionLayerReprojectionPlaneOverrideMSFT#allocate(Arena)}, {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCompositionLayerReprojectionPlaneOverrideMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerReprojectionPlaneOverrideMSFT.html"><code>XrCompositionLayerReprojectionPlaneOverrideMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCompositionLayerReprojectionPlaneOverrideMSFT(@NotNull MemorySegment segment) implements IXrCompositionLayerReprojectionPlaneOverrideMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerReprojectionPlaneOverrideMSFT.html"><code>XrCompositionLayerReprojectionPlaneOverrideMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCompositionLayerReprojectionPlaneOverrideMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCompositionLayerReprojectionPlaneOverrideMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCompositionLayerReprojectionPlaneOverrideMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCompositionLayerReprojectionPlaneOverrideMSFT, Iterable<XrCompositionLayerReprojectionPlaneOverrideMSFT> {
        public long size() {
            return segment.byteSize() / XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCompositionLayerReprojectionPlaneOverrideMSFT at(long index) {
            return new XrCompositionLayerReprojectionPlaneOverrideMSFT(segment.asSlice(index * XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES, XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrCompositionLayerReprojectionPlaneOverrideMSFT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrCompositionLayerReprojectionPlaneOverrideMSFT value) {
            MemorySegment s = segment.asSlice(index * XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES, XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES,
                (end - start) * XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES));
        }

        public XrCompositionLayerReprojectionPlaneOverrideMSFT[] toArray() {
            XrCompositionLayerReprojectionPlaneOverrideMSFT[] ret = new XrCompositionLayerReprojectionPlaneOverrideMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCompositionLayerReprojectionPlaneOverrideMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCompositionLayerReprojectionPlaneOverrideMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES;
            }

            @Override
            public XrCompositionLayerReprojectionPlaneOverrideMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCompositionLayerReprojectionPlaneOverrideMSFT ret = new XrCompositionLayerReprojectionPlaneOverrideMSFT(segment.asSlice(0, XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES));
                segment = segment.asSlice(XrCompositionLayerReprojectionPlaneOverrideMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCompositionLayerReprojectionPlaneOverrideMSFT allocate(Arena arena) {
        XrCompositionLayerReprojectionPlaneOverrideMSFT ret = new XrCompositionLayerReprojectionPlaneOverrideMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT);
        return ret;
    }

    public static XrCompositionLayerReprojectionPlaneOverrideMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCompositionLayerReprojectionPlaneOverrideMSFT.Ptr ret = new XrCompositionLayerReprojectionPlaneOverrideMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT);
        }
        return ret;
    }

    public static XrCompositionLayerReprojectionPlaneOverrideMSFT clone(Arena arena, XrCompositionLayerReprojectionPlaneOverrideMSFT src) {
        XrCompositionLayerReprojectionPlaneOverrideMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCompositionLayerReprojectionPlaneOverrideMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCompositionLayerReprojectionPlaneOverrideMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCompositionLayerReprojectionPlaneOverrideMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrVector3f position() {
        return new XrVector3f(segment.asSlice(OFFSET$position, LAYOUT$position));
    }

    public XrCompositionLayerReprojectionPlaneOverrideMSFT position(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$position, SIZE$position);
        return this;
    }

    public XrCompositionLayerReprojectionPlaneOverrideMSFT position(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(position());
        return this;
    }

    public @NotNull XrVector3f normal() {
        return new XrVector3f(segment.asSlice(OFFSET$normal, LAYOUT$normal));
    }

    public XrCompositionLayerReprojectionPlaneOverrideMSFT normal(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$normal, SIZE$normal);
        return this;
    }

    public XrCompositionLayerReprojectionPlaneOverrideMSFT normal(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(normal());
        return this;
    }

    public @NotNull XrVector3f velocity() {
        return new XrVector3f(segment.asSlice(OFFSET$velocity, LAYOUT$velocity));
    }

    public XrCompositionLayerReprojectionPlaneOverrideMSFT velocity(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$velocity, SIZE$velocity);
        return this;
    }

    public XrCompositionLayerReprojectionPlaneOverrideMSFT velocity(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(velocity());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrVector3f.LAYOUT.withName("position"),
        XrVector3f.LAYOUT.withName("normal"),
        XrVector3f.LAYOUT.withName("velocity")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$position = PathElement.groupElement("position");
    public static final PathElement PATH$normal = PathElement.groupElement("normal");
    public static final PathElement PATH$velocity = PathElement.groupElement("velocity");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$position = (StructLayout) LAYOUT.select(PATH$position);
    public static final StructLayout LAYOUT$normal = (StructLayout) LAYOUT.select(PATH$normal);
    public static final StructLayout LAYOUT$velocity = (StructLayout) LAYOUT.select(PATH$velocity);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$position = LAYOUT$position.byteSize();
    public static final long SIZE$normal = LAYOUT$normal.byteSize();
    public static final long SIZE$velocity = LAYOUT$velocity.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$position = LAYOUT.byteOffset(PATH$position);
    public static final long OFFSET$normal = LAYOUT.byteOffset(PATH$normal);
    public static final long OFFSET$velocity = LAYOUT.byteOffset(PATH$velocity);
}

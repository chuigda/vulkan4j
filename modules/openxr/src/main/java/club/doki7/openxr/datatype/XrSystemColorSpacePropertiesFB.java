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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemColorSpacePropertiesFB.html"><code>XrSystemColorSpacePropertiesFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSystemColorSpacePropertiesFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrColorSpaceFB colorSpace; // @link substring="XrColorSpaceFB" target="XrColorSpaceFB" @link substring="colorSpace" target="#colorSpace"
/// } XrSystemColorSpacePropertiesFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB`
///
/// The {@code allocate} ({@link XrSystemColorSpacePropertiesFB#allocate(Arena)}, {@link XrSystemColorSpacePropertiesFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSystemColorSpacePropertiesFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemColorSpacePropertiesFB.html"><code>XrSystemColorSpacePropertiesFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSystemColorSpacePropertiesFB(@NotNull MemorySegment segment) implements IXrSystemColorSpacePropertiesFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemColorSpacePropertiesFB.html"><code>XrSystemColorSpacePropertiesFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSystemColorSpacePropertiesFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSystemColorSpacePropertiesFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSystemColorSpacePropertiesFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSystemColorSpacePropertiesFB, Iterable<XrSystemColorSpacePropertiesFB> {
        public long size() {
            return segment.byteSize() / XrSystemColorSpacePropertiesFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSystemColorSpacePropertiesFB at(long index) {
            return new XrSystemColorSpacePropertiesFB(segment.asSlice(index * XrSystemColorSpacePropertiesFB.BYTES, XrSystemColorSpacePropertiesFB.BYTES));
        }

        public void write(long index, @NotNull XrSystemColorSpacePropertiesFB value) {
            MemorySegment s = segment.asSlice(index * XrSystemColorSpacePropertiesFB.BYTES, XrSystemColorSpacePropertiesFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSystemColorSpacePropertiesFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSystemColorSpacePropertiesFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSystemColorSpacePropertiesFB.BYTES,
                (end - start) * XrSystemColorSpacePropertiesFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSystemColorSpacePropertiesFB.BYTES));
        }

        public XrSystemColorSpacePropertiesFB[] toArray() {
            XrSystemColorSpacePropertiesFB[] ret = new XrSystemColorSpacePropertiesFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSystemColorSpacePropertiesFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSystemColorSpacePropertiesFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSystemColorSpacePropertiesFB.BYTES;
            }

            @Override
            public XrSystemColorSpacePropertiesFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSystemColorSpacePropertiesFB ret = new XrSystemColorSpacePropertiesFB(segment.asSlice(0, XrSystemColorSpacePropertiesFB.BYTES));
                segment = segment.asSlice(XrSystemColorSpacePropertiesFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSystemColorSpacePropertiesFB allocate(Arena arena) {
        XrSystemColorSpacePropertiesFB ret = new XrSystemColorSpacePropertiesFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SYSTEM_COLOR_SPACE_PROPERTIES_FB);
        return ret;
    }

    public static XrSystemColorSpacePropertiesFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSystemColorSpacePropertiesFB.Ptr ret = new XrSystemColorSpacePropertiesFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SYSTEM_COLOR_SPACE_PROPERTIES_FB);
        }
        return ret;
    }

    public static XrSystemColorSpacePropertiesFB clone(Arena arena, XrSystemColorSpacePropertiesFB src) {
        XrSystemColorSpacePropertiesFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SYSTEM_COLOR_SPACE_PROPERTIES_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSystemColorSpacePropertiesFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSystemColorSpacePropertiesFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSystemColorSpacePropertiesFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrColorSpaceFB.class) int colorSpace() {
        return segment.get(LAYOUT$colorSpace, OFFSET$colorSpace);
    }

    public XrSystemColorSpacePropertiesFB colorSpace(@EnumType(XrColorSpaceFB.class) int value) {
        segment.set(LAYOUT$colorSpace, OFFSET$colorSpace, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$colorSpace = PathElement.groupElement("colorSpace");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$colorSpace = (OfInt) LAYOUT.select(PATH$colorSpace);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$colorSpace = LAYOUT$colorSpace.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$colorSpace = LAYOUT.byteOffset(PATH$colorSpace);
}

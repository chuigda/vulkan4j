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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodySkeletonFB.html"><code>XrBodySkeletonFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrBodySkeletonFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t jointCount; // @link substring="jointCount" target="#jointCount"
///     XrBodySkeletonJointFB* joints; // @link substring="XrBodySkeletonJointFB" target="XrBodySkeletonJointFB" @link substring="joints" target="#joints"
/// } XrBodySkeletonFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_BODY_SKELETON_FB`
///
/// The {@code allocate} ({@link XrBodySkeletonFB#allocate(Arena)}, {@link XrBodySkeletonFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrBodySkeletonFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodySkeletonFB.html"><code>XrBodySkeletonFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrBodySkeletonFB(@NotNull MemorySegment segment) implements IXrBodySkeletonFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodySkeletonFB.html"><code>XrBodySkeletonFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrBodySkeletonFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrBodySkeletonFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrBodySkeletonFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrBodySkeletonFB, Iterable<XrBodySkeletonFB> {
        public long size() {
            return segment.byteSize() / XrBodySkeletonFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrBodySkeletonFB at(long index) {
            return new XrBodySkeletonFB(segment.asSlice(index * XrBodySkeletonFB.BYTES, XrBodySkeletonFB.BYTES));
        }

        public void write(long index, @NotNull XrBodySkeletonFB value) {
            MemorySegment s = segment.asSlice(index * XrBodySkeletonFB.BYTES, XrBodySkeletonFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrBodySkeletonFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrBodySkeletonFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrBodySkeletonFB.BYTES,
                (end - start) * XrBodySkeletonFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrBodySkeletonFB.BYTES));
        }

        public XrBodySkeletonFB[] toArray() {
            XrBodySkeletonFB[] ret = new XrBodySkeletonFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrBodySkeletonFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrBodySkeletonFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrBodySkeletonFB.BYTES;
            }

            @Override
            public XrBodySkeletonFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrBodySkeletonFB ret = new XrBodySkeletonFB(segment.asSlice(0, XrBodySkeletonFB.BYTES));
                segment = segment.asSlice(XrBodySkeletonFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrBodySkeletonFB allocate(Arena arena) {
        XrBodySkeletonFB ret = new XrBodySkeletonFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_BODY_SKELETON_FB);
        return ret;
    }

    public static XrBodySkeletonFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrBodySkeletonFB.Ptr ret = new XrBodySkeletonFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_BODY_SKELETON_FB);
        }
        return ret;
    }

    public static XrBodySkeletonFB clone(Arena arena, XrBodySkeletonFB src) {
        XrBodySkeletonFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_BODY_SKELETON_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrBodySkeletonFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrBodySkeletonFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrBodySkeletonFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int jointCount() {
        return segment.get(LAYOUT$jointCount, OFFSET$jointCount);
    }

    public XrBodySkeletonFB jointCount(@Unsigned int value) {
        segment.set(LAYOUT$jointCount, OFFSET$jointCount, value);
        return this;
    }

    public XrBodySkeletonFB joints(@Nullable IXrBodySkeletonJointFB value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        jointsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrBodySkeletonJointFB.Ptr joints(int assumedCount) {
        MemorySegment s = jointsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrBodySkeletonJointFB.BYTES);
        return new XrBodySkeletonJointFB.Ptr(s);
    }

    public @Nullable XrBodySkeletonJointFB joints() {
        MemorySegment s = jointsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrBodySkeletonJointFB(s);
    }

    public @Pointer(target=XrBodySkeletonJointFB.class) @NotNull MemorySegment jointsRaw() {
        return segment.get(LAYOUT$joints, OFFSET$joints);
    }

    public void jointsRaw(@Pointer(target=XrBodySkeletonJointFB.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$joints, OFFSET$joints, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("jointCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrBodySkeletonJointFB.LAYOUT).withName("joints")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$jointCount = PathElement.groupElement("jointCount");
    public static final PathElement PATH$joints = PathElement.groupElement("joints");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$jointCount = (OfInt) LAYOUT.select(PATH$jointCount);
    public static final AddressLayout LAYOUT$joints = (AddressLayout) LAYOUT.select(PATH$joints);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$jointCount = LAYOUT$jointCount.byteSize();
    public static final long SIZE$joints = LAYOUT$joints.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$jointCount = LAYOUT.byteOffset(PATH$jointCount);
    public static final long OFFSET$joints = LAYOUT.byteOffset(PATH$joints);
}

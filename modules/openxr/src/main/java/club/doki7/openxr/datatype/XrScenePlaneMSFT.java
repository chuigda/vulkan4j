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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrScenePlaneMSFT.html"><code>XrScenePlaneMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrScenePlaneMSFT {
///     XrScenePlaneAlignmentTypeMSFT alignment; // @link substring="XrScenePlaneAlignmentTypeMSFT" target="XrScenePlaneAlignmentTypeMSFT" @link substring="alignment" target="#alignment"
///     XrExtent2Df size; // @link substring="XrExtent2Df" target="XrExtent2Df" @link substring="size" target="#size"
///     uint64_t meshBufferId; // @link substring="meshBufferId" target="#meshBufferId"
///     XrBool32 supportsIndicesUint16; // @link substring="supportsIndicesUint16" target="#supportsIndicesUint16"
/// } XrScenePlaneMSFT;
/// }
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrScenePlaneMSFT.html"><code>XrScenePlaneMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrScenePlaneMSFT(@NotNull MemorySegment segment) implements IXrScenePlaneMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrScenePlaneMSFT.html"><code>XrScenePlaneMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrScenePlaneMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrScenePlaneMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrScenePlaneMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrScenePlaneMSFT, Iterable<XrScenePlaneMSFT> {
        public long size() {
            return segment.byteSize() / XrScenePlaneMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrScenePlaneMSFT at(long index) {
            return new XrScenePlaneMSFT(segment.asSlice(index * XrScenePlaneMSFT.BYTES, XrScenePlaneMSFT.BYTES));
        }

        public void write(long index, @NotNull XrScenePlaneMSFT value) {
            MemorySegment s = segment.asSlice(index * XrScenePlaneMSFT.BYTES, XrScenePlaneMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrScenePlaneMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrScenePlaneMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrScenePlaneMSFT.BYTES,
                (end - start) * XrScenePlaneMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrScenePlaneMSFT.BYTES));
        }

        public XrScenePlaneMSFT[] toArray() {
            XrScenePlaneMSFT[] ret = new XrScenePlaneMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrScenePlaneMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrScenePlaneMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrScenePlaneMSFT.BYTES;
            }

            @Override
            public XrScenePlaneMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrScenePlaneMSFT ret = new XrScenePlaneMSFT(segment.asSlice(0, XrScenePlaneMSFT.BYTES));
                segment = segment.asSlice(XrScenePlaneMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrScenePlaneMSFT allocate(Arena arena) {
        return new XrScenePlaneMSFT(arena.allocate(LAYOUT));
    }

    public static XrScenePlaneMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrScenePlaneMSFT.Ptr(segment);
    }

    public static XrScenePlaneMSFT clone(Arena arena, XrScenePlaneMSFT src) {
        XrScenePlaneMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrScenePlaneAlignmentTypeMSFT.class) int alignment() {
        return segment.get(LAYOUT$alignment, OFFSET$alignment);
    }

    public XrScenePlaneMSFT alignment(@EnumType(XrScenePlaneAlignmentTypeMSFT.class) int value) {
        segment.set(LAYOUT$alignment, OFFSET$alignment, value);
        return this;
    }

    public @NotNull XrExtent2Df size() {
        return new XrExtent2Df(segment.asSlice(OFFSET$size, LAYOUT$size));
    }

    public XrScenePlaneMSFT size(@NotNull XrExtent2Df value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$size, SIZE$size);
        return this;
    }

    public XrScenePlaneMSFT size(Consumer<@NotNull XrExtent2Df> consumer) {
        consumer.accept(size());
        return this;
    }

    public @Unsigned long meshBufferId() {
        return segment.get(LAYOUT$meshBufferId, OFFSET$meshBufferId);
    }

    public XrScenePlaneMSFT meshBufferId(@Unsigned long value) {
        segment.set(LAYOUT$meshBufferId, OFFSET$meshBufferId, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int supportsIndicesUint16() {
        return segment.get(LAYOUT$supportsIndicesUint16, OFFSET$supportsIndicesUint16);
    }

    public XrScenePlaneMSFT supportsIndicesUint16(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$supportsIndicesUint16, OFFSET$supportsIndicesUint16, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("alignment"),
        XrExtent2Df.LAYOUT.withName("size"),
        ValueLayout.JAVA_LONG.withName("meshBufferId"),
        ValueLayout.JAVA_INT.withName("supportsIndicesUint16")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$alignment = PathElement.groupElement("alignment");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$meshBufferId = PathElement.groupElement("meshBufferId");
    public static final PathElement PATH$supportsIndicesUint16 = PathElement.groupElement("supportsIndicesUint16");

    public static final OfInt LAYOUT$alignment = (OfInt) LAYOUT.select(PATH$alignment);
    public static final StructLayout LAYOUT$size = (StructLayout) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$meshBufferId = (OfLong) LAYOUT.select(PATH$meshBufferId);
    public static final OfInt LAYOUT$supportsIndicesUint16 = (OfInt) LAYOUT.select(PATH$supportsIndicesUint16);

    public static final long SIZE$alignment = LAYOUT$alignment.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$meshBufferId = LAYOUT$meshBufferId.byteSize();
    public static final long SIZE$supportsIndicesUint16 = LAYOUT$supportsIndicesUint16.byteSize();

    public static final long OFFSET$alignment = LAYOUT.byteOffset(PATH$alignment);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$meshBufferId = LAYOUT.byteOffset(PATH$meshBufferId);
    public static final long OFFSET$supportsIndicesUint16 = LAYOUT.byteOffset(PATH$supportsIndicesUint16);
}

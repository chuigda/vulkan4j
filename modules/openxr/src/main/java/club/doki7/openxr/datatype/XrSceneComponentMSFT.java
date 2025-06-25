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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComponentMSFT.html"><code>XrSceneComponentMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneComponentMSFT {
///     XrSceneComponentTypeMSFT componentType; // @link substring="XrSceneComponentTypeMSFT" target="XrSceneComponentTypeMSFT" @link substring="componentType" target="#componentType"
///     XrUuidMSFT id; // @link substring="XrUuidMSFT" target="XrUuidMSFT" @link substring="id" target="#id"
///     XrUuidMSFT parentId; // optional // @link substring="XrUuidMSFT" target="XrUuidMSFT" @link substring="parentId" target="#parentId"
///     XrTime updateTime; // @link substring="updateTime" target="#updateTime"
/// } XrSceneComponentMSFT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComponentMSFT.html"><code>XrSceneComponentMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneComponentMSFT(@NotNull MemorySegment segment) implements IXrSceneComponentMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComponentMSFT.html"><code>XrSceneComponentMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneComponentMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneComponentMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneComponentMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneComponentMSFT, Iterable<XrSceneComponentMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneComponentMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneComponentMSFT at(long index) {
            return new XrSceneComponentMSFT(segment.asSlice(index * XrSceneComponentMSFT.BYTES, XrSceneComponentMSFT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSceneComponentMSFT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSceneComponentMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneComponentMSFT.BYTES, XrSceneComponentMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneComponentMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneComponentMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneComponentMSFT.BYTES,
                (end - start) * XrSceneComponentMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneComponentMSFT.BYTES));
        }

        public XrSceneComponentMSFT[] toArray() {
            XrSceneComponentMSFT[] ret = new XrSceneComponentMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneComponentMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneComponentMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneComponentMSFT.BYTES;
            }

            @Override
            public XrSceneComponentMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneComponentMSFT ret = new XrSceneComponentMSFT(segment.asSlice(0, XrSceneComponentMSFT.BYTES));
                segment = segment.asSlice(XrSceneComponentMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneComponentMSFT allocate(Arena arena) {
        return new XrSceneComponentMSFT(arena.allocate(LAYOUT));
    }

    public static XrSceneComponentMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSceneComponentMSFT.Ptr(segment);
    }

    public static XrSceneComponentMSFT clone(Arena arena, XrSceneComponentMSFT src) {
        XrSceneComponentMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrSceneComponentTypeMSFT.class) int componentType() {
        return segment.get(LAYOUT$componentType, OFFSET$componentType);
    }

    public XrSceneComponentMSFT componentType(@EnumType(XrSceneComponentTypeMSFT.class) int value) {
        segment.set(LAYOUT$componentType, OFFSET$componentType, value);
        return this;
    }

    public @NotNull XrUuidMSFT id() {
        return new XrUuidMSFT(segment.asSlice(OFFSET$id, LAYOUT$id));
    }

    public XrSceneComponentMSFT id(@NotNull XrUuidMSFT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$id, SIZE$id);
        return this;
    }

    public XrSceneComponentMSFT id(Consumer<@NotNull XrUuidMSFT> consumer) {
        consumer.accept(id());
        return this;
    }

    public @NotNull XrUuidMSFT parentId() {
        return new XrUuidMSFT(segment.asSlice(OFFSET$parentId, LAYOUT$parentId));
    }

    public XrSceneComponentMSFT parentId(@NotNull XrUuidMSFT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$parentId, SIZE$parentId);
        return this;
    }

    public XrSceneComponentMSFT parentId(Consumer<@NotNull XrUuidMSFT> consumer) {
        consumer.accept(parentId());
        return this;
    }

    public @NativeType("XrTime") long updateTime() {
        return segment.get(LAYOUT$updateTime, OFFSET$updateTime);
    }

    public XrSceneComponentMSFT updateTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$updateTime, OFFSET$updateTime, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("componentType"),
        XrUuidMSFT.LAYOUT.withName("id"),
        XrUuidMSFT.LAYOUT.withName("parentId"),
        ValueLayout.JAVA_LONG.withName("updateTime")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$componentType = PathElement.groupElement("componentType");
    public static final PathElement PATH$id = PathElement.groupElement("id");
    public static final PathElement PATH$parentId = PathElement.groupElement("parentId");
    public static final PathElement PATH$updateTime = PathElement.groupElement("updateTime");

    public static final OfInt LAYOUT$componentType = (OfInt) LAYOUT.select(PATH$componentType);
    public static final StructLayout LAYOUT$id = (StructLayout) LAYOUT.select(PATH$id);
    public static final StructLayout LAYOUT$parentId = (StructLayout) LAYOUT.select(PATH$parentId);
    public static final OfLong LAYOUT$updateTime = (OfLong) LAYOUT.select(PATH$updateTime);

    public static final long SIZE$componentType = LAYOUT$componentType.byteSize();
    public static final long SIZE$id = LAYOUT$id.byteSize();
    public static final long SIZE$parentId = LAYOUT$parentId.byteSize();
    public static final long SIZE$updateTime = LAYOUT$updateTime.byteSize();

    public static final long OFFSET$componentType = LAYOUT.byteOffset(PATH$componentType);
    public static final long OFFSET$id = LAYOUT.byteOffset(PATH$id);
    public static final long OFFSET$parentId = LAYOUT.byteOffset(PATH$parentId);
    public static final long OFFSET$updateTime = LAYOUT.byteOffset(PATH$updateTime);
}

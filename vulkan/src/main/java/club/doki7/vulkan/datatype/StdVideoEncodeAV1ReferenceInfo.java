package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoEncodeAV1ReferenceInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeAV1ReferenceInfo {
///     StdVideoEncodeAV1ReferenceInfoFlags flags; // @link substring="StdVideoEncodeAV1ReferenceInfoFlags" target="StdVideoEncodeAV1ReferenceInfoFlags" @link substring="flags" target="#flags"
///     uint32_t RefFrameId; // @link substring="RefFrameId" target="#RefFrameId"
///     StdVideoAV1FrameType frame_type; // @link substring="StdVideoAV1FrameType" target="StdVideoAV1FrameType" @link substring="frame_type" target="#frame_type"
///     uint8_t OrderHint; // @link substring="OrderHint" target="#OrderHint"
///     uint8_t[3] reserved1;
///     StdVideoEncodeAV1ExtensionHeader const* pExtensionHeader; // @link substring="StdVideoEncodeAV1ExtensionHeader" target="StdVideoEncodeAV1ExtensionHeader" @link substring="pExtensionHeader" target="#pExtensionHeader"
/// } StdVideoEncodeAV1ReferenceInfo;
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
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoEncodeAV1ReferenceInfo(@NotNull MemorySegment segment) implements IStdVideoEncodeAV1ReferenceInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeAV1ReferenceInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeAV1ReferenceInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeAV1ReferenceInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeAV1ReferenceInfo, Iterable<StdVideoEncodeAV1ReferenceInfo> {
        public long size() {
            return segment.byteSize() / StdVideoEncodeAV1ReferenceInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeAV1ReferenceInfo at(long index) {
            return new StdVideoEncodeAV1ReferenceInfo(segment.asSlice(index * StdVideoEncodeAV1ReferenceInfo.BYTES, StdVideoEncodeAV1ReferenceInfo.BYTES));
        }

        public void write(long index, @NotNull StdVideoEncodeAV1ReferenceInfo value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeAV1ReferenceInfo.BYTES, StdVideoEncodeAV1ReferenceInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * StdVideoEncodeAV1ReferenceInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoEncodeAV1ReferenceInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoEncodeAV1ReferenceInfo.BYTES,
                (end - start) * StdVideoEncodeAV1ReferenceInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoEncodeAV1ReferenceInfo.BYTES));
        }

        public StdVideoEncodeAV1ReferenceInfo[] toArray() {
            StdVideoEncodeAV1ReferenceInfo[] ret = new StdVideoEncodeAV1ReferenceInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<StdVideoEncodeAV1ReferenceInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= StdVideoEncodeAV1ReferenceInfo.BYTES;
            }

            @Override
            public StdVideoEncodeAV1ReferenceInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                StdVideoEncodeAV1ReferenceInfo ret = new StdVideoEncodeAV1ReferenceInfo(segment.asSlice(0, StdVideoEncodeAV1ReferenceInfo.BYTES));
                segment = segment.asSlice(StdVideoEncodeAV1ReferenceInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static StdVideoEncodeAV1ReferenceInfo allocate(Arena arena) {
        return new StdVideoEncodeAV1ReferenceInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1ReferenceInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoEncodeAV1ReferenceInfo.Ptr(segment);
    }

    public static StdVideoEncodeAV1ReferenceInfo clone(Arena arena, StdVideoEncodeAV1ReferenceInfo src) {
        StdVideoEncodeAV1ReferenceInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull StdVideoEncodeAV1ReferenceInfoFlags flags() {
        return new StdVideoEncodeAV1ReferenceInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoEncodeAV1ReferenceInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @Unsigned int RefFrameId() {
        return segment.get(LAYOUT$RefFrameId, OFFSET$RefFrameId);
    }

    public void RefFrameId(@Unsigned int value) {
        segment.set(LAYOUT$RefFrameId, OFFSET$RefFrameId, value);
    }

    public @EnumType(StdVideoAV1FrameType.class) int frame_type() {
        return segment.get(LAYOUT$frame_type, OFFSET$frame_type);
    }

    public void frame_type(@EnumType(StdVideoAV1FrameType.class) int value) {
        segment.set(LAYOUT$frame_type, OFFSET$frame_type, value);
    }

    public @Unsigned byte OrderHint() {
        return segment.get(LAYOUT$OrderHint, OFFSET$OrderHint);
    }

    public void OrderHint(@Unsigned byte value) {
        segment.set(LAYOUT$OrderHint, OFFSET$OrderHint, value);
    }


    public void pExtensionHeader(@Nullable IStdVideoEncodeAV1ExtensionHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pExtensionHeaderRaw(s);
    }

    @Unsafe public @Nullable StdVideoEncodeAV1ExtensionHeader.Ptr pExtensionHeader(int assumedCount) {
        MemorySegment s = pExtensionHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeAV1ExtensionHeader.BYTES);
        return new StdVideoEncodeAV1ExtensionHeader.Ptr(s);
    }

    public @Nullable StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
        MemorySegment s = pExtensionHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeAV1ExtensionHeader(s);
    }

    public @Pointer(target=StdVideoEncodeAV1ExtensionHeader.class) MemorySegment pExtensionHeaderRaw() {
        return segment.get(LAYOUT$pExtensionHeader, OFFSET$pExtensionHeader);
    }

    public void pExtensionHeaderRaw(@Pointer(target=StdVideoEncodeAV1ExtensionHeader.class) MemorySegment value) {
        segment.set(LAYOUT$pExtensionHeader, OFFSET$pExtensionHeader, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeAV1ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("RefFrameId"),
        ValueLayout.JAVA_INT.withName("frame_type"),
        ValueLayout.JAVA_BYTE.withName("OrderHint"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_BYTE).withName("reserved1"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeAV1ExtensionHeader.LAYOUT).withName("pExtensionHeader")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$RefFrameId = PathElement.groupElement("RefFrameId");
    public static final PathElement PATH$frame_type = PathElement.groupElement("frame_type");
    public static final PathElement PATH$OrderHint = PathElement.groupElement("OrderHint");
    public static final PathElement PATH$pExtensionHeader = PathElement.groupElement("pExtensionHeader");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$RefFrameId = (OfInt) LAYOUT.select(PATH$RefFrameId);
    public static final OfInt LAYOUT$frame_type = (OfInt) LAYOUT.select(PATH$frame_type);
    public static final OfByte LAYOUT$OrderHint = (OfByte) LAYOUT.select(PATH$OrderHint);
    public static final AddressLayout LAYOUT$pExtensionHeader = (AddressLayout) LAYOUT.select(PATH$pExtensionHeader);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$RefFrameId = LAYOUT$RefFrameId.byteSize();
    public static final long SIZE$frame_type = LAYOUT$frame_type.byteSize();
    public static final long SIZE$OrderHint = LAYOUT$OrderHint.byteSize();
    public static final long SIZE$pExtensionHeader = LAYOUT$pExtensionHeader.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$RefFrameId = LAYOUT.byteOffset(PATH$RefFrameId);
    public static final long OFFSET$frame_type = LAYOUT.byteOffset(PATH$frame_type);
    public static final long OFFSET$OrderHint = LAYOUT.byteOffset(PATH$OrderHint);
    public static final long OFFSET$pExtensionHeader = LAYOUT.byteOffset(PATH$pExtensionHeader);
}

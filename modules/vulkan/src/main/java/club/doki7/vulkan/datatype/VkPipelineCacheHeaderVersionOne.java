package club.doki7.vulkan.datatype;

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
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCacheHeaderVersionOne.html"><code>VkPipelineCacheHeaderVersionOne</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineCacheHeaderVersionOne {
///     uint32_t headerSize; // @link substring="headerSize" target="#headerSize"
///     VkPipelineCacheHeaderVersion headerVersion; // @link substring="VkPipelineCacheHeaderVersion" target="VkPipelineCacheHeaderVersion" @link substring="headerVersion" target="#headerVersion"
///     uint32_t vendorID; // @link substring="vendorID" target="#vendorID"
///     uint32_t deviceID; // @link substring="deviceID" target="#deviceID"
///     uint8_t[VK_UUID_SIZE] pipelineCacheUUID; // @link substring="pipelineCacheUUID" target="#pipelineCacheUUID"
/// } VkPipelineCacheHeaderVersionOne;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCacheHeaderVersionOne.html"><code>VkPipelineCacheHeaderVersionOne</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineCacheHeaderVersionOne(@NotNull MemorySegment segment) implements IVkPipelineCacheHeaderVersionOne {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCacheHeaderVersionOne.html"><code>VkPipelineCacheHeaderVersionOne</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPipelineCacheHeaderVersionOne}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPipelineCacheHeaderVersionOne to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPipelineCacheHeaderVersionOne.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPipelineCacheHeaderVersionOne, Iterable<VkPipelineCacheHeaderVersionOne> {
        public long size() {
            return segment.byteSize() / VkPipelineCacheHeaderVersionOne.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPipelineCacheHeaderVersionOne at(long index) {
            return new VkPipelineCacheHeaderVersionOne(segment.asSlice(index * VkPipelineCacheHeaderVersionOne.BYTES, VkPipelineCacheHeaderVersionOne.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull VkPipelineCacheHeaderVersionOne> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull VkPipelineCacheHeaderVersionOne value) {
            MemorySegment s = segment.asSlice(index * VkPipelineCacheHeaderVersionOne.BYTES, VkPipelineCacheHeaderVersionOne.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkPipelineCacheHeaderVersionOne.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPipelineCacheHeaderVersionOne.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPipelineCacheHeaderVersionOne.BYTES,
                (end - start) * VkPipelineCacheHeaderVersionOne.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPipelineCacheHeaderVersionOne.BYTES));
        }

        public VkPipelineCacheHeaderVersionOne[] toArray() {
            VkPipelineCacheHeaderVersionOne[] ret = new VkPipelineCacheHeaderVersionOne[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkPipelineCacheHeaderVersionOne> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkPipelineCacheHeaderVersionOne> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkPipelineCacheHeaderVersionOne.BYTES;
            }

            @Override
            public VkPipelineCacheHeaderVersionOne next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkPipelineCacheHeaderVersionOne ret = new VkPipelineCacheHeaderVersionOne(segment.asSlice(0, VkPipelineCacheHeaderVersionOne.BYTES));
                segment = segment.asSlice(VkPipelineCacheHeaderVersionOne.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkPipelineCacheHeaderVersionOne allocate(Arena arena) {
        return new VkPipelineCacheHeaderVersionOne(arena.allocate(LAYOUT));
    }

    public static VkPipelineCacheHeaderVersionOne.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkPipelineCacheHeaderVersionOne.Ptr(segment);
    }

    public static VkPipelineCacheHeaderVersionOne clone(Arena arena, VkPipelineCacheHeaderVersionOne src) {
        VkPipelineCacheHeaderVersionOne ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int headerSize() {
        return segment.get(LAYOUT$headerSize, OFFSET$headerSize);
    }

    public VkPipelineCacheHeaderVersionOne headerSize(@Unsigned int value) {
        segment.set(LAYOUT$headerSize, OFFSET$headerSize, value);
        return this;
    }

    public @EnumType(VkPipelineCacheHeaderVersion.class) int headerVersion() {
        return segment.get(LAYOUT$headerVersion, OFFSET$headerVersion);
    }

    public VkPipelineCacheHeaderVersionOne headerVersion(@EnumType(VkPipelineCacheHeaderVersion.class) int value) {
        segment.set(LAYOUT$headerVersion, OFFSET$headerVersion, value);
        return this;
    }

    public @Unsigned int vendorID() {
        return segment.get(LAYOUT$vendorID, OFFSET$vendorID);
    }

    public VkPipelineCacheHeaderVersionOne vendorID(@Unsigned int value) {
        segment.set(LAYOUT$vendorID, OFFSET$vendorID, value);
        return this;
    }

    public @Unsigned int deviceID() {
        return segment.get(LAYOUT$deviceID, OFFSET$deviceID);
    }

    public VkPipelineCacheHeaderVersionOne deviceID(@Unsigned int value) {
        segment.set(LAYOUT$deviceID, OFFSET$deviceID, value);
        return this;
    }

    public @Unsigned BytePtr pipelineCacheUUID() {
        return new BytePtr(pipelineCacheUUIDRaw());
    }

    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(@NotNull Consumer<BytePtr> consumer) {
        @Unsigned BytePtr ptr = pipelineCacheUUID();
        consumer.accept(ptr);
        return this;
    }

    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(@Unsigned BytePtr value) {
        MemorySegment s = pipelineCacheUUIDRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment pipelineCacheUUIDRaw() {
        return segment.asSlice(OFFSET$pipelineCacheUUID, SIZE$pipelineCacheUUID);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        MemoryLayout.sequenceLayout(UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$headerSize = PathElement.groupElement("headerSize");
    public static final PathElement PATH$headerVersion = PathElement.groupElement("headerVersion");
    public static final PathElement PATH$vendorID = PathElement.groupElement("vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("deviceID");
    public static final PathElement PATH$pipelineCacheUUID = PathElement.groupElement("pipelineCacheUUID");

    public static final OfInt LAYOUT$headerSize = (OfInt) LAYOUT.select(PATH$headerSize);
    public static final OfInt LAYOUT$headerVersion = (OfInt) LAYOUT.select(PATH$headerVersion);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final SequenceLayout LAYOUT$pipelineCacheUUID = (SequenceLayout) LAYOUT.select(PATH$pipelineCacheUUID);

    public static final long SIZE$headerSize = LAYOUT$headerSize.byteSize();
    public static final long SIZE$headerVersion = LAYOUT$headerVersion.byteSize();
    public static final long SIZE$vendorID = LAYOUT$vendorID.byteSize();
    public static final long SIZE$deviceID = LAYOUT$deviceID.byteSize();
    public static final long SIZE$pipelineCacheUUID = LAYOUT$pipelineCacheUUID.byteSize();

    public static final long OFFSET$headerSize = LAYOUT.byteOffset(PATH$headerSize);
    public static final long OFFSET$headerVersion = LAYOUT.byteOffset(PATH$headerVersion);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$pipelineCacheUUID = LAYOUT.byteOffset(PATH$pipelineCacheUUID);
}

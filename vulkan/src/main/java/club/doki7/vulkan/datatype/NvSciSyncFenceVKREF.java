package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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

/// Represents a pointer to a {@code NvSciSyncFence} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct NvSciSyncFence {
///     uint64_t[6] payload; // @link substring="payload" target="#payload"
/// } NvSciSyncFence;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record NvSciSyncFenceVKREF(@NotNull MemorySegment segment) implements INvSciSyncFenceVKREF {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link NvSciSyncFenceVKREF}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// INvSciSyncFenceVKREF to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code NvSciSyncFenceVKREF.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements INvSciSyncFenceVKREF {
        public long size() {
            return segment.byteSize() / NvSciSyncFenceVKREF.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull NvSciSyncFenceVKREF at(long index) {
            return new NvSciSyncFenceVKREF(segment.asSlice(index * NvSciSyncFenceVKREF.BYTES, NvSciSyncFenceVKREF.BYTES));
        }
        public void write(long index, @NotNull NvSciSyncFenceVKREF value) {
            MemorySegment s = segment.asSlice(index * NvSciSyncFenceVKREF.BYTES, NvSciSyncFenceVKREF.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static NvSciSyncFenceVKREF allocate(Arena arena) {
        return new NvSciSyncFenceVKREF(arena.allocate(LAYOUT));
    }

    public static NvSciSyncFenceVKREF.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        NvSciSyncFenceVKREF.Ptr ret = new NvSciSyncFenceVKREF.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static NvSciSyncFenceVKREF clone(Arena arena, NvSciSyncFenceVKREF src) {
        NvSciSyncFenceVKREF ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned LongPtr payload() {
        return new LongPtr(payloadRaw());
    }

    public void payload(@unsigned LongPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$payload, SIZE$payload);
    }

    public MemorySegment payloadRaw() {
        return segment.asSlice(OFFSET$payload, SIZE$payload);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_LONG).withName("payload")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$payload = PathElement.groupElement("payload");

    public static final SequenceLayout LAYOUT$payload = (SequenceLayout) LAYOUT.select(PATH$payload);

    public static final long SIZE$payload = LAYOUT$payload.byteSize();

    public static final long OFFSET$payload = LAYOUT.byteOffset(PATH$payload);
}

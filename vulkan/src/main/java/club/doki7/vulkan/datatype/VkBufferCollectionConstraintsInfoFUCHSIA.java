package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferCollectionConstraintsInfoFUCHSIA.html"><code>VkBufferCollectionConstraintsInfoFUCHSIA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBufferCollectionConstraintsInfoFUCHSIA {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t minBufferCount; // @link substring="minBufferCount" target="#minBufferCount"
///     uint32_t maxBufferCount; // @link substring="maxBufferCount" target="#maxBufferCount"
///     uint32_t minBufferCountForCamping; // @link substring="minBufferCountForCamping" target="#minBufferCountForCamping"
///     uint32_t minBufferCountForDedicatedSlack; // @link substring="minBufferCountForDedicatedSlack" target="#minBufferCountForDedicatedSlack"
///     uint32_t minBufferCountForSharedSlack; // @link substring="minBufferCountForSharedSlack" target="#minBufferCountForSharedSlack"
/// } VkBufferCollectionConstraintsInfoFUCHSIA;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BUFFER_COLLECTION_CONSTRAINTS_INFO_FUCHSIA`
///
/// The {@code allocate} ({@link VkBufferCollectionConstraintsInfoFUCHSIA#allocate(Arena)}, {@link VkBufferCollectionConstraintsInfoFUCHSIA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkBufferCollectionConstraintsInfoFUCHSIA#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferCollectionConstraintsInfoFUCHSIA.html"><code>VkBufferCollectionConstraintsInfoFUCHSIA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBufferCollectionConstraintsInfoFUCHSIA(@NotNull MemorySegment segment) implements IVkBufferCollectionConstraintsInfoFUCHSIA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferCollectionConstraintsInfoFUCHSIA.html"><code>VkBufferCollectionConstraintsInfoFUCHSIA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkBufferCollectionConstraintsInfoFUCHSIA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkBufferCollectionConstraintsInfoFUCHSIA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkBufferCollectionConstraintsInfoFUCHSIA {
        public long size() {
            return segment.byteSize() / VkBufferCollectionConstraintsInfoFUCHSIA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkBufferCollectionConstraintsInfoFUCHSIA at(long index) {
            return new VkBufferCollectionConstraintsInfoFUCHSIA(segment.asSlice(index * VkBufferCollectionConstraintsInfoFUCHSIA.BYTES, VkBufferCollectionConstraintsInfoFUCHSIA.BYTES));
        }

        public void write(long index, @NotNull VkBufferCollectionConstraintsInfoFUCHSIA value) {
            MemorySegment s = segment.asSlice(index * VkBufferCollectionConstraintsInfoFUCHSIA.BYTES, VkBufferCollectionConstraintsInfoFUCHSIA.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkBufferCollectionConstraintsInfoFUCHSIA.BYTES, VkBufferCollectionConstraintsInfoFUCHSIA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkBufferCollectionConstraintsInfoFUCHSIA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkBufferCollectionConstraintsInfoFUCHSIA.BYTES,
                (end - start) * VkBufferCollectionConstraintsInfoFUCHSIA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkBufferCollectionConstraintsInfoFUCHSIA.BYTES));
        }

        public VkBufferCollectionConstraintsInfoFUCHSIA[] toArray() {
            VkBufferCollectionConstraintsInfoFUCHSIA[] ret = new VkBufferCollectionConstraintsInfoFUCHSIA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkBufferCollectionConstraintsInfoFUCHSIA allocate(Arena arena) {
        VkBufferCollectionConstraintsInfoFUCHSIA ret = new VkBufferCollectionConstraintsInfoFUCHSIA(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BUFFER_COLLECTION_CONSTRAINTS_INFO_FUCHSIA);
        return ret;
    }

    public static VkBufferCollectionConstraintsInfoFUCHSIA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferCollectionConstraintsInfoFUCHSIA.Ptr ret = new VkBufferCollectionConstraintsInfoFUCHSIA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.BUFFER_COLLECTION_CONSTRAINTS_INFO_FUCHSIA);
        }
        return ret;
    }

    public static VkBufferCollectionConstraintsInfoFUCHSIA clone(Arena arena, VkBufferCollectionConstraintsInfoFUCHSIA src) {
        VkBufferCollectionConstraintsInfoFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BUFFER_COLLECTION_CONSTRAINTS_INFO_FUCHSIA);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int minBufferCount() {
        return segment.get(LAYOUT$minBufferCount, OFFSET$minBufferCount);
    }

    public void minBufferCount(@unsigned int value) {
        segment.set(LAYOUT$minBufferCount, OFFSET$minBufferCount, value);
    }

    public @unsigned int maxBufferCount() {
        return segment.get(LAYOUT$maxBufferCount, OFFSET$maxBufferCount);
    }

    public void maxBufferCount(@unsigned int value) {
        segment.set(LAYOUT$maxBufferCount, OFFSET$maxBufferCount, value);
    }

    public @unsigned int minBufferCountForCamping() {
        return segment.get(LAYOUT$minBufferCountForCamping, OFFSET$minBufferCountForCamping);
    }

    public void minBufferCountForCamping(@unsigned int value) {
        segment.set(LAYOUT$minBufferCountForCamping, OFFSET$minBufferCountForCamping, value);
    }

    public @unsigned int minBufferCountForDedicatedSlack() {
        return segment.get(LAYOUT$minBufferCountForDedicatedSlack, OFFSET$minBufferCountForDedicatedSlack);
    }

    public void minBufferCountForDedicatedSlack(@unsigned int value) {
        segment.set(LAYOUT$minBufferCountForDedicatedSlack, OFFSET$minBufferCountForDedicatedSlack, value);
    }

    public @unsigned int minBufferCountForSharedSlack() {
        return segment.get(LAYOUT$minBufferCountForSharedSlack, OFFSET$minBufferCountForSharedSlack);
    }

    public void minBufferCountForSharedSlack(@unsigned int value) {
        segment.set(LAYOUT$minBufferCountForSharedSlack, OFFSET$minBufferCountForSharedSlack, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minBufferCount"),
        ValueLayout.JAVA_INT.withName("maxBufferCount"),
        ValueLayout.JAVA_INT.withName("minBufferCountForCamping"),
        ValueLayout.JAVA_INT.withName("minBufferCountForDedicatedSlack"),
        ValueLayout.JAVA_INT.withName("minBufferCountForSharedSlack")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$minBufferCount = PathElement.groupElement("minBufferCount");
    public static final PathElement PATH$maxBufferCount = PathElement.groupElement("maxBufferCount");
    public static final PathElement PATH$minBufferCountForCamping = PathElement.groupElement("minBufferCountForCamping");
    public static final PathElement PATH$minBufferCountForDedicatedSlack = PathElement.groupElement("minBufferCountForDedicatedSlack");
    public static final PathElement PATH$minBufferCountForSharedSlack = PathElement.groupElement("minBufferCountForSharedSlack");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$minBufferCount = (OfInt) LAYOUT.select(PATH$minBufferCount);
    public static final OfInt LAYOUT$maxBufferCount = (OfInt) LAYOUT.select(PATH$maxBufferCount);
    public static final OfInt LAYOUT$minBufferCountForCamping = (OfInt) LAYOUT.select(PATH$minBufferCountForCamping);
    public static final OfInt LAYOUT$minBufferCountForDedicatedSlack = (OfInt) LAYOUT.select(PATH$minBufferCountForDedicatedSlack);
    public static final OfInt LAYOUT$minBufferCountForSharedSlack = (OfInt) LAYOUT.select(PATH$minBufferCountForSharedSlack);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minBufferCount = LAYOUT$minBufferCount.byteSize();
    public static final long SIZE$maxBufferCount = LAYOUT$maxBufferCount.byteSize();
    public static final long SIZE$minBufferCountForCamping = LAYOUT$minBufferCountForCamping.byteSize();
    public static final long SIZE$minBufferCountForDedicatedSlack = LAYOUT$minBufferCountForDedicatedSlack.byteSize();
    public static final long SIZE$minBufferCountForSharedSlack = LAYOUT$minBufferCountForSharedSlack.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minBufferCount = LAYOUT.byteOffset(PATH$minBufferCount);
    public static final long OFFSET$maxBufferCount = LAYOUT.byteOffset(PATH$maxBufferCount);
    public static final long OFFSET$minBufferCountForCamping = LAYOUT.byteOffset(PATH$minBufferCountForCamping);
    public static final long OFFSET$minBufferCountForDedicatedSlack = LAYOUT.byteOffset(PATH$minBufferCountForDedicatedSlack);
    public static final long OFFSET$minBufferCountForSharedSlack = LAYOUT.byteOffset(PATH$minBufferCountForSharedSlack);
}

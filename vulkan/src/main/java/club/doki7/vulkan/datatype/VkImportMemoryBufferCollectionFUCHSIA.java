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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMemoryBufferCollectionFUCHSIA.html"><code>VkImportMemoryBufferCollectionFUCHSIA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImportMemoryBufferCollectionFUCHSIA {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBufferCollectionFUCHSIA collection; // @link substring="VkBufferCollectionFUCHSIA" target="VkBufferCollectionFUCHSIA" @link substring="collection" target="#collection"
///     uint32_t index; // @link substring="index" target="#index"
/// } VkImportMemoryBufferCollectionFUCHSIA;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMPORT_MEMORY_BUFFER_COLLECTION_FUCHSIA`
///
/// The {@code allocate} ({@link VkImportMemoryBufferCollectionFUCHSIA#allocate(Arena)}, {@link VkImportMemoryBufferCollectionFUCHSIA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImportMemoryBufferCollectionFUCHSIA#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMemoryBufferCollectionFUCHSIA.html"><code>VkImportMemoryBufferCollectionFUCHSIA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImportMemoryBufferCollectionFUCHSIA(@NotNull MemorySegment segment) implements IVkImportMemoryBufferCollectionFUCHSIA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMemoryBufferCollectionFUCHSIA.html"><code>VkImportMemoryBufferCollectionFUCHSIA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkImportMemoryBufferCollectionFUCHSIA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkImportMemoryBufferCollectionFUCHSIA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkImportMemoryBufferCollectionFUCHSIA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkImportMemoryBufferCollectionFUCHSIA {
        public long size() {
            return segment.byteSize() / VkImportMemoryBufferCollectionFUCHSIA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkImportMemoryBufferCollectionFUCHSIA at(long index) {
            return new VkImportMemoryBufferCollectionFUCHSIA(segment.asSlice(index * VkImportMemoryBufferCollectionFUCHSIA.BYTES, VkImportMemoryBufferCollectionFUCHSIA.BYTES));
        }

        public void write(long index, @NotNull VkImportMemoryBufferCollectionFUCHSIA value) {
            MemorySegment s = segment.asSlice(index * VkImportMemoryBufferCollectionFUCHSIA.BYTES, VkImportMemoryBufferCollectionFUCHSIA.BYTES);
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
            return new Ptr(segment.asSlice(index * VkImportMemoryBufferCollectionFUCHSIA.BYTES, VkImportMemoryBufferCollectionFUCHSIA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkImportMemoryBufferCollectionFUCHSIA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkImportMemoryBufferCollectionFUCHSIA.BYTES,
                (end - start) * VkImportMemoryBufferCollectionFUCHSIA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkImportMemoryBufferCollectionFUCHSIA.BYTES));
        }

        public VkImportMemoryBufferCollectionFUCHSIA[] toArray() {
            VkImportMemoryBufferCollectionFUCHSIA[] ret = new VkImportMemoryBufferCollectionFUCHSIA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkImportMemoryBufferCollectionFUCHSIA allocate(Arena arena) {
        VkImportMemoryBufferCollectionFUCHSIA ret = new VkImportMemoryBufferCollectionFUCHSIA(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMPORT_MEMORY_BUFFER_COLLECTION_FUCHSIA);
        return ret;
    }

    public static VkImportMemoryBufferCollectionFUCHSIA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportMemoryBufferCollectionFUCHSIA.Ptr ret = new VkImportMemoryBufferCollectionFUCHSIA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.IMPORT_MEMORY_BUFFER_COLLECTION_FUCHSIA);
        }
        return ret;
    }

    public static VkImportMemoryBufferCollectionFUCHSIA clone(Arena arena, VkImportMemoryBufferCollectionFUCHSIA src) {
        VkImportMemoryBufferCollectionFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMPORT_MEMORY_BUFFER_COLLECTION_FUCHSIA);
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

    public @Nullable VkBufferCollectionFUCHSIA collection() {
        MemorySegment s = segment.asSlice(OFFSET$collection, SIZE$collection);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBufferCollectionFUCHSIA(s);
    }

    public void collection(@Nullable VkBufferCollectionFUCHSIA value) {
        segment.set(LAYOUT$collection, OFFSET$collection, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int index() {
        return segment.get(LAYOUT$index, OFFSET$index);
    }

    public void index(@unsigned int value) {
        segment.set(LAYOUT$index, OFFSET$index, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("collection"),
        ValueLayout.JAVA_INT.withName("index")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$collection = PathElement.groupElement("collection");
    public static final PathElement PATH$index = PathElement.groupElement("index");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$collection = (AddressLayout) LAYOUT.select(PATH$collection);
    public static final OfInt LAYOUT$index = (OfInt) LAYOUT.select(PATH$index);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$collection = LAYOUT$collection.byteSize();
    public static final long SIZE$index = LAYOUT$index.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$collection = LAYOUT.byteOffset(PATH$collection);
    public static final long OFFSET$index = LAYOUT.byteOffset(PATH$index);
}

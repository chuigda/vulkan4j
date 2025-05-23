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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkValidationCacheCreateInfoEXT.html"><code>VkValidationCacheCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkValidationCacheCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkValidationCacheCreateFlagsEXT flags; // optional // @link substring="VkValidationCacheCreateFlagsEXT" target="VkValidationCacheCreateFlagsEXT" @link substring="flags" target="#flags"
///     size_t initialDataSize; // optional // @link substring="initialDataSize" target="#initialDataSize"
///     void const* pInitialData; // @link substring="pInitialData" target="#pInitialData"
/// } VkValidationCacheCreateInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkValidationCacheCreateInfoEXT#allocate(Arena)}, {@link VkValidationCacheCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkValidationCacheCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkValidationCacheCreateInfoEXT.html"><code>VkValidationCacheCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkValidationCacheCreateInfoEXT(@NotNull MemorySegment segment) implements IVkValidationCacheCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkValidationCacheCreateInfoEXT.html"><code>VkValidationCacheCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkValidationCacheCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkValidationCacheCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkValidationCacheCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkValidationCacheCreateInfoEXT {
        public long size() {
            return segment.byteSize() / VkValidationCacheCreateInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkValidationCacheCreateInfoEXT at(long index) {
            return new VkValidationCacheCreateInfoEXT(segment.asSlice(index * VkValidationCacheCreateInfoEXT.BYTES, VkValidationCacheCreateInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkValidationCacheCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkValidationCacheCreateInfoEXT.BYTES, VkValidationCacheCreateInfoEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkValidationCacheCreateInfoEXT.BYTES, VkValidationCacheCreateInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkValidationCacheCreateInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkValidationCacheCreateInfoEXT.BYTES,
                (end - start) * VkValidationCacheCreateInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkValidationCacheCreateInfoEXT.BYTES));
        }

        public VkValidationCacheCreateInfoEXT[] toArray() {
            VkValidationCacheCreateInfoEXT[] ret = new VkValidationCacheCreateInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkValidationCacheCreateInfoEXT allocate(Arena arena) {
        VkValidationCacheCreateInfoEXT ret = new VkValidationCacheCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VALIDATION_CACHE_CREATE_INFO_EXT);
        return ret;
    }

    public static VkValidationCacheCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkValidationCacheCreateInfoEXT.Ptr ret = new VkValidationCacheCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VALIDATION_CACHE_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkValidationCacheCreateInfoEXT clone(Arena arena, VkValidationCacheCreateInfoEXT src) {
        VkValidationCacheCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VALIDATION_CACHE_CREATE_INFO_EXT);
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

    public @enumtype(VkValidationCacheCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkValidationCacheCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long initialDataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$initialDataSize);
    }

    public void initialDataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$initialDataSize, value);
    }

    public @pointer(comment="void*") MemorySegment pInitialData() {
        return segment.get(LAYOUT$pInitialData, OFFSET$pInitialData);
    }

    public void pInitialData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pInitialData, OFFSET$pInitialData, value);
    }

    public void pInitialData(@Nullable IPointer pointer) {
        pInitialData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        NativeLayout.C_SIZE_T.withName("initialDataSize"),
        ValueLayout.ADDRESS.withName("pInitialData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$initialDataSize = PathElement.groupElement("initialDataSize");
    public static final PathElement PATH$pInitialData = PathElement.groupElement("pInitialData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pInitialData = (AddressLayout) LAYOUT.select(PATH$pInitialData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$initialDataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pInitialData = LAYOUT$pInitialData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$initialDataSize = LAYOUT.byteOffset(PATH$initialDataSize);
    public static final long OFFSET$pInitialData = LAYOUT.byteOffset(PATH$pInitialData);
}

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderModuleValidationCacheCreateInfoEXT.html"><code>VkShaderModuleValidationCacheCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkShaderModuleValidationCacheCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkValidationCacheEXT validationCache; // @link substring="VkValidationCacheEXT" target="VkValidationCacheEXT" @link substring="validationCache" target="#validationCache"
/// } VkShaderModuleValidationCacheCreateInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkShaderModuleValidationCacheCreateInfoEXT#allocate(Arena)}, {@link VkShaderModuleValidationCacheCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkShaderModuleValidationCacheCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderModuleValidationCacheCreateInfoEXT.html"><code>VkShaderModuleValidationCacheCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkShaderModuleValidationCacheCreateInfoEXT(@NotNull MemorySegment segment) implements IVkShaderModuleValidationCacheCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderModuleValidationCacheCreateInfoEXT.html"><code>VkShaderModuleValidationCacheCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkShaderModuleValidationCacheCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkShaderModuleValidationCacheCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkShaderModuleValidationCacheCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkShaderModuleValidationCacheCreateInfoEXT, Iterable<VkShaderModuleValidationCacheCreateInfoEXT> {
        public long size() {
            return segment.byteSize() / VkShaderModuleValidationCacheCreateInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkShaderModuleValidationCacheCreateInfoEXT at(long index) {
            return new VkShaderModuleValidationCacheCreateInfoEXT(segment.asSlice(index * VkShaderModuleValidationCacheCreateInfoEXT.BYTES, VkShaderModuleValidationCacheCreateInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkShaderModuleValidationCacheCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkShaderModuleValidationCacheCreateInfoEXT.BYTES, VkShaderModuleValidationCacheCreateInfoEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkShaderModuleValidationCacheCreateInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkShaderModuleValidationCacheCreateInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkShaderModuleValidationCacheCreateInfoEXT.BYTES,
                (end - start) * VkShaderModuleValidationCacheCreateInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkShaderModuleValidationCacheCreateInfoEXT.BYTES));
        }

        public VkShaderModuleValidationCacheCreateInfoEXT[] toArray() {
            VkShaderModuleValidationCacheCreateInfoEXT[] ret = new VkShaderModuleValidationCacheCreateInfoEXT[(int) size()];
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
        public static final class Iter implements Iterator<VkShaderModuleValidationCacheCreateInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkShaderModuleValidationCacheCreateInfoEXT.BYTES;
            }

            @Override
            public VkShaderModuleValidationCacheCreateInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkShaderModuleValidationCacheCreateInfoEXT ret = new VkShaderModuleValidationCacheCreateInfoEXT(segment.asSlice(0, VkShaderModuleValidationCacheCreateInfoEXT.BYTES));
                segment = segment.asSlice(VkShaderModuleValidationCacheCreateInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkShaderModuleValidationCacheCreateInfoEXT allocate(Arena arena) {
        VkShaderModuleValidationCacheCreateInfoEXT ret = new VkShaderModuleValidationCacheCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT);
        return ret;
    }

    public static VkShaderModuleValidationCacheCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderModuleValidationCacheCreateInfoEXT.Ptr ret = new VkShaderModuleValidationCacheCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkShaderModuleValidationCacheCreateInfoEXT clone(Arena arena, VkShaderModuleValidationCacheCreateInfoEXT src) {
        VkShaderModuleValidationCacheCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkShaderModuleValidationCacheCreateInfoEXT sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkShaderModuleValidationCacheCreateInfoEXT pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable VkValidationCacheEXT validationCache() {
        MemorySegment s = segment.asSlice(OFFSET$validationCache, SIZE$validationCache);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkValidationCacheEXT(s);
    }

    public VkShaderModuleValidationCacheCreateInfoEXT validationCache(@Nullable VkValidationCacheEXT value) {
        segment.set(LAYOUT$validationCache, OFFSET$validationCache, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("validationCache")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$validationCache = PathElement.groupElement("validationCache");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$validationCache = (AddressLayout) LAYOUT.select(PATH$validationCache);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$validationCache = LAYOUT$validationCache.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$validationCache = LAYOUT.byteOffset(PATH$validationCache);
}

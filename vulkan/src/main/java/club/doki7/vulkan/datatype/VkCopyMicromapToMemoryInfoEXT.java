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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyMicromapToMemoryInfoEXT.html"><code>VkCopyMicromapToMemoryInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCopyMicromapToMemoryInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkMicromapEXT src; // @link substring="VkMicromapEXT" target="VkMicromapEXT" @link substring="src" target="#src"
///     VkDeviceOrHostAddressKHR dst; // @link substring="VkDeviceOrHostAddressKHR" target="VkDeviceOrHostAddressKHR" @link substring="dst" target="#dst"
///     VkCopyMicromapModeEXT mode; // @link substring="VkCopyMicromapModeEXT" target="VkCopyMicromapModeEXT" @link substring="mode" target="#mode"
/// } VkCopyMicromapToMemoryInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT`
///
/// The {@code allocate} ({@link VkCopyMicromapToMemoryInfoEXT#allocate(Arena)}, {@link VkCopyMicromapToMemoryInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkCopyMicromapToMemoryInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyMicromapToMemoryInfoEXT.html"><code>VkCopyMicromapToMemoryInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCopyMicromapToMemoryInfoEXT(@NotNull MemorySegment segment) implements IVkCopyMicromapToMemoryInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyMicromapToMemoryInfoEXT.html"><code>VkCopyMicromapToMemoryInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkCopyMicromapToMemoryInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkCopyMicromapToMemoryInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkCopyMicromapToMemoryInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkCopyMicromapToMemoryInfoEXT {
        public long size() {
            return segment.byteSize() / VkCopyMicromapToMemoryInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkCopyMicromapToMemoryInfoEXT at(long index) {
            return new VkCopyMicromapToMemoryInfoEXT(segment.asSlice(index * VkCopyMicromapToMemoryInfoEXT.BYTES, VkCopyMicromapToMemoryInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkCopyMicromapToMemoryInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkCopyMicromapToMemoryInfoEXT.BYTES, VkCopyMicromapToMemoryInfoEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkCopyMicromapToMemoryInfoEXT.BYTES, VkCopyMicromapToMemoryInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkCopyMicromapToMemoryInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkCopyMicromapToMemoryInfoEXT.BYTES,
                (end - start) * VkCopyMicromapToMemoryInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkCopyMicromapToMemoryInfoEXT.BYTES));
        }

        public VkCopyMicromapToMemoryInfoEXT[] toArray() {
            VkCopyMicromapToMemoryInfoEXT[] ret = new VkCopyMicromapToMemoryInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkCopyMicromapToMemoryInfoEXT allocate(Arena arena) {
        VkCopyMicromapToMemoryInfoEXT ret = new VkCopyMicromapToMemoryInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.COPY_MICROMAP_TO_MEMORY_INFO_EXT);
        return ret;
    }

    public static VkCopyMicromapToMemoryInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyMicromapToMemoryInfoEXT.Ptr ret = new VkCopyMicromapToMemoryInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.COPY_MICROMAP_TO_MEMORY_INFO_EXT);
        }
        return ret;
    }

    public static VkCopyMicromapToMemoryInfoEXT clone(Arena arena, VkCopyMicromapToMemoryInfoEXT src) {
        VkCopyMicromapToMemoryInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.COPY_MICROMAP_TO_MEMORY_INFO_EXT);
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

    public @Nullable VkMicromapEXT src() {
        MemorySegment s = segment.asSlice(OFFSET$src, SIZE$src);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkMicromapEXT(s);
    }

    public void src(@Nullable VkMicromapEXT value) {
        segment.set(LAYOUT$src, OFFSET$src, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @NotNull VkDeviceOrHostAddressKHR dst() {
        return new VkDeviceOrHostAddressKHR(segment.asSlice(OFFSET$dst, LAYOUT$dst));
    }

    public void dst(@NotNull VkDeviceOrHostAddressKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dst, SIZE$dst);
    }

    public @enumtype(VkCopyMicromapModeEXT.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkCopyMicromapModeEXT.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("src"),
        VkDeviceOrHostAddressKHR.LAYOUT.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$src = PathElement.groupElement("src");
    public static final PathElement PATH$dst = PathElement.groupElement("dst");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$src = (AddressLayout) LAYOUT.select(PATH$src);
    public static final StructLayout LAYOUT$dst = (StructLayout) LAYOUT.select(PATH$dst);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$src = LAYOUT$src.byteSize();
    public static final long SIZE$dst = LAYOUT$dst.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$src = LAYOUT.byteOffset(PATH$src);
    public static final long OFFSET$dst = LAYOUT.byteOffset(PATH$dst);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
}

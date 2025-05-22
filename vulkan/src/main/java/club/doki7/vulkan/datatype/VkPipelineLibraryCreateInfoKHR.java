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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineLibraryCreateInfoKHR.html"><code>VkPipelineLibraryCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineLibraryCreateInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t libraryCount; // optional // @link substring="libraryCount" target="#libraryCount"
///     VkPipeline const* pLibraries; // @link substring="VkPipeline" target="VkPipeline" @link substring="pLibraries" target="#pLibraries"
/// } VkPipelineLibraryCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link VkPipelineLibraryCreateInfoKHR#allocate(Arena)}, {@link VkPipelineLibraryCreateInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineLibraryCreateInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineLibraryCreateInfoKHR.html"><code>VkPipelineLibraryCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineLibraryCreateInfoKHR(@NotNull MemorySegment segment) implements IVkPipelineLibraryCreateInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineLibraryCreateInfoKHR.html"><code>VkPipelineLibraryCreateInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPipelineLibraryCreateInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPipelineLibraryCreateInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPipelineLibraryCreateInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPipelineLibraryCreateInfoKHR {
        public long size() {
            return segment.byteSize() / VkPipelineLibraryCreateInfoKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPipelineLibraryCreateInfoKHR at(long index) {
            return new VkPipelineLibraryCreateInfoKHR(segment.asSlice(index * VkPipelineLibraryCreateInfoKHR.BYTES, VkPipelineLibraryCreateInfoKHR.BYTES));
        }
        public void write(long index, @NotNull VkPipelineLibraryCreateInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkPipelineLibraryCreateInfoKHR.BYTES, VkPipelineLibraryCreateInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPipelineLibraryCreateInfoKHR allocate(Arena arena) {
        VkPipelineLibraryCreateInfoKHR ret = new VkPipelineLibraryCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_LIBRARY_CREATE_INFO_KHR);
        return ret;
    }

    public static VkPipelineLibraryCreateInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineLibraryCreateInfoKHR.Ptr ret = new VkPipelineLibraryCreateInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PIPELINE_LIBRARY_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkPipelineLibraryCreateInfoKHR clone(Arena arena, VkPipelineLibraryCreateInfoKHR src) {
        VkPipelineLibraryCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_LIBRARY_CREATE_INFO_KHR);
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

    public @unsigned int libraryCount() {
        return segment.get(LAYOUT$libraryCount, OFFSET$libraryCount);
    }

    public void libraryCount(@unsigned int value) {
        segment.set(LAYOUT$libraryCount, OFFSET$libraryCount, value);
    }

    /// Note: the returned {@link VkPipeline.Ptr} does not have correct {@link VkPipeline.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkPipeline.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkPipeline.Ptr pLibraries() {
        MemorySegment s = pLibrariesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipeline.Ptr(s);
    }

    public void pLibraries(@Nullable VkPipeline.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLibrariesRaw(s);
    }

    public @pointer(target=VkPipeline.class) MemorySegment pLibrariesRaw() {
        return segment.get(LAYOUT$pLibraries, OFFSET$pLibraries);
    }

    public void pLibrariesRaw(@pointer(target=VkPipeline.class) MemorySegment value) {
        segment.set(LAYOUT$pLibraries, OFFSET$pLibraries, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("libraryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pLibraries")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$libraryCount = PathElement.groupElement("libraryCount");
    public static final PathElement PATH$pLibraries = PathElement.groupElement("pLibraries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$libraryCount = (OfInt) LAYOUT.select(PATH$libraryCount);
    public static final AddressLayout LAYOUT$pLibraries = (AddressLayout) LAYOUT.select(PATH$pLibraries);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$libraryCount = LAYOUT$libraryCount.byteSize();
    public static final long SIZE$pLibraries = LAYOUT$pLibraries.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$libraryCount = LAYOUT.byteOffset(PATH$libraryCount);
    public static final long OFFSET$pLibraries = LAYOUT.byteOffset(PATH$pLibraries);
}

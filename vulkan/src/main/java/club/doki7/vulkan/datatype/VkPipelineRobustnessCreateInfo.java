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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRobustnessCreateInfo.html"><code>VkPipelineRobustnessCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineRobustnessCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineRobustnessBufferBehavior storageBuffers; // @link substring="VkPipelineRobustnessBufferBehavior" target="VkPipelineRobustnessBufferBehavior" @link substring="storageBuffers" target="#storageBuffers"
///     VkPipelineRobustnessBufferBehavior uniformBuffers; // @link substring="VkPipelineRobustnessBufferBehavior" target="VkPipelineRobustnessBufferBehavior" @link substring="uniformBuffers" target="#uniformBuffers"
///     VkPipelineRobustnessBufferBehavior vertexInputs; // @link substring="VkPipelineRobustnessBufferBehavior" target="VkPipelineRobustnessBufferBehavior" @link substring="vertexInputs" target="#vertexInputs"
///     VkPipelineRobustnessImageBehavior images; // @link substring="VkPipelineRobustnessImageBehavior" target="VkPipelineRobustnessImageBehavior" @link substring="images" target="#images"
/// } VkPipelineRobustnessCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO`
///
/// The {@code allocate} ({@link VkPipelineRobustnessCreateInfo#allocate(Arena)}, {@link VkPipelineRobustnessCreateInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineRobustnessCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRobustnessCreateInfo.html"><code>VkPipelineRobustnessCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineRobustnessCreateInfo(@NotNull MemorySegment segment) implements IVkPipelineRobustnessCreateInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRobustnessCreateInfo.html"><code>VkPipelineRobustnessCreateInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPipelineRobustnessCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPipelineRobustnessCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPipelineRobustnessCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPipelineRobustnessCreateInfo {
        public long size() {
            return segment.byteSize() / VkPipelineRobustnessCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPipelineRobustnessCreateInfo at(long index) {
            return new VkPipelineRobustnessCreateInfo(segment.asSlice(index * VkPipelineRobustnessCreateInfo.BYTES, VkPipelineRobustnessCreateInfo.BYTES));
        }

        public void write(long index, @NotNull VkPipelineRobustnessCreateInfo value) {
            MemorySegment s = segment.asSlice(index * VkPipelineRobustnessCreateInfo.BYTES, VkPipelineRobustnessCreateInfo.BYTES);
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
            return new Ptr(segment.asSlice(index * VkPipelineRobustnessCreateInfo.BYTES, VkPipelineRobustnessCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPipelineRobustnessCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPipelineRobustnessCreateInfo.BYTES,
                (end - start) * VkPipelineRobustnessCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPipelineRobustnessCreateInfo.BYTES));
        }
    }

    public static VkPipelineRobustnessCreateInfo allocate(Arena arena) {
        VkPipelineRobustnessCreateInfo ret = new VkPipelineRobustnessCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_ROBUSTNESS_CREATE_INFO);
        return ret;
    }

    public static VkPipelineRobustnessCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRobustnessCreateInfo.Ptr ret = new VkPipelineRobustnessCreateInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PIPELINE_ROBUSTNESS_CREATE_INFO);
        }
        return ret;
    }

    public static VkPipelineRobustnessCreateInfo clone(Arena arena, VkPipelineRobustnessCreateInfo src) {
        VkPipelineRobustnessCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_ROBUSTNESS_CREATE_INFO);
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

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int storageBuffers() {
        return segment.get(LAYOUT$storageBuffers, OFFSET$storageBuffers);
    }

    public void storageBuffers(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$storageBuffers, OFFSET$storageBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int uniformBuffers() {
        return segment.get(LAYOUT$uniformBuffers, OFFSET$uniformBuffers);
    }

    public void uniformBuffers(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$uniformBuffers, OFFSET$uniformBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int vertexInputs() {
        return segment.get(LAYOUT$vertexInputs, OFFSET$vertexInputs);
    }

    public void vertexInputs(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$vertexInputs, OFFSET$vertexInputs, value);
    }

    public @enumtype(VkPipelineRobustnessImageBehavior.class) int images() {
        return segment.get(LAYOUT$images, OFFSET$images);
    }

    public void images(@enumtype(VkPipelineRobustnessImageBehavior.class) int value) {
        segment.set(LAYOUT$images, OFFSET$images, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffers"),
        ValueLayout.JAVA_INT.withName("uniformBuffers"),
        ValueLayout.JAVA_INT.withName("vertexInputs"),
        ValueLayout.JAVA_INT.withName("images")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$storageBuffers = PathElement.groupElement("storageBuffers");
    public static final PathElement PATH$uniformBuffers = PathElement.groupElement("uniformBuffers");
    public static final PathElement PATH$vertexInputs = PathElement.groupElement("vertexInputs");
    public static final PathElement PATH$images = PathElement.groupElement("images");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$storageBuffers = (OfInt) LAYOUT.select(PATH$storageBuffers);
    public static final OfInt LAYOUT$uniformBuffers = (OfInt) LAYOUT.select(PATH$uniformBuffers);
    public static final OfInt LAYOUT$vertexInputs = (OfInt) LAYOUT.select(PATH$vertexInputs);
    public static final OfInt LAYOUT$images = (OfInt) LAYOUT.select(PATH$images);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$storageBuffers = LAYOUT$storageBuffers.byteSize();
    public static final long SIZE$uniformBuffers = LAYOUT$uniformBuffers.byteSize();
    public static final long SIZE$vertexInputs = LAYOUT$vertexInputs.byteSize();
    public static final long SIZE$images = LAYOUT$images.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffers = LAYOUT.byteOffset(PATH$storageBuffers);
    public static final long OFFSET$uniformBuffers = LAYOUT.byteOffset(PATH$uniformBuffers);
    public static final long OFFSET$vertexInputs = LAYOUT.byteOffset(PATH$vertexInputs);
    public static final long OFFSET$images = LAYOUT.byteOffset(PATH$images);
}

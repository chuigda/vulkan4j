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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePipelineRobustnessProperties.html"><code>VkPhysicalDevicePipelineRobustnessProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDevicePipelineRobustnessProperties {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineRobustnessBufferBehavior defaultRobustnessStorageBuffers; // @link substring="VkPipelineRobustnessBufferBehavior" target="VkPipelineRobustnessBufferBehavior" @link substring="defaultRobustnessStorageBuffers" target="#defaultRobustnessStorageBuffers"
///     VkPipelineRobustnessBufferBehavior defaultRobustnessUniformBuffers; // @link substring="VkPipelineRobustnessBufferBehavior" target="VkPipelineRobustnessBufferBehavior" @link substring="defaultRobustnessUniformBuffers" target="#defaultRobustnessUniformBuffers"
///     VkPipelineRobustnessBufferBehavior defaultRobustnessVertexInputs; // @link substring="VkPipelineRobustnessBufferBehavior" target="VkPipelineRobustnessBufferBehavior" @link substring="defaultRobustnessVertexInputs" target="#defaultRobustnessVertexInputs"
///     VkPipelineRobustnessImageBehavior defaultRobustnessImages; // @link substring="VkPipelineRobustnessImageBehavior" target="VkPipelineRobustnessImageBehavior" @link substring="defaultRobustnessImages" target="#defaultRobustnessImages"
/// } VkPhysicalDevicePipelineRobustnessProperties;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES`
///
/// The {@code allocate} ({@link VkPhysicalDevicePipelineRobustnessProperties#allocate(Arena)}, {@link VkPhysicalDevicePipelineRobustnessProperties#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDevicePipelineRobustnessProperties#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePipelineRobustnessProperties.html"><code>VkPhysicalDevicePipelineRobustnessProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDevicePipelineRobustnessProperties(@NotNull MemorySegment segment) implements IVkPhysicalDevicePipelineRobustnessProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePipelineRobustnessProperties.html"><code>VkPhysicalDevicePipelineRobustnessProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDevicePipelineRobustnessProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDevicePipelineRobustnessProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDevicePipelineRobustnessProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDevicePipelineRobustnessProperties {
        public long size() {
            return segment.byteSize() / VkPhysicalDevicePipelineRobustnessProperties.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDevicePipelineRobustnessProperties at(long index) {
            return new VkPhysicalDevicePipelineRobustnessProperties(segment.asSlice(index * VkPhysicalDevicePipelineRobustnessProperties.BYTES, VkPhysicalDevicePipelineRobustnessProperties.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDevicePipelineRobustnessProperties value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDevicePipelineRobustnessProperties.BYTES, VkPhysicalDevicePipelineRobustnessProperties.BYTES);
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
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkPhysicalDevicePipelineRobustnessProperties.BYTES, VkPhysicalDevicePipelineRobustnessProperties.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDevicePipelineRobustnessProperties.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDevicePipelineRobustnessProperties.BYTES,
                (end - start) * VkPhysicalDevicePipelineRobustnessProperties.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDevicePipelineRobustnessProperties.BYTES));
        }

        public VkPhysicalDevicePipelineRobustnessProperties[] toArray() {
            VkPhysicalDevicePipelineRobustnessProperties[] ret = new VkPhysicalDevicePipelineRobustnessProperties[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkPhysicalDevicePipelineRobustnessProperties allocate(Arena arena) {
        VkPhysicalDevicePipelineRobustnessProperties ret = new VkPhysicalDevicePipelineRobustnessProperties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDevicePipelineRobustnessProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePipelineRobustnessProperties.Ptr ret = new VkPhysicalDevicePipelineRobustnessProperties.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDevicePipelineRobustnessProperties clone(Arena arena, VkPhysicalDevicePipelineRobustnessProperties src) {
        VkPhysicalDevicePipelineRobustnessProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @EnumType(VkPipelineRobustnessBufferBehavior.class) int defaultRobustnessStorageBuffers() {
        return segment.get(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers);
    }

    public void defaultRobustnessStorageBuffers(@EnumType(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers, value);
    }

    public @EnumType(VkPipelineRobustnessBufferBehavior.class) int defaultRobustnessUniformBuffers() {
        return segment.get(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers);
    }

    public void defaultRobustnessUniformBuffers(@EnumType(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers, value);
    }

    public @EnumType(VkPipelineRobustnessBufferBehavior.class) int defaultRobustnessVertexInputs() {
        return segment.get(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs);
    }

    public void defaultRobustnessVertexInputs(@EnumType(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs, value);
    }

    public @EnumType(VkPipelineRobustnessImageBehavior.class) int defaultRobustnessImages() {
        return segment.get(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages);
    }

    public void defaultRobustnessImages(@EnumType(VkPipelineRobustnessImageBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessStorageBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessUniformBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessVertexInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessImages")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$defaultRobustnessStorageBuffers = PathElement.groupElement("defaultRobustnessStorageBuffers");
    public static final PathElement PATH$defaultRobustnessUniformBuffers = PathElement.groupElement("defaultRobustnessUniformBuffers");
    public static final PathElement PATH$defaultRobustnessVertexInputs = PathElement.groupElement("defaultRobustnessVertexInputs");
    public static final PathElement PATH$defaultRobustnessImages = PathElement.groupElement("defaultRobustnessImages");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$defaultRobustnessStorageBuffers = (OfInt) LAYOUT.select(PATH$defaultRobustnessStorageBuffers);
    public static final OfInt LAYOUT$defaultRobustnessUniformBuffers = (OfInt) LAYOUT.select(PATH$defaultRobustnessUniformBuffers);
    public static final OfInt LAYOUT$defaultRobustnessVertexInputs = (OfInt) LAYOUT.select(PATH$defaultRobustnessVertexInputs);
    public static final OfInt LAYOUT$defaultRobustnessImages = (OfInt) LAYOUT.select(PATH$defaultRobustnessImages);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$defaultRobustnessStorageBuffers = LAYOUT$defaultRobustnessStorageBuffers.byteSize();
    public static final long SIZE$defaultRobustnessUniformBuffers = LAYOUT$defaultRobustnessUniformBuffers.byteSize();
    public static final long SIZE$defaultRobustnessVertexInputs = LAYOUT$defaultRobustnessVertexInputs.byteSize();
    public static final long SIZE$defaultRobustnessImages = LAYOUT$defaultRobustnessImages.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$defaultRobustnessStorageBuffers = LAYOUT.byteOffset(PATH$defaultRobustnessStorageBuffers);
    public static final long OFFSET$defaultRobustnessUniformBuffers = LAYOUT.byteOffset(PATH$defaultRobustnessUniformBuffers);
    public static final long OFFSET$defaultRobustnessVertexInputs = LAYOUT.byteOffset(PATH$defaultRobustnessVertexInputs);
    public static final long OFFSET$defaultRobustnessImages = LAYOUT.byteOffset(PATH$defaultRobustnessImages);
}

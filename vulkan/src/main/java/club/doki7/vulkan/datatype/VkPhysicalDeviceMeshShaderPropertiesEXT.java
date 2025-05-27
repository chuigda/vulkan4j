package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMeshShaderPropertiesEXT.html"><code>VkPhysicalDeviceMeshShaderPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMeshShaderPropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t maxTaskWorkGroupTotalCount; // @link substring="maxTaskWorkGroupTotalCount" target="#maxTaskWorkGroupTotalCount"
///     uint32_t[3] maxTaskWorkGroupCount; // @link substring="maxTaskWorkGroupCount" target="#maxTaskWorkGroupCount"
///     uint32_t maxTaskWorkGroupInvocations; // @link substring="maxTaskWorkGroupInvocations" target="#maxTaskWorkGroupInvocations"
///     uint32_t[3] maxTaskWorkGroupSize; // @link substring="maxTaskWorkGroupSize" target="#maxTaskWorkGroupSize"
///     uint32_t maxTaskPayloadSize; // @link substring="maxTaskPayloadSize" target="#maxTaskPayloadSize"
///     uint32_t maxTaskSharedMemorySize; // @link substring="maxTaskSharedMemorySize" target="#maxTaskSharedMemorySize"
///     uint32_t maxTaskPayloadAndSharedMemorySize; // @link substring="maxTaskPayloadAndSharedMemorySize" target="#maxTaskPayloadAndSharedMemorySize"
///     uint32_t maxMeshWorkGroupTotalCount; // @link substring="maxMeshWorkGroupTotalCount" target="#maxMeshWorkGroupTotalCount"
///     uint32_t[3] maxMeshWorkGroupCount; // @link substring="maxMeshWorkGroupCount" target="#maxMeshWorkGroupCount"
///     uint32_t maxMeshWorkGroupInvocations; // @link substring="maxMeshWorkGroupInvocations" target="#maxMeshWorkGroupInvocations"
///     uint32_t[3] maxMeshWorkGroupSize; // @link substring="maxMeshWorkGroupSize" target="#maxMeshWorkGroupSize"
///     uint32_t maxMeshSharedMemorySize; // @link substring="maxMeshSharedMemorySize" target="#maxMeshSharedMemorySize"
///     uint32_t maxMeshPayloadAndSharedMemorySize; // @link substring="maxMeshPayloadAndSharedMemorySize" target="#maxMeshPayloadAndSharedMemorySize"
///     uint32_t maxMeshOutputMemorySize; // @link substring="maxMeshOutputMemorySize" target="#maxMeshOutputMemorySize"
///     uint32_t maxMeshPayloadAndOutputMemorySize; // @link substring="maxMeshPayloadAndOutputMemorySize" target="#maxMeshPayloadAndOutputMemorySize"
///     uint32_t maxMeshOutputComponents; // @link substring="maxMeshOutputComponents" target="#maxMeshOutputComponents"
///     uint32_t maxMeshOutputVertices; // @link substring="maxMeshOutputVertices" target="#maxMeshOutputVertices"
///     uint32_t maxMeshOutputPrimitives; // @link substring="maxMeshOutputPrimitives" target="#maxMeshOutputPrimitives"
///     uint32_t maxMeshOutputLayers; // @link substring="maxMeshOutputLayers" target="#maxMeshOutputLayers"
///     uint32_t maxMeshMultiviewViewCount; // @link substring="maxMeshMultiviewViewCount" target="#maxMeshMultiviewViewCount"
///     uint32_t meshOutputPerVertexGranularity; // @link substring="meshOutputPerVertexGranularity" target="#meshOutputPerVertexGranularity"
///     uint32_t meshOutputPerPrimitiveGranularity; // @link substring="meshOutputPerPrimitiveGranularity" target="#meshOutputPerPrimitiveGranularity"
///     uint32_t maxPreferredTaskWorkGroupInvocations; // @link substring="maxPreferredTaskWorkGroupInvocations" target="#maxPreferredTaskWorkGroupInvocations"
///     uint32_t maxPreferredMeshWorkGroupInvocations; // @link substring="maxPreferredMeshWorkGroupInvocations" target="#maxPreferredMeshWorkGroupInvocations"
///     VkBool32 prefersLocalInvocationVertexOutput; // @link substring="prefersLocalInvocationVertexOutput" target="#prefersLocalInvocationVertexOutput"
///     VkBool32 prefersLocalInvocationPrimitiveOutput; // @link substring="prefersLocalInvocationPrimitiveOutput" target="#prefersLocalInvocationPrimitiveOutput"
///     VkBool32 prefersCompactVertexOutput; // @link substring="prefersCompactVertexOutput" target="#prefersCompactVertexOutput"
///     VkBool32 prefersCompactPrimitiveOutput; // @link substring="prefersCompactPrimitiveOutput" target="#prefersCompactPrimitiveOutput"
/// } VkPhysicalDeviceMeshShaderPropertiesEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceMeshShaderPropertiesEXT#allocate(Arena)}, {@link VkPhysicalDeviceMeshShaderPropertiesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceMeshShaderPropertiesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMeshShaderPropertiesEXT.html"><code>VkPhysicalDeviceMeshShaderPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMeshShaderPropertiesEXT(@NotNull MemorySegment segment) implements IVkPhysicalDeviceMeshShaderPropertiesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMeshShaderPropertiesEXT.html"><code>VkPhysicalDeviceMeshShaderPropertiesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceMeshShaderPropertiesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceMeshShaderPropertiesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceMeshShaderPropertiesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceMeshShaderPropertiesEXT, Iterable<VkPhysicalDeviceMeshShaderPropertiesEXT> {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceMeshShaderPropertiesEXT at(long index) {
            return new VkPhysicalDeviceMeshShaderPropertiesEXT(segment.asSlice(index * VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES, VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDeviceMeshShaderPropertiesEXT value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES, VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES, VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES,
                (end - start) * VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES));
        }

        public VkPhysicalDeviceMeshShaderPropertiesEXT[] toArray() {
            VkPhysicalDeviceMeshShaderPropertiesEXT[] ret = new VkPhysicalDeviceMeshShaderPropertiesEXT[(int) size()];
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
        public static final class Iter implements Iterator<VkPhysicalDeviceMeshShaderPropertiesEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES;
            }

            @Override
            public VkPhysicalDeviceMeshShaderPropertiesEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkPhysicalDeviceMeshShaderPropertiesEXT ret = new VkPhysicalDeviceMeshShaderPropertiesEXT(segment.asSlice(0, VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES));
                segment = segment.asSlice(VkPhysicalDeviceMeshShaderPropertiesEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceMeshShaderPropertiesEXT ret = new VkPhysicalDeviceMeshShaderPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMeshShaderPropertiesEXT.Ptr ret = new VkPhysicalDeviceMeshShaderPropertiesEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT clone(Arena arena, VkPhysicalDeviceMeshShaderPropertiesEXT src) {
        VkPhysicalDeviceMeshShaderPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT);
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

    public @Unsigned int maxTaskWorkGroupTotalCount() {
        return segment.get(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount);
    }

    public void maxTaskWorkGroupTotalCount(@Unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount, value);
    }

    public @Unsigned IntPtr maxTaskWorkGroupCount() {
        return new IntPtr(maxTaskWorkGroupCountRaw());
    }

    public void maxTaskWorkGroupCount(@Unsigned IntPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTaskWorkGroupCount, SIZE$maxTaskWorkGroupCount);
    }

    public MemorySegment maxTaskWorkGroupCountRaw() {
        return segment.asSlice(OFFSET$maxTaskWorkGroupCount, SIZE$maxTaskWorkGroupCount);
    }

    public @Unsigned int maxTaskWorkGroupInvocations() {
        return segment.get(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations);
    }

    public void maxTaskWorkGroupInvocations(@Unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations, value);
    }

    public @Unsigned IntPtr maxTaskWorkGroupSize() {
        return new IntPtr(maxTaskWorkGroupSizeRaw());
    }

    public void maxTaskWorkGroupSize(@Unsigned IntPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTaskWorkGroupSize, SIZE$maxTaskWorkGroupSize);
    }

    public MemorySegment maxTaskWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxTaskWorkGroupSize, SIZE$maxTaskWorkGroupSize);
    }

    public @Unsigned int maxTaskPayloadSize() {
        return segment.get(LAYOUT$maxTaskPayloadSize, OFFSET$maxTaskPayloadSize);
    }

    public void maxTaskPayloadSize(@Unsigned int value) {
        segment.set(LAYOUT$maxTaskPayloadSize, OFFSET$maxTaskPayloadSize, value);
    }

    public @Unsigned int maxTaskSharedMemorySize() {
        return segment.get(LAYOUT$maxTaskSharedMemorySize, OFFSET$maxTaskSharedMemorySize);
    }

    public void maxTaskSharedMemorySize(@Unsigned int value) {
        segment.set(LAYOUT$maxTaskSharedMemorySize, OFFSET$maxTaskSharedMemorySize, value);
    }

    public @Unsigned int maxTaskPayloadAndSharedMemorySize() {
        return segment.get(LAYOUT$maxTaskPayloadAndSharedMemorySize, OFFSET$maxTaskPayloadAndSharedMemorySize);
    }

    public void maxTaskPayloadAndSharedMemorySize(@Unsigned int value) {
        segment.set(LAYOUT$maxTaskPayloadAndSharedMemorySize, OFFSET$maxTaskPayloadAndSharedMemorySize, value);
    }

    public @Unsigned int maxMeshWorkGroupTotalCount() {
        return segment.get(LAYOUT$maxMeshWorkGroupTotalCount, OFFSET$maxMeshWorkGroupTotalCount);
    }

    public void maxMeshWorkGroupTotalCount(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshWorkGroupTotalCount, OFFSET$maxMeshWorkGroupTotalCount, value);
    }

    public @Unsigned IntPtr maxMeshWorkGroupCount() {
        return new IntPtr(maxMeshWorkGroupCountRaw());
    }

    public void maxMeshWorkGroupCount(@Unsigned IntPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxMeshWorkGroupCount, SIZE$maxMeshWorkGroupCount);
    }

    public MemorySegment maxMeshWorkGroupCountRaw() {
        return segment.asSlice(OFFSET$maxMeshWorkGroupCount, SIZE$maxMeshWorkGroupCount);
    }

    public @Unsigned int maxMeshWorkGroupInvocations() {
        return segment.get(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations);
    }

    public void maxMeshWorkGroupInvocations(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations, value);
    }

    public @Unsigned IntPtr maxMeshWorkGroupSize() {
        return new IntPtr(maxMeshWorkGroupSizeRaw());
    }

    public void maxMeshWorkGroupSize(@Unsigned IntPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxMeshWorkGroupSize, SIZE$maxMeshWorkGroupSize);
    }

    public MemorySegment maxMeshWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxMeshWorkGroupSize, SIZE$maxMeshWorkGroupSize);
    }

    public @Unsigned int maxMeshSharedMemorySize() {
        return segment.get(LAYOUT$maxMeshSharedMemorySize, OFFSET$maxMeshSharedMemorySize);
    }

    public void maxMeshSharedMemorySize(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshSharedMemorySize, OFFSET$maxMeshSharedMemorySize, value);
    }

    public @Unsigned int maxMeshPayloadAndSharedMemorySize() {
        return segment.get(LAYOUT$maxMeshPayloadAndSharedMemorySize, OFFSET$maxMeshPayloadAndSharedMemorySize);
    }

    public void maxMeshPayloadAndSharedMemorySize(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshPayloadAndSharedMemorySize, OFFSET$maxMeshPayloadAndSharedMemorySize, value);
    }

    public @Unsigned int maxMeshOutputMemorySize() {
        return segment.get(LAYOUT$maxMeshOutputMemorySize, OFFSET$maxMeshOutputMemorySize);
    }

    public void maxMeshOutputMemorySize(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputMemorySize, OFFSET$maxMeshOutputMemorySize, value);
    }

    public @Unsigned int maxMeshPayloadAndOutputMemorySize() {
        return segment.get(LAYOUT$maxMeshPayloadAndOutputMemorySize, OFFSET$maxMeshPayloadAndOutputMemorySize);
    }

    public void maxMeshPayloadAndOutputMemorySize(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshPayloadAndOutputMemorySize, OFFSET$maxMeshPayloadAndOutputMemorySize, value);
    }

    public @Unsigned int maxMeshOutputComponents() {
        return segment.get(LAYOUT$maxMeshOutputComponents, OFFSET$maxMeshOutputComponents);
    }

    public void maxMeshOutputComponents(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputComponents, OFFSET$maxMeshOutputComponents, value);
    }

    public @Unsigned int maxMeshOutputVertices() {
        return segment.get(LAYOUT$maxMeshOutputVertices, OFFSET$maxMeshOutputVertices);
    }

    public void maxMeshOutputVertices(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputVertices, OFFSET$maxMeshOutputVertices, value);
    }

    public @Unsigned int maxMeshOutputPrimitives() {
        return segment.get(LAYOUT$maxMeshOutputPrimitives, OFFSET$maxMeshOutputPrimitives);
    }

    public void maxMeshOutputPrimitives(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputPrimitives, OFFSET$maxMeshOutputPrimitives, value);
    }

    public @Unsigned int maxMeshOutputLayers() {
        return segment.get(LAYOUT$maxMeshOutputLayers, OFFSET$maxMeshOutputLayers);
    }

    public void maxMeshOutputLayers(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputLayers, OFFSET$maxMeshOutputLayers, value);
    }

    public @Unsigned int maxMeshMultiviewViewCount() {
        return segment.get(LAYOUT$maxMeshMultiviewViewCount, OFFSET$maxMeshMultiviewViewCount);
    }

    public void maxMeshMultiviewViewCount(@Unsigned int value) {
        segment.set(LAYOUT$maxMeshMultiviewViewCount, OFFSET$maxMeshMultiviewViewCount, value);
    }

    public @Unsigned int meshOutputPerVertexGranularity() {
        return segment.get(LAYOUT$meshOutputPerVertexGranularity, OFFSET$meshOutputPerVertexGranularity);
    }

    public void meshOutputPerVertexGranularity(@Unsigned int value) {
        segment.set(LAYOUT$meshOutputPerVertexGranularity, OFFSET$meshOutputPerVertexGranularity, value);
    }

    public @Unsigned int meshOutputPerPrimitiveGranularity() {
        return segment.get(LAYOUT$meshOutputPerPrimitiveGranularity, OFFSET$meshOutputPerPrimitiveGranularity);
    }

    public void meshOutputPerPrimitiveGranularity(@Unsigned int value) {
        segment.set(LAYOUT$meshOutputPerPrimitiveGranularity, OFFSET$meshOutputPerPrimitiveGranularity, value);
    }

    public @Unsigned int maxPreferredTaskWorkGroupInvocations() {
        return segment.get(LAYOUT$maxPreferredTaskWorkGroupInvocations, OFFSET$maxPreferredTaskWorkGroupInvocations);
    }

    public void maxPreferredTaskWorkGroupInvocations(@Unsigned int value) {
        segment.set(LAYOUT$maxPreferredTaskWorkGroupInvocations, OFFSET$maxPreferredTaskWorkGroupInvocations, value);
    }

    public @Unsigned int maxPreferredMeshWorkGroupInvocations() {
        return segment.get(LAYOUT$maxPreferredMeshWorkGroupInvocations, OFFSET$maxPreferredMeshWorkGroupInvocations);
    }

    public void maxPreferredMeshWorkGroupInvocations(@Unsigned int value) {
        segment.set(LAYOUT$maxPreferredMeshWorkGroupInvocations, OFFSET$maxPreferredMeshWorkGroupInvocations, value);
    }

    public @NativeType("VkBool32") @Unsigned int prefersLocalInvocationVertexOutput() {
        return segment.get(LAYOUT$prefersLocalInvocationVertexOutput, OFFSET$prefersLocalInvocationVertexOutput);
    }

    public void prefersLocalInvocationVertexOutput(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$prefersLocalInvocationVertexOutput, OFFSET$prefersLocalInvocationVertexOutput, value);
    }

    public @NativeType("VkBool32") @Unsigned int prefersLocalInvocationPrimitiveOutput() {
        return segment.get(LAYOUT$prefersLocalInvocationPrimitiveOutput, OFFSET$prefersLocalInvocationPrimitiveOutput);
    }

    public void prefersLocalInvocationPrimitiveOutput(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$prefersLocalInvocationPrimitiveOutput, OFFSET$prefersLocalInvocationPrimitiveOutput, value);
    }

    public @NativeType("VkBool32") @Unsigned int prefersCompactVertexOutput() {
        return segment.get(LAYOUT$prefersCompactVertexOutput, OFFSET$prefersCompactVertexOutput);
    }

    public void prefersCompactVertexOutput(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$prefersCompactVertexOutput, OFFSET$prefersCompactVertexOutput, value);
    }

    public @NativeType("VkBool32") @Unsigned int prefersCompactPrimitiveOutput() {
        return segment.get(LAYOUT$prefersCompactPrimitiveOutput, OFFSET$prefersCompactPrimitiveOutput);
    }

    public void prefersCompactPrimitiveOutput(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$prefersCompactPrimitiveOutput, OFFSET$prefersCompactPrimitiveOutput, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxTaskSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxMeshSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshPayloadAndOutputMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputLayers"),
        ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity"),
        ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity"),
        ValueLayout.JAVA_INT.withName("maxPreferredTaskWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("maxPreferredMeshWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("prefersLocalInvocationVertexOutput"),
        ValueLayout.JAVA_INT.withName("prefersLocalInvocationPrimitiveOutput"),
        ValueLayout.JAVA_INT.withName("prefersCompactVertexOutput"),
        ValueLayout.JAVA_INT.withName("prefersCompactPrimitiveOutput")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxTaskWorkGroupTotalCount = PathElement.groupElement("maxTaskWorkGroupTotalCount");
    public static final PathElement PATH$maxTaskWorkGroupCount = PathElement.groupElement("maxTaskWorkGroupCount");
    public static final PathElement PATH$maxTaskWorkGroupInvocations = PathElement.groupElement("maxTaskWorkGroupInvocations");
    public static final PathElement PATH$maxTaskWorkGroupSize = PathElement.groupElement("maxTaskWorkGroupSize");
    public static final PathElement PATH$maxTaskPayloadSize = PathElement.groupElement("maxTaskPayloadSize");
    public static final PathElement PATH$maxTaskSharedMemorySize = PathElement.groupElement("maxTaskSharedMemorySize");
    public static final PathElement PATH$maxTaskPayloadAndSharedMemorySize = PathElement.groupElement("maxTaskPayloadAndSharedMemorySize");
    public static final PathElement PATH$maxMeshWorkGroupTotalCount = PathElement.groupElement("maxMeshWorkGroupTotalCount");
    public static final PathElement PATH$maxMeshWorkGroupCount = PathElement.groupElement("maxMeshWorkGroupCount");
    public static final PathElement PATH$maxMeshWorkGroupInvocations = PathElement.groupElement("maxMeshWorkGroupInvocations");
    public static final PathElement PATH$maxMeshWorkGroupSize = PathElement.groupElement("maxMeshWorkGroupSize");
    public static final PathElement PATH$maxMeshSharedMemorySize = PathElement.groupElement("maxMeshSharedMemorySize");
    public static final PathElement PATH$maxMeshPayloadAndSharedMemorySize = PathElement.groupElement("maxMeshPayloadAndSharedMemorySize");
    public static final PathElement PATH$maxMeshOutputMemorySize = PathElement.groupElement("maxMeshOutputMemorySize");
    public static final PathElement PATH$maxMeshPayloadAndOutputMemorySize = PathElement.groupElement("maxMeshPayloadAndOutputMemorySize");
    public static final PathElement PATH$maxMeshOutputComponents = PathElement.groupElement("maxMeshOutputComponents");
    public static final PathElement PATH$maxMeshOutputVertices = PathElement.groupElement("maxMeshOutputVertices");
    public static final PathElement PATH$maxMeshOutputPrimitives = PathElement.groupElement("maxMeshOutputPrimitives");
    public static final PathElement PATH$maxMeshOutputLayers = PathElement.groupElement("maxMeshOutputLayers");
    public static final PathElement PATH$maxMeshMultiviewViewCount = PathElement.groupElement("maxMeshMultiviewViewCount");
    public static final PathElement PATH$meshOutputPerVertexGranularity = PathElement.groupElement("meshOutputPerVertexGranularity");
    public static final PathElement PATH$meshOutputPerPrimitiveGranularity = PathElement.groupElement("meshOutputPerPrimitiveGranularity");
    public static final PathElement PATH$maxPreferredTaskWorkGroupInvocations = PathElement.groupElement("maxPreferredTaskWorkGroupInvocations");
    public static final PathElement PATH$maxPreferredMeshWorkGroupInvocations = PathElement.groupElement("maxPreferredMeshWorkGroupInvocations");
    public static final PathElement PATH$prefersLocalInvocationVertexOutput = PathElement.groupElement("prefersLocalInvocationVertexOutput");
    public static final PathElement PATH$prefersLocalInvocationPrimitiveOutput = PathElement.groupElement("prefersLocalInvocationPrimitiveOutput");
    public static final PathElement PATH$prefersCompactVertexOutput = PathElement.groupElement("prefersCompactVertexOutput");
    public static final PathElement PATH$prefersCompactPrimitiveOutput = PathElement.groupElement("prefersCompactPrimitiveOutput");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxTaskWorkGroupTotalCount = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupTotalCount);
    public static final SequenceLayout LAYOUT$maxTaskWorkGroupCount = (SequenceLayout) LAYOUT.select(PATH$maxTaskWorkGroupCount);
    public static final OfInt LAYOUT$maxTaskWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupInvocations);
    public static final SequenceLayout LAYOUT$maxTaskWorkGroupSize = (SequenceLayout) LAYOUT.select(PATH$maxTaskWorkGroupSize);
    public static final OfInt LAYOUT$maxTaskPayloadSize = (OfInt) LAYOUT.select(PATH$maxTaskPayloadSize);
    public static final OfInt LAYOUT$maxTaskSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxTaskSharedMemorySize);
    public static final OfInt LAYOUT$maxTaskPayloadAndSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxTaskPayloadAndSharedMemorySize);
    public static final OfInt LAYOUT$maxMeshWorkGroupTotalCount = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupTotalCount);
    public static final SequenceLayout LAYOUT$maxMeshWorkGroupCount = (SequenceLayout) LAYOUT.select(PATH$maxMeshWorkGroupCount);
    public static final OfInt LAYOUT$maxMeshWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupInvocations);
    public static final SequenceLayout LAYOUT$maxMeshWorkGroupSize = (SequenceLayout) LAYOUT.select(PATH$maxMeshWorkGroupSize);
    public static final OfInt LAYOUT$maxMeshSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshSharedMemorySize);
    public static final OfInt LAYOUT$maxMeshPayloadAndSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshPayloadAndSharedMemorySize);
    public static final OfInt LAYOUT$maxMeshOutputMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshOutputMemorySize);
    public static final OfInt LAYOUT$maxMeshPayloadAndOutputMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshPayloadAndOutputMemorySize);
    public static final OfInt LAYOUT$maxMeshOutputComponents = (OfInt) LAYOUT.select(PATH$maxMeshOutputComponents);
    public static final OfInt LAYOUT$maxMeshOutputVertices = (OfInt) LAYOUT.select(PATH$maxMeshOutputVertices);
    public static final OfInt LAYOUT$maxMeshOutputPrimitives = (OfInt) LAYOUT.select(PATH$maxMeshOutputPrimitives);
    public static final OfInt LAYOUT$maxMeshOutputLayers = (OfInt) LAYOUT.select(PATH$maxMeshOutputLayers);
    public static final OfInt LAYOUT$maxMeshMultiviewViewCount = (OfInt) LAYOUT.select(PATH$maxMeshMultiviewViewCount);
    public static final OfInt LAYOUT$meshOutputPerVertexGranularity = (OfInt) LAYOUT.select(PATH$meshOutputPerVertexGranularity);
    public static final OfInt LAYOUT$meshOutputPerPrimitiveGranularity = (OfInt) LAYOUT.select(PATH$meshOutputPerPrimitiveGranularity);
    public static final OfInt LAYOUT$maxPreferredTaskWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxPreferredTaskWorkGroupInvocations);
    public static final OfInt LAYOUT$maxPreferredMeshWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxPreferredMeshWorkGroupInvocations);
    public static final OfInt LAYOUT$prefersLocalInvocationVertexOutput = (OfInt) LAYOUT.select(PATH$prefersLocalInvocationVertexOutput);
    public static final OfInt LAYOUT$prefersLocalInvocationPrimitiveOutput = (OfInt) LAYOUT.select(PATH$prefersLocalInvocationPrimitiveOutput);
    public static final OfInt LAYOUT$prefersCompactVertexOutput = (OfInt) LAYOUT.select(PATH$prefersCompactVertexOutput);
    public static final OfInt LAYOUT$prefersCompactPrimitiveOutput = (OfInt) LAYOUT.select(PATH$prefersCompactPrimitiveOutput);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxTaskWorkGroupTotalCount = LAYOUT$maxTaskWorkGroupTotalCount.byteSize();
    public static final long SIZE$maxTaskWorkGroupCount = LAYOUT$maxTaskWorkGroupCount.byteSize();
    public static final long SIZE$maxTaskWorkGroupInvocations = LAYOUT$maxTaskWorkGroupInvocations.byteSize();
    public static final long SIZE$maxTaskWorkGroupSize = LAYOUT$maxTaskWorkGroupSize.byteSize();
    public static final long SIZE$maxTaskPayloadSize = LAYOUT$maxTaskPayloadSize.byteSize();
    public static final long SIZE$maxTaskSharedMemorySize = LAYOUT$maxTaskSharedMemorySize.byteSize();
    public static final long SIZE$maxTaskPayloadAndSharedMemorySize = LAYOUT$maxTaskPayloadAndSharedMemorySize.byteSize();
    public static final long SIZE$maxMeshWorkGroupTotalCount = LAYOUT$maxMeshWorkGroupTotalCount.byteSize();
    public static final long SIZE$maxMeshWorkGroupCount = LAYOUT$maxMeshWorkGroupCount.byteSize();
    public static final long SIZE$maxMeshWorkGroupInvocations = LAYOUT$maxMeshWorkGroupInvocations.byteSize();
    public static final long SIZE$maxMeshWorkGroupSize = LAYOUT$maxMeshWorkGroupSize.byteSize();
    public static final long SIZE$maxMeshSharedMemorySize = LAYOUT$maxMeshSharedMemorySize.byteSize();
    public static final long SIZE$maxMeshPayloadAndSharedMemorySize = LAYOUT$maxMeshPayloadAndSharedMemorySize.byteSize();
    public static final long SIZE$maxMeshOutputMemorySize = LAYOUT$maxMeshOutputMemorySize.byteSize();
    public static final long SIZE$maxMeshPayloadAndOutputMemorySize = LAYOUT$maxMeshPayloadAndOutputMemorySize.byteSize();
    public static final long SIZE$maxMeshOutputComponents = LAYOUT$maxMeshOutputComponents.byteSize();
    public static final long SIZE$maxMeshOutputVertices = LAYOUT$maxMeshOutputVertices.byteSize();
    public static final long SIZE$maxMeshOutputPrimitives = LAYOUT$maxMeshOutputPrimitives.byteSize();
    public static final long SIZE$maxMeshOutputLayers = LAYOUT$maxMeshOutputLayers.byteSize();
    public static final long SIZE$maxMeshMultiviewViewCount = LAYOUT$maxMeshMultiviewViewCount.byteSize();
    public static final long SIZE$meshOutputPerVertexGranularity = LAYOUT$meshOutputPerVertexGranularity.byteSize();
    public static final long SIZE$meshOutputPerPrimitiveGranularity = LAYOUT$meshOutputPerPrimitiveGranularity.byteSize();
    public static final long SIZE$maxPreferredTaskWorkGroupInvocations = LAYOUT$maxPreferredTaskWorkGroupInvocations.byteSize();
    public static final long SIZE$maxPreferredMeshWorkGroupInvocations = LAYOUT$maxPreferredMeshWorkGroupInvocations.byteSize();
    public static final long SIZE$prefersLocalInvocationVertexOutput = LAYOUT$prefersLocalInvocationVertexOutput.byteSize();
    public static final long SIZE$prefersLocalInvocationPrimitiveOutput = LAYOUT$prefersLocalInvocationPrimitiveOutput.byteSize();
    public static final long SIZE$prefersCompactVertexOutput = LAYOUT$prefersCompactVertexOutput.byteSize();
    public static final long SIZE$prefersCompactPrimitiveOutput = LAYOUT$prefersCompactPrimitiveOutput.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxTaskWorkGroupTotalCount = LAYOUT.byteOffset(PATH$maxTaskWorkGroupTotalCount);
    public static final long OFFSET$maxTaskWorkGroupCount = LAYOUT.byteOffset(PATH$maxTaskWorkGroupCount);
    public static final long OFFSET$maxTaskWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxTaskWorkGroupInvocations);
    public static final long OFFSET$maxTaskWorkGroupSize = LAYOUT.byteOffset(PATH$maxTaskWorkGroupSize);
    public static final long OFFSET$maxTaskPayloadSize = LAYOUT.byteOffset(PATH$maxTaskPayloadSize);
    public static final long OFFSET$maxTaskSharedMemorySize = LAYOUT.byteOffset(PATH$maxTaskSharedMemorySize);
    public static final long OFFSET$maxTaskPayloadAndSharedMemorySize = LAYOUT.byteOffset(PATH$maxTaskPayloadAndSharedMemorySize);
    public static final long OFFSET$maxMeshWorkGroupTotalCount = LAYOUT.byteOffset(PATH$maxMeshWorkGroupTotalCount);
    public static final long OFFSET$maxMeshWorkGroupCount = LAYOUT.byteOffset(PATH$maxMeshWorkGroupCount);
    public static final long OFFSET$maxMeshWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxMeshWorkGroupInvocations);
    public static final long OFFSET$maxMeshWorkGroupSize = LAYOUT.byteOffset(PATH$maxMeshWorkGroupSize);
    public static final long OFFSET$maxMeshSharedMemorySize = LAYOUT.byteOffset(PATH$maxMeshSharedMemorySize);
    public static final long OFFSET$maxMeshPayloadAndSharedMemorySize = LAYOUT.byteOffset(PATH$maxMeshPayloadAndSharedMemorySize);
    public static final long OFFSET$maxMeshOutputMemorySize = LAYOUT.byteOffset(PATH$maxMeshOutputMemorySize);
    public static final long OFFSET$maxMeshPayloadAndOutputMemorySize = LAYOUT.byteOffset(PATH$maxMeshPayloadAndOutputMemorySize);
    public static final long OFFSET$maxMeshOutputComponents = LAYOUT.byteOffset(PATH$maxMeshOutputComponents);
    public static final long OFFSET$maxMeshOutputVertices = LAYOUT.byteOffset(PATH$maxMeshOutputVertices);
    public static final long OFFSET$maxMeshOutputPrimitives = LAYOUT.byteOffset(PATH$maxMeshOutputPrimitives);
    public static final long OFFSET$maxMeshOutputLayers = LAYOUT.byteOffset(PATH$maxMeshOutputLayers);
    public static final long OFFSET$maxMeshMultiviewViewCount = LAYOUT.byteOffset(PATH$maxMeshMultiviewViewCount);
    public static final long OFFSET$meshOutputPerVertexGranularity = LAYOUT.byteOffset(PATH$meshOutputPerVertexGranularity);
    public static final long OFFSET$meshOutputPerPrimitiveGranularity = LAYOUT.byteOffset(PATH$meshOutputPerPrimitiveGranularity);
    public static final long OFFSET$maxPreferredTaskWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxPreferredTaskWorkGroupInvocations);
    public static final long OFFSET$maxPreferredMeshWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxPreferredMeshWorkGroupInvocations);
    public static final long OFFSET$prefersLocalInvocationVertexOutput = LAYOUT.byteOffset(PATH$prefersLocalInvocationVertexOutput);
    public static final long OFFSET$prefersLocalInvocationPrimitiveOutput = LAYOUT.byteOffset(PATH$prefersLocalInvocationPrimitiveOutput);
    public static final long OFFSET$prefersCompactVertexOutput = LAYOUT.byteOffset(PATH$prefersCompactVertexOutput);
    public static final long OFFSET$prefersCompactPrimitiveOutput = LAYOUT.byteOffset(PATH$prefersCompactPrimitiveOutput);
}

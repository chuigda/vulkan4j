package club.doki7.webgpu.datatype;

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
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.handle.*;
import club.doki7.webgpu.enumtype.*;
import static club.doki7.webgpu.WGPUConstants.*;
import club.doki7.webgpu.WGPUFunctionTypes.*;

/// Represents a pointer to a {@code WGPULimits} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPULimits {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     uint32_t maxTextureDimension1d; // @link substring="maxTextureDimension1d" target="#maxTextureDimension1d"
///     uint32_t maxTextureDimension2d; // @link substring="maxTextureDimension2d" target="#maxTextureDimension2d"
///     uint32_t maxTextureDimension3d; // @link substring="maxTextureDimension3d" target="#maxTextureDimension3d"
///     uint32_t maxTextureArrayLayers; // @link substring="maxTextureArrayLayers" target="#maxTextureArrayLayers"
///     uint32_t maxBindGroups; // @link substring="maxBindGroups" target="#maxBindGroups"
///     uint32_t maxBindGroupsPlusVertexBuffers; // @link substring="maxBindGroupsPlusVertexBuffers" target="#maxBindGroupsPlusVertexBuffers"
///     uint32_t maxBindingsPerBindGroup; // @link substring="maxBindingsPerBindGroup" target="#maxBindingsPerBindGroup"
///     uint32_t maxDynamicUniformBuffersPerPipelineLayout; // @link substring="maxDynamicUniformBuffersPerPipelineLayout" target="#maxDynamicUniformBuffersPerPipelineLayout"
///     uint32_t maxDynamicStorageBuffersPerPipelineLayout; // @link substring="maxDynamicStorageBuffersPerPipelineLayout" target="#maxDynamicStorageBuffersPerPipelineLayout"
///     uint32_t maxSampledTexturesPerShaderStage; // @link substring="maxSampledTexturesPerShaderStage" target="#maxSampledTexturesPerShaderStage"
///     uint32_t maxSamplersPerShaderStage; // @link substring="maxSamplersPerShaderStage" target="#maxSamplersPerShaderStage"
///     uint32_t maxStorageBuffersPerShaderStage; // @link substring="maxStorageBuffersPerShaderStage" target="#maxStorageBuffersPerShaderStage"
///     uint32_t maxStorageTexturesPerShaderStage; // @link substring="maxStorageTexturesPerShaderStage" target="#maxStorageTexturesPerShaderStage"
///     uint32_t maxUniformBuffersPerShaderStage; // @link substring="maxUniformBuffersPerShaderStage" target="#maxUniformBuffersPerShaderStage"
///     uint64_t maxUniformBufferBindingSize; // @link substring="maxUniformBufferBindingSize" target="#maxUniformBufferBindingSize"
///     uint64_t maxStorageBufferBindingSize; // @link substring="maxStorageBufferBindingSize" target="#maxStorageBufferBindingSize"
///     uint32_t minUniformBufferOffsetAlignment; // @link substring="minUniformBufferOffsetAlignment" target="#minUniformBufferOffsetAlignment"
///     uint32_t minStorageBufferOffsetAlignment; // @link substring="minStorageBufferOffsetAlignment" target="#minStorageBufferOffsetAlignment"
///     uint32_t maxVertexBuffers; // @link substring="maxVertexBuffers" target="#maxVertexBuffers"
///     uint64_t maxBufferSize; // @link substring="maxBufferSize" target="#maxBufferSize"
///     uint32_t maxVertexAttributes; // @link substring="maxVertexAttributes" target="#maxVertexAttributes"
///     uint32_t maxVertexBufferArrayStride; // @link substring="maxVertexBufferArrayStride" target="#maxVertexBufferArrayStride"
///     uint32_t maxInterStageShaderVariables; // @link substring="maxInterStageShaderVariables" target="#maxInterStageShaderVariables"
///     uint32_t maxColorAttachments; // @link substring="maxColorAttachments" target="#maxColorAttachments"
///     uint32_t maxColorAttachmentBytesPerSample; // @link substring="maxColorAttachmentBytesPerSample" target="#maxColorAttachmentBytesPerSample"
///     uint32_t maxComputeWorkgroupStorageSize; // @link substring="maxComputeWorkgroupStorageSize" target="#maxComputeWorkgroupStorageSize"
///     uint32_t maxComputeInvocationsPerWorkgroup; // @link substring="maxComputeInvocationsPerWorkgroup" target="#maxComputeInvocationsPerWorkgroup"
///     uint32_t maxComputeWorkgroupSizeX; // @link substring="maxComputeWorkgroupSizeX" target="#maxComputeWorkgroupSizeX"
///     uint32_t maxComputeWorkgroupSizeY; // @link substring="maxComputeWorkgroupSizeY" target="#maxComputeWorkgroupSizeY"
///     uint32_t maxComputeWorkgroupSizeZ; // @link substring="maxComputeWorkgroupSizeZ" target="#maxComputeWorkgroupSizeZ"
///     uint32_t maxComputeWorkgroupsPerDimension; // @link substring="maxComputeWorkgroupsPerDimension" target="#maxComputeWorkgroupsPerDimension"
/// } WGPULimits;
/// }
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
@ValueBasedCandidate
@UnsafeConstructor
public record WGPULimits(@NotNull MemorySegment segment) implements IWGPULimits {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPULimits}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPULimits to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPULimits.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPULimits, Iterable<WGPULimits> {
        public long size() {
            return segment.byteSize() / WGPULimits.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPULimits at(long index) {
            return new WGPULimits(segment.asSlice(index * WGPULimits.BYTES, WGPULimits.BYTES));
        }

        public WGPULimits.Ptr at(long index, @NotNull Consumer<@NotNull WGPULimits> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPULimits value) {
            MemorySegment s = segment.asSlice(index * WGPULimits.BYTES, WGPULimits.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPULimits.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPULimits.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPULimits.BYTES,
                (end - start) * WGPULimits.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPULimits.BYTES));
        }

        public WGPULimits[] toArray() {
            WGPULimits[] ret = new WGPULimits[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPULimits> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPULimits> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPULimits.BYTES;
            }

            @Override
            public WGPULimits next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPULimits ret = new WGPULimits(segment.asSlice(0, WGPULimits.BYTES));
                segment = segment.asSlice(WGPULimits.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPULimits allocate(Arena arena) {
        return new WGPULimits(arena.allocate(LAYOUT));
    }

    public static WGPULimits.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPULimits.Ptr(segment);
    }

    public static WGPULimits clone(Arena arena, WGPULimits src) {
        WGPULimits ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPULimits nextInChain(@Nullable IWGPUChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUChainedStruct.BYTES);
        return new WGPUChainedStruct.Ptr(s);
    }

    public @Nullable WGPUChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUChainedStruct(s);
    }

    public @Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @Unsigned int maxTextureDimension1d() {
        return segment.get(LAYOUT$maxTextureDimension1d, OFFSET$maxTextureDimension1d);
    }

    public WGPULimits maxTextureDimension1d(@Unsigned int value) {
        segment.set(LAYOUT$maxTextureDimension1d, OFFSET$maxTextureDimension1d, value);
        return this;
    }

    public @Unsigned int maxTextureDimension2d() {
        return segment.get(LAYOUT$maxTextureDimension2d, OFFSET$maxTextureDimension2d);
    }

    public WGPULimits maxTextureDimension2d(@Unsigned int value) {
        segment.set(LAYOUT$maxTextureDimension2d, OFFSET$maxTextureDimension2d, value);
        return this;
    }

    public @Unsigned int maxTextureDimension3d() {
        return segment.get(LAYOUT$maxTextureDimension3d, OFFSET$maxTextureDimension3d);
    }

    public WGPULimits maxTextureDimension3d(@Unsigned int value) {
        segment.set(LAYOUT$maxTextureDimension3d, OFFSET$maxTextureDimension3d, value);
        return this;
    }

    public @Unsigned int maxTextureArrayLayers() {
        return segment.get(LAYOUT$maxTextureArrayLayers, OFFSET$maxTextureArrayLayers);
    }

    public WGPULimits maxTextureArrayLayers(@Unsigned int value) {
        segment.set(LAYOUT$maxTextureArrayLayers, OFFSET$maxTextureArrayLayers, value);
        return this;
    }

    public @Unsigned int maxBindGroups() {
        return segment.get(LAYOUT$maxBindGroups, OFFSET$maxBindGroups);
    }

    public WGPULimits maxBindGroups(@Unsigned int value) {
        segment.set(LAYOUT$maxBindGroups, OFFSET$maxBindGroups, value);
        return this;
    }

    public @Unsigned int maxBindGroupsPlusVertexBuffers() {
        return segment.get(LAYOUT$maxBindGroupsPlusVertexBuffers, OFFSET$maxBindGroupsPlusVertexBuffers);
    }

    public WGPULimits maxBindGroupsPlusVertexBuffers(@Unsigned int value) {
        segment.set(LAYOUT$maxBindGroupsPlusVertexBuffers, OFFSET$maxBindGroupsPlusVertexBuffers, value);
        return this;
    }

    public @Unsigned int maxBindingsPerBindGroup() {
        return segment.get(LAYOUT$maxBindingsPerBindGroup, OFFSET$maxBindingsPerBindGroup);
    }

    public WGPULimits maxBindingsPerBindGroup(@Unsigned int value) {
        segment.set(LAYOUT$maxBindingsPerBindGroup, OFFSET$maxBindingsPerBindGroup, value);
        return this;
    }

    public @Unsigned int maxDynamicUniformBuffersPerPipelineLayout() {
        return segment.get(LAYOUT$maxDynamicUniformBuffersPerPipelineLayout, OFFSET$maxDynamicUniformBuffersPerPipelineLayout);
    }

    public WGPULimits maxDynamicUniformBuffersPerPipelineLayout(@Unsigned int value) {
        segment.set(LAYOUT$maxDynamicUniformBuffersPerPipelineLayout, OFFSET$maxDynamicUniformBuffersPerPipelineLayout, value);
        return this;
    }

    public @Unsigned int maxDynamicStorageBuffersPerPipelineLayout() {
        return segment.get(LAYOUT$maxDynamicStorageBuffersPerPipelineLayout, OFFSET$maxDynamicStorageBuffersPerPipelineLayout);
    }

    public WGPULimits maxDynamicStorageBuffersPerPipelineLayout(@Unsigned int value) {
        segment.set(LAYOUT$maxDynamicStorageBuffersPerPipelineLayout, OFFSET$maxDynamicStorageBuffersPerPipelineLayout, value);
        return this;
    }

    public @Unsigned int maxSampledTexturesPerShaderStage() {
        return segment.get(LAYOUT$maxSampledTexturesPerShaderStage, OFFSET$maxSampledTexturesPerShaderStage);
    }

    public WGPULimits maxSampledTexturesPerShaderStage(@Unsigned int value) {
        segment.set(LAYOUT$maxSampledTexturesPerShaderStage, OFFSET$maxSampledTexturesPerShaderStage, value);
        return this;
    }

    public @Unsigned int maxSamplersPerShaderStage() {
        return segment.get(LAYOUT$maxSamplersPerShaderStage, OFFSET$maxSamplersPerShaderStage);
    }

    public WGPULimits maxSamplersPerShaderStage(@Unsigned int value) {
        segment.set(LAYOUT$maxSamplersPerShaderStage, OFFSET$maxSamplersPerShaderStage, value);
        return this;
    }

    public @Unsigned int maxStorageBuffersPerShaderStage() {
        return segment.get(LAYOUT$maxStorageBuffersPerShaderStage, OFFSET$maxStorageBuffersPerShaderStage);
    }

    public WGPULimits maxStorageBuffersPerShaderStage(@Unsigned int value) {
        segment.set(LAYOUT$maxStorageBuffersPerShaderStage, OFFSET$maxStorageBuffersPerShaderStage, value);
        return this;
    }

    public @Unsigned int maxStorageTexturesPerShaderStage() {
        return segment.get(LAYOUT$maxStorageTexturesPerShaderStage, OFFSET$maxStorageTexturesPerShaderStage);
    }

    public WGPULimits maxStorageTexturesPerShaderStage(@Unsigned int value) {
        segment.set(LAYOUT$maxStorageTexturesPerShaderStage, OFFSET$maxStorageTexturesPerShaderStage, value);
        return this;
    }

    public @Unsigned int maxUniformBuffersPerShaderStage() {
        return segment.get(LAYOUT$maxUniformBuffersPerShaderStage, OFFSET$maxUniformBuffersPerShaderStage);
    }

    public WGPULimits maxUniformBuffersPerShaderStage(@Unsigned int value) {
        segment.set(LAYOUT$maxUniformBuffersPerShaderStage, OFFSET$maxUniformBuffersPerShaderStage, value);
        return this;
    }

    public @Unsigned long maxUniformBufferBindingSize() {
        return segment.get(LAYOUT$maxUniformBufferBindingSize, OFFSET$maxUniformBufferBindingSize);
    }

    public WGPULimits maxUniformBufferBindingSize(@Unsigned long value) {
        segment.set(LAYOUT$maxUniformBufferBindingSize, OFFSET$maxUniformBufferBindingSize, value);
        return this;
    }

    public @Unsigned long maxStorageBufferBindingSize() {
        return segment.get(LAYOUT$maxStorageBufferBindingSize, OFFSET$maxStorageBufferBindingSize);
    }

    public WGPULimits maxStorageBufferBindingSize(@Unsigned long value) {
        segment.set(LAYOUT$maxStorageBufferBindingSize, OFFSET$maxStorageBufferBindingSize, value);
        return this;
    }

    public @Unsigned int minUniformBufferOffsetAlignment() {
        return segment.get(LAYOUT$minUniformBufferOffsetAlignment, OFFSET$minUniformBufferOffsetAlignment);
    }

    public WGPULimits minUniformBufferOffsetAlignment(@Unsigned int value) {
        segment.set(LAYOUT$minUniformBufferOffsetAlignment, OFFSET$minUniformBufferOffsetAlignment, value);
        return this;
    }

    public @Unsigned int minStorageBufferOffsetAlignment() {
        return segment.get(LAYOUT$minStorageBufferOffsetAlignment, OFFSET$minStorageBufferOffsetAlignment);
    }

    public WGPULimits minStorageBufferOffsetAlignment(@Unsigned int value) {
        segment.set(LAYOUT$minStorageBufferOffsetAlignment, OFFSET$minStorageBufferOffsetAlignment, value);
        return this;
    }

    public @Unsigned int maxVertexBuffers() {
        return segment.get(LAYOUT$maxVertexBuffers, OFFSET$maxVertexBuffers);
    }

    public WGPULimits maxVertexBuffers(@Unsigned int value) {
        segment.set(LAYOUT$maxVertexBuffers, OFFSET$maxVertexBuffers, value);
        return this;
    }

    public @Unsigned long maxBufferSize() {
        return segment.get(LAYOUT$maxBufferSize, OFFSET$maxBufferSize);
    }

    public WGPULimits maxBufferSize(@Unsigned long value) {
        segment.set(LAYOUT$maxBufferSize, OFFSET$maxBufferSize, value);
        return this;
    }

    public @Unsigned int maxVertexAttributes() {
        return segment.get(LAYOUT$maxVertexAttributes, OFFSET$maxVertexAttributes);
    }

    public WGPULimits maxVertexAttributes(@Unsigned int value) {
        segment.set(LAYOUT$maxVertexAttributes, OFFSET$maxVertexAttributes, value);
        return this;
    }

    public @Unsigned int maxVertexBufferArrayStride() {
        return segment.get(LAYOUT$maxVertexBufferArrayStride, OFFSET$maxVertexBufferArrayStride);
    }

    public WGPULimits maxVertexBufferArrayStride(@Unsigned int value) {
        segment.set(LAYOUT$maxVertexBufferArrayStride, OFFSET$maxVertexBufferArrayStride, value);
        return this;
    }

    public @Unsigned int maxInterStageShaderVariables() {
        return segment.get(LAYOUT$maxInterStageShaderVariables, OFFSET$maxInterStageShaderVariables);
    }

    public WGPULimits maxInterStageShaderVariables(@Unsigned int value) {
        segment.set(LAYOUT$maxInterStageShaderVariables, OFFSET$maxInterStageShaderVariables, value);
        return this;
    }

    public @Unsigned int maxColorAttachments() {
        return segment.get(LAYOUT$maxColorAttachments, OFFSET$maxColorAttachments);
    }

    public WGPULimits maxColorAttachments(@Unsigned int value) {
        segment.set(LAYOUT$maxColorAttachments, OFFSET$maxColorAttachments, value);
        return this;
    }

    public @Unsigned int maxColorAttachmentBytesPerSample() {
        return segment.get(LAYOUT$maxColorAttachmentBytesPerSample, OFFSET$maxColorAttachmentBytesPerSample);
    }

    public WGPULimits maxColorAttachmentBytesPerSample(@Unsigned int value) {
        segment.set(LAYOUT$maxColorAttachmentBytesPerSample, OFFSET$maxColorAttachmentBytesPerSample, value);
        return this;
    }

    public @Unsigned int maxComputeWorkgroupStorageSize() {
        return segment.get(LAYOUT$maxComputeWorkgroupStorageSize, OFFSET$maxComputeWorkgroupStorageSize);
    }

    public WGPULimits maxComputeWorkgroupStorageSize(@Unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkgroupStorageSize, OFFSET$maxComputeWorkgroupStorageSize, value);
        return this;
    }

    public @Unsigned int maxComputeInvocationsPerWorkgroup() {
        return segment.get(LAYOUT$maxComputeInvocationsPerWorkgroup, OFFSET$maxComputeInvocationsPerWorkgroup);
    }

    public WGPULimits maxComputeInvocationsPerWorkgroup(@Unsigned int value) {
        segment.set(LAYOUT$maxComputeInvocationsPerWorkgroup, OFFSET$maxComputeInvocationsPerWorkgroup, value);
        return this;
    }

    public @Unsigned int maxComputeWorkgroupSizeX() {
        return segment.get(LAYOUT$maxComputeWorkgroupSizeX, OFFSET$maxComputeWorkgroupSizeX);
    }

    public WGPULimits maxComputeWorkgroupSizeX(@Unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkgroupSizeX, OFFSET$maxComputeWorkgroupSizeX, value);
        return this;
    }

    public @Unsigned int maxComputeWorkgroupSizeY() {
        return segment.get(LAYOUT$maxComputeWorkgroupSizeY, OFFSET$maxComputeWorkgroupSizeY);
    }

    public WGPULimits maxComputeWorkgroupSizeY(@Unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkgroupSizeY, OFFSET$maxComputeWorkgroupSizeY, value);
        return this;
    }

    public @Unsigned int maxComputeWorkgroupSizeZ() {
        return segment.get(LAYOUT$maxComputeWorkgroupSizeZ, OFFSET$maxComputeWorkgroupSizeZ);
    }

    public WGPULimits maxComputeWorkgroupSizeZ(@Unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkgroupSizeZ, OFFSET$maxComputeWorkgroupSizeZ, value);
        return this;
    }

    public @Unsigned int maxComputeWorkgroupsPerDimension() {
        return segment.get(LAYOUT$maxComputeWorkgroupsPerDimension, OFFSET$maxComputeWorkgroupsPerDimension);
    }

    public WGPULimits maxComputeWorkgroupsPerDimension(@Unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkgroupsPerDimension, OFFSET$maxComputeWorkgroupsPerDimension, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("maxTextureDimension1d"),
        ValueLayout.JAVA_INT.withName("maxTextureDimension2d"),
        ValueLayout.JAVA_INT.withName("maxTextureDimension3d"),
        ValueLayout.JAVA_INT.withName("maxTextureArrayLayers"),
        ValueLayout.JAVA_INT.withName("maxBindGroups"),
        ValueLayout.JAVA_INT.withName("maxBindGroupsPlusVertexBuffers"),
        ValueLayout.JAVA_INT.withName("maxBindingsPerBindGroup"),
        ValueLayout.JAVA_INT.withName("maxDynamicUniformBuffersPerPipelineLayout"),
        ValueLayout.JAVA_INT.withName("maxDynamicStorageBuffersPerPipelineLayout"),
        ValueLayout.JAVA_INT.withName("maxSampledTexturesPerShaderStage"),
        ValueLayout.JAVA_INT.withName("maxSamplersPerShaderStage"),
        ValueLayout.JAVA_INT.withName("maxStorageBuffersPerShaderStage"),
        ValueLayout.JAVA_INT.withName("maxStorageTexturesPerShaderStage"),
        ValueLayout.JAVA_INT.withName("maxUniformBuffersPerShaderStage"),
        ValueLayout.JAVA_LONG.withName("maxUniformBufferBindingSize"),
        ValueLayout.JAVA_LONG.withName("maxStorageBufferBindingSize"),
        ValueLayout.JAVA_INT.withName("minUniformBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minStorageBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("maxVertexBuffers"),
        ValueLayout.JAVA_LONG.withName("maxBufferSize"),
        ValueLayout.JAVA_INT.withName("maxVertexAttributes"),
        ValueLayout.JAVA_INT.withName("maxVertexBufferArrayStride"),
        ValueLayout.JAVA_INT.withName("maxInterStageShaderVariables"),
        ValueLayout.JAVA_INT.withName("maxColorAttachments"),
        ValueLayout.JAVA_INT.withName("maxColorAttachmentBytesPerSample"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupStorageSize"),
        ValueLayout.JAVA_INT.withName("maxComputeInvocationsPerWorkgroup"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSizeX"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSizeY"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSizeZ"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupsPerDimension")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$maxTextureDimension1d = PathElement.groupElement("maxTextureDimension1d");
    public static final PathElement PATH$maxTextureDimension2d = PathElement.groupElement("maxTextureDimension2d");
    public static final PathElement PATH$maxTextureDimension3d = PathElement.groupElement("maxTextureDimension3d");
    public static final PathElement PATH$maxTextureArrayLayers = PathElement.groupElement("maxTextureArrayLayers");
    public static final PathElement PATH$maxBindGroups = PathElement.groupElement("maxBindGroups");
    public static final PathElement PATH$maxBindGroupsPlusVertexBuffers = PathElement.groupElement("maxBindGroupsPlusVertexBuffers");
    public static final PathElement PATH$maxBindingsPerBindGroup = PathElement.groupElement("maxBindingsPerBindGroup");
    public static final PathElement PATH$maxDynamicUniformBuffersPerPipelineLayout = PathElement.groupElement("maxDynamicUniformBuffersPerPipelineLayout");
    public static final PathElement PATH$maxDynamicStorageBuffersPerPipelineLayout = PathElement.groupElement("maxDynamicStorageBuffersPerPipelineLayout");
    public static final PathElement PATH$maxSampledTexturesPerShaderStage = PathElement.groupElement("maxSampledTexturesPerShaderStage");
    public static final PathElement PATH$maxSamplersPerShaderStage = PathElement.groupElement("maxSamplersPerShaderStage");
    public static final PathElement PATH$maxStorageBuffersPerShaderStage = PathElement.groupElement("maxStorageBuffersPerShaderStage");
    public static final PathElement PATH$maxStorageTexturesPerShaderStage = PathElement.groupElement("maxStorageTexturesPerShaderStage");
    public static final PathElement PATH$maxUniformBuffersPerShaderStage = PathElement.groupElement("maxUniformBuffersPerShaderStage");
    public static final PathElement PATH$maxUniformBufferBindingSize = PathElement.groupElement("maxUniformBufferBindingSize");
    public static final PathElement PATH$maxStorageBufferBindingSize = PathElement.groupElement("maxStorageBufferBindingSize");
    public static final PathElement PATH$minUniformBufferOffsetAlignment = PathElement.groupElement("minUniformBufferOffsetAlignment");
    public static final PathElement PATH$minStorageBufferOffsetAlignment = PathElement.groupElement("minStorageBufferOffsetAlignment");
    public static final PathElement PATH$maxVertexBuffers = PathElement.groupElement("maxVertexBuffers");
    public static final PathElement PATH$maxBufferSize = PathElement.groupElement("maxBufferSize");
    public static final PathElement PATH$maxVertexAttributes = PathElement.groupElement("maxVertexAttributes");
    public static final PathElement PATH$maxVertexBufferArrayStride = PathElement.groupElement("maxVertexBufferArrayStride");
    public static final PathElement PATH$maxInterStageShaderVariables = PathElement.groupElement("maxInterStageShaderVariables");
    public static final PathElement PATH$maxColorAttachments = PathElement.groupElement("maxColorAttachments");
    public static final PathElement PATH$maxColorAttachmentBytesPerSample = PathElement.groupElement("maxColorAttachmentBytesPerSample");
    public static final PathElement PATH$maxComputeWorkgroupStorageSize = PathElement.groupElement("maxComputeWorkgroupStorageSize");
    public static final PathElement PATH$maxComputeInvocationsPerWorkgroup = PathElement.groupElement("maxComputeInvocationsPerWorkgroup");
    public static final PathElement PATH$maxComputeWorkgroupSizeX = PathElement.groupElement("maxComputeWorkgroupSizeX");
    public static final PathElement PATH$maxComputeWorkgroupSizeY = PathElement.groupElement("maxComputeWorkgroupSizeY");
    public static final PathElement PATH$maxComputeWorkgroupSizeZ = PathElement.groupElement("maxComputeWorkgroupSizeZ");
    public static final PathElement PATH$maxComputeWorkgroupsPerDimension = PathElement.groupElement("maxComputeWorkgroupsPerDimension");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$maxTextureDimension1d = (OfInt) LAYOUT.select(PATH$maxTextureDimension1d);
    public static final OfInt LAYOUT$maxTextureDimension2d = (OfInt) LAYOUT.select(PATH$maxTextureDimension2d);
    public static final OfInt LAYOUT$maxTextureDimension3d = (OfInt) LAYOUT.select(PATH$maxTextureDimension3d);
    public static final OfInt LAYOUT$maxTextureArrayLayers = (OfInt) LAYOUT.select(PATH$maxTextureArrayLayers);
    public static final OfInt LAYOUT$maxBindGroups = (OfInt) LAYOUT.select(PATH$maxBindGroups);
    public static final OfInt LAYOUT$maxBindGroupsPlusVertexBuffers = (OfInt) LAYOUT.select(PATH$maxBindGroupsPlusVertexBuffers);
    public static final OfInt LAYOUT$maxBindingsPerBindGroup = (OfInt) LAYOUT.select(PATH$maxBindingsPerBindGroup);
    public static final OfInt LAYOUT$maxDynamicUniformBuffersPerPipelineLayout = (OfInt) LAYOUT.select(PATH$maxDynamicUniformBuffersPerPipelineLayout);
    public static final OfInt LAYOUT$maxDynamicStorageBuffersPerPipelineLayout = (OfInt) LAYOUT.select(PATH$maxDynamicStorageBuffersPerPipelineLayout);
    public static final OfInt LAYOUT$maxSampledTexturesPerShaderStage = (OfInt) LAYOUT.select(PATH$maxSampledTexturesPerShaderStage);
    public static final OfInt LAYOUT$maxSamplersPerShaderStage = (OfInt) LAYOUT.select(PATH$maxSamplersPerShaderStage);
    public static final OfInt LAYOUT$maxStorageBuffersPerShaderStage = (OfInt) LAYOUT.select(PATH$maxStorageBuffersPerShaderStage);
    public static final OfInt LAYOUT$maxStorageTexturesPerShaderStage = (OfInt) LAYOUT.select(PATH$maxStorageTexturesPerShaderStage);
    public static final OfInt LAYOUT$maxUniformBuffersPerShaderStage = (OfInt) LAYOUT.select(PATH$maxUniformBuffersPerShaderStage);
    public static final OfLong LAYOUT$maxUniformBufferBindingSize = (OfLong) LAYOUT.select(PATH$maxUniformBufferBindingSize);
    public static final OfLong LAYOUT$maxStorageBufferBindingSize = (OfLong) LAYOUT.select(PATH$maxStorageBufferBindingSize);
    public static final OfInt LAYOUT$minUniformBufferOffsetAlignment = (OfInt) LAYOUT.select(PATH$minUniformBufferOffsetAlignment);
    public static final OfInt LAYOUT$minStorageBufferOffsetAlignment = (OfInt) LAYOUT.select(PATH$minStorageBufferOffsetAlignment);
    public static final OfInt LAYOUT$maxVertexBuffers = (OfInt) LAYOUT.select(PATH$maxVertexBuffers);
    public static final OfLong LAYOUT$maxBufferSize = (OfLong) LAYOUT.select(PATH$maxBufferSize);
    public static final OfInt LAYOUT$maxVertexAttributes = (OfInt) LAYOUT.select(PATH$maxVertexAttributes);
    public static final OfInt LAYOUT$maxVertexBufferArrayStride = (OfInt) LAYOUT.select(PATH$maxVertexBufferArrayStride);
    public static final OfInt LAYOUT$maxInterStageShaderVariables = (OfInt) LAYOUT.select(PATH$maxInterStageShaderVariables);
    public static final OfInt LAYOUT$maxColorAttachments = (OfInt) LAYOUT.select(PATH$maxColorAttachments);
    public static final OfInt LAYOUT$maxColorAttachmentBytesPerSample = (OfInt) LAYOUT.select(PATH$maxColorAttachmentBytesPerSample);
    public static final OfInt LAYOUT$maxComputeWorkgroupStorageSize = (OfInt) LAYOUT.select(PATH$maxComputeWorkgroupStorageSize);
    public static final OfInt LAYOUT$maxComputeInvocationsPerWorkgroup = (OfInt) LAYOUT.select(PATH$maxComputeInvocationsPerWorkgroup);
    public static final OfInt LAYOUT$maxComputeWorkgroupSizeX = (OfInt) LAYOUT.select(PATH$maxComputeWorkgroupSizeX);
    public static final OfInt LAYOUT$maxComputeWorkgroupSizeY = (OfInt) LAYOUT.select(PATH$maxComputeWorkgroupSizeY);
    public static final OfInt LAYOUT$maxComputeWorkgroupSizeZ = (OfInt) LAYOUT.select(PATH$maxComputeWorkgroupSizeZ);
    public static final OfInt LAYOUT$maxComputeWorkgroupsPerDimension = (OfInt) LAYOUT.select(PATH$maxComputeWorkgroupsPerDimension);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$maxTextureDimension1d = LAYOUT$maxTextureDimension1d.byteSize();
    public static final long SIZE$maxTextureDimension2d = LAYOUT$maxTextureDimension2d.byteSize();
    public static final long SIZE$maxTextureDimension3d = LAYOUT$maxTextureDimension3d.byteSize();
    public static final long SIZE$maxTextureArrayLayers = LAYOUT$maxTextureArrayLayers.byteSize();
    public static final long SIZE$maxBindGroups = LAYOUT$maxBindGroups.byteSize();
    public static final long SIZE$maxBindGroupsPlusVertexBuffers = LAYOUT$maxBindGroupsPlusVertexBuffers.byteSize();
    public static final long SIZE$maxBindingsPerBindGroup = LAYOUT$maxBindingsPerBindGroup.byteSize();
    public static final long SIZE$maxDynamicUniformBuffersPerPipelineLayout = LAYOUT$maxDynamicUniformBuffersPerPipelineLayout.byteSize();
    public static final long SIZE$maxDynamicStorageBuffersPerPipelineLayout = LAYOUT$maxDynamicStorageBuffersPerPipelineLayout.byteSize();
    public static final long SIZE$maxSampledTexturesPerShaderStage = LAYOUT$maxSampledTexturesPerShaderStage.byteSize();
    public static final long SIZE$maxSamplersPerShaderStage = LAYOUT$maxSamplersPerShaderStage.byteSize();
    public static final long SIZE$maxStorageBuffersPerShaderStage = LAYOUT$maxStorageBuffersPerShaderStage.byteSize();
    public static final long SIZE$maxStorageTexturesPerShaderStage = LAYOUT$maxStorageTexturesPerShaderStage.byteSize();
    public static final long SIZE$maxUniformBuffersPerShaderStage = LAYOUT$maxUniformBuffersPerShaderStage.byteSize();
    public static final long SIZE$maxUniformBufferBindingSize = LAYOUT$maxUniformBufferBindingSize.byteSize();
    public static final long SIZE$maxStorageBufferBindingSize = LAYOUT$maxStorageBufferBindingSize.byteSize();
    public static final long SIZE$minUniformBufferOffsetAlignment = LAYOUT$minUniformBufferOffsetAlignment.byteSize();
    public static final long SIZE$minStorageBufferOffsetAlignment = LAYOUT$minStorageBufferOffsetAlignment.byteSize();
    public static final long SIZE$maxVertexBuffers = LAYOUT$maxVertexBuffers.byteSize();
    public static final long SIZE$maxBufferSize = LAYOUT$maxBufferSize.byteSize();
    public static final long SIZE$maxVertexAttributes = LAYOUT$maxVertexAttributes.byteSize();
    public static final long SIZE$maxVertexBufferArrayStride = LAYOUT$maxVertexBufferArrayStride.byteSize();
    public static final long SIZE$maxInterStageShaderVariables = LAYOUT$maxInterStageShaderVariables.byteSize();
    public static final long SIZE$maxColorAttachments = LAYOUT$maxColorAttachments.byteSize();
    public static final long SIZE$maxColorAttachmentBytesPerSample = LAYOUT$maxColorAttachmentBytesPerSample.byteSize();
    public static final long SIZE$maxComputeWorkgroupStorageSize = LAYOUT$maxComputeWorkgroupStorageSize.byteSize();
    public static final long SIZE$maxComputeInvocationsPerWorkgroup = LAYOUT$maxComputeInvocationsPerWorkgroup.byteSize();
    public static final long SIZE$maxComputeWorkgroupSizeX = LAYOUT$maxComputeWorkgroupSizeX.byteSize();
    public static final long SIZE$maxComputeWorkgroupSizeY = LAYOUT$maxComputeWorkgroupSizeY.byteSize();
    public static final long SIZE$maxComputeWorkgroupSizeZ = LAYOUT$maxComputeWorkgroupSizeZ.byteSize();
    public static final long SIZE$maxComputeWorkgroupsPerDimension = LAYOUT$maxComputeWorkgroupsPerDimension.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$maxTextureDimension1d = LAYOUT.byteOffset(PATH$maxTextureDimension1d);
    public static final long OFFSET$maxTextureDimension2d = LAYOUT.byteOffset(PATH$maxTextureDimension2d);
    public static final long OFFSET$maxTextureDimension3d = LAYOUT.byteOffset(PATH$maxTextureDimension3d);
    public static final long OFFSET$maxTextureArrayLayers = LAYOUT.byteOffset(PATH$maxTextureArrayLayers);
    public static final long OFFSET$maxBindGroups = LAYOUT.byteOffset(PATH$maxBindGroups);
    public static final long OFFSET$maxBindGroupsPlusVertexBuffers = LAYOUT.byteOffset(PATH$maxBindGroupsPlusVertexBuffers);
    public static final long OFFSET$maxBindingsPerBindGroup = LAYOUT.byteOffset(PATH$maxBindingsPerBindGroup);
    public static final long OFFSET$maxDynamicUniformBuffersPerPipelineLayout = LAYOUT.byteOffset(PATH$maxDynamicUniformBuffersPerPipelineLayout);
    public static final long OFFSET$maxDynamicStorageBuffersPerPipelineLayout = LAYOUT.byteOffset(PATH$maxDynamicStorageBuffersPerPipelineLayout);
    public static final long OFFSET$maxSampledTexturesPerShaderStage = LAYOUT.byteOffset(PATH$maxSampledTexturesPerShaderStage);
    public static final long OFFSET$maxSamplersPerShaderStage = LAYOUT.byteOffset(PATH$maxSamplersPerShaderStage);
    public static final long OFFSET$maxStorageBuffersPerShaderStage = LAYOUT.byteOffset(PATH$maxStorageBuffersPerShaderStage);
    public static final long OFFSET$maxStorageTexturesPerShaderStage = LAYOUT.byteOffset(PATH$maxStorageTexturesPerShaderStage);
    public static final long OFFSET$maxUniformBuffersPerShaderStage = LAYOUT.byteOffset(PATH$maxUniformBuffersPerShaderStage);
    public static final long OFFSET$maxUniformBufferBindingSize = LAYOUT.byteOffset(PATH$maxUniformBufferBindingSize);
    public static final long OFFSET$maxStorageBufferBindingSize = LAYOUT.byteOffset(PATH$maxStorageBufferBindingSize);
    public static final long OFFSET$minUniformBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minUniformBufferOffsetAlignment);
    public static final long OFFSET$minStorageBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minStorageBufferOffsetAlignment);
    public static final long OFFSET$maxVertexBuffers = LAYOUT.byteOffset(PATH$maxVertexBuffers);
    public static final long OFFSET$maxBufferSize = LAYOUT.byteOffset(PATH$maxBufferSize);
    public static final long OFFSET$maxVertexAttributes = LAYOUT.byteOffset(PATH$maxVertexAttributes);
    public static final long OFFSET$maxVertexBufferArrayStride = LAYOUT.byteOffset(PATH$maxVertexBufferArrayStride);
    public static final long OFFSET$maxInterStageShaderVariables = LAYOUT.byteOffset(PATH$maxInterStageShaderVariables);
    public static final long OFFSET$maxColorAttachments = LAYOUT.byteOffset(PATH$maxColorAttachments);
    public static final long OFFSET$maxColorAttachmentBytesPerSample = LAYOUT.byteOffset(PATH$maxColorAttachmentBytesPerSample);
    public static final long OFFSET$maxComputeWorkgroupStorageSize = LAYOUT.byteOffset(PATH$maxComputeWorkgroupStorageSize);
    public static final long OFFSET$maxComputeInvocationsPerWorkgroup = LAYOUT.byteOffset(PATH$maxComputeInvocationsPerWorkgroup);
    public static final long OFFSET$maxComputeWorkgroupSizeX = LAYOUT.byteOffset(PATH$maxComputeWorkgroupSizeX);
    public static final long OFFSET$maxComputeWorkgroupSizeY = LAYOUT.byteOffset(PATH$maxComputeWorkgroupSizeY);
    public static final long OFFSET$maxComputeWorkgroupSizeZ = LAYOUT.byteOffset(PATH$maxComputeWorkgroupSizeZ);
    public static final long OFFSET$maxComputeWorkgroupsPerDimension = LAYOUT.byteOffset(PATH$maxComputeWorkgroupsPerDimension);
}

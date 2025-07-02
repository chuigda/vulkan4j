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

/// Represents a pointer to a {@code WGPUHubReport} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUHubReport {
///     WGPURegistryReport adapters; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="adapters" target="#adapters"
///     WGPURegistryReport devices; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="devices" target="#devices"
///     WGPURegistryReport queues; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="queues" target="#queues"
///     WGPURegistryReport pipelineLayouts; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="pipelineLayouts" target="#pipelineLayouts"
///     WGPURegistryReport shaderModules; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="shaderModules" target="#shaderModules"
///     WGPURegistryReport bindGroupLayouts; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="bindGroupLayouts" target="#bindGroupLayouts"
///     WGPURegistryReport bindGroups; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="bindGroups" target="#bindGroups"
///     WGPURegistryReport commandBuffers; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="commandBuffers" target="#commandBuffers"
///     WGPURegistryReport renderBundles; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="renderBundles" target="#renderBundles"
///     WGPURegistryReport renderPipelines; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="renderPipelines" target="#renderPipelines"
///     WGPURegistryReport computePipelines; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="computePipelines" target="#computePipelines"
///     WGPURegistryReport pipelineCaches; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="pipelineCaches" target="#pipelineCaches"
///     WGPURegistryReport querySets; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="querySets" target="#querySets"
///     WGPURegistryReport buffers; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="buffers" target="#buffers"
///     WGPURegistryReport textures; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="textures" target="#textures"
///     WGPURegistryReport textureViews; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="textureViews" target="#textureViews"
///     WGPURegistryReport samplers; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="samplers" target="#samplers"
/// } WGPUHubReport;
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
public record WGPUHubReport(@NotNull MemorySegment segment) implements IWGPUHubReport {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUHubReport}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUHubReport to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUHubReport.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUHubReport, Iterable<WGPUHubReport> {
        public long size() {
            return segment.byteSize() / WGPUHubReport.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUHubReport at(long index) {
            return new WGPUHubReport(segment.asSlice(index * WGPUHubReport.BYTES, WGPUHubReport.BYTES));
        }

        public WGPUHubReport.Ptr at(long index, @NotNull Consumer<@NotNull WGPUHubReport> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUHubReport value) {
            MemorySegment s = segment.asSlice(index * WGPUHubReport.BYTES, WGPUHubReport.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUHubReport.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUHubReport.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUHubReport.BYTES,
                (end - start) * WGPUHubReport.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUHubReport.BYTES));
        }

        public WGPUHubReport[] toArray() {
            WGPUHubReport[] ret = new WGPUHubReport[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUHubReport> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUHubReport> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUHubReport.BYTES;
            }

            @Override
            public WGPUHubReport next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUHubReport ret = new WGPUHubReport(segment.asSlice(0, WGPUHubReport.BYTES));
                segment = segment.asSlice(WGPUHubReport.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUHubReport allocate(Arena arena) {
        return new WGPUHubReport(arena.allocate(LAYOUT));
    }

    public static WGPUHubReport.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUHubReport.Ptr(segment);
    }

    public static WGPUHubReport clone(Arena arena, WGPUHubReport src) {
        WGPUHubReport ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPURegistryReport adapters() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$adapters, LAYOUT$adapters));
    }

    public WGPUHubReport adapters(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$adapters, SIZE$adapters);
        return this;
    }

    public WGPUHubReport adapters(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(adapters());
        return this;
    }

    public @NotNull WGPURegistryReport devices() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$devices, LAYOUT$devices));
    }

    public WGPUHubReport devices(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$devices, SIZE$devices);
        return this;
    }

    public WGPUHubReport devices(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(devices());
        return this;
    }

    public @NotNull WGPURegistryReport queues() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$queues, LAYOUT$queues));
    }

    public WGPUHubReport queues(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$queues, SIZE$queues);
        return this;
    }

    public WGPUHubReport queues(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(queues());
        return this;
    }

    public @NotNull WGPURegistryReport pipelineLayouts() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$pipelineLayouts, LAYOUT$pipelineLayouts));
    }

    public WGPUHubReport pipelineLayouts(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipelineLayouts, SIZE$pipelineLayouts);
        return this;
    }

    public WGPUHubReport pipelineLayouts(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(pipelineLayouts());
        return this;
    }

    public @NotNull WGPURegistryReport shaderModules() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$shaderModules, LAYOUT$shaderModules));
    }

    public WGPUHubReport shaderModules(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shaderModules, SIZE$shaderModules);
        return this;
    }

    public WGPUHubReport shaderModules(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(shaderModules());
        return this;
    }

    public @NotNull WGPURegistryReport bindGroupLayouts() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$bindGroupLayouts, LAYOUT$bindGroupLayouts));
    }

    public WGPUHubReport bindGroupLayouts(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$bindGroupLayouts, SIZE$bindGroupLayouts);
        return this;
    }

    public WGPUHubReport bindGroupLayouts(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(bindGroupLayouts());
        return this;
    }

    public @NotNull WGPURegistryReport bindGroups() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$bindGroups, LAYOUT$bindGroups));
    }

    public WGPUHubReport bindGroups(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$bindGroups, SIZE$bindGroups);
        return this;
    }

    public WGPUHubReport bindGroups(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(bindGroups());
        return this;
    }

    public @NotNull WGPURegistryReport commandBuffers() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$commandBuffers, LAYOUT$commandBuffers));
    }

    public WGPUHubReport commandBuffers(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$commandBuffers, SIZE$commandBuffers);
        return this;
    }

    public WGPUHubReport commandBuffers(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(commandBuffers());
        return this;
    }

    public @NotNull WGPURegistryReport renderBundles() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$renderBundles, LAYOUT$renderBundles));
    }

    public WGPUHubReport renderBundles(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderBundles, SIZE$renderBundles);
        return this;
    }

    public WGPUHubReport renderBundles(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(renderBundles());
        return this;
    }

    public @NotNull WGPURegistryReport renderPipelines() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$renderPipelines, LAYOUT$renderPipelines));
    }

    public WGPUHubReport renderPipelines(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderPipelines, SIZE$renderPipelines);
        return this;
    }

    public WGPUHubReport renderPipelines(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(renderPipelines());
        return this;
    }

    public @NotNull WGPURegistryReport computePipelines() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$computePipelines, LAYOUT$computePipelines));
    }

    public WGPUHubReport computePipelines(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$computePipelines, SIZE$computePipelines);
        return this;
    }

    public WGPUHubReport computePipelines(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(computePipelines());
        return this;
    }

    public @NotNull WGPURegistryReport pipelineCaches() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$pipelineCaches, LAYOUT$pipelineCaches));
    }

    public WGPUHubReport pipelineCaches(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipelineCaches, SIZE$pipelineCaches);
        return this;
    }

    public WGPUHubReport pipelineCaches(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(pipelineCaches());
        return this;
    }

    public @NotNull WGPURegistryReport querySets() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$querySets, LAYOUT$querySets));
    }

    public WGPUHubReport querySets(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$querySets, SIZE$querySets);
        return this;
    }

    public WGPUHubReport querySets(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(querySets());
        return this;
    }

    public @NotNull WGPURegistryReport buffers() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$buffers, LAYOUT$buffers));
    }

    public WGPUHubReport buffers(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$buffers, SIZE$buffers);
        return this;
    }

    public WGPUHubReport buffers(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(buffers());
        return this;
    }

    public @NotNull WGPURegistryReport textures() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$textures, LAYOUT$textures));
    }

    public WGPUHubReport textures(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$textures, SIZE$textures);
        return this;
    }

    public WGPUHubReport textures(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(textures());
        return this;
    }

    public @NotNull WGPURegistryReport textureViews() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$textureViews, LAYOUT$textureViews));
    }

    public WGPUHubReport textureViews(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$textureViews, SIZE$textureViews);
        return this;
    }

    public WGPUHubReport textureViews(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(textureViews());
        return this;
    }

    public @NotNull WGPURegistryReport samplers() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$samplers, LAYOUT$samplers));
    }

    public WGPUHubReport samplers(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$samplers, SIZE$samplers);
        return this;
    }

    public WGPUHubReport samplers(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(samplers());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPURegistryReport.LAYOUT.withName("adapters"),
        WGPURegistryReport.LAYOUT.withName("devices"),
        WGPURegistryReport.LAYOUT.withName("queues"),
        WGPURegistryReport.LAYOUT.withName("pipelineLayouts"),
        WGPURegistryReport.LAYOUT.withName("shaderModules"),
        WGPURegistryReport.LAYOUT.withName("bindGroupLayouts"),
        WGPURegistryReport.LAYOUT.withName("bindGroups"),
        WGPURegistryReport.LAYOUT.withName("commandBuffers"),
        WGPURegistryReport.LAYOUT.withName("renderBundles"),
        WGPURegistryReport.LAYOUT.withName("renderPipelines"),
        WGPURegistryReport.LAYOUT.withName("computePipelines"),
        WGPURegistryReport.LAYOUT.withName("pipelineCaches"),
        WGPURegistryReport.LAYOUT.withName("querySets"),
        WGPURegistryReport.LAYOUT.withName("buffers"),
        WGPURegistryReport.LAYOUT.withName("textures"),
        WGPURegistryReport.LAYOUT.withName("textureViews"),
        WGPURegistryReport.LAYOUT.withName("samplers")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$adapters = PathElement.groupElement("adapters");
    public static final PathElement PATH$devices = PathElement.groupElement("devices");
    public static final PathElement PATH$queues = PathElement.groupElement("queues");
    public static final PathElement PATH$pipelineLayouts = PathElement.groupElement("pipelineLayouts");
    public static final PathElement PATH$shaderModules = PathElement.groupElement("shaderModules");
    public static final PathElement PATH$bindGroupLayouts = PathElement.groupElement("bindGroupLayouts");
    public static final PathElement PATH$bindGroups = PathElement.groupElement("bindGroups");
    public static final PathElement PATH$commandBuffers = PathElement.groupElement("commandBuffers");
    public static final PathElement PATH$renderBundles = PathElement.groupElement("renderBundles");
    public static final PathElement PATH$renderPipelines = PathElement.groupElement("renderPipelines");
    public static final PathElement PATH$computePipelines = PathElement.groupElement("computePipelines");
    public static final PathElement PATH$pipelineCaches = PathElement.groupElement("pipelineCaches");
    public static final PathElement PATH$querySets = PathElement.groupElement("querySets");
    public static final PathElement PATH$buffers = PathElement.groupElement("buffers");
    public static final PathElement PATH$textures = PathElement.groupElement("textures");
    public static final PathElement PATH$textureViews = PathElement.groupElement("textureViews");
    public static final PathElement PATH$samplers = PathElement.groupElement("samplers");

    public static final StructLayout LAYOUT$adapters = (StructLayout) LAYOUT.select(PATH$adapters);
    public static final StructLayout LAYOUT$devices = (StructLayout) LAYOUT.select(PATH$devices);
    public static final StructLayout LAYOUT$queues = (StructLayout) LAYOUT.select(PATH$queues);
    public static final StructLayout LAYOUT$pipelineLayouts = (StructLayout) LAYOUT.select(PATH$pipelineLayouts);
    public static final StructLayout LAYOUT$shaderModules = (StructLayout) LAYOUT.select(PATH$shaderModules);
    public static final StructLayout LAYOUT$bindGroupLayouts = (StructLayout) LAYOUT.select(PATH$bindGroupLayouts);
    public static final StructLayout LAYOUT$bindGroups = (StructLayout) LAYOUT.select(PATH$bindGroups);
    public static final StructLayout LAYOUT$commandBuffers = (StructLayout) LAYOUT.select(PATH$commandBuffers);
    public static final StructLayout LAYOUT$renderBundles = (StructLayout) LAYOUT.select(PATH$renderBundles);
    public static final StructLayout LAYOUT$renderPipelines = (StructLayout) LAYOUT.select(PATH$renderPipelines);
    public static final StructLayout LAYOUT$computePipelines = (StructLayout) LAYOUT.select(PATH$computePipelines);
    public static final StructLayout LAYOUT$pipelineCaches = (StructLayout) LAYOUT.select(PATH$pipelineCaches);
    public static final StructLayout LAYOUT$querySets = (StructLayout) LAYOUT.select(PATH$querySets);
    public static final StructLayout LAYOUT$buffers = (StructLayout) LAYOUT.select(PATH$buffers);
    public static final StructLayout LAYOUT$textures = (StructLayout) LAYOUT.select(PATH$textures);
    public static final StructLayout LAYOUT$textureViews = (StructLayout) LAYOUT.select(PATH$textureViews);
    public static final StructLayout LAYOUT$samplers = (StructLayout) LAYOUT.select(PATH$samplers);

    public static final long SIZE$adapters = LAYOUT$adapters.byteSize();
    public static final long SIZE$devices = LAYOUT$devices.byteSize();
    public static final long SIZE$queues = LAYOUT$queues.byteSize();
    public static final long SIZE$pipelineLayouts = LAYOUT$pipelineLayouts.byteSize();
    public static final long SIZE$shaderModules = LAYOUT$shaderModules.byteSize();
    public static final long SIZE$bindGroupLayouts = LAYOUT$bindGroupLayouts.byteSize();
    public static final long SIZE$bindGroups = LAYOUT$bindGroups.byteSize();
    public static final long SIZE$commandBuffers = LAYOUT$commandBuffers.byteSize();
    public static final long SIZE$renderBundles = LAYOUT$renderBundles.byteSize();
    public static final long SIZE$renderPipelines = LAYOUT$renderPipelines.byteSize();
    public static final long SIZE$computePipelines = LAYOUT$computePipelines.byteSize();
    public static final long SIZE$pipelineCaches = LAYOUT$pipelineCaches.byteSize();
    public static final long SIZE$querySets = LAYOUT$querySets.byteSize();
    public static final long SIZE$buffers = LAYOUT$buffers.byteSize();
    public static final long SIZE$textures = LAYOUT$textures.byteSize();
    public static final long SIZE$textureViews = LAYOUT$textureViews.byteSize();
    public static final long SIZE$samplers = LAYOUT$samplers.byteSize();

    public static final long OFFSET$adapters = LAYOUT.byteOffset(PATH$adapters);
    public static final long OFFSET$devices = LAYOUT.byteOffset(PATH$devices);
    public static final long OFFSET$queues = LAYOUT.byteOffset(PATH$queues);
    public static final long OFFSET$pipelineLayouts = LAYOUT.byteOffset(PATH$pipelineLayouts);
    public static final long OFFSET$shaderModules = LAYOUT.byteOffset(PATH$shaderModules);
    public static final long OFFSET$bindGroupLayouts = LAYOUT.byteOffset(PATH$bindGroupLayouts);
    public static final long OFFSET$bindGroups = LAYOUT.byteOffset(PATH$bindGroups);
    public static final long OFFSET$commandBuffers = LAYOUT.byteOffset(PATH$commandBuffers);
    public static final long OFFSET$renderBundles = LAYOUT.byteOffset(PATH$renderBundles);
    public static final long OFFSET$renderPipelines = LAYOUT.byteOffset(PATH$renderPipelines);
    public static final long OFFSET$computePipelines = LAYOUT.byteOffset(PATH$computePipelines);
    public static final long OFFSET$pipelineCaches = LAYOUT.byteOffset(PATH$pipelineCaches);
    public static final long OFFSET$querySets = LAYOUT.byteOffset(PATH$querySets);
    public static final long OFFSET$buffers = LAYOUT.byteOffset(PATH$buffers);
    public static final long OFFSET$textures = LAYOUT.byteOffset(PATH$textures);
    public static final long OFFSET$textureViews = LAYOUT.byteOffset(PATH$textureViews);
    public static final long OFFSET$samplers = LAYOUT.byteOffset(PATH$samplers);
}

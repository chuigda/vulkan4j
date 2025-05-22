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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetShaderInfoEXT.html"><code>VkIndirectExecutionSetShaderInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectExecutionSetShaderInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t shaderCount; // @link substring="shaderCount" target="#shaderCount"
///     VkShaderEXT const* pInitialShaders; // @link substring="VkShaderEXT" target="VkShaderEXT" @link substring="pInitialShaders" target="#pInitialShaders"
///     VkIndirectExecutionSetShaderLayoutInfoEXT const* pSetLayoutInfos; // optional // @link substring="VkIndirectExecutionSetShaderLayoutInfoEXT" target="VkIndirectExecutionSetShaderLayoutInfoEXT" @link substring="pSetLayoutInfos" target="#pSetLayoutInfos"
///     uint32_t maxShaderCount; // @link substring="maxShaderCount" target="#maxShaderCount"
///     uint32_t pushConstantRangeCount; // optional // @link substring="pushConstantRangeCount" target="#pushConstantRangeCount"
///     VkPushConstantRange const* pPushConstantRanges; // @link substring="VkPushConstantRange" target="VkPushConstantRange" @link substring="pPushConstantRanges" target="#pPushConstantRanges"
/// } VkIndirectExecutionSetShaderInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT`
///
/// The {@code allocate} ({@link VkIndirectExecutionSetShaderInfoEXT#allocate(Arena)}, {@link VkIndirectExecutionSetShaderInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkIndirectExecutionSetShaderInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetShaderInfoEXT.html"><code>VkIndirectExecutionSetShaderInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectExecutionSetShaderInfoEXT(@NotNull MemorySegment segment) implements IVkIndirectExecutionSetShaderInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetShaderInfoEXT.html"><code>VkIndirectExecutionSetShaderInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkIndirectExecutionSetShaderInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkIndirectExecutionSetShaderInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkIndirectExecutionSetShaderInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkIndirectExecutionSetShaderInfoEXT {
        public long size() {
            return segment.byteSize() / VkIndirectExecutionSetShaderInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkIndirectExecutionSetShaderInfoEXT at(long index) {
            return new VkIndirectExecutionSetShaderInfoEXT(segment.asSlice(index * VkIndirectExecutionSetShaderInfoEXT.BYTES, VkIndirectExecutionSetShaderInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkIndirectExecutionSetShaderInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkIndirectExecutionSetShaderInfoEXT.BYTES, VkIndirectExecutionSetShaderInfoEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkIndirectExecutionSetShaderInfoEXT.BYTES, VkIndirectExecutionSetShaderInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkIndirectExecutionSetShaderInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkIndirectExecutionSetShaderInfoEXT.BYTES,
                (end - start) * VkIndirectExecutionSetShaderInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkIndirectExecutionSetShaderInfoEXT.BYTES));
        }
    }

    public static VkIndirectExecutionSetShaderInfoEXT allocate(Arena arena) {
        VkIndirectExecutionSetShaderInfoEXT ret = new VkIndirectExecutionSetShaderInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.INDIRECT_EXECUTION_SET_SHADER_INFO_EXT);
        return ret;
    }

    public static VkIndirectExecutionSetShaderInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectExecutionSetShaderInfoEXT.Ptr ret = new VkIndirectExecutionSetShaderInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.INDIRECT_EXECUTION_SET_SHADER_INFO_EXT);
        }
        return ret;
    }

    public static VkIndirectExecutionSetShaderInfoEXT clone(Arena arena, VkIndirectExecutionSetShaderInfoEXT src) {
        VkIndirectExecutionSetShaderInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.INDIRECT_EXECUTION_SET_SHADER_INFO_EXT);
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

    public @unsigned int shaderCount() {
        return segment.get(LAYOUT$shaderCount, OFFSET$shaderCount);
    }

    public void shaderCount(@unsigned int value) {
        segment.set(LAYOUT$shaderCount, OFFSET$shaderCount, value);
    }

    /// Note: the returned {@link VkShaderEXT.Ptr} does not have correct {@link VkShaderEXT.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkShaderEXT.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkShaderEXT.Ptr pInitialShaders() {
        MemorySegment s = pInitialShadersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkShaderEXT.Ptr(s);
    }

    public void pInitialShaders(@Nullable VkShaderEXT.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInitialShadersRaw(s);
    }

    public @pointer(target=VkShaderEXT.class) MemorySegment pInitialShadersRaw() {
        return segment.get(LAYOUT$pInitialShaders, OFFSET$pInitialShaders);
    }

    public void pInitialShadersRaw(@pointer(target=VkShaderEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pInitialShaders, OFFSET$pInitialShaders, value);
    }

    public @Nullable VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayoutInfos() {
        MemorySegment s = pSetLayoutInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(s);
    }

    public void pSetLayoutInfos(@Nullable IVkIndirectExecutionSetShaderLayoutInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSetLayoutInfosRaw(s);
    }

    @unsafe public @Nullable VkIndirectExecutionSetShaderLayoutInfoEXT.Ptr pSetLayoutInfos(int assumedCount) {
        MemorySegment s = pSetLayoutInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectExecutionSetShaderLayoutInfoEXT.BYTES);
        return new VkIndirectExecutionSetShaderLayoutInfoEXT.Ptr(s);
    }

    public @pointer(target=VkIndirectExecutionSetShaderLayoutInfoEXT.class) MemorySegment pSetLayoutInfosRaw() {
        return segment.get(LAYOUT$pSetLayoutInfos, OFFSET$pSetLayoutInfos);
    }

    public void pSetLayoutInfosRaw(@pointer(target=VkIndirectExecutionSetShaderLayoutInfoEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pSetLayoutInfos, OFFSET$pSetLayoutInfos, value);
    }

    public @unsigned int maxShaderCount() {
        return segment.get(LAYOUT$maxShaderCount, OFFSET$maxShaderCount);
    }

    public void maxShaderCount(@unsigned int value) {
        segment.set(LAYOUT$maxShaderCount, OFFSET$maxShaderCount, value);
    }

    public @unsigned int pushConstantRangeCount() {
        return segment.get(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount);
    }

    public void pushConstantRangeCount(@unsigned int value) {
        segment.set(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount, value);
    }

    public @Nullable VkPushConstantRange pPushConstantRanges() {
        MemorySegment s = pPushConstantRangesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPushConstantRange(s);
    }

    public void pPushConstantRanges(@Nullable IVkPushConstantRange value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPushConstantRangesRaw(s);
    }

    @unsafe public @Nullable VkPushConstantRange.Ptr pPushConstantRanges(int assumedCount) {
        MemorySegment s = pPushConstantRangesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPushConstantRange.BYTES);
        return new VkPushConstantRange.Ptr(s);
    }

    public @pointer(target=VkPushConstantRange.class) MemorySegment pPushConstantRangesRaw() {
        return segment.get(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges);
    }

    public void pPushConstantRangesRaw(@pointer(target=VkPushConstantRange.class) MemorySegment value) {
        segment.set(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pInitialShaders"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectExecutionSetShaderLayoutInfoEXT.LAYOUT).withName("pSetLayoutInfos"),
        ValueLayout.JAVA_INT.withName("maxShaderCount"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPushConstantRange.LAYOUT).withName("pPushConstantRanges")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderCount = PathElement.groupElement("shaderCount");
    public static final PathElement PATH$pInitialShaders = PathElement.groupElement("pInitialShaders");
    public static final PathElement PATH$pSetLayoutInfos = PathElement.groupElement("pSetLayoutInfos");
    public static final PathElement PATH$maxShaderCount = PathElement.groupElement("maxShaderCount");
    public static final PathElement PATH$pushConstantRangeCount = PathElement.groupElement("pushConstantRangeCount");
    public static final PathElement PATH$pPushConstantRanges = PathElement.groupElement("pPushConstantRanges");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderCount = (OfInt) LAYOUT.select(PATH$shaderCount);
    public static final AddressLayout LAYOUT$pInitialShaders = (AddressLayout) LAYOUT.select(PATH$pInitialShaders);
    public static final AddressLayout LAYOUT$pSetLayoutInfos = (AddressLayout) LAYOUT.select(PATH$pSetLayoutInfos);
    public static final OfInt LAYOUT$maxShaderCount = (OfInt) LAYOUT.select(PATH$maxShaderCount);
    public static final OfInt LAYOUT$pushConstantRangeCount = (OfInt) LAYOUT.select(PATH$pushConstantRangeCount);
    public static final AddressLayout LAYOUT$pPushConstantRanges = (AddressLayout) LAYOUT.select(PATH$pPushConstantRanges);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderCount = LAYOUT$shaderCount.byteSize();
    public static final long SIZE$pInitialShaders = LAYOUT$pInitialShaders.byteSize();
    public static final long SIZE$pSetLayoutInfos = LAYOUT$pSetLayoutInfos.byteSize();
    public static final long SIZE$maxShaderCount = LAYOUT$maxShaderCount.byteSize();
    public static final long SIZE$pushConstantRangeCount = LAYOUT$pushConstantRangeCount.byteSize();
    public static final long SIZE$pPushConstantRanges = LAYOUT$pPushConstantRanges.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderCount = LAYOUT.byteOffset(PATH$shaderCount);
    public static final long OFFSET$pInitialShaders = LAYOUT.byteOffset(PATH$pInitialShaders);
    public static final long OFFSET$pSetLayoutInfos = LAYOUT.byteOffset(PATH$pSetLayoutInfos);
    public static final long OFFSET$maxShaderCount = LAYOUT.byteOffset(PATH$maxShaderCount);
    public static final long OFFSET$pushConstantRangeCount = LAYOUT.byteOffset(PATH$pushConstantRangeCount);
    public static final long OFFSET$pPushConstantRanges = LAYOUT.byteOffset(PATH$pPushConstantRanges);
}
